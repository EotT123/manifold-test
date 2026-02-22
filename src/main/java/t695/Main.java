package t695;
import static t695.Foo.*;

public class Main {

    public static void main(String[] args) {

        new Test(Foo.create(text:"text")); // OK
        new Test(create(text:"text")); // NOK: Cannot resolve method 'create(manifold_tuple__xxx)
    }
}
