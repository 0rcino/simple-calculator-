public class calcu{
  public static void main(String args[]) {
    
    int a = 10, b = 5;
    int sum, sub, multi, divi, modu;

    sum = a + b;
    sub = a - b;
    multi = a * b;
    divi = a / b;
    modu = a % b;
    
    System.out.println("Addition: " + sum);
    System.out.println("Subtraction: " + sub);
    System.out.println("Multipliction: " + multi);
    System.out.println("Division: " + divi);
    System.out.println("Modulus: " + modu);
  }
}