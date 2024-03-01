package seven;

public class SumOfSequence{
    public static int sequenceSum(int start, int end, int step) {
        int sum = 0;
        int i = start;

        while(i <= end){
            sum+= i;
            i+= step;
        }

        return sum;
    }
}
