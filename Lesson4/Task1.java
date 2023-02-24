import java.util.Deque;
import java.util.Arrays;
import java.util.ArrayDeque;

public class Task1 {

    // Дан Deque состоящий из последовательности цифр.
    // Необходимо проверить, что последовательность цифр является палиндромом
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<Integer>(Arrays.asList(1,2,3,5,6,7,8));
        System.out.println("Is polyndrom = "+checkOn(deque));
    }
    
    
    public static boolean checkOn(Deque<Integer> deque){
        if (deque.size() == 1)
        {
            return true;
        }
        boolean result = true;
        while (result && deque.size() > 1)
        {
            result = deque.pollFirst() == deque.pollLast();
        }
    
        return result;
    }
    }