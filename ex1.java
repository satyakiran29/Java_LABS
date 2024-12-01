import java.util.Scanner;

public class ex1 {
  

    public static int calculatePermutations(int n, int r) {
        return fact(n) / fact(n - r);
    }

    public static int calculateCombinations(int n, int r) {
        return fact(n) / (fact(r) * fact(n - r));
    }

    public static int fact(int num) {
        int fact = 1,i;
        for (i = 2; i <= num; i++) {
            fact=fact*i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the total number of elements (n): ");
        int n = scanner.nextInt();

        System.out.print("Enter the number of elements to be selected (r): ");
        int r = scanner.nextInt();

        long permutations = calculatePermutations(n, r);
        long combinations = calculateCombinations(n, r);

        System.out.println("Permutations (nPr): " + permutations);
        System.out.println("Combinations (nCr): " + combinations);
    }
}



