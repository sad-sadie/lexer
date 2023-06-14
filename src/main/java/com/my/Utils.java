package com.my;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.regex.Pattern;

import static com.my.TokenCategory.*;

public class Utils {

    private Utils() {}
    public static Map<TokenCategory, Pattern> initializeRegularExpressions() {
        Map<TokenCategory, Pattern> map = new LinkedHashMap<>();
        map.put(COMMENT, Pattern.compile(Constants.COMMENT));
        map.put(KEYWORD, Pattern.compile(Constants.KEYWORD));
        map.put(WHITESPACE, Pattern.compile(Constants.WHITESPACE));
        map.put(NUMERICAL, Pattern.compile(Constants.NUMERICAL));
        map.put(STRING, Pattern.compile(Constants.STRING));
        map.put(IDENTIFIER, Pattern.compile(Constants.IDENTIFIER));
        map.put(OPERATOR, Pattern.compile(Constants.OPERATOR));
        map.put(PUNCTUATION, Pattern.compile(Constants.PUNCTUATION));
        return map;
    }

    public static Pattern initializePattern() {

        return Pattern.compile(
                "(" + Constants.NUMERICAL + ")"
                        + "|(" + Constants.COMMENT + ")"
                        + "|(" + Constants.KEYWORD + ")"
                        + "|(" + Constants.WHITESPACE + ")"
                        + "|(" + Constants.STRING + ")"
                        + "|(" + Constants.IDENTIFIER + ")"
                        + "|(" + Constants.OPERATOR + ")"
                        + "|(" + Constants.PUNCTUATION + ")"
                        + "|(.+)"
        );
    }
}
