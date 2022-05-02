public class Octagon extends GeometricObject 
		implements Cloneable, Comparable<Octagon> {
    private double side;
    
    public Octagon(){

    }

    public Octagon(double side){
        this.side = side;
    }

    //---set methods---//
    public void setSide(double side){
        this.side = side;
    }

    //---get methods---//
    public double getSide(){
        return side;
    }

    //---Area and Perimeter---//
    public double getArea(){
        return (2 + 4 / Math.sqrt(2)) * side * side;
    }

    public double getPerimeter(){
        return side * 8;
    }


    //---Clone methods---//
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

    //---toString---//
    public String toString(){
        return super.toString() + "\nArea: " + getArea() + 
                "\nPerimeter: " + getPerimeter();
    }

    //---CompapeTo methods---//
    public int compareTo(Octagon o) {
        // TODO Auto-generated method stub
        if(getArea() > o.getArea())
            return 1;
        else if (getArea() < o.getArea())
            return -1;
        else
        return 0;
    }

}
