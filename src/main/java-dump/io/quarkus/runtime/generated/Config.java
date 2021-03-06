//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package io.quarkus.runtime.generated;

import io.quarkus.resteasy.runtime.JaxRsSecurityConfig;
import io.quarkus.runtime.ApplicationConfig;
import io.quarkus.runtime.BannerRuntimeConfig;
import io.quarkus.runtime.CommandLineRuntimeConfig;
import io.quarkus.runtime.LiveReloadConfig;
import io.quarkus.runtime.LocalesBuildTimeConfig;
import io.quarkus.runtime.ThreadPoolConfig;
import io.quarkus.runtime.TlsConfig;
import io.quarkus.runtime.TopLevelRootConfig;
import io.quarkus.runtime.configuration.ConfigDiagnostic;
import io.quarkus.runtime.configuration.ConfigUtils;
import io.quarkus.runtime.configuration.ConfigurationException;
import io.quarkus.runtime.configuration.ConfigurationRuntimeConfig;
import io.quarkus.runtime.configuration.HyphenateEnumConverter;
import io.quarkus.runtime.configuration.MemorySize;
import io.quarkus.runtime.configuration.NameIterator;
import io.quarkus.runtime.configuration.ProfileManager;
import io.quarkus.runtime.configuration.QuarkusConfigFactory;
import io.quarkus.runtime.configuration.TrimmedStringConverter;
import io.quarkus.runtime.configuration.ConfigurationRuntimeConfig.BuildTimeMismatchAtRuntime;
import io.quarkus.runtime.logging.AsyncConfig;
import io.quarkus.runtime.logging.CategoryBuildTimeConfig;
import io.quarkus.runtime.logging.CategoryConfig;
import io.quarkus.runtime.logging.CleanupFilterConfig;
import io.quarkus.runtime.logging.ConsoleConfig;
import io.quarkus.runtime.logging.FileConfig;
import io.quarkus.runtime.logging.InheritableLevel;
import io.quarkus.runtime.logging.LogBuildTimeConfig;
import io.quarkus.runtime.logging.LogConfig;
import io.quarkus.runtime.logging.SyslogConfig;
import io.quarkus.runtime.logging.CategoryConfig..accessor;
import io.quarkus.runtime.logging.FileConfig.RotationConfig;
import io.quarkus.runtime.shutdown.ShutdownConfig;
import io.quarkus.vertx.core.runtime.config.AddressResolverConfiguration;
import io.quarkus.vertx.core.runtime.config.ClusterConfiguration;
import io.quarkus.vertx.core.runtime.config.EventBusConfiguration;
import io.quarkus.vertx.core.runtime.config.JksConfiguration;
import io.quarkus.vertx.core.runtime.config.PemKeyCertConfiguration;
import io.quarkus.vertx.core.runtime.config.PemTrustCertConfiguration;
import io.quarkus.vertx.core.runtime.config.PfxConfiguration;
import io.quarkus.vertx.core.runtime.config.VertxConfiguration;
import io.quarkus.vertx.http.runtime.AccessLogConfig;
import io.quarkus.vertx.http.runtime.AuthConfig;
import io.quarkus.vertx.http.runtime.BodyConfig;
import io.quarkus.vertx.http.runtime.CertificateConfig;
import io.quarkus.vertx.http.runtime.FormAuthConfig;
import io.quarkus.vertx.http.runtime.HttpBuildTimeConfig;
import io.quarkus.vertx.http.runtime.HttpConfiguration;
import io.quarkus.vertx.http.runtime.PolicyConfig;
import io.quarkus.vertx.http.runtime.PolicyMappingConfig;
import io.quarkus.vertx.http.runtime.ProxyConfig;
import io.quarkus.vertx.http.runtime.SameSiteCookieConfig;
import io.quarkus.vertx.http.runtime.ServerLimitsConfig;
import io.quarkus.vertx.http.runtime.ServerSslConfig;
import io.quarkus.vertx.http.runtime.HttpConfiguration.InsecureRequests;
import io.quarkus.vertx.http.runtime.cors.CORSConfig;
import io.smallrye.config.Converters;
import io.smallrye.config.PropertiesConfigSource;
import io.smallrye.config.SmallRyeConfig;
import io.smallrye.config.SmallRyeConfigBuilder;
import io.vertx.core.http.ClientAuth;
import io.vertx.core.http.CookieSameSite;
import java.io.File;
import java.net.InetSocketAddress;
import java.nio.file.Path;
import java.time.Duration;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.Set;
import java.util.TreeMap;
import java.util.function.IntFunction;
import java.util.logging.Level;
import org.eclipse.microprofile.config.spi.ConfigProviderResolver;
import org.eclipse.microprofile.config.spi.ConfigSource;
import org.eclipse.microprofile.config.spi.ConfigSourceProvider;
import org.eclipse.microprofile.config.spi.Converter;
import org.jboss.logmanager.handlers.AsyncHandler.OverflowAction;
import org.jboss.logmanager.handlers.SyslogHandler.Facility;
import org.jboss.logmanager.handlers.SyslogHandler.Protocol;
import org.jboss.logmanager.handlers.SyslogHandler.SyslogType;

// $FF: synthetic class
public final class Config {
    public static volatile Config INSTANCE;
    public static final ConfigSource buildTimeConfigSource;
    public static final ConfigSource buildTimeRunTimeDefaultsConfigSource;
    public static final ConfigSource runTimeDefaultsConfigSource;
    static final Converter conv$1;
    static final Converter conv$0;
    static final Converter conv$2;
    static final Converter conv$4;
    static final Converter conv$3;
    static final Converter conv$6;
    static final Converter conv$5;
    static final Converter conv$7;
    static final Converter conv$8;
    static final Converter conv$9;
    static final Converter conv$10;
    static final Converter conv$11;
    static final Converter conv$12;
    static final Converter conv$13;
    static final Converter conv$15;
    static final Converter conv$14;
    static final Converter conv$16;
    static final Converter conv$17;
    static final Converter conv$18;
    static final Converter conv$19;
    static final Converter conv$20;
    static volatile ConfigSource specifiedRunTimeConfigSource;
    static final Converter conv$21;
    static final Converter conv$22;
    public static volatile HttpBuildTimeConfig HttpBuildTimeConfig;
    public static volatile JaxRsSecurityConfig JaxRsSecurityConfig;
    public static volatile ApplicationConfig ApplicationConfig;
    public static volatile LiveReloadConfig LiveReloadConfig;
    static final Converter conv$24;
    static final Converter conv$23;
    public static volatile LocalesBuildTimeConfig LocalesBuildTimeConfig;
    public static volatile TlsConfig TlsConfig;
    public static volatile LogBuildTimeConfig LogBuildTimeConfig;
    static final Converter conv$25;
    static final Converter conv$26;
    public static volatile VertxConfiguration VertxConfiguration;
    static final Converter conv$27;
    static final Converter conv$28;
    static final Converter conv$30;
    static final Converter conv$29;
    public static volatile HttpConfiguration HttpConfiguration;
    public static volatile BannerRuntimeConfig BannerRuntimeConfig;
    public static volatile CommandLineRuntimeConfig CommandLineRuntimeConfig;
    static final Converter conv$31;
    public static volatile ThreadPoolConfig ThreadPoolConfig;
    public static volatile TopLevelRootConfig TopLevelRootConfig;
    static final Converter conv$32;
    public static volatile ConfigurationRuntimeConfig ConfigurationRuntimeConfig;
    public static volatile LogConfig LogConfig;
    public static volatile ShutdownConfig ShutdownConfig;

    private static void rtEmptyParseKey(SmallRyeConfig var0, NameIterator var1) {
        if (var1.hasNext()) {
            ConfigDiagnostic.unknownRunTime(var1);
        }
    }

    private static void emptyParseKey(SmallRyeConfig var0, NameIterator var1) {
        if (var1.hasNext()) {
            ConfigDiagnostic.unknown(var1);
        }
    }

    private Config() {
    }

    public static void reinit() {
        ConfigSource var3 = buildTimeRunTimeDefaultsConfigSource;
        HashMap var0 = new HashMap();
        var0.put("quarkus.application.name", "quarkus-code-dump");
        var0.put("quarkus.application.version", "1.0-SNAPSHOT");
        PropertiesConfigSource var1 = new PropertiesConfigSource((Map)var0, "Build time config = Reloaded", 100);
        SmallRyeConfigBuilder var4 = ConfigUtils.configBuilder((boolean)1);
        ConfigSource[] var2 = new ConfigSource[]{(ConfigSource)var1, var3};
        var4.withSources(var2);
        QuarkusConfigFactory.setConfig(var4.build());
        ConfigProviderResolver var5 = ConfigProviderResolver.instance();

        try {
            org.eclipse.microprofile.config.Config var6 = var5.getConfig();
            var5.releaseConfig(var6);
        } catch (IllegalStateException var7) {
        }

    }

    static {
        ProfileManager.setRuntimeDefaultProfile("dev");
        StringBuilder var24 = new StringBuilder();
        var24.append("quarkus");
        HashMap var0 = new HashMap();
        var0.put("quarkus.application.name", "quarkus-code-dump");
        var0.put("quarkus.application.version", "1.0-SNAPSHOT");
        PropertiesConfigSource var1 = new PropertiesConfigSource((Map)var0, "Build time config", 100);
        buildTimeConfigSource = (ConfigSource)var1;
        BuildTimeRunTimeDefaultValuesConfigSource var3 = new BuildTimeRunTimeDefaultValuesConfigSource();
        buildTimeRunTimeDefaultsConfigSource = (ConfigSource)var3;
        runTimeDefaultsConfigSource = (ConfigSource)(new RunTimeDefaultValuesConfigSource());
        SmallRyeConfigBuilder var4 = ConfigUtils.configBuilder((boolean)1);
        ConfigSource[] var2 = new ConfigSource[]{(ConfigSource)var1, (ConfigSource)var3};
        var4.withSources(var2);
        SmallRyeConfig var5 = var4.build();
        Converter var6 = var5.getConverter(Boolean.class);
        conv$1 = var6;
        conv$0 = Converters.newOptionalConverter(var6);
        Converter var7 = var5.getConverter(String.class);
        conv$2 = var7;
        IntFunction var8 = ConfigUtils.listFactory();
        Converter var9 = Converters.newCollectionConverter(var7, var8);
        conv$4 = var9;
        conv$3 = Converters.newOptionalConverter(var9);
        TrimmedStringConverter var10 = new TrimmedStringConverter();
        conv$6 = (Converter)var10;
        IntFunction var11 = ConfigUtils.listFactory();
        Converter var18 = Converters.newCollectionConverter((Converter)var10, var11);
        conv$5 = var18;
        conv$7 = var5.getConverter(InheritableLevel.class);
        Class var12 = Boolean.TYPE;
        conv$8 = var5.getConverter(var12);
        conv$9 = (Converter)(new HyphenateEnumConverter(CookieSameSite.class));
        conv$10 = var5.getConverter(Level.class);
        Class var13 = Integer.TYPE;
        conv$11 = var5.getConverter(var13);
        conv$12 = (Converter)(new HyphenateEnumConverter(OverflowAction.class));
        conv$13 = var5.getConverter(File.class);
        Converter var14 = var5.getConverter(MemorySize.class);
        conv$15 = var14;
        conv$14 = Converters.newOptionalConverter(var14);
        conv$16 = Converters.newOptionalConverter(var7);
        conv$17 = var5.getConverter(InetSocketAddress.class);
        conv$18 = (Converter)(new HyphenateEnumConverter(Facility.class));
        conv$19 = (Converter)(new HyphenateEnumConverter(SyslogType.class));
        conv$20 = (Converter)(new HyphenateEnumConverter(Protocol.class));
        Converter var17 = var5.getConverter(Duration.class);
        conv$21 = var17;
        conv$22 = (Converter)(new HyphenateEnumConverter(ClientAuth.class));
        Converter var15 = var5.getConverter(Locale.class);
        conv$24 = var15;
        IntFunction var16 = ConfigUtils.setFactory();
        conv$23 = Converters.newCollectionConverter(var15, var16);
        conv$25 = var5.getConverter(OptionalInt.class);
        conv$26 = Converters.newOptionalConverter(var17);
        conv$27 = (Converter)(new HyphenateEnumConverter(InsecureRequests.class));
        conv$28 = Converters.newOptionalConverter(var18);
        Converter var19 = var5.getConverter(Path.class);
        conv$30 = var19;
        conv$29 = Converters.newOptionalConverter(var19);
        Class var20 = Float.TYPE;
        conv$31 = var5.getConverter(var20);
        conv$32 = (Converter)(new HyphenateEnumConverter(BuildTimeMismatchAtRuntime.class));
        QuarkusConfigFactory.setConfig(var5);
        ConfigProviderResolver var21 = ConfigProviderResolver.instance();

        try {
            org.eclipse.microprofile.config.Config var22 = var21.getConfig();
            var21.releaseConfig(var22);
        } catch (IllegalStateException var36) {
        }

        HashMap var23 = new HashMap();
        var23.put("quarkus.log.filter.\"io.netty.util.internal.PlatformDependent0\".target-level", "TRACE");
        var23.put("quarkus.log.category.\"io.vertx.core.http.impl.HttpServerRequestImpl\".level", "OFF");
        var23.put("quarkus.log.console.darken", "0");
        var23.put("quarkus.log.filter.\"io.netty.util.internal.PlatformDependent0\".if-starts-with", "direct buffer constructor,jdk.internal.misc.Unsafe,sun.misc.Unsafe");
        var23.put("quarkus.log.filter.\"org.jboss.resteasy.resteasy_jaxrs.i18n\".if-starts-with", "RESTEASY002225");
        var23.put("quarkus.log.filter.\"org.jboss.threads\".if-starts-with", "JBoss Threads version");
        var23.put("quarkus.profile", "dev");
        var23.put("quarkus.log.filter.\"io.vertx.core.impl.VertxImpl\".if-starts-with", "You're already on a Vert.x context\\, are you sure you want to create a new Vertx instance");
        var23.put("quarkus.log.filter.\"io.netty.resolver.HostsFileParser\".if-starts-with", "Failed to load and parse hosts file");
        specifiedRunTimeConfigSource = (ConfigSource)(new PropertiesConfigSource((Map)var23, "Specified default values", -2147483548));
        int var26 = var24.length();
        HttpBuildTimeConfig var25 = new HttpBuildTimeConfig();
        HttpBuildTimeConfig = var25;
        var24.append('.');
        var24.append("http");
        initGroup$io$quarkus$vertx$http$runtime$HttpBuildTimeConfig(var5, var24, var25);
        var24.setLength(var26);
        JaxRsSecurityConfig var27 = new JaxRsSecurityConfig();
        JaxRsSecurityConfig = var27;
        var24.append('.');
        var24.append("security.jaxrs");
        initGroup$io$quarkus$resteasy$runtime$JaxRsSecurityConfig(var5, var24, var27);
        var24.setLength(var26);
        ApplicationConfig var28 = new ApplicationConfig();
        ApplicationConfig = var28;
        var24.append('.');
        var24.append("application");
        initGroup$io$quarkus$runtime$ApplicationConfig(var5, var24, var28);
        var24.setLength(var26);
        LiveReloadConfig var29 = new LiveReloadConfig();
        LiveReloadConfig = var29;
        var24.append('.');
        var24.append("live-reload");
        initGroup$io$quarkus$runtime$LiveReloadConfig(var5, var24, var29);
        var24.setLength(var26);
        LocalesBuildTimeConfig var30 = new LocalesBuildTimeConfig();
        LocalesBuildTimeConfig = var30;
        initGroup$io$quarkus$runtime$LocalesBuildTimeConfig(var5, var24, var30);
        var24.setLength(var26);
        TlsConfig var31 = new TlsConfig();
        TlsConfig = var31;
        var24.append('.');
        var24.append("tls");
        initGroup$io$quarkus$runtime$TlsConfig(var5, var24, var31);
        var24.setLength(var26);
        LogBuildTimeConfig var32 = new LogBuildTimeConfig();
        LogBuildTimeConfig = var32;
        var24.append('.');
        var24.append("log");
        initGroup$io$quarkus$runtime$logging$LogBuildTimeConfig(var5, var24, var32);
        var24.setLength(var26);
        Iterator var33 = var5.getPropertyNames().iterator();

        while(var33.hasNext()) {
            String var34 = (String)var33.next();
            NameIterator var35 = new NameIterator(var34);
            if (var35.hasNext() && var35.nextSegmentEquals("quarkus")) {
                var35.next();
                siParseKey(var5, var35);
            }
        }

    }

    public void readBootstrapConfig() {
    }

    public void readConfig(List var1) {
        StringBuilder var22 = new StringBuilder();
        var22.append("quarkus");
        SmallRyeConfigBuilder var2 = ConfigUtils.configBuilder((boolean)1);
        ConfigSourceProviderImpl var3 = new ConfigSourceProviderImpl();
        ConfigUtils.addSourceProvider(var2, (ConfigSourceProvider)var3);
        ConfigSource[] var4 = new ConfigSource[4];
        ConfigSource var5 = buildTimeConfigSource;
        var4[0] = var5;
        ConfigSource var6 = specifiedRunTimeConfigSource;
        var4[1] = var6;
        ConfigSource var7 = runTimeDefaultsConfigSource;
        var4[2] = var7;
        ConfigSource var8 = buildTimeRunTimeDefaultsConfigSource;
        var4[3] = var8;
        Class var9 = Integer.TYPE;
        Converter var10 = conv$11;
        var2.withConverter(var9, 100, var10);
        Converter var11 = conv$10;
        var2.withConverter(Level.class, 100, var11);
        Class var12 = Boolean.TYPE;
        Converter var13 = conv$8;
        var2.withConverter(var12, 100, var13);
        Converter var14 = conv$7;
        var2.withConverter(InheritableLevel.class, 100, var14);
        Converter var15 = conv$15;
        var2.withConverter(MemorySize.class, 100, var15);
        Converter var16 = conv$13;
        var2.withConverter(File.class, 100, var16);
        Converter var17 = conv$17;
        var2.withConverter(InetSocketAddress.class, 100, var17);
        Converter var18 = conv$2;
        var2.withConverter(String.class, 100, var18);
        Converter var19 = conv$1;
        var2.withConverter(Boolean.class, 100, var19);
        var2.withSources(var4);
        ConfigUtils.addSourceProviders(var2, (Collection)var1);
        SmallRyeConfig var23 = var2.build();
        QuarkusConfigFactory.setConfig(var23);
        ConfigProviderResolver var20 = ConfigProviderResolver.instance();

        try {
            org.eclipse.microprofile.config.Config var21 = var20.getConfig();
            var20.releaseConfig(var21);
        } catch (IllegalStateException var52) {
        }

        int var25 = var22.length();
        HttpBuildTimeConfig var24 = HttpBuildTimeConfig;
        var22.append('.');
        var22.append("http");
        initGroup$io$quarkus$vertx$http$runtime$HttpBuildTimeConfig(var23, var22, var24);
        var22.setLength(var25);
        JaxRsSecurityConfig var26 = JaxRsSecurityConfig;
        var22.append('.');
        var22.append("security.jaxrs");
        initGroup$io$quarkus$resteasy$runtime$JaxRsSecurityConfig(var23, var22, var26);
        var22.setLength(var25);
        ApplicationConfig var27 = ApplicationConfig;
        var22.append('.');
        var22.append("application");
        initGroup$io$quarkus$runtime$ApplicationConfig(var23, var22, var27);
        var22.setLength(var25);
        LiveReloadConfig var28 = LiveReloadConfig;
        var22.append('.');
        var22.append("live-reload");
        initGroup$io$quarkus$runtime$LiveReloadConfig(var23, var22, var28);
        var22.setLength(var25);
        LocalesBuildTimeConfig var29 = LocalesBuildTimeConfig;
        initGroup$io$quarkus$runtime$LocalesBuildTimeConfig(var23, var22, var29);
        var22.setLength(var25);
        TlsConfig var30 = TlsConfig;
        var22.append('.');
        var22.append("tls");
        initGroup$io$quarkus$runtime$TlsConfig(var23, var22, var30);
        var22.setLength(var25);
        LogBuildTimeConfig var31 = LogBuildTimeConfig;
        var22.append('.');
        var22.append("log");
        initGroup$io$quarkus$runtime$logging$LogBuildTimeConfig(var23, var22, var31);
        var22.setLength(var25);
        VertxConfiguration var32 = new VertxConfiguration();
        VertxConfiguration = var32;
        var22.append('.');
        var22.append("vertx");
        initGroup$io$quarkus$vertx$core$runtime$config$VertxConfiguration(var23, var22, var32);
        var22.setLength(var25);
        HttpConfiguration var33 = new HttpConfiguration();
        HttpConfiguration = var33;
        var22.append('.');
        var22.append("http");
        initGroup$io$quarkus$vertx$http$runtime$HttpConfiguration(var23, var22, var33);
        var22.setLength(var25);
        BannerRuntimeConfig var34 = new BannerRuntimeConfig();
        BannerRuntimeConfig = var34;
        var22.append('.');
        var22.append("banner");
        initGroup$io$quarkus$runtime$BannerRuntimeConfig(var23, var22, var34);
        var22.setLength(var25);
        CommandLineRuntimeConfig var35 = new CommandLineRuntimeConfig();
        CommandLineRuntimeConfig = var35;
        initGroup$io$quarkus$runtime$CommandLineRuntimeConfig(var23, var22, var35);
        var22.setLength(var25);
        ThreadPoolConfig var36 = new ThreadPoolConfig();
        ThreadPoolConfig = var36;
        var22.append('.');
        var22.append("thread-pool");
        initGroup$io$quarkus$runtime$ThreadPoolConfig(var23, var22, var36);
        var22.setLength(var25);
        TopLevelRootConfig var37 = new TopLevelRootConfig();
        TopLevelRootConfig = var37;
        initGroup$io$quarkus$runtime$TopLevelRootConfig(var23, var22, var37);
        var22.setLength(var25);
        ConfigurationRuntimeConfig var38 = new ConfigurationRuntimeConfig();
        ConfigurationRuntimeConfig = var38;
        var22.append('.');
        var22.append("configuration");
        initGroup$io$quarkus$runtime$configuration$ConfigurationRuntimeConfig(var23, var22, var38);
        var22.setLength(var25);
        LogConfig var39 = new LogConfig();
        LogConfig = var39;
        var22.append('.');
        var22.append("log");
        initGroup$io$quarkus$runtime$logging$LogConfig(var23, var22, var39);
        var22.setLength(var25);
        ShutdownConfig var40 = new ShutdownConfig();
        ShutdownConfig = var40;
        var22.append('.');
        var22.append("shutdown");
        initGroup$io$quarkus$runtime$shutdown$ShutdownConfig(var23, var22, var40);
        var22.setLength(var25);
        Iterator var41 = var23.getPropertyNames().iterator();

        while(var41.hasNext()) {
            String var42 = (String)var41.next();
            NameIterator var43 = new NameIterator(var42);
            if (var43.hasNext() && var43.nextSegmentEquals("quarkus")) {
                var43.next();
                siParseKey(var23, var43);
            }
        }

        Iterator var44 = var23.getPropertyNames().iterator();

        while(var44.hasNext()) {
            String var45 = (String)var44.next();
            NameIterator var46 = new NameIterator(var45);
            if (var46.hasNext() && var46.nextSegmentEquals("quarkus")) {
                var46.next();
                rtParseKey(var23, var46);
            }
        }

        if (ConfigDiagnostic.isError()) {
            String var48 = ConfigDiagnostic.getNiceErrorMessage();
            ConfigDiagnostic.resetError();
            StringBuilder var47 = new StringBuilder();
            var47.append("One or more configuration errors have prevented the application from starting. The errors are:\n");
            var47.append(var48);
            String var49 = var47.toString();
            ConfigurationException var50 = new ConfigurationException(var49);
            StackTraceElement[] var51 = new StackTraceElement[0];
            var50.setStackTrace(var51);
            throw (Throwable)var50;
        }
    }

    private static void siParseKey(SmallRyeConfig var0, NameIterator var1) {
        if (!var1.hasNext()) {
            ConfigDiagnostic.unknown(var1);
        } else if (!var1.nextSegmentEquals("application")) {
            if (!var1.nextSegmentEquals("default-locale")) {
                if (!var1.nextSegmentEquals("http")) {
                    if (!var1.nextSegmentEquals("live-reload")) {
                        if (!var1.nextSegmentEquals("locales")) {
                            if (!var1.nextSegmentEquals("log")) {
                                if (!var1.nextSegmentEquals("security")) {
                                    if (!var1.nextSegmentEquals("tls")) {
                                        if (!var1.nextSegmentEquals("arc")) {
                                            if (!var1.nextSegmentEquals("args")) {
                                                if (!var1.nextSegmentEquals("banner")) {
                                                    if (!var1.nextSegmentEquals("class-loading")) {
                                                        if (!var1.nextSegmentEquals("configuration")) {
                                                            if (!var1.nextSegmentEquals("debug")) {
                                                                if (!var1.nextSegmentEquals("dev")) {
                                                                    if (!var1.nextSegmentEquals("index-dependency")) {
                                                                        if (!var1.nextSegmentEquals("jackson")) {
                                                                            if (!var1.nextSegmentEquals("jni")) {
                                                                                if (!var1.nextSegmentEquals("native")) {
                                                                                    if (!var1.nextSegmentEquals("package")) {
                                                                                        if (!var1.nextSegmentEquals("platform")) {
                                                                                            if (!var1.nextSegmentEquals("profile")) {
                                                                                                if (!var1.nextSegmentEquals("resteasy")) {
                                                                                                    if (!var1.nextSegmentEquals("resteasy-json")) {
                                                                                                        if (!var1.nextSegmentEquals("shutdown")) {
                                                                                                            if (!var1.nextSegmentEquals("ssl")) {
                                                                                                                if (!var1.nextSegmentEquals("test")) {
                                                                                                                    if (!var1.nextSegmentEquals("thread-pool")) {
                                                                                                                        if (!var1.nextSegmentEquals("vertx")) {
                                                                                                                            ConfigDiagnostic.unknown(var1);
                                                                                                                        } else {
                                                                                                                            var1.next();
                                                                                                                            siParseKey:vertx(var0, var1);
                                                                                                                        }
                                                                                                                    } else {
                                                                                                                        var1.next();
                                                                                                                        siParseKey:thread-pool(var0, var1);
                                                                                                                    }
                                                                                                                } else {
                                                                                                                    var1.next();
                                                                                                                    siParseKey:test(var0, var1);
                                                                                                                }
                                                                                                            } else {
                                                                                                                var1.next();
                                                                                                                siParseKey:ssl(var0, var1);
                                                                                                            }
                                                                                                        } else {
                                                                                                            var1.next();
                                                                                                            siParseKey:shutdown(var0, var1);
                                                                                                        }
                                                                                                    } else {
                                                                                                        var1.next();
                                                                                                        siParseKey:resteasy-json(var0, var1);
                                                                                                    }
                                                                                                } else {
                                                                                                    var1.next();
                                                                                                    siParseKey:resteasy(var0, var1);
                                                                                                }
                                                                                            } else {
                                                                                                var1.next();
                                                                                                emptyParseKey(var0, var1);
                                                                                            }
                                                                                        } else {
                                                                                            var1.next();
                                                                                            siParseKey:platform(var0, var1);
                                                                                        }
                                                                                    } else {
                                                                                        var1.next();
                                                                                        siParseKey:package(var0, var1);
                                                                                    }
                                                                                } else {
                                                                                    var1.next();
                                                                                    siParseKey:native(var0, var1);
                                                                                }
                                                                            } else {
                                                                                var1.next();
                                                                                siParseKey:jni(var0, var1);
                                                                            }
                                                                        } else {
                                                                            var1.next();
                                                                            siParseKey:jackson(var0, var1);
                                                                        }
                                                                    } else {
                                                                        var1.next();
                                                                        siParseKey:index-dependency(var0, var1);
                                                                    }
                                                                } else {
                                                                    var1.next();
                                                                    siParseKey:dev(var0, var1);
                                                                }
                                                            } else {
                                                                var1.next();
                                                                siParseKey:debug(var0, var1);
                                                            }
                                                        } else {
                                                            var1.next();
                                                            siParseKey:configuration(var0, var1);
                                                        }
                                                    } else {
                                                        var1.next();
                                                        siParseKey:class-loading(var0, var1);
                                                    }
                                                } else {
                                                    var1.next();
                                                    siParseKey:banner(var0, var1);
                                                }
                                            } else {
                                                var1.next();
                                                emptyParseKey(var0, var1);
                                            }
                                        } else {
                                            var1.next();
                                            siParseKey:arc(var0, var1);
                                        }
                                    } else {
                                        var1.next();
                                        siParseKey:tls(var0, var1);
                                    }
                                } else {
                                    var1.next();
                                    siParseKey:security(var0, var1);
                                }
                            } else {
                                var1.next();
                                siParseKey:log(var0, var1);
                            }
                        } else {
                            var1.next();
                            siParseKey:locales(var0, var1);
                        }
                    } else {
                        var1.next();
                        siParseKey:live-reload(var0, var1);
                    }
                } else {
                    var1.next();
                    siParseKey:http(var0, var1);
                }
            } else {
                var1.next();
                siParseKey:default-locale(var0, var1);
            }
        } else {
            var1.next();
            siParseKey:application(var0, var1);
        }
    }

    private static void siParseKey_application/* $FF was: siParseKey:application*/(SmallRyeConfig var0, NameIterator var1) {
        if (!var1.hasNext()) {
            ConfigDiagnostic.unknown(var1);
        } else if (!var1.nextSegmentEquals("name")) {
            if (!var1.nextSegmentEquals("version")) {
                ConfigDiagnostic.unknown(var1);
            } else {
                var1.next();
                siParseKey:application:version(var0, var1);
            }
        } else {
            var1.next();
            siParseKey:application:name(var0, var1);
        }
    }

    private static void siParseKey_application_name/* $FF was: siParseKey:application:name*/(SmallRyeConfig var0, NameIterator var1) {
        if (var1.hasNext()) {
            ConfigDiagnostic.unknown(var1);
        }
    }

    private static void siParseKey_application_version/* $FF was: siParseKey:application:version*/(SmallRyeConfig var0, NameIterator var1) {
        if (var1.hasNext()) {
            ConfigDiagnostic.unknown(var1);
        }
    }

    private static void siParseKey_default_locale/* $FF was: siParseKey:default-locale*/(SmallRyeConfig var0, NameIterator var1) {
        if (var1.hasNext()) {
            ConfigDiagnostic.unknown(var1);
        }
    }

    private static void siParseKey_http/* $FF was: siParseKey:http*/(SmallRyeConfig var0, NameIterator var1) {
        if (!var1.hasNext()) {
            ConfigDiagnostic.unknown(var1);
        } else if (!var1.nextSegmentEquals("auth")) {
            if (!var1.nextSegmentEquals("non-application-root-path")) {
                if (!var1.nextSegmentEquals("redirect-to-non-application-root-path")) {
                    if (!var1.nextSegmentEquals("root-path")) {
                        if (!var1.nextSegmentEquals("ssl")) {
                            if (!var1.nextSegmentEquals("virtual")) {
                                if (!var1.nextSegmentEquals("access-log")) {
                                    if (!var1.nextSegmentEquals("allow-forwarded")) {
                                        if (!var1.nextSegmentEquals("body")) {
                                            if (!var1.nextSegmentEquals("cors")) {
                                                if (!var1.nextSegmentEquals("domain-socket")) {
                                                    if (!var1.nextSegmentEquals("domain-socket-enabled")) {
                                                        if (!var1.nextSegmentEquals("enable-compression")) {
                                                            if (!var1.nextSegmentEquals("host")) {
                                                                if (!var1.nextSegmentEquals("host-enabled")) {
                                                                    if (!var1.nextSegmentEquals("http2")) {
                                                                        if (!var1.nextSegmentEquals("idle-timeout")) {
                                                                            if (!var1.nextSegmentEquals("insecure-requests")) {
                                                                                if (!var1.nextSegmentEquals("io-threads")) {
                                                                                    if (!var1.nextSegmentEquals("limits")) {
                                                                                        if (!var1.nextSegmentEquals("port")) {
                                                                                            if (!var1.nextSegmentEquals("proxy")) {
                                                                                                if (!var1.nextSegmentEquals("proxy-address-forwarding")) {
                                                                                                    if (!var1.nextSegmentEquals("read-timeout")) {
                                                                                                        if (!var1.nextSegmentEquals("record-request-start-time")) {
                                                                                                            if (!var1.nextSegmentEquals("same-site-cookie")) {
                                                                                                                if (!var1.nextSegmentEquals("so-reuse-port")) {
                                                                                                                    if (!var1.nextSegmentEquals("ssl-port")) {
                                                                                                                        if (!var1.nextSegmentEquals("tcp-cork")) {
                                                                                                                            if (!var1.nextSegmentEquals("tcp-fast-open")) {
                                                                                                                                if (!var1.nextSegmentEquals("tcp-quick-ack")) {
                                                                                                                                    if (!var1.nextSegmentEquals("test-port")) {
                                                                                                                                        if (!var1.nextSegmentEquals("test-ssl-port")) {
                                                                                                                                            ConfigDiagnostic.unknown(var1);
                                                                                                                                        } else {
                                                                                                                                            var1.next();
                                                                                                                                            emptyParseKey(var0, var1);
                                                                                                                                        }
                                                                                                                                    } else {
                                                                                                                                        var1.next();
                                                                                                                                        emptyParseKey(var0, var1);
                                                                                                                                    }
                                                                                                                                } else {
                                                                                                                                    var1.next();
                                                                                                                                    emptyParseKey(var0, var1);
                                                                                                                                }
                                                                                                                            } else {
                                                                                                                                var1.next();
                                                                                                                                emptyParseKey(var0, var1);
                                                                                                                            }
                                                                                                                        } else {
                                                                                                                            var1.next();
                                                                                                                            emptyParseKey(var0, var1);
                                                                                                                        }
                                                                                                                    } else {
                                                                                                                        var1.next();
                                                                                                                        emptyParseKey(var0, var1);
                                                                                                                    }
                                                                                                                } else {
                                                                                                                    var1.next();
                                                                                                                    emptyParseKey(var0, var1);
                                                                                                                }
                                                                                                            } else {
                                                                                                                var1.next();
                                                                                                                siParseKey:http:same-site-cookie(var0, var1);
                                                                                                            }
                                                                                                        } else {
                                                                                                            var1.next();
                                                                                                            emptyParseKey(var0, var1);
                                                                                                        }
                                                                                                    } else {
                                                                                                        var1.next();
                                                                                                        emptyParseKey(var0, var1);
                                                                                                    }
                                                                                                } else {
                                                                                                    var1.next();
                                                                                                    emptyParseKey(var0, var1);
                                                                                                }
                                                                                            } else {
                                                                                                var1.next();
                                                                                                siParseKey:http:proxy(var0, var1);
                                                                                            }
                                                                                        } else {
                                                                                            var1.next();
                                                                                            emptyParseKey(var0, var1);
                                                                                        }
                                                                                    } else {
                                                                                        var1.next();
                                                                                        siParseKey:http:limits(var0, var1);
                                                                                    }
                                                                                } else {
                                                                                    var1.next();
                                                                                    emptyParseKey(var0, var1);
                                                                                }
                                                                            } else {
                                                                                var1.next();
                                                                                emptyParseKey(var0, var1);
                                                                            }
                                                                        } else {
                                                                            var1.next();
                                                                            emptyParseKey(var0, var1);
                                                                        }
                                                                    } else {
                                                                        var1.next();
                                                                        emptyParseKey(var0, var1);
                                                                    }
                                                                } else {
                                                                    var1.next();
                                                                    emptyParseKey(var0, var1);
                                                                }
                                                            } else {
                                                                var1.next();
                                                                emptyParseKey(var0, var1);
                                                            }
                                                        } else {
                                                            var1.next();
                                                            emptyParseKey(var0, var1);
                                                        }
                                                    } else {
                                                        var1.next();
                                                        emptyParseKey(var0, var1);
                                                    }
                                                } else {
                                                    var1.next();
                                                    emptyParseKey(var0, var1);
                                                }
                                            } else {
                                                var1.next();
                                                siParseKey:http:cors(var0, var1);
                                            }
                                        } else {
                                            var1.next();
                                            siParseKey:http:body(var0, var1);
                                        }
                                    } else {
                                        var1.next();
                                        emptyParseKey(var0, var1);
                                    }
                                } else {
                                    var1.next();
                                    siParseKey:http:access-log(var0, var1);
                                }
                            } else {
                                var1.next();
                                siParseKey:http:virtual(var0, var1);
                            }
                        } else {
                            var1.next();
                            siParseKey:http:ssl(var0, var1);
                        }
                    } else {
                        var1.next();
                        siParseKey:http:root-path(var0, var1);
                    }
                } else {
                    var1.next();
                    siParseKey:http:redirect-to-non-application-root-path(var0, var1);
                }
            } else {
                var1.next();
                siParseKey:http:non-application-root-path(var0, var1);
            }
        } else {
            var1.next();
            siParseKey:http:auth(var0, var1);
        }
    }

    private static void siParseKey_http_auth/* $FF was: siParseKey:http:auth*/(SmallRyeConfig var0, NameIterator var1) {
        if (!var1.hasNext()) {
            ConfigDiagnostic.unknown(var1);
        } else if (!var1.nextSegmentEquals("basic")) {
            if (!var1.nextSegmentEquals("form")) {
                if (!var1.nextSegmentEquals("permission")) {
                    if (!var1.nextSegmentEquals("policy")) {
                        if (!var1.nextSegmentEquals("proactive")) {
                            if (!var1.nextSegmentEquals("realm")) {
                                if (!var1.nextSegmentEquals("session")) {
                                    ConfigDiagnostic.unknown(var1);
                                } else {
                                    var1.next();
                                    siParseKey:http:auth:session(var0, var1);
                                }
                            } else {
                                var1.next();
                                siParseKey:http:auth:realm(var0, var1);
                            }
                        } else {
                            var1.next();
                            siParseKey:http:auth:proactive(var0, var1);
                        }
                    } else {
                        var1.next();
                        siParseKey:http:auth:policy(var0, var1);
                    }
                } else {
                    var1.next();
                    siParseKey:http:auth:permission(var0, var1);
                }
            } else {
                var1.next();
                siParseKey:http:auth:form(var0, var1);
            }
        } else {
            var1.next();
            siParseKey:http:auth:basic(var0, var1);
        }
    }

    private static void siParseKey_http_auth_basic/* $FF was: siParseKey:http:auth:basic*/(SmallRyeConfig var0, NameIterator var1) {
        if (var1.hasNext()) {
            ConfigDiagnostic.unknown(var1);
        }
    }

    private static void siParseKey_http_auth_form/* $FF was: siParseKey:http:auth:form*/(SmallRyeConfig var0, NameIterator var1) {
        if (!var1.hasNext()) {
            ConfigDiagnostic.unknown(var1);
        } else if (!var1.nextSegmentEquals("cookie-name")) {
            if (!var1.nextSegmentEquals("enabled")) {
                if (!var1.nextSegmentEquals("error-page")) {
                    if (!var1.nextSegmentEquals("landing-page")) {
                        if (!var1.nextSegmentEquals("location-cookie")) {
                            if (!var1.nextSegmentEquals("login-page")) {
                                if (!var1.nextSegmentEquals("new-cookie-interval")) {
                                    if (!var1.nextSegmentEquals("password-parameter")) {
                                        if (!var1.nextSegmentEquals("post-location")) {
                                            if (!var1.nextSegmentEquals("redirect-after-login")) {
                                                if (!var1.nextSegmentEquals("timeout")) {
                                                    if (!var1.nextSegmentEquals("username-parameter")) {
                                                        ConfigDiagnostic.unknown(var1);
                                                    } else {
                                                        var1.next();
                                                        siParseKey:http:auth:form:username-parameter(var0, var1);
                                                    }
                                                } else {
                                                    var1.next();
                                                    siParseKey:http:auth:form:timeout(var0, var1);
                                                }
                                            } else {
                                                var1.next();
                                                siParseKey:http:auth:form:redirect-after-login(var0, var1);
                                            }
                                        } else {
                                            var1.next();
                                            siParseKey:http:auth:form:post-location(var0, var1);
                                        }
                                    } else {
                                        var1.next();
                                        siParseKey:http:auth:form:password-parameter(var0, var1);
                                    }
                                } else {
                                    var1.next();
                                    siParseKey:http:auth:form:new-cookie-interval(var0, var1);
                                }
                            } else {
                                var1.next();
                                siParseKey:http:auth:form:login-page(var0, var1);
                            }
                        } else {
                            var1.next();
                            siParseKey:http:auth:form:location-cookie(var0, var1);
                        }
                    } else {
                        var1.next();
                        siParseKey:http:auth:form:landing-page(var0, var1);
                    }
                } else {
                    var1.next();
                    siParseKey:http:auth:form:error-page(var0, var1);
                }
            } else {
                var1.next();
                siParseKey:http:auth:form:enabled(var0, var1);
            }
        } else {
            var1.next();
            siParseKey:http:auth:form:cookie-name(var0, var1);
        }
    }

    private static void siParseKey_http_auth_form_cookie_name/* $FF was: siParseKey:http:auth:form:cookie-name*/(SmallRyeConfig var0, NameIterator var1) {
        if (var1.hasNext()) {
            ConfigDiagnostic.unknown(var1);
        }
    }

    private static void siParseKey_http_auth_form_enabled/* $FF was: siParseKey:http:auth:form:enabled*/(SmallRyeConfig var0, NameIterator var1) {
        if (var1.hasNext()) {
            ConfigDiagnostic.unknown(var1);
        }
    }

    private static void siParseKey_http_auth_form_error_page/* $FF was: siParseKey:http:auth:form:error-page*/(SmallRyeConfig var0, NameIterator var1) {
        if (var1.hasNext()) {
            ConfigDiagnostic.unknown(var1);
        }
    }

    private static void siParseKey_http_auth_form_landing_page/* $FF was: siParseKey:http:auth:form:landing-page*/(SmallRyeConfig var0, NameIterator var1) {
        if (var1.hasNext()) {
            ConfigDiagnostic.unknown(var1);
        }
    }

    private static void siParseKey_http_auth_form_location_cookie/* $FF was: siParseKey:http:auth:form:location-cookie*/(SmallRyeConfig var0, NameIterator var1) {
        if (var1.hasNext()) {
            ConfigDiagnostic.unknown(var1);
        }
    }

    private static void siParseKey_http_auth_form_login_page/* $FF was: siParseKey:http:auth:form:login-page*/(SmallRyeConfig var0, NameIterator var1) {
        if (var1.hasNext()) {
            ConfigDiagnostic.unknown(var1);
        }
    }

    private static void siParseKey_http_auth_form_new_cookie_interval/* $FF was: siParseKey:http:auth:form:new-cookie-interval*/(SmallRyeConfig var0, NameIterator var1) {
        if (var1.hasNext()) {
            ConfigDiagnostic.unknown(var1);
        }
    }

    private static void siParseKey_http_auth_form_password_parameter/* $FF was: siParseKey:http:auth:form:password-parameter*/(SmallRyeConfig var0, NameIterator var1) {
        if (var1.hasNext()) {
            ConfigDiagnostic.unknown(var1);
        }
    }

    private static void siParseKey_http_auth_form_post_location/* $FF was: siParseKey:http:auth:form:post-location*/(SmallRyeConfig var0, NameIterator var1) {
        if (var1.hasNext()) {
            ConfigDiagnostic.unknown(var1);
        }
    }

    private static void siParseKey_http_auth_form_redirect_after_login/* $FF was: siParseKey:http:auth:form:redirect-after-login*/(SmallRyeConfig var0, NameIterator var1) {
        if (var1.hasNext()) {
            ConfigDiagnostic.unknown(var1);
        }
    }

    private static void siParseKey_http_auth_form_timeout/* $FF was: siParseKey:http:auth:form:timeout*/(SmallRyeConfig var0, NameIterator var1) {
        if (var1.hasNext()) {
            ConfigDiagnostic.unknown(var1);
        }
    }

    private static void siParseKey_http_auth_form_username_parameter/* $FF was: siParseKey:http:auth:form:username-parameter*/(SmallRyeConfig var0, NameIterator var1) {
        if (var1.hasNext()) {
            ConfigDiagnostic.unknown(var1);
        }
    }

    private static void siParseKey_http_auth_permission/* $FF was: siParseKey:http:auth:permission*/(SmallRyeConfig var0, NameIterator var1) {
        if (!var1.hasNext()) {
            ConfigDiagnostic.unknown(var1);
        } else if (!var1.hasNext()) {
            ConfigDiagnostic.unknown(var1);
        } else {
            var1.next();
            siParseKey:http:auth:permission:*(var0, var1);
        }
    }

    private static void siParseKey_http_auth_permission__/* $FF was: siParseKey:http:auth:permission:**/(SmallRyeConfig var0, NameIterator var1) {
        if (!var1.hasNext()) {
            ConfigDiagnostic.unknown(var1);
        } else if (!var1.nextSegmentEquals("enabled")) {
            if (!var1.nextSegmentEquals("methods")) {
                if (!var1.nextSegmentEquals("paths")) {
                    if (!var1.nextSegmentEquals("policy")) {
                        ConfigDiagnostic.unknown(var1);
                    } else {
                        var1.next();
                        siParseKey:http:auth:permission:*:policy(var0, var1);
                    }
                } else {
                    var1.next();
                    siParseKey:http:auth:permission:*:paths(var0, var1);
                }
            } else {
                var1.next();
                siParseKey:http:auth:permission:*:methods(var0, var1);
            }
        } else {
            var1.next();
            siParseKey:http:auth:permission:*:enabled(var0, var1);
        }
    }

    private static void siParseKey_http_auth_permission___enabled/* $FF was: siParseKey:http:auth:permission:*:enabled*/(SmallRyeConfig var0, NameIterator var1) {
        if (!var1.hasNext()) {
            var1.previous();
            siGetEnclosing:http:HttpBuildTimeConfig#auth:AuthConfig#permissions:*:PolicyMappingConfig#enabled(var1, var0);
        } else {
            ConfigDiagnostic.unknown(var1);
        }
    }

    static Object siGetEnclosing_http_HttpBuildTimeConfig_auth_AuthConfig_permissions___PolicyMappingConfig_enabled/* $FF was: siGetEnclosing:http:HttpBuildTimeConfig#auth:AuthConfig#permissions:*:PolicyMappingConfig#enabled*/(NameIterator var0, SmallRyeConfig var1) {
        String var3 = var0.getPreviousSegment();
        var0.previous();
        Object var2 = siGetEnclosing:http:HttpBuildTimeConfig#auth:AuthConfig#permissions:*(var0, var1);
        var0.next();
        Object var4 = ((Map)var2).get(var3);
        if (var4 != null) {
            return var4;
        } else {
            PolicyMappingConfig var7 = new PolicyMappingConfig();
            String var5 = var0.getAllPreviousSegments();
            StringBuilder var6 = new StringBuilder(var5);
            initGroup$io$quarkus$vertx$http$runtime$PolicyMappingConfig(var1, var6, var7);
            ((Map)var2).put(var3, var7);
            return var7;
        }
    }

    static Object siGetEnclosing_http_HttpBuildTimeConfig_auth_AuthConfig_permissions__/* $FF was: siGetEnclosing:http:HttpBuildTimeConfig#auth:AuthConfig#permissions:**/(NameIterator var0, SmallRyeConfig var1) {
        var0.previous();
        Object var2 = siGetEnclosing:http:HttpBuildTimeConfig#auth:AuthConfig#permissions(var0, var1);
        var0.next();
        return ((AuthConfig)var2).permissions;
    }

    static Object siGetEnclosing_http_HttpBuildTimeConfig_auth_AuthConfig_permissions/* $FF was: siGetEnclosing:http:HttpBuildTimeConfig#auth:AuthConfig#permissions*/(NameIterator var0, SmallRyeConfig var1) {
        var0.previous();
        AuthConfig var2 = ((HttpBuildTimeConfig)siGetEnclosing:http:HttpBuildTimeConfig#auth(var0, var1)).auth;
        var0.next();
        return var2;
    }

    static Object siGetEnclosing_http_HttpBuildTimeConfig_auth/* $FF was: siGetEnclosing:http:HttpBuildTimeConfig#auth*/(NameIterator var0, SmallRyeConfig var1) {
        return HttpBuildTimeConfig;
    }

    static void initGroup$io$quarkus$vertx$http$runtime$PolicyMappingConfig(SmallRyeConfig var0, StringBuilder var1, Object var2) {
        int var8 = var1.length();
        var1.append('.');
        var1.append("enabled");
        String var3 = var1.toString();
        Converter var4 = conv$0;

        try {
            Object var5 = var0.getValue(var3, var4);
            ((PolicyMappingConfig)var2).enabled = (Optional)var5;
        } catch (IllegalArgumentException var30) {
            ConfigDiagnostic.invalidValue(var3, var30);
        } catch (NoSuchElementException var31) {
            ConfigDiagnostic.missingValue(var3, var31);
        }

        var1.setLength(var8);
        var1.append('.');
        var1.append("policy");
        String var9 = var1.toString();
        Converter var10 = conv$2;

        try {
            Object var11 = var0.getValue(var9, var10);
            ((PolicyMappingConfig)var2).policy = (String)var11;
        } catch (IllegalArgumentException var28) {
            ConfigDiagnostic.invalidValue(var9, var28);
        } catch (NoSuchElementException var29) {
            ConfigDiagnostic.missingValue(var9, var29);
        }

        var1.setLength(var8);
        var1.append('.');
        var1.append("methods");
        String var14 = var1.toString();
        Converter var15 = conv$3;

        try {
            Object var16 = var0.getValue(var14, var15);
            ((PolicyMappingConfig)var2).methods = (Optional)var16;
        } catch (IllegalArgumentException var26) {
            ConfigDiagnostic.invalidValue(var14, var26);
        } catch (NoSuchElementException var27) {
            ConfigDiagnostic.missingValue(var14, var27);
        }

        var1.setLength(var8);
        var1.append('.');
        var1.append("paths");
        String var19 = var1.toString();
        Converter var20 = conv$3;

        try {
            Object var21 = var0.getValue(var19, var20);
            ((PolicyMappingConfig)var2).paths = (Optional)var21;
        } catch (IllegalArgumentException var24) {
            ConfigDiagnostic.invalidValue(var19, var24);
        } catch (NoSuchElementException var25) {
            ConfigDiagnostic.missingValue(var19, var25);
        }

        var1.setLength(var8);
    }

    private static void siParseKey_http_auth_permission___methods/* $FF was: siParseKey:http:auth:permission:*:methods*/(SmallRyeConfig var0, NameIterator var1) {
        if (!var1.hasNext()) {
            var1.previous();
            siGetEnclosing:http:HttpBuildTimeConfig#auth:AuthConfig#permissions:*:PolicyMappingConfig#methods(var1, var0);
        } else {
            ConfigDiagnostic.unknown(var1);
        }
    }

    static Object siGetEnclosing_http_HttpBuildTimeConfig_auth_AuthConfig_permissions___PolicyMappingConfig_methods/* $FF was: siGetEnclosing:http:HttpBuildTimeConfig#auth:AuthConfig#permissions:*:PolicyMappingConfig#methods*/(NameIterator var0, SmallRyeConfig var1) {
        String var3 = var0.getPreviousSegment();
        var0.previous();
        Object var2 = siGetEnclosing:http:HttpBuildTimeConfig#auth:AuthConfig#permissions:*(var0, var1);
        var0.next();
        Object var4 = ((Map)var2).get(var3);
        if (var4 != null) {
            return var4;
        } else {
            PolicyMappingConfig var7 = new PolicyMappingConfig();
            String var5 = var0.getAllPreviousSegments();
            StringBuilder var6 = new StringBuilder(var5);
            initGroup$io$quarkus$vertx$http$runtime$PolicyMappingConfig(var1, var6, var7);
            ((Map)var2).put(var3, var7);
            return var7;
        }
    }

    private static void siParseKey_http_auth_permission___paths/* $FF was: siParseKey:http:auth:permission:*:paths*/(SmallRyeConfig var0, NameIterator var1) {
        if (!var1.hasNext()) {
            var1.previous();
            siGetEnclosing:http:HttpBuildTimeConfig#auth:AuthConfig#permissions:*:PolicyMappingConfig#paths(var1, var0);
        } else {
            ConfigDiagnostic.unknown(var1);
        }
    }

    static Object siGetEnclosing_http_HttpBuildTimeConfig_auth_AuthConfig_permissions___PolicyMappingConfig_paths/* $FF was: siGetEnclosing:http:HttpBuildTimeConfig#auth:AuthConfig#permissions:*:PolicyMappingConfig#paths*/(NameIterator var0, SmallRyeConfig var1) {
        String var3 = var0.getPreviousSegment();
        var0.previous();
        Object var2 = siGetEnclosing:http:HttpBuildTimeConfig#auth:AuthConfig#permissions:*(var0, var1);
        var0.next();
        Object var4 = ((Map)var2).get(var3);
        if (var4 != null) {
            return var4;
        } else {
            PolicyMappingConfig var7 = new PolicyMappingConfig();
            String var5 = var0.getAllPreviousSegments();
            StringBuilder var6 = new StringBuilder(var5);
            initGroup$io$quarkus$vertx$http$runtime$PolicyMappingConfig(var1, var6, var7);
            ((Map)var2).put(var3, var7);
            return var7;
        }
    }

    private static void siParseKey_http_auth_permission___policy/* $FF was: siParseKey:http:auth:permission:*:policy*/(SmallRyeConfig var0, NameIterator var1) {
        if (!var1.hasNext()) {
            var1.previous();
            siGetEnclosing:http:HttpBuildTimeConfig#auth:AuthConfig#permissions:*:PolicyMappingConfig#policy(var1, var0);
        } else {
            ConfigDiagnostic.unknown(var1);
        }
    }

    static Object siGetEnclosing_http_HttpBuildTimeConfig_auth_AuthConfig_permissions___PolicyMappingConfig_policy/* $FF was: siGetEnclosing:http:HttpBuildTimeConfig#auth:AuthConfig#permissions:*:PolicyMappingConfig#policy*/(NameIterator var0, SmallRyeConfig var1) {
        String var3 = var0.getPreviousSegment();
        var0.previous();
        Object var2 = siGetEnclosing:http:HttpBuildTimeConfig#auth:AuthConfig#permissions:*(var0, var1);
        var0.next();
        Object var4 = ((Map)var2).get(var3);
        if (var4 != null) {
            return var4;
        } else {
            PolicyMappingConfig var7 = new PolicyMappingConfig();
            String var5 = var0.getAllPreviousSegments();
            StringBuilder var6 = new StringBuilder(var5);
            initGroup$io$quarkus$vertx$http$runtime$PolicyMappingConfig(var1, var6, var7);
            ((Map)var2).put(var3, var7);
            return var7;
        }
    }

    private static void siParseKey_http_auth_policy/* $FF was: siParseKey:http:auth:policy*/(SmallRyeConfig var0, NameIterator var1) {
        if (!var1.hasNext()) {
            ConfigDiagnostic.unknown(var1);
        } else if (!var1.hasNext()) {
            ConfigDiagnostic.unknown(var1);
        } else {
            var1.next();
            siParseKey:http:auth:policy:*(var0, var1);
        }
    }

    private static void siParseKey_http_auth_policy__/* $FF was: siParseKey:http:auth:policy:**/(SmallRyeConfig var0, NameIterator var1) {
        if (!var1.hasNext()) {
            ConfigDiagnostic.unknown(var1);
        } else if (!var1.nextSegmentEquals("roles-allowed")) {
            ConfigDiagnostic.unknown(var1);
        } else {
            var1.next();
            siParseKey:http:auth:policy:*:roles-allowed(var0, var1);
        }
    }

    private static void siParseKey_http_auth_policy___roles_allowed/* $FF was: siParseKey:http:auth:policy:*:roles-allowed*/(SmallRyeConfig var0, NameIterator var1) {
        if (!var1.hasNext()) {
            var1.previous();
            siGetEnclosing:http:HttpBuildTimeConfig#auth:AuthConfig#rolePolicy:*:PolicyConfig#rolesAllowed(var1, var0);
        } else {
            ConfigDiagnostic.unknown(var1);
        }
    }

    static Object siGetEnclosing_http_HttpBuildTimeConfig_auth_AuthConfig_rolePolicy___PolicyConfig_rolesAllowed/* $FF was: siGetEnclosing:http:HttpBuildTimeConfig#auth:AuthConfig#rolePolicy:*:PolicyConfig#rolesAllowed*/(NameIterator var0, SmallRyeConfig var1) {
        String var3 = var0.getPreviousSegment();
        var0.previous();
        Object var2 = siGetEnclosing:http:HttpBuildTimeConfig#auth:AuthConfig#rolePolicy:*(var0, var1);
        var0.next();
        Object var4 = ((Map)var2).get(var3);
        if (var4 != null) {
            return var4;
        } else {
            PolicyConfig var7 = new PolicyConfig();
            String var5 = var0.getAllPreviousSegments();
            StringBuilder var6 = new StringBuilder(var5);
            initGroup$io$quarkus$vertx$http$runtime$PolicyConfig(var1, var6, var7);
            ((Map)var2).put(var3, var7);
            return var7;
        }
    }

    static Object siGetEnclosing_http_HttpBuildTimeConfig_auth_AuthConfig_rolePolicy__/* $FF was: siGetEnclosing:http:HttpBuildTimeConfig#auth:AuthConfig#rolePolicy:**/(NameIterator var0, SmallRyeConfig var1) {
        var0.previous();
        Object var2 = siGetEnclosing:http:HttpBuildTimeConfig#auth:AuthConfig#rolePolicy(var0, var1);
        var0.next();
        return ((AuthConfig)var2).rolePolicy;
    }

    static Object siGetEnclosing_http_HttpBuildTimeConfig_auth_AuthConfig_rolePolicy/* $FF was: siGetEnclosing:http:HttpBuildTimeConfig#auth:AuthConfig#rolePolicy*/(NameIterator var0, SmallRyeConfig var1) {
        var0.previous();
        AuthConfig var2 = ((HttpBuildTimeConfig)siGetEnclosing:http:HttpBuildTimeConfig#auth(var0, var1)).auth;
        var0.next();
        return var2;
    }

    static void initGroup$io$quarkus$vertx$http$runtime$PolicyConfig(SmallRyeConfig var0, StringBuilder var1, Object var2) {
        int var8 = var1.length();
        var1.append('.');
        var1.append("roles-allowed");
        String var3 = var1.toString();
        Converter var4 = conv$5;

        try {
            Object var5 = var0.getValue(var3, var4);
            ((PolicyConfig)var2).rolesAllowed = (List)var5;
        } catch (IllegalArgumentException var9) {
            ConfigDiagnostic.invalidValue(var3, var9);
        } catch (NoSuchElementException var10) {
            ConfigDiagnostic.missingValue(var3, var10);
        }

        var1.setLength(var8);
    }

    private static void siParseKey_http_auth_proactive/* $FF was: siParseKey:http:auth:proactive*/(SmallRyeConfig var0, NameIterator var1) {
        if (var1.hasNext()) {
            ConfigDiagnostic.unknown(var1);
        }
    }

    private static void siParseKey_http_auth_realm/* $FF was: siParseKey:http:auth:realm*/(SmallRyeConfig var0, NameIterator var1) {
        if (var1.hasNext()) {
            ConfigDiagnostic.unknown(var1);
        }
    }

    private static void siParseKey_http_auth_session/* $FF was: siParseKey:http:auth:session*/(SmallRyeConfig var0, NameIterator var1) {
        if (!var1.hasNext()) {
            ConfigDiagnostic.unknown(var1);
        } else if (!var1.nextSegmentEquals("encryption-key")) {
            ConfigDiagnostic.unknown(var1);
        } else {
            var1.next();
            emptyParseKey(var0, var1);
        }
    }

    private static void siParseKey_http_non_application_root_path/* $FF was: siParseKey:http:non-application-root-path*/(SmallRyeConfig var0, NameIterator var1) {
        if (var1.hasNext()) {
            ConfigDiagnostic.unknown(var1);
        }
    }

    private static void siParseKey_http_redirect_to_non_application_root_path/* $FF was: siParseKey:http:redirect-to-non-application-root-path*/(SmallRyeConfig var0, NameIterator var1) {
        if (var1.hasNext()) {
            ConfigDiagnostic.unknown(var1);
        }
    }

    private static void siParseKey_http_root_path/* $FF was: siParseKey:http:root-path*/(SmallRyeConfig var0, NameIterator var1) {
        if (var1.hasNext()) {
            ConfigDiagnostic.unknown(var1);
        }
    }

    private static void siParseKey_http_ssl/* $FF was: siParseKey:http:ssl*/(SmallRyeConfig var0, NameIterator var1) {
        if (!var1.hasNext()) {
            ConfigDiagnostic.unknown(var1);
        } else if (!var1.nextSegmentEquals("client-auth")) {
            if (!var1.nextSegmentEquals("certificate")) {
                if (!var1.nextSegmentEquals("cipher-suites")) {
                    if (!var1.nextSegmentEquals("protocols")) {
                        ConfigDiagnostic.unknown(var1);
                    } else {
                        var1.next();
                        emptyParseKey(var0, var1);
                    }
                } else {
                    var1.next();
                    emptyParseKey(var0, var1);
                }
            } else {
                var1.next();
                siParseKey:http:ssl:certificate(var0, var1);
            }
        } else {
            var1.next();
            siParseKey:http:ssl:client-auth(var0, var1);
        }
    }

    private static void siParseKey_http_ssl_client_auth/* $FF was: siParseKey:http:ssl:client-auth*/(SmallRyeConfig var0, NameIterator var1) {
        if (var1.hasNext()) {
            ConfigDiagnostic.unknown(var1);
        }
    }

    private static void siParseKey_http_ssl_certificate/* $FF was: siParseKey:http:ssl:certificate*/(SmallRyeConfig var0, NameIterator var1) {
        if (!var1.hasNext()) {
            ConfigDiagnostic.unknown(var1);
        } else if (!var1.nextSegmentEquals("file")) {
            if (!var1.nextSegmentEquals("key-file")) {
                if (!var1.nextSegmentEquals("key-store-file")) {
                    if (!var1.nextSegmentEquals("key-store-file-type")) {
                        if (!var1.nextSegmentEquals("key-store-password")) {
                            if (!var1.nextSegmentEquals("key-store-provider")) {
                                if (!var1.nextSegmentEquals("trust-store-file")) {
                                    if (!var1.nextSegmentEquals("trust-store-file-type")) {
                                        if (!var1.nextSegmentEquals("trust-store-password")) {
                                            if (!var1.nextSegmentEquals("trust-store-provider")) {
                                                ConfigDiagnostic.unknown(var1);
                                            } else {
                                                var1.next();
                                                emptyParseKey(var0, var1);
                                            }
                                        } else {
                                            var1.next();
                                            emptyParseKey(var0, var1);
                                        }
                                    } else {
                                        var1.next();
                                        emptyParseKey(var0, var1);
                                    }
                                } else {
                                    var1.next();
                                    emptyParseKey(var0, var1);
                                }
                            } else {
                                var1.next();
                                emptyParseKey(var0, var1);
                            }
                        } else {
                            var1.next();
                            emptyParseKey(var0, var1);
                        }
                    } else {
                        var1.next();
                        emptyParseKey(var0, var1);
                    }
                } else {
                    var1.next();
                    emptyParseKey(var0, var1);
                }
            } else {
                var1.next();
                emptyParseKey(var0, var1);
            }
        } else {
            var1.next();
            emptyParseKey(var0, var1);
        }
    }

    private static void siParseKey_http_virtual/* $FF was: siParseKey:http:virtual*/(SmallRyeConfig var0, NameIterator var1) {
        if (var1.hasNext()) {
            ConfigDiagnostic.unknown(var1);
        }
    }

    private static void siParseKey_http_access_log/* $FF was: siParseKey:http:access-log*/(SmallRyeConfig var0, NameIterator var1) {
        if (!var1.hasNext()) {
            ConfigDiagnostic.unknown(var1);
        } else if (!var1.nextSegmentEquals("base-file-name")) {
            if (!var1.nextSegmentEquals("category")) {
                if (!var1.nextSegmentEquals("enabled")) {
                    if (!var1.nextSegmentEquals("log-directory")) {
                        if (!var1.nextSegmentEquals("log-suffix")) {
                            if (!var1.nextSegmentEquals("log-to-file")) {
                                if (!var1.nextSegmentEquals("pattern")) {
                                    if (!var1.nextSegmentEquals("rotate")) {
                                        ConfigDiagnostic.unknown(var1);
                                    } else {
                                        var1.next();
                                        emptyParseKey(var0, var1);
                                    }
                                } else {
                                    var1.next();
                                    emptyParseKey(var0, var1);
                                }
                            } else {
                                var1.next();
                                emptyParseKey(var0, var1);
                            }
                        } else {
                            var1.next();
                            emptyParseKey(var0, var1);
                        }
                    } else {
                        var1.next();
                        emptyParseKey(var0, var1);
                    }
                } else {
                    var1.next();
                    emptyParseKey(var0, var1);
                }
            } else {
                var1.next();
                emptyParseKey(var0, var1);
            }
        } else {
            var1.next();
            emptyParseKey(var0, var1);
        }
    }

    private static void siParseKey_http_body/* $FF was: siParseKey:http:body*/(SmallRyeConfig var0, NameIterator var1) {
        if (!var1.hasNext()) {
            ConfigDiagnostic.unknown(var1);
        } else if (!var1.nextSegmentEquals("delete-uploaded-files-on-end")) {
            if (!var1.nextSegmentEquals("handle-file-uploads")) {
                if (!var1.nextSegmentEquals("merge-form-attributes")) {
                    if (!var1.nextSegmentEquals("preallocate-body-buffer")) {
                        if (!var1.nextSegmentEquals("uploads-directory")) {
                            ConfigDiagnostic.unknown(var1);
                        } else {
                            var1.next();
                            emptyParseKey(var0, var1);
                        }
                    } else {
                        var1.next();
                        emptyParseKey(var0, var1);
                    }
                } else {
                    var1.next();
                    emptyParseKey(var0, var1);
                }
            } else {
                var1.next();
                emptyParseKey(var0, var1);
            }
        } else {
            var1.next();
            emptyParseKey(var0, var1);
        }
    }

    private static void siParseKey_http_cors/* $FF was: siParseKey:http:cors*/(SmallRyeConfig var0, NameIterator var1) {
        if (var1.hasNext()) {
            if (!var1.nextSegmentEquals("access-control-allow-credentials")) {
                if (!var1.nextSegmentEquals("access-control-max-age")) {
                    if (!var1.nextSegmentEquals("exposed-headers")) {
                        if (!var1.nextSegmentEquals("headers")) {
                            if (!var1.nextSegmentEquals("methods")) {
                                if (!var1.nextSegmentEquals("origins")) {
                                    ConfigDiagnostic.unknown(var1);
                                } else {
                                    var1.next();
                                    emptyParseKey(var0, var1);
                                }
                            } else {
                                var1.next();
                                emptyParseKey(var0, var1);
                            }
                        } else {
                            var1.next();
                            emptyParseKey(var0, var1);
                        }
                    } else {
                        var1.next();
                        emptyParseKey(var0, var1);
                    }
                } else {
                    var1.next();
                    emptyParseKey(var0, var1);
                }
            } else {
                var1.next();
                emptyParseKey(var0, var1);
            }
        }
    }

    private static void siParseKey_http_limits/* $FF was: siParseKey:http:limits*/(SmallRyeConfig var0, NameIterator var1) {
        if (!var1.hasNext()) {
            ConfigDiagnostic.unknown(var1);
        } else if (!var1.nextSegmentEquals("max-body-size")) {
            if (!var1.nextSegmentEquals("max-chunk-size")) {
                if (!var1.nextSegmentEquals("max-header-size")) {
                    if (!var1.nextSegmentEquals("max-initial-line-length")) {
                        ConfigDiagnostic.unknown(var1);
                    } else {
                        var1.next();
                        emptyParseKey(var0, var1);
                    }
                } else {
                    var1.next();
                    emptyParseKey(var0, var1);
                }
            } else {
                var1.next();
                emptyParseKey(var0, var1);
            }
        } else {
            var1.next();
            emptyParseKey(var0, var1);
        }
    }

    private static void siParseKey_http_proxy/* $FF was: siParseKey:http:proxy*/(SmallRyeConfig var0, NameIterator var1) {
        if (!var1.hasNext()) {
            ConfigDiagnostic.unknown(var1);
        } else if (!var1.nextSegmentEquals("allow-forwarded")) {
            if (!var1.nextSegmentEquals("enable-forwarded-host")) {
                if (!var1.nextSegmentEquals("enable-forwarded-prefix")) {
                    if (!var1.nextSegmentEquals("forwarded-host-header")) {
                        if (!var1.nextSegmentEquals("forwarded-prefix-header")) {
                            if (!var1.nextSegmentEquals("proxy-address-forwarding")) {
                                ConfigDiagnostic.unknown(var1);
                            } else {
                                var1.next();
                                emptyParseKey(var0, var1);
                            }
                        } else {
                            var1.next();
                            emptyParseKey(var0, var1);
                        }
                    } else {
                        var1.next();
                        emptyParseKey(var0, var1);
                    }
                } else {
                    var1.next();
                    emptyParseKey(var0, var1);
                }
            } else {
                var1.next();
                emptyParseKey(var0, var1);
            }
        } else {
            var1.next();
            emptyParseKey(var0, var1);
        }
    }

    private static void siParseKey_http_same_site_cookie/* $FF was: siParseKey:http:same-site-cookie*/(SmallRyeConfig var0, NameIterator var1) {
        if (!var1.hasNext()) {
            ConfigDiagnostic.unknown(var1);
        } else if (!var1.hasNext()) {
            ConfigDiagnostic.unknown(var1);
        } else {
            var1.next();
            siParseKey:http:same-site-cookie:*(var0, var1);
        }
    }

    private static void siParseKey_http_same_site_cookie__/* $FF was: siParseKey:http:same-site-cookie:**/(SmallRyeConfig var0, NameIterator var1) {
        if (!var1.hasNext()) {
            ConfigDiagnostic.unknown(var1);
        } else if (!var1.nextSegmentEquals("add-secure-for-none")) {
            if (!var1.nextSegmentEquals("case-sensitive")) {
                if (!var1.nextSegmentEquals("enable-client-checker")) {
                    if (!var1.nextSegmentEquals("value")) {
                        ConfigDiagnostic.unknown(var1);
                    } else {
                        var1.next();
                        emptyParseKey(var0, var1);
                    }
                } else {
                    var1.next();
                    emptyParseKey(var0, var1);
                }
            } else {
                var1.next();
                emptyParseKey(var0, var1);
            }
        } else {
            var1.next();
            emptyParseKey(var0, var1);
        }
    }

    private static void siParseKey_live_reload/* $FF was: siParseKey:live-reload*/(SmallRyeConfig var0, NameIterator var1) {
        if (!var1.hasNext()) {
            ConfigDiagnostic.unknown(var1);
        } else if (!var1.nextSegmentEquals("password")) {
            if (!var1.nextSegmentEquals("url")) {
                if (!var1.nextSegmentEquals("watched-resources")) {
                    ConfigDiagnostic.unknown(var1);
                } else {
                    var1.next();
                    siParseKey:live-reload:watched-resources(var0, var1);
                }
            } else {
                var1.next();
                siParseKey:live-reload:url(var0, var1);
            }
        } else {
            var1.next();
            siParseKey:live-reload:password(var0, var1);
        }
    }

    private static void siParseKey_live_reload_password/* $FF was: siParseKey:live-reload:password*/(SmallRyeConfig var0, NameIterator var1) {
        if (var1.hasNext()) {
            ConfigDiagnostic.unknown(var1);
        }
    }

    private static void siParseKey_live_reload_url/* $FF was: siParseKey:live-reload:url*/(SmallRyeConfig var0, NameIterator var1) {
        if (var1.hasNext()) {
            ConfigDiagnostic.unknown(var1);
        }
    }

    private static void siParseKey_live_reload_watched_resources/* $FF was: siParseKey:live-reload:watched-resources*/(SmallRyeConfig var0, NameIterator var1) {
        if (var1.hasNext()) {
            ConfigDiagnostic.unknown(var1);
        }
    }

    private static void siParseKey_locales/* $FF was: siParseKey:locales*/(SmallRyeConfig var0, NameIterator var1) {
        if (var1.hasNext()) {
            ConfigDiagnostic.unknown(var1);
        }
    }

    private static void siParseKey_log/* $FF was: siParseKey:log*/(SmallRyeConfig var0, NameIterator var1) {
        if (!var1.hasNext()) {
            ConfigDiagnostic.unknown(var1);
        } else if (!var1.nextSegmentEquals("category")) {
            if (!var1.nextSegmentEquals("metrics")) {
                if (!var1.nextSegmentEquals("min-level")) {
                    if (!var1.nextSegmentEquals("console")) {
                        if (!var1.nextSegmentEquals("file")) {
                            if (!var1.nextSegmentEquals("filter")) {
                                if (!var1.nextSegmentEquals("handler")) {
                                    if (!var1.nextSegmentEquals("level")) {
                                        if (!var1.nextSegmentEquals("syslog")) {
                                            ConfigDiagnostic.unknown(var1);
                                        } else {
                                            var1.next();
                                            siParseKey:log:syslog(var0, var1);
                                        }
                                    } else {
                                        var1.next();
                                        emptyParseKey(var0, var1);
                                    }
                                } else {
                                    var1.next();
                                    siParseKey:log:handler(var0, var1);
                                }
                            } else {
                                var1.next();
                                siParseKey:log:filter(var0, var1);
                            }
                        } else {
                            var1.next();
                            siParseKey:log:file(var0, var1);
                        }
                    } else {
                        var1.next();
                        siParseKey:log:console(var0, var1);
                    }
                } else {
                    var1.next();
                    siParseKey:log:min-level(var0, var1);
                }
            } else {
                var1.next();
                siParseKey:log:metrics(var0, var1);
            }
        } else {
            var1.next();
            siParseKey:log:category(var0, var1);
        }
    }

    private static void siParseKey_log_category/* $FF was: siParseKey:log:category*/(SmallRyeConfig var0, NameIterator var1) {
        if (!var1.hasNext()) {
            ConfigDiagnostic.unknown(var1);
        } else if (!var1.hasNext()) {
            ConfigDiagnostic.unknown(var1);
        } else {
            var1.next();
            siParseKey:log:category:*(var0, var1);
        }
    }

    private static void siParseKey_log_category__/* $FF was: siParseKey:log:category:**/(SmallRyeConfig var0, NameIterator var1) {
        if (!var1.hasNext()) {
            ConfigDiagnostic.unknown(var1);
        } else if (!var1.nextSegmentEquals("min-level")) {
            if (!var1.nextSegmentEquals("handlers")) {
                if (!var1.nextSegmentEquals("level")) {
                    if (!var1.nextSegmentEquals("use-parent-handlers")) {
                        ConfigDiagnostic.unknown(var1);
                    } else {
                        var1.next();
                        emptyParseKey(var0, var1);
                    }
                } else {
                    var1.next();
                    emptyParseKey(var0, var1);
                }
            } else {
                var1.next();
                emptyParseKey(var0, var1);
            }
        } else {
            var1.next();
            siParseKey:log:category:*:min-level(var0, var1);
        }
    }

    private static void siParseKey_log_category___min_level/* $FF was: siParseKey:log:category:*:min-level*/(SmallRyeConfig var0, NameIterator var1) {
        if (!var1.hasNext()) {
            var1.previous();
            siGetEnclosing:log:LogBuildTimeConfig#categories:*:CategoryBuildTimeConfig#minLevel(var1, var0);
        } else {
            ConfigDiagnostic.unknown(var1);
        }
    }

    static Object siGetEnclosing_log_LogBuildTimeConfig_categories___CategoryBuildTimeConfig_minLevel/* $FF was: siGetEnclosing:log:LogBuildTimeConfig#categories:*:CategoryBuildTimeConfig#minLevel*/(NameIterator var0, SmallRyeConfig var1) {
        String var3 = var0.getPreviousSegment();
        var0.previous();
        Object var2 = siGetEnclosing:log:LogBuildTimeConfig#categories:*(var0, var1);
        var0.next();
        Object var4 = ((Map)var2).get(var3);
        if (var4 != null) {
            return var4;
        } else {
            CategoryBuildTimeConfig var7 = new CategoryBuildTimeConfig();
            String var5 = var0.getAllPreviousSegments();
            StringBuilder var6 = new StringBuilder(var5);
            initGroup$io$quarkus$runtime$logging$CategoryBuildTimeConfig(var1, var6, var7);
            ((Map)var2).put(var3, var7);
            return var7;
        }
    }

    static Object siGetEnclosing_log_LogBuildTimeConfig_categories__/* $FF was: siGetEnclosing:log:LogBuildTimeConfig#categories:**/(NameIterator var0, SmallRyeConfig var1) {
        var0.previous();
        Object var2 = siGetEnclosing:log:LogBuildTimeConfig#categories(var0, var1);
        var0.next();
        return ((LogBuildTimeConfig)var2).categories;
    }

    static Object siGetEnclosing_log_LogBuildTimeConfig_categories/* $FF was: siGetEnclosing:log:LogBuildTimeConfig#categories*/(NameIterator var0, SmallRyeConfig var1) {
        return LogBuildTimeConfig;
    }

    static void initGroup$io$quarkus$runtime$logging$CategoryBuildTimeConfig(SmallRyeConfig var0, StringBuilder var1, Object var2) {
        int var8 = var1.length();
        var1.append('.');
        var1.append("min-level");
        String var3 = var1.toString();
        Converter var4 = conv$7;

        try {
            Object var5 = var0.getValue(var3, var4);
            ((CategoryBuildTimeConfig)var2).minLevel = (InheritableLevel)var5;
        } catch (IllegalArgumentException var9) {
            ConfigDiagnostic.invalidValue(var3, var9);
        } catch (NoSuchElementException var10) {
            ConfigDiagnostic.missingValue(var3, var10);
        }

        var1.setLength(var8);
    }

    private static void siParseKey_log_metrics/* $FF was: siParseKey:log:metrics*/(SmallRyeConfig var0, NameIterator var1) {
        if (!var1.hasNext()) {
            ConfigDiagnostic.unknown(var1);
        } else if (!var1.nextSegmentEquals("enabled")) {
            ConfigDiagnostic.unknown(var1);
        } else {
            var1.next();
            siParseKey:log:metrics:enabled(var0, var1);
        }
    }

    private static void siParseKey_log_metrics_enabled/* $FF was: siParseKey:log:metrics:enabled*/(SmallRyeConfig var0, NameIterator var1) {
        if (var1.hasNext()) {
            ConfigDiagnostic.unknown(var1);
        }
    }

    private static void siParseKey_log_min_level/* $FF was: siParseKey:log:min-level*/(SmallRyeConfig var0, NameIterator var1) {
        if (var1.hasNext()) {
            ConfigDiagnostic.unknown(var1);
        }
    }

    private static void siParseKey_log_console/* $FF was: siParseKey:log:console*/(SmallRyeConfig var0, NameIterator var1) {
        if (!var1.hasNext()) {
            ConfigDiagnostic.unknown(var1);
        } else if (!var1.nextSegmentEquals("async")) {
            if (!var1.nextSegmentEquals("color")) {
                if (!var1.nextSegmentEquals("darken")) {
                    if (!var1.nextSegmentEquals("enable")) {
                        if (!var1.nextSegmentEquals("format")) {
                            if (!var1.nextSegmentEquals("level")) {
                                ConfigDiagnostic.unknown(var1);
                            } else {
                                var1.next();
                                emptyParseKey(var0, var1);
                            }
                        } else {
                            var1.next();
                            emptyParseKey(var0, var1);
                        }
                    } else {
                        var1.next();
                        emptyParseKey(var0, var1);
                    }
                } else {
                    var1.next();
                    emptyParseKey(var0, var1);
                }
            } else {
                var1.next();
                emptyParseKey(var0, var1);
            }
        } else {
            var1.next();
            siParseKey:log:console:async(var0, var1);
        }
    }

    private static void siParseKey_log_console_async/* $FF was: siParseKey:log:console:async*/(SmallRyeConfig var0, NameIterator var1) {
        if (var1.hasNext()) {
            if (!var1.nextSegmentEquals("overflow")) {
                if (!var1.nextSegmentEquals("queue-length")) {
                    ConfigDiagnostic.unknown(var1);
                } else {
                    var1.next();
                    emptyParseKey(var0, var1);
                }
            } else {
                var1.next();
                emptyParseKey(var0, var1);
            }
        }
    }

    private static void siParseKey_log_file/* $FF was: siParseKey:log:file*/(SmallRyeConfig var0, NameIterator var1) {
        if (!var1.hasNext()) {
            ConfigDiagnostic.unknown(var1);
        } else if (!var1.nextSegmentEquals("async")) {
            if (!var1.nextSegmentEquals("enable")) {
                if (!var1.nextSegmentEquals("format")) {
                    if (!var1.nextSegmentEquals("level")) {
                        if (!var1.nextSegmentEquals("path")) {
                            if (!var1.nextSegmentEquals("rotation")) {
                                ConfigDiagnostic.unknown(var1);
                            } else {
                                var1.next();
                                siParseKey:log:file:rotation(var0, var1);
                            }
                        } else {
                            var1.next();
                            emptyParseKey(var0, var1);
                        }
                    } else {
                        var1.next();
                        emptyParseKey(var0, var1);
                    }
                } else {
                    var1.next();
                    emptyParseKey(var0, var1);
                }
            } else {
                var1.next();
                emptyParseKey(var0, var1);
            }
        } else {
            var1.next();
            siParseKey:log:file:async(var0, var1);
        }
    }

    private static void siParseKey_log_file_async/* $FF was: siParseKey:log:file:async*/(SmallRyeConfig var0, NameIterator var1) {
        if (var1.hasNext()) {
            if (!var1.nextSegmentEquals("overflow")) {
                if (!var1.nextSegmentEquals("queue-length")) {
                    ConfigDiagnostic.unknown(var1);
                } else {
                    var1.next();
                    emptyParseKey(var0, var1);
                }
            } else {
                var1.next();
                emptyParseKey(var0, var1);
            }
        }
    }

    private static void siParseKey_log_file_rotation/* $FF was: siParseKey:log:file:rotation*/(SmallRyeConfig var0, NameIterator var1) {
        if (!var1.hasNext()) {
            ConfigDiagnostic.unknown(var1);
        } else if (!var1.nextSegmentEquals("file-suffix")) {
            if (!var1.nextSegmentEquals("max-backup-index")) {
                if (!var1.nextSegmentEquals("max-file-size")) {
                    if (!var1.nextSegmentEquals("rotate-on-boot")) {
                        ConfigDiagnostic.unknown(var1);
                    } else {
                        var1.next();
                        emptyParseKey(var0, var1);
                    }
                } else {
                    var1.next();
                    emptyParseKey(var0, var1);
                }
            } else {
                var1.next();
                emptyParseKey(var0, var1);
            }
        } else {
            var1.next();
            emptyParseKey(var0, var1);
        }
    }

    private static void siParseKey_log_filter/* $FF was: siParseKey:log:filter*/(SmallRyeConfig var0, NameIterator var1) {
        if (!var1.hasNext()) {
            ConfigDiagnostic.unknown(var1);
        } else if (!var1.hasNext()) {
            ConfigDiagnostic.unknown(var1);
        } else {
            var1.next();
            siParseKey:log:filter:*(var0, var1);
        }
    }

    private static void siParseKey_log_filter__/* $FF was: siParseKey:log:filter:**/(SmallRyeConfig var0, NameIterator var1) {
        if (!var1.hasNext()) {
            ConfigDiagnostic.unknown(var1);
        } else if (!var1.nextSegmentEquals("if-starts-with")) {
            if (!var1.nextSegmentEquals("target-level")) {
                ConfigDiagnostic.unknown(var1);
            } else {
                var1.next();
                emptyParseKey(var0, var1);
            }
        } else {
            var1.next();
            emptyParseKey(var0, var1);
        }
    }

    private static void siParseKey_log_handler/* $FF was: siParseKey:log:handler*/(SmallRyeConfig var0, NameIterator var1) {
        if (!var1.hasNext()) {
            ConfigDiagnostic.unknown(var1);
        } else if (!var1.nextSegmentEquals("console")) {
            if (!var1.nextSegmentEquals("file")) {
                if (!var1.nextSegmentEquals("syslog")) {
                    ConfigDiagnostic.unknown(var1);
                } else {
                    var1.next();
                    siParseKey:log:handler:syslog(var0, var1);
                }
            } else {
                var1.next();
                siParseKey:log:handler:file(var0, var1);
            }
        } else {
            var1.next();
            siParseKey:log:handler:console(var0, var1);
        }
    }

    private static void siParseKey_log_handler_console/* $FF was: siParseKey:log:handler:console*/(SmallRyeConfig var0, NameIterator var1) {
        if (!var1.hasNext()) {
            ConfigDiagnostic.unknown(var1);
        } else if (!var1.hasNext()) {
            ConfigDiagnostic.unknown(var1);
        } else {
            var1.next();
            siParseKey:log:handler:console:*(var0, var1);
        }
    }

    private static void siParseKey_log_handler_console__/* $FF was: siParseKey:log:handler:console:**/(SmallRyeConfig var0, NameIterator var1) {
        if (!var1.hasNext()) {
            ConfigDiagnostic.unknown(var1);
        } else if (!var1.nextSegmentEquals("async")) {
            if (!var1.nextSegmentEquals("color")) {
                if (!var1.nextSegmentEquals("darken")) {
                    if (!var1.nextSegmentEquals("enable")) {
                        if (!var1.nextSegmentEquals("format")) {
                            if (!var1.nextSegmentEquals("level")) {
                                ConfigDiagnostic.unknown(var1);
                            } else {
                                var1.next();
                                emptyParseKey(var0, var1);
                            }
                        } else {
                            var1.next();
                            emptyParseKey(var0, var1);
                        }
                    } else {
                        var1.next();
                        emptyParseKey(var0, var1);
                    }
                } else {
                    var1.next();
                    emptyParseKey(var0, var1);
                }
            } else {
                var1.next();
                emptyParseKey(var0, var1);
            }
        } else {
            var1.next();
            siParseKey:log:handler:console:*:async(var0, var1);
        }
    }

    private static void siParseKey_log_handler_console___async/* $FF was: siParseKey:log:handler:console:*:async*/(SmallRyeConfig var0, NameIterator var1) {
        if (var1.hasNext()) {
            if (!var1.nextSegmentEquals("overflow")) {
                if (!var1.nextSegmentEquals("queue-length")) {
                    ConfigDiagnostic.unknown(var1);
                } else {
                    var1.next();
                    emptyParseKey(var0, var1);
                }
            } else {
                var1.next();
                emptyParseKey(var0, var1);
            }
        }
    }

    private static void siParseKey_log_handler_file/* $FF was: siParseKey:log:handler:file*/(SmallRyeConfig var0, NameIterator var1) {
        if (!var1.hasNext()) {
            ConfigDiagnostic.unknown(var1);
        } else if (!var1.hasNext()) {
            ConfigDiagnostic.unknown(var1);
        } else {
            var1.next();
            siParseKey:log:handler:file:*(var0, var1);
        }
    }

    private static void siParseKey_log_handler_file__/* $FF was: siParseKey:log:handler:file:**/(SmallRyeConfig var0, NameIterator var1) {
        if (!var1.hasNext()) {
            ConfigDiagnostic.unknown(var1);
        } else if (!var1.nextSegmentEquals("async")) {
            if (!var1.nextSegmentEquals("enable")) {
                if (!var1.nextSegmentEquals("format")) {
                    if (!var1.nextSegmentEquals("level")) {
                        if (!var1.nextSegmentEquals("path")) {
                            if (!var1.nextSegmentEquals("rotation")) {
                                ConfigDiagnostic.unknown(var1);
                            } else {
                                var1.next();
                                siParseKey:log:handler:file:*:rotation(var0, var1);
                            }
                        } else {
                            var1.next();
                            emptyParseKey(var0, var1);
                        }
                    } else {
                        var1.next();
                        emptyParseKey(var0, var1);
                    }
                } else {
                    var1.next();
                    emptyParseKey(var0, var1);
                }
            } else {
                var1.next();
                emptyParseKey(var0, var1);
            }
        } else {
            var1.next();
            siParseKey:log:handler:file:*:async(var0, var1);
        }
    }

    private static void siParseKey_log_handler_file___async/* $FF was: siParseKey:log:handler:file:*:async*/(SmallRyeConfig var0, NameIterator var1) {
        if (var1.hasNext()) {
            if (!var1.nextSegmentEquals("overflow")) {
                if (!var1.nextSegmentEquals("queue-length")) {
                    ConfigDiagnostic.unknown(var1);
                } else {
                    var1.next();
                    emptyParseKey(var0, var1);
                }
            } else {
                var1.next();
                emptyParseKey(var0, var1);
            }
        }
    }

    private static void siParseKey_log_handler_file___rotation/* $FF was: siParseKey:log:handler:file:*:rotation*/(SmallRyeConfig var0, NameIterator var1) {
        if (!var1.hasNext()) {
            ConfigDiagnostic.unknown(var1);
        } else if (!var1.nextSegmentEquals("file-suffix")) {
            if (!var1.nextSegmentEquals("max-backup-index")) {
                if (!var1.nextSegmentEquals("max-file-size")) {
                    if (!var1.nextSegmentEquals("rotate-on-boot")) {
                        ConfigDiagnostic.unknown(var1);
                    } else {
                        var1.next();
                        emptyParseKey(var0, var1);
                    }
                } else {
                    var1.next();
                    emptyParseKey(var0, var1);
                }
            } else {
                var1.next();
                emptyParseKey(var0, var1);
            }
        } else {
            var1.next();
            emptyParseKey(var0, var1);
        }
    }

    private static void siParseKey_log_handler_syslog/* $FF was: siParseKey:log:handler:syslog*/(SmallRyeConfig var0, NameIterator var1) {
        if (!var1.hasNext()) {
            ConfigDiagnostic.unknown(var1);
        } else if (!var1.hasNext()) {
            ConfigDiagnostic.unknown(var1);
        } else {
            var1.next();
            siParseKey:log:handler:syslog:*(var0, var1);
        }
    }

    private static void siParseKey_log_handler_syslog__/* $FF was: siParseKey:log:handler:syslog:**/(SmallRyeConfig var0, NameIterator var1) {
        if (!var1.hasNext()) {
            ConfigDiagnostic.unknown(var1);
        } else if (!var1.nextSegmentEquals("app-name")) {
            if (!var1.nextSegmentEquals("async")) {
                if (!var1.nextSegmentEquals("block-on-reconnect")) {
                    if (!var1.nextSegmentEquals("enable")) {
                        if (!var1.nextSegmentEquals("endpoint")) {
                            if (!var1.nextSegmentEquals("facility")) {
                                if (!var1.nextSegmentEquals("format")) {
                                    if (!var1.nextSegmentEquals("hostname")) {
                                        if (!var1.nextSegmentEquals("level")) {
                                            if (!var1.nextSegmentEquals("protocol")) {
                                                if (!var1.nextSegmentEquals("syslog-type")) {
                                                    if (!var1.nextSegmentEquals("truncate")) {
                                                        if (!var1.nextSegmentEquals("use-counting-framing")) {
                                                            ConfigDiagnostic.unknown(var1);
                                                        } else {
                                                            var1.next();
                                                            emptyParseKey(var0, var1);
                                                        }
                                                    } else {
                                                        var1.next();
                                                        emptyParseKey(var0, var1);
                                                    }
                                                } else {
                                                    var1.next();
                                                    emptyParseKey(var0, var1);
                                                }
                                            } else {
                                                var1.next();
                                                emptyParseKey(var0, var1);
                                            }
                                        } else {
                                            var1.next();
                                            emptyParseKey(var0, var1);
                                        }
                                    } else {
                                        var1.next();
                                        emptyParseKey(var0, var1);
                                    }
                                } else {
                                    var1.next();
                                    emptyParseKey(var0, var1);
                                }
                            } else {
                                var1.next();
                                emptyParseKey(var0, var1);
                            }
                        } else {
                            var1.next();
                            emptyParseKey(var0, var1);
                        }
                    } else {
                        var1.next();
                        emptyParseKey(var0, var1);
                    }
                } else {
                    var1.next();
                    emptyParseKey(var0, var1);
                }
            } else {
                var1.next();
                siParseKey:log:handler:syslog:*:async(var0, var1);
            }
        } else {
            var1.next();
            emptyParseKey(var0, var1);
        }
    }

    private static void siParseKey_log_handler_syslog___async/* $FF was: siParseKey:log:handler:syslog:*:async*/(SmallRyeConfig var0, NameIterator var1) {
        if (var1.hasNext()) {
            if (!var1.nextSegmentEquals("overflow")) {
                if (!var1.nextSegmentEquals("queue-length")) {
                    ConfigDiagnostic.unknown(var1);
                } else {
                    var1.next();
                    emptyParseKey(var0, var1);
                }
            } else {
                var1.next();
                emptyParseKey(var0, var1);
            }
        }
    }

    private static void siParseKey_log_syslog/* $FF was: siParseKey:log:syslog*/(SmallRyeConfig var0, NameIterator var1) {
        if (!var1.hasNext()) {
            ConfigDiagnostic.unknown(var1);
        } else if (!var1.nextSegmentEquals("app-name")) {
            if (!var1.nextSegmentEquals("async")) {
                if (!var1.nextSegmentEquals("block-on-reconnect")) {
                    if (!var1.nextSegmentEquals("enable")) {
                        if (!var1.nextSegmentEquals("endpoint")) {
                            if (!var1.nextSegmentEquals("facility")) {
                                if (!var1.nextSegmentEquals("format")) {
                                    if (!var1.nextSegmentEquals("hostname")) {
                                        if (!var1.nextSegmentEquals("level")) {
                                            if (!var1.nextSegmentEquals("protocol")) {
                                                if (!var1.nextSegmentEquals("syslog-type")) {
                                                    if (!var1.nextSegmentEquals("truncate")) {
                                                        if (!var1.nextSegmentEquals("use-counting-framing")) {
                                                            ConfigDiagnostic.unknown(var1);
                                                        } else {
                                                            var1.next();
                                                            emptyParseKey(var0, var1);
                                                        }
                                                    } else {
                                                        var1.next();
                                                        emptyParseKey(var0, var1);
                                                    }
                                                } else {
                                                    var1.next();
                                                    emptyParseKey(var0, var1);
                                                }
                                            } else {
                                                var1.next();
                                                emptyParseKey(var0, var1);
                                            }
                                        } else {
                                            var1.next();
                                            emptyParseKey(var0, var1);
                                        }
                                    } else {
                                        var1.next();
                                        emptyParseKey(var0, var1);
                                    }
                                } else {
                                    var1.next();
                                    emptyParseKey(var0, var1);
                                }
                            } else {
                                var1.next();
                                emptyParseKey(var0, var1);
                            }
                        } else {
                            var1.next();
                            emptyParseKey(var0, var1);
                        }
                    } else {
                        var1.next();
                        emptyParseKey(var0, var1);
                    }
                } else {
                    var1.next();
                    emptyParseKey(var0, var1);
                }
            } else {
                var1.next();
                siParseKey:log:syslog:async(var0, var1);
            }
        } else {
            var1.next();
            emptyParseKey(var0, var1);
        }
    }

    private static void siParseKey_log_syslog_async/* $FF was: siParseKey:log:syslog:async*/(SmallRyeConfig var0, NameIterator var1) {
        if (var1.hasNext()) {
            if (!var1.nextSegmentEquals("overflow")) {
                if (!var1.nextSegmentEquals("queue-length")) {
                    ConfigDiagnostic.unknown(var1);
                } else {
                    var1.next();
                    emptyParseKey(var0, var1);
                }
            } else {
                var1.next();
                emptyParseKey(var0, var1);
            }
        }
    }

    private static void siParseKey_security/* $FF was: siParseKey:security*/(SmallRyeConfig var0, NameIterator var1) {
        if (!var1.hasNext()) {
            ConfigDiagnostic.unknown(var1);
        } else if (!var1.nextSegmentEquals("jaxrs")) {
            ConfigDiagnostic.unknown(var1);
        } else {
            var1.next();
            siParseKey:security:jaxrs(var0, var1);
        }
    }

    private static void siParseKey_security_jaxrs/* $FF was: siParseKey:security:jaxrs*/(SmallRyeConfig var0, NameIterator var1) {
        if (!var1.hasNext()) {
            ConfigDiagnostic.unknown(var1);
        } else if (!var1.nextSegmentEquals("deny-unannotated-endpoints")) {
            ConfigDiagnostic.unknown(var1);
        } else {
            var1.next();
            siParseKey:security:jaxrs:deny-unannotated-endpoints(var0, var1);
        }
    }

    private static void siParseKey_security_jaxrs_deny_unannotated_endpoints/* $FF was: siParseKey:security:jaxrs:deny-unannotated-endpoints*/(SmallRyeConfig var0, NameIterator var1) {
        if (var1.hasNext()) {
            ConfigDiagnostic.unknown(var1);
        }
    }

    private static void siParseKey_tls/* $FF was: siParseKey:tls*/(SmallRyeConfig var0, NameIterator var1) {
        if (!var1.hasNext()) {
            ConfigDiagnostic.unknown(var1);
        } else if (!var1.nextSegmentEquals("trust-all")) {
            ConfigDiagnostic.unknown(var1);
        } else {
            var1.next();
            siParseKey:tls:trust-all(var0, var1);
        }
    }

    private static void siParseKey_tls_trust_all/* $FF was: siParseKey:tls:trust-all*/(SmallRyeConfig var0, NameIterator var1) {
        if (var1.hasNext()) {
            ConfigDiagnostic.unknown(var1);
        }
    }

    private static void siParseKey_arc/* $FF was: siParseKey:arc*/(SmallRyeConfig var0, NameIterator var1) {
        if (!var1.hasNext()) {
            ConfigDiagnostic.unknown(var1);
        } else if (!var1.nextSegmentEquals("auto-inject-fields")) {
            if (!var1.nextSegmentEquals("auto-producer-methods")) {
                if (!var1.nextSegmentEquals("config-properties-default-naming-strategy")) {
                    if (!var1.nextSegmentEquals("detect-unused-false-positives")) {
                        if (!var1.nextSegmentEquals("detect-wrong-annotations")) {
                            if (!var1.nextSegmentEquals("exclude-dependency")) {
                                if (!var1.nextSegmentEquals("exclude-types")) {
                                    if (!var1.nextSegmentEquals("remove-unused-beans")) {
                                        if (!var1.nextSegmentEquals("selected-alternatives")) {
                                            if (!var1.nextSegmentEquals("transform-unproxyable-classes")) {
                                                if (!var1.nextSegmentEquals("unremovable-types")) {
                                                    ConfigDiagnostic.unknown(var1);
                                                } else {
                                                    var1.next();
                                                    emptyParseKey(var0, var1);
                                                }
                                            } else {
                                                var1.next();
                                                emptyParseKey(var0, var1);
                                            }
                                        } else {
                                            var1.next();
                                            emptyParseKey(var0, var1);
                                        }
                                    } else {
                                        var1.next();
                                        emptyParseKey(var0, var1);
                                    }
                                } else {
                                    var1.next();
                                    emptyParseKey(var0, var1);
                                }
                            } else {
                                var1.next();
                                siParseKey:arc:exclude-dependency(var0, var1);
                            }
                        } else {
                            var1.next();
                            emptyParseKey(var0, var1);
                        }
                    } else {
                        var1.next();
                        emptyParseKey(var0, var1);
                    }
                } else {
                    var1.next();
                    emptyParseKey(var0, var1);
                }
            } else {
                var1.next();
                emptyParseKey(var0, var1);
            }
        } else {
            var1.next();
            emptyParseKey(var0, var1);
        }
    }

    private static void siParseKey_arc_exclude_dependency/* $FF was: siParseKey:arc:exclude-dependency*/(SmallRyeConfig var0, NameIterator var1) {
        if (!var1.hasNext()) {
            ConfigDiagnostic.unknown(var1);
        } else if (!var1.hasNext()) {
            ConfigDiagnostic.unknown(var1);
        } else {
            var1.next();
            siParseKey:arc:exclude-dependency:*(var0, var1);
        }
    }

    private static void siParseKey_arc_exclude_dependency__/* $FF was: siParseKey:arc:exclude-dependency:**/(SmallRyeConfig var0, NameIterator var1) {
        if (!var1.hasNext()) {
            ConfigDiagnostic.unknown(var1);
        } else if (!var1.nextSegmentEquals("artifact-id")) {
            if (!var1.nextSegmentEquals("classifier")) {
                if (!var1.nextSegmentEquals("group-id")) {
                    ConfigDiagnostic.unknown(var1);
                } else {
                    var1.next();
                    emptyParseKey(var0, var1);
                }
            } else {
                var1.next();
                emptyParseKey(var0, var1);
            }
        } else {
            var1.next();
            emptyParseKey(var0, var1);
        }
    }

    private static void siParseKey_banner/* $FF was: siParseKey:banner*/(SmallRyeConfig var0, NameIterator var1) {
        if (!var1.hasNext()) {
            ConfigDiagnostic.unknown(var1);
        } else if (!var1.nextSegmentEquals("enabled")) {
            if (!var1.nextSegmentEquals("path")) {
                ConfigDiagnostic.unknown(var1);
            } else {
                var1.next();
                emptyParseKey(var0, var1);
            }
        } else {
            var1.next();
            emptyParseKey(var0, var1);
        }
    }

    private static void siParseKey_class_loading/* $FF was: siParseKey:class-loading*/(SmallRyeConfig var0, NameIterator var1) {
        if (!var1.hasNext()) {
            ConfigDiagnostic.unknown(var1);
        } else if (!var1.nextSegmentEquals("parent-first-artifacts")) {
            if (!var1.nextSegmentEquals("reloadable-artifacts")) {
                ConfigDiagnostic.unknown(var1);
            } else {
                var1.next();
                emptyParseKey(var0, var1);
            }
        } else {
            var1.next();
            emptyParseKey(var0, var1);
        }
    }

    private static void siParseKey_configuration/* $FF was: siParseKey:configuration*/(SmallRyeConfig var0, NameIterator var1) {
        if (!var1.hasNext()) {
            ConfigDiagnostic.unknown(var1);
        } else if (!var1.nextSegmentEquals("build-time-mismatch-at-runtime")) {
            ConfigDiagnostic.unknown(var1);
        } else {
            var1.next();
            emptyParseKey(var0, var1);
        }
    }

    private static void siParseKey_debug/* $FF was: siParseKey:debug*/(SmallRyeConfig var0, NameIterator var1) {
        if (!var1.hasNext()) {
            ConfigDiagnostic.unknown(var1);
        } else if (!var1.nextSegmentEquals("generated-classes-dir")) {
            if (!var1.nextSegmentEquals("reflection")) {
                ConfigDiagnostic.unknown(var1);
            } else {
                var1.next();
                emptyParseKey(var0, var1);
            }
        } else {
            var1.next();
            emptyParseKey(var0, var1);
        }
    }

    private static void siParseKey_dev/* $FF was: siParseKey:dev*/(SmallRyeConfig var0, NameIterator var1) {
        if (!var1.hasNext()) {
            ConfigDiagnostic.unknown(var1);
        } else if (!var1.nextSegmentEquals("instrumentation")) {
            ConfigDiagnostic.unknown(var1);
        } else {
            var1.next();
            emptyParseKey(var0, var1);
        }
    }

    private static void siParseKey_index_dependency/* $FF was: siParseKey:index-dependency*/(SmallRyeConfig var0, NameIterator var1) {
        if (!var1.hasNext()) {
            ConfigDiagnostic.unknown(var1);
        } else if (!var1.hasNext()) {
            ConfigDiagnostic.unknown(var1);
        } else {
            var1.next();
            siParseKey:index-dependency:*(var0, var1);
        }
    }

    private static void siParseKey_index_dependency__/* $FF was: siParseKey:index-dependency:**/(SmallRyeConfig var0, NameIterator var1) {
        if (!var1.hasNext()) {
            ConfigDiagnostic.unknown(var1);
        } else if (!var1.nextSegmentEquals("artifact-id")) {
            if (!var1.nextSegmentEquals("classifier")) {
                if (!var1.nextSegmentEquals("group-id")) {
                    ConfigDiagnostic.unknown(var1);
                } else {
                    var1.next();
                    emptyParseKey(var0, var1);
                }
            } else {
                var1.next();
                emptyParseKey(var0, var1);
            }
        } else {
            var1.next();
            emptyParseKey(var0, var1);
        }
    }

    private static void siParseKey_jackson/* $FF was: siParseKey:jackson*/(SmallRyeConfig var0, NameIterator var1) {
        if (!var1.hasNext()) {
            ConfigDiagnostic.unknown(var1);
        } else if (!var1.nextSegmentEquals("fail-on-unknown-properties")) {
            ConfigDiagnostic.unknown(var1);
        } else {
            var1.next();
            emptyParseKey(var0, var1);
        }
    }

    private static void siParseKey_jni/* $FF was: siParseKey:jni*/(SmallRyeConfig var0, NameIterator var1) {
        if (!var1.hasNext()) {
            ConfigDiagnostic.unknown(var1);
        } else if (!var1.nextSegmentEquals("enable")) {
            if (!var1.nextSegmentEquals("library-paths")) {
                ConfigDiagnostic.unknown(var1);
            } else {
                var1.next();
                emptyParseKey(var0, var1);
            }
        } else {
            var1.next();
            emptyParseKey(var0, var1);
        }
    }

    private static void siParseKey_native/* $FF was: siParseKey:native*/(SmallRyeConfig var0, NameIterator var1) {
        if (!var1.hasNext()) {
            ConfigDiagnostic.unknown(var1);
        } else if (!var1.nextSegmentEquals("add-all-charsets")) {
            if (!var1.nextSegmentEquals("additional-build-args")) {
                if (!var1.nextSegmentEquals("auto-service-loader-registration")) {
                    if (!var1.nextSegmentEquals("builder-image")) {
                        if (!var1.nextSegmentEquals("cleanup-server")) {
                            if (!var1.nextSegmentEquals("container-build")) {
                                if (!var1.nextSegmentEquals("container-runtime")) {
                                    if (!var1.nextSegmentEquals("container-runtime-options")) {
                                        if (!var1.nextSegmentEquals("debug")) {
                                            if (!var1.nextSegmentEquals("debug-build-process")) {
                                                if (!var1.nextSegmentEquals("dump-proxies")) {
                                                    if (!var1.nextSegmentEquals("enable-all-security-services")) {
                                                        if (!var1.nextSegmentEquals("enable-dashboard-dump")) {
                                                            if (!var1.nextSegmentEquals("enable-fallback-images")) {
                                                                if (!var1.nextSegmentEquals("enable-http-url-handler")) {
                                                                    if (!var1.nextSegmentEquals("enable-https-url-handler")) {
                                                                        if (!var1.nextSegmentEquals("enable-isolates")) {
                                                                            if (!var1.nextSegmentEquals("enable-jni")) {
                                                                                if (!var1.nextSegmentEquals("enable-reports")) {
                                                                                    if (!var1.nextSegmentEquals("enable-server")) {
                                                                                        if (!var1.nextSegmentEquals("enable-vm-inspection")) {
                                                                                            if (!var1.nextSegmentEquals("file-encoding")) {
                                                                                                if (!var1.nextSegmentEquals("full-stack-traces")) {
                                                                                                    if (!var1.nextSegmentEquals("graalvm-home")) {
                                                                                                        if (!var1.nextSegmentEquals("java-home")) {
                                                                                                            if (!var1.nextSegmentEquals("native-image-xmx")) {
                                                                                                                if (!var1.nextSegmentEquals("publish-debug-build-process-port")) {
                                                                                                                    if (!var1.nextSegmentEquals("remote-container-build")) {
                                                                                                                        if (!var1.nextSegmentEquals("report-errors-at-runtime")) {
                                                                                                                            if (!var1.nextSegmentEquals("report-exception-stack-traces")) {
                                                                                                                                if (!var1.nextSegmentEquals("resources")) {
                                                                                                                                    if (!var1.nextSegmentEquals("user-country")) {
                                                                                                                                        if (!var1.nextSegmentEquals("user-language")) {
                                                                                                                                            ConfigDiagnostic.unknown(var1);
                                                                                                                                        } else {
                                                                                                                                            var1.next();
                                                                                                                                            emptyParseKey(var0, var1);
                                                                                                                                        }
                                                                                                                                    } else {
                                                                                                                                        var1.next();
                                                                                                                                        emptyParseKey(var0, var1);
                                                                                                                                    }
                                                                                                                                } else {
                                                                                                                                    var1.next();
                                                                                                                                    siParseKey:native:resources(var0, var1);
                                                                                                                                }
                                                                                                                            } else {
                                                                                                                                var1.next();
                                                                                                                                emptyParseKey(var0, var1);
                                                                                                                            }
                                                                                                                        } else {
                                                                                                                            var1.next();
                                                                                                                            emptyParseKey(var0, var1);
                                                                                                                        }
                                                                                                                    } else {
                                                                                                                        var1.next();
                                                                                                                        emptyParseKey(var0, var1);
                                                                                                                    }
                                                                                                                } else {
                                                                                                                    var1.next();
                                                                                                                    emptyParseKey(var0, var1);
                                                                                                                }
                                                                                                            } else {
                                                                                                                var1.next();
                                                                                                                emptyParseKey(var0, var1);
                                                                                                            }
                                                                                                        } else {
                                                                                                            var1.next();
                                                                                                            emptyParseKey(var0, var1);
                                                                                                        }
                                                                                                    } else {
                                                                                                        var1.next();
                                                                                                        emptyParseKey(var0, var1);
                                                                                                    }
                                                                                                } else {
                                                                                                    var1.next();
                                                                                                    emptyParseKey(var0, var1);
                                                                                                }
                                                                                            } else {
                                                                                                var1.next();
                                                                                                emptyParseKey(var0, var1);
                                                                                            }
                                                                                        } else {
                                                                                            var1.next();
                                                                                            emptyParseKey(var0, var1);
                                                                                        }
                                                                                    } else {
                                                                                        var1.next();
                                                                                        emptyParseKey(var0, var1);
                                                                                    }
                                                                                } else {
                                                                                    var1.next();
                                                                                    emptyParseKey(var0, var1);
                                                                                }
                                                                            } else {
                                                                                var1.next();
                                                                                emptyParseKey(var0, var1);
                                                                            }
                                                                        } else {
                                                                            var1.next();
                                                                            emptyParseKey(var0, var1);
                                                                        }
                                                                    } else {
                                                                        var1.next();
                                                                        emptyParseKey(var0, var1);
                                                                    }
                                                                } else {
                                                                    var1.next();
                                                                    emptyParseKey(var0, var1);
                                                                }
                                                            } else {
                                                                var1.next();
                                                                emptyParseKey(var0, var1);
                                                            }
                                                        } else {
                                                            var1.next();
                                                            emptyParseKey(var0, var1);
                                                        }
                                                    } else {
                                                        var1.next();
                                                        emptyParseKey(var0, var1);
                                                    }
                                                } else {
                                                    var1.next();
                                                    emptyParseKey(var0, var1);
                                                }
                                            } else {
                                                var1.next();
                                                emptyParseKey(var0, var1);
                                            }
                                        } else {
                                            var1.next();
                                            siParseKey:native:debug(var0, var1);
                                        }
                                    } else {
                                        var1.next();
                                        emptyParseKey(var0, var1);
                                    }
                                } else {
                                    var1.next();
                                    emptyParseKey(var0, var1);
                                }
                            } else {
                                var1.next();
                                emptyParseKey(var0, var1);
                            }
                        } else {
                            var1.next();
                            emptyParseKey(var0, var1);
                        }
                    } else {
                        var1.next();
                        emptyParseKey(var0, var1);
                    }
                } else {
                    var1.next();
                    emptyParseKey(var0, var1);
                }
            } else {
                var1.next();
                emptyParseKey(var0, var1);
            }
        } else {
            var1.next();
            emptyParseKey(var0, var1);
        }
    }

    private static void siParseKey_native_debug/* $FF was: siParseKey:native:debug*/(SmallRyeConfig var0, NameIterator var1) {
        if (!var1.hasNext()) {
            ConfigDiagnostic.unknown(var1);
        } else if (!var1.nextSegmentEquals("enabled")) {
            ConfigDiagnostic.unknown(var1);
        } else {
            var1.next();
            emptyParseKey(var0, var1);
        }
    }

    private static void siParseKey_native_resources/* $FF was: siParseKey:native:resources*/(SmallRyeConfig var0, NameIterator var1) {
        if (!var1.hasNext()) {
            ConfigDiagnostic.unknown(var1);
        } else if (!var1.nextSegmentEquals("excludes")) {
            if (!var1.nextSegmentEquals("includes")) {
                ConfigDiagnostic.unknown(var1);
            } else {
                var1.next();
                emptyParseKey(var0, var1);
            }
        } else {
            var1.next();
            emptyParseKey(var0, var1);
        }
    }

    private static void siParseKey_package/* $FF was: siParseKey:package*/(SmallRyeConfig var0, NameIterator var1) {
        if (!var1.hasNext()) {
            ConfigDiagnostic.unknown(var1);
        } else if (!var1.nextSegmentEquals("appcds-builder-image")) {
            if (!var1.nextSegmentEquals("create-appcds")) {
                if (!var1.nextSegmentEquals("main-class")) {
                    if (!var1.nextSegmentEquals("manifest")) {
                        if (!var1.nextSegmentEquals("output-directory")) {
                            if (!var1.nextSegmentEquals("output-name")) {
                                if (!var1.nextSegmentEquals("runner-suffix")) {
                                    if (!var1.nextSegmentEquals("type")) {
                                        if (!var1.nextSegmentEquals("uber-jar")) {
                                            if (!var1.nextSegmentEquals("user-configured-ignored-entries")) {
                                                if (!var1.nextSegmentEquals("user-providers-directory")) {
                                                    ConfigDiagnostic.unknown(var1);
                                                } else {
                                                    var1.next();
                                                    emptyParseKey(var0, var1);
                                                }
                                            } else {
                                                var1.next();
                                                emptyParseKey(var0, var1);
                                            }
                                        } else {
                                            var1.next();
                                            emptyParseKey(var0, var1);
                                        }
                                    } else {
                                        var1.next();
                                        emptyParseKey(var0, var1);
                                    }
                                } else {
                                    var1.next();
                                    emptyParseKey(var0, var1);
                                }
                            } else {
                                var1.next();
                                emptyParseKey(var0, var1);
                            }
                        } else {
                            var1.next();
                            emptyParseKey(var0, var1);
                        }
                    } else {
                        var1.next();
                        siParseKey:package:manifest(var0, var1);
                    }
                } else {
                    var1.next();
                    emptyParseKey(var0, var1);
                }
            } else {
                var1.next();
                emptyParseKey(var0, var1);
            }
        } else {
            var1.next();
            emptyParseKey(var0, var1);
        }
    }

    private static void siParseKey_package_manifest/* $FF was: siParseKey:package:manifest*/(SmallRyeConfig var0, NameIterator var1) {
        if (!var1.hasNext()) {
            ConfigDiagnostic.unknown(var1);
        } else if (!var1.nextSegmentEquals("add-implementation-entries")) {
            if (!var1.nextSegmentEquals("manifest-sections")) {
                ConfigDiagnostic.unknown(var1);
            } else {
                var1.next();
                siParseKey:package:manifest:manifest-sections(var0, var1);
            }
        } else {
            var1.next();
            emptyParseKey(var0, var1);
        }
    }

    private static void siParseKey_package_manifest_manifest_sections/* $FF was: siParseKey:package:manifest:manifest-sections*/(SmallRyeConfig var0, NameIterator var1) {
        if (!var1.hasNext()) {
            ConfigDiagnostic.unknown(var1);
        } else if (!var1.hasNext()) {
            ConfigDiagnostic.unknown(var1);
        } else {
            var1.next();
            siParseKey:package:manifest:manifest-sections:*(var0, var1);
        }
    }

    private static void siParseKey_package_manifest_manifest_sections__/* $FF was: siParseKey:package:manifest:manifest-sections:**/(SmallRyeConfig var0, NameIterator var1) {
        if (!var1.hasNext()) {
            ConfigDiagnostic.unknown(var1);
        } else if (!var1.hasNext()) {
            ConfigDiagnostic.unknown(var1);
        } else {
            var1.next();
            emptyParseKey(var0, var1);
        }
    }

    private static void siParseKey_platform/* $FF was: siParseKey:platform*/(SmallRyeConfig var0, NameIterator var1) {
        if (!var1.hasNext()) {
            ConfigDiagnostic.unknown(var1);
        } else if (!var1.nextSegmentEquals("artifact-id")) {
            if (!var1.nextSegmentEquals("group-id")) {
                if (!var1.nextSegmentEquals("version")) {
                    ConfigDiagnostic.unknown(var1);
                } else {
                    var1.next();
                    emptyParseKey(var0, var1);
                }
            } else {
                var1.next();
                emptyParseKey(var0, var1);
            }
        } else {
            var1.next();
            emptyParseKey(var0, var1);
        }
    }

    private static void siParseKey_resteasy/* $FF was: siParseKey:resteasy*/(SmallRyeConfig var0, NameIterator var1) {
        if (!var1.hasNext()) {
            ConfigDiagnostic.unknown(var1);
        } else if (!var1.nextSegmentEquals("gzip")) {
            if (!var1.nextSegmentEquals("ignore-application-classes")) {
                if (!var1.nextSegmentEquals("metrics")) {
                    if (!var1.nextSegmentEquals("path")) {
                        if (!var1.nextSegmentEquals("singleton-resources")) {
                            if (!var1.nextSegmentEquals("vertx")) {
                                ConfigDiagnostic.unknown(var1);
                            } else {
                                var1.next();
                                siParseKey:resteasy:vertx(var0, var1);
                            }
                        } else {
                            var1.next();
                            emptyParseKey(var0, var1);
                        }
                    } else {
                        var1.next();
                        emptyParseKey(var0, var1);
                    }
                } else {
                    var1.next();
                    siParseKey:resteasy:metrics(var0, var1);
                }
            } else {
                var1.next();
                emptyParseKey(var0, var1);
            }
        } else {
            var1.next();
            siParseKey:resteasy:gzip(var0, var1);
        }
    }

    private static void siParseKey_resteasy_gzip/* $FF was: siParseKey:resteasy:gzip*/(SmallRyeConfig var0, NameIterator var1) {
        if (!var1.hasNext()) {
            ConfigDiagnostic.unknown(var1);
        } else if (!var1.nextSegmentEquals("enabled")) {
            if (!var1.nextSegmentEquals("max-input")) {
                ConfigDiagnostic.unknown(var1);
            } else {
                var1.next();
                emptyParseKey(var0, var1);
            }
        } else {
            var1.next();
            emptyParseKey(var0, var1);
        }
    }

    private static void siParseKey_resteasy_metrics/* $FF was: siParseKey:resteasy:metrics*/(SmallRyeConfig var0, NameIterator var1) {
        if (!var1.hasNext()) {
            ConfigDiagnostic.unknown(var1);
        } else if (!var1.nextSegmentEquals("enabled")) {
            ConfigDiagnostic.unknown(var1);
        } else {
            var1.next();
            emptyParseKey(var0, var1);
        }
    }

    private static void siParseKey_resteasy_vertx/* $FF was: siParseKey:resteasy:vertx*/(SmallRyeConfig var0, NameIterator var1) {
        if (!var1.hasNext()) {
            ConfigDiagnostic.unknown(var1);
        } else if (!var1.nextSegmentEquals("response-buffer-size")) {
            ConfigDiagnostic.unknown(var1);
        } else {
            var1.next();
            emptyParseKey(var0, var1);
        }
    }

    private static void siParseKey_resteasy_json/* $FF was: siParseKey:resteasy-json*/(SmallRyeConfig var0, NameIterator var1) {
        if (!var1.hasNext()) {
            ConfigDiagnostic.unknown(var1);
        } else if (!var1.nextSegmentEquals("json-default")) {
            ConfigDiagnostic.unknown(var1);
        } else {
            var1.next();
            emptyParseKey(var0, var1);
        }
    }

    private static void siParseKey_shutdown/* $FF was: siParseKey:shutdown*/(SmallRyeConfig var0, NameIterator var1) {
        if (!var1.hasNext()) {
            ConfigDiagnostic.unknown(var1);
        } else if (!var1.nextSegmentEquals("timeout")) {
            ConfigDiagnostic.unknown(var1);
        } else {
            var1.next();
            emptyParseKey(var0, var1);
        }
    }

    private static void siParseKey_ssl/* $FF was: siParseKey:ssl*/(SmallRyeConfig var0, NameIterator var1) {
        if (!var1.hasNext()) {
            ConfigDiagnostic.unknown(var1);
        } else if (!var1.nextSegmentEquals("native")) {
            ConfigDiagnostic.unknown(var1);
        } else {
            var1.next();
            emptyParseKey(var0, var1);
        }
    }

    private static void siParseKey_test/* $FF was: siParseKey:test*/(SmallRyeConfig var0, NameIterator var1) {
        if (!var1.hasNext()) {
            ConfigDiagnostic.unknown(var1);
        } else if (!var1.nextSegmentEquals("hang-detection-timeout")) {
            if (!var1.nextSegmentEquals("native-image-profile")) {
                if (!var1.nextSegmentEquals("native-image-wait-time")) {
                    if (!var1.nextSegmentEquals("profile")) {
                        ConfigDiagnostic.unknown(var1);
                    } else {
                        var1.next();
                        siParseKey:test:profile(var0, var1);
                    }
                } else {
                    var1.next();
                    emptyParseKey(var0, var1);
                }
            } else {
                var1.next();
                emptyParseKey(var0, var1);
            }
        } else {
            var1.next();
            emptyParseKey(var0, var1);
        }
    }

    private static void siParseKey_test_profile/* $FF was: siParseKey:test:profile*/(SmallRyeConfig var0, NameIterator var1) {
        if (var1.hasNext()) {
            if (!var1.nextSegmentEquals("tags")) {
                ConfigDiagnostic.unknown(var1);
            } else {
                var1.next();
                emptyParseKey(var0, var1);
            }
        }
    }

    private static void siParseKey_thread_pool/* $FF was: siParseKey:thread-pool*/(SmallRyeConfig var0, NameIterator var1) {
        if (!var1.hasNext()) {
            ConfigDiagnostic.unknown(var1);
        } else if (!var1.nextSegmentEquals("core-threads")) {
            if (!var1.nextSegmentEquals("growth-resistance")) {
                if (!var1.nextSegmentEquals("keep-alive-time")) {
                    if (!var1.nextSegmentEquals("max-threads")) {
                        if (!var1.nextSegmentEquals("prefill")) {
                            if (!var1.nextSegmentEquals("queue-size")) {
                                if (!var1.nextSegmentEquals("shutdown-check-interval")) {
                                    if (!var1.nextSegmentEquals("shutdown-interrupt")) {
                                        if (!var1.nextSegmentEquals("shutdown-timeout")) {
                                            ConfigDiagnostic.unknown(var1);
                                        } else {
                                            var1.next();
                                            emptyParseKey(var0, var1);
                                        }
                                    } else {
                                        var1.next();
                                        emptyParseKey(var0, var1);
                                    }
                                } else {
                                    var1.next();
                                    emptyParseKey(var0, var1);
                                }
                            } else {
                                var1.next();
                                emptyParseKey(var0, var1);
                            }
                        } else {
                            var1.next();
                            emptyParseKey(var0, var1);
                        }
                    } else {
                        var1.next();
                        emptyParseKey(var0, var1);
                    }
                } else {
                    var1.next();
                    emptyParseKey(var0, var1);
                }
            } else {
                var1.next();
                emptyParseKey(var0, var1);
            }
        } else {
            var1.next();
            emptyParseKey(var0, var1);
        }
    }

    private static void siParseKey_vertx/* $FF was: siParseKey:vertx*/(SmallRyeConfig var0, NameIterator var1) {
        if (!var1.hasNext()) {
            ConfigDiagnostic.unknown(var1);
        } else if (!var1.nextSegmentEquals("caching")) {
            if (!var1.nextSegmentEquals("classpath-resolving")) {
                if (!var1.nextSegmentEquals("cluster")) {
                    if (!var1.nextSegmentEquals("event-loops-pool-size")) {
                        if (!var1.nextSegmentEquals("eventbus")) {
                            if (!var1.nextSegmentEquals("internal-blocking-pool-size")) {
                                if (!var1.nextSegmentEquals("max-event-loop-execute-time")) {
                                    if (!var1.nextSegmentEquals("max-worker-execute-time")) {
                                        if (!var1.nextSegmentEquals("prefer-native-transport")) {
                                            if (!var1.nextSegmentEquals("resolver")) {
                                                if (!var1.nextSegmentEquals("use-async-dns")) {
                                                    if (!var1.nextSegmentEquals("warning-exception-time")) {
                                                        if (!var1.nextSegmentEquals("worker-pool-size")) {
                                                            ConfigDiagnostic.unknown(var1);
                                                        } else {
                                                            var1.next();
                                                            emptyParseKey(var0, var1);
                                                        }
                                                    } else {
                                                        var1.next();
                                                        emptyParseKey(var0, var1);
                                                    }
                                                } else {
                                                    var1.next();
                                                    emptyParseKey(var0, var1);
                                                }
                                            } else {
                                                var1.next();
                                                siParseKey:vertx:resolver(var0, var1);
                                            }
                                        } else {
                                            var1.next();
                                            emptyParseKey(var0, var1);
                                        }
                                    } else {
                                        var1.next();
                                        emptyParseKey(var0, var1);
                                    }
                                } else {
                                    var1.next();
                                    emptyParseKey(var0, var1);
                                }
                            } else {
                                var1.next();
                                emptyParseKey(var0, var1);
                            }
                        } else {
                            var1.next();
                            siParseKey:vertx:eventbus(var0, var1);
                        }
                    } else {
                        var1.next();
                        emptyParseKey(var0, var1);
                    }
                } else {
                    var1.next();
                    siParseKey:vertx:cluster(var0, var1);
                }
            } else {
                var1.next();
                emptyParseKey(var0, var1);
            }
        } else {
            var1.next();
            emptyParseKey(var0, var1);
        }
    }

    private static void siParseKey_vertx_cluster/* $FF was: siParseKey:vertx:cluster*/(SmallRyeConfig var0, NameIterator var1) {
        if (!var1.hasNext()) {
            ConfigDiagnostic.unknown(var1);
        } else if (!var1.nextSegmentEquals("clustered")) {
            if (!var1.nextSegmentEquals("host")) {
                if (!var1.nextSegmentEquals("ping-interval")) {
                    if (!var1.nextSegmentEquals("ping-reply-interval")) {
                        if (!var1.nextSegmentEquals("port")) {
                            if (!var1.nextSegmentEquals("public-host")) {
                                if (!var1.nextSegmentEquals("public-port")) {
                                    ConfigDiagnostic.unknown(var1);
                                } else {
                                    var1.next();
                                    emptyParseKey(var0, var1);
                                }
                            } else {
                                var1.next();
                                emptyParseKey(var0, var1);
                            }
                        } else {
                            var1.next();
                            emptyParseKey(var0, var1);
                        }
                    } else {
                        var1.next();
                        emptyParseKey(var0, var1);
                    }
                } else {
                    var1.next();
                    emptyParseKey(var0, var1);
                }
            } else {
                var1.next();
                emptyParseKey(var0, var1);
            }
        } else {
            var1.next();
            emptyParseKey(var0, var1);
        }
    }

    private static void siParseKey_vertx_eventbus/* $FF was: siParseKey:vertx:eventbus*/(SmallRyeConfig var0, NameIterator var1) {
        if (!var1.hasNext()) {
            ConfigDiagnostic.unknown(var1);
        } else if (!var1.nextSegmentEquals("accept-backlog")) {
            if (!var1.nextSegmentEquals("client-auth")) {
                if (!var1.nextSegmentEquals("connect-timeout")) {
                    if (!var1.nextSegmentEquals("idle-timeout")) {
                        if (!var1.nextSegmentEquals("key-certificate-jks")) {
                            if (!var1.nextSegmentEquals("key-certificate-pem")) {
                                if (!var1.nextSegmentEquals("key-certificate-pfx")) {
                                    if (!var1.nextSegmentEquals("receive-buffer-size")) {
                                        if (!var1.nextSegmentEquals("reconnect-attempts")) {
                                            if (!var1.nextSegmentEquals("reconnect-interval")) {
                                                if (!var1.nextSegmentEquals("reuse-address")) {
                                                    if (!var1.nextSegmentEquals("reuse-port")) {
                                                        if (!var1.nextSegmentEquals("send-buffer-size")) {
                                                            if (!var1.nextSegmentEquals("soLinger")) {
                                                                if (!var1.nextSegmentEquals("ssl")) {
                                                                    if (!var1.nextSegmentEquals("tcp-keep-alive")) {
                                                                        if (!var1.nextSegmentEquals("tcp-no-delay")) {
                                                                            if (!var1.nextSegmentEquals("traffic-class")) {
                                                                                if (!var1.nextSegmentEquals("trust-all")) {
                                                                                    if (!var1.nextSegmentEquals("trust-certificate-jks")) {
                                                                                        if (!var1.nextSegmentEquals("trust-certificate-pem")) {
                                                                                            if (!var1.nextSegmentEquals("trust-certificate-pfx")) {
                                                                                                ConfigDiagnostic.unknown(var1);
                                                                                            } else {
                                                                                                var1.next();
                                                                                                siParseKey:vertx:eventbus:trust-certificate-pfx(var0, var1);
                                                                                            }
                                                                                        } else {
                                                                                            var1.next();
                                                                                            siParseKey:vertx:eventbus:trust-certificate-pem(var0, var1);
                                                                                        }
                                                                                    } else {
                                                                                        var1.next();
                                                                                        siParseKey:vertx:eventbus:trust-certificate-jks(var0, var1);
                                                                                    }
                                                                                } else {
                                                                                    var1.next();
                                                                                    emptyParseKey(var0, var1);
                                                                                }
                                                                            } else {
                                                                                var1.next();
                                                                                emptyParseKey(var0, var1);
                                                                            }
                                                                        } else {
                                                                            var1.next();
                                                                            emptyParseKey(var0, var1);
                                                                        }
                                                                    } else {
                                                                        var1.next();
                                                                        emptyParseKey(var0, var1);
                                                                    }
                                                                } else {
                                                                    var1.next();
                                                                    emptyParseKey(var0, var1);
                                                                }
                                                            } else {
                                                                var1.next();
                                                                emptyParseKey(var0, var1);
                                                            }
                                                        } else {
                                                            var1.next();
                                                            emptyParseKey(var0, var1);
                                                        }
                                                    } else {
                                                        var1.next();
                                                        emptyParseKey(var0, var1);
                                                    }
                                                } else {
                                                    var1.next();
                                                    emptyParseKey(var0, var1);
                                                }
                                            } else {
                                                var1.next();
                                                emptyParseKey(var0, var1);
                                            }
                                        } else {
                                            var1.next();
                                            emptyParseKey(var0, var1);
                                        }
                                    } else {
                                        var1.next();
                                        emptyParseKey(var0, var1);
                                    }
                                } else {
                                    var1.next();
                                    siParseKey:vertx:eventbus:key-certificate-pfx(var0, var1);
                                }
                            } else {
                                var1.next();
                                siParseKey:vertx:eventbus:key-certificate-pem(var0, var1);
                            }
                        } else {
                            var1.next();
                            siParseKey:vertx:eventbus:key-certificate-jks(var0, var1);
                        }
                    } else {
                        var1.next();
                        emptyParseKey(var0, var1);
                    }
                } else {
                    var1.next();
                    emptyParseKey(var0, var1);
                }
            } else {
                var1.next();
                emptyParseKey(var0, var1);
            }
        } else {
            var1.next();
            emptyParseKey(var0, var1);
        }
    }

    private static void siParseKey_vertx_eventbus_key_certificate_jks/* $FF was: siParseKey:vertx:eventbus:key-certificate-jks*/(SmallRyeConfig var0, NameIterator var1) {
        if (var1.hasNext()) {
            if (!var1.nextSegmentEquals("password")) {
                if (!var1.nextSegmentEquals("path")) {
                    ConfigDiagnostic.unknown(var1);
                } else {
                    var1.next();
                    emptyParseKey(var0, var1);
                }
            } else {
                var1.next();
                emptyParseKey(var0, var1);
            }
        }
    }

    private static void siParseKey_vertx_eventbus_key_certificate_pem/* $FF was: siParseKey:vertx:eventbus:key-certificate-pem*/(SmallRyeConfig var0, NameIterator var1) {
        if (var1.hasNext()) {
            if (!var1.nextSegmentEquals("certs")) {
                if (!var1.nextSegmentEquals("keys")) {
                    ConfigDiagnostic.unknown(var1);
                } else {
                    var1.next();
                    emptyParseKey(var0, var1);
                }
            } else {
                var1.next();
                emptyParseKey(var0, var1);
            }
        }
    }

    private static void siParseKey_vertx_eventbus_key_certificate_pfx/* $FF was: siParseKey:vertx:eventbus:key-certificate-pfx*/(SmallRyeConfig var0, NameIterator var1) {
        if (var1.hasNext()) {
            if (!var1.nextSegmentEquals("password")) {
                if (!var1.nextSegmentEquals("path")) {
                    ConfigDiagnostic.unknown(var1);
                } else {
                    var1.next();
                    emptyParseKey(var0, var1);
                }
            } else {
                var1.next();
                emptyParseKey(var0, var1);
            }
        }
    }

    private static void siParseKey_vertx_eventbus_trust_certificate_jks/* $FF was: siParseKey:vertx:eventbus:trust-certificate-jks*/(SmallRyeConfig var0, NameIterator var1) {
        if (var1.hasNext()) {
            if (!var1.nextSegmentEquals("password")) {
                if (!var1.nextSegmentEquals("path")) {
                    ConfigDiagnostic.unknown(var1);
                } else {
                    var1.next();
                    emptyParseKey(var0, var1);
                }
            } else {
                var1.next();
                emptyParseKey(var0, var1);
            }
        }
    }

    private static void siParseKey_vertx_eventbus_trust_certificate_pem/* $FF was: siParseKey:vertx:eventbus:trust-certificate-pem*/(SmallRyeConfig var0, NameIterator var1) {
        if (var1.hasNext()) {
            if (!var1.nextSegmentEquals("certs")) {
                ConfigDiagnostic.unknown(var1);
            } else {
                var1.next();
                emptyParseKey(var0, var1);
            }
        }
    }

    private static void siParseKey_vertx_eventbus_trust_certificate_pfx/* $FF was: siParseKey:vertx:eventbus:trust-certificate-pfx*/(SmallRyeConfig var0, NameIterator var1) {
        if (var1.hasNext()) {
            if (!var1.nextSegmentEquals("password")) {
                if (!var1.nextSegmentEquals("path")) {
                    ConfigDiagnostic.unknown(var1);
                } else {
                    var1.next();
                    emptyParseKey(var0, var1);
                }
            } else {
                var1.next();
                emptyParseKey(var0, var1);
            }
        }
    }

    private static void siParseKey_vertx_resolver/* $FF was: siParseKey:vertx:resolver*/(SmallRyeConfig var0, NameIterator var1) {
        if (!var1.hasNext()) {
            ConfigDiagnostic.unknown(var1);
        } else if (!var1.nextSegmentEquals("cache-max-time-to-live")) {
            if (!var1.nextSegmentEquals("cache-min-time-to-live")) {
                if (!var1.nextSegmentEquals("cache-negative-time-to-live")) {
                    ConfigDiagnostic.unknown(var1);
                } else {
                    var1.next();
                    emptyParseKey(var0, var1);
                }
            } else {
                var1.next();
                emptyParseKey(var0, var1);
            }
        } else {
            var1.next();
            emptyParseKey(var0, var1);
        }
    }

    private static void rtParseKey(SmallRyeConfig var0, NameIterator var1) {
        if (!var1.hasNext()) {
            ConfigDiagnostic.unknownRunTime(var1);
        } else if (!var1.nextSegmentEquals("args")) {
            if (!var1.nextSegmentEquals("banner")) {
                if (!var1.nextSegmentEquals("configuration")) {
                    if (!var1.nextSegmentEquals("http")) {
                        if (!var1.nextSegmentEquals("log")) {
                            if (!var1.nextSegmentEquals("profile")) {
                                if (!var1.nextSegmentEquals("shutdown")) {
                                    if (!var1.nextSegmentEquals("thread-pool")) {
                                        if (!var1.nextSegmentEquals("vertx")) {
                                            if (!var1.nextSegmentEquals("application")) {
                                                if (!var1.nextSegmentEquals("arc")) {
                                                    if (!var1.nextSegmentEquals("class-loading")) {
                                                        if (!var1.nextSegmentEquals("debug")) {
                                                            if (!var1.nextSegmentEquals("default-locale")) {
                                                                if (!var1.nextSegmentEquals("dev")) {
                                                                    if (!var1.nextSegmentEquals("index-dependency")) {
                                                                        if (!var1.nextSegmentEquals("jackson")) {
                                                                            if (!var1.nextSegmentEquals("jni")) {
                                                                                if (!var1.nextSegmentEquals("live-reload")) {
                                                                                    if (!var1.nextSegmentEquals("locales")) {
                                                                                        if (!var1.nextSegmentEquals("native")) {
                                                                                            if (!var1.nextSegmentEquals("package")) {
                                                                                                if (!var1.nextSegmentEquals("platform")) {
                                                                                                    if (!var1.nextSegmentEquals("resteasy")) {
                                                                                                        if (!var1.nextSegmentEquals("resteasy-json")) {
                                                                                                            if (!var1.nextSegmentEquals("security")) {
                                                                                                                if (!var1.nextSegmentEquals("ssl")) {
                                                                                                                    if (!var1.nextSegmentEquals("test")) {
                                                                                                                        if (!var1.nextSegmentEquals("tls")) {
                                                                                                                            ConfigDiagnostic.unknownRunTime(var1);
                                                                                                                        } else {
                                                                                                                            var1.next();
                                                                                                                            rtParseKey:tls(var0, var1);
                                                                                                                        }
                                                                                                                    } else {
                                                                                                                        var1.next();
                                                                                                                        rtParseKey:test(var0, var1);
                                                                                                                    }
                                                                                                                } else {
                                                                                                                    var1.next();
                                                                                                                    rtParseKey:ssl(var0, var1);
                                                                                                                }
                                                                                                            } else {
                                                                                                                var1.next();
                                                                                                                rtParseKey:security(var0, var1);
                                                                                                            }
                                                                                                        } else {
                                                                                                            var1.next();
                                                                                                            rtParseKey:resteasy-json(var0, var1);
                                                                                                        }
                                                                                                    } else {
                                                                                                        var1.next();
                                                                                                        rtParseKey:resteasy(var0, var1);
                                                                                                    }
                                                                                                } else {
                                                                                                    var1.next();
                                                                                                    rtParseKey:platform(var0, var1);
                                                                                                }
                                                                                            } else {
                                                                                                var1.next();
                                                                                                rtParseKey:package(var0, var1);
                                                                                            }
                                                                                        } else {
                                                                                            var1.next();
                                                                                            rtParseKey:native(var0, var1);
                                                                                        }
                                                                                    } else {
                                                                                        var1.next();
                                                                                        rtEmptyParseKey(var0, var1);
                                                                                    }
                                                                                } else {
                                                                                    var1.next();
                                                                                    rtParseKey:live-reload(var0, var1);
                                                                                }
                                                                            } else {
                                                                                var1.next();
                                                                                rtParseKey:jni(var0, var1);
                                                                            }
                                                                        } else {
                                                                            var1.next();
                                                                            rtParseKey:jackson(var0, var1);
                                                                        }
                                                                    } else {
                                                                        var1.next();
                                                                        rtParseKey:index-dependency(var0, var1);
                                                                    }
                                                                } else {
                                                                    var1.next();
                                                                    rtParseKey:dev(var0, var1);
                                                                }
                                                            } else {
                                                                var1.next();
                                                                rtEmptyParseKey(var0, var1);
                                                            }
                                                        } else {
                                                            var1.next();
                                                            rtParseKey:debug(var0, var1);
                                                        }
                                                    } else {
                                                        var1.next();
                                                        rtParseKey:class-loading(var0, var1);
                                                    }
                                                } else {
                                                    var1.next();
                                                    rtParseKey:arc(var0, var1);
                                                }
                                            } else {
                                                var1.next();
                                                rtParseKey:application(var0, var1);
                                            }
                                        } else {
                                            var1.next();
                                            rtParseKey:vertx(var0, var1);
                                        }
                                    } else {
                                        var1.next();
                                        rtParseKey:thread-pool(var0, var1);
                                    }
                                } else {
                                    var1.next();
                                    rtParseKey:shutdown(var0, var1);
                                }
                            } else {
                                var1.next();
                                rtParseKey:profile(var0, var1);
                            }
                        } else {
                            var1.next();
                            rtParseKey:log(var0, var1);
                        }
                    } else {
                        var1.next();
                        rtParseKey:http(var0, var1);
                    }
                } else {
                    var1.next();
                    rtParseKey:configuration(var0, var1);
                }
            } else {
                var1.next();
                rtParseKey:banner(var0, var1);
            }
        } else {
            var1.next();
            rtParseKey:args(var0, var1);
        }
    }

    private static void rtParseKey_args/* $FF was: rtParseKey:args*/(SmallRyeConfig var0, NameIterator var1) {
        if (var1.hasNext()) {
            ConfigDiagnostic.unknownRunTime(var1);
        }
    }

    private static void rtParseKey_banner/* $FF was: rtParseKey:banner*/(SmallRyeConfig var0, NameIterator var1) {
        if (!var1.hasNext()) {
            ConfigDiagnostic.unknownRunTime(var1);
        } else if (!var1.nextSegmentEquals("enabled")) {
            if (!var1.nextSegmentEquals("path")) {
                ConfigDiagnostic.unknownRunTime(var1);
            } else {
                var1.next();
                rtEmptyParseKey(var0, var1);
            }
        } else {
            var1.next();
            rtParseKey:banner:enabled(var0, var1);
        }
    }

    private static void rtParseKey_banner_enabled/* $FF was: rtParseKey:banner:enabled*/(SmallRyeConfig var0, NameIterator var1) {
        if (var1.hasNext()) {
            ConfigDiagnostic.unknownRunTime(var1);
        }
    }

    private static void rtParseKey_configuration/* $FF was: rtParseKey:configuration*/(SmallRyeConfig var0, NameIterator var1) {
        if (!var1.hasNext()) {
            ConfigDiagnostic.unknownRunTime(var1);
        } else if (!var1.nextSegmentEquals("build-time-mismatch-at-runtime")) {
            ConfigDiagnostic.unknownRunTime(var1);
        } else {
            var1.next();
            rtParseKey:configuration:build-time-mismatch-at-runtime(var0, var1);
        }
    }

    private static void rtParseKey_configuration_build_time_mismatch_at_runtime/* $FF was: rtParseKey:configuration:build-time-mismatch-at-runtime*/(SmallRyeConfig var0, NameIterator var1) {
        if (var1.hasNext()) {
            ConfigDiagnostic.unknownRunTime(var1);
        }
    }

    private static void rtParseKey_http/* $FF was: rtParseKey:http*/(SmallRyeConfig var0, NameIterator var1) {
        if (!var1.hasNext()) {
            ConfigDiagnostic.unknownRunTime(var1);
        } else if (!var1.nextSegmentEquals("access-log")) {
            if (!var1.nextSegmentEquals("allow-forwarded")) {
                if (!var1.nextSegmentEquals("auth")) {
                    if (!var1.nextSegmentEquals("body")) {
                        if (!var1.nextSegmentEquals("cors")) {
                            if (!var1.nextSegmentEquals("domain-socket")) {
                                if (!var1.nextSegmentEquals("domain-socket-enabled")) {
                                    if (!var1.nextSegmentEquals("enable-compression")) {
                                        if (!var1.nextSegmentEquals("host")) {
                                            if (!var1.nextSegmentEquals("host-enabled")) {
                                                if (!var1.nextSegmentEquals("http2")) {
                                                    if (!var1.nextSegmentEquals("idle-timeout")) {
                                                        if (!var1.nextSegmentEquals("insecure-requests")) {
                                                            if (!var1.nextSegmentEquals("io-threads")) {
                                                                if (!var1.nextSegmentEquals("limits")) {
                                                                    if (!var1.nextSegmentEquals("port")) {
                                                                        if (!var1.nextSegmentEquals("proxy")) {
                                                                            if (!var1.nextSegmentEquals("proxy-address-forwarding")) {
                                                                                if (!var1.nextSegmentEquals("read-timeout")) {
                                                                                    if (!var1.nextSegmentEquals("record-request-start-time")) {
                                                                                        if (!var1.nextSegmentEquals("same-site-cookie")) {
                                                                                            if (!var1.nextSegmentEquals("so-reuse-port")) {
                                                                                                if (!var1.nextSegmentEquals("ssl")) {
                                                                                                    if (!var1.nextSegmentEquals("ssl-port")) {
                                                                                                        if (!var1.nextSegmentEquals("tcp-cork")) {
                                                                                                            if (!var1.nextSegmentEquals("tcp-fast-open")) {
                                                                                                                if (!var1.nextSegmentEquals("tcp-quick-ack")) {
                                                                                                                    if (!var1.nextSegmentEquals("test-port")) {
                                                                                                                        if (!var1.nextSegmentEquals("test-ssl-port")) {
                                                                                                                            if (!var1.nextSegmentEquals("non-application-root-path")) {
                                                                                                                                if (!var1.nextSegmentEquals("redirect-to-non-application-root-path")) {
                                                                                                                                    if (!var1.nextSegmentEquals("root-path")) {
                                                                                                                                        if (!var1.nextSegmentEquals("virtual")) {
                                                                                                                                            ConfigDiagnostic.unknownRunTime(var1);
                                                                                                                                        } else {
                                                                                                                                            var1.next();
                                                                                                                                            rtEmptyParseKey(var0, var1);
                                                                                                                                        }
                                                                                                                                    } else {
                                                                                                                                        var1.next();
                                                                                                                                        rtEmptyParseKey(var0, var1);
                                                                                                                                    }
                                                                                                                                } else {
                                                                                                                                    var1.next();
                                                                                                                                    rtEmptyParseKey(var0, var1);
                                                                                                                                }
                                                                                                                            } else {
                                                                                                                                var1.next();
                                                                                                                                rtEmptyParseKey(var0, var1);
                                                                                                                            }
                                                                                                                        } else {
                                                                                                                            var1.next();
                                                                                                                            rtParseKey:http:test-ssl-port(var0, var1);
                                                                                                                        }
                                                                                                                    } else {
                                                                                                                        var1.next();
                                                                                                                        rtParseKey:http:test-port(var0, var1);
                                                                                                                    }
                                                                                                                } else {
                                                                                                                    var1.next();
                                                                                                                    rtParseKey:http:tcp-quick-ack(var0, var1);
                                                                                                                }
                                                                                                            } else {
                                                                                                                var1.next();
                                                                                                                rtParseKey:http:tcp-fast-open(var0, var1);
                                                                                                            }
                                                                                                        } else {
                                                                                                            var1.next();
                                                                                                            rtParseKey:http:tcp-cork(var0, var1);
                                                                                                        }
                                                                                                    } else {
                                                                                                        var1.next();
                                                                                                        rtParseKey:http:ssl-port(var0, var1);
                                                                                                    }
                                                                                                } else {
                                                                                                    var1.next();
                                                                                                    rtParseKey:http:ssl(var0, var1);
                                                                                                }
                                                                                            } else {
                                                                                                var1.next();
                                                                                                rtParseKey:http:so-reuse-port(var0, var1);
                                                                                            }
                                                                                        } else {
                                                                                            var1.next();
                                                                                            rtParseKey:http:same-site-cookie(var0, var1);
                                                                                        }
                                                                                    } else {
                                                                                        var1.next();
                                                                                        rtParseKey:http:record-request-start-time(var0, var1);
                                                                                    }
                                                                                } else {
                                                                                    var1.next();
                                                                                    rtParseKey:http:read-timeout(var0, var1);
                                                                                }
                                                                            } else {
                                                                                var1.next();
                                                                                rtParseKey:http:proxy-address-forwarding(var0, var1);
                                                                            }
                                                                        } else {
                                                                            var1.next();
                                                                            rtParseKey:http:proxy(var0, var1);
                                                                        }
                                                                    } else {
                                                                        var1.next();
                                                                        rtParseKey:http:port(var0, var1);
                                                                    }
                                                                } else {
                                                                    var1.next();
                                                                    rtParseKey:http:limits(var0, var1);
                                                                }
                                                            } else {
                                                                var1.next();
                                                                rtParseKey:http:io-threads(var0, var1);
                                                            }
                                                        } else {
                                                            var1.next();
                                                            rtParseKey:http:insecure-requests(var0, var1);
                                                        }
                                                    } else {
                                                        var1.next();
                                                        rtParseKey:http:idle-timeout(var0, var1);
                                                    }
                                                } else {
                                                    var1.next();
                                                    rtParseKey:http:http2(var0, var1);
                                                }
                                            } else {
                                                var1.next();
                                                rtParseKey:http:host-enabled(var0, var1);
                                            }
                                        } else {
                                            var1.next();
                                            rtParseKey:http:host(var0, var1);
                                        }
                                    } else {
                                        var1.next();
                                        rtParseKey:http:enable-compression(var0, var1);
                                    }
                                } else {
                                    var1.next();
                                    rtParseKey:http:domain-socket-enabled(var0, var1);
                                }
                            } else {
                                var1.next();
                                rtParseKey:http:domain-socket(var0, var1);
                            }
                        } else {
                            var1.next();
                            rtParseKey:http:cors(var0, var1);
                        }
                    } else {
                        var1.next();
                        rtParseKey:http:body(var0, var1);
                    }
                } else {
                    var1.next();
                    rtParseKey:http:auth(var0, var1);
                }
            } else {
                var1.next();
                rtParseKey:http:allow-forwarded(var0, var1);
            }
        } else {
            var1.next();
            rtParseKey:http:access-log(var0, var1);
        }
    }

    private static void rtParseKey_http_access_log/* $FF was: rtParseKey:http:access-log*/(SmallRyeConfig var0, NameIterator var1) {
        if (!var1.hasNext()) {
            ConfigDiagnostic.unknownRunTime(var1);
        } else if (!var1.nextSegmentEquals("base-file-name")) {
            if (!var1.nextSegmentEquals("category")) {
                if (!var1.nextSegmentEquals("enabled")) {
                    if (!var1.nextSegmentEquals("log-directory")) {
                        if (!var1.nextSegmentEquals("log-suffix")) {
                            if (!var1.nextSegmentEquals("log-to-file")) {
                                if (!var1.nextSegmentEquals("pattern")) {
                                    if (!var1.nextSegmentEquals("rotate")) {
                                        ConfigDiagnostic.unknownRunTime(var1);
                                    } else {
                                        var1.next();
                                        rtParseKey:http:access-log:rotate(var0, var1);
                                    }
                                } else {
                                    var1.next();
                                    rtParseKey:http:access-log:pattern(var0, var1);
                                }
                            } else {
                                var1.next();
                                rtParseKey:http:access-log:log-to-file(var0, var1);
                            }
                        } else {
                            var1.next();
                            rtParseKey:http:access-log:log-suffix(var0, var1);
                        }
                    } else {
                        var1.next();
                        rtParseKey:http:access-log:log-directory(var0, var1);
                    }
                } else {
                    var1.next();
                    rtParseKey:http:access-log:enabled(var0, var1);
                }
            } else {
                var1.next();
                rtParseKey:http:access-log:category(var0, var1);
            }
        } else {
            var1.next();
            rtParseKey:http:access-log:base-file-name(var0, var1);
        }
    }

    private static void rtParseKey_http_access_log_base_file_name/* $FF was: rtParseKey:http:access-log:base-file-name*/(SmallRyeConfig var0, NameIterator var1) {
        if (var1.hasNext()) {
            ConfigDiagnostic.unknownRunTime(var1);
        }
    }

    private static void rtParseKey_http_access_log_category/* $FF was: rtParseKey:http:access-log:category*/(SmallRyeConfig var0, NameIterator var1) {
        if (var1.hasNext()) {
            ConfigDiagnostic.unknownRunTime(var1);
        }
    }

    private static void rtParseKey_http_access_log_enabled/* $FF was: rtParseKey:http:access-log:enabled*/(SmallRyeConfig var0, NameIterator var1) {
        if (var1.hasNext()) {
            ConfigDiagnostic.unknownRunTime(var1);
        }
    }

    private static void rtParseKey_http_access_log_log_directory/* $FF was: rtParseKey:http:access-log:log-directory*/(SmallRyeConfig var0, NameIterator var1) {
        if (var1.hasNext()) {
            ConfigDiagnostic.unknownRunTime(var1);
        }
    }

    private static void rtParseKey_http_access_log_log_suffix/* $FF was: rtParseKey:http:access-log:log-suffix*/(SmallRyeConfig var0, NameIterator var1) {
        if (var1.hasNext()) {
            ConfigDiagnostic.unknownRunTime(var1);
        }
    }

    private static void rtParseKey_http_access_log_log_to_file/* $FF was: rtParseKey:http:access-log:log-to-file*/(SmallRyeConfig var0, NameIterator var1) {
        if (var1.hasNext()) {
            ConfigDiagnostic.unknownRunTime(var1);
        }
    }

    private static void rtParseKey_http_access_log_pattern/* $FF was: rtParseKey:http:access-log:pattern*/(SmallRyeConfig var0, NameIterator var1) {
        if (var1.hasNext()) {
            ConfigDiagnostic.unknownRunTime(var1);
        }
    }

    private static void rtParseKey_http_access_log_rotate/* $FF was: rtParseKey:http:access-log:rotate*/(SmallRyeConfig var0, NameIterator var1) {
        if (var1.hasNext()) {
            ConfigDiagnostic.unknownRunTime(var1);
        }
    }

    private static void rtParseKey_http_allow_forwarded/* $FF was: rtParseKey:http:allow-forwarded*/(SmallRyeConfig var0, NameIterator var1) {
        if (var1.hasNext()) {
            ConfigDiagnostic.unknownRunTime(var1);
        }
    }

    private static void rtParseKey_http_auth/* $FF was: rtParseKey:http:auth*/(SmallRyeConfig var0, NameIterator var1) {
        if (!var1.hasNext()) {
            ConfigDiagnostic.unknownRunTime(var1);
        } else if (!var1.nextSegmentEquals("session")) {
            if (!var1.nextSegmentEquals("basic")) {
                if (!var1.nextSegmentEquals("form")) {
                    if (!var1.nextSegmentEquals("permission")) {
                        if (!var1.nextSegmentEquals("policy")) {
                            if (!var1.nextSegmentEquals("proactive")) {
                                if (!var1.nextSegmentEquals("realm")) {
                                    ConfigDiagnostic.unknownRunTime(var1);
                                } else {
                                    var1.next();
                                    rtEmptyParseKey(var0, var1);
                                }
                            } else {
                                var1.next();
                                rtEmptyParseKey(var0, var1);
                            }
                        } else {
                            var1.next();
                            rtParseKey:http:auth:policy(var0, var1);
                        }
                    } else {
                        var1.next();
                        rtParseKey:http:auth:permission(var0, var1);
                    }
                } else {
                    var1.next();
                    rtParseKey:http:auth:form(var0, var1);
                }
            } else {
                var1.next();
                rtEmptyParseKey(var0, var1);
            }
        } else {
            var1.next();
            rtParseKey:http:auth:session(var0, var1);
        }
    }

    private static void rtParseKey_http_auth_session/* $FF was: rtParseKey:http:auth:session*/(SmallRyeConfig var0, NameIterator var1) {
        if (!var1.hasNext()) {
            ConfigDiagnostic.unknownRunTime(var1);
        } else if (!var1.nextSegmentEquals("encryption-key")) {
            ConfigDiagnostic.unknownRunTime(var1);
        } else {
            var1.next();
            rtParseKey:http:auth:session:encryption-key(var0, var1);
        }
    }

    private static void rtParseKey_http_auth_session_encryption_key/* $FF was: rtParseKey:http:auth:session:encryption-key*/(SmallRyeConfig var0, NameIterator var1) {
        if (var1.hasNext()) {
            ConfigDiagnostic.unknownRunTime(var1);
        }
    }

    private static void rtParseKey_http_auth_form/* $FF was: rtParseKey:http:auth:form*/(SmallRyeConfig var0, NameIterator var1) {
        if (!var1.hasNext()) {
            ConfigDiagnostic.unknownRunTime(var1);
        } else if (!var1.nextSegmentEquals("cookie-name")) {
            if (!var1.nextSegmentEquals("enabled")) {
                if (!var1.nextSegmentEquals("error-page")) {
                    if (!var1.nextSegmentEquals("landing-page")) {
                        if (!var1.nextSegmentEquals("location-cookie")) {
                            if (!var1.nextSegmentEquals("login-page")) {
                                if (!var1.nextSegmentEquals("new-cookie-interval")) {
                                    if (!var1.nextSegmentEquals("password-parameter")) {
                                        if (!var1.nextSegmentEquals("post-location")) {
                                            if (!var1.nextSegmentEquals("redirect-after-login")) {
                                                if (!var1.nextSegmentEquals("timeout")) {
                                                    if (!var1.nextSegmentEquals("username-parameter")) {
                                                        ConfigDiagnostic.unknownRunTime(var1);
                                                    } else {
                                                        var1.next();
                                                        rtEmptyParseKey(var0, var1);
                                                    }
                                                } else {
                                                    var1.next();
                                                    rtEmptyParseKey(var0, var1);
                                                }
                                            } else {
                                                var1.next();
                                                rtEmptyParseKey(var0, var1);
                                            }
                                        } else {
                                            var1.next();
                                            rtEmptyParseKey(var0, var1);
                                        }
                                    } else {
                                        var1.next();
                                        rtEmptyParseKey(var0, var1);
                                    }
                                } else {
                                    var1.next();
                                    rtEmptyParseKey(var0, var1);
                                }
                            } else {
                                var1.next();
                                rtEmptyParseKey(var0, var1);
                            }
                        } else {
                            var1.next();
                            rtEmptyParseKey(var0, var1);
                        }
                    } else {
                        var1.next();
                        rtEmptyParseKey(var0, var1);
                    }
                } else {
                    var1.next();
                    rtEmptyParseKey(var0, var1);
                }
            } else {
                var1.next();
                rtEmptyParseKey(var0, var1);
            }
        } else {
            var1.next();
            rtEmptyParseKey(var0, var1);
        }
    }

    private static void rtParseKey_http_auth_permission/* $FF was: rtParseKey:http:auth:permission*/(SmallRyeConfig var0, NameIterator var1) {
        if (!var1.hasNext()) {
            ConfigDiagnostic.unknownRunTime(var1);
        } else if (!var1.hasNext()) {
            ConfigDiagnostic.unknownRunTime(var1);
        } else {
            var1.next();
            rtParseKey:http:auth:permission:*(var0, var1);
        }
    }

    private static void rtParseKey_http_auth_permission__/* $FF was: rtParseKey:http:auth:permission:**/(SmallRyeConfig var0, NameIterator var1) {
        if (!var1.hasNext()) {
            ConfigDiagnostic.unknownRunTime(var1);
        } else if (!var1.nextSegmentEquals("enabled")) {
            if (!var1.nextSegmentEquals("methods")) {
                if (!var1.nextSegmentEquals("paths")) {
                    if (!var1.nextSegmentEquals("policy")) {
                        ConfigDiagnostic.unknownRunTime(var1);
                    } else {
                        var1.next();
                        rtEmptyParseKey(var0, var1);
                    }
                } else {
                    var1.next();
                    rtEmptyParseKey(var0, var1);
                }
            } else {
                var1.next();
                rtEmptyParseKey(var0, var1);
            }
        } else {
            var1.next();
            rtEmptyParseKey(var0, var1);
        }
    }

    private static void rtParseKey_http_auth_policy/* $FF was: rtParseKey:http:auth:policy*/(SmallRyeConfig var0, NameIterator var1) {
        if (!var1.hasNext()) {
            ConfigDiagnostic.unknownRunTime(var1);
        } else if (!var1.hasNext()) {
            ConfigDiagnostic.unknownRunTime(var1);
        } else {
            var1.next();
            rtParseKey:http:auth:policy:*(var0, var1);
        }
    }

    private static void rtParseKey_http_auth_policy__/* $FF was: rtParseKey:http:auth:policy:**/(SmallRyeConfig var0, NameIterator var1) {
        if (!var1.hasNext()) {
            ConfigDiagnostic.unknownRunTime(var1);
        } else if (!var1.nextSegmentEquals("roles-allowed")) {
            ConfigDiagnostic.unknownRunTime(var1);
        } else {
            var1.next();
            rtEmptyParseKey(var0, var1);
        }
    }

    private static void rtParseKey_http_body/* $FF was: rtParseKey:http:body*/(SmallRyeConfig var0, NameIterator var1) {
        if (!var1.hasNext()) {
            ConfigDiagnostic.unknownRunTime(var1);
        } else if (!var1.nextSegmentEquals("delete-uploaded-files-on-end")) {
            if (!var1.nextSegmentEquals("handle-file-uploads")) {
                if (!var1.nextSegmentEquals("merge-form-attributes")) {
                    if (!var1.nextSegmentEquals("preallocate-body-buffer")) {
                        if (!var1.nextSegmentEquals("uploads-directory")) {
                            ConfigDiagnostic.unknownRunTime(var1);
                        } else {
                            var1.next();
                            rtParseKey:http:body:uploads-directory(var0, var1);
                        }
                    } else {
                        var1.next();
                        rtParseKey:http:body:preallocate-body-buffer(var0, var1);
                    }
                } else {
                    var1.next();
                    rtParseKey:http:body:merge-form-attributes(var0, var1);
                }
            } else {
                var1.next();
                rtParseKey:http:body:handle-file-uploads(var0, var1);
            }
        } else {
            var1.next();
            rtParseKey:http:body:delete-uploaded-files-on-end(var0, var1);
        }
    }

    private static void rtParseKey_http_body_delete_uploaded_files_on_end/* $FF was: rtParseKey:http:body:delete-uploaded-files-on-end*/(SmallRyeConfig var0, NameIterator var1) {
        if (var1.hasNext()) {
            ConfigDiagnostic.unknownRunTime(var1);
        }
    }

    private static void rtParseKey_http_body_handle_file_uploads/* $FF was: rtParseKey:http:body:handle-file-uploads*/(SmallRyeConfig var0, NameIterator var1) {
        if (var1.hasNext()) {
            ConfigDiagnostic.unknownRunTime(var1);
        }
    }

    private static void rtParseKey_http_body_merge_form_attributes/* $FF was: rtParseKey:http:body:merge-form-attributes*/(SmallRyeConfig var0, NameIterator var1) {
        if (var1.hasNext()) {
            ConfigDiagnostic.unknownRunTime(var1);
        }
    }

    private static void rtParseKey_http_body_preallocate_body_buffer/* $FF was: rtParseKey:http:body:preallocate-body-buffer*/(SmallRyeConfig var0, NameIterator var1) {
        if (var1.hasNext()) {
            ConfigDiagnostic.unknownRunTime(var1);
        }
    }

    private static void rtParseKey_http_body_uploads_directory/* $FF was: rtParseKey:http:body:uploads-directory*/(SmallRyeConfig var0, NameIterator var1) {
        if (var1.hasNext()) {
            ConfigDiagnostic.unknownRunTime(var1);
        }
    }

    private static void rtParseKey_http_cors/* $FF was: rtParseKey:http:cors*/(SmallRyeConfig var0, NameIterator var1) {
        if (var1.hasNext()) {
            if (!var1.nextSegmentEquals("access-control-allow-credentials")) {
                if (!var1.nextSegmentEquals("access-control-max-age")) {
                    if (!var1.nextSegmentEquals("exposed-headers")) {
                        if (!var1.nextSegmentEquals("headers")) {
                            if (!var1.nextSegmentEquals("methods")) {
                                if (!var1.nextSegmentEquals("origins")) {
                                    ConfigDiagnostic.unknownRunTime(var1);
                                } else {
                                    var1.next();
                                    rtParseKey:http:cors:origins(var0, var1);
                                }
                            } else {
                                var1.next();
                                rtParseKey:http:cors:methods(var0, var1);
                            }
                        } else {
                            var1.next();
                            rtParseKey:http:cors:headers(var0, var1);
                        }
                    } else {
                        var1.next();
                        rtParseKey:http:cors:exposed-headers(var0, var1);
                    }
                } else {
                    var1.next();
                    rtParseKey:http:cors:access-control-max-age(var0, var1);
                }
            } else {
                var1.next();
                rtParseKey:http:cors:access-control-allow-credentials(var0, var1);
            }
        }
    }

    private static void rtParseKey_http_cors_access_control_allow_credentials/* $FF was: rtParseKey:http:cors:access-control-allow-credentials*/(SmallRyeConfig var0, NameIterator var1) {
        if (var1.hasNext()) {
            ConfigDiagnostic.unknownRunTime(var1);
        }
    }

    private static void rtParseKey_http_cors_access_control_max_age/* $FF was: rtParseKey:http:cors:access-control-max-age*/(SmallRyeConfig var0, NameIterator var1) {
        if (var1.hasNext()) {
            ConfigDiagnostic.unknownRunTime(var1);
        }
    }

    private static void rtParseKey_http_cors_exposed_headers/* $FF was: rtParseKey:http:cors:exposed-headers*/(SmallRyeConfig var0, NameIterator var1) {
        if (var1.hasNext()) {
            ConfigDiagnostic.unknownRunTime(var1);
        }
    }

    private static void rtParseKey_http_cors_headers/* $FF was: rtParseKey:http:cors:headers*/(SmallRyeConfig var0, NameIterator var1) {
        if (var1.hasNext()) {
            ConfigDiagnostic.unknownRunTime(var1);
        }
    }

    private static void rtParseKey_http_cors_methods/* $FF was: rtParseKey:http:cors:methods*/(SmallRyeConfig var0, NameIterator var1) {
        if (var1.hasNext()) {
            ConfigDiagnostic.unknownRunTime(var1);
        }
    }

    private static void rtParseKey_http_cors_origins/* $FF was: rtParseKey:http:cors:origins*/(SmallRyeConfig var0, NameIterator var1) {
        if (var1.hasNext()) {
            ConfigDiagnostic.unknownRunTime(var1);
        }
    }

    private static void rtParseKey_http_domain_socket/* $FF was: rtParseKey:http:domain-socket*/(SmallRyeConfig var0, NameIterator var1) {
        if (var1.hasNext()) {
            ConfigDiagnostic.unknownRunTime(var1);
        }
    }

    private static void rtParseKey_http_domain_socket_enabled/* $FF was: rtParseKey:http:domain-socket-enabled*/(SmallRyeConfig var0, NameIterator var1) {
        if (var1.hasNext()) {
            ConfigDiagnostic.unknownRunTime(var1);
        }
    }

    private static void rtParseKey_http_enable_compression/* $FF was: rtParseKey:http:enable-compression*/(SmallRyeConfig var0, NameIterator var1) {
        if (var1.hasNext()) {
            ConfigDiagnostic.unknownRunTime(var1);
        }
    }

    private static void rtParseKey_http_host/* $FF was: rtParseKey:http:host*/(SmallRyeConfig var0, NameIterator var1) {
        if (var1.hasNext()) {
            ConfigDiagnostic.unknownRunTime(var1);
        }
    }

    private static void rtParseKey_http_host_enabled/* $FF was: rtParseKey:http:host-enabled*/(SmallRyeConfig var0, NameIterator var1) {
        if (var1.hasNext()) {
            ConfigDiagnostic.unknownRunTime(var1);
        }
    }

    private static void rtParseKey_http_http2/* $FF was: rtParseKey:http:http2*/(SmallRyeConfig var0, NameIterator var1) {
        if (var1.hasNext()) {
            ConfigDiagnostic.unknownRunTime(var1);
        }
    }

    private static void rtParseKey_http_idle_timeout/* $FF was: rtParseKey:http:idle-timeout*/(SmallRyeConfig var0, NameIterator var1) {
        if (var1.hasNext()) {
            ConfigDiagnostic.unknownRunTime(var1);
        }
    }

    private static void rtParseKey_http_insecure_requests/* $FF was: rtParseKey:http:insecure-requests*/(SmallRyeConfig var0, NameIterator var1) {
        if (var1.hasNext()) {
            ConfigDiagnostic.unknownRunTime(var1);
        }
    }

    private static void rtParseKey_http_io_threads/* $FF was: rtParseKey:http:io-threads*/(SmallRyeConfig var0, NameIterator var1) {
        if (var1.hasNext()) {
            ConfigDiagnostic.unknownRunTime(var1);
        }
    }

    private static void rtParseKey_http_limits/* $FF was: rtParseKey:http:limits*/(SmallRyeConfig var0, NameIterator var1) {
        if (!var1.hasNext()) {
            ConfigDiagnostic.unknownRunTime(var1);
        } else if (!var1.nextSegmentEquals("max-body-size")) {
            if (!var1.nextSegmentEquals("max-chunk-size")) {
                if (!var1.nextSegmentEquals("max-header-size")) {
                    if (!var1.nextSegmentEquals("max-initial-line-length")) {
                        ConfigDiagnostic.unknownRunTime(var1);
                    } else {
                        var1.next();
                        rtParseKey:http:limits:max-initial-line-length(var0, var1);
                    }
                } else {
                    var1.next();
                    rtParseKey:http:limits:max-header-size(var0, var1);
                }
            } else {
                var1.next();
                rtParseKey:http:limits:max-chunk-size(var0, var1);
            }
        } else {
            var1.next();
            rtParseKey:http:limits:max-body-size(var0, var1);
        }
    }

    private static void rtParseKey_http_limits_max_body_size/* $FF was: rtParseKey:http:limits:max-body-size*/(SmallRyeConfig var0, NameIterator var1) {
        if (var1.hasNext()) {
            ConfigDiagnostic.unknownRunTime(var1);
        }
    }

    private static void rtParseKey_http_limits_max_chunk_size/* $FF was: rtParseKey:http:limits:max-chunk-size*/(SmallRyeConfig var0, NameIterator var1) {
        if (var1.hasNext()) {
            ConfigDiagnostic.unknownRunTime(var1);
        }
    }

    private static void rtParseKey_http_limits_max_header_size/* $FF was: rtParseKey:http:limits:max-header-size*/(SmallRyeConfig var0, NameIterator var1) {
        if (var1.hasNext()) {
            ConfigDiagnostic.unknownRunTime(var1);
        }
    }

    private static void rtParseKey_http_limits_max_initial_line_length/* $FF was: rtParseKey:http:limits:max-initial-line-length*/(SmallRyeConfig var0, NameIterator var1) {
        if (var1.hasNext()) {
            ConfigDiagnostic.unknownRunTime(var1);
        }
    }

    private static void rtParseKey_http_port/* $FF was: rtParseKey:http:port*/(SmallRyeConfig var0, NameIterator var1) {
        if (var1.hasNext()) {
            ConfigDiagnostic.unknownRunTime(var1);
        }
    }

    private static void rtParseKey_http_proxy/* $FF was: rtParseKey:http:proxy*/(SmallRyeConfig var0, NameIterator var1) {
        if (!var1.hasNext()) {
            ConfigDiagnostic.unknownRunTime(var1);
        } else if (!var1.nextSegmentEquals("allow-forwarded")) {
            if (!var1.nextSegmentEquals("enable-forwarded-host")) {
                if (!var1.nextSegmentEquals("enable-forwarded-prefix")) {
                    if (!var1.nextSegmentEquals("forwarded-host-header")) {
                        if (!var1.nextSegmentEquals("forwarded-prefix-header")) {
                            if (!var1.nextSegmentEquals("proxy-address-forwarding")) {
                                ConfigDiagnostic.unknownRunTime(var1);
                            } else {
                                var1.next();
                                rtParseKey:http:proxy:proxy-address-forwarding(var0, var1);
                            }
                        } else {
                            var1.next();
                            rtParseKey:http:proxy:forwarded-prefix-header(var0, var1);
                        }
                    } else {
                        var1.next();
                        rtParseKey:http:proxy:forwarded-host-header(var0, var1);
                    }
                } else {
                    var1.next();
                    rtParseKey:http:proxy:enable-forwarded-prefix(var0, var1);
                }
            } else {
                var1.next();
                rtParseKey:http:proxy:enable-forwarded-host(var0, var1);
            }
        } else {
            var1.next();
            rtParseKey:http:proxy:allow-forwarded(var0, var1);
        }
    }

    private static void rtParseKey_http_proxy_allow_forwarded/* $FF was: rtParseKey:http:proxy:allow-forwarded*/(SmallRyeConfig var0, NameIterator var1) {
        if (var1.hasNext()) {
            ConfigDiagnostic.unknownRunTime(var1);
        }
    }

    private static void rtParseKey_http_proxy_enable_forwarded_host/* $FF was: rtParseKey:http:proxy:enable-forwarded-host*/(SmallRyeConfig var0, NameIterator var1) {
        if (var1.hasNext()) {
            ConfigDiagnostic.unknownRunTime(var1);
        }
    }

    private static void rtParseKey_http_proxy_enable_forwarded_prefix/* $FF was: rtParseKey:http:proxy:enable-forwarded-prefix*/(SmallRyeConfig var0, NameIterator var1) {
        if (var1.hasNext()) {
            ConfigDiagnostic.unknownRunTime(var1);
        }
    }

    private static void rtParseKey_http_proxy_forwarded_host_header/* $FF was: rtParseKey:http:proxy:forwarded-host-header*/(SmallRyeConfig var0, NameIterator var1) {
        if (var1.hasNext()) {
            ConfigDiagnostic.unknownRunTime(var1);
        }
    }

    private static void rtParseKey_http_proxy_forwarded_prefix_header/* $FF was: rtParseKey:http:proxy:forwarded-prefix-header*/(SmallRyeConfig var0, NameIterator var1) {
        if (var1.hasNext()) {
            ConfigDiagnostic.unknownRunTime(var1);
        }
    }

    private static void rtParseKey_http_proxy_proxy_address_forwarding/* $FF was: rtParseKey:http:proxy:proxy-address-forwarding*/(SmallRyeConfig var0, NameIterator var1) {
        if (var1.hasNext()) {
            ConfigDiagnostic.unknownRunTime(var1);
        }
    }

    private static void rtParseKey_http_proxy_address_forwarding/* $FF was: rtParseKey:http:proxy-address-forwarding*/(SmallRyeConfig var0, NameIterator var1) {
        if (var1.hasNext()) {
            ConfigDiagnostic.unknownRunTime(var1);
        }
    }

    private static void rtParseKey_http_read_timeout/* $FF was: rtParseKey:http:read-timeout*/(SmallRyeConfig var0, NameIterator var1) {
        if (var1.hasNext()) {
            ConfigDiagnostic.unknownRunTime(var1);
        }
    }

    private static void rtParseKey_http_record_request_start_time/* $FF was: rtParseKey:http:record-request-start-time*/(SmallRyeConfig var0, NameIterator var1) {
        if (var1.hasNext()) {
            ConfigDiagnostic.unknownRunTime(var1);
        }
    }

    private static void rtParseKey_http_same_site_cookie/* $FF was: rtParseKey:http:same-site-cookie*/(SmallRyeConfig var0, NameIterator var1) {
        if (!var1.hasNext()) {
            ConfigDiagnostic.unknownRunTime(var1);
        } else if (!var1.hasNext()) {
            ConfigDiagnostic.unknownRunTime(var1);
        } else {
            var1.next();
            rtParseKey:http:same-site-cookie:*(var0, var1);
        }
    }

    private static void rtParseKey_http_same_site_cookie__/* $FF was: rtParseKey:http:same-site-cookie:**/(SmallRyeConfig var0, NameIterator var1) {
        if (!var1.hasNext()) {
            ConfigDiagnostic.unknownRunTime(var1);
        } else if (!var1.nextSegmentEquals("add-secure-for-none")) {
            if (!var1.nextSegmentEquals("case-sensitive")) {
                if (!var1.nextSegmentEquals("enable-client-checker")) {
                    if (!var1.nextSegmentEquals("value")) {
                        ConfigDiagnostic.unknownRunTime(var1);
                    } else {
                        var1.next();
                        rtParseKey:http:same-site-cookie:*:value(var0, var1);
                    }
                } else {
                    var1.next();
                    rtParseKey:http:same-site-cookie:*:enable-client-checker(var0, var1);
                }
            } else {
                var1.next();
                rtParseKey:http:same-site-cookie:*:case-sensitive(var0, var1);
            }
        } else {
            var1.next();
            rtParseKey:http:same-site-cookie:*:add-secure-for-none(var0, var1);
        }
    }

    private static void rtParseKey_http_same_site_cookie___add_secure_for_none/* $FF was: rtParseKey:http:same-site-cookie:*:add-secure-for-none*/(SmallRyeConfig var0, NameIterator var1) {
        if (!var1.hasNext()) {
            var1.previous();
            rtGetEnclosing:http:HttpConfiguration#sameSiteCookie:*:SameSiteCookieConfig#addSecureForNone(var1, var0);
        } else {
            ConfigDiagnostic.unknownRunTime(var1);
        }
    }

    static Object rtGetEnclosing_http_HttpConfiguration_sameSiteCookie___SameSiteCookieConfig_addSecureForNone/* $FF was: rtGetEnclosing:http:HttpConfiguration#sameSiteCookie:*:SameSiteCookieConfig#addSecureForNone*/(NameIterator var0, SmallRyeConfig var1) {
        String var3 = var0.getPreviousSegment();
        var0.previous();
        Object var2 = rtGetEnclosing:http:HttpConfiguration#sameSiteCookie:*(var0, var1);
        var0.next();
        Object var4 = ((Map)var2).get(var3);
        if (var4 != null) {
            return var4;
        } else {
            SameSiteCookieConfig var7 = new SameSiteCookieConfig();
            String var5 = var0.getAllPreviousSegments();
            StringBuilder var6 = new StringBuilder(var5);
            initGroup$io$quarkus$vertx$http$runtime$SameSiteCookieConfig(var1, var6, var7);
            ((Map)var2).put(var3, var7);
            return var7;
        }
    }

    static Object rtGetEnclosing_http_HttpConfiguration_sameSiteCookie__/* $FF was: rtGetEnclosing:http:HttpConfiguration#sameSiteCookie:**/(NameIterator var0, SmallRyeConfig var1) {
        var0.previous();
        Object var2 = rtGetEnclosing:http:HttpConfiguration#sameSiteCookie(var0, var1);
        var0.next();
        return ((HttpConfiguration)var2).sameSiteCookie;
    }

    static Object rtGetEnclosing_http_HttpConfiguration_sameSiteCookie/* $FF was: rtGetEnclosing:http:HttpConfiguration#sameSiteCookie*/(NameIterator var0, SmallRyeConfig var1) {
        return HttpConfiguration;
    }

    static void initGroup$io$quarkus$vertx$http$runtime$SameSiteCookieConfig(SmallRyeConfig var0, StringBuilder var1, Object var2) {
        int var8 = var1.length();
        var1.append('.');
        var1.append("case-sensitive");
        String var3 = var1.toString();
        Converter var4 = conv$8;

        try {
            Object var5 = var0.getValue(var3, var4);
            ((SameSiteCookieConfig)var2).caseSensitive = (Boolean)var5;
        } catch (IllegalArgumentException var30) {
            ConfigDiagnostic.invalidValue(var3, var30);
        } catch (NoSuchElementException var31) {
            ConfigDiagnostic.missingValue(var3, var31);
        }

        var1.setLength(var8);
        var1.append('.');
        var1.append("value");
        String var9 = var1.toString();
        Converter var10 = conv$9;

        try {
            Object var11 = var0.getValue(var9, var10);
            ((SameSiteCookieConfig)var2).value = (CookieSameSite)var11;
        } catch (IllegalArgumentException var28) {
            ConfigDiagnostic.invalidValue(var9, var28);
        } catch (NoSuchElementException var29) {
            ConfigDiagnostic.missingValue(var9, var29);
        }

        var1.setLength(var8);
        var1.append('.');
        var1.append("enable-client-checker");
        String var14 = var1.toString();
        Converter var15 = conv$8;

        try {
            Object var16 = var0.getValue(var14, var15);
            ((SameSiteCookieConfig)var2).enableClientChecker = (Boolean)var16;
        } catch (IllegalArgumentException var26) {
            ConfigDiagnostic.invalidValue(var14, var26);
        } catch (NoSuchElementException var27) {
            ConfigDiagnostic.missingValue(var14, var27);
        }

        var1.setLength(var8);
        var1.append('.');
        var1.append("add-secure-for-none");
        String var19 = var1.toString();
        Converter var20 = conv$8;

        try {
            Object var21 = var0.getValue(var19, var20);
            ((SameSiteCookieConfig)var2).addSecureForNone = (Boolean)var21;
        } catch (IllegalArgumentException var24) {
            ConfigDiagnostic.invalidValue(var19, var24);
        } catch (NoSuchElementException var25) {
            ConfigDiagnostic.missingValue(var19, var25);
        }

        var1.setLength(var8);
    }

    private static void rtParseKey_http_same_site_cookie___case_sensitive/* $FF was: rtParseKey:http:same-site-cookie:*:case-sensitive*/(SmallRyeConfig var0, NameIterator var1) {
        if (!var1.hasNext()) {
            var1.previous();
            rtGetEnclosing:http:HttpConfiguration#sameSiteCookie:*:SameSiteCookieConfig#caseSensitive(var1, var0);
        } else {
            ConfigDiagnostic.unknownRunTime(var1);
        }
    }

    static Object rtGetEnclosing_http_HttpConfiguration_sameSiteCookie___SameSiteCookieConfig_caseSensitive/* $FF was: rtGetEnclosing:http:HttpConfiguration#sameSiteCookie:*:SameSiteCookieConfig#caseSensitive*/(NameIterator var0, SmallRyeConfig var1) {
        String var3 = var0.getPreviousSegment();
        var0.previous();
        Object var2 = rtGetEnclosing:http:HttpConfiguration#sameSiteCookie:*(var0, var1);
        var0.next();
        Object var4 = ((Map)var2).get(var3);
        if (var4 != null) {
            return var4;
        } else {
            SameSiteCookieConfig var7 = new SameSiteCookieConfig();
            String var5 = var0.getAllPreviousSegments();
            StringBuilder var6 = new StringBuilder(var5);
            initGroup$io$quarkus$vertx$http$runtime$SameSiteCookieConfig(var1, var6, var7);
            ((Map)var2).put(var3, var7);
            return var7;
        }
    }

    private static void rtParseKey_http_same_site_cookie___enable_client_checker/* $FF was: rtParseKey:http:same-site-cookie:*:enable-client-checker*/(SmallRyeConfig var0, NameIterator var1) {
        if (!var1.hasNext()) {
            var1.previous();
            rtGetEnclosing:http:HttpConfiguration#sameSiteCookie:*:SameSiteCookieConfig#enableClientChecker(var1, var0);
        } else {
            ConfigDiagnostic.unknownRunTime(var1);
        }
    }

    static Object rtGetEnclosing_http_HttpConfiguration_sameSiteCookie___SameSiteCookieConfig_enableClientChecker/* $FF was: rtGetEnclosing:http:HttpConfiguration#sameSiteCookie:*:SameSiteCookieConfig#enableClientChecker*/(NameIterator var0, SmallRyeConfig var1) {
        String var3 = var0.getPreviousSegment();
        var0.previous();
        Object var2 = rtGetEnclosing:http:HttpConfiguration#sameSiteCookie:*(var0, var1);
        var0.next();
        Object var4 = ((Map)var2).get(var3);
        if (var4 != null) {
            return var4;
        } else {
            SameSiteCookieConfig var7 = new SameSiteCookieConfig();
            String var5 = var0.getAllPreviousSegments();
            StringBuilder var6 = new StringBuilder(var5);
            initGroup$io$quarkus$vertx$http$runtime$SameSiteCookieConfig(var1, var6, var7);
            ((Map)var2).put(var3, var7);
            return var7;
        }
    }

    private static void rtParseKey_http_same_site_cookie___value/* $FF was: rtParseKey:http:same-site-cookie:*:value*/(SmallRyeConfig var0, NameIterator var1) {
        if (!var1.hasNext()) {
            var1.previous();
            rtGetEnclosing:http:HttpConfiguration#sameSiteCookie:*:SameSiteCookieConfig#value(var1, var0);
        } else {
            ConfigDiagnostic.unknownRunTime(var1);
        }
    }

    static Object rtGetEnclosing_http_HttpConfiguration_sameSiteCookie___SameSiteCookieConfig_value/* $FF was: rtGetEnclosing:http:HttpConfiguration#sameSiteCookie:*:SameSiteCookieConfig#value*/(NameIterator var0, SmallRyeConfig var1) {
        String var3 = var0.getPreviousSegment();
        var0.previous();
        Object var2 = rtGetEnclosing:http:HttpConfiguration#sameSiteCookie:*(var0, var1);
        var0.next();
        Object var4 = ((Map)var2).get(var3);
        if (var4 != null) {
            return var4;
        } else {
            SameSiteCookieConfig var7 = new SameSiteCookieConfig();
            String var5 = var0.getAllPreviousSegments();
            StringBuilder var6 = new StringBuilder(var5);
            initGroup$io$quarkus$vertx$http$runtime$SameSiteCookieConfig(var1, var6, var7);
            ((Map)var2).put(var3, var7);
            return var7;
        }
    }

    private static void rtParseKey_http_so_reuse_port/* $FF was: rtParseKey:http:so-reuse-port*/(SmallRyeConfig var0, NameIterator var1) {
        if (var1.hasNext()) {
            ConfigDiagnostic.unknownRunTime(var1);
        }
    }

    private static void rtParseKey_http_ssl/* $FF was: rtParseKey:http:ssl*/(SmallRyeConfig var0, NameIterator var1) {
        if (!var1.hasNext()) {
            ConfigDiagnostic.unknownRunTime(var1);
        } else if (!var1.nextSegmentEquals("certificate")) {
            if (!var1.nextSegmentEquals("cipher-suites")) {
                if (!var1.nextSegmentEquals("protocols")) {
                    if (!var1.nextSegmentEquals("client-auth")) {
                        ConfigDiagnostic.unknownRunTime(var1);
                    } else {
                        var1.next();
                        rtEmptyParseKey(var0, var1);
                    }
                } else {
                    var1.next();
                    rtParseKey:http:ssl:protocols(var0, var1);
                }
            } else {
                var1.next();
                rtParseKey:http:ssl:cipher-suites(var0, var1);
            }
        } else {
            var1.next();
            rtParseKey:http:ssl:certificate(var0, var1);
        }
    }

    private static void rtParseKey_http_ssl_certificate/* $FF was: rtParseKey:http:ssl:certificate*/(SmallRyeConfig var0, NameIterator var1) {
        if (!var1.hasNext()) {
            ConfigDiagnostic.unknownRunTime(var1);
        } else if (!var1.nextSegmentEquals("file")) {
            if (!var1.nextSegmentEquals("key-file")) {
                if (!var1.nextSegmentEquals("key-store-file")) {
                    if (!var1.nextSegmentEquals("key-store-file-type")) {
                        if (!var1.nextSegmentEquals("key-store-password")) {
                            if (!var1.nextSegmentEquals("key-store-provider")) {
                                if (!var1.nextSegmentEquals("trust-store-file")) {
                                    if (!var1.nextSegmentEquals("trust-store-file-type")) {
                                        if (!var1.nextSegmentEquals("trust-store-password")) {
                                            if (!var1.nextSegmentEquals("trust-store-provider")) {
                                                ConfigDiagnostic.unknownRunTime(var1);
                                            } else {
                                                var1.next();
                                                rtParseKey:http:ssl:certificate:trust-store-provider(var0, var1);
                                            }
                                        } else {
                                            var1.next();
                                            rtParseKey:http:ssl:certificate:trust-store-password(var0, var1);
                                        }
                                    } else {
                                        var1.next();
                                        rtParseKey:http:ssl:certificate:trust-store-file-type(var0, var1);
                                    }
                                } else {
                                    var1.next();
                                    rtParseKey:http:ssl:certificate:trust-store-file(var0, var1);
                                }
                            } else {
                                var1.next();
                                rtParseKey:http:ssl:certificate:key-store-provider(var0, var1);
                            }
                        } else {
                            var1.next();
                            rtParseKey:http:ssl:certificate:key-store-password(var0, var1);
                        }
                    } else {
                        var1.next();
                        rtParseKey:http:ssl:certificate:key-store-file-type(var0, var1);
                    }
                } else {
                    var1.next();
                    rtParseKey:http:ssl:certificate:key-store-file(var0, var1);
                }
            } else {
                var1.next();
                rtParseKey:http:ssl:certificate:key-file(var0, var1);
            }
        } else {
            var1.next();
            rtParseKey:http:ssl:certificate:file(var0, var1);
        }
    }

    private static void rtParseKey_http_ssl_certificate_file/* $FF was: rtParseKey:http:ssl:certificate:file*/(SmallRyeConfig var0, NameIterator var1) {
        if (var1.hasNext()) {
            ConfigDiagnostic.unknownRunTime(var1);
        }
    }

    private static void rtParseKey_http_ssl_certificate_key_file/* $FF was: rtParseKey:http:ssl:certificate:key-file*/(SmallRyeConfig var0, NameIterator var1) {
        if (var1.hasNext()) {
            ConfigDiagnostic.unknownRunTime(var1);
        }
    }

    private static void rtParseKey_http_ssl_certificate_key_store_file/* $FF was: rtParseKey:http:ssl:certificate:key-store-file*/(SmallRyeConfig var0, NameIterator var1) {
        if (var1.hasNext()) {
            ConfigDiagnostic.unknownRunTime(var1);
        }
    }

    private static void rtParseKey_http_ssl_certificate_key_store_file_type/* $FF was: rtParseKey:http:ssl:certificate:key-store-file-type*/(SmallRyeConfig var0, NameIterator var1) {
        if (var1.hasNext()) {
            ConfigDiagnostic.unknownRunTime(var1);
        }
    }

    private static void rtParseKey_http_ssl_certificate_key_store_password/* $FF was: rtParseKey:http:ssl:certificate:key-store-password*/(SmallRyeConfig var0, NameIterator var1) {
        if (var1.hasNext()) {
            ConfigDiagnostic.unknownRunTime(var1);
        }
    }

    private static void rtParseKey_http_ssl_certificate_key_store_provider/* $FF was: rtParseKey:http:ssl:certificate:key-store-provider*/(SmallRyeConfig var0, NameIterator var1) {
        if (var1.hasNext()) {
            ConfigDiagnostic.unknownRunTime(var1);
        }
    }

    private static void rtParseKey_http_ssl_certificate_trust_store_file/* $FF was: rtParseKey:http:ssl:certificate:trust-store-file*/(SmallRyeConfig var0, NameIterator var1) {
        if (var1.hasNext()) {
            ConfigDiagnostic.unknownRunTime(var1);
        }
    }

    private static void rtParseKey_http_ssl_certificate_trust_store_file_type/* $FF was: rtParseKey:http:ssl:certificate:trust-store-file-type*/(SmallRyeConfig var0, NameIterator var1) {
        if (var1.hasNext()) {
            ConfigDiagnostic.unknownRunTime(var1);
        }
    }

    private static void rtParseKey_http_ssl_certificate_trust_store_password/* $FF was: rtParseKey:http:ssl:certificate:trust-store-password*/(SmallRyeConfig var0, NameIterator var1) {
        if (var1.hasNext()) {
            ConfigDiagnostic.unknownRunTime(var1);
        }
    }

    private static void rtParseKey_http_ssl_certificate_trust_store_provider/* $FF was: rtParseKey:http:ssl:certificate:trust-store-provider*/(SmallRyeConfig var0, NameIterator var1) {
        if (var1.hasNext()) {
            ConfigDiagnostic.unknownRunTime(var1);
        }
    }

    private static void rtParseKey_http_ssl_cipher_suites/* $FF was: rtParseKey:http:ssl:cipher-suites*/(SmallRyeConfig var0, NameIterator var1) {
        if (var1.hasNext()) {
            ConfigDiagnostic.unknownRunTime(var1);
        }
    }

    private static void rtParseKey_http_ssl_protocols/* $FF was: rtParseKey:http:ssl:protocols*/(SmallRyeConfig var0, NameIterator var1) {
        if (var1.hasNext()) {
            ConfigDiagnostic.unknownRunTime(var1);
        }
    }

    private static void rtParseKey_http_ssl_port/* $FF was: rtParseKey:http:ssl-port*/(SmallRyeConfig var0, NameIterator var1) {
        if (var1.hasNext()) {
            ConfigDiagnostic.unknownRunTime(var1);
        }
    }

    private static void rtParseKey_http_tcp_cork/* $FF was: rtParseKey:http:tcp-cork*/(SmallRyeConfig var0, NameIterator var1) {
        if (var1.hasNext()) {
            ConfigDiagnostic.unknownRunTime(var1);
        }
    }

    private static void rtParseKey_http_tcp_fast_open/* $FF was: rtParseKey:http:tcp-fast-open*/(SmallRyeConfig var0, NameIterator var1) {
        if (var1.hasNext()) {
            ConfigDiagnostic.unknownRunTime(var1);
        }
    }

    private static void rtParseKey_http_tcp_quick_ack/* $FF was: rtParseKey:http:tcp-quick-ack*/(SmallRyeConfig var0, NameIterator var1) {
        if (var1.hasNext()) {
            ConfigDiagnostic.unknownRunTime(var1);
        }
    }

    private static void rtParseKey_http_test_port/* $FF was: rtParseKey:http:test-port*/(SmallRyeConfig var0, NameIterator var1) {
        if (var1.hasNext()) {
            ConfigDiagnostic.unknownRunTime(var1);
        }
    }

    private static void rtParseKey_http_test_ssl_port/* $FF was: rtParseKey:http:test-ssl-port*/(SmallRyeConfig var0, NameIterator var1) {
        if (var1.hasNext()) {
            ConfigDiagnostic.unknownRunTime(var1);
        }
    }

    private static void rtParseKey_log/* $FF was: rtParseKey:log*/(SmallRyeConfig var0, NameIterator var1) {
        if (!var1.hasNext()) {
            ConfigDiagnostic.unknownRunTime(var1);
        } else if (!var1.nextSegmentEquals("category")) {
            if (!var1.nextSegmentEquals("console")) {
                if (!var1.nextSegmentEquals("file")) {
                    if (!var1.nextSegmentEquals("filter")) {
                        if (!var1.nextSegmentEquals("handler")) {
                            if (!var1.nextSegmentEquals("level")) {
                                if (!var1.nextSegmentEquals("syslog")) {
                                    if (!var1.nextSegmentEquals("metrics")) {
                                        if (!var1.nextSegmentEquals("min-level")) {
                                            ConfigDiagnostic.unknownRunTime(var1);
                                        } else {
                                            var1.next();
                                            rtEmptyParseKey(var0, var1);
                                        }
                                    } else {
                                        var1.next();
                                        rtParseKey:log:metrics(var0, var1);
                                    }
                                } else {
                                    var1.next();
                                    rtParseKey:log:syslog(var0, var1);
                                }
                            } else {
                                var1.next();
                                rtParseKey:log:level(var0, var1);
                            }
                        } else {
                            var1.next();
                            rtParseKey:log:handler(var0, var1);
                        }
                    } else {
                        var1.next();
                        rtParseKey:log:filter(var0, var1);
                    }
                } else {
                    var1.next();
                    rtParseKey:log:file(var0, var1);
                }
            } else {
                var1.next();
                rtParseKey:log:console(var0, var1);
            }
        } else {
            var1.next();
            rtParseKey:log:category(var0, var1);
        }
    }

    private static void rtParseKey_log_category/* $FF was: rtParseKey:log:category*/(SmallRyeConfig var0, NameIterator var1) {
        if (!var1.hasNext()) {
            ConfigDiagnostic.unknownRunTime(var1);
        } else if (!var1.hasNext()) {
            ConfigDiagnostic.unknownRunTime(var1);
        } else {
            var1.next();
            rtParseKey:log:category:*(var0, var1);
        }
    }

    private static void rtParseKey_log_category__/* $FF was: rtParseKey:log:category:**/(SmallRyeConfig var0, NameIterator var1) {
        if (!var1.hasNext()) {
            ConfigDiagnostic.unknownRunTime(var1);
        } else if (!var1.nextSegmentEquals("handlers")) {
            if (!var1.nextSegmentEquals("level")) {
                if (!var1.nextSegmentEquals("use-parent-handlers")) {
                    if (!var1.nextSegmentEquals("min-level")) {
                        ConfigDiagnostic.unknownRunTime(var1);
                    } else {
                        var1.next();
                        rtEmptyParseKey(var0, var1);
                    }
                } else {
                    var1.next();
                    rtParseKey:log:category:*:use-parent-handlers(var0, var1);
                }
            } else {
                var1.next();
                rtParseKey:log:category:*:level(var0, var1);
            }
        } else {
            var1.next();
            rtParseKey:log:category:*:handlers(var0, var1);
        }
    }

    private static void rtParseKey_log_category___handlers/* $FF was: rtParseKey:log:category:*:handlers*/(SmallRyeConfig var0, NameIterator var1) {
        if (!var1.hasNext()) {
            var1.previous();
            rtGetEnclosing:log:LogConfig#categories:*:CategoryConfig#handlers(var1, var0);
        } else {
            ConfigDiagnostic.unknownRunTime(var1);
        }
    }

    static Object rtGetEnclosing_log_LogConfig_categories___CategoryConfig_handlers/* $FF was: rtGetEnclosing:log:LogConfig#categories:*:CategoryConfig#handlers*/(NameIterator var0, SmallRyeConfig var1) {
        String var3 = var0.getPreviousSegment();
        var0.previous();
        Object var2 = rtGetEnclosing:log:LogConfig#categories:*(var0, var1);
        var0.next();
        Object var4 = ((Map)var2).get(var3);
        if (var4 != null) {
            return var4;
        } else {
            CategoryConfig var7 = new CategoryConfig();
            String var5 = var0.getAllPreviousSegments();
            StringBuilder var6 = new StringBuilder(var5);
            initGroup$io$quarkus$runtime$logging$CategoryConfig(var1, var6, var7);
            ((Map)var2).put(var3, var7);
            return var7;
        }
    }

    static Object rtGetEnclosing_log_LogConfig_categories__/* $FF was: rtGetEnclosing:log:LogConfig#categories:**/(NameIterator var0, SmallRyeConfig var1) {
        var0.previous();
        Object var2 = rtGetEnclosing:log:LogConfig#categories(var0, var1);
        var0.next();
        return ((LogConfig)var2).categories;
    }

    static Object rtGetEnclosing_log_LogConfig_categories/* $FF was: rtGetEnclosing:log:LogConfig#categories*/(NameIterator var0, SmallRyeConfig var1) {
        return LogConfig;
    }

    static void initGroup$io$quarkus$runtime$logging$CategoryConfig(SmallRyeConfig var0, StringBuilder var1, Object var2) {
        int var8 = var1.length();
        var1.append('.');
        var1.append("level");
        String var3 = var1.toString();
        Converter var4 = conv$7;

        try {
            Object var5 = var0.getValue(var3, var4);
            accessor.set_level(var2, var5);
        } catch (IllegalArgumentException var23) {
            ConfigDiagnostic.invalidValue(var3, var23);
        } catch (NoSuchElementException var24) {
            ConfigDiagnostic.missingValue(var3, var24);
        }

        var1.setLength(var8);
        var1.append('.');
        var1.append("handlers");
        String var9 = var1.toString();
        Converter var10 = conv$3;

        try {
            Object var11 = var0.getValue(var9, var10);
            accessor.set_handlers(var2, var11);
        } catch (IllegalArgumentException var21) {
            ConfigDiagnostic.invalidValue(var9, var21);
        } catch (NoSuchElementException var22) {
            ConfigDiagnostic.missingValue(var9, var22);
        }

        var1.setLength(var8);
        var1.append('.');
        var1.append("use-parent-handlers");
        String var14 = var1.toString();
        Converter var15 = conv$8;

        try {
            Object var16 = var0.getValue(var14, var15);
            accessor.set_useParentHandlers(var2, (Boolean)var16);
        } catch (IllegalArgumentException var19) {
            ConfigDiagnostic.invalidValue(var14, var19);
        } catch (NoSuchElementException var20) {
            ConfigDiagnostic.missingValue(var14, var20);
        }

        var1.setLength(var8);
    }

    private static void rtParseKey_log_category___level/* $FF was: rtParseKey:log:category:*:level*/(SmallRyeConfig var0, NameIterator var1) {
        if (!var1.hasNext()) {
            var1.previous();
            rtGetEnclosing:log:LogConfig#categories:*:CategoryConfig#level(var1, var0);
        } else {
            ConfigDiagnostic.unknownRunTime(var1);
        }
    }

    static Object rtGetEnclosing_log_LogConfig_categories___CategoryConfig_level/* $FF was: rtGetEnclosing:log:LogConfig#categories:*:CategoryConfig#level*/(NameIterator var0, SmallRyeConfig var1) {
        String var3 = var0.getPreviousSegment();
        var0.previous();
        Object var2 = rtGetEnclosing:log:LogConfig#categories:*(var0, var1);
        var0.next();
        Object var4 = ((Map)var2).get(var3);
        if (var4 != null) {
            return var4;
        } else {
            CategoryConfig var7 = new CategoryConfig();
            String var5 = var0.getAllPreviousSegments();
            StringBuilder var6 = new StringBuilder(var5);
            initGroup$io$quarkus$runtime$logging$CategoryConfig(var1, var6, var7);
            ((Map)var2).put(var3, var7);
            return var7;
        }
    }

    private static void rtParseKey_log_category___use_parent_handlers/* $FF was: rtParseKey:log:category:*:use-parent-handlers*/(SmallRyeConfig var0, NameIterator var1) {
        if (!var1.hasNext()) {
            var1.previous();
            rtGetEnclosing:log:LogConfig#categories:*:CategoryConfig#useParentHandlers(var1, var0);
        } else {
            ConfigDiagnostic.unknownRunTime(var1);
        }
    }

    static Object rtGetEnclosing_log_LogConfig_categories___CategoryConfig_useParentHandlers/* $FF was: rtGetEnclosing:log:LogConfig#categories:*:CategoryConfig#useParentHandlers*/(NameIterator var0, SmallRyeConfig var1) {
        String var3 = var0.getPreviousSegment();
        var0.previous();
        Object var2 = rtGetEnclosing:log:LogConfig#categories:*(var0, var1);
        var0.next();
        Object var4 = ((Map)var2).get(var3);
        if (var4 != null) {
            return var4;
        } else {
            CategoryConfig var7 = new CategoryConfig();
            String var5 = var0.getAllPreviousSegments();
            StringBuilder var6 = new StringBuilder(var5);
            initGroup$io$quarkus$runtime$logging$CategoryConfig(var1, var6, var7);
            ((Map)var2).put(var3, var7);
            return var7;
        }
    }

    private static void rtParseKey_log_console/* $FF was: rtParseKey:log:console*/(SmallRyeConfig var0, NameIterator var1) {
        if (!var1.hasNext()) {
            ConfigDiagnostic.unknownRunTime(var1);
        } else if (!var1.nextSegmentEquals("async")) {
            if (!var1.nextSegmentEquals("color")) {
                if (!var1.nextSegmentEquals("darken")) {
                    if (!var1.nextSegmentEquals("enable")) {
                        if (!var1.nextSegmentEquals("format")) {
                            if (!var1.nextSegmentEquals("level")) {
                                ConfigDiagnostic.unknownRunTime(var1);
                            } else {
                                var1.next();
                                rtParseKey:log:console:level(var0, var1);
                            }
                        } else {
                            var1.next();
                            rtParseKey:log:console:format(var0, var1);
                        }
                    } else {
                        var1.next();
                        rtParseKey:log:console:enable(var0, var1);
                    }
                } else {
                    var1.next();
                    rtParseKey:log:console:darken(var0, var1);
                }
            } else {
                var1.next();
                rtParseKey:log:console:color(var0, var1);
            }
        } else {
            var1.next();
            rtParseKey:log:console:async(var0, var1);
        }
    }

    private static void rtParseKey_log_console_async/* $FF was: rtParseKey:log:console:async*/(SmallRyeConfig var0, NameIterator var1) {
        if (var1.hasNext()) {
            if (!var1.nextSegmentEquals("overflow")) {
                if (!var1.nextSegmentEquals("queue-length")) {
                    ConfigDiagnostic.unknownRunTime(var1);
                } else {
                    var1.next();
                    rtParseKey:log:console:async:queue-length(var0, var1);
                }
            } else {
                var1.next();
                rtParseKey:log:console:async:overflow(var0, var1);
            }
        }
    }

    private static void rtParseKey_log_console_async_overflow/* $FF was: rtParseKey:log:console:async:overflow*/(SmallRyeConfig var0, NameIterator var1) {
        if (var1.hasNext()) {
            ConfigDiagnostic.unknownRunTime(var1);
        }
    }

    private static void rtParseKey_log_console_async_queue_length/* $FF was: rtParseKey:log:console:async:queue-length*/(SmallRyeConfig var0, NameIterator var1) {
        if (var1.hasNext()) {
            ConfigDiagnostic.unknownRunTime(var1);
        }
    }

    private static void rtParseKey_log_console_color/* $FF was: rtParseKey:log:console:color*/(SmallRyeConfig var0, NameIterator var1) {
        if (var1.hasNext()) {
            ConfigDiagnostic.unknownRunTime(var1);
        }
    }

    private static void rtParseKey_log_console_darken/* $FF was: rtParseKey:log:console:darken*/(SmallRyeConfig var0, NameIterator var1) {
        if (var1.hasNext()) {
            ConfigDiagnostic.unknownRunTime(var1);
        }
    }

    private static void rtParseKey_log_console_enable/* $FF was: rtParseKey:log:console:enable*/(SmallRyeConfig var0, NameIterator var1) {
        if (var1.hasNext()) {
            ConfigDiagnostic.unknownRunTime(var1);
        }
    }

    private static void rtParseKey_log_console_format/* $FF was: rtParseKey:log:console:format*/(SmallRyeConfig var0, NameIterator var1) {
        if (var1.hasNext()) {
            ConfigDiagnostic.unknownRunTime(var1);
        }
    }

    private static void rtParseKey_log_console_level/* $FF was: rtParseKey:log:console:level*/(SmallRyeConfig var0, NameIterator var1) {
        if (var1.hasNext()) {
            ConfigDiagnostic.unknownRunTime(var1);
        }
    }

    private static void rtParseKey_log_file/* $FF was: rtParseKey:log:file*/(SmallRyeConfig var0, NameIterator var1) {
        if (!var1.hasNext()) {
            ConfigDiagnostic.unknownRunTime(var1);
        } else if (!var1.nextSegmentEquals("async")) {
            if (!var1.nextSegmentEquals("enable")) {
                if (!var1.nextSegmentEquals("format")) {
                    if (!var1.nextSegmentEquals("level")) {
                        if (!var1.nextSegmentEquals("path")) {
                            if (!var1.nextSegmentEquals("rotation")) {
                                ConfigDiagnostic.unknownRunTime(var1);
                            } else {
                                var1.next();
                                rtParseKey:log:file:rotation(var0, var1);
                            }
                        } else {
                            var1.next();
                            rtParseKey:log:file:path(var0, var1);
                        }
                    } else {
                        var1.next();
                        rtParseKey:log:file:level(var0, var1);
                    }
                } else {
                    var1.next();
                    rtParseKey:log:file:format(var0, var1);
                }
            } else {
                var1.next();
                rtParseKey:log:file:enable(var0, var1);
            }
        } else {
            var1.next();
            rtParseKey:log:file:async(var0, var1);
        }
    }

    private static void rtParseKey_log_file_async/* $FF was: rtParseKey:log:file:async*/(SmallRyeConfig var0, NameIterator var1) {
        if (var1.hasNext()) {
            if (!var1.nextSegmentEquals("overflow")) {
                if (!var1.nextSegmentEquals("queue-length")) {
                    ConfigDiagnostic.unknownRunTime(var1);
                } else {
                    var1.next();
                    rtParseKey:log:file:async:queue-length(var0, var1);
                }
            } else {
                var1.next();
                rtParseKey:log:file:async:overflow(var0, var1);
            }
        }
    }

    private static void rtParseKey_log_file_async_overflow/* $FF was: rtParseKey:log:file:async:overflow*/(SmallRyeConfig var0, NameIterator var1) {
        if (var1.hasNext()) {
            ConfigDiagnostic.unknownRunTime(var1);
        }
    }

    private static void rtParseKey_log_file_async_queue_length/* $FF was: rtParseKey:log:file:async:queue-length*/(SmallRyeConfig var0, NameIterator var1) {
        if (var1.hasNext()) {
            ConfigDiagnostic.unknownRunTime(var1);
        }
    }

    private static void rtParseKey_log_file_enable/* $FF was: rtParseKey:log:file:enable*/(SmallRyeConfig var0, NameIterator var1) {
        if (var1.hasNext()) {
            ConfigDiagnostic.unknownRunTime(var1);
        }
    }

    private static void rtParseKey_log_file_format/* $FF was: rtParseKey:log:file:format*/(SmallRyeConfig var0, NameIterator var1) {
        if (var1.hasNext()) {
            ConfigDiagnostic.unknownRunTime(var1);
        }
    }

    private static void rtParseKey_log_file_level/* $FF was: rtParseKey:log:file:level*/(SmallRyeConfig var0, NameIterator var1) {
        if (var1.hasNext()) {
            ConfigDiagnostic.unknownRunTime(var1);
        }
    }

    private static void rtParseKey_log_file_path/* $FF was: rtParseKey:log:file:path*/(SmallRyeConfig var0, NameIterator var1) {
        if (var1.hasNext()) {
            ConfigDiagnostic.unknownRunTime(var1);
        }
    }

    private static void rtParseKey_log_file_rotation/* $FF was: rtParseKey:log:file:rotation*/(SmallRyeConfig var0, NameIterator var1) {
        if (!var1.hasNext()) {
            ConfigDiagnostic.unknownRunTime(var1);
        } else if (!var1.nextSegmentEquals("file-suffix")) {
            if (!var1.nextSegmentEquals("max-backup-index")) {
                if (!var1.nextSegmentEquals("max-file-size")) {
                    if (!var1.nextSegmentEquals("rotate-on-boot")) {
                        ConfigDiagnostic.unknownRunTime(var1);
                    } else {
                        var1.next();
                        rtParseKey:log:file:rotation:rotate-on-boot(var0, var1);
                    }
                } else {
                    var1.next();
                    rtParseKey:log:file:rotation:max-file-size(var0, var1);
                }
            } else {
                var1.next();
                rtParseKey:log:file:rotation:max-backup-index(var0, var1);
            }
        } else {
            var1.next();
            rtParseKey:log:file:rotation:file-suffix(var0, var1);
        }
    }

    private static void rtParseKey_log_file_rotation_file_suffix/* $FF was: rtParseKey:log:file:rotation:file-suffix*/(SmallRyeConfig var0, NameIterator var1) {
        if (var1.hasNext()) {
            ConfigDiagnostic.unknownRunTime(var1);
        }
    }

    private static void rtParseKey_log_file_rotation_max_backup_index/* $FF was: rtParseKey:log:file:rotation:max-backup-index*/(SmallRyeConfig var0, NameIterator var1) {
        if (var1.hasNext()) {
            ConfigDiagnostic.unknownRunTime(var1);
        }
    }

    private static void rtParseKey_log_file_rotation_max_file_size/* $FF was: rtParseKey:log:file:rotation:max-file-size*/(SmallRyeConfig var0, NameIterator var1) {
        if (var1.hasNext()) {
            ConfigDiagnostic.unknownRunTime(var1);
        }
    }

    private static void rtParseKey_log_file_rotation_rotate_on_boot/* $FF was: rtParseKey:log:file:rotation:rotate-on-boot*/(SmallRyeConfig var0, NameIterator var1) {
        if (var1.hasNext()) {
            ConfigDiagnostic.unknownRunTime(var1);
        }
    }

    private static void rtParseKey_log_filter/* $FF was: rtParseKey:log:filter*/(SmallRyeConfig var0, NameIterator var1) {
        if (!var1.hasNext()) {
            ConfigDiagnostic.unknownRunTime(var1);
        } else if (!var1.hasNext()) {
            ConfigDiagnostic.unknownRunTime(var1);
        } else {
            var1.next();
            rtParseKey:log:filter:*(var0, var1);
        }
    }

    private static void rtParseKey_log_filter__/* $FF was: rtParseKey:log:filter:**/(SmallRyeConfig var0, NameIterator var1) {
        if (!var1.hasNext()) {
            ConfigDiagnostic.unknownRunTime(var1);
        } else if (!var1.nextSegmentEquals("if-starts-with")) {
            if (!var1.nextSegmentEquals("target-level")) {
                ConfigDiagnostic.unknownRunTime(var1);
            } else {
                var1.next();
                rtParseKey:log:filter:*:target-level(var0, var1);
            }
        } else {
            var1.next();
            rtParseKey:log:filter:*:if-starts-with(var0, var1);
        }
    }

    private static void rtParseKey_log_filter___if_starts_with/* $FF was: rtParseKey:log:filter:*:if-starts-with*/(SmallRyeConfig var0, NameIterator var1) {
        if (!var1.hasNext()) {
            var1.previous();
            rtGetEnclosing:log:LogConfig#filters:*:CleanupFilterConfig#ifStartsWith(var1, var0);
        } else {
            ConfigDiagnostic.unknownRunTime(var1);
        }
    }

    static Object rtGetEnclosing_log_LogConfig_filters___CleanupFilterConfig_ifStartsWith/* $FF was: rtGetEnclosing:log:LogConfig#filters:*:CleanupFilterConfig#ifStartsWith*/(NameIterator var0, SmallRyeConfig var1) {
        String var3 = var0.getPreviousSegment();
        var0.previous();
        Object var2 = rtGetEnclosing:log:LogConfig#filters:*(var0, var1);
        var0.next();
        Object var4 = ((Map)var2).get(var3);
        if (var4 != null) {
            return var4;
        } else {
            CleanupFilterConfig var7 = new CleanupFilterConfig();
            String var5 = var0.getAllPreviousSegments();
            StringBuilder var6 = new StringBuilder(var5);
            initGroup$io$quarkus$runtime$logging$CleanupFilterConfig(var1, var6, var7);
            ((Map)var2).put(var3, var7);
            return var7;
        }
    }

    static Object rtGetEnclosing_log_LogConfig_filters__/* $FF was: rtGetEnclosing:log:LogConfig#filters:**/(NameIterator var0, SmallRyeConfig var1) {
        var0.previous();
        Object var2 = rtGetEnclosing:log:LogConfig#filters(var0, var1);
        var0.next();
        return ((LogConfig)var2).filters;
    }

    static Object rtGetEnclosing_log_LogConfig_filters/* $FF was: rtGetEnclosing:log:LogConfig#filters*/(NameIterator var0, SmallRyeConfig var1) {
        return LogConfig;
    }

    static void initGroup$io$quarkus$runtime$logging$CleanupFilterConfig(SmallRyeConfig var0, StringBuilder var1, Object var2) {
        int var8 = var1.length();
        var1.append('.');
        var1.append("if-starts-with");
        String var3 = var1.toString();
        Converter var4 = conv$4;

        try {
            Object var5 = var0.getValue(var3, var4);
            io.quarkus.runtime.logging.CleanupFilterConfig..accessor.set_ifStartsWith(var2, var5);
        } catch (IllegalArgumentException var16) {
            ConfigDiagnostic.invalidValue(var3, var16);
        } catch (NoSuchElementException var17) {
            ConfigDiagnostic.missingValue(var3, var17);
        }

        var1.setLength(var8);
        var1.append('.');
        var1.append("target-level");
        String var9 = var1.toString();
        Converter var10 = conv$10;

        try {
            Object var11 = var0.getValue(var9, var10);
            io.quarkus.runtime.logging.CleanupFilterConfig..accessor.set_targetLevel(var2, var11);
        } catch (IllegalArgumentException var14) {
            ConfigDiagnostic.invalidValue(var9, var14);
        } catch (NoSuchElementException var15) {
            ConfigDiagnostic.missingValue(var9, var15);
        }

        var1.setLength(var8);
    }

    private static void rtParseKey_log_filter___target_level/* $FF was: rtParseKey:log:filter:*:target-level*/(SmallRyeConfig var0, NameIterator var1) {
        if (!var1.hasNext()) {
            var1.previous();
            rtGetEnclosing:log:LogConfig#filters:*:CleanupFilterConfig#targetLevel(var1, var0);
        } else {
            ConfigDiagnostic.unknownRunTime(var1);
        }
    }

    static Object rtGetEnclosing_log_LogConfig_filters___CleanupFilterConfig_targetLevel/* $FF was: rtGetEnclosing:log:LogConfig#filters:*:CleanupFilterConfig#targetLevel*/(NameIterator var0, SmallRyeConfig var1) {
        String var3 = var0.getPreviousSegment();
        var0.previous();
        Object var2 = rtGetEnclosing:log:LogConfig#filters:*(var0, var1);
        var0.next();
        Object var4 = ((Map)var2).get(var3);
        if (var4 != null) {
            return var4;
        } else {
            CleanupFilterConfig var7 = new CleanupFilterConfig();
            String var5 = var0.getAllPreviousSegments();
            StringBuilder var6 = new StringBuilder(var5);
            initGroup$io$quarkus$runtime$logging$CleanupFilterConfig(var1, var6, var7);
            ((Map)var2).put(var3, var7);
            return var7;
        }
    }

    private static void rtParseKey_log_handler/* $FF was: rtParseKey:log:handler*/(SmallRyeConfig var0, NameIterator var1) {
        if (!var1.hasNext()) {
            ConfigDiagnostic.unknownRunTime(var1);
        } else if (!var1.nextSegmentEquals("console")) {
            if (!var1.nextSegmentEquals("file")) {
                if (!var1.nextSegmentEquals("syslog")) {
                    ConfigDiagnostic.unknownRunTime(var1);
                } else {
                    var1.next();
                    rtParseKey:log:handler:syslog(var0, var1);
                }
            } else {
                var1.next();
                rtParseKey:log:handler:file(var0, var1);
            }
        } else {
            var1.next();
            rtParseKey:log:handler:console(var0, var1);
        }
    }

    private static void rtParseKey_log_handler_console/* $FF was: rtParseKey:log:handler:console*/(SmallRyeConfig var0, NameIterator var1) {
        if (!var1.hasNext()) {
            ConfigDiagnostic.unknownRunTime(var1);
        } else if (!var1.hasNext()) {
            ConfigDiagnostic.unknownRunTime(var1);
        } else {
            var1.next();
            rtParseKey:log:handler:console:*(var0, var1);
        }
    }

    private static void rtParseKey_log_handler_console__/* $FF was: rtParseKey:log:handler:console:**/(SmallRyeConfig var0, NameIterator var1) {
        if (!var1.hasNext()) {
            ConfigDiagnostic.unknownRunTime(var1);
        } else if (!var1.nextSegmentEquals("async")) {
            if (!var1.nextSegmentEquals("color")) {
                if (!var1.nextSegmentEquals("darken")) {
                    if (!var1.nextSegmentEquals("enable")) {
                        if (!var1.nextSegmentEquals("format")) {
                            if (!var1.nextSegmentEquals("level")) {
                                ConfigDiagnostic.unknownRunTime(var1);
                            } else {
                                var1.next();
                                rtParseKey:log:handler:console:*:level(var0, var1);
                            }
                        } else {
                            var1.next();
                            rtParseKey:log:handler:console:*:format(var0, var1);
                        }
                    } else {
                        var1.next();
                        rtParseKey:log:handler:console:*:enable(var0, var1);
                    }
                } else {
                    var1.next();
                    rtParseKey:log:handler:console:*:darken(var0, var1);
                }
            } else {
                var1.next();
                rtParseKey:log:handler:console:*:color(var0, var1);
            }
        } else {
            var1.next();
            rtParseKey:log:handler:console:*:async(var0, var1);
        }
    }

    private static void rtParseKey_log_handler_console___async/* $FF was: rtParseKey:log:handler:console:*:async*/(SmallRyeConfig var0, NameIterator var1) {
        if (!var1.hasNext()) {
            rtGetEnclosing:log:LogConfig#consoleHandlers:*:ConsoleConfig#async:AsyncConfig#enable(var1, var0);
        } else if (!var1.nextSegmentEquals("overflow")) {
            if (!var1.nextSegmentEquals("queue-length")) {
                ConfigDiagnostic.unknownRunTime(var1);
            } else {
                var1.next();
                rtParseKey:log:handler:console:*:async:queue-length(var0, var1);
            }
        } else {
            var1.next();
            rtParseKey:log:handler:console:*:async:overflow(var0, var1);
        }
    }

    static Object rtGetEnclosing_log_LogConfig_consoleHandlers___ConsoleConfig_async_AsyncConfig_enable/* $FF was: rtGetEnclosing:log:LogConfig#consoleHandlers:*:ConsoleConfig#async:AsyncConfig#enable*/(NameIterator var0, SmallRyeConfig var1) {
        var0.previous();
        Object var2 = io.quarkus.runtime.logging.ConsoleConfig..accessor.get_async(rtGetEnclosing:log:LogConfig#consoleHandlers:*:ConsoleConfig#async(var0, var1));
        var0.next();
        return var2;
    }

    static Object rtGetEnclosing_log_LogConfig_consoleHandlers___ConsoleConfig_async/* $FF was: rtGetEnclosing:log:LogConfig#consoleHandlers:*:ConsoleConfig#async*/(NameIterator var0, SmallRyeConfig var1) {
        String var3 = var0.getPreviousSegment();
        var0.previous();
        Object var2 = rtGetEnclosing:log:LogConfig#consoleHandlers:*(var0, var1);
        var0.next();
        Object var4 = ((Map)var2).get(var3);
        if (var4 != null) {
            return var4;
        } else {
            ConsoleConfig var7 = new ConsoleConfig();
            String var5 = var0.getAllPreviousSegments();
            StringBuilder var6 = new StringBuilder(var5);
            initGroup$io$quarkus$runtime$logging$ConsoleConfig(var1, var6, var7);
            ((Map)var2).put(var3, var7);
            return var7;
        }
    }

    static Object rtGetEnclosing_log_LogConfig_consoleHandlers__/* $FF was: rtGetEnclosing:log:LogConfig#consoleHandlers:**/(NameIterator var0, SmallRyeConfig var1) {
        var0.previous();
        Object var2 = rtGetEnclosing:log:LogConfig#consoleHandlers(var0, var1);
        var0.next();
        return ((LogConfig)var2).consoleHandlers;
    }

    static Object rtGetEnclosing_log_LogConfig_consoleHandlers/* $FF was: rtGetEnclosing:log:LogConfig#consoleHandlers*/(NameIterator var0, SmallRyeConfig var1) {
        return LogConfig;
    }

    static void initGroup$io$quarkus$runtime$logging$ConsoleConfig(SmallRyeConfig var0, StringBuilder var1, Object var2) {
        int var8 = var1.length();
        var1.append('.');
        var1.append("enable");
        String var3 = var1.toString();
        Converter var4 = conv$8;

        try {
            Object var5 = var0.getValue(var3, var4);
            io.quarkus.runtime.logging.ConsoleConfig..accessor.set_enable(var2, (Boolean)var5);
        } catch (IllegalArgumentException var38) {
            ConfigDiagnostic.invalidValue(var3, var38);
        } catch (NoSuchElementException var39) {
            ConfigDiagnostic.missingValue(var3, var39);
        }

        var1.setLength(var8);
        var1.append('.');
        var1.append("format");
        String var9 = var1.toString();
        Converter var10 = conv$2;

        try {
            Object var11 = var0.getValue(var9, var10);
            io.quarkus.runtime.logging.ConsoleConfig..accessor.set_format(var2, var11);
        } catch (IllegalArgumentException var36) {
            ConfigDiagnostic.invalidValue(var9, var36);
        } catch (NoSuchElementException var37) {
            ConfigDiagnostic.missingValue(var9, var37);
        }

        var1.setLength(var8);
        var1.append('.');
        var1.append("level");
        String var14 = var1.toString();
        Converter var15 = conv$10;

        try {
            Object var16 = var0.getValue(var14, var15);
            io.quarkus.runtime.logging.ConsoleConfig..accessor.set_level(var2, var16);
        } catch (IllegalArgumentException var34) {
            ConfigDiagnostic.invalidValue(var14, var34);
        } catch (NoSuchElementException var35) {
            ConfigDiagnostic.missingValue(var14, var35);
        }

        var1.setLength(var8);
        var1.append('.');
        var1.append("color");
        String var19 = var1.toString();
        Converter var20 = conv$0;

        try {
            Object var21 = var0.getValue(var19, var20);
            io.quarkus.runtime.logging.ConsoleConfig..accessor.set_color(var2, var21);
        } catch (IllegalArgumentException var32) {
            ConfigDiagnostic.invalidValue(var19, var32);
        } catch (NoSuchElementException var33) {
            ConfigDiagnostic.missingValue(var19, var33);
        }

        var1.setLength(var8);
        var1.append('.');
        var1.append("darken");
        String var24 = var1.toString();
        Converter var25 = conv$11;

        try {
            Object var26 = var0.getValue(var24, var25);
            io.quarkus.runtime.logging.ConsoleConfig..accessor.set_darken(var2, (Integer)var26);
        } catch (IllegalArgumentException var30) {
            ConfigDiagnostic.invalidValue(var24, var30);
        } catch (NoSuchElementException var31) {
            ConfigDiagnostic.missingValue(var24, var31);
        }

        var1.setLength(var8);
        var1.append('.');
        var1.append("async");
        AsyncConfig var29 = new AsyncConfig();
        initGroup$io$quarkus$runtime$logging$AsyncConfig(var0, var1, var29);
        io.quarkus.runtime.logging.ConsoleConfig..accessor.set_async(var2, var29);
        var1.setLength(var8);
    }

    static void initGroup$io$quarkus$runtime$logging$AsyncConfig(SmallRyeConfig var0, StringBuilder var1, Object var2) {
        int var13 = var1.length();
        String var3 = var1.toString();
        Converter var4 = conv$8;

        try {
            Object var5 = var0.getValue(var3, var4);
            io.quarkus.runtime.logging.AsyncConfig..accessor.set_enable(var2, (Boolean)var5);
        } catch (IllegalArgumentException var23) {
            ConfigDiagnostic.invalidValue(var3, var23);
        } catch (NoSuchElementException var24) {
            ConfigDiagnostic.missingValue(var3, var24);
        }

        var1.append('.');
        var1.append("queue-length");
        String var8 = var1.toString();
        Converter var9 = conv$11;

        try {
            Object var10 = var0.getValue(var8, var9);
            io.quarkus.runtime.logging.AsyncConfig..accessor.set_queueLength(var2, (Integer)var10);
        } catch (IllegalArgumentException var21) {
            ConfigDiagnostic.invalidValue(var8, var21);
        } catch (NoSuchElementException var22) {
            ConfigDiagnostic.missingValue(var8, var22);
        }

        var1.setLength(var13);
        var1.append('.');
        var1.append("overflow");
        String var14 = var1.toString();
        Converter var15 = conv$12;

        try {
            Object var16 = var0.getValue(var14, var15);
            io.quarkus.runtime.logging.AsyncConfig..accessor.set_overflow(var2, var16);
        } catch (IllegalArgumentException var19) {
            ConfigDiagnostic.invalidValue(var14, var19);
        } catch (NoSuchElementException var20) {
            ConfigDiagnostic.missingValue(var14, var20);
        }

        var1.setLength(var13);
    }

    private static void rtParseKey_log_handler_console___async_overflow/* $FF was: rtParseKey:log:handler:console:*:async:overflow*/(SmallRyeConfig var0, NameIterator var1) {
        if (!var1.hasNext()) {
            var1.previous();
            rtGetEnclosing:log:LogConfig#consoleHandlers:*:ConsoleConfig#async:AsyncConfig#overflow(var1, var0);
        } else {
            ConfigDiagnostic.unknownRunTime(var1);
        }
    }

    static Object rtGetEnclosing_log_LogConfig_consoleHandlers___ConsoleConfig_async_AsyncConfig_overflow/* $FF was: rtGetEnclosing:log:LogConfig#consoleHandlers:*:ConsoleConfig#async:AsyncConfig#overflow*/(NameIterator var0, SmallRyeConfig var1) {
        var0.previous();
        Object var2 = io.quarkus.runtime.logging.ConsoleConfig..accessor.get_async(rtGetEnclosing:log:LogConfig#consoleHandlers:*:ConsoleConfig#async(var0, var1));
        var0.next();
        return var2;
    }

    private static void rtParseKey_log_handler_console___async_queue_length/* $FF was: rtParseKey:log:handler:console:*:async:queue-length*/(SmallRyeConfig var0, NameIterator var1) {
        if (!var1.hasNext()) {
            var1.previous();
            rtGetEnclosing:log:LogConfig#consoleHandlers:*:ConsoleConfig#async:AsyncConfig#queueLength(var1, var0);
        } else {
            ConfigDiagnostic.unknownRunTime(var1);
        }
    }

    static Object rtGetEnclosing_log_LogConfig_consoleHandlers___ConsoleConfig_async_AsyncConfig_queueLength/* $FF was: rtGetEnclosing:log:LogConfig#consoleHandlers:*:ConsoleConfig#async:AsyncConfig#queueLength*/(NameIterator var0, SmallRyeConfig var1) {
        var0.previous();
        Object var2 = io.quarkus.runtime.logging.ConsoleConfig..accessor.get_async(rtGetEnclosing:log:LogConfig#consoleHandlers:*:ConsoleConfig#async(var0, var1));
        var0.next();
        return var2;
    }

    private static void rtParseKey_log_handler_console___color/* $FF was: rtParseKey:log:handler:console:*:color*/(SmallRyeConfig var0, NameIterator var1) {
        if (!var1.hasNext()) {
            var1.previous();
            rtGetEnclosing:log:LogConfig#consoleHandlers:*:ConsoleConfig#color(var1, var0);
        } else {
            ConfigDiagnostic.unknownRunTime(var1);
        }
    }

    static Object rtGetEnclosing_log_LogConfig_consoleHandlers___ConsoleConfig_color/* $FF was: rtGetEnclosing:log:LogConfig#consoleHandlers:*:ConsoleConfig#color*/(NameIterator var0, SmallRyeConfig var1) {
        String var3 = var0.getPreviousSegment();
        var0.previous();
        Object var2 = rtGetEnclosing:log:LogConfig#consoleHandlers:*(var0, var1);
        var0.next();
        Object var4 = ((Map)var2).get(var3);
        if (var4 != null) {
            return var4;
        } else {
            ConsoleConfig var7 = new ConsoleConfig();
            String var5 = var0.getAllPreviousSegments();
            StringBuilder var6 = new StringBuilder(var5);
            initGroup$io$quarkus$runtime$logging$ConsoleConfig(var1, var6, var7);
            ((Map)var2).put(var3, var7);
            return var7;
        }
    }

    private static void rtParseKey_log_handler_console___darken/* $FF was: rtParseKey:log:handler:console:*:darken*/(SmallRyeConfig var0, NameIterator var1) {
        if (!var1.hasNext()) {
            var1.previous();
            rtGetEnclosing:log:LogConfig#consoleHandlers:*:ConsoleConfig#darken(var1, var0);
        } else {
            ConfigDiagnostic.unknownRunTime(var1);
        }
    }

    static Object rtGetEnclosing_log_LogConfig_consoleHandlers___ConsoleConfig_darken/* $FF was: rtGetEnclosing:log:LogConfig#consoleHandlers:*:ConsoleConfig#darken*/(NameIterator var0, SmallRyeConfig var1) {
        String var3 = var0.getPreviousSegment();
        var0.previous();
        Object var2 = rtGetEnclosing:log:LogConfig#consoleHandlers:*(var0, var1);
        var0.next();
        Object var4 = ((Map)var2).get(var3);
        if (var4 != null) {
            return var4;
        } else {
            ConsoleConfig var7 = new ConsoleConfig();
            String var5 = var0.getAllPreviousSegments();
            StringBuilder var6 = new StringBuilder(var5);
            initGroup$io$quarkus$runtime$logging$ConsoleConfig(var1, var6, var7);
            ((Map)var2).put(var3, var7);
            return var7;
        }
    }

    private static void rtParseKey_log_handler_console___enable/* $FF was: rtParseKey:log:handler:console:*:enable*/(SmallRyeConfig var0, NameIterator var1) {
        if (!var1.hasNext()) {
            var1.previous();
            rtGetEnclosing:log:LogConfig#consoleHandlers:*:ConsoleConfig#enable(var1, var0);
        } else {
            ConfigDiagnostic.unknownRunTime(var1);
        }
    }

    static Object rtGetEnclosing_log_LogConfig_consoleHandlers___ConsoleConfig_enable/* $FF was: rtGetEnclosing:log:LogConfig#consoleHandlers:*:ConsoleConfig#enable*/(NameIterator var0, SmallRyeConfig var1) {
        String var3 = var0.getPreviousSegment();
        var0.previous();
        Object var2 = rtGetEnclosing:log:LogConfig#consoleHandlers:*(var0, var1);
        var0.next();
        Object var4 = ((Map)var2).get(var3);
        if (var4 != null) {
            return var4;
        } else {
            ConsoleConfig var7 = new ConsoleConfig();
            String var5 = var0.getAllPreviousSegments();
            StringBuilder var6 = new StringBuilder(var5);
            initGroup$io$quarkus$runtime$logging$ConsoleConfig(var1, var6, var7);
            ((Map)var2).put(var3, var7);
            return var7;
        }
    }

    private static void rtParseKey_log_handler_console___format/* $FF was: rtParseKey:log:handler:console:*:format*/(SmallRyeConfig var0, NameIterator var1) {
        if (!var1.hasNext()) {
            var1.previous();
            rtGetEnclosing:log:LogConfig#consoleHandlers:*:ConsoleConfig#format(var1, var0);
        } else {
            ConfigDiagnostic.unknownRunTime(var1);
        }
    }

    static Object rtGetEnclosing_log_LogConfig_consoleHandlers___ConsoleConfig_format/* $FF was: rtGetEnclosing:log:LogConfig#consoleHandlers:*:ConsoleConfig#format*/(NameIterator var0, SmallRyeConfig var1) {
        String var3 = var0.getPreviousSegment();
        var0.previous();
        Object var2 = rtGetEnclosing:log:LogConfig#consoleHandlers:*(var0, var1);
        var0.next();
        Object var4 = ((Map)var2).get(var3);
        if (var4 != null) {
            return var4;
        } else {
            ConsoleConfig var7 = new ConsoleConfig();
            String var5 = var0.getAllPreviousSegments();
            StringBuilder var6 = new StringBuilder(var5);
            initGroup$io$quarkus$runtime$logging$ConsoleConfig(var1, var6, var7);
            ((Map)var2).put(var3, var7);
            return var7;
        }
    }

    private static void rtParseKey_log_handler_console___level/* $FF was: rtParseKey:log:handler:console:*:level*/(SmallRyeConfig var0, NameIterator var1) {
        if (!var1.hasNext()) {
            var1.previous();
            rtGetEnclosing:log:LogConfig#consoleHandlers:*:ConsoleConfig#level(var1, var0);
        } else {
            ConfigDiagnostic.unknownRunTime(var1);
        }
    }

    static Object rtGetEnclosing_log_LogConfig_consoleHandlers___ConsoleConfig_level/* $FF was: rtGetEnclosing:log:LogConfig#consoleHandlers:*:ConsoleConfig#level*/(NameIterator var0, SmallRyeConfig var1) {
        String var3 = var0.getPreviousSegment();
        var0.previous();
        Object var2 = rtGetEnclosing:log:LogConfig#consoleHandlers:*(var0, var1);
        var0.next();
        Object var4 = ((Map)var2).get(var3);
        if (var4 != null) {
            return var4;
        } else {
            ConsoleConfig var7 = new ConsoleConfig();
            String var5 = var0.getAllPreviousSegments();
            StringBuilder var6 = new StringBuilder(var5);
            initGroup$io$quarkus$runtime$logging$ConsoleConfig(var1, var6, var7);
            ((Map)var2).put(var3, var7);
            return var7;
        }
    }

    private static void rtParseKey_log_handler_file/* $FF was: rtParseKey:log:handler:file*/(SmallRyeConfig var0, NameIterator var1) {
        if (!var1.hasNext()) {
            ConfigDiagnostic.unknownRunTime(var1);
        } else if (!var1.hasNext()) {
            ConfigDiagnostic.unknownRunTime(var1);
        } else {
            var1.next();
            rtParseKey:log:handler:file:*(var0, var1);
        }
    }

    private static void rtParseKey_log_handler_file__/* $FF was: rtParseKey:log:handler:file:**/(SmallRyeConfig var0, NameIterator var1) {
        if (!var1.hasNext()) {
            ConfigDiagnostic.unknownRunTime(var1);
        } else if (!var1.nextSegmentEquals("async")) {
            if (!var1.nextSegmentEquals("enable")) {
                if (!var1.nextSegmentEquals("format")) {
                    if (!var1.nextSegmentEquals("level")) {
                        if (!var1.nextSegmentEquals("path")) {
                            if (!var1.nextSegmentEquals("rotation")) {
                                ConfigDiagnostic.unknownRunTime(var1);
                            } else {
                                var1.next();
                                rtParseKey:log:handler:file:*:rotation(var0, var1);
                            }
                        } else {
                            var1.next();
                            rtParseKey:log:handler:file:*:path(var0, var1);
                        }
                    } else {
                        var1.next();
                        rtParseKey:log:handler:file:*:level(var0, var1);
                    }
                } else {
                    var1.next();
                    rtParseKey:log:handler:file:*:format(var0, var1);
                }
            } else {
                var1.next();
                rtParseKey:log:handler:file:*:enable(var0, var1);
            }
        } else {
            var1.next();
            rtParseKey:log:handler:file:*:async(var0, var1);
        }
    }

    private static void rtParseKey_log_handler_file___async/* $FF was: rtParseKey:log:handler:file:*:async*/(SmallRyeConfig var0, NameIterator var1) {
        if (!var1.hasNext()) {
            rtGetEnclosing:log:LogConfig#fileHandlers:*:FileConfig#async:AsyncConfig#enable(var1, var0);
        } else if (!var1.nextSegmentEquals("overflow")) {
            if (!var1.nextSegmentEquals("queue-length")) {
                ConfigDiagnostic.unknownRunTime(var1);
            } else {
                var1.next();
                rtParseKey:log:handler:file:*:async:queue-length(var0, var1);
            }
        } else {
            var1.next();
            rtParseKey:log:handler:file:*:async:overflow(var0, var1);
        }
    }

    static Object rtGetEnclosing_log_LogConfig_fileHandlers___FileConfig_async_AsyncConfig_enable/* $FF was: rtGetEnclosing:log:LogConfig#fileHandlers:*:FileConfig#async:AsyncConfig#enable*/(NameIterator var0, SmallRyeConfig var1) {
        var0.previous();
        Object var2 = io.quarkus.runtime.logging.FileConfig..accessor.get_async(rtGetEnclosing:log:LogConfig#fileHandlers:*:FileConfig#async(var0, var1));
        var0.next();
        return var2;
    }

    static Object rtGetEnclosing_log_LogConfig_fileHandlers___FileConfig_async/* $FF was: rtGetEnclosing:log:LogConfig#fileHandlers:*:FileConfig#async*/(NameIterator var0, SmallRyeConfig var1) {
        String var3 = var0.getPreviousSegment();
        var0.previous();
        Object var2 = rtGetEnclosing:log:LogConfig#fileHandlers:*(var0, var1);
        var0.next();
        Object var4 = ((Map)var2).get(var3);
        if (var4 != null) {
            return var4;
        } else {
            FileConfig var7 = new FileConfig();
            String var5 = var0.getAllPreviousSegments();
            StringBuilder var6 = new StringBuilder(var5);
            initGroup$io$quarkus$runtime$logging$FileConfig(var1, var6, var7);
            ((Map)var2).put(var3, var7);
            return var7;
        }
    }

    static Object rtGetEnclosing_log_LogConfig_fileHandlers__/* $FF was: rtGetEnclosing:log:LogConfig#fileHandlers:**/(NameIterator var0, SmallRyeConfig var1) {
        var0.previous();
        Object var2 = rtGetEnclosing:log:LogConfig#fileHandlers(var0, var1);
        var0.next();
        return ((LogConfig)var2).fileHandlers;
    }

    static Object rtGetEnclosing_log_LogConfig_fileHandlers/* $FF was: rtGetEnclosing:log:LogConfig#fileHandlers*/(NameIterator var0, SmallRyeConfig var1) {
        return LogConfig;
    }

    static void initGroup$io$quarkus$runtime$logging$FileConfig(SmallRyeConfig var0, StringBuilder var1, Object var2) {
        int var8 = var1.length();
        var1.append('.');
        var1.append("enable");
        String var3 = var1.toString();
        Converter var4 = conv$8;

        try {
            Object var5 = var0.getValue(var3, var4);
            io.quarkus.runtime.logging.FileConfig..accessor.set_enable(var2, (Boolean)var5);
        } catch (IllegalArgumentException var32) {
            ConfigDiagnostic.invalidValue(var3, var32);
        } catch (NoSuchElementException var33) {
            ConfigDiagnostic.missingValue(var3, var33);
        }

        var1.setLength(var8);
        var1.append('.');
        var1.append("format");
        String var9 = var1.toString();
        Converter var10 = conv$2;

        try {
            Object var11 = var0.getValue(var9, var10);
            io.quarkus.runtime.logging.FileConfig..accessor.set_format(var2, var11);
        } catch (IllegalArgumentException var30) {
            ConfigDiagnostic.invalidValue(var9, var30);
        } catch (NoSuchElementException var31) {
            ConfigDiagnostic.missingValue(var9, var31);
        }

        var1.setLength(var8);
        var1.append('.');
        var1.append("level");
        String var14 = var1.toString();
        Converter var15 = conv$10;

        try {
            Object var16 = var0.getValue(var14, var15);
            io.quarkus.runtime.logging.FileConfig..accessor.set_level(var2, var16);
        } catch (IllegalArgumentException var28) {
            ConfigDiagnostic.invalidValue(var14, var28);
        } catch (NoSuchElementException var29) {
            ConfigDiagnostic.missingValue(var14, var29);
        }

        var1.setLength(var8);
        var1.append('.');
        var1.append("path");
        String var19 = var1.toString();
        Converter var20 = conv$13;

        try {
            Object var21 = var0.getValue(var19, var20);
            io.quarkus.runtime.logging.FileConfig..accessor.set_path(var2, var21);
        } catch (IllegalArgumentException var26) {
            ConfigDiagnostic.invalidValue(var19, var26);
        } catch (NoSuchElementException var27) {
            ConfigDiagnostic.missingValue(var19, var27);
        }

        var1.setLength(var8);
        var1.append('.');
        var1.append("async");
        AsyncConfig var24 = new AsyncConfig();
        initGroup$io$quarkus$runtime$logging$AsyncConfig(var0, var1, var24);
        io.quarkus.runtime.logging.FileConfig..accessor.set_async(var2, var24);
        var1.setLength(var8);
        var1.append('.');
        var1.append("rotation");
        RotationConfig var25 = new RotationConfig();
        initGroup$io$quarkus$runtime$logging$FileConfig$RotationConfig(var0, var1, var25);
        io.quarkus.runtime.logging.FileConfig..accessor.set_rotation(var2, var25);
        var1.setLength(var8);
    }

    static void initGroup$io$quarkus$runtime$logging$FileConfig$RotationConfig(SmallRyeConfig var0, StringBuilder var1, Object var2) {
        int var8 = var1.length();
        var1.append('.');
        var1.append("max-file-size");
        String var3 = var1.toString();
        Converter var4 = conv$14;

        try {
            Object var5 = var0.getValue(var3, var4);
            io.quarkus.runtime.logging.FileConfig.RotationConfig..accessor.set_maxFileSize(var2, var5);
        } catch (IllegalArgumentException var30) {
            ConfigDiagnostic.invalidValue(var3, var30);
        } catch (NoSuchElementException var31) {
            ConfigDiagnostic.missingValue(var3, var31);
        }

        var1.setLength(var8);
        var1.append('.');
        var1.append("max-backup-index");
        String var9 = var1.toString();
        Converter var10 = conv$11;

        try {
            Object var11 = var0.getValue(var9, var10);
            io.quarkus.runtime.logging.FileConfig.RotationConfig..accessor.set_maxBackupIndex(var2, (Integer)var11);
        } catch (IllegalArgumentException var28) {
            ConfigDiagnostic.invalidValue(var9, var28);
        } catch (NoSuchElementException var29) {
            ConfigDiagnostic.missingValue(var9, var29);
        }

        var1.setLength(var8);
        var1.append('.');
        var1.append("file-suffix");
        String var14 = var1.toString();
        Converter var15 = conv$16;

        try {
            Object var16 = var0.getValue(var14, var15);
            io.quarkus.runtime.logging.FileConfig.RotationConfig..accessor.set_fileSuffix(var2, var16);
        } catch (IllegalArgumentException var26) {
            ConfigDiagnostic.invalidValue(var14, var26);
        } catch (NoSuchElementException var27) {
            ConfigDiagnostic.missingValue(var14, var27);
        }

        var1.setLength(var8);
        var1.append('.');
        var1.append("rotate-on-boot");
        String var19 = var1.toString();
        Converter var20 = conv$8;

        try {
            Object var21 = var0.getValue(var19, var20);
            io.quarkus.runtime.logging.FileConfig.RotationConfig..accessor.set_rotateOnBoot(var2, (Boolean)var21);
        } catch (IllegalArgumentException var24) {
            ConfigDiagnostic.invalidValue(var19, var24);
        } catch (NoSuchElementException var25) {
            ConfigDiagnostic.missingValue(var19, var25);
        }

        var1.setLength(var8);
    }

    private static void rtParseKey_log_handler_file___async_overflow/* $FF was: rtParseKey:log:handler:file:*:async:overflow*/(SmallRyeConfig var0, NameIterator var1) {
        if (!var1.hasNext()) {
            var1.previous();
            rtGetEnclosing:log:LogConfig#fileHandlers:*:FileConfig#async:AsyncConfig#overflow(var1, var0);
        } else {
            ConfigDiagnostic.unknownRunTime(var1);
        }
    }

    static Object rtGetEnclosing_log_LogConfig_fileHandlers___FileConfig_async_AsyncConfig_overflow/* $FF was: rtGetEnclosing:log:LogConfig#fileHandlers:*:FileConfig#async:AsyncConfig#overflow*/(NameIterator var0, SmallRyeConfig var1) {
        var0.previous();
        Object var2 = io.quarkus.runtime.logging.FileConfig..accessor.get_async(rtGetEnclosing:log:LogConfig#fileHandlers:*:FileConfig#async(var0, var1));
        var0.next();
        return var2;
    }

    private static void rtParseKey_log_handler_file___async_queue_length/* $FF was: rtParseKey:log:handler:file:*:async:queue-length*/(SmallRyeConfig var0, NameIterator var1) {
        if (!var1.hasNext()) {
            var1.previous();
            rtGetEnclosing:log:LogConfig#fileHandlers:*:FileConfig#async:AsyncConfig#queueLength(var1, var0);
        } else {
            ConfigDiagnostic.unknownRunTime(var1);
        }
    }

    static Object rtGetEnclosing_log_LogConfig_fileHandlers___FileConfig_async_AsyncConfig_queueLength/* $FF was: rtGetEnclosing:log:LogConfig#fileHandlers:*:FileConfig#async:AsyncConfig#queueLength*/(NameIterator var0, SmallRyeConfig var1) {
        var0.previous();
        Object var2 = io.quarkus.runtime.logging.FileConfig..accessor.get_async(rtGetEnclosing:log:LogConfig#fileHandlers:*:FileConfig#async(var0, var1));
        var0.next();
        return var2;
    }

    private static void rtParseKey_log_handler_file___enable/* $FF was: rtParseKey:log:handler:file:*:enable*/(SmallRyeConfig var0, NameIterator var1) {
        if (!var1.hasNext()) {
            var1.previous();
            rtGetEnclosing:log:LogConfig#fileHandlers:*:FileConfig#enable(var1, var0);
        } else {
            ConfigDiagnostic.unknownRunTime(var1);
        }
    }

    static Object rtGetEnclosing_log_LogConfig_fileHandlers___FileConfig_enable/* $FF was: rtGetEnclosing:log:LogConfig#fileHandlers:*:FileConfig#enable*/(NameIterator var0, SmallRyeConfig var1) {
        String var3 = var0.getPreviousSegment();
        var0.previous();
        Object var2 = rtGetEnclosing:log:LogConfig#fileHandlers:*(var0, var1);
        var0.next();
        Object var4 = ((Map)var2).get(var3);
        if (var4 != null) {
            return var4;
        } else {
            FileConfig var7 = new FileConfig();
            String var5 = var0.getAllPreviousSegments();
            StringBuilder var6 = new StringBuilder(var5);
            initGroup$io$quarkus$runtime$logging$FileConfig(var1, var6, var7);
            ((Map)var2).put(var3, var7);
            return var7;
        }
    }

    private static void rtParseKey_log_handler_file___format/* $FF was: rtParseKey:log:handler:file:*:format*/(SmallRyeConfig var0, NameIterator var1) {
        if (!var1.hasNext()) {
            var1.previous();
            rtGetEnclosing:log:LogConfig#fileHandlers:*:FileConfig#format(var1, var0);
        } else {
            ConfigDiagnostic.unknownRunTime(var1);
        }
    }

    static Object rtGetEnclosing_log_LogConfig_fileHandlers___FileConfig_format/* $FF was: rtGetEnclosing:log:LogConfig#fileHandlers:*:FileConfig#format*/(NameIterator var0, SmallRyeConfig var1) {
        String var3 = var0.getPreviousSegment();
        var0.previous();
        Object var2 = rtGetEnclosing:log:LogConfig#fileHandlers:*(var0, var1);
        var0.next();
        Object var4 = ((Map)var2).get(var3);
        if (var4 != null) {
            return var4;
        } else {
            FileConfig var7 = new FileConfig();
            String var5 = var0.getAllPreviousSegments();
            StringBuilder var6 = new StringBuilder(var5);
            initGroup$io$quarkus$runtime$logging$FileConfig(var1, var6, var7);
            ((Map)var2).put(var3, var7);
            return var7;
        }
    }

    private static void rtParseKey_log_handler_file___level/* $FF was: rtParseKey:log:handler:file:*:level*/(SmallRyeConfig var0, NameIterator var1) {
        if (!var1.hasNext()) {
            var1.previous();
            rtGetEnclosing:log:LogConfig#fileHandlers:*:FileConfig#level(var1, var0);
        } else {
            ConfigDiagnostic.unknownRunTime(var1);
        }
    }

    static Object rtGetEnclosing_log_LogConfig_fileHandlers___FileConfig_level/* $FF was: rtGetEnclosing:log:LogConfig#fileHandlers:*:FileConfig#level*/(NameIterator var0, SmallRyeConfig var1) {
        String var3 = var0.getPreviousSegment();
        var0.previous();
        Object var2 = rtGetEnclosing:log:LogConfig#fileHandlers:*(var0, var1);
        var0.next();
        Object var4 = ((Map)var2).get(var3);
        if (var4 != null) {
            return var4;
        } else {
            FileConfig var7 = new FileConfig();
            String var5 = var0.getAllPreviousSegments();
            StringBuilder var6 = new StringBuilder(var5);
            initGroup$io$quarkus$runtime$logging$FileConfig(var1, var6, var7);
            ((Map)var2).put(var3, var7);
            return var7;
        }
    }

    private static void rtParseKey_log_handler_file___path/* $FF was: rtParseKey:log:handler:file:*:path*/(SmallRyeConfig var0, NameIterator var1) {
        if (!var1.hasNext()) {
            var1.previous();
            rtGetEnclosing:log:LogConfig#fileHandlers:*:FileConfig#path(var1, var0);
        } else {
            ConfigDiagnostic.unknownRunTime(var1);
        }
    }

    static Object rtGetEnclosing_log_LogConfig_fileHandlers___FileConfig_path/* $FF was: rtGetEnclosing:log:LogConfig#fileHandlers:*:FileConfig#path*/(NameIterator var0, SmallRyeConfig var1) {
        String var3 = var0.getPreviousSegment();
        var0.previous();
        Object var2 = rtGetEnclosing:log:LogConfig#fileHandlers:*(var0, var1);
        var0.next();
        Object var4 = ((Map)var2).get(var3);
        if (var4 != null) {
            return var4;
        } else {
            FileConfig var7 = new FileConfig();
            String var5 = var0.getAllPreviousSegments();
            StringBuilder var6 = new StringBuilder(var5);
            initGroup$io$quarkus$runtime$logging$FileConfig(var1, var6, var7);
            ((Map)var2).put(var3, var7);
            return var7;
        }
    }

    private static void rtParseKey_log_handler_file___rotation/* $FF was: rtParseKey:log:handler:file:*:rotation*/(SmallRyeConfig var0, NameIterator var1) {
        if (!var1.hasNext()) {
            ConfigDiagnostic.unknownRunTime(var1);
        } else if (!var1.nextSegmentEquals("file-suffix")) {
            if (!var1.nextSegmentEquals("max-backup-index")) {
                if (!var1.nextSegmentEquals("max-file-size")) {
                    if (!var1.nextSegmentEquals("rotate-on-boot")) {
                        ConfigDiagnostic.unknownRunTime(var1);
                    } else {
                        var1.next();
                        rtParseKey:log:handler:file:*:rotation:rotate-on-boot(var0, var1);
                    }
                } else {
                    var1.next();
                    rtParseKey:log:handler:file:*:rotation:max-file-size(var0, var1);
                }
            } else {
                var1.next();
                rtParseKey:log:handler:file:*:rotation:max-backup-index(var0, var1);
            }
        } else {
            var1.next();
            rtParseKey:log:handler:file:*:rotation:file-suffix(var0, var1);
        }
    }

    private static void rtParseKey_log_handler_file___rotation_file_suffix/* $FF was: rtParseKey:log:handler:file:*:rotation:file-suffix*/(SmallRyeConfig var0, NameIterator var1) {
        if (!var1.hasNext()) {
            var1.previous();
            rtGetEnclosing:log:LogConfig#fileHandlers:*:FileConfig#rotation:RotationConfig#fileSuffix(var1, var0);
        } else {
            ConfigDiagnostic.unknownRunTime(var1);
        }
    }

    static Object rtGetEnclosing_log_LogConfig_fileHandlers___FileConfig_rotation_RotationConfig_fileSuffix/* $FF was: rtGetEnclosing:log:LogConfig#fileHandlers:*:FileConfig#rotation:RotationConfig#fileSuffix*/(NameIterator var0, SmallRyeConfig var1) {
        var0.previous();
        Object var2 = io.quarkus.runtime.logging.FileConfig..accessor.get_rotation(rtGetEnclosing:log:LogConfig#fileHandlers:*:FileConfig#rotation(var0, var1));
        var0.next();
        return var2;
    }

    static Object rtGetEnclosing_log_LogConfig_fileHandlers___FileConfig_rotation/* $FF was: rtGetEnclosing:log:LogConfig#fileHandlers:*:FileConfig#rotation*/(NameIterator var0, SmallRyeConfig var1) {
        String var3 = var0.getPreviousSegment();
        var0.previous();
        Object var2 = rtGetEnclosing:log:LogConfig#fileHandlers:*(var0, var1);
        var0.next();
        Object var4 = ((Map)var2).get(var3);
        if (var4 != null) {
            return var4;
        } else {
            FileConfig var7 = new FileConfig();
            String var5 = var0.getAllPreviousSegments();
            StringBuilder var6 = new StringBuilder(var5);
            initGroup$io$quarkus$runtime$logging$FileConfig(var1, var6, var7);
            ((Map)var2).put(var3, var7);
            return var7;
        }
    }

    private static void rtParseKey_log_handler_file___rotation_max_backup_index/* $FF was: rtParseKey:log:handler:file:*:rotation:max-backup-index*/(SmallRyeConfig var0, NameIterator var1) {
        if (!var1.hasNext()) {
            var1.previous();
            rtGetEnclosing:log:LogConfig#fileHandlers:*:FileConfig#rotation:RotationConfig#maxBackupIndex(var1, var0);
        } else {
            ConfigDiagnostic.unknownRunTime(var1);
        }
    }

    static Object rtGetEnclosing_log_LogConfig_fileHandlers___FileConfig_rotation_RotationConfig_maxBackupIndex/* $FF was: rtGetEnclosing:log:LogConfig#fileHandlers:*:FileConfig#rotation:RotationConfig#maxBackupIndex*/(NameIterator var0, SmallRyeConfig var1) {
        var0.previous();
        Object var2 = io.quarkus.runtime.logging.FileConfig..accessor.get_rotation(rtGetEnclosing:log:LogConfig#fileHandlers:*:FileConfig#rotation(var0, var1));
        var0.next();
        return var2;
    }

    private static void rtParseKey_log_handler_file___rotation_max_file_size/* $FF was: rtParseKey:log:handler:file:*:rotation:max-file-size*/(SmallRyeConfig var0, NameIterator var1) {
        if (!var1.hasNext()) {
            var1.previous();
            rtGetEnclosing:log:LogConfig#fileHandlers:*:FileConfig#rotation:RotationConfig#maxFileSize(var1, var0);
        } else {
            ConfigDiagnostic.unknownRunTime(var1);
        }
    }

    static Object rtGetEnclosing_log_LogConfig_fileHandlers___FileConfig_rotation_RotationConfig_maxFileSize/* $FF was: rtGetEnclosing:log:LogConfig#fileHandlers:*:FileConfig#rotation:RotationConfig#maxFileSize*/(NameIterator var0, SmallRyeConfig var1) {
        var0.previous();
        Object var2 = io.quarkus.runtime.logging.FileConfig..accessor.get_rotation(rtGetEnclosing:log:LogConfig#fileHandlers:*:FileConfig#rotation(var0, var1));
        var0.next();
        return var2;
    }

    private static void rtParseKey_log_handler_file___rotation_rotate_on_boot/* $FF was: rtParseKey:log:handler:file:*:rotation:rotate-on-boot*/(SmallRyeConfig var0, NameIterator var1) {
        if (!var1.hasNext()) {
            var1.previous();
            rtGetEnclosing:log:LogConfig#fileHandlers:*:FileConfig#rotation:RotationConfig#rotateOnBoot(var1, var0);
        } else {
            ConfigDiagnostic.unknownRunTime(var1);
        }
    }

    static Object rtGetEnclosing_log_LogConfig_fileHandlers___FileConfig_rotation_RotationConfig_rotateOnBoot/* $FF was: rtGetEnclosing:log:LogConfig#fileHandlers:*:FileConfig#rotation:RotationConfig#rotateOnBoot*/(NameIterator var0, SmallRyeConfig var1) {
        var0.previous();
        Object var2 = io.quarkus.runtime.logging.FileConfig..accessor.get_rotation(rtGetEnclosing:log:LogConfig#fileHandlers:*:FileConfig#rotation(var0, var1));
        var0.next();
        return var2;
    }

    private static void rtParseKey_log_handler_syslog/* $FF was: rtParseKey:log:handler:syslog*/(SmallRyeConfig var0, NameIterator var1) {
        if (!var1.hasNext()) {
            ConfigDiagnostic.unknownRunTime(var1);
        } else if (!var1.hasNext()) {
            ConfigDiagnostic.unknownRunTime(var1);
        } else {
            var1.next();
            rtParseKey:log:handler:syslog:*(var0, var1);
        }
    }

    private static void rtParseKey_log_handler_syslog__/* $FF was: rtParseKey:log:handler:syslog:**/(SmallRyeConfig var0, NameIterator var1) {
        if (!var1.hasNext()) {
            ConfigDiagnostic.unknownRunTime(var1);
        } else if (!var1.nextSegmentEquals("app-name")) {
            if (!var1.nextSegmentEquals("async")) {
                if (!var1.nextSegmentEquals("block-on-reconnect")) {
                    if (!var1.nextSegmentEquals("enable")) {
                        if (!var1.nextSegmentEquals("endpoint")) {
                            if (!var1.nextSegmentEquals("facility")) {
                                if (!var1.nextSegmentEquals("format")) {
                                    if (!var1.nextSegmentEquals("hostname")) {
                                        if (!var1.nextSegmentEquals("level")) {
                                            if (!var1.nextSegmentEquals("protocol")) {
                                                if (!var1.nextSegmentEquals("syslog-type")) {
                                                    if (!var1.nextSegmentEquals("truncate")) {
                                                        if (!var1.nextSegmentEquals("use-counting-framing")) {
                                                            ConfigDiagnostic.unknownRunTime(var1);
                                                        } else {
                                                            var1.next();
                                                            rtParseKey:log:handler:syslog:*:use-counting-framing(var0, var1);
                                                        }
                                                    } else {
                                                        var1.next();
                                                        rtParseKey:log:handler:syslog:*:truncate(var0, var1);
                                                    }
                                                } else {
                                                    var1.next();
                                                    rtParseKey:log:handler:syslog:*:syslog-type(var0, var1);
                                                }
                                            } else {
                                                var1.next();
                                                rtParseKey:log:handler:syslog:*:protocol(var0, var1);
                                            }
                                        } else {
                                            var1.next();
                                            rtParseKey:log:handler:syslog:*:level(var0, var1);
                                        }
                                    } else {
                                        var1.next();
                                        rtParseKey:log:handler:syslog:*:hostname(var0, var1);
                                    }
                                } else {
                                    var1.next();
                                    rtParseKey:log:handler:syslog:*:format(var0, var1);
                                }
                            } else {
                                var1.next();
                                rtParseKey:log:handler:syslog:*:facility(var0, var1);
                            }
                        } else {
                            var1.next();
                            rtParseKey:log:handler:syslog:*:endpoint(var0, var1);
                        }
                    } else {
                        var1.next();
                        rtParseKey:log:handler:syslog:*:enable(var0, var1);
                    }
                } else {
                    var1.next();
                    rtParseKey:log:handler:syslog:*:block-on-reconnect(var0, var1);
                }
            } else {
                var1.next();
                rtParseKey:log:handler:syslog:*:async(var0, var1);
            }
        } else {
            var1.next();
            rtParseKey:log:handler:syslog:*:app-name(var0, var1);
        }
    }

    private static void rtParseKey_log_handler_syslog___app_name/* $FF was: rtParseKey:log:handler:syslog:*:app-name*/(SmallRyeConfig var0, NameIterator var1) {
        if (!var1.hasNext()) {
            var1.previous();
            rtGetEnclosing:log:LogConfig#syslogHandlers:*:SyslogConfig#appName(var1, var0);
        } else {
            ConfigDiagnostic.unknownRunTime(var1);
        }
    }

    static Object rtGetEnclosing_log_LogConfig_syslogHandlers___SyslogConfig_appName/* $FF was: rtGetEnclosing:log:LogConfig#syslogHandlers:*:SyslogConfig#appName*/(NameIterator var0, SmallRyeConfig var1) {
        String var3 = var0.getPreviousSegment();
        var0.previous();
        Object var2 = rtGetEnclosing:log:LogConfig#syslogHandlers:*(var0, var1);
        var0.next();
        Object var4 = ((Map)var2).get(var3);
        if (var4 != null) {
            return var4;
        } else {
            SyslogConfig var7 = new SyslogConfig();
            String var5 = var0.getAllPreviousSegments();
            StringBuilder var6 = new StringBuilder(var5);
            initGroup$io$quarkus$runtime$logging$SyslogConfig(var1, var6, var7);
            ((Map)var2).put(var3, var7);
            return var7;
        }
    }

    static Object rtGetEnclosing_log_LogConfig_syslogHandlers__/* $FF was: rtGetEnclosing:log:LogConfig#syslogHandlers:**/(NameIterator var0, SmallRyeConfig var1) {
        var0.previous();
        Object var2 = rtGetEnclosing:log:LogConfig#syslogHandlers(var0, var1);
        var0.next();
        return ((LogConfig)var2).syslogHandlers;
    }

    static Object rtGetEnclosing_log_LogConfig_syslogHandlers/* $FF was: rtGetEnclosing:log:LogConfig#syslogHandlers*/(NameIterator var0, SmallRyeConfig var1) {
        return LogConfig;
    }

    static void initGroup$io$quarkus$runtime$logging$SyslogConfig(SmallRyeConfig var0, StringBuilder var1, Object var2) {
        int var8 = var1.length();
        var1.append('.');
        var1.append("enable");
        String var3 = var1.toString();
        Converter var4 = conv$8;

        try {
            Object var5 = var0.getValue(var3, var4);
            io.quarkus.runtime.logging.SyslogConfig..accessor.set_enable(var2, (Boolean)var5);
        } catch (IllegalArgumentException var87) {
            ConfigDiagnostic.invalidValue(var3, var87);
        } catch (NoSuchElementException var88) {
            ConfigDiagnostic.missingValue(var3, var88);
        }

        var1.setLength(var8);
        var1.append('.');
        var1.append("endpoint");
        String var9 = var1.toString();
        Converter var10 = conv$17;

        try {
            Object var11 = var0.getValue(var9, var10);
            io.quarkus.runtime.logging.SyslogConfig..accessor.set_endpoint(var2, var11);
        } catch (IllegalArgumentException var85) {
            ConfigDiagnostic.invalidValue(var9, var85);
        } catch (NoSuchElementException var86) {
            ConfigDiagnostic.missingValue(var9, var86);
        }

        var1.setLength(var8);
        var1.append('.');
        var1.append("app-name");
        String var14 = var1.toString();
        Converter var15 = conv$16;

        try {
            Object var16 = var0.getValue(var14, var15);
            io.quarkus.runtime.logging.SyslogConfig..accessor.set_appName(var2, var16);
        } catch (IllegalArgumentException var83) {
            ConfigDiagnostic.invalidValue(var14, var83);
        } catch (NoSuchElementException var84) {
            ConfigDiagnostic.missingValue(var14, var84);
        }

        var1.setLength(var8);
        var1.append('.');
        var1.append("hostname");
        String var19 = var1.toString();
        Converter var20 = conv$16;

        try {
            Object var21 = var0.getValue(var19, var20);
            io.quarkus.runtime.logging.SyslogConfig..accessor.set_hostname(var2, var21);
        } catch (IllegalArgumentException var81) {
            ConfigDiagnostic.invalidValue(var19, var81);
        } catch (NoSuchElementException var82) {
            ConfigDiagnostic.missingValue(var19, var82);
        }

        var1.setLength(var8);
        var1.append('.');
        var1.append("facility");
        String var24 = var1.toString();
        Converter var25 = conv$18;

        try {
            Object var26 = var0.getValue(var24, var25);
            io.quarkus.runtime.logging.SyslogConfig..accessor.set_facility(var2, var26);
        } catch (IllegalArgumentException var79) {
            ConfigDiagnostic.invalidValue(var24, var79);
        } catch (NoSuchElementException var80) {
            ConfigDiagnostic.missingValue(var24, var80);
        }

        var1.setLength(var8);
        var1.append('.');
        var1.append("syslog-type");
        String var29 = var1.toString();
        Converter var30 = conv$19;

        try {
            Object var31 = var0.getValue(var29, var30);
            io.quarkus.runtime.logging.SyslogConfig..accessor.set_syslogType(var2, var31);
        } catch (IllegalArgumentException var77) {
            ConfigDiagnostic.invalidValue(var29, var77);
        } catch (NoSuchElementException var78) {
            ConfigDiagnostic.missingValue(var29, var78);
        }

        var1.setLength(var8);
        var1.append('.');
        var1.append("protocol");
        String var34 = var1.toString();
        Converter var35 = conv$20;

        try {
            Object var36 = var0.getValue(var34, var35);
            io.quarkus.runtime.logging.SyslogConfig..accessor.set_protocol(var2, var36);
        } catch (IllegalArgumentException var75) {
            ConfigDiagnostic.invalidValue(var34, var75);
        } catch (NoSuchElementException var76) {
            ConfigDiagnostic.missingValue(var34, var76);
        }

        var1.setLength(var8);
        var1.append('.');
        var1.append("use-counting-framing");
        String var39 = var1.toString();
        Converter var40 = conv$8;

        try {
            Object var41 = var0.getValue(var39, var40);
            io.quarkus.runtime.logging.SyslogConfig..accessor.set_useCountingFraming(var2, (Boolean)var41);
        } catch (IllegalArgumentException var73) {
            ConfigDiagnostic.invalidValue(var39, var73);
        } catch (NoSuchElementException var74) {
            ConfigDiagnostic.missingValue(var39, var74);
        }

        var1.setLength(var8);
        var1.append('.');
        var1.append("truncate");
        String var44 = var1.toString();
        Converter var45 = conv$8;

        try {
            Object var46 = var0.getValue(var44, var45);
            io.quarkus.runtime.logging.SyslogConfig..accessor.set_truncate(var2, (Boolean)var46);
        } catch (IllegalArgumentException var71) {
            ConfigDiagnostic.invalidValue(var44, var71);
        } catch (NoSuchElementException var72) {
            ConfigDiagnostic.missingValue(var44, var72);
        }

        var1.setLength(var8);
        var1.append('.');
        var1.append("block-on-reconnect");
        String var49 = var1.toString();
        Converter var50 = conv$8;

        try {
            Object var51 = var0.getValue(var49, var50);
            io.quarkus.runtime.logging.SyslogConfig..accessor.set_blockOnReconnect(var2, (Boolean)var51);
        } catch (IllegalArgumentException var69) {
            ConfigDiagnostic.invalidValue(var49, var69);
        } catch (NoSuchElementException var70) {
            ConfigDiagnostic.missingValue(var49, var70);
        }

        var1.setLength(var8);
        var1.append('.');
        var1.append("format");
        String var54 = var1.toString();
        Converter var55 = conv$2;

        try {
            Object var56 = var0.getValue(var54, var55);
            io.quarkus.runtime.logging.SyslogConfig..accessor.set_format(var2, var56);
        } catch (IllegalArgumentException var67) {
            ConfigDiagnostic.invalidValue(var54, var67);
        } catch (NoSuchElementException var68) {
            ConfigDiagnostic.missingValue(var54, var68);
        }

        var1.setLength(var8);
        var1.append('.');
        var1.append("level");
        String var59 = var1.toString();
        Converter var60 = conv$10;

        try {
            Object var61 = var0.getValue(var59, var60);
            io.quarkus.runtime.logging.SyslogConfig..accessor.set_level(var2, var61);
        } catch (IllegalArgumentException var65) {
            ConfigDiagnostic.invalidValue(var59, var65);
        } catch (NoSuchElementException var66) {
            ConfigDiagnostic.missingValue(var59, var66);
        }

        var1.setLength(var8);
        var1.append('.');
        var1.append("async");
        AsyncConfig var64 = new AsyncConfig();
        initGroup$io$quarkus$runtime$logging$AsyncConfig(var0, var1, var64);
        io.quarkus.runtime.logging.SyslogConfig..accessor.set_async(var2, var64);
        var1.setLength(var8);
    }

    private static void rtParseKey_log_handler_syslog___async/* $FF was: rtParseKey:log:handler:syslog:*:async*/(SmallRyeConfig var0, NameIterator var1) {
        if (!var1.hasNext()) {
            rtGetEnclosing:log:LogConfig#syslogHandlers:*:SyslogConfig#async:AsyncConfig#enable(var1, var0);
        } else if (!var1.nextSegmentEquals("overflow")) {
            if (!var1.nextSegmentEquals("queue-length")) {
                ConfigDiagnostic.unknownRunTime(var1);
            } else {
                var1.next();
                rtParseKey:log:handler:syslog:*:async:queue-length(var0, var1);
            }
        } else {
            var1.next();
            rtParseKey:log:handler:syslog:*:async:overflow(var0, var1);
        }
    }

    static Object rtGetEnclosing_log_LogConfig_syslogHandlers___SyslogConfig_async_AsyncConfig_enable/* $FF was: rtGetEnclosing:log:LogConfig#syslogHandlers:*:SyslogConfig#async:AsyncConfig#enable*/(NameIterator var0, SmallRyeConfig var1) {
        var0.previous();
        Object var2 = io.quarkus.runtime.logging.SyslogConfig..accessor.get_async(rtGetEnclosing:log:LogConfig#syslogHandlers:*:SyslogConfig#async(var0, var1));
        var0.next();
        return var2;
    }

    static Object rtGetEnclosing_log_LogConfig_syslogHandlers___SyslogConfig_async/* $FF was: rtGetEnclosing:log:LogConfig#syslogHandlers:*:SyslogConfig#async*/(NameIterator var0, SmallRyeConfig var1) {
        String var3 = var0.getPreviousSegment();
        var0.previous();
        Object var2 = rtGetEnclosing:log:LogConfig#syslogHandlers:*(var0, var1);
        var0.next();
        Object var4 = ((Map)var2).get(var3);
        if (var4 != null) {
            return var4;
        } else {
            SyslogConfig var7 = new SyslogConfig();
            String var5 = var0.getAllPreviousSegments();
            StringBuilder var6 = new StringBuilder(var5);
            initGroup$io$quarkus$runtime$logging$SyslogConfig(var1, var6, var7);
            ((Map)var2).put(var3, var7);
            return var7;
        }
    }

    private static void rtParseKey_log_handler_syslog___async_overflow/* $FF was: rtParseKey:log:handler:syslog:*:async:overflow*/(SmallRyeConfig var0, NameIterator var1) {
        if (!var1.hasNext()) {
            var1.previous();
            rtGetEnclosing:log:LogConfig#syslogHandlers:*:SyslogConfig#async:AsyncConfig#overflow(var1, var0);
        } else {
            ConfigDiagnostic.unknownRunTime(var1);
        }
    }

    static Object rtGetEnclosing_log_LogConfig_syslogHandlers___SyslogConfig_async_AsyncConfig_overflow/* $FF was: rtGetEnclosing:log:LogConfig#syslogHandlers:*:SyslogConfig#async:AsyncConfig#overflow*/(NameIterator var0, SmallRyeConfig var1) {
        var0.previous();
        Object var2 = io.quarkus.runtime.logging.SyslogConfig..accessor.get_async(rtGetEnclosing:log:LogConfig#syslogHandlers:*:SyslogConfig#async(var0, var1));
        var0.next();
        return var2;
    }

    private static void rtParseKey_log_handler_syslog___async_queue_length/* $FF was: rtParseKey:log:handler:syslog:*:async:queue-length*/(SmallRyeConfig var0, NameIterator var1) {
        if (!var1.hasNext()) {
            var1.previous();
            rtGetEnclosing:log:LogConfig#syslogHandlers:*:SyslogConfig#async:AsyncConfig#queueLength(var1, var0);
        } else {
            ConfigDiagnostic.unknownRunTime(var1);
        }
    }

    static Object rtGetEnclosing_log_LogConfig_syslogHandlers___SyslogConfig_async_AsyncConfig_queueLength/* $FF was: rtGetEnclosing:log:LogConfig#syslogHandlers:*:SyslogConfig#async:AsyncConfig#queueLength*/(NameIterator var0, SmallRyeConfig var1) {
        var0.previous();
        Object var2 = io.quarkus.runtime.logging.SyslogConfig..accessor.get_async(rtGetEnclosing:log:LogConfig#syslogHandlers:*:SyslogConfig#async(var0, var1));
        var0.next();
        return var2;
    }

    private static void rtParseKey_log_handler_syslog___block_on_reconnect/* $FF was: rtParseKey:log:handler:syslog:*:block-on-reconnect*/(SmallRyeConfig var0, NameIterator var1) {
        if (!var1.hasNext()) {
            var1.previous();
            rtGetEnclosing:log:LogConfig#syslogHandlers:*:SyslogConfig#blockOnReconnect(var1, var0);
        } else {
            ConfigDiagnostic.unknownRunTime(var1);
        }
    }

    static Object rtGetEnclosing_log_LogConfig_syslogHandlers___SyslogConfig_blockOnReconnect/* $FF was: rtGetEnclosing:log:LogConfig#syslogHandlers:*:SyslogConfig#blockOnReconnect*/(NameIterator var0, SmallRyeConfig var1) {
        String var3 = var0.getPreviousSegment();
        var0.previous();
        Object var2 = rtGetEnclosing:log:LogConfig#syslogHandlers:*(var0, var1);
        var0.next();
        Object var4 = ((Map)var2).get(var3);
        if (var4 != null) {
            return var4;
        } else {
            SyslogConfig var7 = new SyslogConfig();
            String var5 = var0.getAllPreviousSegments();
            StringBuilder var6 = new StringBuilder(var5);
            initGroup$io$quarkus$runtime$logging$SyslogConfig(var1, var6, var7);
            ((Map)var2).put(var3, var7);
            return var7;
        }
    }

    private static void rtParseKey_log_handler_syslog___enable/* $FF was: rtParseKey:log:handler:syslog:*:enable*/(SmallRyeConfig var0, NameIterator var1) {
        if (!var1.hasNext()) {
            var1.previous();
            rtGetEnclosing:log:LogConfig#syslogHandlers:*:SyslogConfig#enable(var1, var0);
        } else {
            ConfigDiagnostic.unknownRunTime(var1);
        }
    }

    static Object rtGetEnclosing_log_LogConfig_syslogHandlers___SyslogConfig_enable/* $FF was: rtGetEnclosing:log:LogConfig#syslogHandlers:*:SyslogConfig#enable*/(NameIterator var0, SmallRyeConfig var1) {
        String var3 = var0.getPreviousSegment();
        var0.previous();
        Object var2 = rtGetEnclosing:log:LogConfig#syslogHandlers:*(var0, var1);
        var0.next();
        Object var4 = ((Map)var2).get(var3);
        if (var4 != null) {
            return var4;
        } else {
            SyslogConfig var7 = new SyslogConfig();
            String var5 = var0.getAllPreviousSegments();
            StringBuilder var6 = new StringBuilder(var5);
            initGroup$io$quarkus$runtime$logging$SyslogConfig(var1, var6, var7);
            ((Map)var2).put(var3, var7);
            return var7;
        }
    }

    private static void rtParseKey_log_handler_syslog___endpoint/* $FF was: rtParseKey:log:handler:syslog:*:endpoint*/(SmallRyeConfig var0, NameIterator var1) {
        if (!var1.hasNext()) {
            var1.previous();
            rtGetEnclosing:log:LogConfig#syslogHandlers:*:SyslogConfig#endpoint(var1, var0);
        } else {
            ConfigDiagnostic.unknownRunTime(var1);
        }
    }

    static Object rtGetEnclosing_log_LogConfig_syslogHandlers___SyslogConfig_endpoint/* $FF was: rtGetEnclosing:log:LogConfig#syslogHandlers:*:SyslogConfig#endpoint*/(NameIterator var0, SmallRyeConfig var1) {
        String var3 = var0.getPreviousSegment();
        var0.previous();
        Object var2 = rtGetEnclosing:log:LogConfig#syslogHandlers:*(var0, var1);
        var0.next();
        Object var4 = ((Map)var2).get(var3);
        if (var4 != null) {
            return var4;
        } else {
            SyslogConfig var7 = new SyslogConfig();
            String var5 = var0.getAllPreviousSegments();
            StringBuilder var6 = new StringBuilder(var5);
            initGroup$io$quarkus$runtime$logging$SyslogConfig(var1, var6, var7);
            ((Map)var2).put(var3, var7);
            return var7;
        }
    }

    private static void rtParseKey_log_handler_syslog___facility/* $FF was: rtParseKey:log:handler:syslog:*:facility*/(SmallRyeConfig var0, NameIterator var1) {
        if (!var1.hasNext()) {
            var1.previous();
            rtGetEnclosing:log:LogConfig#syslogHandlers:*:SyslogConfig#facility(var1, var0);
        } else {
            ConfigDiagnostic.unknownRunTime(var1);
        }
    }

    static Object rtGetEnclosing_log_LogConfig_syslogHandlers___SyslogConfig_facility/* $FF was: rtGetEnclosing:log:LogConfig#syslogHandlers:*:SyslogConfig#facility*/(NameIterator var0, SmallRyeConfig var1) {
        String var3 = var0.getPreviousSegment();
        var0.previous();
        Object var2 = rtGetEnclosing:log:LogConfig#syslogHandlers:*(var0, var1);
        var0.next();
        Object var4 = ((Map)var2).get(var3);
        if (var4 != null) {
            return var4;
        } else {
            SyslogConfig var7 = new SyslogConfig();
            String var5 = var0.getAllPreviousSegments();
            StringBuilder var6 = new StringBuilder(var5);
            initGroup$io$quarkus$runtime$logging$SyslogConfig(var1, var6, var7);
            ((Map)var2).put(var3, var7);
            return var7;
        }
    }

    private static void rtParseKey_log_handler_syslog___format/* $FF was: rtParseKey:log:handler:syslog:*:format*/(SmallRyeConfig var0, NameIterator var1) {
        if (!var1.hasNext()) {
            var1.previous();
            rtGetEnclosing:log:LogConfig#syslogHandlers:*:SyslogConfig#format(var1, var0);
        } else {
            ConfigDiagnostic.unknownRunTime(var1);
        }
    }

    static Object rtGetEnclosing_log_LogConfig_syslogHandlers___SyslogConfig_format/* $FF was: rtGetEnclosing:log:LogConfig#syslogHandlers:*:SyslogConfig#format*/(NameIterator var0, SmallRyeConfig var1) {
        String var3 = var0.getPreviousSegment();
        var0.previous();
        Object var2 = rtGetEnclosing:log:LogConfig#syslogHandlers:*(var0, var1);
        var0.next();
        Object var4 = ((Map)var2).get(var3);
        if (var4 != null) {
            return var4;
        } else {
            SyslogConfig var7 = new SyslogConfig();
            String var5 = var0.getAllPreviousSegments();
            StringBuilder var6 = new StringBuilder(var5);
            initGroup$io$quarkus$runtime$logging$SyslogConfig(var1, var6, var7);
            ((Map)var2).put(var3, var7);
            return var7;
        }
    }

    private static void rtParseKey_log_handler_syslog___hostname/* $FF was: rtParseKey:log:handler:syslog:*:hostname*/(SmallRyeConfig var0, NameIterator var1) {
        if (!var1.hasNext()) {
            var1.previous();
            rtGetEnclosing:log:LogConfig#syslogHandlers:*:SyslogConfig#hostname(var1, var0);
        } else {
            ConfigDiagnostic.unknownRunTime(var1);
        }
    }

    static Object rtGetEnclosing_log_LogConfig_syslogHandlers___SyslogConfig_hostname/* $FF was: rtGetEnclosing:log:LogConfig#syslogHandlers:*:SyslogConfig#hostname*/(NameIterator var0, SmallRyeConfig var1) {
        String var3 = var0.getPreviousSegment();
        var0.previous();
        Object var2 = rtGetEnclosing:log:LogConfig#syslogHandlers:*(var0, var1);
        var0.next();
        Object var4 = ((Map)var2).get(var3);
        if (var4 != null) {
            return var4;
        } else {
            SyslogConfig var7 = new SyslogConfig();
            String var5 = var0.getAllPreviousSegments();
            StringBuilder var6 = new StringBuilder(var5);
            initGroup$io$quarkus$runtime$logging$SyslogConfig(var1, var6, var7);
            ((Map)var2).put(var3, var7);
            return var7;
        }
    }

    private static void rtParseKey_log_handler_syslog___level/* $FF was: rtParseKey:log:handler:syslog:*:level*/(SmallRyeConfig var0, NameIterator var1) {
        if (!var1.hasNext()) {
            var1.previous();
            rtGetEnclosing:log:LogConfig#syslogHandlers:*:SyslogConfig#level(var1, var0);
        } else {
            ConfigDiagnostic.unknownRunTime(var1);
        }
    }

    static Object rtGetEnclosing_log_LogConfig_syslogHandlers___SyslogConfig_level/* $FF was: rtGetEnclosing:log:LogConfig#syslogHandlers:*:SyslogConfig#level*/(NameIterator var0, SmallRyeConfig var1) {
        String var3 = var0.getPreviousSegment();
        var0.previous();
        Object var2 = rtGetEnclosing:log:LogConfig#syslogHandlers:*(var0, var1);
        var0.next();
        Object var4 = ((Map)var2).get(var3);
        if (var4 != null) {
            return var4;
        } else {
            SyslogConfig var7 = new SyslogConfig();
            String var5 = var0.getAllPreviousSegments();
            StringBuilder var6 = new StringBuilder(var5);
            initGroup$io$quarkus$runtime$logging$SyslogConfig(var1, var6, var7);
            ((Map)var2).put(var3, var7);
            return var7;
        }
    }

    private static void rtParseKey_log_handler_syslog___protocol/* $FF was: rtParseKey:log:handler:syslog:*:protocol*/(SmallRyeConfig var0, NameIterator var1) {
        if (!var1.hasNext()) {
            var1.previous();
            rtGetEnclosing:log:LogConfig#syslogHandlers:*:SyslogConfig#protocol(var1, var0);
        } else {
            ConfigDiagnostic.unknownRunTime(var1);
        }
    }

    static Object rtGetEnclosing_log_LogConfig_syslogHandlers___SyslogConfig_protocol/* $FF was: rtGetEnclosing:log:LogConfig#syslogHandlers:*:SyslogConfig#protocol*/(NameIterator var0, SmallRyeConfig var1) {
        String var3 = var0.getPreviousSegment();
        var0.previous();
        Object var2 = rtGetEnclosing:log:LogConfig#syslogHandlers:*(var0, var1);
        var0.next();
        Object var4 = ((Map)var2).get(var3);
        if (var4 != null) {
            return var4;
        } else {
            SyslogConfig var7 = new SyslogConfig();
            String var5 = var0.getAllPreviousSegments();
            StringBuilder var6 = new StringBuilder(var5);
            initGroup$io$quarkus$runtime$logging$SyslogConfig(var1, var6, var7);
            ((Map)var2).put(var3, var7);
            return var7;
        }
    }

    private static void rtParseKey_log_handler_syslog___syslog_type/* $FF was: rtParseKey:log:handler:syslog:*:syslog-type*/(SmallRyeConfig var0, NameIterator var1) {
        if (!var1.hasNext()) {
            var1.previous();
            rtGetEnclosing:log:LogConfig#syslogHandlers:*:SyslogConfig#syslogType(var1, var0);
        } else {
            ConfigDiagnostic.unknownRunTime(var1);
        }
    }

    static Object rtGetEnclosing_log_LogConfig_syslogHandlers___SyslogConfig_syslogType/* $FF was: rtGetEnclosing:log:LogConfig#syslogHandlers:*:SyslogConfig#syslogType*/(NameIterator var0, SmallRyeConfig var1) {
        String var3 = var0.getPreviousSegment();
        var0.previous();
        Object var2 = rtGetEnclosing:log:LogConfig#syslogHandlers:*(var0, var1);
        var0.next();
        Object var4 = ((Map)var2).get(var3);
        if (var4 != null) {
            return var4;
        } else {
            SyslogConfig var7 = new SyslogConfig();
            String var5 = var0.getAllPreviousSegments();
            StringBuilder var6 = new StringBuilder(var5);
            initGroup$io$quarkus$runtime$logging$SyslogConfig(var1, var6, var7);
            ((Map)var2).put(var3, var7);
            return var7;
        }
    }

    private static void rtParseKey_log_handler_syslog___truncate/* $FF was: rtParseKey:log:handler:syslog:*:truncate*/(SmallRyeConfig var0, NameIterator var1) {
        if (!var1.hasNext()) {
            var1.previous();
            rtGetEnclosing:log:LogConfig#syslogHandlers:*:SyslogConfig#truncate(var1, var0);
        } else {
            ConfigDiagnostic.unknownRunTime(var1);
        }
    }

    static Object rtGetEnclosing_log_LogConfig_syslogHandlers___SyslogConfig_truncate/* $FF was: rtGetEnclosing:log:LogConfig#syslogHandlers:*:SyslogConfig#truncate*/(NameIterator var0, SmallRyeConfig var1) {
        String var3 = var0.getPreviousSegment();
        var0.previous();
        Object var2 = rtGetEnclosing:log:LogConfig#syslogHandlers:*(var0, var1);
        var0.next();
        Object var4 = ((Map)var2).get(var3);
        if (var4 != null) {
            return var4;
        } else {
            SyslogConfig var7 = new SyslogConfig();
            String var5 = var0.getAllPreviousSegments();
            StringBuilder var6 = new StringBuilder(var5);
            initGroup$io$quarkus$runtime$logging$SyslogConfig(var1, var6, var7);
            ((Map)var2).put(var3, var7);
            return var7;
        }
    }

    private static void rtParseKey_log_handler_syslog___use_counting_framing/* $FF was: rtParseKey:log:handler:syslog:*:use-counting-framing*/(SmallRyeConfig var0, NameIterator var1) {
        if (!var1.hasNext()) {
            var1.previous();
            rtGetEnclosing:log:LogConfig#syslogHandlers:*:SyslogConfig#useCountingFraming(var1, var0);
        } else {
            ConfigDiagnostic.unknownRunTime(var1);
        }
    }

    static Object rtGetEnclosing_log_LogConfig_syslogHandlers___SyslogConfig_useCountingFraming/* $FF was: rtGetEnclosing:log:LogConfig#syslogHandlers:*:SyslogConfig#useCountingFraming*/(NameIterator var0, SmallRyeConfig var1) {
        String var3 = var0.getPreviousSegment();
        var0.previous();
        Object var2 = rtGetEnclosing:log:LogConfig#syslogHandlers:*(var0, var1);
        var0.next();
        Object var4 = ((Map)var2).get(var3);
        if (var4 != null) {
            return var4;
        } else {
            SyslogConfig var7 = new SyslogConfig();
            String var5 = var0.getAllPreviousSegments();
            StringBuilder var6 = new StringBuilder(var5);
            initGroup$io$quarkus$runtime$logging$SyslogConfig(var1, var6, var7);
            ((Map)var2).put(var3, var7);
            return var7;
        }
    }

    private static void rtParseKey_log_level/* $FF was: rtParseKey:log:level*/(SmallRyeConfig var0, NameIterator var1) {
        if (var1.hasNext()) {
            ConfigDiagnostic.unknownRunTime(var1);
        }
    }

    private static void rtParseKey_log_syslog/* $FF was: rtParseKey:log:syslog*/(SmallRyeConfig var0, NameIterator var1) {
        if (!var1.hasNext()) {
            ConfigDiagnostic.unknownRunTime(var1);
        } else if (!var1.nextSegmentEquals("app-name")) {
            if (!var1.nextSegmentEquals("async")) {
                if (!var1.nextSegmentEquals("block-on-reconnect")) {
                    if (!var1.nextSegmentEquals("enable")) {
                        if (!var1.nextSegmentEquals("endpoint")) {
                            if (!var1.nextSegmentEquals("facility")) {
                                if (!var1.nextSegmentEquals("format")) {
                                    if (!var1.nextSegmentEquals("hostname")) {
                                        if (!var1.nextSegmentEquals("level")) {
                                            if (!var1.nextSegmentEquals("protocol")) {
                                                if (!var1.nextSegmentEquals("syslog-type")) {
                                                    if (!var1.nextSegmentEquals("truncate")) {
                                                        if (!var1.nextSegmentEquals("use-counting-framing")) {
                                                            ConfigDiagnostic.unknownRunTime(var1);
                                                        } else {
                                                            var1.next();
                                                            rtParseKey:log:syslog:use-counting-framing(var0, var1);
                                                        }
                                                    } else {
                                                        var1.next();
                                                        rtParseKey:log:syslog:truncate(var0, var1);
                                                    }
                                                } else {
                                                    var1.next();
                                                    rtParseKey:log:syslog:syslog-type(var0, var1);
                                                }
                                            } else {
                                                var1.next();
                                                rtParseKey:log:syslog:protocol(var0, var1);
                                            }
                                        } else {
                                            var1.next();
                                            rtParseKey:log:syslog:level(var0, var1);
                                        }
                                    } else {
                                        var1.next();
                                        rtParseKey:log:syslog:hostname(var0, var1);
                                    }
                                } else {
                                    var1.next();
                                    rtParseKey:log:syslog:format(var0, var1);
                                }
                            } else {
                                var1.next();
                                rtParseKey:log:syslog:facility(var0, var1);
                            }
                        } else {
                            var1.next();
                            rtParseKey:log:syslog:endpoint(var0, var1);
                        }
                    } else {
                        var1.next();
                        rtParseKey:log:syslog:enable(var0, var1);
                    }
                } else {
                    var1.next();
                    rtParseKey:log:syslog:block-on-reconnect(var0, var1);
                }
            } else {
                var1.next();
                rtParseKey:log:syslog:async(var0, var1);
            }
        } else {
            var1.next();
            rtParseKey:log:syslog:app-name(var0, var1);
        }
    }

    private static void rtParseKey_log_syslog_app_name/* $FF was: rtParseKey:log:syslog:app-name*/(SmallRyeConfig var0, NameIterator var1) {
        if (var1.hasNext()) {
            ConfigDiagnostic.unknownRunTime(var1);
        }
    }

    private static void rtParseKey_log_syslog_async/* $FF was: rtParseKey:log:syslog:async*/(SmallRyeConfig var0, NameIterator var1) {
        if (var1.hasNext()) {
            if (!var1.nextSegmentEquals("overflow")) {
                if (!var1.nextSegmentEquals("queue-length")) {
                    ConfigDiagnostic.unknownRunTime(var1);
                } else {
                    var1.next();
                    rtParseKey:log:syslog:async:queue-length(var0, var1);
                }
            } else {
                var1.next();
                rtParseKey:log:syslog:async:overflow(var0, var1);
            }
        }
    }

    private static void rtParseKey_log_syslog_async_overflow/* $FF was: rtParseKey:log:syslog:async:overflow*/(SmallRyeConfig var0, NameIterator var1) {
        if (var1.hasNext()) {
            ConfigDiagnostic.unknownRunTime(var1);
        }
    }

    private static void rtParseKey_log_syslog_async_queue_length/* $FF was: rtParseKey:log:syslog:async:queue-length*/(SmallRyeConfig var0, NameIterator var1) {
        if (var1.hasNext()) {
            ConfigDiagnostic.unknownRunTime(var1);
        }
    }

    private static void rtParseKey_log_syslog_block_on_reconnect/* $FF was: rtParseKey:log:syslog:block-on-reconnect*/(SmallRyeConfig var0, NameIterator var1) {
        if (var1.hasNext()) {
            ConfigDiagnostic.unknownRunTime(var1);
        }
    }

    private static void rtParseKey_log_syslog_enable/* $FF was: rtParseKey:log:syslog:enable*/(SmallRyeConfig var0, NameIterator var1) {
        if (var1.hasNext()) {
            ConfigDiagnostic.unknownRunTime(var1);
        }
    }

    private static void rtParseKey_log_syslog_endpoint/* $FF was: rtParseKey:log:syslog:endpoint*/(SmallRyeConfig var0, NameIterator var1) {
        if (var1.hasNext()) {
            ConfigDiagnostic.unknownRunTime(var1);
        }
    }

    private static void rtParseKey_log_syslog_facility/* $FF was: rtParseKey:log:syslog:facility*/(SmallRyeConfig var0, NameIterator var1) {
        if (var1.hasNext()) {
            ConfigDiagnostic.unknownRunTime(var1);
        }
    }

    private static void rtParseKey_log_syslog_format/* $FF was: rtParseKey:log:syslog:format*/(SmallRyeConfig var0, NameIterator var1) {
        if (var1.hasNext()) {
            ConfigDiagnostic.unknownRunTime(var1);
        }
    }

    private static void rtParseKey_log_syslog_hostname/* $FF was: rtParseKey:log:syslog:hostname*/(SmallRyeConfig var0, NameIterator var1) {
        if (var1.hasNext()) {
            ConfigDiagnostic.unknownRunTime(var1);
        }
    }

    private static void rtParseKey_log_syslog_level/* $FF was: rtParseKey:log:syslog:level*/(SmallRyeConfig var0, NameIterator var1) {
        if (var1.hasNext()) {
            ConfigDiagnostic.unknownRunTime(var1);
        }
    }

    private static void rtParseKey_log_syslog_protocol/* $FF was: rtParseKey:log:syslog:protocol*/(SmallRyeConfig var0, NameIterator var1) {
        if (var1.hasNext()) {
            ConfigDiagnostic.unknownRunTime(var1);
        }
    }

    private static void rtParseKey_log_syslog_syslog_type/* $FF was: rtParseKey:log:syslog:syslog-type*/(SmallRyeConfig var0, NameIterator var1) {
        if (var1.hasNext()) {
            ConfigDiagnostic.unknownRunTime(var1);
        }
    }

    private static void rtParseKey_log_syslog_truncate/* $FF was: rtParseKey:log:syslog:truncate*/(SmallRyeConfig var0, NameIterator var1) {
        if (var1.hasNext()) {
            ConfigDiagnostic.unknownRunTime(var1);
        }
    }

    private static void rtParseKey_log_syslog_use_counting_framing/* $FF was: rtParseKey:log:syslog:use-counting-framing*/(SmallRyeConfig var0, NameIterator var1) {
        if (var1.hasNext()) {
            ConfigDiagnostic.unknownRunTime(var1);
        }
    }

    private static void rtParseKey_log_metrics/* $FF was: rtParseKey:log:metrics*/(SmallRyeConfig var0, NameIterator var1) {
        if (!var1.hasNext()) {
            ConfigDiagnostic.unknownRunTime(var1);
        } else if (!var1.nextSegmentEquals("enabled")) {
            ConfigDiagnostic.unknownRunTime(var1);
        } else {
            var1.next();
            rtEmptyParseKey(var0, var1);
        }
    }

    private static void rtParseKey_profile/* $FF was: rtParseKey:profile*/(SmallRyeConfig var0, NameIterator var1) {
        if (var1.hasNext()) {
            ConfigDiagnostic.unknownRunTime(var1);
        }
    }

    private static void rtParseKey_shutdown/* $FF was: rtParseKey:shutdown*/(SmallRyeConfig var0, NameIterator var1) {
        if (!var1.hasNext()) {
            ConfigDiagnostic.unknownRunTime(var1);
        } else if (!var1.nextSegmentEquals("timeout")) {
            ConfigDiagnostic.unknownRunTime(var1);
        } else {
            var1.next();
            rtParseKey:shutdown:timeout(var0, var1);
        }
    }

    private static void rtParseKey_shutdown_timeout/* $FF was: rtParseKey:shutdown:timeout*/(SmallRyeConfig var0, NameIterator var1) {
        if (var1.hasNext()) {
            ConfigDiagnostic.unknownRunTime(var1);
        }
    }

    private static void rtParseKey_thread_pool/* $FF was: rtParseKey:thread-pool*/(SmallRyeConfig var0, NameIterator var1) {
        if (!var1.hasNext()) {
            ConfigDiagnostic.unknownRunTime(var1);
        } else if (!var1.nextSegmentEquals("core-threads")) {
            if (!var1.nextSegmentEquals("growth-resistance")) {
                if (!var1.nextSegmentEquals("keep-alive-time")) {
                    if (!var1.nextSegmentEquals("max-threads")) {
                        if (!var1.nextSegmentEquals("prefill")) {
                            if (!var1.nextSegmentEquals("queue-size")) {
                                if (!var1.nextSegmentEquals("shutdown-check-interval")) {
                                    if (!var1.nextSegmentEquals("shutdown-interrupt")) {
                                        if (!var1.nextSegmentEquals("shutdown-timeout")) {
                                            ConfigDiagnostic.unknownRunTime(var1);
                                        } else {
                                            var1.next();
                                            rtParseKey:thread-pool:shutdown-timeout(var0, var1);
                                        }
                                    } else {
                                        var1.next();
                                        rtParseKey:thread-pool:shutdown-interrupt(var0, var1);
                                    }
                                } else {
                                    var1.next();
                                    rtParseKey:thread-pool:shutdown-check-interval(var0, var1);
                                }
                            } else {
                                var1.next();
                                rtParseKey:thread-pool:queue-size(var0, var1);
                            }
                        } else {
                            var1.next();
                            rtParseKey:thread-pool:prefill(var0, var1);
                        }
                    } else {
                        var1.next();
                        rtParseKey:thread-pool:max-threads(var0, var1);
                    }
                } else {
                    var1.next();
                    rtParseKey:thread-pool:keep-alive-time(var0, var1);
                }
            } else {
                var1.next();
                rtParseKey:thread-pool:growth-resistance(var0, var1);
            }
        } else {
            var1.next();
            rtParseKey:thread-pool:core-threads(var0, var1);
        }
    }

    private static void rtParseKey_thread_pool_core_threads/* $FF was: rtParseKey:thread-pool:core-threads*/(SmallRyeConfig var0, NameIterator var1) {
        if (var1.hasNext()) {
            ConfigDiagnostic.unknownRunTime(var1);
        }
    }

    private static void rtParseKey_thread_pool_growth_resistance/* $FF was: rtParseKey:thread-pool:growth-resistance*/(SmallRyeConfig var0, NameIterator var1) {
        if (var1.hasNext()) {
            ConfigDiagnostic.unknownRunTime(var1);
        }
    }

    private static void rtParseKey_thread_pool_keep_alive_time/* $FF was: rtParseKey:thread-pool:keep-alive-time*/(SmallRyeConfig var0, NameIterator var1) {
        if (var1.hasNext()) {
            ConfigDiagnostic.unknownRunTime(var1);
        }
    }

    private static void rtParseKey_thread_pool_max_threads/* $FF was: rtParseKey:thread-pool:max-threads*/(SmallRyeConfig var0, NameIterator var1) {
        if (var1.hasNext()) {
            ConfigDiagnostic.unknownRunTime(var1);
        }
    }

    private static void rtParseKey_thread_pool_prefill/* $FF was: rtParseKey:thread-pool:prefill*/(SmallRyeConfig var0, NameIterator var1) {
        if (var1.hasNext()) {
            ConfigDiagnostic.unknownRunTime(var1);
        }
    }

    private static void rtParseKey_thread_pool_queue_size/* $FF was: rtParseKey:thread-pool:queue-size*/(SmallRyeConfig var0, NameIterator var1) {
        if (var1.hasNext()) {
            ConfigDiagnostic.unknownRunTime(var1);
        }
    }

    private static void rtParseKey_thread_pool_shutdown_check_interval/* $FF was: rtParseKey:thread-pool:shutdown-check-interval*/(SmallRyeConfig var0, NameIterator var1) {
        if (var1.hasNext()) {
            ConfigDiagnostic.unknownRunTime(var1);
        }
    }

    private static void rtParseKey_thread_pool_shutdown_interrupt/* $FF was: rtParseKey:thread-pool:shutdown-interrupt*/(SmallRyeConfig var0, NameIterator var1) {
        if (var1.hasNext()) {
            ConfigDiagnostic.unknownRunTime(var1);
        }
    }

    private static void rtParseKey_thread_pool_shutdown_timeout/* $FF was: rtParseKey:thread-pool:shutdown-timeout*/(SmallRyeConfig var0, NameIterator var1) {
        if (var1.hasNext()) {
            ConfigDiagnostic.unknownRunTime(var1);
        }
    }

    private static void rtParseKey_vertx/* $FF was: rtParseKey:vertx*/(SmallRyeConfig var0, NameIterator var1) {
        if (!var1.hasNext()) {
            ConfigDiagnostic.unknownRunTime(var1);
        } else if (!var1.nextSegmentEquals("caching")) {
            if (!var1.nextSegmentEquals("classpath-resolving")) {
                if (!var1.nextSegmentEquals("cluster")) {
                    if (!var1.nextSegmentEquals("event-loops-pool-size")) {
                        if (!var1.nextSegmentEquals("eventbus")) {
                            if (!var1.nextSegmentEquals("internal-blocking-pool-size")) {
                                if (!var1.nextSegmentEquals("max-event-loop-execute-time")) {
                                    if (!var1.nextSegmentEquals("max-worker-execute-time")) {
                                        if (!var1.nextSegmentEquals("prefer-native-transport")) {
                                            if (!var1.nextSegmentEquals("resolver")) {
                                                if (!var1.nextSegmentEquals("use-async-dns")) {
                                                    if (!var1.nextSegmentEquals("warning-exception-time")) {
                                                        if (!var1.nextSegmentEquals("worker-pool-size")) {
                                                            ConfigDiagnostic.unknownRunTime(var1);
                                                        } else {
                                                            var1.next();
                                                            rtParseKey:vertx:worker-pool-size(var0, var1);
                                                        }
                                                    } else {
                                                        var1.next();
                                                        rtParseKey:vertx:warning-exception-time(var0, var1);
                                                    }
                                                } else {
                                                    var1.next();
                                                    rtParseKey:vertx:use-async-dns(var0, var1);
                                                }
                                            } else {
                                                var1.next();
                                                rtParseKey:vertx:resolver(var0, var1);
                                            }
                                        } else {
                                            var1.next();
                                            rtParseKey:vertx:prefer-native-transport(var0, var1);
                                        }
                                    } else {
                                        var1.next();
                                        rtParseKey:vertx:max-worker-execute-time(var0, var1);
                                    }
                                } else {
                                    var1.next();
                                    rtParseKey:vertx:max-event-loop-execute-time(var0, var1);
                                }
                            } else {
                                var1.next();
                                rtParseKey:vertx:internal-blocking-pool-size(var0, var1);
                            }
                        } else {
                            var1.next();
                            rtParseKey:vertx:eventbus(var0, var1);
                        }
                    } else {
                        var1.next();
                        rtParseKey:vertx:event-loops-pool-size(var0, var1);
                    }
                } else {
                    var1.next();
                    rtParseKey:vertx:cluster(var0, var1);
                }
            } else {
                var1.next();
                rtParseKey:vertx:classpath-resolving(var0, var1);
            }
        } else {
            var1.next();
            rtParseKey:vertx:caching(var0, var1);
        }
    }

    private static void rtParseKey_vertx_caching/* $FF was: rtParseKey:vertx:caching*/(SmallRyeConfig var0, NameIterator var1) {
        if (var1.hasNext()) {
            ConfigDiagnostic.unknownRunTime(var1);
        }
    }

    private static void rtParseKey_vertx_classpath_resolving/* $FF was: rtParseKey:vertx:classpath-resolving*/(SmallRyeConfig var0, NameIterator var1) {
        if (var1.hasNext()) {
            ConfigDiagnostic.unknownRunTime(var1);
        }
    }

    private static void rtParseKey_vertx_cluster/* $FF was: rtParseKey:vertx:cluster*/(SmallRyeConfig var0, NameIterator var1) {
        if (!var1.hasNext()) {
            ConfigDiagnostic.unknownRunTime(var1);
        } else if (!var1.nextSegmentEquals("clustered")) {
            if (!var1.nextSegmentEquals("host")) {
                if (!var1.nextSegmentEquals("ping-interval")) {
                    if (!var1.nextSegmentEquals("ping-reply-interval")) {
                        if (!var1.nextSegmentEquals("port")) {
                            if (!var1.nextSegmentEquals("public-host")) {
                                if (!var1.nextSegmentEquals("public-port")) {
                                    ConfigDiagnostic.unknownRunTime(var1);
                                } else {
                                    var1.next();
                                    rtParseKey:vertx:cluster:public-port(var0, var1);
                                }
                            } else {
                                var1.next();
                                rtParseKey:vertx:cluster:public-host(var0, var1);
                            }
                        } else {
                            var1.next();
                            rtParseKey:vertx:cluster:port(var0, var1);
                        }
                    } else {
                        var1.next();
                        rtParseKey:vertx:cluster:ping-reply-interval(var0, var1);
                    }
                } else {
                    var1.next();
                    rtParseKey:vertx:cluster:ping-interval(var0, var1);
                }
            } else {
                var1.next();
                rtParseKey:vertx:cluster:host(var0, var1);
            }
        } else {
            var1.next();
            rtParseKey:vertx:cluster:clustered(var0, var1);
        }
    }

    private static void rtParseKey_vertx_cluster_clustered/* $FF was: rtParseKey:vertx:cluster:clustered*/(SmallRyeConfig var0, NameIterator var1) {
        if (var1.hasNext()) {
            ConfigDiagnostic.unknownRunTime(var1);
        }
    }

    private static void rtParseKey_vertx_cluster_host/* $FF was: rtParseKey:vertx:cluster:host*/(SmallRyeConfig var0, NameIterator var1) {
        if (var1.hasNext()) {
            ConfigDiagnostic.unknownRunTime(var1);
        }
    }

    private static void rtParseKey_vertx_cluster_ping_interval/* $FF was: rtParseKey:vertx:cluster:ping-interval*/(SmallRyeConfig var0, NameIterator var1) {
        if (var1.hasNext()) {
            ConfigDiagnostic.unknownRunTime(var1);
        }
    }

    private static void rtParseKey_vertx_cluster_ping_reply_interval/* $FF was: rtParseKey:vertx:cluster:ping-reply-interval*/(SmallRyeConfig var0, NameIterator var1) {
        if (var1.hasNext()) {
            ConfigDiagnostic.unknownRunTime(var1);
        }
    }

    private static void rtParseKey_vertx_cluster_port/* $FF was: rtParseKey:vertx:cluster:port*/(SmallRyeConfig var0, NameIterator var1) {
        if (var1.hasNext()) {
            ConfigDiagnostic.unknownRunTime(var1);
        }
    }

    private static void rtParseKey_vertx_cluster_public_host/* $FF was: rtParseKey:vertx:cluster:public-host*/(SmallRyeConfig var0, NameIterator var1) {
        if (var1.hasNext()) {
            ConfigDiagnostic.unknownRunTime(var1);
        }
    }

    private static void rtParseKey_vertx_cluster_public_port/* $FF was: rtParseKey:vertx:cluster:public-port*/(SmallRyeConfig var0, NameIterator var1) {
        if (var1.hasNext()) {
            ConfigDiagnostic.unknownRunTime(var1);
        }
    }

    private static void rtParseKey_vertx_event_loops_pool_size/* $FF was: rtParseKey:vertx:event-loops-pool-size*/(SmallRyeConfig var0, NameIterator var1) {
        if (var1.hasNext()) {
            ConfigDiagnostic.unknownRunTime(var1);
        }
    }

    private static void rtParseKey_vertx_eventbus/* $FF was: rtParseKey:vertx:eventbus*/(SmallRyeConfig var0, NameIterator var1) {
        if (!var1.hasNext()) {
            ConfigDiagnostic.unknownRunTime(var1);
        } else if (!var1.nextSegmentEquals("accept-backlog")) {
            if (!var1.nextSegmentEquals("client-auth")) {
                if (!var1.nextSegmentEquals("connect-timeout")) {
                    if (!var1.nextSegmentEquals("idle-timeout")) {
                        if (!var1.nextSegmentEquals("key-certificate-jks")) {
                            if (!var1.nextSegmentEquals("key-certificate-pem")) {
                                if (!var1.nextSegmentEquals("key-certificate-pfx")) {
                                    if (!var1.nextSegmentEquals("receive-buffer-size")) {
                                        if (!var1.nextSegmentEquals("reconnect-attempts")) {
                                            if (!var1.nextSegmentEquals("reconnect-interval")) {
                                                if (!var1.nextSegmentEquals("reuse-address")) {
                                                    if (!var1.nextSegmentEquals("reuse-port")) {
                                                        if (!var1.nextSegmentEquals("send-buffer-size")) {
                                                            if (!var1.nextSegmentEquals("soLinger")) {
                                                                if (!var1.nextSegmentEquals("ssl")) {
                                                                    if (!var1.nextSegmentEquals("tcp-keep-alive")) {
                                                                        if (!var1.nextSegmentEquals("tcp-no-delay")) {
                                                                            if (!var1.nextSegmentEquals("traffic-class")) {
                                                                                if (!var1.nextSegmentEquals("trust-all")) {
                                                                                    if (!var1.nextSegmentEquals("trust-certificate-jks")) {
                                                                                        if (!var1.nextSegmentEquals("trust-certificate-pem")) {
                                                                                            if (!var1.nextSegmentEquals("trust-certificate-pfx")) {
                                                                                                ConfigDiagnostic.unknownRunTime(var1);
                                                                                            } else {
                                                                                                var1.next();
                                                                                                rtParseKey:vertx:eventbus:trust-certificate-pfx(var0, var1);
                                                                                            }
                                                                                        } else {
                                                                                            var1.next();
                                                                                            rtParseKey:vertx:eventbus:trust-certificate-pem(var0, var1);
                                                                                        }
                                                                                    } else {
                                                                                        var1.next();
                                                                                        rtParseKey:vertx:eventbus:trust-certificate-jks(var0, var1);
                                                                                    }
                                                                                } else {
                                                                                    var1.next();
                                                                                    rtParseKey:vertx:eventbus:trust-all(var0, var1);
                                                                                }
                                                                            } else {
                                                                                var1.next();
                                                                                rtParseKey:vertx:eventbus:traffic-class(var0, var1);
                                                                            }
                                                                        } else {
                                                                            var1.next();
                                                                            rtParseKey:vertx:eventbus:tcp-no-delay(var0, var1);
                                                                        }
                                                                    } else {
                                                                        var1.next();
                                                                        rtParseKey:vertx:eventbus:tcp-keep-alive(var0, var1);
                                                                    }
                                                                } else {
                                                                    var1.next();
                                                                    rtParseKey:vertx:eventbus:ssl(var0, var1);
                                                                }
                                                            } else {
                                                                var1.next();
                                                                rtParseKey:vertx:eventbus:soLinger(var0, var1);
                                                            }
                                                        } else {
                                                            var1.next();
                                                            rtParseKey:vertx:eventbus:send-buffer-size(var0, var1);
                                                        }
                                                    } else {
                                                        var1.next();
                                                        rtParseKey:vertx:eventbus:reuse-port(var0, var1);
                                                    }
                                                } else {
                                                    var1.next();
                                                    rtParseKey:vertx:eventbus:reuse-address(var0, var1);
                                                }
                                            } else {
                                                var1.next();
                                                rtParseKey:vertx:eventbus:reconnect-interval(var0, var1);
                                            }
                                        } else {
                                            var1.next();
                                            rtParseKey:vertx:eventbus:reconnect-attempts(var0, var1);
                                        }
                                    } else {
                                        var1.next();
                                        rtParseKey:vertx:eventbus:receive-buffer-size(var0, var1);
                                    }
                                } else {
                                    var1.next();
                                    rtParseKey:vertx:eventbus:key-certificate-pfx(var0, var1);
                                }
                            } else {
                                var1.next();
                                rtParseKey:vertx:eventbus:key-certificate-pem(var0, var1);
                            }
                        } else {
                            var1.next();
                            rtParseKey:vertx:eventbus:key-certificate-jks(var0, var1);
                        }
                    } else {
                        var1.next();
                        rtParseKey:vertx:eventbus:idle-timeout(var0, var1);
                    }
                } else {
                    var1.next();
                    rtParseKey:vertx:eventbus:connect-timeout(var0, var1);
                }
            } else {
                var1.next();
                rtParseKey:vertx:eventbus:client-auth(var0, var1);
            }
        } else {
            var1.next();
            rtParseKey:vertx:eventbus:accept-backlog(var0, var1);
        }
    }

    private static void rtParseKey_vertx_eventbus_accept_backlog/* $FF was: rtParseKey:vertx:eventbus:accept-backlog*/(SmallRyeConfig var0, NameIterator var1) {
        if (var1.hasNext()) {
            ConfigDiagnostic.unknownRunTime(var1);
        }
    }

    private static void rtParseKey_vertx_eventbus_client_auth/* $FF was: rtParseKey:vertx:eventbus:client-auth*/(SmallRyeConfig var0, NameIterator var1) {
        if (var1.hasNext()) {
            ConfigDiagnostic.unknownRunTime(var1);
        }
    }

    private static void rtParseKey_vertx_eventbus_connect_timeout/* $FF was: rtParseKey:vertx:eventbus:connect-timeout*/(SmallRyeConfig var0, NameIterator var1) {
        if (var1.hasNext()) {
            ConfigDiagnostic.unknownRunTime(var1);
        }
    }

    private static void rtParseKey_vertx_eventbus_idle_timeout/* $FF was: rtParseKey:vertx:eventbus:idle-timeout*/(SmallRyeConfig var0, NameIterator var1) {
        if (var1.hasNext()) {
            ConfigDiagnostic.unknownRunTime(var1);
        }
    }

    private static void rtParseKey_vertx_eventbus_key_certificate_jks/* $FF was: rtParseKey:vertx:eventbus:key-certificate-jks*/(SmallRyeConfig var0, NameIterator var1) {
        if (var1.hasNext()) {
            if (!var1.nextSegmentEquals("password")) {
                if (!var1.nextSegmentEquals("path")) {
                    ConfigDiagnostic.unknownRunTime(var1);
                } else {
                    var1.next();
                    rtParseKey:vertx:eventbus:key-certificate-jks:path(var0, var1);
                }
            } else {
                var1.next();
                rtParseKey:vertx:eventbus:key-certificate-jks:password(var0, var1);
            }
        }
    }

    private static void rtParseKey_vertx_eventbus_key_certificate_jks_password/* $FF was: rtParseKey:vertx:eventbus:key-certificate-jks:password*/(SmallRyeConfig var0, NameIterator var1) {
        if (var1.hasNext()) {
            ConfigDiagnostic.unknownRunTime(var1);
        }
    }

    private static void rtParseKey_vertx_eventbus_key_certificate_jks_path/* $FF was: rtParseKey:vertx:eventbus:key-certificate-jks:path*/(SmallRyeConfig var0, NameIterator var1) {
        if (var1.hasNext()) {
            ConfigDiagnostic.unknownRunTime(var1);
        }
    }

    private static void rtParseKey_vertx_eventbus_key_certificate_pem/* $FF was: rtParseKey:vertx:eventbus:key-certificate-pem*/(SmallRyeConfig var0, NameIterator var1) {
        if (var1.hasNext()) {
            if (!var1.nextSegmentEquals("certs")) {
                if (!var1.nextSegmentEquals("keys")) {
                    ConfigDiagnostic.unknownRunTime(var1);
                } else {
                    var1.next();
                    rtParseKey:vertx:eventbus:key-certificate-pem:keys(var0, var1);
                }
            } else {
                var1.next();
                rtParseKey:vertx:eventbus:key-certificate-pem:certs(var0, var1);
            }
        }
    }

    private static void rtParseKey_vertx_eventbus_key_certificate_pem_certs/* $FF was: rtParseKey:vertx:eventbus:key-certificate-pem:certs*/(SmallRyeConfig var0, NameIterator var1) {
        if (var1.hasNext()) {
            ConfigDiagnostic.unknownRunTime(var1);
        }
    }

    private static void rtParseKey_vertx_eventbus_key_certificate_pem_keys/* $FF was: rtParseKey:vertx:eventbus:key-certificate-pem:keys*/(SmallRyeConfig var0, NameIterator var1) {
        if (var1.hasNext()) {
            ConfigDiagnostic.unknownRunTime(var1);
        }
    }

    private static void rtParseKey_vertx_eventbus_key_certificate_pfx/* $FF was: rtParseKey:vertx:eventbus:key-certificate-pfx*/(SmallRyeConfig var0, NameIterator var1) {
        if (var1.hasNext()) {
            if (!var1.nextSegmentEquals("password")) {
                if (!var1.nextSegmentEquals("path")) {
                    ConfigDiagnostic.unknownRunTime(var1);
                } else {
                    var1.next();
                    rtParseKey:vertx:eventbus:key-certificate-pfx:path(var0, var1);
                }
            } else {
                var1.next();
                rtParseKey:vertx:eventbus:key-certificate-pfx:password(var0, var1);
            }
        }
    }

    private static void rtParseKey_vertx_eventbus_key_certificate_pfx_password/* $FF was: rtParseKey:vertx:eventbus:key-certificate-pfx:password*/(SmallRyeConfig var0, NameIterator var1) {
        if (var1.hasNext()) {
            ConfigDiagnostic.unknownRunTime(var1);
        }
    }

    private static void rtParseKey_vertx_eventbus_key_certificate_pfx_path/* $FF was: rtParseKey:vertx:eventbus:key-certificate-pfx:path*/(SmallRyeConfig var0, NameIterator var1) {
        if (var1.hasNext()) {
            ConfigDiagnostic.unknownRunTime(var1);
        }
    }

    private static void rtParseKey_vertx_eventbus_receive_buffer_size/* $FF was: rtParseKey:vertx:eventbus:receive-buffer-size*/(SmallRyeConfig var0, NameIterator var1) {
        if (var1.hasNext()) {
            ConfigDiagnostic.unknownRunTime(var1);
        }
    }

    private static void rtParseKey_vertx_eventbus_reconnect_attempts/* $FF was: rtParseKey:vertx:eventbus:reconnect-attempts*/(SmallRyeConfig var0, NameIterator var1) {
        if (var1.hasNext()) {
            ConfigDiagnostic.unknownRunTime(var1);
        }
    }

    private static void rtParseKey_vertx_eventbus_reconnect_interval/* $FF was: rtParseKey:vertx:eventbus:reconnect-interval*/(SmallRyeConfig var0, NameIterator var1) {
        if (var1.hasNext()) {
            ConfigDiagnostic.unknownRunTime(var1);
        }
    }

    private static void rtParseKey_vertx_eventbus_reuse_address/* $FF was: rtParseKey:vertx:eventbus:reuse-address*/(SmallRyeConfig var0, NameIterator var1) {
        if (var1.hasNext()) {
            ConfigDiagnostic.unknownRunTime(var1);
        }
    }

    private static void rtParseKey_vertx_eventbus_reuse_port/* $FF was: rtParseKey:vertx:eventbus:reuse-port*/(SmallRyeConfig var0, NameIterator var1) {
        if (var1.hasNext()) {
            ConfigDiagnostic.unknownRunTime(var1);
        }
    }

    private static void rtParseKey_vertx_eventbus_send_buffer_size/* $FF was: rtParseKey:vertx:eventbus:send-buffer-size*/(SmallRyeConfig var0, NameIterator var1) {
        if (var1.hasNext()) {
            ConfigDiagnostic.unknownRunTime(var1);
        }
    }

    private static void rtParseKey_vertx_eventbus_soLinger/* $FF was: rtParseKey:vertx:eventbus:soLinger*/(SmallRyeConfig var0, NameIterator var1) {
        if (var1.hasNext()) {
            ConfigDiagnostic.unknownRunTime(var1);
        }
    }

    private static void rtParseKey_vertx_eventbus_ssl/* $FF was: rtParseKey:vertx:eventbus:ssl*/(SmallRyeConfig var0, NameIterator var1) {
        if (var1.hasNext()) {
            ConfigDiagnostic.unknownRunTime(var1);
        }
    }

    private static void rtParseKey_vertx_eventbus_tcp_keep_alive/* $FF was: rtParseKey:vertx:eventbus:tcp-keep-alive*/(SmallRyeConfig var0, NameIterator var1) {
        if (var1.hasNext()) {
            ConfigDiagnostic.unknownRunTime(var1);
        }
    }

    private static void rtParseKey_vertx_eventbus_tcp_no_delay/* $FF was: rtParseKey:vertx:eventbus:tcp-no-delay*/(SmallRyeConfig var0, NameIterator var1) {
        if (var1.hasNext()) {
            ConfigDiagnostic.unknownRunTime(var1);
        }
    }

    private static void rtParseKey_vertx_eventbus_traffic_class/* $FF was: rtParseKey:vertx:eventbus:traffic-class*/(SmallRyeConfig var0, NameIterator var1) {
        if (var1.hasNext()) {
            ConfigDiagnostic.unknownRunTime(var1);
        }
    }

    private static void rtParseKey_vertx_eventbus_trust_all/* $FF was: rtParseKey:vertx:eventbus:trust-all*/(SmallRyeConfig var0, NameIterator var1) {
        if (var1.hasNext()) {
            ConfigDiagnostic.unknownRunTime(var1);
        }
    }

    private static void rtParseKey_vertx_eventbus_trust_certificate_jks/* $FF was: rtParseKey:vertx:eventbus:trust-certificate-jks*/(SmallRyeConfig var0, NameIterator var1) {
        if (var1.hasNext()) {
            if (!var1.nextSegmentEquals("password")) {
                if (!var1.nextSegmentEquals("path")) {
                    ConfigDiagnostic.unknownRunTime(var1);
                } else {
                    var1.next();
                    rtParseKey:vertx:eventbus:trust-certificate-jks:path(var0, var1);
                }
            } else {
                var1.next();
                rtParseKey:vertx:eventbus:trust-certificate-jks:password(var0, var1);
            }
        }
    }

    private static void rtParseKey_vertx_eventbus_trust_certificate_jks_password/* $FF was: rtParseKey:vertx:eventbus:trust-certificate-jks:password*/(SmallRyeConfig var0, NameIterator var1) {
        if (var1.hasNext()) {
            ConfigDiagnostic.unknownRunTime(var1);
        }
    }

    private static void rtParseKey_vertx_eventbus_trust_certificate_jks_path/* $FF was: rtParseKey:vertx:eventbus:trust-certificate-jks:path*/(SmallRyeConfig var0, NameIterator var1) {
        if (var1.hasNext()) {
            ConfigDiagnostic.unknownRunTime(var1);
        }
    }

    private static void rtParseKey_vertx_eventbus_trust_certificate_pem/* $FF was: rtParseKey:vertx:eventbus:trust-certificate-pem*/(SmallRyeConfig var0, NameIterator var1) {
        if (var1.hasNext()) {
            if (!var1.nextSegmentEquals("certs")) {
                ConfigDiagnostic.unknownRunTime(var1);
            } else {
                var1.next();
                rtParseKey:vertx:eventbus:trust-certificate-pem:certs(var0, var1);
            }
        }
    }

    private static void rtParseKey_vertx_eventbus_trust_certificate_pem_certs/* $FF was: rtParseKey:vertx:eventbus:trust-certificate-pem:certs*/(SmallRyeConfig var0, NameIterator var1) {
        if (var1.hasNext()) {
            ConfigDiagnostic.unknownRunTime(var1);
        }
    }

    private static void rtParseKey_vertx_eventbus_trust_certificate_pfx/* $FF was: rtParseKey:vertx:eventbus:trust-certificate-pfx*/(SmallRyeConfig var0, NameIterator var1) {
        if (var1.hasNext()) {
            if (!var1.nextSegmentEquals("password")) {
                if (!var1.nextSegmentEquals("path")) {
                    ConfigDiagnostic.unknownRunTime(var1);
                } else {
                    var1.next();
                    rtParseKey:vertx:eventbus:trust-certificate-pfx:path(var0, var1);
                }
            } else {
                var1.next();
                rtParseKey:vertx:eventbus:trust-certificate-pfx:password(var0, var1);
            }
        }
    }

    private static void rtParseKey_vertx_eventbus_trust_certificate_pfx_password/* $FF was: rtParseKey:vertx:eventbus:trust-certificate-pfx:password*/(SmallRyeConfig var0, NameIterator var1) {
        if (var1.hasNext()) {
            ConfigDiagnostic.unknownRunTime(var1);
        }
    }

    private static void rtParseKey_vertx_eventbus_trust_certificate_pfx_path/* $FF was: rtParseKey:vertx:eventbus:trust-certificate-pfx:path*/(SmallRyeConfig var0, NameIterator var1) {
        if (var1.hasNext()) {
            ConfigDiagnostic.unknownRunTime(var1);
        }
    }

    private static void rtParseKey_vertx_internal_blocking_pool_size/* $FF was: rtParseKey:vertx:internal-blocking-pool-size*/(SmallRyeConfig var0, NameIterator var1) {
        if (var1.hasNext()) {
            ConfigDiagnostic.unknownRunTime(var1);
        }
    }

    private static void rtParseKey_vertx_max_event_loop_execute_time/* $FF was: rtParseKey:vertx:max-event-loop-execute-time*/(SmallRyeConfig var0, NameIterator var1) {
        if (var1.hasNext()) {
            ConfigDiagnostic.unknownRunTime(var1);
        }
    }

    private static void rtParseKey_vertx_max_worker_execute_time/* $FF was: rtParseKey:vertx:max-worker-execute-time*/(SmallRyeConfig var0, NameIterator var1) {
        if (var1.hasNext()) {
            ConfigDiagnostic.unknownRunTime(var1);
        }
    }

    private static void rtParseKey_vertx_prefer_native_transport/* $FF was: rtParseKey:vertx:prefer-native-transport*/(SmallRyeConfig var0, NameIterator var1) {
        if (var1.hasNext()) {
            ConfigDiagnostic.unknownRunTime(var1);
        }
    }

    private static void rtParseKey_vertx_resolver/* $FF was: rtParseKey:vertx:resolver*/(SmallRyeConfig var0, NameIterator var1) {
        if (!var1.hasNext()) {
            ConfigDiagnostic.unknownRunTime(var1);
        } else if (!var1.nextSegmentEquals("cache-max-time-to-live")) {
            if (!var1.nextSegmentEquals("cache-min-time-to-live")) {
                if (!var1.nextSegmentEquals("cache-negative-time-to-live")) {
                    ConfigDiagnostic.unknownRunTime(var1);
                } else {
                    var1.next();
                    rtParseKey:vertx:resolver:cache-negative-time-to-live(var0, var1);
                }
            } else {
                var1.next();
                rtParseKey:vertx:resolver:cache-min-time-to-live(var0, var1);
            }
        } else {
            var1.next();
            rtParseKey:vertx:resolver:cache-max-time-to-live(var0, var1);
        }
    }

    private static void rtParseKey_vertx_resolver_cache_max_time_to_live/* $FF was: rtParseKey:vertx:resolver:cache-max-time-to-live*/(SmallRyeConfig var0, NameIterator var1) {
        if (var1.hasNext()) {
            ConfigDiagnostic.unknownRunTime(var1);
        }
    }

    private static void rtParseKey_vertx_resolver_cache_min_time_to_live/* $FF was: rtParseKey:vertx:resolver:cache-min-time-to-live*/(SmallRyeConfig var0, NameIterator var1) {
        if (var1.hasNext()) {
            ConfigDiagnostic.unknownRunTime(var1);
        }
    }

    private static void rtParseKey_vertx_resolver_cache_negative_time_to_live/* $FF was: rtParseKey:vertx:resolver:cache-negative-time-to-live*/(SmallRyeConfig var0, NameIterator var1) {
        if (var1.hasNext()) {
            ConfigDiagnostic.unknownRunTime(var1);
        }
    }

    private static void rtParseKey_vertx_use_async_dns/* $FF was: rtParseKey:vertx:use-async-dns*/(SmallRyeConfig var0, NameIterator var1) {
        if (var1.hasNext()) {
            ConfigDiagnostic.unknownRunTime(var1);
        }
    }

    private static void rtParseKey_vertx_warning_exception_time/* $FF was: rtParseKey:vertx:warning-exception-time*/(SmallRyeConfig var0, NameIterator var1) {
        if (var1.hasNext()) {
            ConfigDiagnostic.unknownRunTime(var1);
        }
    }

    private static void rtParseKey_vertx_worker_pool_size/* $FF was: rtParseKey:vertx:worker-pool-size*/(SmallRyeConfig var0, NameIterator var1) {
        if (var1.hasNext()) {
            ConfigDiagnostic.unknownRunTime(var1);
        }
    }

    private static void rtParseKey_application/* $FF was: rtParseKey:application*/(SmallRyeConfig var0, NameIterator var1) {
        if (!var1.hasNext()) {
            ConfigDiagnostic.unknownRunTime(var1);
        } else if (!var1.nextSegmentEquals("name")) {
            if (!var1.nextSegmentEquals("version")) {
                ConfigDiagnostic.unknownRunTime(var1);
            } else {
                var1.next();
                rtEmptyParseKey(var0, var1);
            }
        } else {
            var1.next();
            rtEmptyParseKey(var0, var1);
        }
    }

    private static void rtParseKey_arc/* $FF was: rtParseKey:arc*/(SmallRyeConfig var0, NameIterator var1) {
        if (!var1.hasNext()) {
            ConfigDiagnostic.unknownRunTime(var1);
        } else if (!var1.nextSegmentEquals("auto-inject-fields")) {
            if (!var1.nextSegmentEquals("auto-producer-methods")) {
                if (!var1.nextSegmentEquals("config-properties-default-naming-strategy")) {
                    if (!var1.nextSegmentEquals("detect-unused-false-positives")) {
                        if (!var1.nextSegmentEquals("detect-wrong-annotations")) {
                            if (!var1.nextSegmentEquals("exclude-dependency")) {
                                if (!var1.nextSegmentEquals("exclude-types")) {
                                    if (!var1.nextSegmentEquals("remove-unused-beans")) {
                                        if (!var1.nextSegmentEquals("selected-alternatives")) {
                                            if (!var1.nextSegmentEquals("transform-unproxyable-classes")) {
                                                if (!var1.nextSegmentEquals("unremovable-types")) {
                                                    ConfigDiagnostic.unknownRunTime(var1);
                                                } else {
                                                    var1.next();
                                                    rtEmptyParseKey(var0, var1);
                                                }
                                            } else {
                                                var1.next();
                                                rtEmptyParseKey(var0, var1);
                                            }
                                        } else {
                                            var1.next();
                                            rtEmptyParseKey(var0, var1);
                                        }
                                    } else {
                                        var1.next();
                                        rtEmptyParseKey(var0, var1);
                                    }
                                } else {
                                    var1.next();
                                    rtEmptyParseKey(var0, var1);
                                }
                            } else {
                                var1.next();
                                rtParseKey:arc:exclude-dependency(var0, var1);
                            }
                        } else {
                            var1.next();
                            rtEmptyParseKey(var0, var1);
                        }
                    } else {
                        var1.next();
                        rtEmptyParseKey(var0, var1);
                    }
                } else {
                    var1.next();
                    rtEmptyParseKey(var0, var1);
                }
            } else {
                var1.next();
                rtEmptyParseKey(var0, var1);
            }
        } else {
            var1.next();
            rtEmptyParseKey(var0, var1);
        }
    }

    private static void rtParseKey_arc_exclude_dependency/* $FF was: rtParseKey:arc:exclude-dependency*/(SmallRyeConfig var0, NameIterator var1) {
        if (!var1.hasNext()) {
            ConfigDiagnostic.unknownRunTime(var1);
        } else if (!var1.hasNext()) {
            ConfigDiagnostic.unknownRunTime(var1);
        } else {
            var1.next();
            rtParseKey:arc:exclude-dependency:*(var0, var1);
        }
    }

    private static void rtParseKey_arc_exclude_dependency__/* $FF was: rtParseKey:arc:exclude-dependency:**/(SmallRyeConfig var0, NameIterator var1) {
        if (!var1.hasNext()) {
            ConfigDiagnostic.unknownRunTime(var1);
        } else if (!var1.nextSegmentEquals("artifact-id")) {
            if (!var1.nextSegmentEquals("classifier")) {
                if (!var1.nextSegmentEquals("group-id")) {
                    ConfigDiagnostic.unknownRunTime(var1);
                } else {
                    var1.next();
                    rtEmptyParseKey(var0, var1);
                }
            } else {
                var1.next();
                rtEmptyParseKey(var0, var1);
            }
        } else {
            var1.next();
            rtEmptyParseKey(var0, var1);
        }
    }

    private static void rtParseKey_class_loading/* $FF was: rtParseKey:class-loading*/(SmallRyeConfig var0, NameIterator var1) {
        if (!var1.hasNext()) {
            ConfigDiagnostic.unknownRunTime(var1);
        } else if (!var1.nextSegmentEquals("parent-first-artifacts")) {
            if (!var1.nextSegmentEquals("reloadable-artifacts")) {
                ConfigDiagnostic.unknownRunTime(var1);
            } else {
                var1.next();
                rtEmptyParseKey(var0, var1);
            }
        } else {
            var1.next();
            rtEmptyParseKey(var0, var1);
        }
    }

    private static void rtParseKey_debug/* $FF was: rtParseKey:debug*/(SmallRyeConfig var0, NameIterator var1) {
        if (!var1.hasNext()) {
            ConfigDiagnostic.unknownRunTime(var1);
        } else if (!var1.nextSegmentEquals("generated-classes-dir")) {
            if (!var1.nextSegmentEquals("reflection")) {
                ConfigDiagnostic.unknownRunTime(var1);
            } else {
                var1.next();
                rtEmptyParseKey(var0, var1);
            }
        } else {
            var1.next();
            rtEmptyParseKey(var0, var1);
        }
    }

    private static void rtParseKey_dev/* $FF was: rtParseKey:dev*/(SmallRyeConfig var0, NameIterator var1) {
        if (!var1.hasNext()) {
            ConfigDiagnostic.unknownRunTime(var1);
        } else if (!var1.nextSegmentEquals("instrumentation")) {
            ConfigDiagnostic.unknownRunTime(var1);
        } else {
            var1.next();
            rtEmptyParseKey(var0, var1);
        }
    }

    private static void rtParseKey_index_dependency/* $FF was: rtParseKey:index-dependency*/(SmallRyeConfig var0, NameIterator var1) {
        if (!var1.hasNext()) {
            ConfigDiagnostic.unknownRunTime(var1);
        } else if (!var1.hasNext()) {
            ConfigDiagnostic.unknownRunTime(var1);
        } else {
            var1.next();
            rtParseKey:index-dependency:*(var0, var1);
        }
    }

    private static void rtParseKey_index_dependency__/* $FF was: rtParseKey:index-dependency:**/(SmallRyeConfig var0, NameIterator var1) {
        if (!var1.hasNext()) {
            ConfigDiagnostic.unknownRunTime(var1);
        } else if (!var1.nextSegmentEquals("artifact-id")) {
            if (!var1.nextSegmentEquals("classifier")) {
                if (!var1.nextSegmentEquals("group-id")) {
                    ConfigDiagnostic.unknownRunTime(var1);
                } else {
                    var1.next();
                    rtEmptyParseKey(var0, var1);
                }
            } else {
                var1.next();
                rtEmptyParseKey(var0, var1);
            }
        } else {
            var1.next();
            rtEmptyParseKey(var0, var1);
        }
    }

    private static void rtParseKey_jackson/* $FF was: rtParseKey:jackson*/(SmallRyeConfig var0, NameIterator var1) {
        if (!var1.hasNext()) {
            ConfigDiagnostic.unknownRunTime(var1);
        } else if (!var1.nextSegmentEquals("fail-on-unknown-properties")) {
            ConfigDiagnostic.unknownRunTime(var1);
        } else {
            var1.next();
            rtEmptyParseKey(var0, var1);
        }
    }

    private static void rtParseKey_jni/* $FF was: rtParseKey:jni*/(SmallRyeConfig var0, NameIterator var1) {
        if (!var1.hasNext()) {
            ConfigDiagnostic.unknownRunTime(var1);
        } else if (!var1.nextSegmentEquals("enable")) {
            if (!var1.nextSegmentEquals("library-paths")) {
                ConfigDiagnostic.unknownRunTime(var1);
            } else {
                var1.next();
                rtEmptyParseKey(var0, var1);
            }
        } else {
            var1.next();
            rtEmptyParseKey(var0, var1);
        }
    }

    private static void rtParseKey_live_reload/* $FF was: rtParseKey:live-reload*/(SmallRyeConfig var0, NameIterator var1) {
        if (!var1.hasNext()) {
            ConfigDiagnostic.unknownRunTime(var1);
        } else if (!var1.nextSegmentEquals("password")) {
            if (!var1.nextSegmentEquals("url")) {
                if (!var1.nextSegmentEquals("watched-resources")) {
                    ConfigDiagnostic.unknownRunTime(var1);
                } else {
                    var1.next();
                    rtEmptyParseKey(var0, var1);
                }
            } else {
                var1.next();
                rtEmptyParseKey(var0, var1);
            }
        } else {
            var1.next();
            rtEmptyParseKey(var0, var1);
        }
    }

    private static void rtParseKey_native/* $FF was: rtParseKey:native*/(SmallRyeConfig var0, NameIterator var1) {
        if (!var1.hasNext()) {
            ConfigDiagnostic.unknownRunTime(var1);
        } else if (!var1.nextSegmentEquals("add-all-charsets")) {
            if (!var1.nextSegmentEquals("additional-build-args")) {
                if (!var1.nextSegmentEquals("auto-service-loader-registration")) {
                    if (!var1.nextSegmentEquals("builder-image")) {
                        if (!var1.nextSegmentEquals("cleanup-server")) {
                            if (!var1.nextSegmentEquals("container-build")) {
                                if (!var1.nextSegmentEquals("container-runtime")) {
                                    if (!var1.nextSegmentEquals("container-runtime-options")) {
                                        if (!var1.nextSegmentEquals("debug")) {
                                            if (!var1.nextSegmentEquals("debug-build-process")) {
                                                if (!var1.nextSegmentEquals("dump-proxies")) {
                                                    if (!var1.nextSegmentEquals("enable-all-security-services")) {
                                                        if (!var1.nextSegmentEquals("enable-dashboard-dump")) {
                                                            if (!var1.nextSegmentEquals("enable-fallback-images")) {
                                                                if (!var1.nextSegmentEquals("enable-http-url-handler")) {
                                                                    if (!var1.nextSegmentEquals("enable-https-url-handler")) {
                                                                        if (!var1.nextSegmentEquals("enable-isolates")) {
                                                                            if (!var1.nextSegmentEquals("enable-jni")) {
                                                                                if (!var1.nextSegmentEquals("enable-reports")) {
                                                                                    if (!var1.nextSegmentEquals("enable-server")) {
                                                                                        if (!var1.nextSegmentEquals("enable-vm-inspection")) {
                                                                                            if (!var1.nextSegmentEquals("file-encoding")) {
                                                                                                if (!var1.nextSegmentEquals("full-stack-traces")) {
                                                                                                    if (!var1.nextSegmentEquals("graalvm-home")) {
                                                                                                        if (!var1.nextSegmentEquals("java-home")) {
                                                                                                            if (!var1.nextSegmentEquals("native-image-xmx")) {
                                                                                                                if (!var1.nextSegmentEquals("publish-debug-build-process-port")) {
                                                                                                                    if (!var1.nextSegmentEquals("remote-container-build")) {
                                                                                                                        if (!var1.nextSegmentEquals("report-errors-at-runtime")) {
                                                                                                                            if (!var1.nextSegmentEquals("report-exception-stack-traces")) {
                                                                                                                                if (!var1.nextSegmentEquals("resources")) {
                                                                                                                                    if (!var1.nextSegmentEquals("user-country")) {
                                                                                                                                        if (!var1.nextSegmentEquals("user-language")) {
                                                                                                                                            ConfigDiagnostic.unknownRunTime(var1);
                                                                                                                                        } else {
                                                                                                                                            var1.next();
                                                                                                                                            rtEmptyParseKey(var0, var1);
                                                                                                                                        }
                                                                                                                                    } else {
                                                                                                                                        var1.next();
                                                                                                                                        rtEmptyParseKey(var0, var1);
                                                                                                                                    }
                                                                                                                                } else {
                                                                                                                                    var1.next();
                                                                                                                                    rtParseKey:native:resources(var0, var1);
                                                                                                                                }
                                                                                                                            } else {
                                                                                                                                var1.next();
                                                                                                                                rtEmptyParseKey(var0, var1);
                                                                                                                            }
                                                                                                                        } else {
                                                                                                                            var1.next();
                                                                                                                            rtEmptyParseKey(var0, var1);
                                                                                                                        }
                                                                                                                    } else {
                                                                                                                        var1.next();
                                                                                                                        rtEmptyParseKey(var0, var1);
                                                                                                                    }
                                                                                                                } else {
                                                                                                                    var1.next();
                                                                                                                    rtEmptyParseKey(var0, var1);
                                                                                                                }
                                                                                                            } else {
                                                                                                                var1.next();
                                                                                                                rtEmptyParseKey(var0, var1);
                                                                                                            }
                                                                                                        } else {
                                                                                                            var1.next();
                                                                                                            rtEmptyParseKey(var0, var1);
                                                                                                        }
                                                                                                    } else {
                                                                                                        var1.next();
                                                                                                        rtEmptyParseKey(var0, var1);
                                                                                                    }
                                                                                                } else {
                                                                                                    var1.next();
                                                                                                    rtEmptyParseKey(var0, var1);
                                                                                                }
                                                                                            } else {
                                                                                                var1.next();
                                                                                                rtEmptyParseKey(var0, var1);
                                                                                            }
                                                                                        } else {
                                                                                            var1.next();
                                                                                            rtEmptyParseKey(var0, var1);
                                                                                        }
                                                                                    } else {
                                                                                        var1.next();
                                                                                        rtEmptyParseKey(var0, var1);
                                                                                    }
                                                                                } else {
                                                                                    var1.next();
                                                                                    rtEmptyParseKey(var0, var1);
                                                                                }
                                                                            } else {
                                                                                var1.next();
                                                                                rtEmptyParseKey(var0, var1);
                                                                            }
                                                                        } else {
                                                                            var1.next();
                                                                            rtEmptyParseKey(var0, var1);
                                                                        }
                                                                    } else {
                                                                        var1.next();
                                                                        rtEmptyParseKey(var0, var1);
                                                                    }
                                                                } else {
                                                                    var1.next();
                                                                    rtEmptyParseKey(var0, var1);
                                                                }
                                                            } else {
                                                                var1.next();
                                                                rtEmptyParseKey(var0, var1);
                                                            }
                                                        } else {
                                                            var1.next();
                                                            rtEmptyParseKey(var0, var1);
                                                        }
                                                    } else {
                                                        var1.next();
                                                        rtEmptyParseKey(var0, var1);
                                                    }
                                                } else {
                                                    var1.next();
                                                    rtEmptyParseKey(var0, var1);
                                                }
                                            } else {
                                                var1.next();
                                                rtEmptyParseKey(var0, var1);
                                            }
                                        } else {
                                            var1.next();
                                            rtParseKey:native:debug(var0, var1);
                                        }
                                    } else {
                                        var1.next();
                                        rtEmptyParseKey(var0, var1);
                                    }
                                } else {
                                    var1.next();
                                    rtEmptyParseKey(var0, var1);
                                }
                            } else {
                                var1.next();
                                rtEmptyParseKey(var0, var1);
                            }
                        } else {
                            var1.next();
                            rtEmptyParseKey(var0, var1);
                        }
                    } else {
                        var1.next();
                        rtEmptyParseKey(var0, var1);
                    }
                } else {
                    var1.next();
                    rtEmptyParseKey(var0, var1);
                }
            } else {
                var1.next();
                rtEmptyParseKey(var0, var1);
            }
        } else {
            var1.next();
            rtEmptyParseKey(var0, var1);
        }
    }

    private static void rtParseKey_native_debug/* $FF was: rtParseKey:native:debug*/(SmallRyeConfig var0, NameIterator var1) {
        if (!var1.hasNext()) {
            ConfigDiagnostic.unknownRunTime(var1);
        } else if (!var1.nextSegmentEquals("enabled")) {
            ConfigDiagnostic.unknownRunTime(var1);
        } else {
            var1.next();
            rtEmptyParseKey(var0, var1);
        }
    }

    private static void rtParseKey_native_resources/* $FF was: rtParseKey:native:resources*/(SmallRyeConfig var0, NameIterator var1) {
        if (!var1.hasNext()) {
            ConfigDiagnostic.unknownRunTime(var1);
        } else if (!var1.nextSegmentEquals("excludes")) {
            if (!var1.nextSegmentEquals("includes")) {
                ConfigDiagnostic.unknownRunTime(var1);
            } else {
                var1.next();
                rtEmptyParseKey(var0, var1);
            }
        } else {
            var1.next();
            rtEmptyParseKey(var0, var1);
        }
    }

    private static void rtParseKey_package/* $FF was: rtParseKey:package*/(SmallRyeConfig var0, NameIterator var1) {
        if (!var1.hasNext()) {
            ConfigDiagnostic.unknownRunTime(var1);
        } else if (!var1.nextSegmentEquals("appcds-builder-image")) {
            if (!var1.nextSegmentEquals("create-appcds")) {
                if (!var1.nextSegmentEquals("main-class")) {
                    if (!var1.nextSegmentEquals("manifest")) {
                        if (!var1.nextSegmentEquals("output-directory")) {
                            if (!var1.nextSegmentEquals("output-name")) {
                                if (!var1.nextSegmentEquals("runner-suffix")) {
                                    if (!var1.nextSegmentEquals("type")) {
                                        if (!var1.nextSegmentEquals("uber-jar")) {
                                            if (!var1.nextSegmentEquals("user-configured-ignored-entries")) {
                                                if (!var1.nextSegmentEquals("user-providers-directory")) {
                                                    ConfigDiagnostic.unknownRunTime(var1);
                                                } else {
                                                    var1.next();
                                                    rtEmptyParseKey(var0, var1);
                                                }
                                            } else {
                                                var1.next();
                                                rtEmptyParseKey(var0, var1);
                                            }
                                        } else {
                                            var1.next();
                                            rtEmptyParseKey(var0, var1);
                                        }
                                    } else {
                                        var1.next();
                                        rtEmptyParseKey(var0, var1);
                                    }
                                } else {
                                    var1.next();
                                    rtEmptyParseKey(var0, var1);
                                }
                            } else {
                                var1.next();
                                rtEmptyParseKey(var0, var1);
                            }
                        } else {
                            var1.next();
                            rtEmptyParseKey(var0, var1);
                        }
                    } else {
                        var1.next();
                        rtParseKey:package:manifest(var0, var1);
                    }
                } else {
                    var1.next();
                    rtEmptyParseKey(var0, var1);
                }
            } else {
                var1.next();
                rtEmptyParseKey(var0, var1);
            }
        } else {
            var1.next();
            rtEmptyParseKey(var0, var1);
        }
    }

    private static void rtParseKey_package_manifest/* $FF was: rtParseKey:package:manifest*/(SmallRyeConfig var0, NameIterator var1) {
        if (!var1.hasNext()) {
            ConfigDiagnostic.unknownRunTime(var1);
        } else if (!var1.nextSegmentEquals("add-implementation-entries")) {
            if (!var1.nextSegmentEquals("manifest-sections")) {
                ConfigDiagnostic.unknownRunTime(var1);
            } else {
                var1.next();
                rtParseKey:package:manifest:manifest-sections(var0, var1);
            }
        } else {
            var1.next();
            rtEmptyParseKey(var0, var1);
        }
    }

    private static void rtParseKey_package_manifest_manifest_sections/* $FF was: rtParseKey:package:manifest:manifest-sections*/(SmallRyeConfig var0, NameIterator var1) {
        if (!var1.hasNext()) {
            ConfigDiagnostic.unknownRunTime(var1);
        } else if (!var1.hasNext()) {
            ConfigDiagnostic.unknownRunTime(var1);
        } else {
            var1.next();
            rtParseKey:package:manifest:manifest-sections:*(var0, var1);
        }
    }

    private static void rtParseKey_package_manifest_manifest_sections__/* $FF was: rtParseKey:package:manifest:manifest-sections:**/(SmallRyeConfig var0, NameIterator var1) {
        if (!var1.hasNext()) {
            ConfigDiagnostic.unknownRunTime(var1);
        } else if (!var1.hasNext()) {
            ConfigDiagnostic.unknownRunTime(var1);
        } else {
            var1.next();
            rtEmptyParseKey(var0, var1);
        }
    }

    private static void rtParseKey_platform/* $FF was: rtParseKey:platform*/(SmallRyeConfig var0, NameIterator var1) {
        if (!var1.hasNext()) {
            ConfigDiagnostic.unknownRunTime(var1);
        } else if (!var1.nextSegmentEquals("artifact-id")) {
            if (!var1.nextSegmentEquals("group-id")) {
                if (!var1.nextSegmentEquals("version")) {
                    ConfigDiagnostic.unknownRunTime(var1);
                } else {
                    var1.next();
                    rtEmptyParseKey(var0, var1);
                }
            } else {
                var1.next();
                rtEmptyParseKey(var0, var1);
            }
        } else {
            var1.next();
            rtEmptyParseKey(var0, var1);
        }
    }

    private static void rtParseKey_resteasy/* $FF was: rtParseKey:resteasy*/(SmallRyeConfig var0, NameIterator var1) {
        if (!var1.hasNext()) {
            ConfigDiagnostic.unknownRunTime(var1);
        } else if (!var1.nextSegmentEquals("gzip")) {
            if (!var1.nextSegmentEquals("ignore-application-classes")) {
                if (!var1.nextSegmentEquals("metrics")) {
                    if (!var1.nextSegmentEquals("path")) {
                        if (!var1.nextSegmentEquals("singleton-resources")) {
                            if (!var1.nextSegmentEquals("vertx")) {
                                ConfigDiagnostic.unknownRunTime(var1);
                            } else {
                                var1.next();
                                rtParseKey:resteasy:vertx(var0, var1);
                            }
                        } else {
                            var1.next();
                            rtEmptyParseKey(var0, var1);
                        }
                    } else {
                        var1.next();
                        rtEmptyParseKey(var0, var1);
                    }
                } else {
                    var1.next();
                    rtParseKey:resteasy:metrics(var0, var1);
                }
            } else {
                var1.next();
                rtEmptyParseKey(var0, var1);
            }
        } else {
            var1.next();
            rtParseKey:resteasy:gzip(var0, var1);
        }
    }

    private static void rtParseKey_resteasy_gzip/* $FF was: rtParseKey:resteasy:gzip*/(SmallRyeConfig var0, NameIterator var1) {
        if (!var1.hasNext()) {
            ConfigDiagnostic.unknownRunTime(var1);
        } else if (!var1.nextSegmentEquals("enabled")) {
            if (!var1.nextSegmentEquals("max-input")) {
                ConfigDiagnostic.unknownRunTime(var1);
            } else {
                var1.next();
                rtEmptyParseKey(var0, var1);
            }
        } else {
            var1.next();
            rtEmptyParseKey(var0, var1);
        }
    }

    private static void rtParseKey_resteasy_metrics/* $FF was: rtParseKey:resteasy:metrics*/(SmallRyeConfig var0, NameIterator var1) {
        if (!var1.hasNext()) {
            ConfigDiagnostic.unknownRunTime(var1);
        } else if (!var1.nextSegmentEquals("enabled")) {
            ConfigDiagnostic.unknownRunTime(var1);
        } else {
            var1.next();
            rtEmptyParseKey(var0, var1);
        }
    }

    private static void rtParseKey_resteasy_vertx/* $FF was: rtParseKey:resteasy:vertx*/(SmallRyeConfig var0, NameIterator var1) {
        if (!var1.hasNext()) {
            ConfigDiagnostic.unknownRunTime(var1);
        } else if (!var1.nextSegmentEquals("response-buffer-size")) {
            ConfigDiagnostic.unknownRunTime(var1);
        } else {
            var1.next();
            rtEmptyParseKey(var0, var1);
        }
    }

    private static void rtParseKey_resteasy_json/* $FF was: rtParseKey:resteasy-json*/(SmallRyeConfig var0, NameIterator var1) {
        if (!var1.hasNext()) {
            ConfigDiagnostic.unknownRunTime(var1);
        } else if (!var1.nextSegmentEquals("json-default")) {
            ConfigDiagnostic.unknownRunTime(var1);
        } else {
            var1.next();
            rtEmptyParseKey(var0, var1);
        }
    }

    private static void rtParseKey_security/* $FF was: rtParseKey:security*/(SmallRyeConfig var0, NameIterator var1) {
        if (!var1.hasNext()) {
            ConfigDiagnostic.unknownRunTime(var1);
        } else if (!var1.nextSegmentEquals("jaxrs")) {
            ConfigDiagnostic.unknownRunTime(var1);
        } else {
            var1.next();
            rtParseKey:security:jaxrs(var0, var1);
        }
    }

    private static void rtParseKey_security_jaxrs/* $FF was: rtParseKey:security:jaxrs*/(SmallRyeConfig var0, NameIterator var1) {
        if (!var1.hasNext()) {
            ConfigDiagnostic.unknownRunTime(var1);
        } else if (!var1.nextSegmentEquals("deny-unannotated-endpoints")) {
            ConfigDiagnostic.unknownRunTime(var1);
        } else {
            var1.next();
            rtEmptyParseKey(var0, var1);
        }
    }

    private static void rtParseKey_ssl/* $FF was: rtParseKey:ssl*/(SmallRyeConfig var0, NameIterator var1) {
        if (!var1.hasNext()) {
            ConfigDiagnostic.unknownRunTime(var1);
        } else if (!var1.nextSegmentEquals("native")) {
            ConfigDiagnostic.unknownRunTime(var1);
        } else {
            var1.next();
            rtEmptyParseKey(var0, var1);
        }
    }

    private static void rtParseKey_test/* $FF was: rtParseKey:test*/(SmallRyeConfig var0, NameIterator var1) {
        if (!var1.hasNext()) {
            ConfigDiagnostic.unknownRunTime(var1);
        } else if (!var1.nextSegmentEquals("hang-detection-timeout")) {
            if (!var1.nextSegmentEquals("native-image-profile")) {
                if (!var1.nextSegmentEquals("native-image-wait-time")) {
                    if (!var1.nextSegmentEquals("profile")) {
                        ConfigDiagnostic.unknownRunTime(var1);
                    } else {
                        var1.next();
                        rtParseKey:test:profile(var0, var1);
                    }
                } else {
                    var1.next();
                    rtEmptyParseKey(var0, var1);
                }
            } else {
                var1.next();
                rtEmptyParseKey(var0, var1);
            }
        } else {
            var1.next();
            rtEmptyParseKey(var0, var1);
        }
    }

    private static void rtParseKey_test_profile/* $FF was: rtParseKey:test:profile*/(SmallRyeConfig var0, NameIterator var1) {
        if (var1.hasNext()) {
            if (!var1.nextSegmentEquals("tags")) {
                ConfigDiagnostic.unknownRunTime(var1);
            } else {
                var1.next();
                rtEmptyParseKey(var0, var1);
            }
        }
    }

    private static void rtParseKey_tls/* $FF was: rtParseKey:tls*/(SmallRyeConfig var0, NameIterator var1) {
        if (!var1.hasNext()) {
            ConfigDiagnostic.unknownRunTime(var1);
        } else if (!var1.nextSegmentEquals("trust-all")) {
            ConfigDiagnostic.unknownRunTime(var1);
        } else {
            var1.next();
            rtEmptyParseKey(var0, var1);
        }
    }

    static void initGroup$io$quarkus$vertx$http$runtime$HttpBuildTimeConfig(SmallRyeConfig var0, StringBuilder var1, Object var2) {
        int var8 = var1.length();
        var1.append('.');
        var1.append("root-path");
        String var3 = var1.toString();
        Converter var4 = conv$2;

        try {
            Object var5 = var0.getValue(var3, var4);
            ((HttpBuildTimeConfig)var2).rootPath = (String)var5;
        } catch (IllegalArgumentException var38) {
            ConfigDiagnostic.invalidValue(var3, var38);
        } catch (NoSuchElementException var39) {
            ConfigDiagnostic.missingValue(var3, var39);
        }

        var1.setLength(var8);
        var1.append('.');
        var1.append("auth");
        AuthConfig var9 = new AuthConfig();
        initGroup$io$quarkus$vertx$http$runtime$AuthConfig(var0, var1, var9);
        ((HttpBuildTimeConfig)var2).auth = var9;
        var1.setLength(var8);
        var1.append('.');
        var1.append("ssl.client-auth");
        String var10 = var1.toString();
        Converter var11 = conv$22;

        try {
            Object var12 = var0.getValue(var10, var11);
            ((HttpBuildTimeConfig)var2).tlsClientAuth = (ClientAuth)var12;
        } catch (IllegalArgumentException var36) {
            ConfigDiagnostic.invalidValue(var10, var36);
        } catch (NoSuchElementException var37) {
            ConfigDiagnostic.missingValue(var10, var37);
        }

        var1.setLength(var8);
        var1.append('.');
        var1.append("virtual");
        String var15 = var1.toString();
        Converter var16 = conv$8;

        try {
            Object var17 = var0.getValue(var15, var16);
            ((HttpBuildTimeConfig)var2).virtual = (Boolean)var17;
        } catch (IllegalArgumentException var34) {
            ConfigDiagnostic.invalidValue(var15, var34);
        } catch (NoSuchElementException var35) {
            ConfigDiagnostic.missingValue(var15, var35);
        }

        var1.setLength(var8);
        var1.append('.');
        var1.append("non-application-root-path");
        String var20 = var1.toString();
        Converter var21 = conv$2;

        try {
            Object var22 = var0.getValue(var20, var21);
            ((HttpBuildTimeConfig)var2).nonApplicationRootPath = (String)var22;
        } catch (IllegalArgumentException var32) {
            ConfigDiagnostic.invalidValue(var20, var32);
        } catch (NoSuchElementException var33) {
            ConfigDiagnostic.missingValue(var20, var33);
        }

        var1.setLength(var8);
        var1.append('.');
        var1.append("redirect-to-non-application-root-path");
        String var25 = var1.toString();
        Converter var26 = conv$8;

        try {
            Object var27 = var0.getValue(var25, var26);
            ((HttpBuildTimeConfig)var2).redirectToNonApplicationRootPath = (Boolean)var27;
        } catch (IllegalArgumentException var30) {
            ConfigDiagnostic.invalidValue(var25, var30);
        } catch (NoSuchElementException var31) {
            ConfigDiagnostic.missingValue(var25, var31);
        }

        var1.setLength(var8);
    }

    static void initGroup$io$quarkus$vertx$http$runtime$AuthConfig(SmallRyeConfig var0, StringBuilder var1, Object var2) {
        int var8 = var1.length();
        var1.append('.');
        var1.append("basic");
        String var3 = var1.toString();
        Converter var4 = conv$8;

        try {
            Object var5 = var0.getValue(var3, var4);
            ((AuthConfig)var2).basic = (Boolean)var5;
        } catch (IllegalArgumentException var26) {
            ConfigDiagnostic.invalidValue(var3, var26);
        } catch (NoSuchElementException var27) {
            ConfigDiagnostic.missingValue(var3, var27);
        }

        var1.setLength(var8);
        var1.append('.');
        var1.append("form");
        FormAuthConfig var9 = new FormAuthConfig();
        initGroup$io$quarkus$vertx$http$runtime$FormAuthConfig(var0, var1, var9);
        ((AuthConfig)var2).form = var9;
        var1.setLength(var8);
        var1.append('.');
        var1.append("realm");
        String var10 = var1.toString();
        Converter var11 = conv$2;

        try {
            Object var12 = var0.getValue(var10, var11);
            ((AuthConfig)var2).realm = (String)var12;
        } catch (IllegalArgumentException var24) {
            ConfigDiagnostic.invalidValue(var10, var24);
        } catch (NoSuchElementException var25) {
            ConfigDiagnostic.missingValue(var10, var25);
        }

        var1.setLength(var8);
        var1.append('.');
        var1.append("permission");
        TreeMap var15 = new TreeMap();
        ((AuthConfig)var2).permissions = (Map)var15;
        var1.setLength(var8);
        var1.append('.');
        var1.append("policy");
        TreeMap var16 = new TreeMap();
        ((AuthConfig)var2).rolePolicy = (Map)var16;
        var1.setLength(var8);
        var1.append('.');
        var1.append("proactive");
        String var17 = var1.toString();
        Converter var18 = conv$8;

        try {
            Object var19 = var0.getValue(var17, var18);
            ((AuthConfig)var2).proactive = (Boolean)var19;
        } catch (IllegalArgumentException var22) {
            ConfigDiagnostic.invalidValue(var17, var22);
        } catch (NoSuchElementException var23) {
            ConfigDiagnostic.missingValue(var17, var23);
        }

        var1.setLength(var8);
    }

    static void initGroup$io$quarkus$vertx$http$runtime$FormAuthConfig(SmallRyeConfig var0, StringBuilder var1, Object var2) {
        int var8 = var1.length();
        var1.append('.');
        var1.append("enabled");
        String var3 = var1.toString();
        Converter var4 = conv$8;

        try {
            Object var5 = var0.getValue(var3, var4);
            ((FormAuthConfig)var2).enabled = (Boolean)var5;
        } catch (IllegalArgumentException var86) {
            ConfigDiagnostic.invalidValue(var3, var86);
        } catch (NoSuchElementException var87) {
            ConfigDiagnostic.missingValue(var3, var87);
        }

        var1.setLength(var8);
        var1.append('.');
        var1.append("login-page");
        String var9 = var1.toString();
        Converter var10 = conv$2;

        try {
            Object var11 = var0.getValue(var9, var10);
            ((FormAuthConfig)var2).loginPage = (String)var11;
        } catch (IllegalArgumentException var84) {
            ConfigDiagnostic.invalidValue(var9, var84);
        } catch (NoSuchElementException var85) {
            ConfigDiagnostic.missingValue(var9, var85);
        }

        var1.setLength(var8);
        var1.append('.');
        var1.append("post-location");
        String var14 = var1.toString();
        Converter var15 = conv$2;

        try {
            Object var16 = var0.getValue(var14, var15);
            ((FormAuthConfig)var2).postLocation = (String)var16;
        } catch (IllegalArgumentException var82) {
            ConfigDiagnostic.invalidValue(var14, var82);
        } catch (NoSuchElementException var83) {
            ConfigDiagnostic.missingValue(var14, var83);
        }

        var1.setLength(var8);
        var1.append('.');
        var1.append("username-parameter");
        String var19 = var1.toString();
        Converter var20 = conv$2;

        try {
            Object var21 = var0.getValue(var19, var20);
            ((FormAuthConfig)var2).usernameParameter = (String)var21;
        } catch (IllegalArgumentException var80) {
            ConfigDiagnostic.invalidValue(var19, var80);
        } catch (NoSuchElementException var81) {
            ConfigDiagnostic.missingValue(var19, var81);
        }

        var1.setLength(var8);
        var1.append('.');
        var1.append("password-parameter");
        String var24 = var1.toString();
        Converter var25 = conv$2;

        try {
            Object var26 = var0.getValue(var24, var25);
            ((FormAuthConfig)var2).passwordParameter = (String)var26;
        } catch (IllegalArgumentException var78) {
            ConfigDiagnostic.invalidValue(var24, var78);
        } catch (NoSuchElementException var79) {
            ConfigDiagnostic.missingValue(var24, var79);
        }

        var1.setLength(var8);
        var1.append('.');
        var1.append("error-page");
        String var29 = var1.toString();
        Converter var30 = conv$2;

        try {
            Object var31 = var0.getValue(var29, var30);
            ((FormAuthConfig)var2).errorPage = (String)var31;
        } catch (IllegalArgumentException var76) {
            ConfigDiagnostic.invalidValue(var29, var76);
        } catch (NoSuchElementException var77) {
            ConfigDiagnostic.missingValue(var29, var77);
        }

        var1.setLength(var8);
        var1.append('.');
        var1.append("landing-page");
        String var34 = var1.toString();
        Converter var35 = conv$2;

        try {
            Object var36 = var0.getValue(var34, var35);
            ((FormAuthConfig)var2).landingPage = (String)var36;
        } catch (IllegalArgumentException var74) {
            ConfigDiagnostic.invalidValue(var34, var74);
        } catch (NoSuchElementException var75) {
            ConfigDiagnostic.missingValue(var34, var75);
        }

        var1.setLength(var8);
        var1.append('.');
        var1.append("redirect-after-login");
        String var39 = var1.toString();
        Converter var40 = conv$8;

        try {
            Object var41 = var0.getValue(var39, var40);
            ((FormAuthConfig)var2).redirectAfterLogin = (Boolean)var41;
        } catch (IllegalArgumentException var72) {
            ConfigDiagnostic.invalidValue(var39, var72);
        } catch (NoSuchElementException var73) {
            ConfigDiagnostic.missingValue(var39, var73);
        }

        var1.setLength(var8);
        var1.append('.');
        var1.append("location-cookie");
        String var44 = var1.toString();
        Converter var45 = conv$2;

        try {
            Object var46 = var0.getValue(var44, var45);
            ((FormAuthConfig)var2).locationCookie = (String)var46;
        } catch (IllegalArgumentException var70) {
            ConfigDiagnostic.invalidValue(var44, var70);
        } catch (NoSuchElementException var71) {
            ConfigDiagnostic.missingValue(var44, var71);
        }

        var1.setLength(var8);
        var1.append('.');
        var1.append("timeout");
        String var49 = var1.toString();
        Converter var50 = conv$21;

        try {
            Object var51 = var0.getValue(var49, var50);
            ((FormAuthConfig)var2).timeout = (Duration)var51;
        } catch (IllegalArgumentException var68) {
            ConfigDiagnostic.invalidValue(var49, var68);
        } catch (NoSuchElementException var69) {
            ConfigDiagnostic.missingValue(var49, var69);
        }

        var1.setLength(var8);
        var1.append('.');
        var1.append("new-cookie-interval");
        String var54 = var1.toString();
        Converter var55 = conv$21;

        try {
            Object var56 = var0.getValue(var54, var55);
            ((FormAuthConfig)var2).newCookieInterval = (Duration)var56;
        } catch (IllegalArgumentException var66) {
            ConfigDiagnostic.invalidValue(var54, var66);
        } catch (NoSuchElementException var67) {
            ConfigDiagnostic.missingValue(var54, var67);
        }

        var1.setLength(var8);
        var1.append('.');
        var1.append("cookie-name");
        String var59 = var1.toString();
        Converter var60 = conv$2;

        try {
            Object var61 = var0.getValue(var59, var60);
            ((FormAuthConfig)var2).cookieName = (String)var61;
        } catch (IllegalArgumentException var64) {
            ConfigDiagnostic.invalidValue(var59, var64);
        } catch (NoSuchElementException var65) {
            ConfigDiagnostic.missingValue(var59, var65);
        }

        var1.setLength(var8);
    }

    static void initGroup$io$quarkus$resteasy$runtime$JaxRsSecurityConfig(SmallRyeConfig var0, StringBuilder var1, Object var2) {
        int var8 = var1.length();
        var1.append('.');
        var1.append("deny-unannotated-endpoints");
        String var3 = var1.toString();
        Converter var4 = conv$8;

        try {
            Object var5 = var0.getValue(var3, var4);
            ((JaxRsSecurityConfig)var2).denyJaxRs = (Boolean)var5;
        } catch (IllegalArgumentException var9) {
            ConfigDiagnostic.invalidValue(var3, var9);
        } catch (NoSuchElementException var10) {
            ConfigDiagnostic.missingValue(var3, var10);
        }

        var1.setLength(var8);
    }

    static void initGroup$io$quarkus$runtime$ApplicationConfig(SmallRyeConfig var0, StringBuilder var1, Object var2) {
        int var8 = var1.length();
        var1.append('.');
        var1.append("name");
        String var3 = var1.toString();
        Converter var4 = conv$16;

        try {
            Object var5 = var0.getValue(var3, var4);
            ((ApplicationConfig)var2).name = (Optional)var5;
        } catch (IllegalArgumentException var16) {
            ConfigDiagnostic.invalidValue(var3, var16);
        } catch (NoSuchElementException var17) {
            ConfigDiagnostic.missingValue(var3, var17);
        }

        var1.setLength(var8);
        var1.append('.');
        var1.append("version");
        String var9 = var1.toString();
        Converter var10 = conv$16;

        try {
            Object var11 = var0.getValue(var9, var10);
            ((ApplicationConfig)var2).version = (Optional)var11;
        } catch (IllegalArgumentException var14) {
            ConfigDiagnostic.invalidValue(var9, var14);
        } catch (NoSuchElementException var15) {
            ConfigDiagnostic.missingValue(var9, var15);
        }

        var1.setLength(var8);
    }

    static void initGroup$io$quarkus$runtime$LiveReloadConfig(SmallRyeConfig var0, StringBuilder var1, Object var2) {
        int var8 = var1.length();
        var1.append('.');
        var1.append("watched-resources");
        String var3 = var1.toString();
        Converter var4 = conv$3;

        try {
            Object var5 = var0.getValue(var3, var4);
            ((LiveReloadConfig)var2).watchedResources = (Optional)var5;
        } catch (IllegalArgumentException var23) {
            ConfigDiagnostic.invalidValue(var3, var23);
        } catch (NoSuchElementException var24) {
            ConfigDiagnostic.missingValue(var3, var24);
        }

        var1.setLength(var8);
        var1.append('.');
        var1.append("password");
        String var9 = var1.toString();
        Converter var10 = conv$16;

        try {
            Object var11 = var0.getValue(var9, var10);
            ((LiveReloadConfig)var2).password = (Optional)var11;
        } catch (IllegalArgumentException var21) {
            ConfigDiagnostic.invalidValue(var9, var21);
        } catch (NoSuchElementException var22) {
            ConfigDiagnostic.missingValue(var9, var22);
        }

        var1.setLength(var8);
        var1.append('.');
        var1.append("url");
        String var14 = var1.toString();
        Converter var15 = conv$16;

        try {
            Object var16 = var0.getValue(var14, var15);
            ((LiveReloadConfig)var2).url = (Optional)var16;
        } catch (IllegalArgumentException var19) {
            ConfigDiagnostic.invalidValue(var14, var19);
        } catch (NoSuchElementException var20) {
            ConfigDiagnostic.missingValue(var14, var20);
        }

        var1.setLength(var8);
    }

    static void initGroup$io$quarkus$runtime$LocalesBuildTimeConfig(SmallRyeConfig var0, StringBuilder var1, Object var2) {
        int var8 = var1.length();
        var1.append('.');
        var1.append("locales");
        String var3 = var1.toString();
        Converter var4 = conv$23;

        try {
            Object var5 = var0.getValue(var3, var4);
            ((LocalesBuildTimeConfig)var2).locales = (Set)var5;
        } catch (IllegalArgumentException var16) {
            ConfigDiagnostic.invalidValue(var3, var16);
        } catch (NoSuchElementException var17) {
            ConfigDiagnostic.missingValue(var3, var17);
        }

        var1.setLength(var8);
        var1.append('.');
        var1.append("default-locale");
        String var9 = var1.toString();
        Converter var10 = conv$24;

        try {
            Object var11 = var0.getValue(var9, var10);
            ((LocalesBuildTimeConfig)var2).defaultLocale = (Locale)var11;
        } catch (IllegalArgumentException var14) {
            ConfigDiagnostic.invalidValue(var9, var14);
        } catch (NoSuchElementException var15) {
            ConfigDiagnostic.missingValue(var9, var15);
        }

        var1.setLength(var8);
    }

    static void initGroup$io$quarkus$runtime$TlsConfig(SmallRyeConfig var0, StringBuilder var1, Object var2) {
        int var8 = var1.length();
        var1.append('.');
        var1.append("trust-all");
        String var3 = var1.toString();
        Converter var4 = conv$8;

        try {
            Object var5 = var0.getValue(var3, var4);
            ((TlsConfig)var2).trustAll = (Boolean)var5;
        } catch (IllegalArgumentException var9) {
            ConfigDiagnostic.invalidValue(var3, var9);
        } catch (NoSuchElementException var10) {
            ConfigDiagnostic.missingValue(var3, var10);
        }

        var1.setLength(var8);
    }

    static void initGroup$io$quarkus$runtime$logging$LogBuildTimeConfig(SmallRyeConfig var0, StringBuilder var1, Object var2) {
        int var8 = var1.length();
        var1.append('.');
        var1.append("metrics.enabled");
        String var3 = var1.toString();
        Converter var4 = conv$8;

        try {
            Object var5 = var0.getValue(var3, var4);
            ((LogBuildTimeConfig)var2).metricsEnabled = (Boolean)var5;
        } catch (IllegalArgumentException var17) {
            ConfigDiagnostic.invalidValue(var3, var17);
        } catch (NoSuchElementException var18) {
            ConfigDiagnostic.missingValue(var3, var18);
        }

        var1.setLength(var8);
        var1.append('.');
        var1.append("min-level");
        String var9 = var1.toString();
        Converter var10 = conv$10;

        try {
            Object var11 = var0.getValue(var9, var10);
            ((LogBuildTimeConfig)var2).minLevel = (Level)var11;
        } catch (IllegalArgumentException var15) {
            ConfigDiagnostic.invalidValue(var9, var15);
        } catch (NoSuchElementException var16) {
            ConfigDiagnostic.missingValue(var9, var16);
        }

        var1.setLength(var8);
        var1.append('.');
        var1.append("category");
        TreeMap var14 = new TreeMap();
        ((LogBuildTimeConfig)var2).categories = (Map)var14;
        var1.setLength(var8);
    }

    static void initGroup$io$quarkus$vertx$core$runtime$config$VertxConfiguration(SmallRyeConfig var0, StringBuilder var1, Object var2) {
        int var8 = var1.length();
        var1.append('.');
        var1.append("caching");
        String var3 = var1.toString();
        Converter var4 = conv$8;

        try {
            Object var5 = var0.getValue(var3, var4);
            ((VertxConfiguration)var2).caching = (Boolean)var5;
        } catch (IllegalArgumentException var75) {
            ConfigDiagnostic.invalidValue(var3, var75);
        } catch (NoSuchElementException var76) {
            ConfigDiagnostic.missingValue(var3, var76);
        }

        var1.setLength(var8);
        var1.append('.');
        var1.append("classpath-resolving");
        String var9 = var1.toString();
        Converter var10 = conv$8;

        try {
            Object var11 = var0.getValue(var9, var10);
            ((VertxConfiguration)var2).classpathResolving = (Boolean)var11;
        } catch (IllegalArgumentException var73) {
            ConfigDiagnostic.invalidValue(var9, var73);
        } catch (NoSuchElementException var74) {
            ConfigDiagnostic.missingValue(var9, var74);
        }

        var1.setLength(var8);
        var1.append('.');
        var1.append("event-loops-pool-size");
        String var14 = var1.toString();
        Converter var15 = conv$25;

        try {
            Object var16 = var0.getValue(var14, var15);
            ((VertxConfiguration)var2).eventLoopsPoolSize = (OptionalInt)var16;
        } catch (IllegalArgumentException var71) {
            ConfigDiagnostic.invalidValue(var14, var71);
        } catch (NoSuchElementException var72) {
            ConfigDiagnostic.missingValue(var14, var72);
        }

        var1.setLength(var8);
        var1.append('.');
        var1.append("max-event-loop-execute-time");
        String var19 = var1.toString();
        Converter var20 = conv$21;

        try {
            Object var21 = var0.getValue(var19, var20);
            ((VertxConfiguration)var2).maxEventLoopExecuteTime = (Duration)var21;
        } catch (IllegalArgumentException var69) {
            ConfigDiagnostic.invalidValue(var19, var69);
        } catch (NoSuchElementException var70) {
            ConfigDiagnostic.missingValue(var19, var70);
        }

        var1.setLength(var8);
        var1.append('.');
        var1.append("warning-exception-time");
        String var24 = var1.toString();
        Converter var25 = conv$21;

        try {
            Object var26 = var0.getValue(var24, var25);
            ((VertxConfiguration)var2).warningExceptionTime = (Duration)var26;
        } catch (IllegalArgumentException var67) {
            ConfigDiagnostic.invalidValue(var24, var67);
        } catch (NoSuchElementException var68) {
            ConfigDiagnostic.missingValue(var24, var68);
        }

        var1.setLength(var8);
        var1.append('.');
        var1.append("worker-pool-size");
        String var29 = var1.toString();
        Converter var30 = conv$11;

        try {
            Object var31 = var0.getValue(var29, var30);
            ((VertxConfiguration)var2).workerPoolSize = (Integer)var31;
        } catch (IllegalArgumentException var65) {
            ConfigDiagnostic.invalidValue(var29, var65);
        } catch (NoSuchElementException var66) {
            ConfigDiagnostic.missingValue(var29, var66);
        }

        var1.setLength(var8);
        var1.append('.');
        var1.append("max-worker-execute-time");
        String var34 = var1.toString();
        Converter var35 = conv$21;

        try {
            Object var36 = var0.getValue(var34, var35);
            ((VertxConfiguration)var2).maxWorkerExecuteTime = (Duration)var36;
        } catch (IllegalArgumentException var63) {
            ConfigDiagnostic.invalidValue(var34, var63);
        } catch (NoSuchElementException var64) {
            ConfigDiagnostic.missingValue(var34, var64);
        }

        var1.setLength(var8);
        var1.append('.');
        var1.append("internal-blocking-pool-size");
        String var39 = var1.toString();
        Converter var40 = conv$11;

        try {
            Object var41 = var0.getValue(var39, var40);
            ((VertxConfiguration)var2).internalBlockingPoolSize = (Integer)var41;
        } catch (IllegalArgumentException var61) {
            ConfigDiagnostic.invalidValue(var39, var61);
        } catch (NoSuchElementException var62) {
            ConfigDiagnostic.missingValue(var39, var62);
        }

        var1.setLength(var8);
        var1.append('.');
        var1.append("use-async-dns");
        String var44 = var1.toString();
        Converter var45 = conv$8;

        try {
            Object var46 = var0.getValue(var44, var45);
            ((VertxConfiguration)var2).useAsyncDNS = (Boolean)var46;
        } catch (IllegalArgumentException var59) {
            ConfigDiagnostic.invalidValue(var44, var59);
        } catch (NoSuchElementException var60) {
            ConfigDiagnostic.missingValue(var44, var60);
        }

        var1.setLength(var8);
        var1.append('.');
        var1.append("eventbus");
        EventBusConfiguration var49 = new EventBusConfiguration();
        initGroup$io$quarkus$vertx$core$runtime$config$EventBusConfiguration(var0, var1, var49);
        ((VertxConfiguration)var2).eventbus = var49;
        var1.setLength(var8);
        var1.append('.');
        var1.append("cluster");
        ClusterConfiguration var50 = new ClusterConfiguration();
        initGroup$io$quarkus$vertx$core$runtime$config$ClusterConfiguration(var0, var1, var50);
        ((VertxConfiguration)var2).cluster = var50;
        var1.setLength(var8);
        var1.append('.');
        var1.append("resolver");
        AddressResolverConfiguration var51 = new AddressResolverConfiguration();
        initGroup$io$quarkus$vertx$core$runtime$config$AddressResolverConfiguration(var0, var1, var51);
        ((VertxConfiguration)var2).resolver = var51;
        var1.setLength(var8);
        var1.append('.');
        var1.append("prefer-native-transport");
        String var52 = var1.toString();
        Converter var53 = conv$8;

        try {
            Object var54 = var0.getValue(var52, var53);
            ((VertxConfiguration)var2).preferNativeTransport = (Boolean)var54;
        } catch (IllegalArgumentException var57) {
            ConfigDiagnostic.invalidValue(var52, var57);
        } catch (NoSuchElementException var58) {
            ConfigDiagnostic.missingValue(var52, var58);
        }

        var1.setLength(var8);
    }

    static void initGroup$io$quarkus$vertx$core$runtime$config$EventBusConfiguration(SmallRyeConfig var0, StringBuilder var1, Object var2) {
        int var4 = var1.length();
        var1.append('.');
        var1.append("key-certificate-pem");
        PemKeyCertConfiguration var3 = new PemKeyCertConfiguration();
        initGroup$io$quarkus$vertx$core$runtime$config$PemKeyCertConfiguration(var0, var1, var3);
        ((EventBusConfiguration)var2).keyCertificatePem = var3;
        var1.setLength(var4);
        var1.append('.');
        var1.append("key-certificate-jks");
        JksConfiguration var5 = new JksConfiguration();
        initGroup$io$quarkus$vertx$core$runtime$config$JksConfiguration(var0, var1, var5);
        ((EventBusConfiguration)var2).keyCertificateJks = var5;
        var1.setLength(var4);
        var1.append('.');
        var1.append("key-certificate-pfx");
        PfxConfiguration var6 = new PfxConfiguration();
        initGroup$io$quarkus$vertx$core$runtime$config$PfxConfiguration(var0, var1, var6);
        ((EventBusConfiguration)var2).keyCertificatePfx = var6;
        var1.setLength(var4);
        var1.append('.');
        var1.append("trust-certificate-pem");
        PemTrustCertConfiguration var7 = new PemTrustCertConfiguration();
        initGroup$io$quarkus$vertx$core$runtime$config$PemTrustCertConfiguration(var0, var1, var7);
        ((EventBusConfiguration)var2).trustCertificatePem = var7;
        var1.setLength(var4);
        var1.append('.');
        var1.append("trust-certificate-jks");
        JksConfiguration var8 = new JksConfiguration();
        initGroup$io$quarkus$vertx$core$runtime$config$JksConfiguration(var0, var1, var8);
        ((EventBusConfiguration)var2).trustCertificateJks = var8;
        var1.setLength(var4);
        var1.append('.');
        var1.append("trust-certificate-pfx");
        PfxConfiguration var9 = new PfxConfiguration();
        initGroup$io$quarkus$vertx$core$runtime$config$PfxConfiguration(var0, var1, var9);
        ((EventBusConfiguration)var2).trustCertificatePfx = var9;
        var1.setLength(var4);
        var1.append('.');
        var1.append("accept-backlog");
        String var10 = var1.toString();
        Converter var11 = conv$25;

        try {
            Object var12 = var0.getValue(var10, var11);
            ((EventBusConfiguration)var2).acceptBacklog = (OptionalInt)var12;
        } catch (IllegalArgumentException var120) {
            ConfigDiagnostic.invalidValue(var10, var120);
        } catch (NoSuchElementException var121) {
            ConfigDiagnostic.missingValue(var10, var121);
        }

        var1.setLength(var4);
        var1.append('.');
        var1.append("client-auth");
        String var15 = var1.toString();
        Converter var16 = conv$2;

        try {
            Object var17 = var0.getValue(var15, var16);
            ((EventBusConfiguration)var2).clientAuth = (String)var17;
        } catch (IllegalArgumentException var118) {
            ConfigDiagnostic.invalidValue(var15, var118);
        } catch (NoSuchElementException var119) {
            ConfigDiagnostic.missingValue(var15, var119);
        }

        var1.setLength(var4);
        var1.append('.');
        var1.append("connect-timeout");
        String var20 = var1.toString();
        Converter var21 = conv$21;

        try {
            Object var22 = var0.getValue(var20, var21);
            ((EventBusConfiguration)var2).connectTimeout = (Duration)var22;
        } catch (IllegalArgumentException var116) {
            ConfigDiagnostic.invalidValue(var20, var116);
        } catch (NoSuchElementException var117) {
            ConfigDiagnostic.missingValue(var20, var117);
        }

        var1.setLength(var4);
        var1.append('.');
        var1.append("idle-timeout");
        String var25 = var1.toString();
        Converter var26 = conv$26;

        try {
            Object var27 = var0.getValue(var25, var26);
            ((EventBusConfiguration)var2).idleTimeout = (Optional)var27;
        } catch (IllegalArgumentException var114) {
            ConfigDiagnostic.invalidValue(var25, var114);
        } catch (NoSuchElementException var115) {
            ConfigDiagnostic.missingValue(var25, var115);
        }

        var1.setLength(var4);
        var1.append('.');
        var1.append("receive-buffer-size");
        String var30 = var1.toString();
        Converter var31 = conv$25;

        try {
            Object var32 = var0.getValue(var30, var31);
            ((EventBusConfiguration)var2).receiveBufferSize = (OptionalInt)var32;
        } catch (IllegalArgumentException var112) {
            ConfigDiagnostic.invalidValue(var30, var112);
        } catch (NoSuchElementException var113) {
            ConfigDiagnostic.missingValue(var30, var113);
        }

        var1.setLength(var4);
        var1.append('.');
        var1.append("reconnect-attempts");
        String var35 = var1.toString();
        Converter var36 = conv$11;

        try {
            Object var37 = var0.getValue(var35, var36);
            ((EventBusConfiguration)var2).reconnectAttempts = (Integer)var37;
        } catch (IllegalArgumentException var110) {
            ConfigDiagnostic.invalidValue(var35, var110);
        } catch (NoSuchElementException var111) {
            ConfigDiagnostic.missingValue(var35, var111);
        }

        var1.setLength(var4);
        var1.append('.');
        var1.append("reconnect-interval");
        String var40 = var1.toString();
        Converter var41 = conv$21;

        try {
            Object var42 = var0.getValue(var40, var41);
            ((EventBusConfiguration)var2).reconnectInterval = (Duration)var42;
        } catch (IllegalArgumentException var108) {
            ConfigDiagnostic.invalidValue(var40, var108);
        } catch (NoSuchElementException var109) {
            ConfigDiagnostic.missingValue(var40, var109);
        }

        var1.setLength(var4);
        var1.append('.');
        var1.append("reuse-address");
        String var45 = var1.toString();
        Converter var46 = conv$8;

        try {
            Object var47 = var0.getValue(var45, var46);
            ((EventBusConfiguration)var2).reuseAddress = (Boolean)var47;
        } catch (IllegalArgumentException var106) {
            ConfigDiagnostic.invalidValue(var45, var106);
        } catch (NoSuchElementException var107) {
            ConfigDiagnostic.missingValue(var45, var107);
        }

        var1.setLength(var4);
        var1.append('.');
        var1.append("reuse-port");
        String var50 = var1.toString();
        Converter var51 = conv$8;

        try {
            Object var52 = var0.getValue(var50, var51);
            ((EventBusConfiguration)var2).reusePort = (Boolean)var52;
        } catch (IllegalArgumentException var104) {
            ConfigDiagnostic.invalidValue(var50, var104);
        } catch (NoSuchElementException var105) {
            ConfigDiagnostic.missingValue(var50, var105);
        }

        var1.setLength(var4);
        var1.append('.');
        var1.append("send-buffer-size");
        String var55 = var1.toString();
        Converter var56 = conv$25;

        try {
            Object var57 = var0.getValue(var55, var56);
            ((EventBusConfiguration)var2).sendBufferSize = (OptionalInt)var57;
        } catch (IllegalArgumentException var102) {
            ConfigDiagnostic.invalidValue(var55, var102);
        } catch (NoSuchElementException var103) {
            ConfigDiagnostic.missingValue(var55, var103);
        }

        var1.setLength(var4);
        var1.append('.');
        var1.append("soLinger");
        String var60 = var1.toString();
        Converter var61 = conv$25;

        try {
            Object var62 = var0.getValue(var60, var61);
            ((EventBusConfiguration)var2).soLinger = (OptionalInt)var62;
        } catch (IllegalArgumentException var100) {
            ConfigDiagnostic.invalidValue(var60, var100);
        } catch (NoSuchElementException var101) {
            ConfigDiagnostic.missingValue(var60, var101);
        }

        var1.setLength(var4);
        var1.append('.');
        var1.append("ssl");
        String var65 = var1.toString();
        Converter var66 = conv$8;

        try {
            Object var67 = var0.getValue(var65, var66);
            ((EventBusConfiguration)var2).ssl = (Boolean)var67;
        } catch (IllegalArgumentException var98) {
            ConfigDiagnostic.invalidValue(var65, var98);
        } catch (NoSuchElementException var99) {
            ConfigDiagnostic.missingValue(var65, var99);
        }

        var1.setLength(var4);
        var1.append('.');
        var1.append("tcp-keep-alive");
        String var70 = var1.toString();
        Converter var71 = conv$8;

        try {
            Object var72 = var0.getValue(var70, var71);
            ((EventBusConfiguration)var2).tcpKeepAlive = (Boolean)var72;
        } catch (IllegalArgumentException var96) {
            ConfigDiagnostic.invalidValue(var70, var96);
        } catch (NoSuchElementException var97) {
            ConfigDiagnostic.missingValue(var70, var97);
        }

        var1.setLength(var4);
        var1.append('.');
        var1.append("tcp-no-delay");
        String var75 = var1.toString();
        Converter var76 = conv$8;

        try {
            Object var77 = var0.getValue(var75, var76);
            ((EventBusConfiguration)var2).tcpNoDelay = (Boolean)var77;
        } catch (IllegalArgumentException var94) {
            ConfigDiagnostic.invalidValue(var75, var94);
        } catch (NoSuchElementException var95) {
            ConfigDiagnostic.missingValue(var75, var95);
        }

        var1.setLength(var4);
        var1.append('.');
        var1.append("traffic-class");
        String var80 = var1.toString();
        Converter var81 = conv$25;

        try {
            Object var82 = var0.getValue(var80, var81);
            ((EventBusConfiguration)var2).trafficClass = (OptionalInt)var82;
        } catch (IllegalArgumentException var92) {
            ConfigDiagnostic.invalidValue(var80, var92);
        } catch (NoSuchElementException var93) {
            ConfigDiagnostic.missingValue(var80, var93);
        }

        var1.setLength(var4);
        var1.append('.');
        var1.append("trust-all");
        String var85 = var1.toString();
        Converter var86 = conv$8;

        try {
            Object var87 = var0.getValue(var85, var86);
            ((EventBusConfiguration)var2).trustAll = (Boolean)var87;
        } catch (IllegalArgumentException var90) {
            ConfigDiagnostic.invalidValue(var85, var90);
        } catch (NoSuchElementException var91) {
            ConfigDiagnostic.missingValue(var85, var91);
        }

        var1.setLength(var4);
    }

    static void initGroup$io$quarkus$vertx$core$runtime$config$PemKeyCertConfiguration(SmallRyeConfig var0, StringBuilder var1, Object var2) {
        int var13 = var1.length();
        String var3 = var1.toString();
        Converter var4 = conv$8;

        try {
            Object var5 = var0.getValue(var3, var4);
            ((PemKeyCertConfiguration)var2).enabled = (Boolean)var5;
        } catch (IllegalArgumentException var23) {
            ConfigDiagnostic.invalidValue(var3, var23);
        } catch (NoSuchElementException var24) {
            ConfigDiagnostic.missingValue(var3, var24);
        }

        var1.append('.');
        var1.append("keys");
        String var8 = var1.toString();
        Converter var9 = conv$3;

        try {
            Object var10 = var0.getValue(var8, var9);
            ((PemKeyCertConfiguration)var2).keys = (Optional)var10;
        } catch (IllegalArgumentException var21) {
            ConfigDiagnostic.invalidValue(var8, var21);
        } catch (NoSuchElementException var22) {
            ConfigDiagnostic.missingValue(var8, var22);
        }

        var1.setLength(var13);
        var1.append('.');
        var1.append("certs");
        String var14 = var1.toString();
        Converter var15 = conv$3;

        try {
            Object var16 = var0.getValue(var14, var15);
            ((PemKeyCertConfiguration)var2).certs = (Optional)var16;
        } catch (IllegalArgumentException var19) {
            ConfigDiagnostic.invalidValue(var14, var19);
        } catch (NoSuchElementException var20) {
            ConfigDiagnostic.missingValue(var14, var20);
        }

        var1.setLength(var13);
    }

    static void initGroup$io$quarkus$vertx$core$runtime$config$JksConfiguration(SmallRyeConfig var0, StringBuilder var1, Object var2) {
        int var13 = var1.length();
        String var3 = var1.toString();
        Converter var4 = conv$8;

        try {
            Object var5 = var0.getValue(var3, var4);
            ((JksConfiguration)var2).enabled = (Boolean)var5;
        } catch (IllegalArgumentException var23) {
            ConfigDiagnostic.invalidValue(var3, var23);
        } catch (NoSuchElementException var24) {
            ConfigDiagnostic.missingValue(var3, var24);
        }

        var1.append('.');
        var1.append("path");
        String var8 = var1.toString();
        Converter var9 = conv$16;

        try {
            Object var10 = var0.getValue(var8, var9);
            ((JksConfiguration)var2).path = (Optional)var10;
        } catch (IllegalArgumentException var21) {
            ConfigDiagnostic.invalidValue(var8, var21);
        } catch (NoSuchElementException var22) {
            ConfigDiagnostic.missingValue(var8, var22);
        }

        var1.setLength(var13);
        var1.append('.');
        var1.append("password");
        String var14 = var1.toString();
        Converter var15 = conv$16;

        try {
            Object var16 = var0.getValue(var14, var15);
            ((JksConfiguration)var2).password = (Optional)var16;
        } catch (IllegalArgumentException var19) {
            ConfigDiagnostic.invalidValue(var14, var19);
        } catch (NoSuchElementException var20) {
            ConfigDiagnostic.missingValue(var14, var20);
        }

        var1.setLength(var13);
    }

    static void initGroup$io$quarkus$vertx$core$runtime$config$PfxConfiguration(SmallRyeConfig var0, StringBuilder var1, Object var2) {
        int var13 = var1.length();
        String var3 = var1.toString();
        Converter var4 = conv$8;

        try {
            Object var5 = var0.getValue(var3, var4);
            ((PfxConfiguration)var2).enabled = (Boolean)var5;
        } catch (IllegalArgumentException var23) {
            ConfigDiagnostic.invalidValue(var3, var23);
        } catch (NoSuchElementException var24) {
            ConfigDiagnostic.missingValue(var3, var24);
        }

        var1.append('.');
        var1.append("path");
        String var8 = var1.toString();
        Converter var9 = conv$16;

        try {
            Object var10 = var0.getValue(var8, var9);
            ((PfxConfiguration)var2).path = (Optional)var10;
        } catch (IllegalArgumentException var21) {
            ConfigDiagnostic.invalidValue(var8, var21);
        } catch (NoSuchElementException var22) {
            ConfigDiagnostic.missingValue(var8, var22);
        }

        var1.setLength(var13);
        var1.append('.');
        var1.append("password");
        String var14 = var1.toString();
        Converter var15 = conv$16;

        try {
            Object var16 = var0.getValue(var14, var15);
            ((PfxConfiguration)var2).password = (Optional)var16;
        } catch (IllegalArgumentException var19) {
            ConfigDiagnostic.invalidValue(var14, var19);
        } catch (NoSuchElementException var20) {
            ConfigDiagnostic.missingValue(var14, var20);
        }

        var1.setLength(var13);
    }

    static void initGroup$io$quarkus$vertx$core$runtime$config$PemTrustCertConfiguration(SmallRyeConfig var0, StringBuilder var1, Object var2) {
        int var13 = var1.length();
        String var3 = var1.toString();
        Converter var4 = conv$8;

        try {
            Object var5 = var0.getValue(var3, var4);
            ((PemTrustCertConfiguration)var2).enabled = (Boolean)var5;
        } catch (IllegalArgumentException var16) {
            ConfigDiagnostic.invalidValue(var3, var16);
        } catch (NoSuchElementException var17) {
            ConfigDiagnostic.missingValue(var3, var17);
        }

        var1.append('.');
        var1.append("certs");
        String var8 = var1.toString();
        Converter var9 = conv$3;

        try {
            Object var10 = var0.getValue(var8, var9);
            ((PemTrustCertConfiguration)var2).certs = (Optional)var10;
        } catch (IllegalArgumentException var14) {
            ConfigDiagnostic.invalidValue(var8, var14);
        } catch (NoSuchElementException var15) {
            ConfigDiagnostic.missingValue(var8, var15);
        }

        var1.setLength(var13);
    }

    static void initGroup$io$quarkus$vertx$core$runtime$config$ClusterConfiguration(SmallRyeConfig var0, StringBuilder var1, Object var2) {
        int var8 = var1.length();
        var1.append('.');
        var1.append("host");
        String var3 = var1.toString();
        Converter var4 = conv$2;

        try {
            Object var5 = var0.getValue(var3, var4);
            ((ClusterConfiguration)var2).host = (String)var5;
        } catch (IllegalArgumentException var51) {
            ConfigDiagnostic.invalidValue(var3, var51);
        } catch (NoSuchElementException var52) {
            ConfigDiagnostic.missingValue(var3, var52);
        }

        var1.setLength(var8);
        var1.append('.');
        var1.append("port");
        String var9 = var1.toString();
        Converter var10 = conv$25;

        try {
            Object var11 = var0.getValue(var9, var10);
            ((ClusterConfiguration)var2).port = (OptionalInt)var11;
        } catch (IllegalArgumentException var49) {
            ConfigDiagnostic.invalidValue(var9, var49);
        } catch (NoSuchElementException var50) {
            ConfigDiagnostic.missingValue(var9, var50);
        }

        var1.setLength(var8);
        var1.append('.');
        var1.append("public-host");
        String var14 = var1.toString();
        Converter var15 = conv$16;

        try {
            Object var16 = var0.getValue(var14, var15);
            ((ClusterConfiguration)var2).publicHost = (Optional)var16;
        } catch (IllegalArgumentException var47) {
            ConfigDiagnostic.invalidValue(var14, var47);
        } catch (NoSuchElementException var48) {
            ConfigDiagnostic.missingValue(var14, var48);
        }

        var1.setLength(var8);
        var1.append('.');
        var1.append("public-port");
        String var19 = var1.toString();
        Converter var20 = conv$25;

        try {
            Object var21 = var0.getValue(var19, var20);
            ((ClusterConfiguration)var2).publicPort = (OptionalInt)var21;
        } catch (IllegalArgumentException var45) {
            ConfigDiagnostic.invalidValue(var19, var45);
        } catch (NoSuchElementException var46) {
            ConfigDiagnostic.missingValue(var19, var46);
        }

        var1.setLength(var8);
        var1.append('.');
        var1.append("clustered");
        String var24 = var1.toString();
        Converter var25 = conv$8;

        try {
            Object var26 = var0.getValue(var24, var25);
            ((ClusterConfiguration)var2).clustered = (Boolean)var26;
        } catch (IllegalArgumentException var43) {
            ConfigDiagnostic.invalidValue(var24, var43);
        } catch (NoSuchElementException var44) {
            ConfigDiagnostic.missingValue(var24, var44);
        }

        var1.setLength(var8);
        var1.append('.');
        var1.append("ping-interval");
        String var29 = var1.toString();
        Converter var30 = conv$21;

        try {
            Object var31 = var0.getValue(var29, var30);
            ((ClusterConfiguration)var2).pingInterval = (Duration)var31;
        } catch (IllegalArgumentException var41) {
            ConfigDiagnostic.invalidValue(var29, var41);
        } catch (NoSuchElementException var42) {
            ConfigDiagnostic.missingValue(var29, var42);
        }

        var1.setLength(var8);
        var1.append('.');
        var1.append("ping-reply-interval");
        String var34 = var1.toString();
        Converter var35 = conv$21;

        try {
            Object var36 = var0.getValue(var34, var35);
            ((ClusterConfiguration)var2).pingReplyInterval = (Duration)var36;
        } catch (IllegalArgumentException var39) {
            ConfigDiagnostic.invalidValue(var34, var39);
        } catch (NoSuchElementException var40) {
            ConfigDiagnostic.missingValue(var34, var40);
        }

        var1.setLength(var8);
    }

    static void initGroup$io$quarkus$vertx$core$runtime$config$AddressResolverConfiguration(SmallRyeConfig var0, StringBuilder var1, Object var2) {
        int var8 = var1.length();
        var1.append('.');
        var1.append("cache-max-time-to-live");
        String var3 = var1.toString();
        Converter var4 = conv$11;

        try {
            Object var5 = var0.getValue(var3, var4);
            ((AddressResolverConfiguration)var2).cacheMaxTimeToLive = (Integer)var5;
        } catch (IllegalArgumentException var23) {
            ConfigDiagnostic.invalidValue(var3, var23);
        } catch (NoSuchElementException var24) {
            ConfigDiagnostic.missingValue(var3, var24);
        }

        var1.setLength(var8);
        var1.append('.');
        var1.append("cache-min-time-to-live");
        String var9 = var1.toString();
        Converter var10 = conv$11;

        try {
            Object var11 = var0.getValue(var9, var10);
            ((AddressResolverConfiguration)var2).cacheMinTimeToLive = (Integer)var11;
        } catch (IllegalArgumentException var21) {
            ConfigDiagnostic.invalidValue(var9, var21);
        } catch (NoSuchElementException var22) {
            ConfigDiagnostic.missingValue(var9, var22);
        }

        var1.setLength(var8);
        var1.append('.');
        var1.append("cache-negative-time-to-live");
        String var14 = var1.toString();
        Converter var15 = conv$11;

        try {
            Object var16 = var0.getValue(var14, var15);
            ((AddressResolverConfiguration)var2).cacheNegativeTimeToLive = (Integer)var16;
        } catch (IllegalArgumentException var19) {
            ConfigDiagnostic.invalidValue(var14, var19);
        } catch (NoSuchElementException var20) {
            ConfigDiagnostic.missingValue(var14, var20);
        }

        var1.setLength(var8);
    }

    static void initGroup$io$quarkus$vertx$http$runtime$HttpConfiguration(SmallRyeConfig var0, StringBuilder var1, Object var2) {
        int var8 = var1.length();
        var1.append('.');
        var1.append("cors");
        String var3 = var1.toString();
        Converter var4 = conv$8;

        try {
            Object var5 = var0.getValue(var3, var4);
            ((HttpConfiguration)var2).corsEnabled = (Boolean)var5;
        } catch (IllegalArgumentException var170) {
            ConfigDiagnostic.invalidValue(var3, var170);
        } catch (NoSuchElementException var171) {
            ConfigDiagnostic.missingValue(var3, var171);
        }

        var1.setLength(var8);
        var1.append('.');
        var1.append("port");
        String var9 = var1.toString();
        Converter var10 = conv$11;

        try {
            Object var11 = var0.getValue(var9, var10);
            ((HttpConfiguration)var2).port = (Integer)var11;
        } catch (IllegalArgumentException var168) {
            ConfigDiagnostic.invalidValue(var9, var168);
        } catch (NoSuchElementException var169) {
            ConfigDiagnostic.missingValue(var9, var169);
        }

        var1.setLength(var8);
        var1.append('.');
        var1.append("test-port");
        String var14 = var1.toString();
        Converter var15 = conv$11;

        try {
            Object var16 = var0.getValue(var14, var15);
            ((HttpConfiguration)var2).testPort = (Integer)var16;
        } catch (IllegalArgumentException var166) {
            ConfigDiagnostic.invalidValue(var14, var166);
        } catch (NoSuchElementException var167) {
            ConfigDiagnostic.missingValue(var14, var167);
        }

        var1.setLength(var8);
        var1.append('.');
        var1.append("host");
        String var19 = var1.toString();
        Converter var20 = conv$2;

        try {
            Object var21 = var0.getValue(var19, var20);
            ((HttpConfiguration)var2).host = (String)var21;
        } catch (IllegalArgumentException var164) {
            ConfigDiagnostic.invalidValue(var19, var164);
        } catch (NoSuchElementException var165) {
            ConfigDiagnostic.missingValue(var19, var165);
        }

        var1.setLength(var8);
        var1.append('.');
        var1.append("host-enabled");
        String var24 = var1.toString();
        Converter var25 = conv$8;

        try {
            Object var26 = var0.getValue(var24, var25);
            ((HttpConfiguration)var2).hostEnabled = (Boolean)var26;
        } catch (IllegalArgumentException var162) {
            ConfigDiagnostic.invalidValue(var24, var162);
        } catch (NoSuchElementException var163) {
            ConfigDiagnostic.missingValue(var24, var163);
        }

        var1.setLength(var8);
        var1.append('.');
        var1.append("ssl-port");
        String var29 = var1.toString();
        Converter var30 = conv$11;

        try {
            Object var31 = var0.getValue(var29, var30);
            ((HttpConfiguration)var2).sslPort = (Integer)var31;
        } catch (IllegalArgumentException var160) {
            ConfigDiagnostic.invalidValue(var29, var160);
        } catch (NoSuchElementException var161) {
            ConfigDiagnostic.missingValue(var29, var161);
        }

        var1.setLength(var8);
        var1.append('.');
        var1.append("test-ssl-port");
        String var34 = var1.toString();
        Converter var35 = conv$11;

        try {
            Object var36 = var0.getValue(var34, var35);
            ((HttpConfiguration)var2).testSslPort = (Integer)var36;
        } catch (IllegalArgumentException var158) {
            ConfigDiagnostic.invalidValue(var34, var158);
        } catch (NoSuchElementException var159) {
            ConfigDiagnostic.missingValue(var34, var159);
        }

        var1.setLength(var8);
        var1.append('.');
        var1.append("proxy-address-forwarding");
        String var39 = var1.toString();
        Converter var40 = conv$0;

        try {
            Object var41 = var0.getValue(var39, var40);
            ((HttpConfiguration)var2).proxyAddressForwarding = (Optional)var41;
        } catch (IllegalArgumentException var156) {
            ConfigDiagnostic.invalidValue(var39, var156);
        } catch (NoSuchElementException var157) {
            ConfigDiagnostic.missingValue(var39, var157);
        }

        var1.setLength(var8);
        var1.append('.');
        var1.append("allow-forwarded");
        String var44 = var1.toString();
        Converter var45 = conv$0;

        try {
            Object var46 = var0.getValue(var44, var45);
            ((HttpConfiguration)var2).allowForwarded = (Optional)var46;
        } catch (IllegalArgumentException var154) {
            ConfigDiagnostic.invalidValue(var44, var154);
        } catch (NoSuchElementException var155) {
            ConfigDiagnostic.missingValue(var44, var155);
        }

        var1.setLength(var8);
        var1.append('.');
        var1.append("insecure-requests");
        String var49 = var1.toString();
        Converter var50 = conv$27;

        try {
            Object var51 = var0.getValue(var49, var50);
            ((HttpConfiguration)var2).insecureRequests = (InsecureRequests)var51;
        } catch (IllegalArgumentException var152) {
            ConfigDiagnostic.invalidValue(var49, var152);
        } catch (NoSuchElementException var153) {
            ConfigDiagnostic.missingValue(var49, var153);
        }

        var1.setLength(var8);
        var1.append('.');
        var1.append("http2");
        String var54 = var1.toString();
        Converter var55 = conv$8;

        try {
            Object var56 = var0.getValue(var54, var55);
            ((HttpConfiguration)var2).http2 = (Boolean)var56;
        } catch (IllegalArgumentException var150) {
            ConfigDiagnostic.invalidValue(var54, var150);
        } catch (NoSuchElementException var151) {
            ConfigDiagnostic.missingValue(var54, var151);
        }

        var1.setLength(var8);
        var1.append('.');
        var1.append("cors");
        CORSConfig var59 = new CORSConfig();
        initGroup$io$quarkus$vertx$http$runtime$cors$CORSConfig(var0, var1, var59);
        ((HttpConfiguration)var2).cors = var59;
        var1.setLength(var8);
        var1.append('.');
        var1.append("ssl");
        ServerSslConfig var60 = new ServerSslConfig();
        initGroup$io$quarkus$vertx$http$runtime$ServerSslConfig(var0, var1, var60);
        ((HttpConfiguration)var2).ssl = var60;
        var1.setLength(var8);
        var1.append('.');
        var1.append("io-threads");
        String var61 = var1.toString();
        Converter var62 = conv$25;

        try {
            Object var63 = var0.getValue(var61, var62);
            ((HttpConfiguration)var2).ioThreads = (OptionalInt)var63;
        } catch (IllegalArgumentException var148) {
            ConfigDiagnostic.invalidValue(var61, var148);
        } catch (NoSuchElementException var149) {
            ConfigDiagnostic.missingValue(var61, var149);
        }

        var1.setLength(var8);
        var1.append('.');
        var1.append("limits");
        ServerLimitsConfig var66 = new ServerLimitsConfig();
        initGroup$io$quarkus$vertx$http$runtime$ServerLimitsConfig(var0, var1, var66);
        ((HttpConfiguration)var2).limits = var66;
        var1.setLength(var8);
        var1.append('.');
        var1.append("idle-timeout");
        String var67 = var1.toString();
        Converter var68 = conv$21;

        try {
            Object var69 = var0.getValue(var67, var68);
            ((HttpConfiguration)var2).idleTimeout = (Duration)var69;
        } catch (IllegalArgumentException var146) {
            ConfigDiagnostic.invalidValue(var67, var146);
        } catch (NoSuchElementException var147) {
            ConfigDiagnostic.missingValue(var67, var147);
        }

        var1.setLength(var8);
        var1.append('.');
        var1.append("read-timeout");
        String var72 = var1.toString();
        Converter var73 = conv$21;

        try {
            Object var74 = var0.getValue(var72, var73);
            ((HttpConfiguration)var2).readTimeout = (Duration)var74;
        } catch (IllegalArgumentException var144) {
            ConfigDiagnostic.invalidValue(var72, var144);
        } catch (NoSuchElementException var145) {
            ConfigDiagnostic.missingValue(var72, var145);
        }

        var1.setLength(var8);
        var1.append('.');
        var1.append("body");
        BodyConfig var77 = new BodyConfig();
        initGroup$io$quarkus$vertx$http$runtime$BodyConfig(var0, var1, var77);
        ((HttpConfiguration)var2).body = var77;
        var1.setLength(var8);
        var1.append('.');
        var1.append("auth.session.encryption-key");
        String var78 = var1.toString();
        Converter var79 = conv$16;

        try {
            Object var80 = var0.getValue(var78, var79);
            ((HttpConfiguration)var2).encryptionKey = (Optional)var80;
        } catch (IllegalArgumentException var142) {
            ConfigDiagnostic.invalidValue(var78, var142);
        } catch (NoSuchElementException var143) {
            ConfigDiagnostic.missingValue(var78, var143);
        }

        var1.setLength(var8);
        var1.append('.');
        var1.append("so-reuse-port");
        String var83 = var1.toString();
        Converter var84 = conv$8;

        try {
            Object var85 = var0.getValue(var83, var84);
            ((HttpConfiguration)var2).soReusePort = (Boolean)var85;
        } catch (IllegalArgumentException var140) {
            ConfigDiagnostic.invalidValue(var83, var140);
        } catch (NoSuchElementException var141) {
            ConfigDiagnostic.missingValue(var83, var141);
        }

        var1.setLength(var8);
        var1.append('.');
        var1.append("tcp-quick-ack");
        String var88 = var1.toString();
        Converter var89 = conv$8;

        try {
            Object var90 = var0.getValue(var88, var89);
            ((HttpConfiguration)var2).tcpQuickAck = (Boolean)var90;
        } catch (IllegalArgumentException var138) {
            ConfigDiagnostic.invalidValue(var88, var138);
        } catch (NoSuchElementException var139) {
            ConfigDiagnostic.missingValue(var88, var139);
        }

        var1.setLength(var8);
        var1.append('.');
        var1.append("tcp-cork");
        String var93 = var1.toString();
        Converter var94 = conv$8;

        try {
            Object var95 = var0.getValue(var93, var94);
            ((HttpConfiguration)var2).tcpCork = (Boolean)var95;
        } catch (IllegalArgumentException var136) {
            ConfigDiagnostic.invalidValue(var93, var136);
        } catch (NoSuchElementException var137) {
            ConfigDiagnostic.missingValue(var93, var137);
        }

        var1.setLength(var8);
        var1.append('.');
        var1.append("tcp-fast-open");
        String var98 = var1.toString();
        Converter var99 = conv$8;

        try {
            Object var100 = var0.getValue(var98, var99);
            ((HttpConfiguration)var2).tcpFastOpen = (Boolean)var100;
        } catch (IllegalArgumentException var134) {
            ConfigDiagnostic.invalidValue(var98, var134);
        } catch (NoSuchElementException var135) {
            ConfigDiagnostic.missingValue(var98, var135);
        }

        var1.setLength(var8);
        var1.append('.');
        var1.append("domain-socket");
        String var103 = var1.toString();
        Converter var104 = conv$2;

        try {
            Object var105 = var0.getValue(var103, var104);
            ((HttpConfiguration)var2).domainSocket = (String)var105;
        } catch (IllegalArgumentException var132) {
            ConfigDiagnostic.invalidValue(var103, var132);
        } catch (NoSuchElementException var133) {
            ConfigDiagnostic.missingValue(var103, var133);
        }

        var1.setLength(var8);
        var1.append('.');
        var1.append("domain-socket-enabled");
        String var108 = var1.toString();
        Converter var109 = conv$8;

        try {
            Object var110 = var0.getValue(var108, var109);
            ((HttpConfiguration)var2).domainSocketEnabled = (Boolean)var110;
        } catch (IllegalArgumentException var130) {
            ConfigDiagnostic.invalidValue(var108, var130);
        } catch (NoSuchElementException var131) {
            ConfigDiagnostic.missingValue(var108, var131);
        }

        var1.setLength(var8);
        var1.append('.');
        var1.append("record-request-start-time");
        String var113 = var1.toString();
        Converter var114 = conv$8;

        try {
            Object var115 = var0.getValue(var113, var114);
            ((HttpConfiguration)var2).recordRequestStartTime = (Boolean)var115;
        } catch (IllegalArgumentException var128) {
            ConfigDiagnostic.invalidValue(var113, var128);
        } catch (NoSuchElementException var129) {
            ConfigDiagnostic.missingValue(var113, var129);
        }

        var1.setLength(var8);
        var1.append('.');
        var1.append("access-log");
        AccessLogConfig var118 = new AccessLogConfig();
        initGroup$io$quarkus$vertx$http$runtime$AccessLogConfig(var0, var1, var118);
        io.quarkus.vertx.http.runtime.HttpConfiguration..accessor.set_accessLog(var2, var118);
        var1.setLength(var8);
        var1.append('.');
        var1.append("same-site-cookie");
        TreeMap var119 = new TreeMap();
        ((HttpConfiguration)var2).sameSiteCookie = (Map)var119;
        var1.setLength(var8);
        var1.append('.');
        var1.append("enable-compression");
        String var120 = var1.toString();
        Converter var121 = conv$8;

        try {
            Object var122 = var0.getValue(var120, var121);
            ((HttpConfiguration)var2).enableCompression = (Boolean)var122;
        } catch (IllegalArgumentException var126) {
            ConfigDiagnostic.invalidValue(var120, var126);
        } catch (NoSuchElementException var127) {
            ConfigDiagnostic.missingValue(var120, var127);
        }

        var1.setLength(var8);
        var1.append('.');
        var1.append("proxy");
        ProxyConfig var125 = new ProxyConfig();
        initGroup$io$quarkus$vertx$http$runtime$ProxyConfig(var0, var1, var125);
        ((HttpConfiguration)var2).proxy = var125;
        var1.setLength(var8);
    }

    static void initGroup$io$quarkus$vertx$http$runtime$cors$CORSConfig(SmallRyeConfig var0, StringBuilder var1, Object var2) {
        int var8 = var1.length();
        var1.append('.');
        var1.append("origins");
        String var3 = var1.toString();
        Converter var4 = conv$28;

        try {
            Object var5 = var0.getValue(var3, var4);
            ((CORSConfig)var2).origins = (Optional)var5;
        } catch (IllegalArgumentException var44) {
            ConfigDiagnostic.invalidValue(var3, var44);
        } catch (NoSuchElementException var45) {
            ConfigDiagnostic.missingValue(var3, var45);
        }

        var1.setLength(var8);
        var1.append('.');
        var1.append("methods");
        String var9 = var1.toString();
        Converter var10 = conv$28;

        try {
            Object var11 = var0.getValue(var9, var10);
            ((CORSConfig)var2).methods = (Optional)var11;
        } catch (IllegalArgumentException var42) {
            ConfigDiagnostic.invalidValue(var9, var42);
        } catch (NoSuchElementException var43) {
            ConfigDiagnostic.missingValue(var9, var43);
        }

        var1.setLength(var8);
        var1.append('.');
        var1.append("headers");
        String var14 = var1.toString();
        Converter var15 = conv$28;

        try {
            Object var16 = var0.getValue(var14, var15);
            ((CORSConfig)var2).headers = (Optional)var16;
        } catch (IllegalArgumentException var40) {
            ConfigDiagnostic.invalidValue(var14, var40);
        } catch (NoSuchElementException var41) {
            ConfigDiagnostic.missingValue(var14, var41);
        }

        var1.setLength(var8);
        var1.append('.');
        var1.append("exposed-headers");
        String var19 = var1.toString();
        Converter var20 = conv$28;

        try {
            Object var21 = var0.getValue(var19, var20);
            ((CORSConfig)var2).exposedHeaders = (Optional)var21;
        } catch (IllegalArgumentException var38) {
            ConfigDiagnostic.invalidValue(var19, var38);
        } catch (NoSuchElementException var39) {
            ConfigDiagnostic.missingValue(var19, var39);
        }

        var1.setLength(var8);
        var1.append('.');
        var1.append("access-control-max-age");
        String var24 = var1.toString();
        Converter var25 = conv$26;

        try {
            Object var26 = var0.getValue(var24, var25);
            ((CORSConfig)var2).accessControlMaxAge = (Optional)var26;
        } catch (IllegalArgumentException var36) {
            ConfigDiagnostic.invalidValue(var24, var36);
        } catch (NoSuchElementException var37) {
            ConfigDiagnostic.missingValue(var24, var37);
        }

        var1.setLength(var8);
        var1.append('.');
        var1.append("access-control-allow-credentials");
        String var29 = var1.toString();
        Converter var30 = conv$0;

        try {
            Object var31 = var0.getValue(var29, var30);
            ((CORSConfig)var2).accessControlAllowCredentials = (Optional)var31;
        } catch (IllegalArgumentException var34) {
            ConfigDiagnostic.invalidValue(var29, var34);
        } catch (NoSuchElementException var35) {
            ConfigDiagnostic.missingValue(var29, var35);
        }

        var1.setLength(var8);
    }

    static void initGroup$io$quarkus$vertx$http$runtime$ServerSslConfig(SmallRyeConfig var0, StringBuilder var1, Object var2) {
        int var4 = var1.length();
        var1.append('.');
        var1.append("certificate");
        CertificateConfig var3 = new CertificateConfig();
        initGroup$io$quarkus$vertx$http$runtime$CertificateConfig(var0, var1, var3);
        ((ServerSslConfig)var2).certificate = var3;
        var1.setLength(var4);
        var1.append('.');
        var1.append("cipher-suites");
        String var5 = var1.toString();
        Converter var6 = conv$3;

        try {
            Object var7 = var0.getValue(var5, var6);
            ((ServerSslConfig)var2).cipherSuites = (Optional)var7;
        } catch (IllegalArgumentException var17) {
            ConfigDiagnostic.invalidValue(var5, var17);
        } catch (NoSuchElementException var18) {
            ConfigDiagnostic.missingValue(var5, var18);
        }

        var1.setLength(var4);
        var1.append('.');
        var1.append("protocols");
        String var10 = var1.toString();
        Converter var11 = conv$4;

        try {
            Object var12 = var0.getValue(var10, var11);
            ((ServerSslConfig)var2).protocols = (List)var12;
        } catch (IllegalArgumentException var15) {
            ConfigDiagnostic.invalidValue(var10, var15);
        } catch (NoSuchElementException var16) {
            ConfigDiagnostic.missingValue(var10, var16);
        }

        var1.setLength(var4);
    }

    static void initGroup$io$quarkus$vertx$http$runtime$CertificateConfig(SmallRyeConfig var0, StringBuilder var1, Object var2) {
        int var8 = var1.length();
        var1.append('.');
        var1.append("file");
        String var3 = var1.toString();
        Converter var4 = conv$29;

        try {
            Object var5 = var0.getValue(var3, var4);
            ((CertificateConfig)var2).file = (Optional)var5;
        } catch (IllegalArgumentException var72) {
            ConfigDiagnostic.invalidValue(var3, var72);
        } catch (NoSuchElementException var73) {
            ConfigDiagnostic.missingValue(var3, var73);
        }

        var1.setLength(var8);
        var1.append('.');
        var1.append("key-file");
        String var9 = var1.toString();
        Converter var10 = conv$29;

        try {
            Object var11 = var0.getValue(var9, var10);
            ((CertificateConfig)var2).keyFile = (Optional)var11;
        } catch (IllegalArgumentException var70) {
            ConfigDiagnostic.invalidValue(var9, var70);
        } catch (NoSuchElementException var71) {
            ConfigDiagnostic.missingValue(var9, var71);
        }

        var1.setLength(var8);
        var1.append('.');
        var1.append("key-store-file");
        String var14 = var1.toString();
        Converter var15 = conv$29;

        try {
            Object var16 = var0.getValue(var14, var15);
            ((CertificateConfig)var2).keyStoreFile = (Optional)var16;
        } catch (IllegalArgumentException var68) {
            ConfigDiagnostic.invalidValue(var14, var68);
        } catch (NoSuchElementException var69) {
            ConfigDiagnostic.missingValue(var14, var69);
        }

        var1.setLength(var8);
        var1.append('.');
        var1.append("key-store-file-type");
        String var19 = var1.toString();
        Converter var20 = conv$16;

        try {
            Object var21 = var0.getValue(var19, var20);
            ((CertificateConfig)var2).keyStoreFileType = (Optional)var21;
        } catch (IllegalArgumentException var66) {
            ConfigDiagnostic.invalidValue(var19, var66);
        } catch (NoSuchElementException var67) {
            ConfigDiagnostic.missingValue(var19, var67);
        }

        var1.setLength(var8);
        var1.append('.');
        var1.append("key-store-provider");
        String var24 = var1.toString();
        Converter var25 = conv$16;

        try {
            Object var26 = var0.getValue(var24, var25);
            ((CertificateConfig)var2).keyStoreProvider = (Optional)var26;
        } catch (IllegalArgumentException var64) {
            ConfigDiagnostic.invalidValue(var24, var64);
        } catch (NoSuchElementException var65) {
            ConfigDiagnostic.missingValue(var24, var65);
        }

        var1.setLength(var8);
        var1.append('.');
        var1.append("key-store-password");
        String var29 = var1.toString();
        Converter var30 = conv$2;

        try {
            Object var31 = var0.getValue(var29, var30);
            ((CertificateConfig)var2).keyStorePassword = (String)var31;
        } catch (IllegalArgumentException var62) {
            ConfigDiagnostic.invalidValue(var29, var62);
        } catch (NoSuchElementException var63) {
            ConfigDiagnostic.missingValue(var29, var63);
        }

        var1.setLength(var8);
        var1.append('.');
        var1.append("trust-store-file");
        String var34 = var1.toString();
        Converter var35 = conv$29;

        try {
            Object var36 = var0.getValue(var34, var35);
            ((CertificateConfig)var2).trustStoreFile = (Optional)var36;
        } catch (IllegalArgumentException var60) {
            ConfigDiagnostic.invalidValue(var34, var60);
        } catch (NoSuchElementException var61) {
            ConfigDiagnostic.missingValue(var34, var61);
        }

        var1.setLength(var8);
        var1.append('.');
        var1.append("trust-store-file-type");
        String var39 = var1.toString();
        Converter var40 = conv$16;

        try {
            Object var41 = var0.getValue(var39, var40);
            ((CertificateConfig)var2).trustStoreFileType = (Optional)var41;
        } catch (IllegalArgumentException var58) {
            ConfigDiagnostic.invalidValue(var39, var58);
        } catch (NoSuchElementException var59) {
            ConfigDiagnostic.missingValue(var39, var59);
        }

        var1.setLength(var8);
        var1.append('.');
        var1.append("trust-store-provider");
        String var44 = var1.toString();
        Converter var45 = conv$16;

        try {
            Object var46 = var0.getValue(var44, var45);
            ((CertificateConfig)var2).trustStoreProvider = (Optional)var46;
        } catch (IllegalArgumentException var56) {
            ConfigDiagnostic.invalidValue(var44, var56);
        } catch (NoSuchElementException var57) {
            ConfigDiagnostic.missingValue(var44, var57);
        }

        var1.setLength(var8);
        var1.append('.');
        var1.append("trust-store-password");
        String var49 = var1.toString();
        Converter var50 = conv$16;

        try {
            Object var51 = var0.getValue(var49, var50);
            ((CertificateConfig)var2).trustStorePassword = (Optional)var51;
        } catch (IllegalArgumentException var54) {
            ConfigDiagnostic.invalidValue(var49, var54);
        } catch (NoSuchElementException var55) {
            ConfigDiagnostic.missingValue(var49, var55);
        }

        var1.setLength(var8);
    }

    static void initGroup$io$quarkus$vertx$http$runtime$ServerLimitsConfig(SmallRyeConfig var0, StringBuilder var1, Object var2) {
        int var8 = var1.length();
        var1.append('.');
        var1.append("max-header-size");
        String var3 = var1.toString();
        Converter var4 = conv$15;

        try {
            Object var5 = var0.getValue(var3, var4);
            ((ServerLimitsConfig)var2).maxHeaderSize = (MemorySize)var5;
        } catch (IllegalArgumentException var30) {
            ConfigDiagnostic.invalidValue(var3, var30);
        } catch (NoSuchElementException var31) {
            ConfigDiagnostic.missingValue(var3, var31);
        }

        var1.setLength(var8);
        var1.append('.');
        var1.append("max-body-size");
        String var9 = var1.toString();
        Converter var10 = conv$14;

        try {
            Object var11 = var0.getValue(var9, var10);
            ((ServerLimitsConfig)var2).maxBodySize = (Optional)var11;
        } catch (IllegalArgumentException var28) {
            ConfigDiagnostic.invalidValue(var9, var28);
        } catch (NoSuchElementException var29) {
            ConfigDiagnostic.missingValue(var9, var29);
        }

        var1.setLength(var8);
        var1.append('.');
        var1.append("max-chunk-size");
        String var14 = var1.toString();
        Converter var15 = conv$15;

        try {
            Object var16 = var0.getValue(var14, var15);
            ((ServerLimitsConfig)var2).maxChunkSize = (MemorySize)var16;
        } catch (IllegalArgumentException var26) {
            ConfigDiagnostic.invalidValue(var14, var26);
        } catch (NoSuchElementException var27) {
            ConfigDiagnostic.missingValue(var14, var27);
        }

        var1.setLength(var8);
        var1.append('.');
        var1.append("max-initial-line-length");
        String var19 = var1.toString();
        Converter var20 = conv$11;

        try {
            Object var21 = var0.getValue(var19, var20);
            ((ServerLimitsConfig)var2).maxInitialLineLength = (Integer)var21;
        } catch (IllegalArgumentException var24) {
            ConfigDiagnostic.invalidValue(var19, var24);
        } catch (NoSuchElementException var25) {
            ConfigDiagnostic.missingValue(var19, var25);
        }

        var1.setLength(var8);
    }

    static void initGroup$io$quarkus$vertx$http$runtime$BodyConfig(SmallRyeConfig var0, StringBuilder var1, Object var2) {
        int var8 = var1.length();
        var1.append('.');
        var1.append("handle-file-uploads");
        String var3 = var1.toString();
        Converter var4 = conv$8;

        try {
            Object var5 = var0.getValue(var3, var4);
            ((BodyConfig)var2).handleFileUploads = (Boolean)var5;
        } catch (IllegalArgumentException var37) {
            ConfigDiagnostic.invalidValue(var3, var37);
        } catch (NoSuchElementException var38) {
            ConfigDiagnostic.missingValue(var3, var38);
        }

        var1.setLength(var8);
        var1.append('.');
        var1.append("uploads-directory");
        String var9 = var1.toString();
        Converter var10 = conv$2;

        try {
            Object var11 = var0.getValue(var9, var10);
            ((BodyConfig)var2).uploadsDirectory = (String)var11;
        } catch (IllegalArgumentException var35) {
            ConfigDiagnostic.invalidValue(var9, var35);
        } catch (NoSuchElementException var36) {
            ConfigDiagnostic.missingValue(var9, var36);
        }

        var1.setLength(var8);
        var1.append('.');
        var1.append("merge-form-attributes");
        String var14 = var1.toString();
        Converter var15 = conv$8;

        try {
            Object var16 = var0.getValue(var14, var15);
            ((BodyConfig)var2).mergeFormAttributes = (Boolean)var16;
        } catch (IllegalArgumentException var33) {
            ConfigDiagnostic.invalidValue(var14, var33);
        } catch (NoSuchElementException var34) {
            ConfigDiagnostic.missingValue(var14, var34);
        }

        var1.setLength(var8);
        var1.append('.');
        var1.append("delete-uploaded-files-on-end");
        String var19 = var1.toString();
        Converter var20 = conv$8;

        try {
            Object var21 = var0.getValue(var19, var20);
            ((BodyConfig)var2).deleteUploadedFilesOnEnd = (Boolean)var21;
        } catch (IllegalArgumentException var31) {
            ConfigDiagnostic.invalidValue(var19, var31);
        } catch (NoSuchElementException var32) {
            ConfigDiagnostic.missingValue(var19, var32);
        }

        var1.setLength(var8);
        var1.append('.');
        var1.append("preallocate-body-buffer");
        String var24 = var1.toString();
        Converter var25 = conv$8;

        try {
            Object var26 = var0.getValue(var24, var25);
            ((BodyConfig)var2).preallocateBodyBuffer = (Boolean)var26;
        } catch (IllegalArgumentException var29) {
            ConfigDiagnostic.invalidValue(var24, var29);
        } catch (NoSuchElementException var30) {
            ConfigDiagnostic.missingValue(var24, var30);
        }

        var1.setLength(var8);
    }

    static void initGroup$io$quarkus$vertx$http$runtime$AccessLogConfig(SmallRyeConfig var0, StringBuilder var1, Object var2) {
        int var8 = var1.length();
        var1.append('.');
        var1.append("enabled");
        String var3 = var1.toString();
        Converter var4 = conv$8;

        try {
            Object var5 = var0.getValue(var3, var4);
            ((AccessLogConfig)var2).enabled = (Boolean)var5;
        } catch (IllegalArgumentException var58) {
            ConfigDiagnostic.invalidValue(var3, var58);
        } catch (NoSuchElementException var59) {
            ConfigDiagnostic.missingValue(var3, var59);
        }

        var1.setLength(var8);
        var1.append('.');
        var1.append("pattern");
        String var9 = var1.toString();
        Converter var10 = conv$2;

        try {
            Object var11 = var0.getValue(var9, var10);
            ((AccessLogConfig)var2).pattern = (String)var11;
        } catch (IllegalArgumentException var56) {
            ConfigDiagnostic.invalidValue(var9, var56);
        } catch (NoSuchElementException var57) {
            ConfigDiagnostic.missingValue(var9, var57);
        }

        var1.setLength(var8);
        var1.append('.');
        var1.append("log-to-file");
        String var14 = var1.toString();
        Converter var15 = conv$8;

        try {
            Object var16 = var0.getValue(var14, var15);
            ((AccessLogConfig)var2).logToFile = (Boolean)var16;
        } catch (IllegalArgumentException var54) {
            ConfigDiagnostic.invalidValue(var14, var54);
        } catch (NoSuchElementException var55) {
            ConfigDiagnostic.missingValue(var14, var55);
        }

        var1.setLength(var8);
        var1.append('.');
        var1.append("base-file-name");
        String var19 = var1.toString();
        Converter var20 = conv$2;

        try {
            Object var21 = var0.getValue(var19, var20);
            ((AccessLogConfig)var2).baseFileName = (String)var21;
        } catch (IllegalArgumentException var52) {
            ConfigDiagnostic.invalidValue(var19, var52);
        } catch (NoSuchElementException var53) {
            ConfigDiagnostic.missingValue(var19, var53);
        }

        var1.setLength(var8);
        var1.append('.');
        var1.append("log-directory");
        String var24 = var1.toString();
        Converter var25 = conv$16;

        try {
            Object var26 = var0.getValue(var24, var25);
            ((AccessLogConfig)var2).logDirectory = (Optional)var26;
        } catch (IllegalArgumentException var50) {
            ConfigDiagnostic.invalidValue(var24, var50);
        } catch (NoSuchElementException var51) {
            ConfigDiagnostic.missingValue(var24, var51);
        }

        var1.setLength(var8);
        var1.append('.');
        var1.append("log-suffix");
        String var29 = var1.toString();
        Converter var30 = conv$2;

        try {
            Object var31 = var0.getValue(var29, var30);
            ((AccessLogConfig)var2).logSuffix = (String)var31;
        } catch (IllegalArgumentException var48) {
            ConfigDiagnostic.invalidValue(var29, var48);
        } catch (NoSuchElementException var49) {
            ConfigDiagnostic.missingValue(var29, var49);
        }

        var1.setLength(var8);
        var1.append('.');
        var1.append("category");
        String var34 = var1.toString();
        Converter var35 = conv$2;

        try {
            Object var36 = var0.getValue(var34, var35);
            ((AccessLogConfig)var2).category = (String)var36;
        } catch (IllegalArgumentException var46) {
            ConfigDiagnostic.invalidValue(var34, var46);
        } catch (NoSuchElementException var47) {
            ConfigDiagnostic.missingValue(var34, var47);
        }

        var1.setLength(var8);
        var1.append('.');
        var1.append("rotate");
        String var39 = var1.toString();
        Converter var40 = conv$8;

        try {
            Object var41 = var0.getValue(var39, var40);
            ((AccessLogConfig)var2).rotate = (Boolean)var41;
        } catch (IllegalArgumentException var44) {
            ConfigDiagnostic.invalidValue(var39, var44);
        } catch (NoSuchElementException var45) {
            ConfigDiagnostic.missingValue(var39, var45);
        }

        var1.setLength(var8);
    }

    static void initGroup$io$quarkus$vertx$http$runtime$ProxyConfig(SmallRyeConfig var0, StringBuilder var1, Object var2) {
        int var8 = var1.length();
        var1.append('.');
        var1.append("proxy-address-forwarding");
        String var3 = var1.toString();
        Converter var4 = conv$8;

        try {
            Object var5 = var0.getValue(var3, var4);
            ((ProxyConfig)var2).proxyAddressForwarding = (Boolean)var5;
        } catch (IllegalArgumentException var44) {
            ConfigDiagnostic.invalidValue(var3, var44);
        } catch (NoSuchElementException var45) {
            ConfigDiagnostic.missingValue(var3, var45);
        }

        var1.setLength(var8);
        var1.append('.');
        var1.append("allow-forwarded");
        String var9 = var1.toString();
        Converter var10 = conv$8;

        try {
            Object var11 = var0.getValue(var9, var10);
            ((ProxyConfig)var2).allowForwarded = (Boolean)var11;
        } catch (IllegalArgumentException var42) {
            ConfigDiagnostic.invalidValue(var9, var42);
        } catch (NoSuchElementException var43) {
            ConfigDiagnostic.missingValue(var9, var43);
        }

        var1.setLength(var8);
        var1.append('.');
        var1.append("enable-forwarded-host");
        String var14 = var1.toString();
        Converter var15 = conv$8;

        try {
            Object var16 = var0.getValue(var14, var15);
            ((ProxyConfig)var2).enableForwardedHost = (Boolean)var16;
        } catch (IllegalArgumentException var40) {
            ConfigDiagnostic.invalidValue(var14, var40);
        } catch (NoSuchElementException var41) {
            ConfigDiagnostic.missingValue(var14, var41);
        }

        var1.setLength(var8);
        var1.append('.');
        var1.append("forwarded-host-header");
        String var19 = var1.toString();
        Converter var20 = conv$2;

        try {
            Object var21 = var0.getValue(var19, var20);
            ((ProxyConfig)var2).forwardedHostHeader = (String)var21;
        } catch (IllegalArgumentException var38) {
            ConfigDiagnostic.invalidValue(var19, var38);
        } catch (NoSuchElementException var39) {
            ConfigDiagnostic.missingValue(var19, var39);
        }

        var1.setLength(var8);
        var1.append('.');
        var1.append("enable-forwarded-prefix");
        String var24 = var1.toString();
        Converter var25 = conv$8;

        try {
            Object var26 = var0.getValue(var24, var25);
            ((ProxyConfig)var2).enableForwardedPrefix = (Boolean)var26;
        } catch (IllegalArgumentException var36) {
            ConfigDiagnostic.invalidValue(var24, var36);
        } catch (NoSuchElementException var37) {
            ConfigDiagnostic.missingValue(var24, var37);
        }

        var1.setLength(var8);
        var1.append('.');
        var1.append("forwarded-prefix-header");
        String var29 = var1.toString();
        Converter var30 = conv$2;

        try {
            Object var31 = var0.getValue(var29, var30);
            ((ProxyConfig)var2).forwardedPrefixHeader = (String)var31;
        } catch (IllegalArgumentException var34) {
            ConfigDiagnostic.invalidValue(var29, var34);
        } catch (NoSuchElementException var35) {
            ConfigDiagnostic.missingValue(var29, var35);
        }

        var1.setLength(var8);
    }

    static void initGroup$io$quarkus$runtime$BannerRuntimeConfig(SmallRyeConfig var0, StringBuilder var1, Object var2) {
        int var8 = var1.length();
        var1.append('.');
        var1.append("enabled");
        String var3 = var1.toString();
        Converter var4 = conv$8;

        try {
            Object var5 = var0.getValue(var3, var4);
            ((BannerRuntimeConfig)var2).enabled = (Boolean)var5;
        } catch (IllegalArgumentException var9) {
            ConfigDiagnostic.invalidValue(var3, var9);
        } catch (NoSuchElementException var10) {
            ConfigDiagnostic.missingValue(var3, var10);
        }

        var1.setLength(var8);
    }

    static void initGroup$io$quarkus$runtime$CommandLineRuntimeConfig(SmallRyeConfig var0, StringBuilder var1, Object var2) {
        int var8 = var1.length();
        var1.append('.');
        var1.append("args");
        String var3 = var1.toString();
        Converter var4 = conv$16;

        try {
            Object var5 = var0.getValue(var3, var4);
            ((CommandLineRuntimeConfig)var2).args = (Optional)var5;
        } catch (IllegalArgumentException var9) {
            ConfigDiagnostic.invalidValue(var3, var9);
        } catch (NoSuchElementException var10) {
            ConfigDiagnostic.missingValue(var3, var10);
        }

        var1.setLength(var8);
    }

    static void initGroup$io$quarkus$runtime$ThreadPoolConfig(SmallRyeConfig var0, StringBuilder var1, Object var2) {
        int var8 = var1.length();
        var1.append('.');
        var1.append("core-threads");
        String var3 = var1.toString();
        Converter var4 = conv$11;

        try {
            Object var5 = var0.getValue(var3, var4);
            ((ThreadPoolConfig)var2).coreThreads = (Integer)var5;
        } catch (IllegalArgumentException var65) {
            ConfigDiagnostic.invalidValue(var3, var65);
        } catch (NoSuchElementException var66) {
            ConfigDiagnostic.missingValue(var3, var66);
        }

        var1.setLength(var8);
        var1.append('.');
        var1.append("prefill");
        String var9 = var1.toString();
        Converter var10 = conv$8;

        try {
            Object var11 = var0.getValue(var9, var10);
            ((ThreadPoolConfig)var2).prefill = (Boolean)var11;
        } catch (IllegalArgumentException var63) {
            ConfigDiagnostic.invalidValue(var9, var63);
        } catch (NoSuchElementException var64) {
            ConfigDiagnostic.missingValue(var9, var64);
        }

        var1.setLength(var8);
        var1.append('.');
        var1.append("max-threads");
        String var14 = var1.toString();
        Converter var15 = conv$25;

        try {
            Object var16 = var0.getValue(var14, var15);
            ((ThreadPoolConfig)var2).maxThreads = (OptionalInt)var16;
        } catch (IllegalArgumentException var61) {
            ConfigDiagnostic.invalidValue(var14, var61);
        } catch (NoSuchElementException var62) {
            ConfigDiagnostic.missingValue(var14, var62);
        }

        var1.setLength(var8);
        var1.append('.');
        var1.append("queue-size");
        String var19 = var1.toString();
        Converter var20 = conv$25;

        try {
            Object var21 = var0.getValue(var19, var20);
            ((ThreadPoolConfig)var2).queueSize = (OptionalInt)var21;
        } catch (IllegalArgumentException var59) {
            ConfigDiagnostic.invalidValue(var19, var59);
        } catch (NoSuchElementException var60) {
            ConfigDiagnostic.missingValue(var19, var60);
        }

        var1.setLength(var8);
        var1.append('.');
        var1.append("growth-resistance");
        String var24 = var1.toString();
        Converter var25 = conv$31;

        try {
            Object var26 = var0.getValue(var24, var25);
            ((ThreadPoolConfig)var2).growthResistance = (Float)var26;
        } catch (IllegalArgumentException var57) {
            ConfigDiagnostic.invalidValue(var24, var57);
        } catch (NoSuchElementException var58) {
            ConfigDiagnostic.missingValue(var24, var58);
        }

        var1.setLength(var8);
        var1.append('.');
        var1.append("shutdown-timeout");
        String var29 = var1.toString();
        Converter var30 = conv$21;

        try {
            Object var31 = var0.getValue(var29, var30);
            ((ThreadPoolConfig)var2).shutdownTimeout = (Duration)var31;
        } catch (IllegalArgumentException var55) {
            ConfigDiagnostic.invalidValue(var29, var55);
        } catch (NoSuchElementException var56) {
            ConfigDiagnostic.missingValue(var29, var56);
        }

        var1.setLength(var8);
        var1.append('.');
        var1.append("shutdown-interrupt");
        String var34 = var1.toString();
        Converter var35 = conv$21;

        try {
            Object var36 = var0.getValue(var34, var35);
            ((ThreadPoolConfig)var2).shutdownInterrupt = (Duration)var36;
        } catch (IllegalArgumentException var53) {
            ConfigDiagnostic.invalidValue(var34, var53);
        } catch (NoSuchElementException var54) {
            ConfigDiagnostic.missingValue(var34, var54);
        }

        var1.setLength(var8);
        var1.append('.');
        var1.append("shutdown-check-interval");
        String var39 = var1.toString();
        Converter var40 = conv$26;

        try {
            Object var41 = var0.getValue(var39, var40);
            ((ThreadPoolConfig)var2).shutdownCheckInterval = (Optional)var41;
        } catch (IllegalArgumentException var51) {
            ConfigDiagnostic.invalidValue(var39, var51);
        } catch (NoSuchElementException var52) {
            ConfigDiagnostic.missingValue(var39, var52);
        }

        var1.setLength(var8);
        var1.append('.');
        var1.append("keep-alive-time");
        String var44 = var1.toString();
        Converter var45 = conv$21;

        try {
            Object var46 = var0.getValue(var44, var45);
            ((ThreadPoolConfig)var2).keepAliveTime = (Duration)var46;
        } catch (IllegalArgumentException var49) {
            ConfigDiagnostic.invalidValue(var44, var49);
        } catch (NoSuchElementException var50) {
            ConfigDiagnostic.missingValue(var44, var50);
        }

        var1.setLength(var8);
    }

    static void initGroup$io$quarkus$runtime$TopLevelRootConfig(SmallRyeConfig var0, StringBuilder var1, Object var2) {
        int var8 = var1.length();
        var1.append('.');
        var1.append("profile");
        String var3 = var1.toString();
        Converter var4 = conv$16;

        try {
            Object var5 = var0.getValue(var3, var4);
            io.quarkus.runtime.TopLevelRootConfig..accessor.set_profile(var2, var5);
        } catch (IllegalArgumentException var9) {
            ConfigDiagnostic.invalidValue(var3, var9);
        } catch (NoSuchElementException var10) {
            ConfigDiagnostic.missingValue(var3, var10);
        }

        var1.setLength(var8);
    }

    static void initGroup$io$quarkus$runtime$configuration$ConfigurationRuntimeConfig(SmallRyeConfig var0, StringBuilder var1, Object var2) {
        int var8 = var1.length();
        var1.append('.');
        var1.append("build-time-mismatch-at-runtime");
        String var3 = var1.toString();
        Converter var4 = conv$32;

        try {
            Object var5 = var0.getValue(var3, var4);
            ((ConfigurationRuntimeConfig)var2).buildTimeMismatchAtRuntime = (BuildTimeMismatchAtRuntime)var5;
        } catch (IllegalArgumentException var9) {
            ConfigDiagnostic.invalidValue(var3, var9);
        } catch (NoSuchElementException var10) {
            ConfigDiagnostic.missingValue(var3, var10);
        }

        var1.setLength(var8);
    }

    static void initGroup$io$quarkus$runtime$logging$LogConfig(SmallRyeConfig var0, StringBuilder var1, Object var2) {
        int var8 = var1.length();
        var1.append('.');
        var1.append("level");
        String var3 = var1.toString();
        Converter var4 = conv$10;

        try {
            Object var5 = var0.getValue(var3, var4);
            ((LogConfig)var2).level = (Level)var5;
        } catch (IllegalArgumentException var17) {
            ConfigDiagnostic.invalidValue(var3, var17);
        } catch (NoSuchElementException var18) {
            ConfigDiagnostic.missingValue(var3, var18);
        }

        var1.setLength(var8);
        var1.append('.');
        var1.append("console");
        ConsoleConfig var9 = new ConsoleConfig();
        initGroup$io$quarkus$runtime$logging$ConsoleConfig(var0, var1, var9);
        ((LogConfig)var2).console = var9;
        var1.setLength(var8);
        var1.append('.');
        var1.append("file");
        FileConfig var10 = new FileConfig();
        initGroup$io$quarkus$runtime$logging$FileConfig(var0, var1, var10);
        ((LogConfig)var2).file = var10;
        var1.setLength(var8);
        var1.append('.');
        var1.append("syslog");
        SyslogConfig var11 = new SyslogConfig();
        initGroup$io$quarkus$runtime$logging$SyslogConfig(var0, var1, var11);
        ((LogConfig)var2).syslog = var11;
        var1.setLength(var8);
        var1.append('.');
        var1.append("category");
        TreeMap var12 = new TreeMap();
        ((LogConfig)var2).categories = (Map)var12;
        var1.setLength(var8);
        var1.append('.');
        var1.append("handler.console");
        TreeMap var13 = new TreeMap();
        ((LogConfig)var2).consoleHandlers = (Map)var13;
        var1.setLength(var8);
        var1.append('.');
        var1.append("handler.file");
        TreeMap var14 = new TreeMap();
        ((LogConfig)var2).fileHandlers = (Map)var14;
        var1.setLength(var8);
        var1.append('.');
        var1.append("handler.syslog");
        TreeMap var15 = new TreeMap();
        ((LogConfig)var2).syslogHandlers = (Map)var15;
        var1.setLength(var8);
        var1.append('.');
        var1.append("filter");
        TreeMap var16 = new TreeMap();
        ((LogConfig)var2).filters = (Map)var16;
        var1.setLength(var8);
    }

    static void initGroup$io$quarkus$runtime$shutdown$ShutdownConfig(SmallRyeConfig var0, StringBuilder var1, Object var2) {
        int var8 = var1.length();
        var1.append('.');
        var1.append("timeout");
        String var3 = var1.toString();
        Converter var4 = conv$26;

        try {
            Object var5 = var0.getValue(var3, var4);
            ((ShutdownConfig)var2).timeout = (Optional)var5;
        } catch (IllegalArgumentException var9) {
            ConfigDiagnostic.invalidValue(var3, var9);
        } catch (NoSuchElementException var10) {
            ConfigDiagnostic.missingValue(var3, var10);
        }

        var1.setLength(var8);
    }

    public static void ensureInitialized() {
    }

    public static Config createBootstrapConfig() {
        Config var0 = new Config();
        INSTANCE = var0;
        var0.readBootstrapConfig();
        return var0;
    }
}
