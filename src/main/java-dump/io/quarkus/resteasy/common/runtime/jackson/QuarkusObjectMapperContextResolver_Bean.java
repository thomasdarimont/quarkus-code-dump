//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package io.quarkus.resteasy.common.runtime.jackson;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.quarkus.arc.InjectableBean;
import io.quarkus.arc.InjectableReferenceProvider;
import io.quarkus.arc.impl.CreationalContextImpl;
import io.quarkus.arc.impl.Objects;
import io.quarkus.arc.impl.ParameterizedTypeImpl;
import java.lang.reflect.Type;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Supplier;
import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.spi.CreationalContext;

// $FF: synthetic class
public class QuarkusObjectMapperContextResolver_Bean implements InjectableBean, Supplier {
    private final Set types;
    private volatile QuarkusObjectMapperContextResolver_ClientProxy proxy;
    private final Supplier injectProviderSupplier1;

    private QuarkusObjectMapperContextResolver_ClientProxy proxy() {
        QuarkusObjectMapperContextResolver_ClientProxy var1 = this.proxy;
        if (var1 == null) {
            var1 = new QuarkusObjectMapperContextResolver_ClientProxy(this);
            this.proxy = var1;
        }

        return var1;
    }

    public QuarkusObjectMapperContextResolver_Bean(Supplier var1) {
        ClassLoader var2 = Thread.currentThread().getContextClassLoader();
        this.injectProviderSupplier1 = var1;
        HashSet var3 = new HashSet();
        Class var4 = Class.forName("io.quarkus.resteasy.common.runtime.jackson.QuarkusObjectMapperContextResolver", (boolean)1, var2);
        ((Set)var3).add(var4);
        Type[] var5 = new Type[1];
        Class var6 = Class.forName("com.fasterxml.jackson.databind.ObjectMapper", (boolean)1, var2);
        var5[0] = (Type)var6;
        Class var7 = Class.forName("javax.ws.rs.ext.ContextResolver", (boolean)1, var2);
        ParameterizedTypeImpl var8 = new ParameterizedTypeImpl((Type)var7, var5);
        ((Set)var3).add(var8);
        Class var9 = Class.forName("java.lang.Object", (boolean)1, var2);
        ((Set)var3).add(var9);
        Set var10 = Collections.unmodifiableSet((Set)var3);
        this.types = var10;
    }

    public String getIdentifier() {
        return "cbba353b3c7a0af2446e2b6ef595047923f869bd";
    }

    public Object get() {
        return this;
    }

    public QuarkusObjectMapperContextResolver create(CreationalContext var1) {
        QuarkusObjectMapperContextResolver var4 = new QuarkusObjectMapperContextResolver();

        try {
            Object var2 = this.injectProviderSupplier1.get();
            CreationalContextImpl var3 = CreationalContextImpl.child((InjectableReferenceProvider)var2, var1);
            Object var5 = ((InjectableReferenceProvider)var2).get((CreationalContext)var3);
            var4.objectMapper = (ObjectMapper)var5;
            return var4;
        } catch (RuntimeException var7) {
            throw (Throwable)(new RuntimeException("Error injecting com.fasterxml.jackson.databind.ObjectMapper io.quarkus.resteasy.common.runtime.jackson.QuarkusObjectMapperContextResolver.objectMapper", (Throwable)var7));
        }
    }

    public QuarkusObjectMapperContextResolver get(CreationalContext var1) {
        return (QuarkusObjectMapperContextResolver)this.proxy();
    }

    public Set getTypes() {
        return this.types;
    }

    public Class getScope() {
        return ApplicationScoped.class;
    }

    public Class getBeanClass() {
        return QuarkusObjectMapperContextResolver.class;
    }

    public boolean equals(Object var1) {
        if (!Objects.referenceEquals(this, var1)) {
            if (var1 != null) {
                if (var1 instanceof InjectableBean) {
                    String var2 = ((InjectableBean)var1).getIdentifier();
                    return "cbba353b3c7a0af2446e2b6ef595047923f869bd".equals(var2);
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
        return "cbba353b3c7a0af2446e2b6ef595047923f869bd".hashCode();
    }
}
