package ij70;

import java.io.IOException;
import java.nio.file.Paths;

public class Test {

    public void extensionSource() throws IOException {
        // IntelliJ error: Cannot resolve method 'list' in 'Path'
        Paths.get("").list().forEach(p -> System.out.println(p.isDirectory()));
    }
}
