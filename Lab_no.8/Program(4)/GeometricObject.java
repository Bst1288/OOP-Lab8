import java.util.Date;

public abstract class GeometricObject {
    private String color = "white";
    private boolean filled;
    private Date dateCreated;

    protected GeometricObject(){

    }

    protected GeometricObject(String color, boolean filled){
        this.color = color;
        this.filled = filled;
        dateCreated = new Date();
    }

    //---set methods---//
    public void setColor(String color){
        this.color = color;
    }

    public void setFilled(boolean filled){
        this.filled = filled;
    }

    //---get methods---//
    public String getColor(){
        return color;
    }

    public String getDateCreated(){
        return dateCreated.toString();
    }

    public boolean isFilled(){
        return filled;
    }

    //---toString---//
    public String toString(){
        return  "\ncolor : " + color +
                " and filled : " + filled;
    }

    //---Abstract methods---//
    public abstract double getArea();
    public abstract double getPerimeter();
}
