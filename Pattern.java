import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Row : ");
        int num = sc.nextInt();
        
        for (int i = 1; i <= num; i++) {
            for (int j = num; j >= num - i + 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
