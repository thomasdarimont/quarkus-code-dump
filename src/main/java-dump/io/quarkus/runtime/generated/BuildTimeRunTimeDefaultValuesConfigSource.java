//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package io.quarkus.runtime.generated;

import io.quarkus.runtime.configuration.AbstractRawDefaultConfigSource;
import io.quarkus.runtime.configuration.NameIterator;

// $FF: synthetic class
public final class BuildTimeRunTimeDefaultValuesConfigSource extends AbstractRawDefaultConfigSource {
    public BuildTimeRunTimeDefaultValuesConfigSource() {
    }

    public String getValue(NameIterator var1) {
        if (var1.hasNext()) {
            var1.next();
            if (var1.previousSegmentEquals("quarkus")) {
                return this.getDefaultFor(var1);
            }
        }

        return null;
    }

    private String getDefaultFor_default_locale/* $FF was: getDefaultFor:default-locale*/(NameIterator var1) {
        return !var1.hasNext() ? "${user.language:en}-${user.country:}" : null;
    }

    private String getDefaultFor_http_auth_basic/* $FF was: getDefaultFor:http:auth:basic*/(NameIterator var1) {
        return !var1.hasNext() ? "false" : null;
    }

    private String getDefaultFor_http_auth_form_cookie_name/* $FF was: getDefaultFor:http:auth:form:cookie-name*/(NameIterator var1) {
        return !var1.hasNext() ? "quarkus-credential" : null;
    }

    private String getDefaultFor_http_auth_form_enabled/* $FF was: getDefaultFor:http:auth:form:enabled*/(NameIterator var1) {
        return !var1.hasNext() ? "false" : null;
    }

    private String getDefaultFor_http_auth_form_error_page/* $FF was: getDefaultFor:http:auth:form:error-page*/(NameIterator var1) {
        return !var1.hasNext() ? "/error.html" : null;
    }

    private String getDefaultFor_http_auth_form_landing_page/* $FF was: getDefaultFor:http:auth:form:landing-page*/(NameIterator var1) {
        return !var1.hasNext() ? "/index.html" : null;
    }

    private String getDefaultFor_http_auth_form_location_cookie/* $FF was: getDefaultFor:http:auth:form:location-cookie*/(NameIterator var1) {
        return !var1.hasNext() ? "quarkus-redirect-location" : null;
    }

    private String getDefaultFor_http_auth_form_login_page/* $FF was: getDefaultFor:http:auth:form:login-page*/(NameIterator var1) {
        return !var1.hasNext() ? "/login.html" : null;
    }

    private String getDefaultFor_http_auth_form_new_cookie_interval/* $FF was: getDefaultFor:http:auth:form:new-cookie-interval*/(NameIterator var1) {
        return !var1.hasNext() ? "PT1M" : null;
    }

    private String getDefaultFor_http_auth_form_password_parameter/* $FF was: getDefaultFor:http:auth:form:password-parameter*/(NameIterator var1) {
        return !var1.hasNext() ? "j_password" : null;
    }

    private String getDefaultFor_http_auth_form_post_location/* $FF was: getDefaultFor:http:auth:form:post-location*/(NameIterator var1) {
        return !var1.hasNext() ? "/j_security_check" : null;
    }

    private String getDefaultFor_http_auth_form_redirect_after_login/* $FF was: getDefaultFor:http:auth:form:redirect-after-login*/(NameIterator var1) {
        return !var1.hasNext() ? "true" : null;
    }

    private String getDefaultFor_http_auth_form_timeout/* $FF was: getDefaultFor:http:auth:form:timeout*/(NameIterator var1) {
        return !var1.hasNext() ? "PT30M" : null;
    }

    private String getDefaultFor_http_auth_form_username_parameter/* $FF was: getDefaultFor:http:auth:form:username-parameter*/(NameIterator var1) {
        return !var1.hasNext() ? "j_username" : null;
    }

