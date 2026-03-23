package extensions.java.nio.file.Path;

import java.nio.file.Path;

import manifold.ext.rt.api.Extension;
import manifold.ext.rt.api.This;
import org.apache.commons.lang3.StringUtils;

@Extension
public class PathExt {

    public static String getExtension(@This Path path) {
        return StringUtils.substringAfterLast(path.getFileName().toString(), ".");
    }
}
