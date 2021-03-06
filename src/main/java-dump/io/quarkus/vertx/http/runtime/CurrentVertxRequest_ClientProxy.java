//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package io.quarkus.vertx.http.runtime;

import io.quarkus.arc.ClientProxy;
import io.quarkus.arc.InjectableBean;
import io.quarkus.arc.impl.ClientProxies;
import io.vertx.ext.web.RoutingContext;

// $FF: synthetic class
public class CurrentVertxRequest_ClientProxy extends CurrentVertxRequest implements ClientProxy {
    private final CurrentVertxRequest_Bean bean;

    public CurrentVertxRequest_ClientProxy(CurrentVertxRequest_Bean var1) {
        this.bean = var1;
    }

    private CurrentVertxRequest arc$delegate() {
        return (CurrentVertxRequest)ClientProxies.getDelegate((InjectableBean)this.bean);
    }

    public Object arc_contextualInstance() {
        return this.arc$delegate();
    }

    public InjectableBean arc_bean() {
        return (InjectableBean)this.bean;
    }

    public void setOtherHttpContextObject(Object var1) {
        if (this.bean != null) {
            this.arc$delegate().setOtherHttpContextObject(var1);
        } else {
            super.setOtherHttpContextObject(var1);
        }
    }

    public Object getOtherHttpContextObject() {
        return this.bean != null ? this.arc$delegate().getOtherHttpContextObject() : super.getOtherHttpContextObject();
    }

    public String toString() {
        return this.bean != null ? this.arc$delegate().toString() : super.toString();
    }

    public CurrentVertxRequest setCurrent(RoutingContext var1, Object var2) {
        return this.bean != null ? this.arc$delegate().setCurrent(var1, var2) : super.setCurrent(var1, var2);
    }

    public RoutingContext getCurrent() {
        return this.bean != null ? this.arc$delegate().getCurrent() : super.getCurrent();
    }

    public CurrentVertxRequest setCurrent(RoutingContext var1) {
        return this.bean != null ? this.arc$delegate().setCurrent(var1) : super.setCurrent(var1);
    }
}
