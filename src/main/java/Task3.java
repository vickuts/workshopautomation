import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] array = new int[20];
        for (int i = 0; i < 20; i++)
            array[i] = Integer.parseInt(s.nextLine());

        System.out.println("Even numbers:");
        for (int i = 0; i < 20; i++) {
            if (array[i] % 2 == 0)
                System.out.println(array[i]);
        }

        System.out.print("\n");
        System.out.println("Odd numbers:");
        for (int i = 0; i < 20; i++) {
            if (array[i] % 2 != 0)
                System.out.println(array[i]);
        }
    }
}

