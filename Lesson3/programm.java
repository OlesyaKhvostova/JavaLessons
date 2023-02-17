import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * programm
 */
public class programm {

    public static void main(String[] args) {
        List<Integer> listData = new ArrayList();
        RandomFillList(listData);
        System.out.println("List = " + listData);
        System.out.println("Max Value = " + getMax(listData));
        System.out.println("Min Value = " + getMin(listData));
        System.out.println("Avr Value = " + getAverage(listData));
        System.out.println("Even Values = " + removeEvenValue(listData));
    }

    public static void RandomFillList(List<Integer> listData)
    {
        Random rand = new Random();
        for(int i = 0 ; i < 10; i++)
        {
            listData.add(rand.nextInt(0, 301));
        }
    }

    // Нужно удалить из него четные числа
public static List<Integer> removeEvenValue(List<Integer> list){
    var evenList = new ArrayList<Integer>();
    for (Integer integer : list) {
        if ( integer % 2 == 0)
        {
            evenList.add(integer);
        }
    }
    return evenList;
}

// Найти минимальное значение
public static Integer getMin(List<Integer> list){

    Integer minValue = 0;
    if (list.size() != 0)
    {
        minValue = list.get(0); 
    }
    
    for (Integer integer : list) {
        if ( integer < minValue)
        {
            minValue = integer;
        }
    }
    return minValue;
}

// Найти максимальное значение
public static Integer getMax(List<Integer> list){
    Integer maxValue = 0;
    if (list.size() != 0)
    {
        maxValue = list.get(0); 
    }
    
    for (Integer integer : list) {
        if ( integer > maxValue)
        {
            maxValue = integer;
        }
    }
    return maxValue;
}

// Найти среднее значение
public static Integer getAverage(List<Integer> list){
    Integer allValue = 0;
    
    for (Integer integer : list) {
        allValue += integer;

    }
    return allValue/list.size();
}
}