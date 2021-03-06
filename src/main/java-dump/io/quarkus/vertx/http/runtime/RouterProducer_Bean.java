//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package io.quarkus.vertx.http.runtime;

import io.quarkus.arc.Arc;
import io.quarkus.arc.ArcContainer;
import io.quarkus.arc.InjectableBean;
import io.quarkus.arc.impl.CreationalContextImpl;
import io.quarkus.arc.impl.Objects;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Supplier;
import javax.enterprise.context.spi.Context;
import javax.enterprise.context.spi.Contextual;
import javax.enterprise.context.spi.CreationalContext;
import javax.inject.Singleton;

// $FF: synthetic class
public class RouterProducer_Bean implements InjectableBean, Supplier {
    private final Set types;

    public RouterProducer_Bean() {
        ClassLoader var1 = Thread.currentThread().getContextClassLoader();
        HashSet var2 = new HashSet();
        Class var3 = Class.forName("io.quarkus.vertx.http.runtime.RouterProducer", (boolean)1, var1);
        ((Set)var2).add(var3);
        Class var4 = Class.forName("java.lang.Object", (boolean)1, var1);
        ((Set)var2).add(var4);
        Set var5 = Collections.unmodifiableSet((Set)var2);
        this.types = var5;
    }

    public String getIdentifier() {
        return "9668042d4e9a29d5b4421f8667371f65e67c4c7a";
    }

    public Object get() {
        return this;
    }

    public RouterProducer create(CreationalContext var1) {
        return new RouterProducer();
    }

    public RouterProducer get(CreationalContext var1) {
        ArcContainer var2 = Arc.container();
        CreationalContextImpl var3 = new CreationalContextImpl((Contextual)this);
        return (RouterProducer)((Context)var2.getActiveContext(Singleton.class)).get((Contextual)this, (CreationalContext)var3);
    }

    public Set getTypes() {
        return this.types;
    }

    public Class getScope() {
        return Singleton.class;
    }

    public Class getBeanClass() {
        return RouterProducer.class;
    }

    public boolean equals(Object var1) {
        if (!Objects.referenceEquals(this, var1)) {
            if (var1 != null) {
                if (var1 instanceof InjectableBean) {
                    String var2 = ((InjectableBean)var1).getIdentifier();
                    return "9668042d4e9a29d5b4421f8667371f65e67c4c7a".equals(var2);
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
        return "9668042d4e9a29d5b4421f8667371f65e67c4c7a".hashCode();
    }
}
