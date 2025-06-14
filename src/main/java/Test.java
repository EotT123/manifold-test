import java.util.stream.Stream;

public class Test {

    public Test() {
        Stream.of(1, 2).map(Foo::new).toList();
    }
}
