import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("Nama depan: ");
    String firstName = scanner.next();
    
    System.out.print("Nama belakang: ");
    String lastName = scanner.next();
    
    System.out.print("Usia: ");
    int age = scanner.nextInt();
    
    System.out.println("Nama saya adalah " + firstName + " " + lastName + ".");
    System.out.println("Saya berusia " + age + " tahun.");
    
    if (age >= 18) {
      System.out.println("Saya sudah dewasa.");
    } else {
      System.out.println("Saya belum dewasa.");
    }
  }
}
