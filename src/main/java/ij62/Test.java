package ij62;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.stream.Collectors;

public class Test {

    public void arrayExtension(String... values) {
        values.stream().collect(Collectors.joining());
    }

    public void extensionSource() throws IOException {
        // IntelliJ error: Cannot resolve method 'list' in 'Path'
        Paths.get("").list().forEach(p -> System.out.println(p.isDirectory()));
    }
}
