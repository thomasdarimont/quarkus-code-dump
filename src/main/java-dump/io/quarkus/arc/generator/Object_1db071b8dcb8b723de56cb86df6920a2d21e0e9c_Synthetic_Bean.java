//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package io.quarkus.arc.generator;

import io.quarkus.arc.InjectableBean;
import io.quarkus.arc.InjectableBean.Kind;
import io.quarkus.arc.impl.CreationalContextImpl;
import io.quarkus.arc.impl.GenericArrayTypeImpl;
import io.quarkus.arc.impl.Objects;
import io.quarkus.arc.runtime.ArcRecorder;
import io.quarkus.runtime.annotations.CommandLineArguments_Shared_AnnotationLiteral;
import java.lang.reflect.Type;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.function.Supplier;
import javax.enterprise.context.spi.CreationalContext;
import javax.enterprise.inject.CreationException;
import javax.enterprise.inject.Any.Literal;

// $FF: synthetic class
public class Object_1db071b8dcb8b723de56cb86df6920a2d21e0e9c_Synthetic_Bean implements InjectableBean, Supplier {
    private final Set types;
    private final Set qualifiers;
    private final Map params;

    public Object_1db071b8dcb8b723de56cb86df6920a2d21e0e9c_Synthetic_Bean() {
        ClassLoader var1 = Thread.currentThread().getContextClassLoader();
        HashSet var3 = new HashSet();
        Class var2 = Class.forName("java.lang.String", (boolean)1, var1);
        GenericArrayTypeImpl var4 = new GenericArrayTypeImpl((Type)var2);
        ((Set)var3).add(var4);
        Class var5 = Class.forName("java.lang.Object", (boolean)1, var1);
        ((Set)var3).add(var5);
        Set var6 = Collections.unmodifiableSet((Set)var3);
        this.types = var6;
        HashSet var7 = new HashSet();
        CommandLineArguments_Shared_AnnotationLiteral var8 = new CommandLineArguments_Shared_AnnotationLiteral();
        ((Set)var7).add(var8);
        Literal var9 = Literal.INSTANCE;
        ((Set)var7).add(var9);
        Set var10 = Collections.unmodifiableSet((Set)var7);
        this.qualifiers = var10;
        Map var11 = Collections.emptyMap();
        this.params = var11;
    }

    public String getIdentifier() {
        return "1db071b8dcb8b723de56cb86df6920a2d21e0e9c";
    }

    public Object get() {
        return this;
    }

    public String[] create(CreationalContext var1) {
        Object var2 = ArcRecorder.supplierMap.get("java_lang_Object_378331e485730beeab5690cc37406fbaf5d47707");
        if (var2 != null) {
            return (String[])((Supplier)var2).get();
        } else {
            throw (Throwable)(new CreationException("Synthetic bean instance for java.lang.Object not initialized yet: java_lang_Object_378331e485730beeab5690cc37406fbaf5d47707\n\t- a synthetic bean initialized during RUNTIME_INIT must not be accessed during STATIC_INIT\n\t- RUNTIME_INIT build steps that require access to synthetic beans initialized during RUNTIME_INIT should consume the SyntheticBeansRuntimeInitBuildItem"));
        }
    }

    public String[] get(CreationalContext var1) {
        String[] var2 = this.create(var1);
        CreationalContextImpl.addDependencyToParent((InjectableBean)this, var2, var1);
        return var2;
    }

    public Set getTypes() {
        return this.types;
    }

    public Set getQualifiers() {
        return this.qualifiers;
    }

    public Class getBeanClass() {
        return Object.class;
    }

    public Kind getKind() {
        return Kind.SYNTHETIC;
    }

    public boolean equals(Object var1) {
        if (!Objects.referenceEquals(this, var1)) {
            if (var1 != null) {
                if (var1 instanceof InjectableBean) {
                    String var2 = ((InjectableBean)var1).getIdentifier();
                    return "1db071b8dcb8b723de56cb86df6920a2d21e0e9c".equals(var2);
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
        return "1db071b8dcb8b723de56cb86df6920a2d21e0e9c".hashCode();
    }
}
