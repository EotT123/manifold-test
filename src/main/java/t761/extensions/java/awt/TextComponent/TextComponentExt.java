package t761.extensions.java.awt.TextComponent;

import java.awt.*;

import manifold.ext.rt.api.Extension;
import manifold.ext.rt.api.Self;
import manifold.ext.rt.api.This;

@Extension
public class TextComponentExt {

    public static @Self TextComponent editable(@This TextComponent textComponent, boolean editable) {
        textComponent.setEditable(editable);
        return textComponent;
    }
}
