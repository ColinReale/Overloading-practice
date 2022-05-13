import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Create a counter object starting at 0");
        Counter count = new Counter();
        System.out.println(count);
        System.out.println("Increment");
        count.increase();
        System.out.println(count);
        System.out.println("Decrement");
        count.decrease();
        System.out.println(count);
        System.out.println("Create counter with any given starting value");
        System.out.print("Enter value for starting value: ");
        int startVal = Integer.parseInt(in.nextLine());
        Counter counterNow = new Counter(startVal);
        System.out.println(counterNow);
        System.out.println("Enter value to increase counter by: ");
        int increment = Integer.parseInt(in.nextLine());
        counterNow.increase(increment);
        System.out.println(counterNow);
        System.out.println("Enter value to decrease counter by: ");
        int decrement = Integer.parseInt(in.nextLine());
        counterNow.decrease(decrement);
        System.out.println(counterNow);
    }
}