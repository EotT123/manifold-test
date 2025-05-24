package t716;

import java.util.function.Function;

public class Test {

    public record TestRecord<T>(String foo, Function<? super T, String> bar) {
    }
}
