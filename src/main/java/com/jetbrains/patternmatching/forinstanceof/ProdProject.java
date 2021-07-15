package com.jetbrains.patternmatching.forinstanceof;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

class ProdProject extends Project {
    Tree modules;

    void process(Font font, int size) {
        final List<Node> list = modules.getChildren();
        for (Iterator<Node> i = list.iterator(); i.hasNext();) {
            final Object o = i.next();
            if (o instanceof LetterNode) {
                final LetterNode letterNode = (LetterNode) o;
                if (letterNode.isLatin()) {
                    if (isLetterTrueFont(letterNode.nodeValue, font, size)) {
                        i.remove();
                    }
                }
            }
        }
    }

    boolean isLetterTrueFont(char letter, Font font, int size) {
        // To:Do - define more code here
        return true;
    }
}

class Font {
}

class Node {
    char nodeValue;
    public char getNodeValue() {
        return nodeValue;
    }
    public void setNodeValue(char nodeValue) {
        this.nodeValue = nodeValue;
    }
}

class Tree {
    Map<String, Node> childNodes;
    public Map<String, Node> getChildNodes() {
        return childNodes;
    }
    public void setChildNodes(Map<String, Node> childNodes) {
        this.childNodes = childNodes;
    }
    ArrayList<Node> children;
    ArrayList<Node> getChildren() {
        return children;
    }
}

class LetterNode extends Node {
    boolean isLatin() {
        return true;
    }
}

    /*void process2(Font font, int size) {
        final List<Node> list = modules.getChildren();
        for (Iterator<Node> i = list.iterator(); i.hasNext();) {
            final Object o = i.next();
            if (o instanceof LetterNode) {
                final LetterNode letterNode = (LetterNode) o;
                if (letterNode.isLatin()) {
                    if (isLetterTrueFont(letterNode.nodeValue, font, size)) {
                        i.remove();
                    }
                }
            }
        }
    }*/

/*
    After refactoring

    void process(Font font, int size) {
        ((List<Node>) modules.getChildren()).removeIf(o -> o instanceof final LetterNode letterNode
                && letterNode.isLatin()
                && isLetterTrueFont(letterNode.nodeValue, font, size));
    }
    */

    /*
    public boolean equals(Object var1) {
        if (var1 instanceof String) {
            String var2 = (String)var1;
            if (this.location != null && var2.getBytes() != null) {
                return this.getClass().equals(var2.getClass());
            } else {
                return var2.toString() == this.toString();
            }
        } else {
            return false;
        }
    }
*/
