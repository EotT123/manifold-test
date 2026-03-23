package t87;

import manifold.ext.props.rt.api.val;
import org.jspecify.annotations.NullMarked;

@NullMarked
public abstract class Test {
    @val abstract String foo; // @NullMarked fields must be initialized 
}
