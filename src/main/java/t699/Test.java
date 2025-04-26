package t699;

import manifold.ext.props.rt.api.val;

public class Test {

    // ERROR: Class 'test' must implement abstract method 'getFoo()' in 'MyInterface'
    public record TestRecord(String foo) implements MyInterface {
    }

    public interface MyInterface {
    // Using property syntax causes issues:
    @val String foo;

    // This works instead:
    // String foo();
    }
}
