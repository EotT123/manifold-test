package t693;

public class Test {

    public interface FooIntf {
        String test(String foo="foo", String bar);
    }

    public static class Foo implements FooIntf {

        @Override
        public String test(String foo="test", String bar) { // ERROR: Default parameter values are not allowed in the signature of an overriding method
            return foo + bar;
        }
    }
}
