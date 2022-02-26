//Tentukan class Car
class Car {
  //Deklarasikan field instance 'name' dan 'color' bertipe private dan return String
  private String name;
  private String color;
  //Deklarasikan field instance 'distance' bertipe private dan return int dengan nilai = 0
  private int distance = 0;
  //Deklarasikan field instance 'fuel'
  private int fuel = 100;
  
  //Buat constructor untuk class Car
  Car(String name, String color) {
    this.name = name;
    this.color = color;
    this.distance = distance;
    this.fuel = fuel;
  } 
  
  //Tentukan method instance run
  public void run(int distance) {
    //Cetak nilai argument
    System.out.println("Bergerak " + distance + "km ...");
    //Perbarui field instance distance dan fuel jika distance <= fuel
    if (distance <= fuel) {
      this.distance += distance;
      this.fuel -= distance;
    }
    //Cetak 'Bahan bakar tidak cukup' jika distance > fuel
    if (distance > fuel) {
      System.out.println("Bahan bakar tidak cukup");
    }
    //Cetak field instance 'distance'
    System.out.println("Jarak: " + this.distance + "km");
    //Cetak field instance 'fuel'
    System.out.println("Bahan Bakar: " + this.fuel + "L");
  }
  
  //Buat method instance charge
  public void charge(int fueling) {
    System.out.println("Menambahkan " + fueling + "L ...");
    //Buat alur bersyaratan di method instance
    if (fueling <= 0) {
      System.out.println("Tidak ada bahan bakar tertambahkan");
    }
    else if (fueling >= 100) {
      System.out.println("Sekarang tangki penuh");
      this.fuel = 100;
    }
    else {
      this.fuel += fueling;
    }
    //Cetak 'Bahan bakar: ___ L'
    System.out.println("Bahan Bakar: " + this.fuel + "L");
    
  }
  
  //Buat method instance printData
  public void printData() {
    System.out.println("Nama: " + this.name);
    System.out.println("Warna: " + this.color);
    System.out.println("Jarak: " + this.distance + "km");
    //Cetak nilai field instance fuel
    System.out.println("Bahan Bakar: " + this.fuel + "L");
  }
}