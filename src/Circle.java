public class Circle extends Shape {
    private int radius =0;

    public Circle(int newRadius ){
        setRadius(newRadius);
    }

    public int getRadius() {
        return radius;
    }
    public void setRadius(int newRadius){
        radius= newRadius;
    }
    @Override
    public float getArea() {
        return (float)((getRadius()*getRadius())*Math.PI);
    }
    @Override
    public int getPerimeter() {
        return (int)((getRadius()*getRadius())*Math.PI);
    }
}
