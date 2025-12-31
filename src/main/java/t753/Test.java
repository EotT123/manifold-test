package t753;

import manifold.ext.props.rt.api.val;

public class Test {

    public interface Interface1 {
        @val String foo;
    }

    public interface Interface2 extends Interface1 {
        @val String foo = "foo";
    }
}
