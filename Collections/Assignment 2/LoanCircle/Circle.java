public class Circle {
    private double radius=1;
    private static int noOfObjects=0;
    public Circle(){
        noOfObjects++;
    }
    public Circle(double newRadius){
        radius=newRadius;
        noOfObjects++;
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(double newRadius){
        radius=(newRadius>=0)?newRadius:0;
    }
    public static int getNoOfObjects(){
        return noOfObjects;
    }
    public double getArea(){
        return radius*radius*Math.PI;
    }
}
