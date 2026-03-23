package t85;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Test {

    public void test(){
        Path p = Paths.get("");
        String extension = p.getExtension(); // Navigates to the correct implementation
        String extension2 = p.extension; // Does not navigate to the correct implementation
    }
}