    private String getDefaultFor_http_auth_form/* $FF was: getDefaultFor:http:auth:form*/(NameIterator var1) {
        if (!var1.hasNext()) {
            return null;
        } else if (!var1.nextSegmentEquals("location-cookie")) {
            if (!var1.nextSegmentEquals("new-cookie-interval")) {
                if (!var1.nextSegmentEquals("login-page")) {
                    if (!var1.nextSegmentEquals("post-location")) {
                        if (!var1.nextSegmentEquals("username-parameter")) {
                            if (!var1.nextSegmentEquals("error-page")) {
                                if (!var1.nextSegmentEquals("redirect-after-login")) {
                                    if (!var1.nextSegmentEquals("landing-page")) {
                                        if (!var1.nextSegmentEquals("cookie-name")) {
                                            if (!var1.nextSegmentEquals("enabled")) {
                                                if (!var1.nextSegmentEquals("password-parameter")) {
                                                    if (!var1.nextSegmentEquals("timeout")) {
                                                        return null;
                                                    } else {
                                                        var1.next();
                                                        return this.getDefaultFor:http:auth:form:timeout(var1);
                                                    }
                                                } else {
                                                    var1.next();
                                                    return this.getDefaultFor:http:auth:form:password-parameter(var1);
                                                }
                                            } else {
                                                var1.next();
                                                return this.getDefaultFor:http:auth:form:enabled(var1);
                                            }
                                        } else {
                                            var1.next();
                                            return this.getDefaultFor:http:auth:form:cookie-name(var1);
                                        }
                                    } else {
                                        var1.next();
                                        return this.getDefaultFor:http:auth:form:landing-page(var1);
                                    }
                                } else {
                                    var1.next();
                                    return this.getDefaultFor:http:auth:form:redirect-after-login(var1);
                                }
                            } else {
                                var1.next();
                                return this.getDefaultFor:http:auth:form:error-page(var1);
                            }
                        } else {
                            var1.next();
                            return this.getDefaultFor:http:auth:form:username-parameter(var1);
                        }
                    } else {
                        var1.next();
                        return this.getDefaultFor:http:auth:form:post-location(var1);
                    }
                } else {
                    var1.next();
                    return this.getDefaultFor:http:auth:form:login-page(var1);
                }
            } else {
                var1.next();
                return this.getDefaultFor:http:auth:form:new-cookie-interval(var1);
            }
        } else {
            var1.next();
            return this.getDefaultFor:http:auth:form:location-cookie(var1);
        }
    }

    private String getDefaultFor_http_auth_proactive/* $FF was: getDefaultFor:http:auth:proactive*/(NameIterator var1) {
        return !var1.hasNext() ? "true" : null;
    }

    private String getDefaultFor_http_auth_realm/* $FF was: getDefaultFor:http:auth:realm*/(NameIterator var1) {
        return !var1.hasNext() ? "Quarkus" : null;
    }

    private String getDefaultFor_http_auth/* $FF was: getDefaultFor:http:auth*/(NameIterator var1) {
        if (!var1.hasNext()) {
            return null;
        } else if (!var1.nextSegmentEquals("form")) {
            if (!var1.nextSegmentEquals("proactive")) {
                if (!var1.nextSegmentEquals("realm")) {
                    if (!var1.nextSegmentEquals("basic")) {
                        return null;
                    } else {
                        var1.next();
                        return this.getDefaultFor:http:auth:basic(var1);
                    }
                } else {
                    var1.next();
                    return this.getDefaultFor:http:auth:realm(var1);
                }
            } else {
                var1.next();
                return this.getDefaultFor:http:auth:proactive(var1);
            }
        } else {
            var1.next();
            return this.getDefaultFor:http:auth:form(var1);
        }
    }

    private String getDefaultFor_http_non_application_root_path/* $FF was: getDefaultFor:http:non-application-root-path*/(NameIterator var1) {
        return !var1.hasNext() ? "q" : null;
    }

    private String getDefaultFor_http_redirect_to_non_application_root_path/* $FF was: getDefaultFor:http:redirect-to-non-application-root-path*/(NameIterator var1) {
        return !var1.hasNext() ? "true" : null;
    }

    private String getDefaultFor_http_root_path/* $FF was: getDefaultFor:http:root-path*/(NameIterator var1) {
        return !var1.hasNext() ? "/" : null;
    }

    private String getDefaultFor_http_ssl_client_auth/* $FF was: getDefaultFor:http:ssl:client-auth*/(NameIterator var1) {
        return !var1.hasNext() ? "NONE" : null;
    }

    private String getDefaultFor_http_ssl/* $FF was: getDefaultFor:http:ssl*/(NameIterator var1) {
        if (!var1.hasNext()) {
            return null;
        } else if (!var1.nextSegmentEquals("client-auth")) {
            return null;
        } else {
            var1.next();
            return this.getDefaultFor:http:ssl:client-auth(var1);
        }
    }

    private String getDefaultFor_http_virtual/* $FF was: getDefaultFor:http:virtual*/(NameIterator var1) {
        return !var1.hasNext() ? "false" : null;
    }

    private String getDefaultFor_http/* $FF was: getDefaultFor:http*/(NameIterator var1) {
        if (!var1.hasNext()) {
            return null;
        } else if (!var1.nextSegmentEquals("root-path")) {
            if (!var1.nextSegmentEquals("non-application-root-path")) {
                if (!var1.nextSegmentEquals("virtual")) {
                    if (!var1.nextSegmentEquals("auth")) {
                        if (!var1.nextSegmentEquals("ssl")) {
                            if (!var1.nextSegmentEquals("redirect-to-non-application-root-path")) {
                                return null;
                            } else {
                                var1.next();
                                return this.getDefaultFor:http:redirect-to-non-application-root-path(var1);
                            }
                        } else {
                            var1.next();
                            return this.getDefaultFor:http:ssl(var1);
                        }
                    } else {
                        var1.next();
                        return this.getDefaultFor:http:auth(var1);
                    }
                } else {
                    var1.next();
                    return this.getDefaultFor:http:virtual(var1);
                }
            } else {
                var1.next();
                return this.getDefaultFor:http:non-application-root-path(var1);
            }
        } else {
            var1.next();
            return this.getDefaultFor:http:root-path(var1);
        }
    }

