package t780;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.jspecify.annotations.NullMarked;
import org.jspecify.annotations.Nullable;


@NullMarked
public class Test {

    @Retention( RetentionPolicy.RUNTIME ) @Target( ElementType.TYPE_USE )
    public @interface test1 {}
    @Retention( RetentionPolicy.RUNTIME ) @Target( ElementType.PARAMETER )
    public @interface test2 {}
    @Retention( RetentionPolicy.RUNTIME ) @Target( ElementType.PARAMETER )
    public @interface test3 {}
    @Retention( RetentionPolicy.RUNTIME ) @Target( ElementType.PARAMETER )
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
