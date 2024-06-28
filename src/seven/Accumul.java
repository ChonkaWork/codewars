package seven;

public class Accumul {
    public static String accum(String s) {
        var letters = s.split("");
        var sb = new StringBuilder();
        for (int i = 0; i < letters.length; i++) {
            String letter = letters[i];

            sb.append(letter.toUpperCase()).append(letter.toLowerCase().repeat(i));
            if (i != letters.length - 1) {
                sb.append("-");
            }
        }
        return sb.toString();
    }

}
