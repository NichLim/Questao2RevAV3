package principal;

import entidades.Calculadora;

public class Principal {

	public static void main(String[] args){
		
		Calculadora c = new Calculadora();
		double[] array = {2.3,3.5,5.8, 5.4,10};
		
		System.out.println("Soma 3,2 + 8,8 = " +  c.somar(3.2, 8.8));
		System.out.println("Dividir 42 / 4,2 = " + c.dividir(42, 4.2));
		System.out.println("Multiplicar 3,14 x 3,14 = " + c.multiplicar(3.14, 3.14));
		System.out.println("Subtrair 800 - 30,7 = " +  c.subtrair(800, 30.7));
		System.out.println("Somar 30 + 39 = " + c.somar(30, 39) + " lol");
		System.out.println("Subtrair 89 - 20 = " + c.subtrair(89, 20) + " lol");
		System.out.println("A media do array é = " + c.mediaArray(array));
		
	}
}
