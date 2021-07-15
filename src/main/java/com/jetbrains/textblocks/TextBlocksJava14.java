package com.jetbrains.textblocks;

public class TextBlocksJava14 {
    public static void main(String[] args) {
        String longLine = """
                          Spaces at the
                          end of line are deleted in
                          text blocks. To add them
                          use this delimiter \s
                          or add spaces to\s
                          your text when you copy\040
                          paste it.""";

        System.out.println(longLine);
    }
}