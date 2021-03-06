//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package io.quarkus.vertx.http.runtime;

import io.quarkus.arc.ClientProxy;
import io.quarkus.arc.InjectableBean;
import io.quarkus.arc.impl.ClientProxies;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;
import io.vertx.core.MultiMap;
import io.vertx.core.Vertx;
import io.vertx.core.buffer.Buffer;
import io.vertx.core.http.HttpMethod;
import io.vertx.core.http.HttpServerRequest;
import io.vertx.core.http.HttpServerResponse;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.auth.User;
import io.vertx.ext.web.Cookie;
import io.vertx.ext.web.FileUpload;
import io.vertx.ext.web.LanguageHeader;
import io.vertx.ext.web.Locale;
import io.vertx.ext.web.ParsedHeaderValues;
import io.vertx.ext.web.Route;
import io.vertx.ext.web.RoutingContext;
import io.vertx.ext.web.Session;
import java.util.List;
import java.util.Map;
import java.util.Set;

// $FF: synthetic class
public class CurrentVertxRequest_ProducerMethod_getCurrent_6dc23d16d53ba5c34e1e7b6f54290fd7b9aebd76_ClientProxy implements ClientProxy, RoutingContext {
    private final CurrentVertxRequest_ProducerMethod_getCurrent_6dc23d16d53ba5c34e1e7b6f54290fd7b9aebd76_Bean bean;

    public CurrentVertxRequest_ProducerMethod_getCurrent_6dc23d16d53ba5c34e1e7b6f54290fd7b9aebd76_ClientProxy(CurrentVertxRequest_ProducerMethod_getCurrent_6dc23d16d53ba5c34e1e7b6f54290fd7b9aebd76_Bean var1) {
        this.bean = var1;
    }

    private RoutingContext arc$delegate() {
        return (RoutingContext)ClientProxies.getDelegate((InjectableBean)this.bean);
    }

    public Object arc_contextualInstance() {
        return this.arc$delegate();
    }

    public InjectableBean arc_bean() {
        return (InjectableBean)this.bean;
    }

    public int addEndHandler(Handler<AsyncResult<Void>> var1) {
        return this.arc$delegate().addEndHandler(var1);
    }

    public List<LanguageHeader> acceptableLanguages() {
        return this.arc$delegate().acceptableLanguages();
    }

    public RoutingContext put(String var1, Object var2) {
        return this.arc$delegate().put(var1, var2);
    }

    public boolean isSessionAccessed() {
        return this.arc$delegate().isSessionAccessed();
    }

    public HttpServerResponse response() {
        return this.arc$delegate().response();
    }

    public boolean removeHeadersEndHandler(int var1) {
        return this.arc$delegate().removeHeadersEndHandler(var1);
    }

    public void next() {
        this.arc$delegate().next();
    }

    public <T> T remove(String var1) {
        return this.arc$delegate().remove(var1);
    }

    public void fail(Throwable var1) {
        this.arc$delegate().fail(var1);
    }

    public Vertx vertx() {
        return this.arc$delegate().vertx();
    }

    public HttpServerRequest request() {
        return this.arc$delegate().request();
    }

    public Buffer getBody() {
        return this.arc$delegate().getBody();
    }

    public boolean failed() {
        return this.arc$delegate().failed();
    }

    public int addBodyEndHandler(Handler<Void> var1) {
        return this.arc$delegate().addBodyEndHandler(var1);
    }

    public void fail(int var1, Throwable var2) {
        this.arc$delegate().fail(var1, var2);
    }

    public MultiMap queryParams() {
        return this.arc$delegate().queryParams();
    }

    public List<String> queryParam(String var1) {
        return this.arc$delegate().queryParam(var1);
    }

    public LanguageHeader preferredLanguage() {
        return this.arc$delegate().preferredLanguage();
    }

    public RoutingContext addCookie(Cookie var1) {
        return this.arc$delegate().addCookie(var1);
    }

    public Set<FileUpload> fileUploads() {
        return this.arc$delegate().fileUploads();
    }

    public void setUser(User var1) {
        this.arc$delegate().setUser(var1);
    }

    public int cookieCount() {
        return this.arc$delegate().cookieCount();
    }

    public int addHeadersEndHandler(Handler<Void> var1) {
        return this.arc$delegate().addHeadersEndHandler(var1);
    }

    public boolean removeEndHandler(int var1) {
        return this.arc$delegate().removeEndHandler(var1);
    }

    public JsonArray getBodyAsJsonArray() {
        return this.arc$delegate().getBodyAsJsonArray();
    }

    public Throwable failure() {
        return this.arc$delegate().failure();
    }

    public String pathParam(String var1) {
        return this.arc$delegate().pathParam(var1);
    }

    public String normalisedPath() {
        return this.arc$delegate().normalisedPath();
    }

    public void setBody(Buffer var1) {
        this.arc$delegate().setBody(var1);
    }

    public ParsedHeaderValues parsedHeaders() {
        return this.arc$delegate().parsedHeaders();
    }

    public String getBodyAsString() {
        return this.arc$delegate().getBodyAsString();
    }

    public void setSession(Session var1) {
        this.arc$delegate().setSession(var1);
    }

    public void reroute(String var1) {
        this.arc$delegate().reroute(var1);
    }

    public Cookie removeCookie(String var1, boolean var2) {
        return this.arc$delegate().removeCookie(var1, var2);
    }

    public Map<String, io.vertx.core.http.Cookie> cookieMap() {
        return this.arc$delegate().cookieMap();
    }

    public void fail(int var1) {
        this.arc$delegate().fail(var1);
    }

    public <T> T get(String var1) {
        return this.arc$delegate().get(var1);
    }

    public Route currentRoute() {
        return this.arc$delegate().currentRoute();
    }

    public void clearUser() {
        this.arc$delegate().clearUser();
    }

    public String mountPoint() {
        return this.arc$delegate().mountPoint();
    }

    public JsonObject getBodyAsJson() {
        return this.arc$delegate().getBodyAsJson();
    }

    public String getAcceptableContentType() {
        return this.arc$delegate().getAcceptableContentType();
    }

    public Locale preferredLocale() {
        return this.arc$delegate().preferredLocale();
    }

    public RoutingContext addCookie(io.vertx.core.http.Cookie var1) {
        return this.arc$delegate().addCookie(var1);
    }

    public Session session() {
        return this.arc$delegate().session();
    }

    public void setAcceptableContentType(String var1) {
        this.arc$delegate().setAcceptableContentType(var1);
    }

    public Map<String, String> pathParams() {
        return this.arc$delegate().pathParams();
    }

    public List<Locale> acceptableLocales() {
        return this.arc$delegate().acceptableLocales();
    }

    public String toString() {
        return this.arc$delegate().toString();
    }

    public Cookie getCookie(String var1) {
        return this.arc$delegate().getCookie(var1);
    }

    public User user() {
        return this.arc$delegate().user();
    }

    public void reroute(HttpMethod var1, String var2) {
        this.arc$delegate().reroute(var1, var2);
    }

    public Set<Cookie> cookies() {
        return this.arc$delegate().cookies();
    }

    public int statusCode() {
        return this.arc$delegate().statusCode();
    }

    public Map<String, Object> data() {
        return this.arc$delegate().data();
    }

    public String getBodyAsString(String var1) {
        return this.arc$delegate().getBodyAsString(var1);
    }

    public Cookie removeCookie(String var1) {
        return this.arc$delegate().removeCookie(var1);
    }

    public boolean removeBodyEndHandler(int var1) {
        return this.arc$delegate().removeBodyEndHandler(var1);
    }
}
