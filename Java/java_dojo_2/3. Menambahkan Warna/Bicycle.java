//Tentukan class 'Bicycle'
class Bicycle {
  //Deklarasikan field instance 'name' dan 'color' bertipe private dan return String
  private String name;
  private String color;
  //Tentukan constructor untuk class Bicycle
  Bicycle(String name, String color) {
    this.name = name;
    this.color = color;
  } 
  //Buat method instance printData
  public void printData() {
    System.out.println("Nama: " + this.name);
    System.out.println("Warna: " + this.color);
  }
}