package test;

import java.util.Optional;

import  test.schema.Test.Test1;
import manifold.ext.rt.api.auto;

public class Main{
    public static void main(String[] args) {
    }

    // https://github.com/manifold-systems/manifold/issues/558, not working with 2024.1.9
    private auto test() {
        Test1 test1 = Optional.ofNullable(Test1.builder().build())
                .orElseGet(() -> Test1.builder().build());
        return test1, test1;
    }

    // https://github.com/manifold-systems/manifold/issues/561
    private void test2(){
        // compiles
        Test1 result = "[.sql/]SELECT * FROM test1 LIMIT 1".fetchOne();

        // doesn't compile
        boolean result2 =  "[.sql/]SELECT * FROM test1 LIMIT 1".fetchOne() == null;
    }
}
