import java.util.Random;
class daice {
  public static void main(String args[]) {
    System.out.println("Rolling dice...");
    Random rand = new Random();
    int one = rand.nextInt(6) + 1;
    int two = rand.nextInt(6) + 1;
    System.out.println("Die 1: " + one);
    System.out.println("Die 2: " + two);
    int total = one + two;
    System.out.println("Total value: " + total);
  }
}
