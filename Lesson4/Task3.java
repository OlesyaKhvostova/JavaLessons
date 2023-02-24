import java.util.ArrayDeque;
import java.util.Deque;

public class Task3 {

    //Дана строка содержащая только символы '(', ')', '{', '}', '[' и ']', определите,
    // является ли входная строка логически правильной.
    // Входная строка логически правильная, если:
    // 1) Открытые скобки должны быть закрыты скобками того же типа.
    // 2) Открытые скобки должны быть закрыты в правильном порядке. Каждая закрывающая скобка имеет соответствующую
    // открытую скобку того же типа.
    // ()[] = true
    // () = true
    // {[()]} = true
    // ()() = true
    // )()( = false
    
    public static void main(String[] args) {
        String value = new String("()()");
        Deque<Character> deque = new ArrayDeque<>();
        for (Character c : value.toCharArray()) {
            deque.add(c);
        }
        System.out.println("Correct " + value + " = " + validate(deque));
    }
    
    public static boolean validate(Deque<Character> deque){
        Deque<Character> stack = new ArrayDeque<>();
        for(int i = 0; deque.size() != 0;i++)
        {
            if (stack.size() == 0)
            {
                stack.add(deque.pollFirst());
            }
            else
            {
                Character bracket = deque.pollFirst();
                if ( bracket == ')' || bracket == ']' || bracket == '}')
                {
                    Boolean result = true;
                    switch (bracket)
                    {
                        case ')':result = stack.pollLast() == '('; break;
                        case ']':result = stack.pollLast() == '['; break;
                        case '}':result = stack.pollLast() == '{'; break;
                    }
                    if (!result) return result;
                }
                else
                {
                    stack.add(bracket);
                }
            }
        }
        return stack.size() == 0 ? true : false;
    }
    }