import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("\t # This is a Mad Libs clone in java #\n\n");
        System.out.println("\t please input a adjective: ");
        String adjectiveOne = in.nextLine();
        System.out.println("\t you wrote: " + adjectiveOne);

    }
}
