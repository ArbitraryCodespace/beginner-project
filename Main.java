import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("\t # This is a Mad Libs clone in java #\n\n");
        System.out.println("please input a adjective: ");

        String adjectiveOne = in.nextLine();

        System.out.println("please input a noun: ");

        String nounOne = in.nextLine();

        System.out.println("please input an adjective: ");

        String adjectiveTwo = in.nextLine();

        System.out.println("please input an exclamation: ");

        String exclaOne = in.nextLine();

        System.out.println("please input a food: ");

        String foodOne = in.nextLine();

        System.out.println("please input a age: ");

        String ageOne = in.nextLine();

        System.out.println("\t\n\n# Time for the finished product!!! # \n\n");

        System.out.println("\tyou are not " + adjectiveOne + " but why would you ever run and/or open this " + nounOne + ". the thought of it is " + adjectiveTwo + "!\n" +
                "\n" +
                "\n" +
                "anyway, do you like " + foodOne + "? me too! this \"story\" is getting older than a " + ageOne + " year old. see ya!\n\n\n\n");

        System.out.println("press anything to quit");

        String exitCode = in.next();
    }
}
