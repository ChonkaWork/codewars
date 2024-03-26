package seven;

/*
https://www.codewars.com/kata/5a6d3bd238f80014a2000187/train/java
 */
public class CatYearsDogYears {

    public static int[] ownedCatAndDog(final int catYears, final int dogYears) {
        var humanCatYears = (int) Math.floor(catYears < 15 ? 0 : catYears < 24 ? 1 : 2 + (double) (catYears - 24) / 4);
        var humanDogYears = (int) Math.floor(dogYears < 15 ? 0 : dogYears < 24 ? 1 : 2 + (double) (dogYears - 24) / 5);
        return new int[]{humanCatYears, humanDogYears};
    }
}
