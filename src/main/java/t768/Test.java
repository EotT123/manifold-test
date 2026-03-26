package t768;

import java.util.function.Supplier;

import manifold.ext.props.rt.api.val;

public class Test {
    private final Supplier<String> supplier = () -> foo; // Compilation Error: Illegal forward reference
    private final Supplier<String> supplier2 = () -> getFoo(); // Ok
    @val String foo;
    private final Supplier<String> supplier3 = () -> foo; // Compilation Error: variable foo might not have been initialized
    private final Supplier<String> supplier4 = () -> getFoo(); // Ok

    public Test(String foo){
        this.foo = foo;
    }
}
