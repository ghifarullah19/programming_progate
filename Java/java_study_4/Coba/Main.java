class Main {
  public static void main(String[] args) {
    //Buat instance class Bicycle dan atur field instance name dan color ke 'Bianchi' dan 'Hijau'
    Bicycle bicycle = new Bicycle("Bianchi", "Hijau");
    //Cetak '【Info Sepeda】'
    System.out.println("【Info Sepeda】");
    //Cetak nilai field instance name dan color
    System.out.println("Nama: " + bicycle.getName());
    System.out.println("Warna: " + bicycle.getColor());
  }
}