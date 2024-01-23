package seminars.seminar4;

// реализовать стэк с помощью массива.
// нужно реализовать методы:
// size(), empty(), push(), peek(), pop().

public class ex4 {
    public static void main(String[] args) {
        myArray.capacity = 10;
        myArray.array = new int[myArray.capacity];
        myArray.topIndex = -1;

        System.out.println(myArray.empty());
        System.out.println(myArray.size());
        myArray.push(5);
        myArray.push(2);
        myArray.push(4);
        System.out.println(myArray.size());
        System.out.println(myArray.peek());

        System.out.println(myArray.pop());
        System.out.println(myArray.size());
        System.out.println(myArray.empty());

        myArray.push(6);
        myArray.push(66);
        myArray.push(666);
        myArray.push(6666);
        myArray.print();
    }
    
}

class myArray {
    static int[] array;
    static int capacity;
    static int topIndex;

    public static int size() {
        return topIndex + 1;
    }
    public static boolean empty() {
        return topIndex == -1;// size() == 0 ? true : false;
    }
    public static void push(int num) {
        array[++topIndex] = num;
    }
    public static int peek() {
        return array[topIndex];
    }
    public static int pop() {
        return array[topIndex--];
    }
    public static void print() {
        for (int i = topIndex; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }
}