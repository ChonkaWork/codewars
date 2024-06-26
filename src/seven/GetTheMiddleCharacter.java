package seven;

/*

Get the Middle Character
https://www.codewars.com/kata/56747fd5cb988479af000028/train/java
 */
public class GetTheMiddleCharacter {
    public static void main(String[] args) {
        System.out.println(getMiddle("Heolio"));
    }

    public static String getMiddle(String word) {
        int middleIndex = word.length() / 2;
        return word.length() % 2 != 0
                ? "" + word.charAt(middleIndex)
                : "" + word.charAt(middleIndex - 1) + word.charAt(middleIndex);
    }
}
