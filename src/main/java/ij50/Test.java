package ij50;

import manifold.ext.props.rt.api.override;
import manifold.ext.props.rt.api.val;

public class Test {

    public static class Foo implements BarIntf {
        @val @override String foo; // ERROR: Property 'foo' does not override anything

        public Foo(String foo) {
            this.foo = foo;
        }
    }

    public interface BarIntf extends BarSuperIntf {

    }

    public interface BarSuperIntf {
        @val String foo;
    }

}
