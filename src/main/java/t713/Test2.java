package t713;

public class Test2 {

    private static class TestClass {
        private final int foo;
        private final MyObject myObject;

        public TestClass(int foo=1, MyObject myObject=new MyObject()) {
            this.foo = foo;
            this.myObject = myObject;
        }
    }

    public record TestRecord(int foo=1, MyObject bar=new MyObject()) { // Method parameter without PARAMETER flag

    }

    public static class MyObject {

    }
}
