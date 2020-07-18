package B1_IntroductionJava.BT1_HienThiLoiChao;

import java.util.Scanner;

public class DisplayName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name");
        String name = scanner.nextLine();
        System.out.println("Hello " + name);
    }
}
