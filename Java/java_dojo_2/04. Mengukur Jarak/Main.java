class Main {
  public static void main(String[] args) {
    //Buat instance class Bicycle dan atur field instance ke 'Bianchi'
    Bicycle bicycle = new Bicycle("Bianchi", "Hijau");
    //Cetak '【Info Sepeda】'
    System.out.println("【Info Sepeda】");
    //Panggil method instance printData
    bicycle.printData();
  }
}