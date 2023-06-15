import java.util.Scanner;
import java.util.Random;

class comment{
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.println("What is your name?");
    String name = scanner.next();
    System.out.println("Hello, " + name + "!");
    System.out.println("Rolling dice...");
    Random rand = new Random();
    int one = rand.nextInt(6) + 1;
    int two = rand.nextInt(6) + 1;
    System.out.println("Die 1: " + one);
    System.out.println("Die 2: " + two);
    int total = one + two;
    System.out.println("Total value: " + total);
    if(total>7) System.out.println(name +" won!");
    else System.out.println(name +" lost");
    }
}
