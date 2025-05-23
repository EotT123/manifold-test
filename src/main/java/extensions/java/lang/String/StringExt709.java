package extensions.java.lang.String;

import java.util.function.Function;

import manifold.ext.rt.api.Extension;
import manifold.ext.rt.api.This;
import org.jspecify.annotations.Nullable;

@Extension
public class StringExt709 {
    // Compilation error: manifold.api.gen.TypeNameParserException: expecting 'extends' or 'super'

    public static <T extends  @Nullable Object> T test1_709(@This String text, Function<String, T> mapper) {
        return mapper.apply(text);
    }

    public static <T> T test2_709(@This String text, Function<String, @Nullable T> mapper) {
        return mapper.apply(text);
    }
}