package com.my;

public class Constants {

    private Constants() {}

    static final String WHITESPACE = "\\s+";
    static final String COMMENT = "(//.*)|(/\\*([\\s\\S]*?)\\*/)";
    static final String NUMERICAL = "[-+]?\\d*\\.?\\d+";
    static final String STRING = "\"([^\"\\\\]|\\\\.)*\"";
    static final String IDENTIFIER = "[a-zA-Z_$][a-zA-Z0-9_$]*";
    static final String OPERATOR = "=|\\+\\+|--|==|=~|!=|!==|<=|>=|<<|>>|>>>|\\+|-|\\*|/|%|\\|\\||&&|&|\\||\\^|~|!|<|>|\\?\\?\\?|\\?\\?|\\?|:|\\.|,";
    static final String PUNCTUATION = "[\\(\\)\\[\\]\\{\\};]";
    static final String KEYWORD = "\\b(?:await|break|case|catch|class|const|continue|debugger|" +
            "default|delete|do|else|enum|export|extends|false|finally|for|function|if|implements|import|in|instanceof|" +
            "interface|let|new|null|package|private|protected|public|return|super|switch|static|this|throw|try|true|" +
            "typeof|var|void|while|with|yield)\\b";
}
