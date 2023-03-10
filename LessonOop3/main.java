import java.util.ArrayList;
import java.util.LinkedList;

public class main  {
    public static void main(String[] args) {
        
        MyLinkedList myList = new MyLinkedList();
        myList.Add("Первый");
        myList.Add("Второй");
        myList.Add("Третий");
        myList.Add("Четвертый");

        for (var data : myList) {
            System.err.println(data);
        }
        
    }    
}
