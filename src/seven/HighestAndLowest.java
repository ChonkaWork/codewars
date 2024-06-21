package seven;

public class HighestAndLowest {


    public String highAndLow(String numbers) {
        String[] nums = numbers.split(" ");
        int min = Integer.parseInt(nums[0]);
        int max = min;
        for (String num : nums) {
            var current = Integer.parseInt(num);
            if (min > current) {
                min = current;
            }
            if (max < current) {
                max = current;
            }
        }
        return max + " " + min;
//        var sortedList = Arrays.stream(numbers.split(" ")).map(Integer::valueOf).sorted().toList();
//        return sortedList.get(sortedList.size() - 1) + " " + sortedList.get(0);
    }
}
