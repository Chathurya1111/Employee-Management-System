class Shape{
    public void draw(){
        System.out.println("Drawing a generic shape");
    }
}
class Circle extends Shape{
    @java.lang.Override
    public void draw() {
        System.out.println("Drawing a Circle");
    }
}
class Rectangle extends Shape{
    @java.lang.Override
    public void draw() {
        System.out.println("Drawing a Rectangle");
    }
}
class Triangle extends Shape{
    @java.lang.Override
    public void draw() {
        System.out.println("Drawing a Triangle");
    }
}
public class GraphicSystem {
    public static void main(String[] args) {
        Shape[] genShape=new Shape[3];
        genShape[0]=new Circle();
        genShape[1]=new Rectangle();
        genShape[2]=new Triangle();

        for (int i=0; i< genShape.length; i++){
            genShape[i].draw();
        }
    }
}