//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package io.quarkus.vertx.http.runtime;

import io.quarkus.arc.ClientProxy;
import io.quarkus.arc.InjectableBean;
import io.quarkus.arc.InjectableReferenceProvider;
import io.quarkus.arc.InjectableBean.Kind;
import io.quarkus.arc.impl.CreationalContextImpl;
import io.quarkus.arc.impl.Objects;
import io.vertx.ext.web.RoutingContext;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Supplier;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.spi.Contextual;
import javax.enterprise.context.spi.CreationalContext;
import javax.enterprise.inject.IllegalProductException;

// $FF: synthetic class
public class CurrentVertxRequest_ProducerMethod_getCurrent_6dc23d16d53ba5c34e1e7b6f54290fd7b9aebd76_Bean implements InjectableBean, Supplier {
    private final Set types;
    private volatile CurrentVertxRequest_ProducerMethod_getCurrent_6dc23d16d53ba5c34e1e7b6f54290fd7b9aebd76_ClientProxy proxy;
    private final Supplier declaringProviderSupplier;

    private CurrentVertxRequest_ProducerMethod_getCurrent_6dc23d16d53ba5c34e1e7b6f54290fd7b9aebd76_ClientProxy proxy() {
        CurrentVertxRequest_ProducerMethod_getCurrent_6dc23d16d53ba5c34e1e7b6f54290fd7b9aebd76_ClientProxy var1 = this.proxy;
        if (var1 == null) {
            var1 = new CurrentVertxRequest_ProducerMethod_getCurrent_6dc23d16d53ba5c34e1e7b6f54290fd7b9aebd76_ClientProxy(this);
            this.proxy = var1;
        }

        return var1;
    }

    public CurrentVertxRequest_ProducerMethod_getCurrent_6dc23d16d53ba5c34e1e7b6f54290fd7b9aebd76_Bean(Supplier var1) {
        ClassLoader var2 = Thread.currentThread().getContextClassLoader();
        this.declaringProviderSupplier = var1;
        HashSet var3 = new HashSet();
        Class var4 = Class.forName("java.lang.Object", (boolean)1, var2);
        ((Set)var3).add(var4);
        Class var5 = Class.forName("io.vertx.ext.web.RoutingContext", (boolean)1, var2);
        ((Set)var3).add(var5);
        Set var6 = Collections.unmodifiableSet((Set)var3);
        this.types = var6;
    }

    public String getIdentifier() {
        return "829d4c411ba464dc4404d780931853771c3a2740";
    }

    public Object get() {
        return this;
    }

    public RoutingContext create(CreationalContext var1) {
        CreationalContextImpl var2 = new CreationalContextImpl((Contextual)this);
        RoutingContext var3 = ((CurrentVertxRequest)((ClientProxy)((InjectableReferenceProvider)this.declaringProviderSupplier.get()).get((CreationalContext)var2)).arc_contextualInstance()).getCurrent();
        if (var3 != null) {
            return var3;
        } else {
            throw (Throwable)(new IllegalProductException("Normal scoped producer method may not return null: io.quarkus.vertx.http.runtime.CurrentVertxRequest.getCurrent()"));
        }
    }

    public RoutingContext get(CreationalContext var1) {
        return (RoutingContext)this.proxy();
    }

    public Set getTypes() {
        return this.types;
    }

    public Class getScope() {
        return RequestScoped.class;
    }

    public InjectableBean getDeclaringBean() {
        return (InjectableBean)this.declaringProviderSupplier.get();
    }

    public Class getBeanClass() {
        return CurrentVertxRequest.class;
    }

    public Kind getKind() {
        return Kind.PRODUCER_METHOD;
    }

    public boolean equals(Object var1) {
        if (!Objects.referenceEquals(this, var1)) {
            if (var1 != null) {
                if (var1 instanceof InjectableBean) {
                    String var2 = ((InjectableBean)var1).getIdentifier();
                    return "829d4c411ba464dc4404d780931853771c3a2740".equals(var2);
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
        return "829d4c411ba464dc4404d780931853771c3a2740".hashCode();
    }
}
