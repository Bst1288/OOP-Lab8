public class Rectangle extends GeometricObject implements Comparable<Rectangle> {
    private double width;
    private double height;

    public Rectangle(){

    }

    public Rectangle(double width, double height, String color, boolean filled){
        this.width = width;
        this.height = height;
        setColor(color);
		setFilled(filled);
    }

    //---set methods---//
    public void setWidth(double width){
        this.width = width;
    }

    public void setHeight(double height){
        this.height = height;
    }

    //---get methods---//
    public double getWidth(){
        return width;
    }

    public double getHeight(){
        return height;
    }

    public double getArea(){
		return width * height;
	}

    public double getPerimeter(){
        return 2 * (width * height);
    }

    public int compareTo(Rectangle obj){
        if(getArea() > obj.getArea())
            return 1;
        else if (getArea() < obj.getArea())
            return -1;
        else
            return 0;
    }

    public boolean equals(Object obj){
        if(obj instanceof Rectangle)
            return this.compareTo((Rectangle)obj) == 0;
        else
            return false;
    }

    public String toString(){
        return super.toString()
                + "\nWidth : " + width + " and Height : " + height
                + "\n-------------------------------------------"
			    + "\nArea : " + getArea() + "\nPerimeter : " + getPerimeter()
                + "\n-------------------------------------------";
    }
}
