package t695;

public record Foo(String text = null){
    public static Foo create(String text = null){
        return new Foo(text);
    }
}
