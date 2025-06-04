public class Test {
}

class Foo {
    public String foo(Object value) {
        String v = value.toString(); // <-- Cannot read field "tsym" because "t" is null 
        return v;
    }
}
