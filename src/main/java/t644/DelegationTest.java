package t644;

import manifold.ext.delegation.rt.api.link;

public class DelegationTest implements TestIntf {
    @link Test delegate;

    public DelegationTest(Test delegate){
        this.delegate = delegate;
    }
    // Error! I'm forced to implement the following methods.
    // @Override public Object getObject() { ... }
    // @Override public void setObject(Object value) {  ... }
}
