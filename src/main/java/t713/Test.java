package t713;

public class Test {

    private static class TestClass {
        private final int foo;
        private final String bar;

        public TestClass(int foo=1, String bar=getBar()) {
            this.foo = foo;
            this.bar = bar;
        }
    }

    public record TestRecord(int foo=1, String bar=getBar()) {

    }

    public static String getBar() {
        return "bar";
    }
}
