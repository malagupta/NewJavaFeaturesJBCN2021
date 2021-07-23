package com.jetbrains.textblocks;

public class TextBlocks {
    public static void main(String[] args) {
        String aString = "This is a small string but I see that is growing in size"
                         + "still okay but what if"
                         + "it starts using other characters  like the double quotes"
                         + "and then is when the problem starts with"
                         + "all the escape sequences \" ";

        String json = "{\n" +
                      "    \"name\": \"Sonam Wangchuk\"\n" +
                      "    \"movement\": \"#ILiveSimply\",\n" +
                      "    \"result\": \"Let planet simply live\"\n" +
                      "}";

        String textBlock = """
                           {
                               "name": "Sonam Wangchuk",
                               "movement": "#ILiveSimply",
                               "result": "Let planet simply live"
                           }
                           """;

        String html = """
                  <P>Stop generating 6 million tons of plastic waste</P>
                      <UL>
                         <LI>Keep a spoon, fork, knife in your bag.
                         <LI>Avoid using single use plastic cutlery.
                      </UL>
                      """;
    }
}
