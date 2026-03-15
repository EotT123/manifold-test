package t83;

import static manifold.ext.props.rt.api.PropOption.*;

import manifold.ext.props.rt.api.override;
import manifold.ext.props.rt.api.val;

public class T83 {

    public abstract static class Test {

        abstract @val String foo; // No usages, implementations not found
        @val(Abstract) String bar; // No usages, implementations not found
    }

    public static class Test2 extends Test {

        @Override
        public String getFoo() {
            return "foo";
        }

        @Override
        public String getBar() {
            return "bar";
        }
    }

    public static class Test3 extends Test {
        @override @val String foo = "foo";
        @override @val String bar = "bar";
    }
}
