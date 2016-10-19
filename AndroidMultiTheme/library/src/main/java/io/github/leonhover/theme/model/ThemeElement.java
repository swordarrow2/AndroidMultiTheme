package io.github.leonhover.theme.model;

/**
 * Created by leonhover on 16-9-27.
 */

public class ThemeElement {

    private int tagKey;
    private String attrName;

    public ThemeElement(int tagKey, String attrName) {
        this.tagKey = tagKey;
        this.attrName = attrName;
    }

    public int getTagKey() {
        return tagKey;
    }

    public String getAttrName() {
        return attrName;
    }

    @Override
    public String toString() {
        return "ThemeElement:{ tagKey:" + this.tagKey + ", attrName:" + this.attrName + "}";
    }
}
