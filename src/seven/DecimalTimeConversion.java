package seven;

/*
https://www.codewars.com/kata/6397b0d461067e0030d1315e/java
 */
public class DecimalTimeConversion {
    public static double toIndustrial(String time) {
        String[] splitTime = time.split(":");
        var hours = Double.parseDouble(splitTime[0]);
        var minutes = Double.parseDouble(splitTime[1]);

        return hours + (double) Math.round((minutes / 60) * 100) / 100;
    }

    public static double toIndustrial(int time) {
        return (double) Math.round(((double) time / 60) * 100) / 100;
    }

    public static String toNormal(double time) {
        int hours = (int) Math.floor(time);
        int minutes = (int) Math.round((time - hours) * 100 * 0.6);
        if (minutes == 60) {
            hours += 1;
            minutes = 0;
        }
        return String.format("%d:%02d", hours, minutes);
    }
}
