//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package io.quarkus.arc.impl;

import io.quarkus.arc.InjectableBean;
import io.quarkus.arc.InjectableInterceptor;
import io.quarkus.arc.Lock_Shared_AnnotationLiteral;
import io.quarkus.arc.Lock.Type;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;
import javax.enterprise.context.spi.CreationalContext;
import javax.enterprise.inject.spi.InterceptionType;
import javax.interceptor.InvocationContext;

// $FF: synthetic class
public class LockInterceptor_Bean implements InjectableInterceptor, Supplier {
    private final Set types;
    private final Set bindings;

    public LockInterceptor_Bean() {
        ClassLoader var1 = Thread.currentThread().getContextClassLoader();
        HashSet var2 = new HashSet();
        Class var3 = Class.forName("io.quarkus.arc.impl.LockInterceptor", (boolean)1, var1);
        ((Set)var2).add(var3);
        Set var4 = Collections.unmodifiableSet((Set)var2);
        this.types = var4;
        HashSet var7 = new HashSet();
        TimeUnit var5 = TimeUnit.MILLISECONDS;
        Type var6 = Type.WRITE;
        Lock_Shared_AnnotationLiteral var8 = new Lock_Shared_AnnotationLiteral(-1L, var5, var6);
        ((Set)var7).add(var8);
        this.bindings = (Set)var7;
    }

    public String getIdentifier() {
        return "265f70500b5c319107189b4d187fe5f30f2cb0f4";
    }

    public Object get() {
        return this;
    }

    public LockInterceptor create(CreationalContext var1) {
        return new LockInterceptor();
    }

    public LockInterceptor get(CreationalContext var1) {
        LockInterceptor var2 = this.create(var1);
        if (!((CreationalContextImpl)var1).hasDependentInstances()) {
            return var2;
        } else {
            CreationalContextImpl.addDependencyToParent((InjectableBean)this, var2, var1);
            return var2;
        }
    }

    public Set getTypes() {
        return this.types;
    }

    public Class getBeanClass() {
        return LockInterceptor.class;
    }

    public Set getInterceptorBindings() {
        return this.bindings;
    }

    public boolean intercepts(InterceptionType var1) {
        return (boolean)(!InterceptionType.AROUND_INVOKE.equals(var1) ? 0 : 1);
    }

    public Object intercept(InterceptionType var1, Object var2, InvocationContext var3) throws Exception {
        return !InterceptionType.AROUND_INVOKE.equals(var1) ? null : ((LockInterceptor)var2).lock(var3);
    }

    public int getPriority() {
        return 0;
    }

    public boolean equals(Object var1) {
        if (!Objects.referenceEquals(this, var1)) {
            if (var1 != null) {
                if (var1 instanceof InjectableBean) {
                    String var2 = ((InjectableBean)var1).getIdentifier();
                    return "265f70500b5c319107189b4d187fe5f30f2cb0f4".equals(var2);
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
        return "265f70500b5c319107189b4d187fe5f30f2cb0f4".hashCode();
    }
}
