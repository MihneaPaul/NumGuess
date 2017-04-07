/**
 * Created by Mihnea on 07.04.2017.
 */

    // meniu
    // metoda pentru comparare
    import java.util.Scanner;
public class NumGuess {
    public static int generated;
    static boolean b = false;

    public static int generate(int maximumAllowed) {
        return Math.abs(new java.util.Random().nextInt() % maximumAllowed) + 1;
    }

    static int comparare(int x) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Type a number: ");
//        int number = scanner.nextInt();
        if (x > generated) {
            System.out.println("Try a smaller number.");
        }
        if (x < generated) {
            System.out.println("Try a bigger number.");
        }
//        if(x == generated){
//            System.out.println("You guessed it!");
//        }
        return x;
    }

    public static void meniu() {
        int nums[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < nums.length; i = i + 2) {
            System.out.print("It could be " + nums[i]);
            if ((nums[i] + 1) > 10) {
                break;
            }
            System.out.println("        It could be " + (nums[i] + 1));

        }

    }

    public static void main(String[] args) {
        generated = generate(10);
        Scanner scanner = new Scanner(System.in);
        meniu();
        do {
            System.out.println("\n\nPick the number: ");
            int number = scanner.nextInt();
            if (number < 0 || number > 10) {
                System.out.println("Try a number between 0 and 10...");
            }
//

            if (comparare(number) == generated) {
                System.out.println("You guessed it!");
                b = false;
                break;
            }
        }
            while (!b) ;
    }
}