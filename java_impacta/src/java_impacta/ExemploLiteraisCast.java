package java_impacta;

public class ExemploLiteraisCast {
	public static void main(String[] args) {
		
		double distancia = 389.56;
		// float num = distancia; // erro pois o tipo double pode possuir valores maiores que o float
		
		float num = (float) distancia;
		
		System.out.println(num);
	}
}
