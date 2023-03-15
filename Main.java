import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner= new Scanner(System.in);
    System.out.println("Podaj a: ");
    int a = scanner.nextInt();
    System.out.println("Podaj b: ");
    int b = scanner.nextInt();
    int pot1=(int)Math.pow(a,b);
    int pot2=(int)Math.pow(b,a);
    int wynik = pot1 + pot2;
    System.out.println("Wynik to: " + wynik);
  }
}