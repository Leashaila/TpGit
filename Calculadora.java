import java.util.Scanner;

public class Calculadora {

	private Integer a;
	private Integer b;
	private Integer resultado;
	
	public MiCalculadora(Integer a, Integer b) {
		this.a = a;
		this.b = b;
	}
	//Metodo para sumar:
		public Integer sumar(){
			return this.resultado = a+b;
		}
	
	
	//Metodo para restar:
		public Integer restar(){
			return this.resultado=a-b;
		}
	
	
	//Metodo para multiplicar:
		public Integer multiplicar(){
			return this.resultado=a*b;
		}
	
	
	//Metodo para dividir:
		public Integer dividir(){
			return this.resultado=a/b;
		}




	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		 Integer opcion;
		 Integer a;
		 Integer b;
		 Integer resultado;
		 do{
		 System.out.println("Ingrese su operación /n 1 para sumar /n 2 para\r\n" + "restar /n 3 para multiplicar /n 4 para dividir");
		 opcion = teclado.nextInt();
		 }while(opcion < 1 && opcion > 4); 
		 System.out.println("Ingrese el primer numero");
		 a = teclado.nextInt();
		 System.out.println("Ingrese el segundo numero");
		 b = teclado.nextInt();
switch (opcion) {
case 1: 
resultado = a + b;
break;
case 2:
resultado = a - b;
break;
case 3 : 
resultado = a * b;
break;
default:
resultado = a / b;
break;
System.out.println("El resultado es " + resultado.toString());
}
}