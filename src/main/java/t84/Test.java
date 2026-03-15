package t84;

import manifold.ext.props.rt.api.val;
import manifold.ext.props.rt.api.var;
import org.jspecify.annotations.NullMarked;

@NullMarked
public class Test {

  @var String foo; // Warning: @NullMarked fields must be initialized
  @val String bar; // Warning: @NullMarked fields must be initialized 

  public Test(String foo, String bar="bar") {
    this.foo = foo;
    this.bar = bar;
  }

}
