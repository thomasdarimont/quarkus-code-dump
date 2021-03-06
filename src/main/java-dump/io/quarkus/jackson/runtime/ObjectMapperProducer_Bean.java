//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package io.quarkus.jackson.runtime;

import io.quarkus.arc.InjectableBean;
import io.quarkus.arc.impl.Objects;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Supplier;
import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.spi.CreationalContext;

// $FF: synthetic class
public class ObjectMapperProducer_Bean implements InjectableBean, Supplier {
    private final Set types;
    private volatile ObjectMapperProducer_ClientProxy proxy;

    private ObjectMapperProducer_ClientProxy proxy() {
        ObjectMapperProducer_ClientProxy var1 = this.proxy;
        if (var1 == null) {
            var1 = new ObjectMapperProducer_ClientProxy(this);
            this.proxy = var1;
        }

        return var1;
    }

    public ObjectMapperProducer_Bean() {
        ClassLoader var1 = Thread.currentThread().getContextClassLoader();
        HashSet var2 = new HashSet();
        Class var3 = Class.forName("io.quarkus.jackson.runtime.ObjectMapperProducer", (boolean)1, var1);
        ((Set)var2).add(var3);
        Class var4 = Class.forName("java.lang.Object", (boolean)1, var1);
        ((Set)var2).add(var4);
        Set var5 = Collections.unmodifiableSet((Set)var2);
        this.types = var5;
    }

    public String getIdentifier() {
        return "caf3f172e85075fd3a1f1cb884d3dc311da0636f";
    }

    public Object get() {
        return this;
    }

    public ObjectMapperProducer create(CreationalContext var1) {
        return new ObjectMapperProducer();
    }

    public ObjectMapperProducer get(CreationalContext var1) {
        return (ObjectMapperProducer)this.proxy();
    }

    public Set getTypes() {
        return this.types;
    }

    public Class getScope() {
        return ApplicationScoped.class;
    }

    public Class getBeanClass() {
        return ObjectMapperProducer.class;
    }

    public boolean equals(Object var1) {
        if (!Objects.referenceEquals(this, var1)) {
            if (var1 != null) {
                if (var1 instanceof InjectableBean) {
                    String var2 = ((InjectableBean)var1).getIdentifier();
                    return "caf3f172e85075fd3a1f1cb884d3dc311da0636f".equals(var2);
                } else {
                    return (boolean)0;
                }
            } else {
                return (boolean)0;
            }
        } else {
            return (boolean)1;
        }
    }

    public int hashCode() {
        return "caf3f172e85075fd3a1f1cb884d3dc311da0636f".hashCode();
    }
}
