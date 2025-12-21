package ij60;

import java.util.stream.Collectors;

public class Test {

    public Test(String... values) {
        values.stream().collect(Collectors.joining());
    }
}
