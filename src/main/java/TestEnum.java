import manifold.ext.props.rt.api.val;

public enum TestEnum {

    FOO("foo"),
    BAR("bar");

    @val String value;

    private TestEnum(String value){
        this.value = value;
    }
}
