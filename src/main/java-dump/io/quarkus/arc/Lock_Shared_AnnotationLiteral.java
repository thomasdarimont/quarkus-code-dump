//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package io.quarkus.arc;

import io.quarkus.arc.Lock.Type;
import java.util.concurrent.TimeUnit;
import javax.enterprise.util.AnnotationLiteral;

// $FF: synthetic class
public class Lock_Shared_AnnotationLiteral extends AnnotationLiteral<Lock> implements Lock {
    private final long time;
    private final TimeUnit unit;
    private final Type value;

    public Lock_Shared_AnnotationLiteral(long var1, TimeUnit var3, Type var4) {
        this.time = var1;
        this.unit = var3;
        this.value = var4;
    }

    public long time() {
        return this.time;
    }

    public TimeUnit unit() {
        return this.unit;
    }

    public Type value() {
        return this.value;
    }
}
