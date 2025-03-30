package t643;

public class Test2 extends Test implements TestIntf {
    public void foo(){
        Object superObject = object; // Reference to 'object' is ambiguous, both 'Test. object' and 'TestIntf. object' match
    }
}
