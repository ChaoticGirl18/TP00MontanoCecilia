
 import java.util.*;
public class tp00montaño {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner obj = new Scanner(System.in);
		
			int n1;
			int n2;
			int resultadosuma, resultadoresta, resultadodiv, resultadomul;
			
				System.out.println("Ingresar el primer numero:");
			n1 = obj.nextInt();
			System.out.println("Ingresar el segundo numero:");
			n2 = obj.nextInt();
			
			Scanner leer = new Scanner(System.in);
		
		int op;
		do {
			
		do {
		
			System.out.println("1) Suma:");
			System.out.println("2) Resta:");
			System.out.println("3) Multiplicacion:");
			System.out.println("4) Division:");
			System.out.println("5) Salir:");
			System.out.println("Ingrese una opcion");
			op = leer.nextInt();
			
		}while (op<1 || op>5);
		
		switch (op) {
		case 1:
			resultadosuma = n1 + n2;
			System.out.println("El resultado de la suma es:"+resultadosuma);
			break;
		case 2:
			resultadoresta = n1 - n2;
			System.out.println("El resultado de la resta es:"+resultadoresta);
			break;
		case 3:
			resultadomul = n1 * n2;
			System.out.println("El resultado de la multiplicacion es:"+resultadomul);
			break;
		case 4:
			if (n1==0 || n2==0) {
				System.out.println("No se puede dividir por cero");
			}
			else {
			resultadodiv = n1 / n2;
			System.out.println("El resultado de la division es:"+resultadodiv);
			}
			break;
		case 5:
			System.exit(0);
			break;
		}
		}while (op!=5);
		
	}

}
