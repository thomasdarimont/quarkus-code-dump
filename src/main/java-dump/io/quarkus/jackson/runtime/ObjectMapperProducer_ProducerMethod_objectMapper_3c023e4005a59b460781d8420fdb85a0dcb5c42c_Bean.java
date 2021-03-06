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
import io.quarkus.arc.InjectableReferenceProvider;
import io.quarkus.arc.InjectableBean.Kind;
import io.quarkus.arc.impl.CreationalContextImpl;
import io.quarkus.arc.impl.FixedValueSupplier;
import io.quarkus.arc.impl.InstanceProvider;
import io.quarkus.arc.impl.Objects;
import io.quarkus.arc.impl.ParameterizedTypeImpl;
import io.quarkus.arc.impl.Qualifiers;
import io.quarkus.arc.impl.Reflections;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Supplier;
import javax.enterprise.context.spi.Context;
import javax.enterprise.context.spi.Contextual;
import javax.enterprise.context.spi.CreationalContext;
import javax.enterprise.inject.Instance;
import javax.inject.Singleton;

// $FF: synthetic class
public class ObjectMapperProducer_ProducerMethod_objectMapper_3c023e4005a59b460781d8420fdb85a0dcb5c42c_Bean implements InjectableBean, Supplier {
    private final Set types;
    private final Supplier declaringProviderSupplier;
    private final Supplier injectProviderSupplier2;
    private final Supplier injectProviderSupplier1;

    public ObjectMapperProducer_ProducerMethod_objectMapper_3c023e4005a59b460781d8420fdb85a0dcb5c42c_Bean(Supplier var1, Supplier var2) {
        ClassLoader var15 = Thread.currentThread().getContextClassLoader();
        this.declaringProviderSupplier = var1;
        Set var10 = Qualifiers.IP_DEFAULT_QUALIFIERS;
        Type[] var4 = new Type[1];
        ClassLoader var3 = Thread.currentThread().getContextClassLoader();
        Class var5 = Class.forName("io.quarkus.jackson.ObjectMapperCustomizer", (boolean)1, var3);
        var4[0] = (Type)var5;
        ClassLoader var6 = Thread.currentThread().getContextClassLoader();
        Class var7 = Class.forName("javax.enterprise.inject.Instance", (boolean)1, var6);
        ParameterizedTypeImpl var9 = new ParameterizedTypeImpl((Type)var7, var4);
        HashSet var11 = new HashSet();
        Class[] var8 = new Class[]{Instance.class, JacksonConfigSupport.class};
        Method var12 = Reflections.findMethod(ObjectMapperProducer.class, "objectMapper", var8);
        InstanceProvider var13 = new InstanceProvider((Type)var9, var10, (InjectableBean)this, (Set)var11, (Member)var12, 0);
        FixedValueSupplier var14 = new FixedValueSupplier(var13);
        this.injectProviderSupplier1 = (Supplier)var14;
        this.injectProviderSupplier2 = var2;
        HashSet var16 = new HashSet();
        Class var17 = Class.forName("java.io.Serializable", (boolean)1, var15);
        ((Set)var16).add(var17);
        Class var18 = Class.forName("com.fasterxml.jackson.core.ObjectCodec", (boolean)1, var15);
        ((Set)var16).add(var18);
        Class var19 = Class.forName("java.lang.Object", (boolean)1, var15);
        ((Set)var16).add(var19);
        Class var20 = Class.forName("com.fasterxml.jackson.databind.ObjectMapper", (boolean)1, var15);
        ((Set)var16).add(var20);
        Class var21 = Class.forName("com.fasterxml.jackson.core.Versioned", (boolean)1, var15);
        ((Set)var16).add(var21);
        Class var22 = Class.forName("com.fasterxml.jackson.core.TreeCodec", (boolean)1, var15);
        ((Set)var16).add(var22);
        Set var23 = Collections.unmodifiableSet((Set)var16);
        this.types = var23;
    }

    public String getIdentifier() {
        return "12e59373f975c01d574f286979e4d078f2399bf8";
    }

    public Object get() {
        return this;
    }

    public ObjectMapper create(CreationalContext var1) {
        CreationalContextImpl var2 = new CreationalContextImpl((Contextual)this);
        Object var7 = ((ClientProxy)((InjectableReferenceProvider)this.declaringProviderSupplier.get()).get((CreationalContext)var2)).arc_contextualInstance();
        Object var3 = this.injectProviderSupplier1.get();
        CreationalContextImpl var4 = CreationalContextImpl.child((InjectableReferenceProvider)var3, var1);
        Object var8 = ((InjectableReferenceProvider)var3).get((CreationalContext)var4);
        Object var5 = this.injectProviderSupplier2.get();
        CreationalContextImpl var6 = CreationalContextImpl.child((InjectableReferenceProvider)var5, var1);
        Object var9 = ((InjectableReferenceProvider)var5).get((CreationalContext)var6);
        return ((ObjectMapperProducer)var7).objectMapper((Instance)var8, (JacksonConfigSupport)var9);
    }

    public ObjectMapper get(CreationalContext var1) {
        ArcContainer var2 = Arc.container();
        CreationalContextImpl var3 = new CreationalContextImpl((Contextual)this);
        return (ObjectMapper)((Context)var2.getActiveContext(Singleton.class)).get((Contextual)this, (CreationalContext)var3);
    }

    public Set getTypes() {
        return this.types;
    }

    public Class getScope() {
        return Singleton.class;
    }

    public InjectableBean getDeclaringBean() {
        return (InjectableBean)this.declaringProviderSupplier.get();
    }

    public Class getBeanClass() {
        return ObjectMapperProducer.class;
    }

    public boolean isDefaultBean() {
        return (boolean)1;
    }

    public Kind getKind() {
        return Kind.PRODUCER_METHOD;
    }

    public boolean equals(Object var1) {
        if (!Objects.referenceEquals(this, var1)) {
            if (var1 != null) {
                if (var1 instanceof InjectableBean) {
                    String var2 = ((InjectableBean)var1).getIdentifier();
                    return "12e59373f975c01d574f286979e4d078f2399bf8".equals(var2);
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
        return "12e59373f975c01d574f286979e4d078f2399bf8".hashCode();
    }
}
