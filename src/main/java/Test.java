public class Test {

  public static class MyClass<T> {
    private T t;

    public MyClass(T t=null, int i=5) {
      this.t = t;
    }
  }

  public static class MyClass2<T, S> {
    private T t;

    public MyClass2(T t=null, int i=5, S s = null) {
      this.t = t;
    }
  }

  static void main() {
    MyClass<String> c1 = new MyClass<>(i:10); // IntelliJ error: Incompatible equality constraint: String and Object: MyClass<String> and MyClass<Object>
    MyClass<String> c2 = new MyClass<String>(i:11); // IntelliJ error: Cannot resolve constructor 'MyClass($constructor_<Object>)'
    var c3 = new MyClass<String>(i:12); // IntelliJ error: Cannot resolve constructor 'MyClass($constructor_<Object>)'
    MyClass<String> c4 = new MyClass<>(t:"test", i:13); // Ok when 't' parameter is provided
    test2(new MyClass<>(i:14)); // IntelliJ error: Incompatible equality constraint: String and Object: MyClass<String> and MyClass<Object>
    MyClass2<Long, String> c5 = new MyClass2<>(s:"test"); // IntelliJ error: Incompatible equality constraint: Long and Object
    MyClass2<Long, String> c6 = new MyClass2<>(i:16); // IntelliJ error: Incompatible equality constraint: Long and Object
    var c7 = new MyClass2<>(i:17); // OK, compiles to MyClass2<Object, Object>
  }

   public static MyClass<String> test() {
    return new MyClass<>(i:15); // IntelliJ error: Incompatible equality constraint: String and Object: MyClass<String> and MyClass<Object>
  }

  public static void test2(MyClass<String> myClass) {
  }
}
