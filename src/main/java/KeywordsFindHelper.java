package main.java;

import java.util.List;
import java.util.Arrays;

public class KeywordsFindHelper {

    private static String[] keywords = new String[]{"byte", "short", "int", "long", "char", "float", "double",
            "boolean", "if", "else", "switch", "case", "default", "while", "do", "break", "continue", "for", "try",
            "catch", "finally", "throw", "throws", "private", "proteted", "public", "import", "package", "class",
            "interface", "extends", "implements", "static", "final", "void", "abstract", "native", "new", "return", "this",
            "super", "synchronized", "volatile", "const", "goto", "instanceof", "enum", "transient", "strictfp"};

    public static final List<String> listKeywords = Arrays.asList(keywords);


    public static boolean isJavaKeyword(String word) {
        return (listKeywords.contains(word)) ? true : false;

    }
}