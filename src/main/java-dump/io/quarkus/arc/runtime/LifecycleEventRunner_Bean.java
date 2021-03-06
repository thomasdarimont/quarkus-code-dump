//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package io.quarkus.arc.runtime;

import io.quarkus.arc.InjectableBean;
import io.quarkus.arc.InjectableReferenceProvider;
import io.quarkus.arc.impl.CreationalContextImpl;
import io.quarkus.arc.impl.EventProvider;
import io.quarkus.arc.impl.FixedValueSupplier;
import io.quarkus.arc.impl.Objects;
import io.quarkus.arc.impl.ParameterizedTypeImpl;
import java.lang.reflect.Type;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Supplier;
import javax.enterprise.context.spi.CreationalContext;
import javax.enterprise.event.Event;
import javax.enterprise.inject.Default.Literal;

// $FF: synthetic class
public class LifecycleEventRunner_Bean implements InjectableBean, Supplier {
    private final Set types;
    private final Supplier injectProviderSupplier2;
    private final Supplier injectProviderSupplier1;

    public LifecycleEventRunner_Bean() {
        ClassLoader var21 = Thread.currentThread().getContextClassLoader();
        HashSet var1 = new HashSet();
        Literal var2 = Literal.INSTANCE;
        ((Set)var1).add(var2);
        Type[] var4 = new Type[1];
        ClassLoader var3 = Thread.currentThread().getContextClassLoader();
        Class var5 = Class.forName("io.quarkus.runtime.ShutdownEvent", (boolean)1, var3);
        var4[0] = (Type)var5;
        ClassLoader var6 = Thread.currentThread().getContextClassLoader();
        Class var7 = Class.forName("javax.enterprise.event.Event", (boolean)1, var6);
        ParameterizedTypeImpl var8 = new ParameterizedTypeImpl((Type)var7, var4);
        EventProvider var9 = new EventProvider((Type)var8, (Set)var1);
        FixedValueSupplier var10 = new FixedValueSupplier(var9);
        this.injectProviderSupplier1 = (Supplier)var10;
        HashSet var11 = new HashSet();
        Literal var12 = Literal.INSTANCE;
        ((Set)var11).add(var12);
        Type[] var14 = new Type[1];
        ClassLoader var13 = Thread.currentThread().getContextClassLoader();
        Class var15 = Class.forName("io.quarkus.runtime.StartupEvent", (boolean)1, var13);
        var14[0] = (Type)var15;
        ClassLoader var16 = Thread.currentThread().getContextClassLoader();
        Class var17 = Class.forName("javax.enterprise.event.Event", (boolean)1, var16);
        ParameterizedTypeImpl var18 = new ParameterizedTypeImpl((Type)var17, var14);
        EventProvider var19 = new EventProvider((Type)var18, (Set)var11);
        FixedValueSupplier var20 = new FixedValueSupplier(var19);
        this.injectProviderSupplier2 = (Supplier)var20;
        HashSet var22 = new HashSet();
        Class var23 = Class.forName("io.quarkus.arc.runtime.LifecycleEventRunner", (boolean)1, var21);
        ((Set)var22).add(var23);
        Class var24 = Class.forName("java.lang.Object", (boolean)1, var21);
        ((Set)var22).add(var24);
        Set var25 = Collections.unmodifiableSet((Set)var22);
        this.types = var25;
    }

    public String getIdentifier() {
        return "12fc2402a40566a35aaf6bd0cacea9be4bc27e02";
    }

    public Object get() {
        return this;
    }

    public LifecycleEventRunner create(CreationalContext var1) {
        LifecycleEventRunner var4 = new LifecycleEventRunner();

        try {
            Object var2 = this.injectProviderSupplier1.get();
            CreationalContextImpl var3 = CreationalContextImpl.child((InjectableReferenceProvider)var2, var1);
            Object var5 = ((InjectableReferenceProvider)var2).get((CreationalContext)var3);
            var4.shutdown = (Event)var5;
        } catch (RuntimeException var12) {
            throw (Throwable)(new RuntimeException("Error injecting javax.enterprise.event.Event<io.quarkus.runtime.ShutdownEvent> io.quarkus.arc.runtime.LifecycleEventRunner.shutdown", (Throwable)var12));
        }

        try {
            Object var7 = this.injectProviderSupplier2.get();
            CreationalContextImpl var8 = CreationalContextImpl.child((InjectableReferenceProvider)var7, var1);
            Object var9 = ((InjectableReferenceProvider)var7).get((CreationalContext)var8);
            var4.startup = (Event)var9;
            return var4;
        } catch (RuntimeException var11) {
            throw (Throwable)(new RuntimeException("Error injecting javax.enterprise.event.Event<io.quarkus.runtime.StartupEvent> io.quarkus.arc.runtime.LifecycleEventRunner.startup", (Throwable)var11));
        }
    }

    public LifecycleEventRunner get(CreationalContext var1) {
        LifecycleEventRunner var2 = this.create(var1);
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
        return LifecycleEventRunner.class;
    }

    public boolean equals(Object var1) {
        if (!Objects.referenceEquals(this, var1)) {
            if (var1 != null) {
                if (var1 instanceof InjectableBean) {
                    String var2 = ((InjectableBean)var1).getIdentifier();
                    return "12fc2402a40566a35aaf6bd0cacea9be4bc27e02".equals(var2);
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
        return "12fc2402a40566a35aaf6bd0cacea9be4bc27e02".hashCode();
    }
}
