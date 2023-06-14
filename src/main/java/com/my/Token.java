package com.my;

public class Token {

    private final String value;
    private final TokenCategory category;

    public Token(TokenCategory category, String value) {
        this.value = value;
        this.category = category;
    }

    public TokenCategory getCategory() {
        return category;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return category.name() + "(" + value + ")";
    }
}