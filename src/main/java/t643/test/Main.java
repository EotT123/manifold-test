package t643.test;

import manifold.ext.props.rt.api.override;
import manifold.ext.props.rt.api.var;

public class Main {

    public static void main(String[] args) {
        new Main().testDoubleImplements();
    }

    public void testDoubleImplements() {
        MyClass2 myClass2 = new MyClass2();
        Object object = myClass2.object;
//        assertNull(object);
        System.out.println(object);
        myClass2.object = "hello";
//        assertEquals(myClass2.object, "hello");
        System.out.println(myClass2.object);
        MyClass myClass = myClass2;
        myClass.object = "hi";
//        assertEquals(myClass.object, "hi");
        System.out.println(myClass.object);
    }

    public interface TestIntf {
        Object getObject();
    }

    public static class MyClass implements TestIntf {
        @override @var Object object;

        void whatever() {
            object = "hey";
        }
    }

    public static class MyClass2 extends MyClass implements TestIntf {
        public void foo() {
            object = "hi"; // should not be ambiguous ref
            Object value = object; // should not be ambiguous ref

            MyClass2 mc2 = new MyClass2();
            mc2.object = value;
        }
    }
}
