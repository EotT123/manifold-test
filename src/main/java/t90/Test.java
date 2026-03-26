package t90;

import manifold.ext.props.rt.api.val;
import org.jspecify.annotations.NullMarked;

@NullMarked
public class Test {

    @val String foo; // IntelliJ warning: @NullMarked fields must be initialized

    public String getFoo() {
        return "foo";
    }
}
