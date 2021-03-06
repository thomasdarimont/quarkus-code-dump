//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package io.vertx.core;

import io.quarkus.arc.Arc;
import io.quarkus.arc.ArcContainer;
import io.quarkus.arc.InjectableBean;
import io.quarkus.arc.InjectableBean.Kind;
import io.quarkus.arc.impl.CreationalContextImpl;
import io.quarkus.arc.impl.Objects;
import io.quarkus.arc.runtime.ArcRecorder;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.function.Supplier;
import javax.enterprise.context.spi.Context;
import javax.enterprise.context.spi.Contextual;
import javax.enterprise.context.spi.CreationalContext;
import javax.enterprise.inject.CreationException;
import javax.inject.Singleton;

// $FF: synthetic class
public class Vertx_7c31d5064e6d5db248fafa10f188ca6323f3f983_Synthetic_Bean implements InjectableBean, Supplier {
    private final Set types;
    private final Map params;

    public Vertx_7c31d5064e6d5db248fafa10f188ca6323f3f983_Synthetic_Bean() {
        ClassLoader var1 = Thread.currentThread().getContextClassLoader();
        HashSet var2 = new HashSet();
        Class var3 = Class.forName("io.vertx.core.Vertx", (boolean)1, var1);
        ((Set)var2).add(var3);
        Set var4 = Collections.unmodifiableSet((Set)var2);
        this.types = var4;
        Map var5 = Collections.emptyMap();
        this.params = var5;
    }

    public String getIdentifier() {
        return "7c31d5064e6d5db248fafa10f188ca6323f3f983";
    }

    public Object get() {
        return this;
    }

    public Vertx create(CreationalContext var1) {
        Object var2 = ArcRecorder.supplierMap.get("io_vertx_core_Vertx_97d170e1550eee4afc0af065b78cda302a97674c");
        if (var2 != null) {
            return (Vertx)((Supplier)var2).get();
        } else {
            throw (Throwable)(new CreationException("Synthetic bean instance for io.vertx.core.Vertx not initialized yet: io_vertx_core_Vertx_97d170e1550eee4afc0af065b78cda302a97674c\n\t- a synthetic bean initialized during RUNTIME_INIT must not be accessed during STATIC_INIT\n\t- RUNTIME_INIT build steps that require access to synthetic beans initialized during RUNTIME_INIT should consume the SyntheticBeansRuntimeInitBuildItem"));
        }
    }

    public Vertx get(CreationalContext var1) {
        ArcContainer var2 = Arc.container();
        CreationalContextImpl var3 = new CreationalContextImpl((Contextual)this);
        return (Vertx)((Context)var2.getActiveContext(Singleton.class)).get((Contextual)this, (CreationalContext)var3);
    }

    public Set getTypes() {
        return this.types;
    }

    public Class getScope() {
        return Singleton.class;
    }

    public Class getBeanClass() {
        return Vertx.class;
    }

    public Kind getKind() {
        return Kind.SYNTHETIC;
    }

    public boolean equals(Object var1) {
        if (!Objects.referenceEquals(this, var1)) {
            if (var1 != null) {
                if (var1 instanceof InjectableBean) {
                    String var2 = ((InjectableBean)var1).getIdentifier();
                    return "7c31d5064e6d5db248fafa10f188ca6323f3f983".equals(var2);
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
        return "7c31d5064e6d5db248fafa10f188ca6323f3f983".hashCode();
    }
}
