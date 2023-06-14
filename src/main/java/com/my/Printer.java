package com.my;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Printer {

    private Printer() {}

    public static void printSortedTokens(Lexer lexer) {
        Map<TokenCategory, List<Token>> sortedMap = new LinkedHashMap<>();

        while (lexer.hasNextToken()) {
            Token token = lexer.getNextToken();
            List<Token> tokens = sortedMap.getOrDefault(token.getCategory(), new ArrayList<>());
            tokens.add(token);
            sortedMap.putIfAbsent(token.getCategory(), tokens);
        }

        sortedMap.forEach((type, tokens) -> {
            System.out.println(type + ":");
            tokens.forEach(token -> System.out.println("  " + token.getValue()));
        });
    }

    public static void printSeq(Lexer lexer) {
        boolean hasTokens = lexer.hasNextToken();

        while (hasTokens) {
            Token token = lexer.getNextToken();
            System.out.println(token.getCategory() + ": " + token.getValue());

            hasTokens = lexer.hasNextToken();
        }
    }
}
