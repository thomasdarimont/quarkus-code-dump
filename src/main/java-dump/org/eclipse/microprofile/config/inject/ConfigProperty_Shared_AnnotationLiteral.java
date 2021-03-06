//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package org.eclipse.microprofile.config.inject;

import javax.enterprise.util.AnnotationLiteral;

// $FF: synthetic class
public class ConfigProperty_Shared_AnnotationLiteral extends AnnotationLiteral<ConfigProperty> implements ConfigProperty {
    private final String defaultValue;
    private final String name;

    public ConfigProperty_Shared_AnnotationLiteral(String var1, String var2) {
        this.defaultValue = var1;
        this.name = var2;
    }

    public String defaultValue() {
        return this.defaultValue;
    }

    public String name() {
        return this.name;
    }
}
