//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package io.netty.channel;

import io.quarkus.arc.Arc;
import io.quarkus.arc.ArcContainer;
import io.quarkus.arc.InjectableBean;
import io.quarkus.arc.InjectableBean.Kind;
import io.quarkus.arc.impl.CreationalContextImpl;
import io.quarkus.arc.impl.Objects;
import io.quarkus.arc.runtime.ArcRecorder;
import io.quarkus.netty.MainEventLoopGroup_Shared_AnnotationLiteral;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.function.Supplier;
import javax.enterprise.context.spi.Context;
import javax.enterprise.context.spi.Contextual;
import javax.enterprise.context.spi.CreationalContext;
import javax.enterprise.inject.CreationException;
import javax.enterprise.inject.Any.Literal;
import javax.inject.Singleton;

// $FF: synthetic class
public class EventLoopGroup_e0d9529bd8e82f33c3bbdde0861773027f3f2e0a_Synthetic_Bean implements InjectableBean, Supplier {
    private final Set types;
    private final Set qualifiers;
    private final Map params;

    public EventLoopGroup_e0d9529bd8e82f33c3bbdde0861773027f3f2e0a_Synthetic_Bean() {
        ClassLoader var1 = Thread.currentThread().getContextClassLoader();
        HashSet var2 = new HashSet();
        Class var3 = Class.forName("io.netty.channel.EventLoopGroup", (boolean)1, var1);
        ((Set)var2).add(var3);
        Set var4 = Collections.unmodifiableSet((Set)var2);
        this.types = var4;
        HashSet var5 = new HashSet();
        MainEventLoopGroup_Shared_AnnotationLiteral var6 = new MainEventLoopGroup_Shared_AnnotationLiteral();
        ((Set)var5).add(var6);
        Literal var7 = Literal.INSTANCE;
        ((Set)var5).add(var7);
        Set var8 = Collections.unmodifiableSet((Set)var5);
        this.qualifiers = var8;
        Map var9 = Collections.emptyMap();
        this.params = var9;
    }

    public String getIdentifier() {
        return "e0d9529bd8e82f33c3bbdde0861773027f3f2e0a";
    }

    public Object get() {
        return this;
    }

    public EventLoopGroup create(CreationalContext var1) {
        Object var2 = ArcRecorder.supplierMap.get("io_netty_channel_EventLoopGroup_680c87c5b8808c6f92499240dd1a2c28387f21e0");
        if (var2 != null) {
            return (EventLoopGroup)((Supplier)var2).get();
        } else {
            throw (Throwable)(new CreationException("Synthetic bean instance for io.netty.channel.EventLoopGroup not initialized yet: io_netty_channel_EventLoopGroup_680c87c5b8808c6f92499240dd1a2c28387f21e0\n\t- a synthetic bean initialized during RUNTIME_INIT must not be accessed during STATIC_INIT\n\t- RUNTIME_INIT build steps that require access to synthetic beans initialized during RUNTIME_INIT should consume the SyntheticBeansRuntimeInitBuildItem"));
        }
    }

    public EventLoopGroup get(CreationalContext var1) {
        ArcContainer var2 = Arc.container();
        CreationalContextImpl var3 = new CreationalContextImpl((Contextual)this);
        return (EventLoopGroup)((Context)var2.getActiveContext(Singleton.class)).get((Contextual)this, (CreationalContext)var3);
    }

    public Set getTypes() {
        return this.types;
    }

    public Class getScope() {
        return Singleton.class;
    }

    public Set getQualifiers() {
        return this.qualifiers;
    }

    public Class getBeanClass() {
        return EventLoopGroup.class;
    }

    public Kind getKind() {
        return Kind.SYNTHETIC;
    }

    public boolean equals(Object var1) {
        if (!Objects.referenceEquals(this, var1)) {
            if (var1 != null) {
                if (var1 instanceof InjectableBean) {
                    String var2 = ((InjectableBean)var1).getIdentifier();
                    return "e0d9529bd8e82f33c3bbdde0861773027f3f2e0a".equals(var2);
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
        return "e0d9529bd8e82f33c3bbdde0861773027f3f2e0a".hashCode();
    }
}