    private String getDefaultFor_locales/* $FF was: getDefaultFor:locales*/(NameIterator var1) {
        return !var1.hasNext() ? "${user.language:en}-${user.country:}" : null;
    }

    private String getDefaultFor_log_category___min_level/* $FF was: getDefaultFor:log:category:*:min-level*/(NameIterator var1) {
        return !var1.hasNext() ? "inherit" : null;
    }

    private String getDefaultFor_log_category__/* $FF was: getDefaultFor:log:category:**/(NameIterator var1) {
        if (!var1.hasNext()) {
            return null;
        } else if (!var1.nextSegmentEquals("min-level")) {
            return null;
        } else {
            var1.next();
            return this.getDefaultFor:log:category:*:min-level(var1);
        }
    }

    private String getDefaultFor_log_category/* $FF was: getDefaultFor:log:category*/(NameIterator var1) {
        if (!var1.hasNext()) {
            return null;
        } else if (!var1.hasNext()) {
            return null;
        } else {
            var1.next();
            return this.getDefaultFor:log:category:*(var1);
        }
    }

    private String getDefaultFor_log_metrics_enabled/* $FF was: getDefaultFor:log:metrics:enabled*/(NameIterator var1) {
        return !var1.hasNext() ? "false" : null;
    }

    private String getDefaultFor_log_metrics/* $FF was: getDefaultFor:log:metrics*/(NameIterator var1) {
        if (!var1.hasNext()) {
            return null;
        } else if (!var1.nextSegmentEquals("enabled")) {
            return null;
        } else {
            var1.next();
            return this.getDefaultFor:log:metrics:enabled(var1);
        }
    }

    private String getDefaultFor_log_min_level/* $FF was: getDefaultFor:log:min-level*/(NameIterator var1) {
        return !var1.hasNext() ? "DEBUG" : null;
    }

    private String getDefaultFor_log/* $FF was: getDefaultFor:log*/(NameIterator var1) {
        if (!var1.hasNext()) {
            return null;
        } else if (!var1.nextSegmentEquals("metrics")) {
            if (!var1.nextSegmentEquals("category")) {
                if (!var1.nextSegmentEquals("min-level")) {
                    return null;
                } else {
                    var1.next();
                    return this.getDefaultFor:log:min-level(var1);
                }
            } else {
                var1.next();
                return this.getDefaultFor:log:category(var1);
            }
        } else {
            var1.next();
            return this.getDefaultFor:log:metrics(var1);
        }
    }

    private String getDefaultFor_security_jaxrs_deny_unannotated_endpoints/* $FF was: getDefaultFor:security:jaxrs:deny-unannotated-endpoints*/(NameIterator var1) {
        return !var1.hasNext() ? "false" : null;
    }

    private String getDefaultFor_security_jaxrs/* $FF was: getDefaultFor:security:jaxrs*/(NameIterator var1) {
        if (!var1.hasNext()) {
            return null;
        } else if (!var1.nextSegmentEquals("deny-unannotated-endpoints")) {
            return null;
        } else {
            var1.next();
            return this.getDefaultFor:security:jaxrs:deny-unannotated-endpoints(var1);
        }
    }

    private String getDefaultFor_security/* $FF was: getDefaultFor:security*/(NameIterator var1) {
        if (!var1.hasNext()) {
            return null;
        } else if (!var1.nextSegmentEquals("jaxrs")) {
            return null;
        } else {
            var1.next();
            return this.getDefaultFor:security:jaxrs(var1);
        }
    }

    private String getDefaultFor_tls_trust_all/* $FF was: getDefaultFor:tls:trust-all*/(NameIterator var1) {
        return !var1.hasNext() ? "false" : null;
    }

    private String getDefaultFor_tls/* $FF was: getDefaultFor:tls*/(NameIterator var1) {
        if (!var1.hasNext()) {
            return null;
        } else if (!var1.nextSegmentEquals("trust-all")) {
            return null;
        } else {
            var1.next();
            return this.getDefaultFor:tls:trust-all(var1);
        }
    }

    private String getDefaultFor(NameIterator var1) {
        if (!var1.hasNext()) {
            return null;
        } else if (!var1.nextSegmentEquals("locales")) {
            if (!var1.nextSegmentEquals("security")) {
                if (!var1.nextSegmentEquals("log")) {
                    if (!var1.nextSegmentEquals("http")) {
                        if (!var1.nextSegmentEquals("tls")) {
                            if (!var1.nextSegmentEquals("default-locale")) {
                                return null;
                            } else {
                                var1.next();
                                return this.getDefaultFor:default-locale(var1);
                            }
                        } else {
                            var1.next();
                            return this.getDefaultFor:tls(var1);
                        }
                    } else {
                        var1.next();
                        return this.getDefaultFor:http(var1);
                    }
                } else {
                    var1.next();
                    return this.getDefaultFor:log(var1);
                }
            } else {
                var1.next();
                return this.getDefaultFor:security(var1);
            }
        } else {
            var1.next();
            return this.getDefaultFor:locales(var1);
        }
    }
}
