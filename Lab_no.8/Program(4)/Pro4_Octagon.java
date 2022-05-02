public class Pro4_Octagon {
    public static void main(String[] args) throws CloneNotSupportedException{

		Octagon octagon1 = new Octagon(5);
		Octagon octagon2 = (Octagon)octagon1.clone();

		System.out.println("");
		System.out.println("=> Octagon No.1 <=");
		System.out.println("---------------------------------------------------");
		System.out.println("Area : " + octagon1.getArea());
		System.out.println("Perimeter : " + octagon1.getPerimeter());
		System.out.println("---------------------------------------------------");
		
		System.out.println("=> Octagon No.2 <=");
		System.out.println("---------------------------------------------------");
		System.out.println("Area : " + octagon2.getArea());
		System.out.println("Perimeter : " + octagon2.getPerimeter());
		System.out.println("---------------------------------------------------");

		System.out.println("");
		int ans = (octagon1.compareTo(octagon2));
		System.out.println("Octagon No.1 Compare to Octagon No.2 :" + ans);
		if(ans == 1){
			System.out.println("Octagon is greather than clone.");
			System.out.println("");
		}
		else if(ans == -1){
			System.out.println("Octagon is less than clone.");
			System.out.println("");
		}
		else{
			System.out.println("Octagon is equal to clone.");
			System.out.println("");
		}
    }
}