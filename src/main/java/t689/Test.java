package t689;

import java.util.function.Function;

public class Test {

    public static void main(String[] args) {
        // works
        new Foo(s -> s.length());
        new Foo(String::length);

        Function<String, Integer> fooFunction = String::length;
        new Foo(fooFunction:fooFunction);

        // error

        new Foo(fooFunction:s -> s.length());
        new Foo(fooFunction:String::length);
    }


public static class Foo {
    private final Function<String, Integer> fooFunction;
    private final boolean bar;

    Foo(Function<String, Integer> fooFunction, boolean bar = false){
        this.fooFunction =fooFunction;
        this.bar = bar;
    }
}
}
