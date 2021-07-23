package com.jetbrains.textblocks;

public class TextBlockEndOfLineSpaces {
    public static void main(String[] args) {
        String longLine = """
                          Spaces at the
                          end of line are deleted in
                          text blocks. To add them
                          use this delimiter\s
                          """;

        System.out.println(longLine);
    }
}