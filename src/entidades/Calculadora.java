package entidades;

import java.util.List;

public class Calculadora {
	
	public double somar(double a, double b){
		return a+b;
	}
	public double dividir(double a, double  b){
		return a/b;
	}
	public double multiplicar(double a, double b){
		return a*b;
	}
	public double subtrair(double a, double b){
		return a-b;
	}
	
	public int somar(int a, int b){
		return a+b;
	}
	public int subtrair(int a, int b){
		return a-b;
	}
	
	public double mediaArray(double[] array){
		double m1 = 0;
		
		for (double obj : array) {
		
			m1 = m1 + obj;	
			
		}
		
		double total = m1 / array.length;
		return total;
		
	}
}
