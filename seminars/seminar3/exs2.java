package seminars.seminar3;

// Заполнить список названиями планет Солнечной
// системы в произвольном порядке с повторениями.
// 📌 Вывести название каждой планеты и количество его
// повторений в списке.
// Задание состоит из двух блоков
// Задание №2.2 (если выполнено первое задание)
// 📌 Пройти по списку из предыдущего задания и удалить
// повторяющиеся элементы.

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class exs2 {

    static List<String> makeRandomPlanetsList() {
        List<String> planets = new ArrayList<>();
        planets.add("Юпитер");
        planets.add("Сатурн");
        planets.add("Венера");
        planets.add("Нептун");
        planets.add("Марс");
        planets.add("Венера");
        planets.add("Земля");
        planets.add("Марс");
        planets.add("Марс");
        planets.add("Сатурн");

        return planets;
    }

    static void countRepeatPlanet(List<String> planets) {
        Collections.sort(planets);
        String repeatPlanet = planets.get(0);
        int counter = 1;

        for (int i = 1; i < planets.size(); i++) {
            if (planets.get(i).equals(repeatPlanet) && i != planets.size() - 1) {
                counter++;
            }
            else {
                System.out.printf("%s: %d\n", repeatPlanet, counter);
                repeatPlanet = planets.get(i);
                counter = 1;
            }
        }
        System.out.printf("%s: %d\n", repeatPlanet, counter);

    }

    static void removeRepeatition(List<String> planets) {

        // 1
        // Collections.sort(planets);
        // String repeatPlanet = "";
        // int meetCount = 0;
        // Iterator<String> iter = planets.iterator();

        // while (iter.hasNext()) {
        //     String pl = iter.next();
        //     if (repeatPlanet.equals(pl) && meetCount > 0) {
        //         iter.remove();
        //     }
        //     else {
        //         meetCount = 0;
        //         repeatPlanet = pl;
        //     }
        //     meetCount++;
        // }

        // 2
        Collections.sort(planets);
        String currentPlanet = planets.get(planets.size() - 1);

        for (int i = planets.size()-2; i >= 0; i--) {
            if (planets.get(i).equals(currentPlanet)) {
                planets.remove(i);
            }
            else {
                currentPlanet = planets.get(i);
            }
        }
    }
    public static void main(String[] args) {
        List<String> planets = makeRandomPlanetsList();
        countRepeatPlanet(planets);
        removeRepeatition(planets);
        System.out.println(planets);
    }
}