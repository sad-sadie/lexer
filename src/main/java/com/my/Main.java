package com.my;

public class Main {


    public static void main(String[] args) {
        String input = "function getRandomNumber(min, max) {\n" +
                "  return Math.floor(Math.random() * (max - min + 1)) + min;\n" +
                "}\n" +
                "\n" +
                "var randomArray = [];\n" +
                "var length = getRandomNumber(5, 10);\n" +
                "\n" +
                "for (var i = 0; i < length; i++) {\n" +
                "  var randomNumber = getRandomNumber(1, 100);\n" +
                "  randomArray.push(randomNumber);\n" +
                "}\n" +
                "\n" +
                "console.log(\"Random Array:\", randomArray);\n";
        Lexer lexer = new Lexer(input);
        Printer.printSortedTokens(lexer);
       // Printer.printSeq(lexer);
    }


}
