package ClassMethodOOP01;
class circle1 {
  double r = 1.0;

  public circle1() {

  }

  public circle1(double radius) {
    r = radius;
   System.out.println("Area of the circle is " + radius*radius*3.1416);
  }

}  
  

class CicleArea {
  public static void main(String[] args) {
    circle1 a1 = new circle1(4.5);
    
   }
 
}