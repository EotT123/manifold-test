package ij63;

import manifold.ext.props.rt.api.override;
import manifold.ext.props.rt.api.val;

public class Test {

    interface MyIntf {
        @val String foo;

        default String doSomething() {
            return foo + "test";
        }
    }

    class MyClass implements MyIntf {
        @override @val String foo = "foo"; // warning: Field 'foo' is never used
    }
}
