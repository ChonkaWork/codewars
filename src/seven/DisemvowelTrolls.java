package seven;
/*
Disemvowel Trolls
https://www.codewars.com/kata/52fba66badcd10859f00097e/train/java
 */
public class DisemvowelTrolls {
    public static String disemvowel(String str) {
        return str.replaceAll("[aeiouAEIOU]","");
    }
}
