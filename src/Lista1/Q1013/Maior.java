package Lista1.Q1013;

import java.util.Scanner;

public class Maior {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();

        int MaiorAB = (A + B + Math.abs(A - B)) / 2;
        int MaiorABC = (MaiorAB + C + Math.abs(MaiorAB - C)) / 2;

        System.out.println(MaiorABC + " eh o maior");

    }

}
