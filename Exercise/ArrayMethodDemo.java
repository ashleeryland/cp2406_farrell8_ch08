/**
 * Created by rylan on 27/08/2016.
 */
public class ArrayMethodDemo
{
    public static void main (String args[])
    {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int limit = 4;
        displayArray(numbers);
        displayArrayReverse(numbers);
        displayArraySum(numbers);
        displayArrayLessThan(numbers, limit);
        displayArrayHigherThanAverage(numbers);
    }
    public static void displayArray(int[] numbers)
    {
        System.out.println("The numbers in the array are ");
        for (int i = 0; i < numbers.length; i++)
            System.out.print(numbers[i] + "  ");
    }
    public static void displayArrayReverse(int[] numbers)
    {
        System.out.println("\nThe numbers in the array reversed are ");
        for(int i = numbers.length - 1; i >= 0; -- i)
            System.out.print(numbers[i] + "  ");
    }
    public static void displayArraySum(int[] numbers)
    {
        int total = 0;
        for (int i = 0; i < numbers.length; i++)
        {
            total += numbers[i];
        }
        System.out.println("\nThe numbers in the array summed together equals " + total);
    }
    public static void displayArrayLessThan(int[] numbers, int limit)
    {
        for(int i = 0; i < numbers.length; i++)
            if(numbers[i] < limit)
                System.out.print(numbers[i] + " ");
        System.out.println("are less than the limit " + limit);

    }
    public static void displayArrayHigherThanAverage(int[] numbers)
    {
        int sum = 0;
        double average;
        for(int i = 0; i < numbers.length; ++i)
            sum += numbers[i];
        average = sum * 1.0 / numbers.length;
        System.out.println("The average is " + average);
        for(int i = 0; i < numbers.length; i++)
            if(numbers[i] > average)
                System.out.print(numbers[i] + "  ");
        System.out.println("are greater than the average");
    }
}
