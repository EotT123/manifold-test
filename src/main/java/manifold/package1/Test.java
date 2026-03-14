package manifold.package1;

import manifold.ext.props.rt.api.val;

public class Test {
    @val static Test instance = new Test();

    private Test() {
    }

    public String getTest(){
        return "test";
    }
}
