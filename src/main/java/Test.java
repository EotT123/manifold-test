public class Test {

    public static class MyClass<T> {
        private T t;

        public MyClass(T t=null, int i=5) {
            this.t = t;
        }
    }

    static void main() {
        MyClass<String> c1 = new MyClass<>(i:3); // IntelliJ error: Incompatible equality constraint: String and Object
        MyClass<String> c2 = new MyClass<String>(i:3); // IntelliJ error: Cannot resolve constructor 'MyClass($constructor_<Object>)'
        MyClass<String> c3 = new MyClass<>(t:"test", i:3); // Ok when 't' parameter is provided
    }
}
