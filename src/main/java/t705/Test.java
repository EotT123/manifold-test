package t705;

import manifold.ext.props.rt.api.val;
import org.jspecify.annotations.NullMarked;

@NullMarked
public interface Test {
    @val String test; // WARNING: @NullMarked fields must be initialized
}
