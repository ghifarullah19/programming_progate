//Tentukan class 'Bicycle'
class Bicycle {
  //Deklarasikan field instance 'name' bertipe private dan return String
  private String name;
  //Deklarasikan field instance 'color'
  private String color;
  
  //Tentukan constructor untuk class Bicycle
  Bicycle(String name, String color) {
    this.name = name;
    this.color = color;
  } 
  
  //Tentukan method getter
  public String getName() {
    return this.name;
  }
  
  public String getColor() {
    return this.color;
  }
}