import zoo.*;
import zoo.radio.Radio;
import zoo.radio.Sayable;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Animal> animalsList = List.of(
                new Dolphin("Посейдон")
        );
        Zoo zoo = new Zoo(animalsList, new Radio());

        for (Swimable animal : zoo.getSwimableList()) {
            System.out.println(((Animal)animal).getName());
            System.out.println(animal.getSwimSpeed());
        }
    }
}