public class Pro3_Rectangle {
    public static void main(String[] args){
        
        Rectangle rectangle1 = new Rectangle(4, 7, "Purple", true);
        Rectangle rectangle2 = new Rectangle(4, 8, "Blue", false);
        Rectangle rectangle3 = new Rectangle(4, 8, "Pink", true);

        System.out.println("\n=> Rectangle 1 <=\n" + rectangle1.toString()
                + "\n" + "\n=> Rectangle 2 <=\n" + rectangle2.toString()
                + "\n" + "\n=> Rectangle 3 <=\n" + rectangle3.toString());

        System.out.print("\n************************************************\n");
        System.out.println("Are Rectangle 1 equal to Rectangle 2 ? => " + rectangle1.equals(rectangle2));
        System.out.println("Are Rectangle 2 equal to Rectangle 3 ? => " + rectangle2.equals(rectangle3));
        System.out.println("************************************************");
    }
}
