package t761.extensions.java.awt.TextArea;

import java.awt.*;

import manifold.ext.rt.api.Extension;
import manifold.ext.rt.api.Self;
import manifold.ext.rt.api.This;

@Extension
public class TextAreaExt {

    public static @Self TextArea editable(@This TextArea textArea, boolean editable) {
        textArea.setEditable(editable);
        return textArea;
    }
}