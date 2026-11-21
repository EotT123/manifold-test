package t780;

import org.jspecify.annotations.NullMarked;
import org.jspecify.annotations.Nullable;


@NullMarked
public class Test {

    public <T extends @Nullable Object> MyObject<T> test(MyObject<T> foo, @Nullable MyObject<T> bar=null, @Nullable MyObject<T> fooBar=null) {
        return bar == null || fooBar == null ? new MyObject<>(null) : new MyObject<>(bar.value);
    }

    public record MyObject<T extends @Nullable Object>(T value){};
}
