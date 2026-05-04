package org.example;

public class StringUtilities {
    // Refer to Java Basics 1 for common string methods

    // Add a static function called shortString that takes a String parameter and returns true if the string has fewer than 5
    // characters

    public static boolean shortString(String word){
        return word !=null && word.length() < 5;
    }

    // Add a static function called firstLetter that takes a String parameter and returns the first character of the string
    public static char firstLetter(String word){
        return word.charAt(0);
        //I wanted to do validation here but not sure about throwing errors in java yet.
    }

    // Add a static function called censorAsparagus that takes a String parameter and returns the string with all instances of
    // "asparagus" (lowercase only) replaced with 4 stars: "****"
    public static String censorAsparagus (String phrase) {
        if(phrase.contains("asparagus")){
           return phrase.replace("asparagus", "****");
        } else {
            return phrase;
        }
    }
    // Add a static function called bigger that takes two String parameters and returns the longer of the two strings. If the
    // strings are the same length, return the first string.

    public static String bigger(String a, String b){
        if (a.length() >= b.length()){
            return a;
        } else {
            return b;
        }
    }

    //local testing of censorAsparagus.
    public static void main(String[] args) {
       System.out.println(censorAsparagus("asparagus"));
       System.out.println(censorAsparagus("apple"));
       System.out.println(censorAsparagus("my favorite veg is asparagus"));
       System.out.println(censorAsparagus("my favorite veg is tomatoes"));
       System.out.println(censorAsparagus("Here is asparagus and there is asparagus"));

    }
}
