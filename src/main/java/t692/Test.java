package t692;

public class Test {

    public static void main(String[] args) {
        Foo foo = new Foo();
        foo.test("bar", "foobar");
        foo.test(bar:"bar", foobar:"foobar"); // ERROR Required type: String Provided: manifold_tuple_xxx
        foo.test(foobar:"foobar"); // ERROR Required type: String Provided: manifold_tuple_xxx
    }
}
