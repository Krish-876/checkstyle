package org.checkstyle.suppressionxpathfilter.blocks.emptyblock;

public class InputXpathEmptyBlockTry {

    private void emptyTry() {
        try {} // warn
        catch (Exception ex) {
            // ok
        }
    }

}
