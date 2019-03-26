package main.java;

public class KeywordsFindHelper {
    public static final String[] keywords= new String[]{"byte", "short", "int", "long", "char", "float", "double",
            "boolean", "if", "else", "switch", "case","default", "while", "do", "break", "continue", "for", "try",
            "catch", "finally", "throw", "throws","private","proteted","public","import", "package", "class",
            "interface", "extends", "implements", "static", "final", "void", "abstract", "native","new","return","this",
            "super","synchronized","volatile","const","goto","instanceof","enum","transient","strictfp"};



    public static boolean isJavaKeyword(String word){
        for (int i=0; i<keywords.length;i++){
            if(keywords[i].equals(word)){
                return true;
            }
        }
        return false;
    }
}
