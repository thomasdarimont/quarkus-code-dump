//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package io.quarkus.vertx.http.runtime;

import io.quarkus.arc.InjectableBean;
import io.quarkus.arc.impl.Objects;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Supplier;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.spi.CreationalContext;

// $FF: synthetic class
public class CurrentVertxRequest_Bean implements InjectableBean, Supplier {
    private final Set types;
    private volatile CurrentVertxRequest_ClientProxy proxy;

    private CurrentVertxRequest_ClientProxy proxy() {
        CurrentVertxRequest_ClientProxy var1 = this.proxy;
        if (var1 == null) {
            var1 = new CurrentVertxRequest_ClientProxy(this);
            this.proxy = var1;
        }

        return var1;
    }

    public CurrentVertxRequest_Bean() {
        ClassLoader var1 = Thread.currentThread().getContextClassLoader();
        HashSet var2 = new HashSet();
        Class var3 = Class.forName("io.quarkus.vertx.http.runtime.CurrentVertxRequest", (boolean)1, var1);
        ((Set)var2).add(var3);
        Class var4 = Class.forName("java.lang.Object", (boolean)1, var1);
        ((Set)var2).add(var4);
        Set var5 = Collections.unmodifiableSet((Set)var2);
        this.types = var5;
    }

    public String getIdentifier() {
        return "9260aa608251c44230eeb9b234f605844a7622bf";
    }

    public Object get() {
        return this;
    }

    public CurrentVertxRequest create(CreationalContext var1) {
        return new CurrentVertxRequest();
    }

    public CurrentVertxRequest get(CreationalContext var1) {
        return (CurrentVertxRequest)this.proxy();
    }

    public Set getTypes() {
        return this.types;
    }

    public Class getScope() {
        return RequestScoped.class;
    }

    public Class getBeanClass() {
        return CurrentVertxRequest.class;
    }

    public boolean equals(Object var1) {
        if (!Objects.referenceEquals(this, var1)) {
            if (var1 != null) {
                if (var1 instanceof InjectableBean) {
                    String var2 = ((InjectableBean)var1).getIdentifier();
                    return "9260aa608251c44230eeb9b234f605844a7622bf".equals(var2);
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
        return "9260aa608251c44230eeb9b234f605844a7622bf".hashCode();
    }
}
