import java.util.Deque;
import java.util.Arrays;
import java.util.ArrayDeque;

public class Task2 {

    //Даны два Deque представляющие два неотрицательных целых числа. Цифры хранятся в обратном порядке,
    // и каждый из их узлов содержит одну цифру.
    // Сложите два числа и верните сумму в виде связанного списка.
    public static void main(String[] args) {
        Deque<Integer> d1 = new ArrayDeque<>(Arrays.asList(1,2,3));
        Deque<Integer> d2 = new ArrayDeque<>(Arrays.asList(5,4,7));
        // result [6,6,0,1]
        var sumDeque = sum(d1, d2);
        System.out.println("Array " + sumDeque);
    }
    
    
    public static Deque<Integer> sum(Deque<Integer> d1, Deque<Integer> d2) {
    
        var arrayDeque = new ArrayDeque<Integer>();
        while(d1.size() > 0 && d2.size() > 0)
        {
            Integer sum = d1.pollFirst() + d2.pollFirst();
            if (sum > 9)
            {
                Integer part = sum%10;
                arrayDeque.add(part);
                arrayDeque.add((sum - part)/10);
            }
            else
            {
                arrayDeque.add(sum);
            }
        }
        return arrayDeque;
    }
    }