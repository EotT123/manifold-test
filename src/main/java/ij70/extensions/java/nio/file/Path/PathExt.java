package ij70.extensions.java.nio.file.Path;

import java.nio.file.Files;

import manifold.ext.rt.api.Extension;
import manifold.ext.rt.api.ExtensionSource;


@ExtensionSource(source = Files.class)
@Extension
public class PathExt {

    // Using an explicit extension works fine
    //public static Stream<Path> list(@This Path path) throws IOException {
    //    return Files.list(path);
    //}
}
