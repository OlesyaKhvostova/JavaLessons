package Lesson1.Homework1;

import java.util.Random;

/**
 * programm
 */
public class programm {

public static void main(String[] args) {
    Random rand = new Random();
    int[] array = new int[10];
    int minValue = 1000;
    int maxValue = -1;
    int summ = 0;
    float avarageValue = -1;

    for(int i = 0 ; i < array.length; i++)
    {
        array[i] = rand.nextInt(0, 301);

        if (minValue > array[i])
        {
            minValue = array[i];
        }

        if (maxValue < array[i])
        {
            maxValue = array[i];
        }
        summ += array[i];
    }
    avarageValue = (float)summ / array.length;

    StringBuilder stringOutput = new StringBuilder("Array = ");
    for(int item : array)
    {
        stringOutput.append(item);
        stringOutput.append("; ");
    }
    stringOutput.append(String.format("Min = %d Max = %d Avr = %f", minValue, maxValue, avarageValue));
    System.out.println(stringOutput);
    
}    
}
