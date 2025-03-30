package t684;

public class Child extends Parent<String> {
    public String doSomething(String value) {
        return foo + value; // When compiling: no enclosing instance of type t684.Parent is in scope
    }
}
