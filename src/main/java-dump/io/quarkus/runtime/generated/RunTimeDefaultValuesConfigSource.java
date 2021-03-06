//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package io.quarkus.runtime.generated;

import io.quarkus.runtime.configuration.AbstractRawDefaultConfigSource;
import io.quarkus.runtime.configuration.NameIterator;

// $FF: synthetic class
public final class RunTimeDefaultValuesConfigSource extends AbstractRawDefaultConfigSource {
    public RunTimeDefaultValuesConfigSource() {
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

    private String getDefaultFor_banner_enabled/* $FF was: getDefaultFor:banner:enabled*/(NameIterator var1) {
        return !var1.hasNext() ? "true" : null;
    }

    private String getDefaultFor_banner/* $FF was: getDefaultFor:banner*/(NameIterator var1) {
        if (!var1.hasNext()) {
            return null;
        } else if (!var1.nextSegmentEquals("enabled")) {
            return null;
        } else {
            var1.next();
            return this.getDefaultFor:banner:enabled(var1);
        }
    }

    private String getDefaultFor_configuration_build_time_mismatch_at_runtime/* $FF was: getDefaultFor:configuration:build-time-mismatch-at-runtime*/(NameIterator var1) {
        return !var1.hasNext() ? "warn" : null;
    }

    private String getDefaultFor_configuration/* $FF was: getDefaultFor:configuration*/(NameIterator var1) {
        if (!var1.hasNext()) {
            return null;
        } else if (!var1.nextSegmentEquals("build-time-mismatch-at-runtime")) {
            return null;
        } else {
            var1.next();
            return this.getDefaultFor:configuration:build-time-mismatch-at-runtime(var1);
        }
    }

    private String getDefaultFor_http_access_log_base_file_name/* $FF was: getDefaultFor:http:access-log:base-file-name*/(NameIterator var1) {
        return !var1.hasNext() ? "quarkus" : null;
    }

    private String getDefaultFor_http_access_log_category/* $FF was: getDefaultFor:http:access-log:category*/(NameIterator var1) {
        return !var1.hasNext() ? "io.quarkus.http.access-log" : null;
    }

    private String getDefaultFor_http_access_log_enabled/* $FF was: getDefaultFor:http:access-log:enabled*/(NameIterator var1) {
        return !var1.hasNext() ? "false" : null;
    }

    private String getDefaultFor_http_access_log_log_suffix/* $FF was: getDefaultFor:http:access-log:log-suffix*/(NameIterator var1) {
        return !var1.hasNext() ? ".log" : null;
    }

    private String getDefaultFor_http_access_log_log_to_file/* $FF was: getDefaultFor:http:access-log:log-to-file*/(NameIterator var1) {
        return !var1.hasNext() ? "false" : null;
    }

    private String getDefaultFor_http_access_log_pattern/* $FF was: getDefaultFor:http:access-log:pattern*/(NameIterator var1) {
        return !var1.hasNext() ? "common" : null;
    }

    private String getDefaultFor_http_access_log_rotate/* $FF was: getDefaultFor:http:access-log:rotate*/(NameIterator var1) {
        return !var1.hasNext() ? "true" : null;
    }

    private String getDefaultFor_http_access_log/* $FF was: getDefaultFor:http:access-log*/(NameIterator var1) {
        if (!var1.hasNext()) {
            return null;
        } else if (!var1.nextSegmentEquals("rotate")) {
            if (!var1.nextSegmentEquals("log-to-file")) {
                if (!var1.nextSegmentEquals("base-file-name")) {
                    if (!var1.nextSegmentEquals("pattern")) {
                        if (!var1.nextSegmentEquals("category")) {
                            if (!var1.nextSegmentEquals("log-suffix")) {
                                if (!var1.nextSegmentEquals("enabled")) {
                                    return null;
                                } else {
                                    var1.next();
                                    return this.getDefaultFor:http:access-log:enabled(var1);
                                }
                            } else {
                                var1.next();
                                return this.getDefaultFor:http:access-log:log-suffix(var1);
                            }
                        } else {
                            var1.next();
                            return this.getDefaultFor:http:access-log:category(var1);
                        }
                    } else {
                        var1.next();
                        return this.getDefaultFor:http:access-log:pattern(var1);
                    }
                } else {
                    var1.next();
                    return this.getDefaultFor:http:access-log:base-file-name(var1);
                }
            } else {
                var1.next();
                return this.getDefaultFor:http:access-log:log-to-file(var1);
            }
        } else {
            var1.next();
            return this.getDefaultFor:http:access-log:rotate(var1);
        }
    }

    private String getDefaultFor_http_body_delete_uploaded_files_on_end/* $FF was: getDefaultFor:http:body:delete-uploaded-files-on-end*/(NameIterator var1) {
        return !var1.hasNext() ? "true" : null;
    }

    private String getDefaultFor_http_body_handle_file_uploads/* $FF was: getDefaultFor:http:body:handle-file-uploads*/(NameIterator var1) {
        return !var1.hasNext() ? "true" : null;
    }

    private String getDefaultFor_http_body_merge_form_attributes/* $FF was: getDefaultFor:http:body:merge-form-attributes*/(NameIterator var1) {
        return !var1.hasNext() ? "true" : null;
    }

    private String getDefaultFor_http_body_preallocate_body_buffer/* $FF was: getDefaultFor:http:body:preallocate-body-buffer*/(NameIterator var1) {
        return !var1.hasNext() ? "false" : null;
    }

    private String getDefaultFor_http_body_uploads_directory/* $FF was: getDefaultFor:http:body:uploads-directory*/(NameIterator var1) {
        return !var1.hasNext() ? "${java.io.tmpdir}/uploads" : null;
    }

    private String getDefaultFor_http_body/* $FF was: getDefaultFor:http:body*/(NameIterator var1) {
        if (!var1.hasNext()) {
            return null;
        } else if (!var1.nextSegmentEquals("merge-form-attributes")) {
            if (!var1.nextSegmentEquals("handle-file-uploads")) {
                if (!var1.nextSegmentEquals("preallocate-body-buffer")) {
                    if (!var1.nextSegmentEquals("delete-uploaded-files-on-end")) {
                        if (!var1.nextSegmentEquals("uploads-directory")) {
                            return null;
                        } else {
                            var1.next();
                            return this.getDefaultFor:http:body:uploads-directory(var1);
                        }
                    } else {
                        var1.next();
                        return this.getDefaultFor:http:body:delete-uploaded-files-on-end(var1);
                    }
                } else {
                    var1.next();
                    return this.getDefaultFor:http:body:preallocate-body-buffer(var1);
                }
            } else {
                var1.next();
                return this.getDefaultFor:http:body:handle-file-uploads(var1);
            }
        } else {
            var1.next();
            return this.getDefaultFor:http:body:merge-form-attributes(var1);
        }
    }

    private String getDefaultFor_http_cors/* $FF was: getDefaultFor:http:cors*/(NameIterator var1) {
        return !var1.hasNext() ? "false" : null;
    }

    private String getDefaultFor_http_domain_socket/* $FF was: getDefaultFor:http:domain-socket*/(NameIterator var1) {
        return !var1.hasNext() ? "/var/run/io.quarkus.app.socket" : null;
    }

    private String getDefaultFor_http_domain_socket_enabled/* $FF was: getDefaultFor:http:domain-socket-enabled*/(NameIterator var1) {
        return !var1.hasNext() ? "false" : null;
    }

    private String getDefaultFor_http_enable_compression/* $FF was: getDefaultFor:http:enable-compression*/(NameIterator var1) {
        return !var1.hasNext() ? "false" : null;
    }

    private String getDefaultFor_http_host_enabled/* $FF was: getDefaultFor:http:host-enabled*/(NameIterator var1) {
        return !var1.hasNext() ? "true" : null;
    }

    private String getDefaultFor_http_http2/* $FF was: getDefaultFor:http:http2*/(NameIterator var1) {
        return !var1.hasNext() ? "true" : null;
    }

    private String getDefaultFor_http_idle_timeout/* $FF was: getDefaultFor:http:idle-timeout*/(NameIterator var1) {
        return !var1.hasNext() ? "30M" : null;
    }

    private String getDefaultFor_http_insecure_requests/* $FF was: getDefaultFor:http:insecure-requests*/(NameIterator var1) {
        return !var1.hasNext() ? "enabled" : null;
    }

    private String getDefaultFor_http_limits_max_body_size/* $FF was: getDefaultFor:http:limits:max-body-size*/(NameIterator var1) {
        return !var1.hasNext() ? "10240K" : null;
    }

    private String getDefaultFor_http_limits_max_chunk_size/* $FF was: getDefaultFor:http:limits:max-chunk-size*/(NameIterator var1) {
        return !var1.hasNext() ? "8192" : null;
    }

    private String getDefaultFor_http_limits_max_header_size/* $FF was: getDefaultFor:http:limits:max-header-size*/(NameIterator var1) {
        return !var1.hasNext() ? "20K" : null;
    }

    private String getDefaultFor_http_limits_max_initial_line_length/* $FF was: getDefaultFor:http:limits:max-initial-line-length*/(NameIterator var1) {
        return !var1.hasNext() ? "4096" : null;
    }

    private String getDefaultFor_http_limits/* $FF was: getDefaultFor:http:limits*/(NameIterator var1) {
        if (!var1.hasNext()) {
            return null;
        } else if (!var1.nextSegmentEquals("max-initial-line-length")) {
            if (!var1.nextSegmentEquals("max-chunk-size")) {
                if (!var1.nextSegmentEquals("max-header-size")) {
                    if (!var1.nextSegmentEquals("max-body-size")) {
                        return null;
                    } else {
                        var1.next();
                        return this.getDefaultFor:http:limits:max-body-size(var1);
                    }
                } else {
                    var1.next();
                    return this.getDefaultFor:http:limits:max-header-size(var1);
                }
            } else {
                var1.next();
                return this.getDefaultFor:http:limits:max-chunk-size(var1);
            }
        } else {
            var1.next();
            return this.getDefaultFor:http:limits:max-initial-line-length(var1);
        }
    }

    private String getDefaultFor_http_port/* $FF was: getDefaultFor:http:port*/(NameIterator var1) {
        return !var1.hasNext() ? "8080" : null;
    }

    private String getDefaultFor_http_proxy_allow_forwarded/* $FF was: getDefaultFor:http:proxy:allow-forwarded*/(NameIterator var1) {
        return !var1.hasNext() ? "false" : null;
    }

    private String getDefaultFor_http_proxy_enable_forwarded_host/* $FF was: getDefaultFor:http:proxy:enable-forwarded-host*/(NameIterator var1) {
        return !var1.hasNext() ? "false" : null;
    }

    private String getDefaultFor_http_proxy_enable_forwarded_prefix/* $FF was: getDefaultFor:http:proxy:enable-forwarded-prefix*/(NameIterator var1) {
        return !var1.hasNext() ? "false" : null;
    }

    private String getDefaultFor_http_proxy_forwarded_host_header/* $FF was: getDefaultFor:http:proxy:forwarded-host-header*/(NameIterator var1) {
        return !var1.hasNext() ? "X-Forwarded-Host" : null;
    }

    private String getDefaultFor_http_proxy_forwarded_prefix_header/* $FF was: getDefaultFor:http:proxy:forwarded-prefix-header*/(NameIterator var1) {
        return !var1.hasNext() ? "X-Forwarded-Prefix" : null;
    }

    private String getDefaultFor_http_proxy_proxy_address_forwarding/* $FF was: getDefaultFor:http:proxy:proxy-address-forwarding*/(NameIterator var1) {
        return !var1.hasNext() ? "false" : null;
    }

    private String getDefaultFor_http_proxy/* $FF was: getDefaultFor:http:proxy*/(NameIterator var1) {
        if (!var1.hasNext()) {
            return null;
        } else if (!var1.nextSegmentEquals("forwarded-prefix-header")) {
            if (!var1.nextSegmentEquals("allow-forwarded")) {
                if (!var1.nextSegmentEquals("enable-forwarded-prefix")) {
                    if (!var1.nextSegmentEquals("enable-forwarded-host")) {
                        if (!var1.nextSegmentEquals("forwarded-host-header")) {
                            if (!var1.nextSegmentEquals("proxy-address-forwarding")) {
                                return null;
                            } else {
                                var1.next();
                                return this.getDefaultFor:http:proxy:proxy-address-forwarding(var1);
                            }
                        } else {
                            var1.next();
                            return this.getDefaultFor:http:proxy:forwarded-host-header(var1);
                        }
                    } else {
                        var1.next();
                        return this.getDefaultFor:http:proxy:enable-forwarded-host(var1);
                    }
                } else {
                    var1.next();
                    return this.getDefaultFor:http:proxy:enable-forwarded-prefix(var1);
                }
            } else {
                var1.next();
                return this.getDefaultFor:http:proxy:allow-forwarded(var1);
            }
        } else {
            var1.next();
            return this.getDefaultFor:http:proxy:forwarded-prefix-header(var1);
        }
    }

    private String getDefaultFor_http_read_timeout/* $FF was: getDefaultFor:http:read-timeout*/(NameIterator var1) {
        return !var1.hasNext() ? "60s" : null;
    }

    private String getDefaultFor_http_record_request_start_time/* $FF was: getDefaultFor:http:record-request-start-time*/(NameIterator var1) {
        return !var1.hasNext() ? "false" : null;
    }

    private String getDefaultFor_http_same_site_cookie___add_secure_for_none/* $FF was: getDefaultFor:http:same-site-cookie:*:add-secure-for-none*/(NameIterator var1) {
        return !var1.hasNext() ? "true" : null;
    }

    private String getDefaultFor_http_same_site_cookie___case_sensitive/* $FF was: getDefaultFor:http:same-site-cookie:*:case-sensitive*/(NameIterator var1) {
        return !var1.hasNext() ? "false" : null;
    }

    private String getDefaultFor_http_same_site_cookie___enable_client_checker/* $FF was: getDefaultFor:http:same-site-cookie:*:enable-client-checker*/(NameIterator var1) {
        return !var1.hasNext() ? "true" : null;
    }

    private String getDefaultFor_http_same_site_cookie__/* $FF was: getDefaultFor:http:same-site-cookie:**/(NameIterator var1) {
        if (!var1.hasNext()) {
            return null;
        } else if (!var1.nextSegmentEquals("case-sensitive")) {
            if (!var1.nextSegmentEquals("add-secure-for-none")) {
                if (!var1.nextSegmentEquals("enable-client-checker")) {
                    return null;
                } else {
                    var1.next();
                    return this.getDefaultFor:http:same-site-cookie:*:enable-client-checker(var1);
                }
            } else {
                var1.next();
                return this.getDefaultFor:http:same-site-cookie:*:add-secure-for-none(var1);
            }
        } else {
            var1.next();
            return this.getDefaultFor:http:same-site-cookie:*:case-sensitive(var1);
        }
    }

    private String getDefaultFor_http_same_site_cookie/* $FF was: getDefaultFor:http:same-site-cookie*/(NameIterator var1) {
        if (!var1.hasNext()) {
            return null;
        } else if (!var1.hasNext()) {
            return null;
        } else {
            var1.next();
            return this.getDefaultFor:http:same-site-cookie:*(var1);
        }
    }

    private String getDefaultFor_http_so_reuse_port/* $FF was: getDefaultFor:http:so-reuse-port*/(NameIterator var1) {
        return !var1.hasNext() ? "false" : null;
    }

    private String getDefaultFor_http_ssl_certificate_key_store_password/* $FF was: getDefaultFor:http:ssl:certificate:key-store-password*/(NameIterator var1) {
        return !var1.hasNext() ? "password" : null;
    }

    private String getDefaultFor_http_ssl_certificate/* $FF was: getDefaultFor:http:ssl:certificate*/(NameIterator var1) {
        if (!var1.hasNext()) {
            return null;
        } else if (!var1.nextSegmentEquals("key-store-password")) {
            return null;
        } else {
            var1.next();
            return this.getDefaultFor:http:ssl:certificate:key-store-password(var1);
        }
    }

    private String getDefaultFor_http_ssl_protocols/* $FF was: getDefaultFor:http:ssl:protocols*/(NameIterator var1) {
        return !var1.hasNext() ? "TLSv1.3,TLSv1.2" : null;
    }

    private String getDefaultFor_http_ssl/* $FF was: getDefaultFor:http:ssl*/(NameIterator var1) {
        if (!var1.hasNext()) {
            return null;
        } else if (!var1.nextSegmentEquals("certificate")) {
            if (!var1.nextSegmentEquals("protocols")) {
                return null;
            } else {
                var1.next();
                return this.getDefaultFor:http:ssl:protocols(var1);
            }
        } else {
            var1.next();
            return this.getDefaultFor:http:ssl:certificate(var1);
        }
    }

    private String getDefaultFor_http_ssl_port/* $FF was: getDefaultFor:http:ssl-port*/(NameIterator var1) {
        return !var1.hasNext() ? "8443" : null;
    }

    private String getDefaultFor_http_tcp_cork/* $FF was: getDefaultFor:http:tcp-cork*/(NameIterator var1) {
        return !var1.hasNext() ? "false" : null;
    }

    private String getDefaultFor_http_tcp_fast_open/* $FF was: getDefaultFor:http:tcp-fast-open*/(NameIterator var1) {
        return !var1.hasNext() ? "false" : null;
    }

    private String getDefaultFor_http_tcp_quick_ack/* $FF was: getDefaultFor:http:tcp-quick-ack*/(NameIterator var1) {
        return !var1.hasNext() ? "false" : null;
    }

    private String getDefaultFor_http_test_port/* $FF was: getDefaultFor:http:test-port*/(NameIterator var1) {
        return !var1.hasNext() ? "8081" : null;
    }

    private String getDefaultFor_http_test_ssl_port/* $FF was: getDefaultFor:http:test-ssl-port*/(NameIterator var1) {
        return !var1.hasNext() ? "8444" : null;
    }

    private String getDefaultFor_http/* $FF was: getDefaultFor:http*/(NameIterator var1) {
        if (!var1.hasNext()) {
            return null;
        } else if (!var1.nextSegmentEquals("domain-socket")) {
            if (!var1.nextSegmentEquals("tcp-quick-ack")) {
                if (!var1.nextSegmentEquals("cors")) {
                    if (!var1.nextSegmentEquals("read-timeout")) {
                        if (!var1.nextSegmentEquals("so-reuse-port")) {
                            if (!var1.nextSegmentEquals("tcp-fast-open")) {
                                if (!var1.nextSegmentEquals("host-enabled")) {
                                    if (!var1.nextSegmentEquals("access-log")) {
                                        if (!var1.nextSegmentEquals("tcp-cork")) {
                                            if (!var1.nextSegmentEquals("body")) {
                                                if (!var1.nextSegmentEquals("ssl")) {
                                                    if (!var1.nextSegmentEquals("ssl-port")) {
                                                        if (!var1.nextSegmentEquals("proxy")) {
                                                            if (!var1.nextSegmentEquals("same-site-cookie")) {
                                                                if (!var1.nextSegmentEquals("record-request-start-time")) {
                                                                    if (!var1.nextSegmentEquals("test-ssl-port")) {
                                                                        if (!var1.nextSegmentEquals("domain-socket-enabled")) {
                                                                            if (!var1.nextSegmentEquals("port")) {
                                                                                if (!var1.nextSegmentEquals("enable-compression")) {
                                                                                    if (!var1.nextSegmentEquals("http2")) {
                                                                                        if (!var1.nextSegmentEquals("idle-timeout")) {
                                                                                            if (!var1.nextSegmentEquals("test-port")) {
                                                                                                if (!var1.nextSegmentEquals("insecure-requests")) {
                                                                                                    if (!var1.nextSegmentEquals("limits")) {
                                                                                                        return null;
                                                                                                    } else {
                                                                                                        var1.next();
                                                                                                        return this.getDefaultFor:http:limits(var1);
                                                                                                    }
                                                                                                } else {
                                                                                                    var1.next();
                                                                                                    return this.getDefaultFor:http:insecure-requests(var1);
                                                                                                }
                                                                                            } else {
                                                                                                var1.next();
                                                                                                return this.getDefaultFor:http:test-port(var1);
                                                                                            }
                                                                                        } else {
                                                                                            var1.next();
                                                                                            return this.getDefaultFor:http:idle-timeout(var1);
                                                                                        }
                                                                                    } else {
                                                                                        var1.next();
                                                                                        return this.getDefaultFor:http:http2(var1);
                                                                                    }
                                                                                } else {
                                                                                    var1.next();
                                                                                    return this.getDefaultFor:http:enable-compression(var1);
                                                                                }
                                                                            } else {
                                                                                var1.next();
                                                                                return this.getDefaultFor:http:port(var1);
                                                                            }
                                                                        } else {
                                                                            var1.next();
                                                                            return this.getDefaultFor:http:domain-socket-enabled(var1);
                                                                        }
                                                                    } else {
                                                                        var1.next();
                                                                        return this.getDefaultFor:http:test-ssl-port(var1);
                                                                    }
                                                                } else {
                                                                    var1.next();
                                                                    return this.getDefaultFor:http:record-request-start-time(var1);
                                                                }
                                                            } else {
                                                                var1.next();
                                                                return this.getDefaultFor:http:same-site-cookie(var1);
                                                            }
                                                        } else {
                                                            var1.next();
                                                            return this.getDefaultFor:http:proxy(var1);
                                                        }
                                                    } else {
                                                        var1.next();
                                                        return this.getDefaultFor:http:ssl-port(var1);
                                                    }
                                                } else {
                                                    var1.next();
                                                    return this.getDefaultFor:http:ssl(var1);
                                                }
                                            } else {
                                                var1.next();
                                                return this.getDefaultFor:http:body(var1);
                                            }
                                        } else {
                                            var1.next();
                                            return this.getDefaultFor:http:tcp-cork(var1);
                                        }
                                    } else {
                                        var1.next();
                                        return this.getDefaultFor:http:access-log(var1);
                                    }
                                } else {
                                    var1.next();
                                    return this.getDefaultFor:http:host-enabled(var1);
                                }
                            } else {
                                var1.next();
                                return this.getDefaultFor:http:tcp-fast-open(var1);
                            }
                        } else {
                            var1.next();
                            return this.getDefaultFor:http:so-reuse-port(var1);
                        }
                    } else {
                        var1.next();
                        return this.getDefaultFor:http:read-timeout(var1);
                    }
                } else {
                    var1.next();
                    return this.getDefaultFor:http:cors(var1);
                }
            } else {
                var1.next();
                return this.getDefaultFor:http:tcp-quick-ack(var1);
            }
        } else {
            var1.next();
            return this.getDefaultFor:http:domain-socket(var1);
        }
    }

    private String getDefaultFor_log_category___level/* $FF was: getDefaultFor:log:category:*:level*/(NameIterator var1) {
        return !var1.hasNext() ? "inherit" : null;
    }

    private String getDefaultFor_log_category___use_parent_handlers/* $FF was: getDefaultFor:log:category:*:use-parent-handlers*/(NameIterator var1) {
        return !var1.hasNext() ? "true" : null;
    }

    private String getDefaultFor_log_category__/* $FF was: getDefaultFor:log:category:**/(NameIterator var1) {
        if (!var1.hasNext()) {
            return null;
        } else if (!var1.nextSegmentEquals("level")) {
            if (!var1.nextSegmentEquals("use-parent-handlers")) {
                return null;
            } else {
                var1.next();
                return this.getDefaultFor:log:category:*:use-parent-handlers(var1);
            }
        } else {
            var1.next();
            return this.getDefaultFor:log:category:*:level(var1);
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

    private String getDefaultFor_log_console_async_overflow/* $FF was: getDefaultFor:log:console:async:overflow*/(NameIterator var1) {
        return !var1.hasNext() ? "block" : null;
    }

    private String getDefaultFor_log_console_async_queue_length/* $FF was: getDefaultFor:log:console:async:queue-length*/(NameIterator var1) {
        return !var1.hasNext() ? "512" : null;
    }

    private String getDefaultFor_log_console_async/* $FF was: getDefaultFor:log:console:async*/(NameIterator var1) {
        if (!var1.hasNext()) {
            return "false";
        } else if (!var1.nextSegmentEquals("overflow")) {
            if (!var1.nextSegmentEquals("queue-length")) {
                return null;
            } else {
                var1.next();
                return this.getDefaultFor:log:console:async:queue-length(var1);
            }
        } else {
            var1.next();
            return this.getDefaultFor:log:console:async:overflow(var1);
        }
    }

    private String getDefaultFor_log_console_darken/* $FF was: getDefaultFor:log:console:darken*/(NameIterator var1) {
        return !var1.hasNext() ? "0" : null;
    }

    private String getDefaultFor_log_console_enable/* $FF was: getDefaultFor:log:console:enable*/(NameIterator var1) {
        return !var1.hasNext() ? "true" : null;
    }

    private String getDefaultFor_log_console_format/* $FF was: getDefaultFor:log:console:format*/(NameIterator var1) {
        return !var1.hasNext() ? "%d{yyyy-MM-dd HH:mm:ss,SSS} %-5p [%c{3.}] (%t) %s%e%n" : null;
    }

    private String getDefaultFor_log_console_level/* $FF was: getDefaultFor:log:console:level*/(NameIterator var1) {
        return !var1.hasNext() ? "ALL" : null;
    }

    private String getDefaultFor_log_console/* $FF was: getDefaultFor:log:console*/(NameIterator var1) {
        if (!var1.hasNext()) {
            return null;
        } else if (!var1.nextSegmentEquals("async")) {
            if (!var1.nextSegmentEquals("level")) {
                if (!var1.nextSegmentEquals("enable")) {
                    if (!var1.nextSegmentEquals("format")) {
                        if (!var1.nextSegmentEquals("darken")) {
                            return null;
                        } else {
                            var1.next();
                            return this.getDefaultFor:log:console:darken(var1);
                        }
                    } else {
                        var1.next();
                        return this.getDefaultFor:log:console:format(var1);
                    }
                } else {
                    var1.next();
                    return this.getDefaultFor:log:console:enable(var1);
                }
            } else {
                var1.next();
                return this.getDefaultFor:log:console:level(var1);
            }
        } else {
            var1.next();
            return this.getDefaultFor:log:console:async(var1);
        }
    }

    private String getDefaultFor_log_file_async_overflow/* $FF was: getDefaultFor:log:file:async:overflow*/(NameIterator var1) {
        return !var1.hasNext() ? "block" : null;
    }

    private String getDefaultFor_log_file_async_queue_length/* $FF was: getDefaultFor:log:file:async:queue-length*/(NameIterator var1) {
        return !var1.hasNext() ? "512" : null;
    }

    private String getDefaultFor_log_file_async/* $FF was: getDefaultFor:log:file:async*/(NameIterator var1) {
        if (!var1.hasNext()) {
            return "false";
        } else if (!var1.nextSegmentEquals("overflow")) {
            if (!var1.nextSegmentEquals("queue-length")) {
                return null;
            } else {
                var1.next();
                return this.getDefaultFor:log:file:async:queue-length(var1);
            }
        } else {
            var1.next();
            return this.getDefaultFor:log:file:async:overflow(var1);
        }
    }

    private String getDefaultFor_log_file_enable/* $FF was: getDefaultFor:log:file:enable*/(NameIterator var1) {
        return !var1.hasNext() ? "false" : null;
    }

    private String getDefaultFor_log_file_format/* $FF was: getDefaultFor:log:file:format*/(NameIterator var1) {
        return !var1.hasNext() ? "%d{yyyy-MM-dd HH:mm:ss,SSS} %h %N[%i] %-5p [%c{3.}] (%t) %s%e%n" : null;
    }

    private String getDefaultFor_log_file_level/* $FF was: getDefaultFor:log:file:level*/(NameIterator var1) {
        return !var1.hasNext() ? "ALL" : null;
    }

    private String getDefaultFor_log_file_path/* $FF was: getDefaultFor:log:file:path*/(NameIterator var1) {
        return !var1.hasNext() ? "quarkus.log" : null;
    }

    private String getDefaultFor_log_file_rotation_max_backup_index/* $FF was: getDefaultFor:log:file:rotation:max-backup-index*/(NameIterator var1) {
        return !var1.hasNext() ? "1" : null;
    }

    private String getDefaultFor_log_file_rotation_rotate_on_boot/* $FF was: getDefaultFor:log:file:rotation:rotate-on-boot*/(NameIterator var1) {
        return !var1.hasNext() ? "true" : null;
    }

    private String getDefaultFor_log_file_rotation/* $FF was: getDefaultFor:log:file:rotation*/(NameIterator var1) {
        if (!var1.hasNext()) {
            return null;
        } else if (!var1.nextSegmentEquals("max-backup-index")) {
            if (!var1.nextSegmentEquals("rotate-on-boot")) {
                return null;
            } else {
                var1.next();
                return this.getDefaultFor:log:file:rotation:rotate-on-boot(var1);
            }
        } else {
            var1.next();
            return this.getDefaultFor:log:file:rotation:max-backup-index(var1);
        }
    }

    private String getDefaultFor_log_file/* $FF was: getDefaultFor:log:file*/(NameIterator var1) {
        if (!var1.hasNext()) {
            return null;
        } else if (!var1.nextSegmentEquals("async")) {
            if (!var1.nextSegmentEquals("path")) {
                if (!var1.nextSegmentEquals("level")) {
                    if (!var1.nextSegmentEquals("enable")) {
                        if (!var1.nextSegmentEquals("rotation")) {
                            if (!var1.nextSegmentEquals("format")) {
                                return null;
                            } else {
                                var1.next();
                                return this.getDefaultFor:log:file:format(var1);
                            }
                        } else {
                            var1.next();
                            return this.getDefaultFor:log:file:rotation(var1);
                        }
                    } else {
                        var1.next();
                        return this.getDefaultFor:log:file:enable(var1);
                    }
                } else {
                    var1.next();
                    return this.getDefaultFor:log:file:level(var1);
                }
            } else {
                var1.next();
                return this.getDefaultFor:log:file:path(var1);
            }
        } else {
            var1.next();
            return this.getDefaultFor:log:file:async(var1);
        }
    }

    private String getDefaultFor_log_filter___if_starts_with/* $FF was: getDefaultFor:log:filter:*:if-starts-with*/(NameIterator var1) {
        return !var1.hasNext() ? "inherit" : null;
    }

    private String getDefaultFor_log_filter___target_level/* $FF was: getDefaultFor:log:filter:*:target-level*/(NameIterator var1) {
        return !var1.hasNext() ? "DEBUG" : null;
    }

    private String getDefaultFor_log_filter__/* $FF was: getDefaultFor:log:filter:**/(NameIterator var1) {
        if (!var1.hasNext()) {
            return null;
        } else if (!var1.nextSegmentEquals("target-level")) {
            if (!var1.nextSegmentEquals("if-starts-with")) {
                return null;
            } else {
                var1.next();
                return this.getDefaultFor:log:filter:*:if-starts-with(var1);
            }
        } else {
            var1.next();
            return this.getDefaultFor:log:filter:*:target-level(var1);
        }
    }

    private String getDefaultFor_log_filter/* $FF was: getDefaultFor:log:filter*/(NameIterator var1) {
        if (!var1.hasNext()) {
            return null;
        } else if (!var1.hasNext()) {
            return null;
        } else {
            var1.next();
            return this.getDefaultFor:log:filter:*(var1);
        }
    }

    private String getDefaultFor_log_handler_console___async_overflow/* $FF was: getDefaultFor:log:handler:console:*:async:overflow*/(NameIterator var1) {
        return !var1.hasNext() ? "block" : null;
    }

    private String getDefaultFor_log_handler_console___async_queue_length/* $FF was: getDefaultFor:log:handler:console:*:async:queue-length*/(NameIterator var1) {
        return !var1.hasNext() ? "512" : null;
    }

    private String getDefaultFor_log_handler_console___async/* $FF was: getDefaultFor:log:handler:console:*:async*/(NameIterator var1) {
        if (!var1.hasNext()) {
            return "false";
        } else if (!var1.nextSegmentEquals("overflow")) {
            if (!var1.nextSegmentEquals("queue-length")) {
                return null;
            } else {
                var1.next();
                return this.getDefaultFor:log:handler:console:*:async:queue-length(var1);
            }
        } else {
            var1.next();
            return this.getDefaultFor:log:handler:console:*:async:overflow(var1);
        }
    }

    private String getDefaultFor_log_handler_console___darken/* $FF was: getDefaultFor:log:handler:console:*:darken*/(NameIterator var1) {
        return !var1.hasNext() ? "0" : null;
    }

    private String getDefaultFor_log_handler_console___enable/* $FF was: getDefaultFor:log:handler:console:*:enable*/(NameIterator var1) {
        return !var1.hasNext() ? "true" : null;
    }

    private String getDefaultFor_log_handler_console___format/* $FF was: getDefaultFor:log:handler:console:*:format*/(NameIterator var1) {
        return !var1.hasNext() ? "%d{yyyy-MM-dd HH:mm:ss,SSS} %-5p [%c{3.}] (%t) %s%e%n" : null;
    }

    private String getDefaultFor_log_handler_console___level/* $FF was: getDefaultFor:log:handler:console:*:level*/(NameIterator var1) {
        return !var1.hasNext() ? "ALL" : null;
    }

    private String getDefaultFor_log_handler_console__/* $FF was: getDefaultFor:log:handler:console:**/(NameIterator var1) {
        if (!var1.hasNext()) {
            return null;
        } else if (!var1.nextSegmentEquals("async")) {
            if (!var1.nextSegmentEquals("level")) {
                if (!var1.nextSegmentEquals("enable")) {
                    if (!var1.nextSegmentEquals("format")) {
                        if (!var1.nextSegmentEquals("darken")) {
                            return null;
                        } else {
                            var1.next();
                            return this.getDefaultFor:log:handler:console:*:darken(var1);
                        }
                    } else {
                        var1.next();
                        return this.getDefaultFor:log:handler:console:*:format(var1);
                    }
                } else {
                    var1.next();
                    return this.getDefaultFor:log:handler:console:*:enable(var1);
                }
            } else {
                var1.next();
                return this.getDefaultFor:log:handler:console:*:level(var1);
            }
        } else {
            var1.next();
            return this.getDefaultFor:log:handler:console:*:async(var1);
        }
    }

    private String getDefaultFor_log_handler_console/* $FF was: getDefaultFor:log:handler:console*/(NameIterator var1) {
        if (!var1.hasNext()) {
            return null;
        } else if (!var1.hasNext()) {
            return null;
        } else {
            var1.next();
            return this.getDefaultFor:log:handler:console:*(var1);
        }
    }

    private String getDefaultFor_log_handler_file___async_overflow/* $FF was: getDefaultFor:log:handler:file:*:async:overflow*/(NameIterator var1) {
        return !var1.hasNext() ? "block" : null;
    }

    private String getDefaultFor_log_handler_file___async_queue_length/* $FF was: getDefaultFor:log:handler:file:*:async:queue-length*/(NameIterator var1) {
        return !var1.hasNext() ? "512" : null;
    }

    private String getDefaultFor_log_handler_file___async/* $FF was: getDefaultFor:log:handler:file:*:async*/(NameIterator var1) {
        if (!var1.hasNext()) {
            return "false";
        } else if (!var1.nextSegmentEquals("overflow")) {
            if (!var1.nextSegmentEquals("queue-length")) {
                return null;
            } else {
                var1.next();
                return this.getDefaultFor:log:handler:file:*:async:queue-length(var1);
            }
        } else {
            var1.next();
            return this.getDefaultFor:log:handler:file:*:async:overflow(var1);
        }
    }

    private String getDefaultFor_log_handler_file___enable/* $FF was: getDefaultFor:log:handler:file:*:enable*/(NameIterator var1) {
        return !var1.hasNext() ? "false" : null;
    }

    private String getDefaultFor_log_handler_file___format/* $FF was: getDefaultFor:log:handler:file:*:format*/(NameIterator var1) {
        return !var1.hasNext() ? "%d{yyyy-MM-dd HH:mm:ss,SSS} %h %N[%i] %-5p [%c{3.}] (%t) %s%e%n" : null;
    }

    private String getDefaultFor_log_handler_file___level/* $FF was: getDefaultFor:log:handler:file:*:level*/(NameIterator var1) {
        return !var1.hasNext() ? "ALL" : null;
    }

    private String getDefaultFor_log_handler_file___path/* $FF was: getDefaultFor:log:handler:file:*:path*/(NameIterator var1) {
        return !var1.hasNext() ? "quarkus.log" : null;
    }

    private String getDefaultFor_log_handler_file___rotation_max_backup_index/* $FF was: getDefaultFor:log:handler:file:*:rotation:max-backup-index*/(NameIterator var1) {
        return !var1.hasNext() ? "1" : null;
    }

    private String getDefaultFor_log_handler_file___rotation_rotate_on_boot/* $FF was: getDefaultFor:log:handler:file:*:rotation:rotate-on-boot*/(NameIterator var1) {
        return !var1.hasNext() ? "true" : null;
    }

    private String getDefaultFor_log_handler_file___rotation/* $FF was: getDefaultFor:log:handler:file:*:rotation*/(NameIterator var1) {
        if (!var1.hasNext()) {
            return null;
        } else if (!var1.nextSegmentEquals("max-backup-index")) {
            if (!var1.nextSegmentEquals("rotate-on-boot")) {
                return null;
            } else {
                var1.next();
                return this.getDefaultFor:log:handler:file:*:rotation:rotate-on-boot(var1);
            }
        } else {
            var1.next();
            return this.getDefaultFor:log:handler:file:*:rotation:max-backup-index(var1);
        }
    }

    private String getDefaultFor_log_handler_file__/* $FF was: getDefaultFor:log:handler:file:**/(NameIterator var1) {
        if (!var1.hasNext()) {
            return null;
        } else if (!var1.nextSegmentEquals("async")) {
            if (!var1.nextSegmentEquals("path")) {
                if (!var1.nextSegmentEquals("level")) {
                    if (!var1.nextSegmentEquals("enable")) {
                        if (!var1.nextSegmentEquals("rotation")) {
                            if (!var1.nextSegmentEquals("format")) {
                                return null;
                            } else {
                                var1.next();
                                return this.getDefaultFor:log:handler:file:*:format(var1);
                            }
                        } else {
                            var1.next();
                            return this.getDefaultFor:log:handler:file:*:rotation(var1);
                        }
                    } else {
                        var1.next();
                        return this.getDefaultFor:log:handler:file:*:enable(var1);
                    }
                } else {
                    var1.next();
                    return this.getDefaultFor:log:handler:file:*:level(var1);
                }
            } else {
                var1.next();
                return this.getDefaultFor:log:handler:file:*:path(var1);
            }
        } else {
            var1.next();
            return this.getDefaultFor:log:handler:file:*:async(var1);
        }
    }

    private String getDefaultFor_log_handler_file/* $FF was: getDefaultFor:log:handler:file*/(NameIterator var1) {
        if (!var1.hasNext()) {
            return null;
        } else if (!var1.hasNext()) {
            return null;
        } else {
            var1.next();
            return this.getDefaultFor:log:handler:file:*(var1);
        }
    }

    private String getDefaultFor_log_handler_syslog___async_overflow/* $FF was: getDefaultFor:log:handler:syslog:*:async:overflow*/(NameIterator var1) {
        return !var1.hasNext() ? "block" : null;
    }

    private String getDefaultFor_log_handler_syslog___async_queue_length/* $FF was: getDefaultFor:log:handler:syslog:*:async:queue-length*/(NameIterator var1) {
        return !var1.hasNext() ? "512" : null;
    }

    private String getDefaultFor_log_handler_syslog___async/* $FF was: getDefaultFor:log:handler:syslog:*:async*/(NameIterator var1) {
        if (!var1.hasNext()) {
            return "false";
        } else if (!var1.nextSegmentEquals("overflow")) {
            if (!var1.nextSegmentEquals("queue-length")) {
                return null;
            } else {
                var1.next();
                return this.getDefaultFor:log:handler:syslog:*:async:queue-length(var1);
            }
        } else {
            var1.next();
            return this.getDefaultFor:log:handler:syslog:*:async:overflow(var1);
        }
    }

    private String getDefaultFor_log_handler_syslog___block_on_reconnect/* $FF was: getDefaultFor:log:handler:syslog:*:block-on-reconnect*/(NameIterator var1) {
        return !var1.hasNext() ? "false" : null;
    }

    private String getDefaultFor_log_handler_syslog___enable/* $FF was: getDefaultFor:log:handler:syslog:*:enable*/(NameIterator var1) {
        return !var1.hasNext() ? "false" : null;
    }

    private String getDefaultFor_log_handler_syslog___endpoint/* $FF was: getDefaultFor:log:handler:syslog:*:endpoint*/(NameIterator var1) {
        return !var1.hasNext() ? "localhost:514" : null;
    }

    private String getDefaultFor_log_handler_syslog___facility/* $FF was: getDefaultFor:log:handler:syslog:*:facility*/(NameIterator var1) {
        return !var1.hasNext() ? "user-level" : null;
    }

    private String getDefaultFor_log_handler_syslog___format/* $FF was: getDefaultFor:log:handler:syslog:*:format*/(NameIterator var1) {
        return !var1.hasNext() ? "%d{yyyy-MM-dd HH:mm:ss,SSS} %-5p [%c{3.}] (%t) %s%e%n" : null;
    }

    private String getDefaultFor_log_handler_syslog___level/* $FF was: getDefaultFor:log:handler:syslog:*:level*/(NameIterator var1) {
        return !var1.hasNext() ? "ALL" : null;
    }

    private String getDefaultFor_log_handler_syslog___protocol/* $FF was: getDefaultFor:log:handler:syslog:*:protocol*/(NameIterator var1) {
        return !var1.hasNext() ? "tcp" : null;
    }

    private String getDefaultFor_log_handler_syslog___syslog_type/* $FF was: getDefaultFor:log:handler:syslog:*:syslog-type*/(NameIterator var1) {
        return !var1.hasNext() ? "rfc5424" : null;
    }

    private String getDefaultFor_log_handler_syslog___truncate/* $FF was: getDefaultFor:log:handler:syslog:*:truncate*/(NameIterator var1) {
        return !var1.hasNext() ? "true" : null;
    }

    private String getDefaultFor_log_handler_syslog___use_counting_framing/* $FF was: getDefaultFor:log:handler:syslog:*:use-counting-framing*/(NameIterator var1) {
        return !var1.hasNext() ? "false" : null;
    }

    private String getDefaultFor_log_handler_syslog__/* $FF was: getDefaultFor:log:handler:syslog:**/(NameIterator var1) {
        if (!var1.hasNext()) {
            return null;
        } else if (!var1.nextSegmentEquals("async")) {
            if (!var1.nextSegmentEquals("use-counting-framing")) {
                if (!var1.nextSegmentEquals("endpoint")) {
                    if (!var1.nextSegmentEquals("protocol")) {
                        if (!var1.nextSegmentEquals("truncate")) {
                            if (!var1.nextSegmentEquals("level")) {
                                if (!var1.nextSegmentEquals("block-on-reconnect")) {
                                    if (!var1.nextSegmentEquals("enable")) {
                                        if (!var1.nextSegmentEquals("syslog-type")) {
                                            if (!var1.nextSegmentEquals("format")) {
                                                if (!var1.nextSegmentEquals("facility")) {
                                                    return null;
                                                } else {
                                                    var1.next();
                                                    return this.getDefaultFor:log:handler:syslog:*:facility(var1);
                                                }
                                            } else {
                                                var1.next();
                                                return this.getDefaultFor:log:handler:syslog:*:format(var1);
                                            }
                                        } else {
                                            var1.next();
                                            return this.getDefaultFor:log:handler:syslog:*:syslog-type(var1);
                                        }
                                    } else {
                                        var1.next();
                                        return this.getDefaultFor:log:handler:syslog:*:enable(var1);
                                    }
                                } else {
                                    var1.next();
                                    return this.getDefaultFor:log:handler:syslog:*:block-on-reconnect(var1);
                                }
                            } else {
                                var1.next();
                                return this.getDefaultFor:log:handler:syslog:*:level(var1);
                            }
                        } else {
                            var1.next();
                            return this.getDefaultFor:log:handler:syslog:*:truncate(var1);
                        }
                    } else {
                        var1.next();
                        return this.getDefaultFor:log:handler:syslog:*:protocol(var1);
                    }
                } else {
                    var1.next();
                    return this.getDefaultFor:log:handler:syslog:*:endpoint(var1);
                }
            } else {
                var1.next();
                return this.getDefaultFor:log:handler:syslog:*:use-counting-framing(var1);
            }
        } else {
            var1.next();
            return this.getDefaultFor:log:handler:syslog:*:async(var1);
        }
    }

    private String getDefaultFor_log_handler_syslog/* $FF was: getDefaultFor:log:handler:syslog*/(NameIterator var1) {
        if (!var1.hasNext()) {
            return null;
        } else if (!var1.hasNext()) {
            return null;
        } else {
            var1.next();
            return this.getDefaultFor:log:handler:syslog:*(var1);
        }
    }

    private String getDefaultFor_log_handler/* $FF was: getDefaultFor:log:handler*/(NameIterator var1) {
        if (!var1.hasNext()) {
            return null;
        } else if (!var1.nextSegmentEquals("console")) {
            if (!var1.nextSegmentEquals("file")) {
                if (!var1.nextSegmentEquals("syslog")) {
                    return null;
                } else {
                    var1.next();
                    return this.getDefaultFor:log:handler:syslog(var1);
                }
            } else {
                var1.next();
                return this.getDefaultFor:log:handler:file(var1);
            }
        } else {
            var1.next();
            return this.getDefaultFor:log:handler:console(var1);
        }
    }

    private String getDefaultFor_log_level/* $FF was: getDefaultFor:log:level*/(NameIterator var1) {
        return !var1.hasNext() ? "INFO" : null;
    }

    private String getDefaultFor_log_syslog_async_overflow/* $FF was: getDefaultFor:log:syslog:async:overflow*/(NameIterator var1) {
        return !var1.hasNext() ? "block" : null;
    }

    private String getDefaultFor_log_syslog_async_queue_length/* $FF was: getDefaultFor:log:syslog:async:queue-length*/(NameIterator var1) {
        return !var1.hasNext() ? "512" : null;
    }

    private String getDefaultFor_log_syslog_async/* $FF was: getDefaultFor:log:syslog:async*/(NameIterator var1) {
        if (!var1.hasNext()) {
            return "false";
        } else if (!var1.nextSegmentEquals("overflow")) {
            if (!var1.nextSegmentEquals("queue-length")) {
                return null;
            } else {
                var1.next();
                return this.getDefaultFor:log:syslog:async:queue-length(var1);
            }
        } else {
            var1.next();
            return this.getDefaultFor:log:syslog:async:overflow(var1);
        }
    }

    private String getDefaultFor_log_syslog_block_on_reconnect/* $FF was: getDefaultFor:log:syslog:block-on-reconnect*/(NameIterator var1) {
        return !var1.hasNext() ? "false" : null;
    }

    private String getDefaultFor_log_syslog_enable/* $FF was: getDefaultFor:log:syslog:enable*/(NameIterator var1) {
        return !var1.hasNext() ? "false" : null;
    }

    private String getDefaultFor_log_syslog_endpoint/* $FF was: getDefaultFor:log:syslog:endpoint*/(NameIterator var1) {
        return !var1.hasNext() ? "localhost:514" : null;
    }

    private String getDefaultFor_log_syslog_facility/* $FF was: getDefaultFor:log:syslog:facility*/(NameIterator var1) {
        return !var1.hasNext() ? "user-level" : null;
    }

    private String getDefaultFor_log_syslog_format/* $FF was: getDefaultFor:log:syslog:format*/(NameIterator var1) {
        return !var1.hasNext() ? "%d{yyyy-MM-dd HH:mm:ss,SSS} %-5p [%c{3.}] (%t) %s%e%n" : null;
    }

    private String getDefaultFor_log_syslog_level/* $FF was: getDefaultFor:log:syslog:level*/(NameIterator var1) {
        return !var1.hasNext() ? "ALL" : null;
    }

    private String getDefaultFor_log_syslog_protocol/* $FF was: getDefaultFor:log:syslog:protocol*/(NameIterator var1) {
        return !var1.hasNext() ? "tcp" : null;
    }

    private String getDefaultFor_log_syslog_syslog_type/* $FF was: getDefaultFor:log:syslog:syslog-type*/(NameIterator var1) {
        return !var1.hasNext() ? "rfc5424" : null;
    }

    private String getDefaultFor_log_syslog_truncate/* $FF was: getDefaultFor:log:syslog:truncate*/(NameIterator var1) {
        return !var1.hasNext() ? "true" : null;
    }

    private String getDefaultFor_log_syslog_use_counting_framing/* $FF was: getDefaultFor:log:syslog:use-counting-framing*/(NameIterator var1) {
        return !var1.hasNext() ? "false" : null;
    }

    private String getDefaultFor_log_syslog/* $FF was: getDefaultFor:log:syslog*/(NameIterator var1) {
        if (!var1.hasNext()) {
            return null;
        } else if (!var1.nextSegmentEquals("async")) {
            if (!var1.nextSegmentEquals("use-counting-framing")) {
                if (!var1.nextSegmentEquals("endpoint")) {
                    if (!var1.nextSegmentEquals("protocol")) {
                        if (!var1.nextSegmentEquals("truncate")) {
                            if (!var1.nextSegmentEquals("level")) {
                                if (!var1.nextSegmentEquals("block-on-reconnect")) {
                                    if (!var1.nextSegmentEquals("enable")) {
                                        if (!var1.nextSegmentEquals("syslog-type")) {
                                            if (!var1.nextSegmentEquals("format")) {
                                                if (!var1.nextSegmentEquals("facility")) {
                                                    return null;
                                                } else {
                                                    var1.next();
                                                    return this.getDefaultFor:log:syslog:facility(var1);
                                                }
                                            } else {
                                                var1.next();
                                                return this.getDefaultFor:log:syslog:format(var1);
                                            }
                                        } else {
                                            var1.next();
                                            return this.getDefaultFor:log:syslog:syslog-type(var1);
                                        }
                                    } else {
                                        var1.next();
                                        return this.getDefaultFor:log:syslog:enable(var1);
                                    }
                                } else {
                                    var1.next();
                                    return this.getDefaultFor:log:syslog:block-on-reconnect(var1);
                                }
                            } else {
                                var1.next();
                                return this.getDefaultFor:log:syslog:level(var1);
                            }
                        } else {
                            var1.next();
                            return this.getDefaultFor:log:syslog:truncate(var1);
                        }
                    } else {
                        var1.next();
                        return this.getDefaultFor:log:syslog:protocol(var1);
                    }
                } else {
                    var1.next();
                    return this.getDefaultFor:log:syslog:endpoint(var1);
                }
            } else {
                var1.next();
                return this.getDefaultFor:log:syslog:use-counting-framing(var1);
            }
        } else {
            var1.next();
            return this.getDefaultFor:log:syslog:async(var1);
        }
    }

    private String getDefaultFor_log/* $FF was: getDefaultFor:log*/(NameIterator var1) {
        if (!var1.hasNext()) {
            return null;
        } else if (!var1.nextSegmentEquals("filter")) {
            if (!var1.nextSegmentEquals("console")) {
                if (!var1.nextSegmentEquals("handler")) {
                    if (!var1.nextSegmentEquals("file")) {
                        if (!var1.nextSegmentEquals("level")) {
                            if (!var1.nextSegmentEquals("syslog")) {
                                if (!var1.nextSegmentEquals("category")) {
                                    return null;
                                } else {
                                    var1.next();
                                    return this.getDefaultFor:log:category(var1);
                                }
                            } else {
                                var1.next();
                                return this.getDefaultFor:log:syslog(var1);
                            }
                        } else {
                            var1.next();
                            return this.getDefaultFor:log:level(var1);
                        }
                    } else {
                        var1.next();
                        return this.getDefaultFor:log:file(var1);
                    }
                } else {
                    var1.next();
                    return this.getDefaultFor:log:handler(var1);
                }
            } else {
                var1.next();
                return this.getDefaultFor:log:console(var1);
            }
        } else {
            var1.next();
            return this.getDefaultFor:log:filter(var1);
        }
    }

    private String getDefaultFor_thread_pool_core_threads/* $FF was: getDefaultFor:thread-pool:core-threads*/(NameIterator var1) {
        return !var1.hasNext() ? "1" : null;
    }

    private String getDefaultFor_thread_pool_growth_resistance/* $FF was: getDefaultFor:thread-pool:growth-resistance*/(NameIterator var1) {
        return !var1.hasNext() ? "0" : null;
    }

    private String getDefaultFor_thread_pool_keep_alive_time/* $FF was: getDefaultFor:thread-pool:keep-alive-time*/(NameIterator var1) {
        return !var1.hasNext() ? "30" : null;
    }

    private String getDefaultFor_thread_pool_prefill/* $FF was: getDefaultFor:thread-pool:prefill*/(NameIterator var1) {
        return !var1.hasNext() ? "true" : null;
    }

    private String getDefaultFor_thread_pool_shutdown_check_interval/* $FF was: getDefaultFor:thread-pool:shutdown-check-interval*/(NameIterator var1) {
        return !var1.hasNext() ? "5" : null;
    }

    private String getDefaultFor_thread_pool_shutdown_interrupt/* $FF was: getDefaultFor:thread-pool:shutdown-interrupt*/(NameIterator var1) {
        return !var1.hasNext() ? "10" : null;
    }

    private String getDefaultFor_thread_pool_shutdown_timeout/* $FF was: getDefaultFor:thread-pool:shutdown-timeout*/(NameIterator var1) {
        return !var1.hasNext() ? "1M" : null;
    }

    private String getDefaultFor_thread_pool/* $FF was: getDefaultFor:thread-pool*/(NameIterator var1) {
        if (!var1.hasNext()) {
            return null;
        } else if (!var1.nextSegmentEquals("growth-resistance")) {
            if (!var1.nextSegmentEquals("prefill")) {
                if (!var1.nextSegmentEquals("shutdown-timeout")) {
                    if (!var1.nextSegmentEquals("shutdown-interrupt")) {
                        if (!var1.nextSegmentEquals("core-threads")) {
                            if (!var1.nextSegmentEquals("keep-alive-time")) {
                                if (!var1.nextSegmentEquals("shutdown-check-interval")) {
                                    return null;
                                } else {
                                    var1.next();
                                    return this.getDefaultFor:thread-pool:shutdown-check-interval(var1);
                                }
                            } else {
                                var1.next();
                                return this.getDefaultFor:thread-pool:keep-alive-time(var1);
                            }
                        } else {
                            var1.next();
                            return this.getDefaultFor:thread-pool:core-threads(var1);
                        }
                    } else {
                        var1.next();
                        return this.getDefaultFor:thread-pool:shutdown-interrupt(var1);
                    }
                } else {
                    var1.next();
                    return this.getDefaultFor:thread-pool:shutdown-timeout(var1);
                }
            } else {
                var1.next();
                return this.getDefaultFor:thread-pool:prefill(var1);
            }
        } else {
            var1.next();
            return this.getDefaultFor:thread-pool:growth-resistance(var1);
        }
    }

    private String getDefaultFor_vertx_caching/* $FF was: getDefaultFor:vertx:caching*/(NameIterator var1) {
        return !var1.hasNext() ? "true" : null;
    }

    private String getDefaultFor_vertx_classpath_resolving/* $FF was: getDefaultFor:vertx:classpath-resolving*/(NameIterator var1) {
        return !var1.hasNext() ? "true" : null;
    }

    private String getDefaultFor_vertx_cluster_clustered/* $FF was: getDefaultFor:vertx:cluster:clustered*/(NameIterator var1) {
        return !var1.hasNext() ? "false" : null;
    }

    private String getDefaultFor_vertx_cluster_host/* $FF was: getDefaultFor:vertx:cluster:host*/(NameIterator var1) {
        return !var1.hasNext() ? "localhost" : null;
    }

    private String getDefaultFor_vertx_cluster_ping_interval/* $FF was: getDefaultFor:vertx:cluster:ping-interval*/(NameIterator var1) {
        return !var1.hasNext() ? "20" : null;
    }

    private String getDefaultFor_vertx_cluster_ping_reply_interval/* $FF was: getDefaultFor:vertx:cluster:ping-reply-interval*/(NameIterator var1) {
        return !var1.hasNext() ? "20" : null;
    }

    private String getDefaultFor_vertx_cluster/* $FF was: getDefaultFor:vertx:cluster*/(NameIterator var1) {
        if (!var1.hasNext()) {
            return null;
        } else if (!var1.nextSegmentEquals("ping-reply-interval")) {
            if (!var1.nextSegmentEquals("clustered")) {
                if (!var1.nextSegmentEquals("host")) {
                    if (!var1.nextSegmentEquals("ping-interval")) {
                        return null;
                    } else {
                        var1.next();
                        return this.getDefaultFor:vertx:cluster:ping-interval(var1);
                    }
                } else {
                    var1.next();
                    return this.getDefaultFor:vertx:cluster:host(var1);
                }
            } else {
                var1.next();
                return this.getDefaultFor:vertx:cluster:clustered(var1);
            }
        } else {
            var1.next();
            return this.getDefaultFor:vertx:cluster:ping-reply-interval(var1);
        }
    }

    private String getDefaultFor_vertx_eventbus_client_auth/* $FF was: getDefaultFor:vertx:eventbus:client-auth*/(NameIterator var1) {
        return !var1.hasNext() ? "NONE" : null;
    }

    private String getDefaultFor_vertx_eventbus_connect_timeout/* $FF was: getDefaultFor:vertx:eventbus:connect-timeout*/(NameIterator var1) {
        return !var1.hasNext() ? "60" : null;
    }

    private String getDefaultFor_vertx_eventbus_key_certificate_jks/* $FF was: getDefaultFor:vertx:eventbus:key-certificate-jks*/(NameIterator var1) {
        return !var1.hasNext() ? "false" : null;
    }

    private String getDefaultFor_vertx_eventbus_key_certificate_pem/* $FF was: getDefaultFor:vertx:eventbus:key-certificate-pem*/(NameIterator var1) {
        return !var1.hasNext() ? "false" : null;
    }

    private String getDefaultFor_vertx_eventbus_key_certificate_pfx/* $FF was: getDefaultFor:vertx:eventbus:key-certificate-pfx*/(NameIterator var1) {
        return !var1.hasNext() ? "false" : null;
    }

    private String getDefaultFor_vertx_eventbus_reconnect_attempts/* $FF was: getDefaultFor:vertx:eventbus:reconnect-attempts*/(NameIterator var1) {
        return !var1.hasNext() ? "0" : null;
    }

    private String getDefaultFor_vertx_eventbus_reconnect_interval/* $FF was: getDefaultFor:vertx:eventbus:reconnect-interval*/(NameIterator var1) {
        return !var1.hasNext() ? "1" : null;
    }

    private String getDefaultFor_vertx_eventbus_reuse_address/* $FF was: getDefaultFor:vertx:eventbus:reuse-address*/(NameIterator var1) {
        return !var1.hasNext() ? "true" : null;
    }

    private String getDefaultFor_vertx_eventbus_reuse_port/* $FF was: getDefaultFor:vertx:eventbus:reuse-port*/(NameIterator var1) {
        return !var1.hasNext() ? "false" : null;
    }

    private String getDefaultFor_vertx_eventbus_ssl/* $FF was: getDefaultFor:vertx:eventbus:ssl*/(NameIterator var1) {
        return !var1.hasNext() ? "false" : null;
    }

    private String getDefaultFor_vertx_eventbus_tcp_keep_alive/* $FF was: getDefaultFor:vertx:eventbus:tcp-keep-alive*/(NameIterator var1) {
        return !var1.hasNext() ? "false" : null;
    }

    private String getDefaultFor_vertx_eventbus_tcp_no_delay/* $FF was: getDefaultFor:vertx:eventbus:tcp-no-delay*/(NameIterator var1) {
        return !var1.hasNext() ? "true" : null;
    }

    private String getDefaultFor_vertx_eventbus_trust_all/* $FF was: getDefaultFor:vertx:eventbus:trust-all*/(NameIterator var1) {
        return !var1.hasNext() ? "false" : null;
    }

    private String getDefaultFor_vertx_eventbus_trust_certificate_jks/* $FF was: getDefaultFor:vertx:eventbus:trust-certificate-jks*/(NameIterator var1) {
        return !var1.hasNext() ? "false" : null;
    }

    private String getDefaultFor_vertx_eventbus_trust_certificate_pem/* $FF was: getDefaultFor:vertx:eventbus:trust-certificate-pem*/(NameIterator var1) {
        return !var1.hasNext() ? "false" : null;
    }

    private String getDefaultFor_vertx_eventbus_trust_certificate_pfx/* $FF was: getDefaultFor:vertx:eventbus:trust-certificate-pfx*/(NameIterator var1) {
        return !var1.hasNext() ? "false" : null;
    }

    private String getDefaultFor_vertx_eventbus/* $FF was: getDefaultFor:vertx:eventbus*/(NameIterator var1) {
        if (!var1.hasNext()) {
            return null;
        } else if (!var1.nextSegmentEquals("key-certificate-jks")) {
            if (!var1.nextSegmentEquals("reuse-address")) {
                if (!var1.nextSegmentEquals("trust-certificate-jks")) {
                    if (!var1.nextSegmentEquals("reuse-port")) {
                        if (!var1.nextSegmentEquals("tcp-no-delay")) {
                            if (!var1.nextSegmentEquals("reconnect-attempts")) {
                                if (!var1.nextSegmentEquals("trust-certificate-pem")) {
                                    if (!var1.nextSegmentEquals("reconnect-interval")) {
                                        if (!var1.nextSegmentEquals("ssl")) {
                                            if (!var1.nextSegmentEquals("connect-timeout")) {
                                                if (!var1.nextSegmentEquals("key-certificate-pfx")) {
                                                    if (!var1.nextSegmentEquals("client-auth")) {
                                                        if (!var1.nextSegmentEquals("trust-certificate-pfx")) {
                                                            if (!var1.nextSegmentEquals("key-certificate-pem")) {
                                                                if (!var1.nextSegmentEquals("trust-all")) {
                                                                    if (!var1.nextSegmentEquals("tcp-keep-alive")) {
                                                                        return null;
                                                                    } else {
                                                                        var1.next();
                                                                        return this.getDefaultFor:vertx:eventbus:tcp-keep-alive(var1);
                                                                    }
                                                                } else {
                                                                    var1.next();
                                                                    return this.getDefaultFor:vertx:eventbus:trust-all(var1);
                                                                }
                                                            } else {
                                                                var1.next();
                                                                return this.getDefaultFor:vertx:eventbus:key-certificate-pem(var1);
                                                            }
                                                        } else {
                                                            var1.next();
                                                            return this.getDefaultFor:vertx:eventbus:trust-certificate-pfx(var1);
                                                        }
                                                    } else {
                                                        var1.next();
                                                        return this.getDefaultFor:vertx:eventbus:client-auth(var1);
                                                    }
                                                } else {
                                                    var1.next();
                                                    return this.getDefaultFor:vertx:eventbus:key-certificate-pfx(var1);
                                                }
                                            } else {
                                                var1.next();
                                                return this.getDefaultFor:vertx:eventbus:connect-timeout(var1);
                                            }
                                        } else {
                                            var1.next();
                                            return this.getDefaultFor:vertx:eventbus:ssl(var1);
                                        }
                                    } else {
                                        var1.next();
                                        return this.getDefaultFor:vertx:eventbus:reconnect-interval(var1);
                                    }
                                } else {
                                    var1.next();
                                    return this.getDefaultFor:vertx:eventbus:trust-certificate-pem(var1);
                                }
                            } else {
                                var1.next();
                                return this.getDefaultFor:vertx:eventbus:reconnect-attempts(var1);
                            }
                        } else {
                            var1.next();
                            return this.getDefaultFor:vertx:eventbus:tcp-no-delay(var1);
                        }
                    } else {
                        var1.next();
                        return this.getDefaultFor:vertx:eventbus:reuse-port(var1);
                    }
                } else {
                    var1.next();
                    return this.getDefaultFor:vertx:eventbus:trust-certificate-jks(var1);
                }
            } else {
                var1.next();
                return this.getDefaultFor:vertx:eventbus:reuse-address(var1);
            }
        } else {
            var1.next();
            return this.getDefaultFor:vertx:eventbus:key-certificate-jks(var1);
        }
    }

    private String getDefaultFor_vertx_internal_blocking_pool_size/* $FF was: getDefaultFor:vertx:internal-blocking-pool-size*/(NameIterator var1) {
        return !var1.hasNext() ? "20" : null;
    }

    private String getDefaultFor_vertx_max_event_loop_execute_time/* $FF was: getDefaultFor:vertx:max-event-loop-execute-time*/(NameIterator var1) {
        return !var1.hasNext() ? "2" : null;
    }

    private String getDefaultFor_vertx_max_worker_execute_time/* $FF was: getDefaultFor:vertx:max-worker-execute-time*/(NameIterator var1) {
        return !var1.hasNext() ? "60" : null;
    }

    private String getDefaultFor_vertx_prefer_native_transport/* $FF was: getDefaultFor:vertx:prefer-native-transport*/(NameIterator var1) {
        return !var1.hasNext() ? "false" : null;
    }

    private String getDefaultFor_vertx_resolver_cache_max_time_to_live/* $FF was: getDefaultFor:vertx:resolver:cache-max-time-to-live*/(NameIterator var1) {
        return !var1.hasNext() ? "2147483647" : null;
    }

    private String getDefaultFor_vertx_resolver_cache_min_time_to_live/* $FF was: getDefaultFor:vertx:resolver:cache-min-time-to-live*/(NameIterator var1) {
        return !var1.hasNext() ? "0" : null;
    }

    private String getDefaultFor_vertx_resolver_cache_negative_time_to_live/* $FF was: getDefaultFor:vertx:resolver:cache-negative-time-to-live*/(NameIterator var1) {
        return !var1.hasNext() ? "0" : null;
    }

    private String getDefaultFor_vertx_resolver/* $FF was: getDefaultFor:vertx:resolver*/(NameIterator var1) {
        if (!var1.hasNext()) {
            return null;
        } else if (!var1.nextSegmentEquals("cache-max-time-to-live")) {
            if (!var1.nextSegmentEquals("cache-min-time-to-live")) {
                if (!var1.nextSegmentEquals("cache-negative-time-to-live")) {
                    return null;
                } else {
                    var1.next();
                    return this.getDefaultFor:vertx:resolver:cache-negative-time-to-live(var1);
                }
            } else {
                var1.next();
                return this.getDefaultFor:vertx:resolver:cache-min-time-to-live(var1);
            }
        } else {
            var1.next();
            return this.getDefaultFor:vertx:resolver:cache-max-time-to-live(var1);
        }
    }

    private String getDefaultFor_vertx_use_async_dns/* $FF was: getDefaultFor:vertx:use-async-dns*/(NameIterator var1) {
        return !var1.hasNext() ? "false" : null;
    }

    private String getDefaultFor_vertx_warning_exception_time/* $FF was: getDefaultFor:vertx:warning-exception-time*/(NameIterator var1) {
        return !var1.hasNext() ? "2" : null;
    }

    private String getDefaultFor_vertx_worker_pool_size/* $FF was: getDefaultFor:vertx:worker-pool-size*/(NameIterator var1) {
        return !var1.hasNext() ? "20" : null;
    }

    private String getDefaultFor_vertx/* $FF was: getDefaultFor:vertx*/(NameIterator var1) {
        if (!var1.hasNext()) {
            return null;
        } else if (!var1.nextSegmentEquals("warning-exception-time")) {
            if (!var1.nextSegmentEquals("cluster")) {
                if (!var1.nextSegmentEquals("resolver")) {
                    if (!var1.nextSegmentEquals("worker-pool-size")) {
                        if (!var1.nextSegmentEquals("eventbus")) {
                            if (!var1.nextSegmentEquals("max-worker-execute-time")) {
                                if (!var1.nextSegmentEquals("prefer-native-transport")) {
                                    if (!var1.nextSegmentEquals("internal-blocking-pool-size")) {
                                        if (!var1.nextSegmentEquals("max-event-loop-execute-time")) {
                                            if (!var1.nextSegmentEquals("classpath-resolving")) {
                                                if (!var1.nextSegmentEquals("use-async-dns")) {
                                                    if (!var1.nextSegmentEquals("caching")) {
                                                        return null;
                                                    } else {
                                                        var1.next();
                                                        return this.getDefaultFor:vertx:caching(var1);
                                                    }
                                                } else {
                                                    var1.next();
                                                    return this.getDefaultFor:vertx:use-async-dns(var1);
                                                }
                                            } else {
                                                var1.next();
                                                return this.getDefaultFor:vertx:classpath-resolving(var1);
                                            }
                                        } else {
                                            var1.next();
                                            return this.getDefaultFor:vertx:max-event-loop-execute-time(var1);
                                        }
                                    } else {
                                        var1.next();
                                        return this.getDefaultFor:vertx:internal-blocking-pool-size(var1);
                                    }
                                } else {
                                    var1.next();
                                    return this.getDefaultFor:vertx:prefer-native-transport(var1);
                                }
                            } else {
                                var1.next();
                                return this.getDefaultFor:vertx:max-worker-execute-time(var1);
                            }
                        } else {
                            var1.next();
                            return this.getDefaultFor:vertx:eventbus(var1);
                        }
                    } else {
                        var1.next();
                        return this.getDefaultFor:vertx:worker-pool-size(var1);
                    }
                } else {
                    var1.next();
                    return this.getDefaultFor:vertx:resolver(var1);
                }
            } else {
                var1.next();
                return this.getDefaultFor:vertx:cluster(var1);
            }
        } else {
            var1.next();
            return this.getDefaultFor:vertx:warning-exception-time(var1);
        }
    }

    private String getDefaultFor(NameIterator var1) {
        if (!var1.hasNext()) {
            return null;
        } else if (!var1.nextSegmentEquals("configuration")) {
            if (!var1.nextSegmentEquals("log")) {
                if (!var1.nextSegmentEquals("banner")) {
                    if (!var1.nextSegmentEquals("http")) {
                        if (!var1.nextSegmentEquals("thread-pool")) {
                            if (!var1.nextSegmentEquals("vertx")) {
                                return null;
                            } else {
                                var1.next();
                                return this.getDefaultFor:vertx(var1);
                            }
                        } else {
                            var1.next();
                            return this.getDefaultFor:thread-pool(var1);
                        }
                    } else {
                        var1.next();
                        return this.getDefaultFor:http(var1);
                    }
                } else {
                    var1.next();
                    return this.getDefaultFor:banner(var1);
                }
            } else {
                var1.next();
                return this.getDefaultFor:log(var1);
            }
        } else {
            var1.next();
            return this.getDefaultFor:configuration(var1);
        }
    }
}
