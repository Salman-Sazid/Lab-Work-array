import java.util.Random;

public class smallestNumber {

    public static void main(String[] args)
    {
        sumWithoutSmallest();
    }
    public static int sumWithoutSmallest()
    {
        Random random = new Random();
        int numbers[] = new int[10] ;
        for(int i= 0;i<numbers.length;i++) {
            numbers[i] = random.nextInt(20);
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        int smallestNum = Integer.MAX_VALUE;
        int sum = 0;
        for (int j : numbers)
        {
            if(smallestNum > j)
                smallestNum = j;
            sum=sum+j;
        }
        sum=sum-smallestNum;
        System.out.println(sum);
        return sum - smallestNum;
    }
}
