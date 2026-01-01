import manifold.ext.props.rt.api.override;
import manifold.ext.props.rt.api.val;

public class Test {

    public interface Interface1 {
        @val String foo;
    }

    public interface Interface2 extends Interface1 {}

    public class MyClass implements Interface2 {
        @val @override String foo = "foo";
    }
}
