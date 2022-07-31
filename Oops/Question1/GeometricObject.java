import java.util.*;

public class GeometricObject {
    private String color="white";
    private boolean filled;
    private Date datecreated;

    public GeometricObject(){
        datecreated=new Date();
    }

    public GeometricObject(String color, boolean filled){
        datecreated =new Date();
        this.color=color;
        this.filled=filled;
    }

    public String getColor(){
        return color;
    }

    public void setColor(String color){
        this.color=color;
    }

    public boolean isFilled(){
        return filled;
    }

    public void setFilled(boolean filled){
        this.filled=filled;
    }

    public Date getDatecreated() {
        return datecreated;
    }

    public String toString(){
        return "created on "+datecreated+"\ncolor: "+ color+"\nand filled: "+filled;
    }
}
