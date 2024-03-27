package test;

import java.util.Optional;

import  test.schema.Test.Test1;
import manifold.ext.rt.api.auto;

public class Main{
    public static void main(String[] args) {
    }

    private auto test() {
        Test1 test1 = Optional.ofNullable(Test1.builder().build())
                .orElseGet(() -> Test1.builder().build());
        return test1, test1;
    }
}
