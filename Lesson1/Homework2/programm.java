package Lesson1.Homework2;
import java.util.Arrays;
import java.util.Random;

public class programm {
    public static void main(String[] args) {
        int[] array = new int[10];
        RandomFillArray(array);

        System.out.println("Array = "+Arrays.toString(array));
        SortArray(array, false);
        System.out.println("Sortes Array = "+Arrays.toString(array));
        
    }
    
    static public void RandomFillArray(int[] array)
    {
        Random rand = new Random();

        for(int i = 0 ; i < array.length; i++)
        {
            array[i] = rand.nextInt(0, 301);
        }
    }

    static public void SortArray(int[] array, boolean reverse)
    {
        boolean execute = true;
        while (execute)
        {
            boolean sorted = true;
            for(int i = 0; i + 1 < array.length; i++)
            {
                if (reverse)
                {
                    if (array[i] < array[i+1])
                    {
                        var temp = array[i+1];
                        array[i+1] = array[i];
                        array[i] = temp;
                        sorted = false;
                    }
                }
                else
                {
                    if (array[i] > array[i+1])
                    {
                        var temp = array[i+1];
                        array[i+1] = array[i];
                        array[i] = temp;
                        sorted = false;
                    } 
                }
            }
            execute = !sorted;
        }
    }

}
