package singleton;

public class main {

	public static void main(String[] args) {
		
		int somme = singleton.getinstance().somme(3, 5);
		System.out.printf("la somme est %d",somme);
		
		singleton S1= singleton.getinstances(1, 2);
		S1.affiche();
		
		singleton S2=singleton.getinstances(somme, somme);
		S2.affiche();
		
		
	}

}
