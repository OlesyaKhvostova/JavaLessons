package Homework2;
import java.util.logging.*;
import java.util.Arrays;
import java.util.Random;
import java.io.IOException;

public class programm {
    public static Logger InitLogger()
    {
        Logger logger = Logger.getLogger(programm.class.getName());
        FileHandler fh;
        try {  
            fh = new FileHandler("log.txt"); 
            logger.addHandler(fh);
            SimpleFormatter formatter = new SimpleFormatter();  
            fh.setFormatter(formatter);  
        } catch (SecurityException e) {  
            e.printStackTrace();  
        } catch (IOException e) {  
            e.printStackTrace();  
        }  

        return logger;
    }
    public static void main(String[] args) {
        Logger logger = InitLogger();
        int[] array = new int[10];
        RandomFillArray(array);

        System.out.println("Array = "+Arrays.toString(array));
        SortArray(array, false, logger);
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

    static public void SortArray(int[] array, boolean reverse, Logger logger)
    {
        
        logger.info("Array = " + Arrays.toString(array));
        
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
            logger.info("Array = " + Arrays.toString(array));
        }
    }
}
