//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package io.quarkus.arc.impl;

import io.quarkus.arc.InjectableBean;
import io.quarkus.arc.InjectableInterceptor;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Supplier;
import javax.enterprise.context.control.ActivateRequestContext_Shared_AnnotationLiteral;
import javax.enterprise.context.spi.CreationalContext;
import javax.enterprise.inject.spi.InterceptionType;
import javax.interceptor.InvocationContext;

// $FF: synthetic class
public class ActivateRequestContextInterceptor_Bean implements InjectableInterceptor, Supplier {
    private final Set types;
    private final Set bindings;

    public ActivateRequestContextInterceptor_Bean() {
        ClassLoader var1 = Thread.currentThread().getContextClassLoader();
        HashSet var2 = new HashSet();
        Class var3 = Class.forName("io.quarkus.arc.impl.ActivateRequestContextInterceptor", (boolean)1, var1);
        ((Set)var2).add(var3);
        Set var4 = Collections.unmodifiableSet((Set)var2);
        this.types = var4;
        HashSet var5 = new HashSet();
        ActivateRequestContext_Shared_AnnotationLiteral var6 = new ActivateRequestContext_Shared_AnnotationLiteral();
        ((Set)var5).add(var6);
        this.bindings = (Set)var5;
    }

    public String getIdentifier() {
        return "dbf1993ec212e2fe67e79bbe5aaa6fa38a029def";
    }

    public Object get() {
        return this;
    }

    public ActivateRequestContextInterceptor create(CreationalContext var1) {
        return new ActivateRequestContextInterceptor();
    }

    public ActivateRequestContextInterceptor get(CreationalContext var1) {
        ActivateRequestContextInterceptor var2 = this.create(var1);
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
        return ActivateRequestContextInterceptor.class;
    }

    public Set getInterceptorBindings() {
        return this.bindings;
    }

    public boolean intercepts(InterceptionType var1) {
        return (boolean)(!InterceptionType.AROUND_INVOKE.equals(var1) ? 0 : 1);
    }

    public Object intercept(InterceptionType var1, Object var2, InvocationContext var3) throws Exception {
        return !InterceptionType.AROUND_INVOKE.equals(var1) ? null : ((ActivateRequestContextInterceptor)var2).aroundInvoke(var3);
    }

    public int getPriority() {
        return 100;
    }

    public boolean equals(Object var1) {
        if (!Objects.referenceEquals(this, var1)) {
            if (var1 != null) {
                if (var1 instanceof InjectableBean) {
                    String var2 = ((InjectableBean)var1).getIdentifier();
                    return "dbf1993ec212e2fe67e79bbe5aaa6fa38a029def".equals(var2);
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
        return "dbf1993ec212e2fe67e79bbe5aaa6fa38a029def".hashCode();
    }
}
