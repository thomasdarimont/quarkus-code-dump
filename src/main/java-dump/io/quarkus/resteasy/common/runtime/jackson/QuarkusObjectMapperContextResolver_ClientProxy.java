//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package io.quarkus.resteasy.common.runtime.jackson;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.quarkus.arc.Arc;
import io.quarkus.arc.ArcContainer;
import io.quarkus.arc.InjectableBean;
import io.quarkus.arc.InjectableContext;
import io.quarkus.arc.impl.ClientProxies;
import javax.ws.rs.ext.ContextResolver;

// $FF: synthetic class
public class QuarkusObjectMapperContextResolver_ClientProxy extends Object implements ContextResolver<ObjectMapper> {
    private final QuarkusObjectMapperContextResolver_Bean bean;
    private final InjectableContext context;

    public QuarkusObjectMapperContextResolver_ClientProxy(QuarkusObjectMapperContextResolver_Bean var1) {
        this.bean = var1;
        ArcContainer var2 = Arc.container();
        Class var3 = ((InjectableBean)var1).getScope();
        InjectableContext var4 = var2.getActiveContext(var3);
        this.context = var4;
    }

    private QuarkusObjectMapperContextResolver arc$delegate() {
        QuarkusObjectMapperContextResolver_Bean var1 = this.bean;
        return (QuarkusObjectMapperContextResolver)ClientProxies.getApplicationScopedDelegate(this.context, (InjectableBean)var1);
    }

    public Object arc_contextualInstance() {
        return this.arc$delegate();
    }

    public InjectableBean arc_bean() {
        return (InjectableBean)this.bean;
    }

    public ObjectMapper getContext(Class<?> var1) {
        return this.bean != null ? this.arc$delegate().getContext(var1) : super.getContext(var1);
    }

    public String toString() {
        return this.bean != null ? this.arc$delegate().toString() : super.toString();
    }
}
