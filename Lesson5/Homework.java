import java.util.HashMap;
import java.util.List;
import java.util.TreeMap;
import java.util.Comparator;
import java.util.Map;
import java.util.ArrayList;


public class Homework {

    // Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.
    // Пусть дан список сотрудников:Иван Иванов (и остальные)
    // Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений.
    // Отсортировать по убыванию популярности.
    public static void main(final String[] args) {
        HashMap<String, List<String>> phoneBook = new HashMap<>();

        AddNumber(phoneBook, "Иван Иванов", "88001122333");
        AddNumber(phoneBook, "Иван Курицин", "88001662333");
        AddNumber(phoneBook, "Иван Курицин", "88001112333");
        AddNumber(phoneBook, "Иван Незлобин", "88001122432");
        AddNumber(phoneBook, "Сергей Потапов", "88001112453");
        AddNumber(phoneBook, "Сергей Потапов", "8800163214");
        AddNumber(phoneBook, "Сергей Курицин", "8800142421");
        AddNumber(phoneBook, "Михаил Незлобин", "880012343");

        var freqNameData = Calculate(phoneBook);
        System.out.println("Output\n");
        System.out.println(freqNameData);
    }

    public static void AddNumber(HashMap<String, List<String>> phoneBook, String name, String number)
    {
        if (!phoneBook.containsKey(name))
        {
            List<String> numbers = new ArrayList();
            phoneBook.put(name, numbers);
        }

        if (!phoneBook.get(name).contains(number))
        {
            List<String> numbers = phoneBook.get(name);
            numbers.add(number);
        }
    }

    public static TreeMap<String, Integer> Calculate(HashMap<String, List<String>> phoneBook)
    {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        DataComparator comparator = new DataComparator(map);
        TreeMap<String, Integer> treeMap = new TreeMap<>(comparator);
        
        for (String name : phoneBook.keySet())
        {
            String[] personName = name.split(" ");
            if (map.containsKey(personName[0]))
            {
                map.put(personName[0], map.get(personName[0]) + 1);
            }
            else
            {
                map.put(personName[0], 1);
            }
        }

        treeMap.putAll(map);

        return treeMap;
    }

    static class DataComparator implements Comparator<String> {
        Map<String, Integer> base;
    
        public DataComparator(Map<String, Integer> base) {
            this.base = base;
        }

        public int compare(String a, String b) {
            if (base.containsKey(a) && base.containsKey(b))
            {
                if (base.get(a) >= base.get(b))
                {
                    return -1;
                }
                else
                {
                    return 1;
                }
            }
            return 1;
        }
    }
}