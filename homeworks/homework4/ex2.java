package homeworks.homework4;

// enqueue() - помещает элемент в конец очереди
// dequeue() - возвращает первый элемент из очереди и удаляет его
// first() - возвращает первый элемент из очереди, не удаляя
// getElements() - возвращает все элементы в очереди

import java.util.LinkedList;

class MyQueue<Object> {
        // Напишите свое решение ниже
    static LinkedList<Integer> ll = new LinkedList<>();
    

    public void enqueue(Integer element){
        // Напишите свое решение ниже
        ll.addLast(element);
    }

    public int dequeue(){
        // Напишите свое решение ниже
        return(ll.removeFirst());
    }

    public int first(){
        // Напишите свое решение ниже
        return ll.getFirst();
    }

    public LinkedList<Integer> getElements() {
        // Напишите свое решение ниже
        return ll;
    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class ex2 {
    public static void main(String[] args) {
        MyQueue<Integer> queue;
        queue = new MyQueue<>();

        if (args.length == 0) {
        // При отправке кода на Выполнение, вы можете варьировать эти параметры
            queue.enqueue(1);
            queue.enqueue(10);
            queue.enqueue(15);
            queue.enqueue(5);
        } else {
            queue.enqueue(Integer.parseInt(args[0]));
            queue.enqueue(Integer.parseInt(args[1]));
            queue.enqueue(Integer.parseInt(args[2]));
            queue.enqueue(Integer.parseInt(args[3]));
        }

        System.out.println(queue.getElements());

        queue.dequeue();
        queue.dequeue();
        System.out.println(queue.getElements());

        System.out.println(queue.first());
    }
}