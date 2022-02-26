import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("Jumlah orang: ");
    int total = scanner.nextInt();
    
    int totalAge = 0;
    
    for (int i = 0; i < total; i++) {
    System.out.println("Orang ke " + (i + 1));
   
    System.out.print("Nama depan: ");
    String firstName = scanner.next();

    System.out.print("Nama belakang: ");
    String lastName = scanner.next();

    System.out.print("Usia: ");
    int age = scanner.nextInt();

    System.out.print("Tinggi Badan(m): ");
    double height = scanner.nextDouble();

    System.out.print("Berat Badan(kg): ");
    double weight = scanner.nextDouble();

    System.out.println("Nama saya adalah " + firstName + " " + lastName + ".");
    System.out.println("Saya berusia " + age + " tahun.");

    if (age >= 18) {
      System.out.println("Saya sudah dewasa.");
    } else {
      System.out.println("Saya belum dewasa.");
    }

    System.out.println("Tinggi Badan saya " + height + " m.");
    System.out.println("Berat Badan saya " + weight + " kg.");

    double bmi = weight / height / height;
    System.out.println("Nilai BMI saya " + Math.round(bmi) + ".");

    if (bmi >= 18.5 && bmi < 25.0) {
      System.out.println("Saya sehat!");
    } else {
      System.out.println("Saya tidak sehat.");
    }
    
    int maxAge = 0;
    if (age > maxAge) {
      maxAge = age;
    }

    System.out.println("Usia tertua: " + maxAge + ".");
    
    totalAge += age;
    System.out.println("Usia rata-rata: " + totalAge / total + ".");
    
    }
    
  }
}
