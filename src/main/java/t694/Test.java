package t694;

import java.util.ArrayList;
import java.util.List;

public class Test {

    //Incompatible types: 'List<Object>' cannot be converted to 'List<String>'
    public void test1(List<String> string = List.of()){ }

    //Incompatible types: 'ArrayList<Object>' cannot be converted to 'List<String>'
    public void test2(List<String> string = new ArrayList<>()){ }

    // OK
    public void test3(List<String> string = new ArrayList<String>()){ }
}
