//Import Java library
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    //Inisialisasi Java library
    Scanner scanner = new Scanner(System.in);
    
    //Buat instance class Bicycle dan atur field instance ke 'Bianchi'
    Bicycle bicycle = new Bicycle("Bianchi", "Hijau");
    //Cetak '【Info Sepeda】'
    System.out.println("【Info Sepeda】");
    //Panggil method instance printData
    bicycle.printData();
    
    //Line break
    System.out.println("-----------------");
    
    System.out.print("Masukkan jarak yang akan ditempuh: ");
    //Menerima input dengan int yang ditetapkan ke variable
    int run = scanner.nextInt();
    //Memanggil method instance run yang menerima input dari variable run
    bicycle.run(run);
    
    //Line Break
    System.out.println("=================");
    //Buat instance class Bicycle dan atur field instance ke 'Bianchi'
    Car car = new Car("Ferrari", "Merah");
    //Cetak '【Info Mobil】'
    System.out.println("【Info Mobil】");
    //Panggil method instance printData
    car.printData();
  }
}