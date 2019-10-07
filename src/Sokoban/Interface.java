package Sokoban;


import java.util.Scanner;
import Implementacion.LinkedBinaryTree;
import Implementacion.ArrayQueue;
import Implementacion.Chain;
import Implementacion.LinkedStack;

import static Implementacion.QuickSort.quickSort;;
/**
 * Esta clase es utilizada para elegir el nivel y tener la posibilidad de ver los resultados de cada uno de los niveles
 * @author julian Cuervo
 * @since 28/5/2017
 *
 */
public class Interface {
	public static void main( String [] arg){
		Scanner sc = new Scanner(System.in);
		//cada una de las pilas se utiliza para la comparacion de cada uno de los niveles
		LinkedStack pila1=new LinkedStack();
		LinkedStack pila2=new LinkedStack();
		LinkedStack pila3=new LinkedStack();
		//los Chain guardan los resultados de las pilas
		Chain r1=new Chain();
		Chain r2=new Chain();
		Chain r3=new Chain();
		
		Chain q1=new Chain();//Chain utilizado para guardar los resultados de la cola
		
		ArrayQueue c1=new ArrayQueue();//Cola utilizada para el registro de los resultados
		int k=0;
		int op=1;
		//Se inicia el menu del juego
		while(op!=0){
			//Interface
			System.out.println();
			System.out.println("Sokoban :");
			System.out.println("0). Cerrar");
			System.out.println("1). Facil");
			System.out.println("2). Medio");
			System.out.println("3). Dificil");
			System.out.println("4). Nivel Extremo");
			System.out.println("5). Ver resultados");
			System.out.println("6). Ver registro de resultados");
			System.out.println();
			System.out.println("AYUDA: Si te equivocas puedes oprimir x para volver al inicio");
		op = Integer.parseInt(sc.nextLine());
		switch (op) {

		case 1:
			//Inicia el nivel facil , la pila compara si el resultado es 0 y guarda los resultados diferentes
			System.out.println("Nivel Facil");
			pila1.push(Facil.Facil());
			if((int)pila1.peek()==0){//Si el nivel retorna 0, se remueve de la pila
				pila1.pop();
			}
			else c1.put(pila1.peek()+" - Nivel Facil");//la cola guarda los resultados de la pila
			break;
		case 2:
			//Inicia el nivel medio , la pila compara si el resultado es 0 y guarda los resultados diferentes
			System.out.println("Nivel Medio");
			pila2.push(Medio.Medio());
			if((int)pila2.peek()==0){//Si el nivel retorna 0, se remueve de la pila
				pila2.pop();
			}
			else c1.put(pila2.peek()+" - Nivel Medio");//la cola guarda los resultados de la pila
			break;
		case 3:
			//Inicia el nivel dificil , la pila compara si el resultado es 0 y guarda los resultados diferentes
			System.out.println("Nivel Dificil");
			pila3.push(Dificil.Dificil());
			if((int)pila3.peek()==0){//Si el nivel retorna 0, se remueve de la pila
				pila3.pop();
			}
			else c1.put(pila3.peek()+" - Nivel Dificil");//la cola guarda los resultados de la pila
			break;
		case 4:
			System.out.println("Nivel Extremo");
			//Se crea el arbol con los tres Niveles
			LinkedBinaryTree f = new LinkedBinaryTree();
			LinkedBinaryTree  a = new LinkedBinaryTree();
			LinkedBinaryTree  b = new LinkedBinaryTree();
			LinkedBinaryTree c = new LinkedBinaryTree();
			c.makeTree(new Integer(Facil.Facil()), a, a);
			System.out.println("para salir espichar varias veces x");
			System.out.println();
			b.makeTree(new Integer(Medio.Medio()), a, a);
			System.out.println();
			f.makeTree(new Integer(Dificil.Dificil()), b, c);
			System.out.println("Nivel Dificil - Nivel Medio - Nivel Facil");
			f.levelOrderOutput();//Se imprime el resultado de cada nivel
			System.out.println();
			
			
		case 5:
			/*En el case 5 se muestran los resultados 
			 * 
			 *Los resultados de la pila se ordenan y se muestran por nivel
			 * */
			 
			System.out.println("Resultados Nivel Facil");
			int i=0;
			while(pila1.empty()==false){//Un Chain guarda los resultados de la pila
				r1.add(i,pila1.pop());
			}
			Integer[] resultado1=new Integer[r1.size];
			for (int j = 0; j <r1.size; j++) {
				resultado1[j]=(int)r1.get(j);
			}
			quickSort(resultado1);//Se ordenan los resultados del nivel
			for (int j = 0; j < resultado1.length; j++) {
				System.out.println(resultado1[j]);
			}
			System.out.println("Resultados Nivel Medio");
			i=0;
			while(pila2.empty()==false){//Un Chain guarda los resultados de la pila
				r2.add(i,pila2.pop());
			}
			Integer[] resultado2=new Integer[r2.size];
			for (int j = 0; j <r2.size; j++) {
				resultado2[j]=(int)r2.get(j);
			}
			quickSort(resultado2);//Se ordenan los resultados del nivel
			for (int j = 0; j < resultado2.length; j++) {
				System.out.println(resultado2[j]);
			}
			System.out.println("Resultados Nivel Dificil");
			i=0;
			while(pila3.empty()==false){//Un Chain guarda los resultados de la pila
				r3.add(i,pila3.pop());
			}
			i=0;
			Integer[] resultado3=new Integer[r3.size];
			for (int j = 0; j <r3.size; j++) {
				resultado3[j]=(int)r3.get(j);
			}
			quickSort(resultado3);//Se ordenan los resultados del nivel
			for (int j = 0; j < resultado3.length; j++) {
				System.out.println(resultado3[j]);
			}
			break;
		case 6:
			System.out.println("Registro de resultados");
			System.out.println();
			while(!c1.isEmpty()){//El Chain va guardando los resultados de la cola
				q1.add(0,c1.remove());	
			}
			for (int j2 = 0; j2 < q1.size(); j2++) {//Se imprime el registro de los resultados
				System.out.println(q1.get(j2));
			}
			
			break;
		}
		
		}
	}

}
