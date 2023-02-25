import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Homework {

// 1) Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
// 2) Создать коллекцию ноутбуков.
// 3) Написать мапу, которая будет содержать критерий (или критерии) фильтрации и выведет
//      ноутбуки, отвечающие фильтру.
//      Пример: ОЗУ - Значение, Объем ЖД - Значение, Операционная система - Значение, Цвет - Значение
// 4) Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.
public static void main(String[] args) {
    var notebooks = initListNotebooks();
    Map<String, String> params = new HashMap<>();
    params.put("MinRam", "16");
    params.put("Os", "Win10");
    params.put("Color", "White");
    var list = filter(params, notebooks);
    for (Notebook notebook : list) {
        System.out.println(notebook.toString());
    }
    
}

public static List<Notebook> initListNotebooks(){
    List<Notebook> listNotebook = new ArrayList<Notebook>();
    listNotebook.add(new Notebook(8, 126, "Win10", "White"));
    listNotebook.add(new Notebook(16, 126, "Win10", "White"));
    listNotebook.add(new Notebook(8, 256, "Win10", "Black"));
    listNotebook.add(new Notebook(64, 1024, "Win10", "Blue"));
    listNotebook.add(new Notebook(8, 126, "WinXP", "Green"));
    listNotebook.add(new Notebook(32, 512, "Win10", "White"));
    listNotebook.add(new Notebook(16, 126, "Win11", "Black"));
    listNotebook.add(new Notebook(32, 512, "Linux", "White"));
    listNotebook.add(new Notebook(8, 1024, "Linux", "White"));
    return listNotebook;
}

public static List<Notebook> filter(Map<String, String> params, List<Notebook> notebooks){
    List<Notebook> targets = new ArrayList<Notebook>();
    for (Notebook notebook : notebooks) {
        
        if (notebook.IsNeeded(params))
        {
            targets.add(notebook);
        }
    }
    return targets;
}
}