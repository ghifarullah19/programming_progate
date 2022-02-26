//Tentukan class 'Bicycle'
class Bicycle {
  //Deklarasikan field instance 'name' dan 'color' bertipe private dan return String
  private String name;
  private String color;
  //Deklarasikan field instance 'distance' bertipe private dan return int dengan nilai = 0
  private int distance = 0;
  //Tentukan constructor untuk class Bicycle
  Bicycle(String name, String color) {
    this.name = name;
    this.color = color;
    this.distance = distance;
  } 
  //Buat method instance printData
  public void printData() {
    System.out.println("Nama: " + this.name);
    System.out.println("Warna: " + this.color);
    System.out.println("Jarak: " + this.distance + "km");
  }
}