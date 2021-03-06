//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package io.quarkus.jackson.runtime;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.quarkus.arc.Arc;
import io.quarkus.arc.ArcContainer;
import io.quarkus.arc.ClientProxy;
import io.quarkus.arc.InjectableBean;
import io.quarkus.arc.InjectableContext;
import io.quarkus.arc.impl.ClientProxies;
import io.quarkus.jackson.ObjectMapperCustomizer;
import javax.enterprise.inject.Instance;

// $FF: synthetic class
public class ObjectMapperProducer_ClientProxy extends ObjectMapperProducer implements ClientProxy {
    private final ObjectMapperProducer_Bean bean;
    private final InjectableContext context;

    public ObjectMapperProducer_ClientProxy(ObjectMapperProducer_Bean var1) {
        this.bean = var1;
        ArcContainer var2 = Arc.container();
        Class var3 = ((InjectableBean)var1).getScope();
        InjectableContext var4 = var2.getActiveContext(var3);
        this.context = var4;
    }

    private ObjectMapperProducer arc$delegate() {
        ObjectMapperProducer_Bean var1 = this.bean;
        return (ObjectMapperProducer)ClientProxies.getApplicationScopedDelegate(this.context, (InjectableBean)var1);
    }

    public Object arc_contextualInstance() {
        return this.arc$delegate();
    }

    public InjectableBean arc_bean() {
        return (InjectableBean)this.bean;
    }

    public String toString() {
        return this.bean != null ? this.arc$delegate().toString() : super.toString();
    }

    public ObjectMapper objectMapper(Instance<ObjectMapperCustomizer> var1, JacksonConfigSupport var2) {
        return this.bean != null ? this.arc$delegate().objectMapper(var1, var2) : super.objectMapper(var1, var2);
    }
}
