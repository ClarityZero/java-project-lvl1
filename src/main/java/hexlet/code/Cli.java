package hexlet.code;

import java.util.Scanner;

class Cli {
    public static void hello() {
        System.out.print("May I have your name?");
        Scanner scanName = new Scanner(System.in);
        StringBuilder name = new StringBuilder();
        name.append(scanName.nextLine());
        System.out.println("Hello, " + name + "!");
    }
}
