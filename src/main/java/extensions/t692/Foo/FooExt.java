package extensions.t692.Foo;

import manifold.ext.rt.api.Extension;
import manifold.ext.rt.api.This;
import t692.Foo;

@Extension
public class FooExt {

    public static String test(@This Foo foo, String bar, String foobar){
        return bar + foobar;
    }
}
