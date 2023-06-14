package com.my;

import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Lexer {

    private final Matcher matcher;
    private final Map<TokenCategory, Pattern> regularExpressions;

    public Lexer(String input) {
        Pattern pattern = Utils.initializePattern();
        this.matcher = pattern.matcher(input);
        regularExpressions = Utils.initializeRegularExpressions();
    }

    public Token getNextToken() {
        String token = matcher.group();
        for (Map.Entry<TokenCategory, Pattern> entry : regularExpressions.entrySet()) {
            TokenCategory type = entry.getKey();
            Pattern pattern = entry.getValue();
            Matcher typeMatcher = pattern.matcher(token);
            if (typeMatcher.matches()) {
                return new Token(type, token);
            }
        }
        return new Token(TokenCategory.ERROR, token);
    }

    public boolean hasNextToken() {
        return matcher.find();
    }
}
