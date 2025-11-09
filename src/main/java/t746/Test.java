package t746;

import manifold.ext.delegation.rt.api.link;

public class Test {

    private interface MyIntf {
        String foo();
    }

    public record A(String foo) implements MyIntf {}

    public record B(@link A a, String b) implements MyIntf {}

    static void main() {
        A a = new A("foo");
        B b = new B(a, "b");
        String foo = a.foo;
        b.foo; // Not working, b.foo() is required.
    }
}
