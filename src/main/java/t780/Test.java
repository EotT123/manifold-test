package t780;

import org.jspecify.annotations.NullMarked;
import org.jspecify.annotations.Nullable;


@NullMarked
public class Test {

    public @interface test1 {}
    public @interface test2 {}
    public @interface test3 {}
    public @interface test4 {}

    public <T extends @Nullable Object> @test1 MyObject<T> test(@test2 MyObject<T> foo, @test3 MyObject<T> bar=null,
        @test4 MyObject<T> fooBar=null) {
        return null;
    }

    @NullMarked
    public static class MyObject<T extends @Nullable Object> {
        private final T value;

        public MyObject(T value) {
            this.value = value;
        }

        public T getValue() {
            return value;
        }
    }
}
