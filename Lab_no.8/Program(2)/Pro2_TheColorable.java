public class Pro2_TheColorable {
    public static void main(String[] args){
        GeometricObject[] s = {new Square(4.3), new Square(17), 
			new Square(8.2), new Square(12), new Square(120)};

        for (int i = 0; i < s.length; i++){
            System.out.println("--------------------------------------------------");
            System.out.println("\tSquare No." + (i + 1));
		 	System.out.println("\tArea : " + s[i].getArea());
		 	System.out.println("\tHow to color : " + ((Square)s[i]).howToColor());
            System.out.println("--------------------------------------------------");
        }
    }
}
