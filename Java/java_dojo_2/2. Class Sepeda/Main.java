class Main {
  public static void main(String[] args) {
    //Buat instance class Bicycle dan atur field instance ke 'Bianchi'
    Bicycle bicycle = new Bicycle("Bianchi");
    //Cetak '【Info Sepeda】'
    System.out.println("【Info Sepeda】");
    //Cetak nilai field instance name
    System.out.println("Nama: " + bicycle.getName());
  }
}