
public class Classroom {
	
	public static void main(String[] args) {
		
		Wilder ario = new Wilder("Ario", true);
		Wilder karim = new Wilder("Karim", false);
		Wilder kamille = new Wilder("Kamille", true);
		
		System.out.println(ario.whoAmI(ario.isAware()));
		System.out.println(karim.whoAmI(karim.isAware()));
		System.out.println(kamille.whoAmI(kamille.isAware()));
	}

}
