//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package io.quarkus.vertx.http.runtime;

import io.quarkus.arc.InjectableBean;
import io.quarkus.arc.InjectableReferenceProvider;
import io.quarkus.arc.InjectableBean.Kind;
import io.quarkus.arc.impl.CreationalContextImpl;
import io.quarkus.arc.impl.Objects;
import io.quarkus.arc.impl.ParameterizedTypeImpl;
import io.vertx.ext.web.Router;
import java.lang.reflect.Type;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Supplier;
import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.spi.Contextual;
import javax.enterprise.context.spi.CreationalContext;
import javax.enterprise.inject.IllegalProductException;

// $FF: synthetic class
public class RouterProducer_ProducerMethod_produceRouter_47a03b0c0aa0db1a64462fa81c394956a357811a_Bean implements InjectableBean, Supplier {
    private final Set types;
    private volatile RouterProducer_ProducerMethod_produceRouter_47a03b0c0aa0db1a64462fa81c394956a357811a_ClientProxy proxy;
    private final Supplier declaringProviderSupplier;

    private RouterProducer_ProducerMethod_produceRouter_47a03b0c0aa0db1a64462fa81c394956a357811a_ClientProxy proxy() {
        RouterProducer_ProducerMethod_produceRouter_47a03b0c0aa0db1a64462fa81c394956a357811a_ClientProxy var1 = this.proxy;
        if (var1 == null) {
            var1 = new RouterProducer_ProducerMethod_produceRouter_47a03b0c0aa0db1a64462fa81c394956a357811a_ClientProxy(this);
            this.proxy = var1;
        }

        return var1;
    }

    public RouterProducer_ProducerMethod_produceRouter_47a03b0c0aa0db1a64462fa81c394956a357811a_Bean(Supplier var1) {
        ClassLoader var2 = Thread.currentThread().getContextClassLoader();
        this.declaringProviderSupplier = var1;
        HashSet var3 = new HashSet();
        Class var4 = Class.forName("io.vertx.ext.web.Router", (boolean)1, var2);
        ((Set)var3).add(var4);
        Class var5 = Class.forName("java.lang.Object", (boolean)1, var2);
        ((Set)var3).add(var5);
        Type[] var6 = new Type[1];
        Class var7 = Class.forName("io.vertx.core.http.HttpServerRequest", (boolean)1, var2);
        var6[0] = (Type)var7;
        Class var8 = Class.forName("io.vertx.core.Handler", (boolean)1, var2);
        ParameterizedTypeImpl var9 = new ParameterizedTypeImpl((Type)var8, var6);
        ((Set)var3).add(var9);
        Set var10 = Collections.unmodifiableSet((Set)var3);
        this.types = var10;
    }

    public String getIdentifier() {
        return "2f4cbcc73234827699a8552d22b09a89e86fc75b";
    }

    public Object get() {
        return this;
    }

    public Router create(CreationalContext var1) {
        CreationalContextImpl var2 = new CreationalContextImpl((Contextual)this);
        Router var3 = ((RouterProducer)((InjectableReferenceProvider)this.declaringProviderSupplier.get()).get((CreationalContext)var2)).produceRouter();
        if (var3 != null) {
            return var3;
        } else {
            throw (Throwable)(new IllegalProductException("Normal scoped producer method may not return null: io.quarkus.vertx.http.runtime.RouterProducer.produceRouter()"));
        }
    }

    public Router get(CreationalContext var1) {
        return (Router)this.proxy();
    }

    public Set getTypes() {
        return this.types;
    }

    public Class getScope() {
        return ApplicationScoped.class;
    }

    public InjectableBean getDeclaringBean() {
        return (InjectableBean)this.declaringProviderSupplier.get();
    }

    public Class getBeanClass() {
        return RouterProducer.class;
    }

    public Kind getKind() {
        return Kind.PRODUCER_METHOD;
    }

    public boolean equals(Object var1) {
        if (!Objects.referenceEquals(this, var1)) {
            if (var1 != null) {
                if (var1 instanceof InjectableBean) {
                    String var2 = ((InjectableBean)var1).getIdentifier();
                    return "2f4cbcc73234827699a8552d22b09a89e86fc75b".equals(var2);
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
        return "2f4cbcc73234827699a8552d22b09a89e86fc75b".hashCode();
    }
}
