//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package io.quarkus.runtime.generated;

import io.quarkus.vertx.http.runtime.HttpHostConfigSource;
import java.util.Arrays;
import org.eclipse.microprofile.config.spi.ConfigSource;
import org.eclipse.microprofile.config.spi.ConfigSourceProvider;

// $FF: synthetic class
public final class ConfigSourceProviderImpl implements ConfigSourceProvider {
    public ConfigSourceProviderImpl() {
    }

    public Iterable getConfigSources(ClassLoader var1) {
        ConfigSource[] var2 = new ConfigSource[1];
        HttpHostConfigSource var3 = new HttpHostConfigSource(-2147483648);
        var2[0] = (ConfigSource)var3;
        return (Iterable)Arrays.asList((Object[])var2);
    }
}
