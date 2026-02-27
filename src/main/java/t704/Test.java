package t704;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Test {

    public static void main(String[] args) {
        Function<String, Foo> fooFunction = test -> new Foo(test);
        Function<String, Foo> fooFunction2 = Foo::new; // ERROR Bad return type in method reference: cannot convert void to test.Test.Foo
        BiFunction<String, String, Foo> fooFunction3 = Foo::new; // OK
    }

    public static class Foo {
        public Foo(String test, String bar="bar") { }
    }

}
