package seminars.seminar3;

// Каталог товаров книжного магазина сохранен в виде двумерного
// списка List<ArrayList<String>> так, что на 0й позиции каждого
// внутреннего списка содержится название жанра, а на остальных
// позициях - названия книг. Напишите метод для заполнения данной
// структуры.

import java.util.ArrayList;
import java.util.List;

public class exs4 {

    static ArrayList<String> addBook(String genre, String[] books) {
        ArrayList<String> genreList = new ArrayList();
        genreList.add(genre);

        for (String book : books) {
            genreList.add(book);
        }
        return genreList;
    }
    public static void main(String[] args) {
        List<ArrayList<String>> catalog = new ArrayList<>();
        catalog.add(addBook("Сказки1", new String[] {"Красная шапочка1", "Колобок1", "Три поросенка1"}));
        catalog.add(addBook("Сказки2", new String[] {"Красная шапочка2", "Колобок2", "Три поросенка2"}));
        catalog.add(addBook("Сказки3", new String[] {"Красная шапочка3", "Колобок3", "Три поросенка3"}));
        // System.out.println(catalog);

        for (ArrayList<String> ArrayList : catalog) {
            System.out.println(ArrayList);
        }
    }
}
