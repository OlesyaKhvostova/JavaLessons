package Lesson1.Homework3;

public class programm {
    public static void main(String[] args) {
        for (int value = 2; value <= 100; value++)
        {
            int count = 0;
            for(int i = 2; i <= 100; i++)
            {
                if (i >= value )
                {
                    break;
                }
                
                if (value % i == 0)
                {
                    count++;
                    break;
                }
            }

            if (count == 0)
            {
                System.out.print(value + " ");
            }
        }
    }
}
