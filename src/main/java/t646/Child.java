package t646;

public class Child extends Parent{
    public Object getFoo() {
        if (foo == null) {
            foo = new Object(); // ERROR: Cannot assign read-only property 'foo '
        }
        return foo;
    }
}