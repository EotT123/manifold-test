package t751;

import manifold.ext.props.rt.api.override;
import manifold.ext.props.rt.api.var;

public class Test {

    static void main() {
        new MyClass("foo"); // ERROR during runtime: IllegalStateException Should not be used
    }

    public interface MyIntf {
        @var String foo;
    }

    public static class MyClass implements MyIntf {
        @var @override String foo;

        public MyClass(String foo) {
            this.foo = foo;
        }

        @Override
        public void setFoo(String foo) {
            throw new IllegalStateException("Should not be used");
        }
    }
}
