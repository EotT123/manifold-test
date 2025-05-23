package t696;

public abstract class TestAbstract {

    public abstract String foo(int bar = 1); // ERROR: abstract methods cannot have a body
}
