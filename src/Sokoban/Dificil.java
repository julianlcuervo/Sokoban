package Sokoban;
import java.awt.datatransfer.SystemFlavorMap;
import java.io.Console;
import java.util.Scanner;

import Implementacion.Chain;
import Implementacion.LinkedStack;
/**Esta clase es la encargada de crear el nivel Dificil y retornar la cantidad de movimientos 
 * 
 * @author julian Cuervo
 * @since 28/05/2017
 *
 */
public class Dificil {
	/**
	 * 
	 * @return Este metodo retorna el resultado del nivel dificil
	 */
	public static int Dificil (){
		Scanner sc = new Scanner(System.in);
		int movimientos=0;//Esta variable entera cuenta los movimientos realizados
		int fila=1;//Esta variable entera indica la posicion inicial del jugador
		int m=0;//Esta variable entera sera la encargada de guardar el valor final de los movimientos
		boolean entrar=true;
		//Se crea un arreglo de Chain con los lugares que debe tener cada objeto
	Chain arreglo=new Chain();
	Chain arreglo0=new Chain();
	Chain arreglo1=new Chain();
	Chain arreglo2=new Chain();
	Chain arreglo3=new Chain();
	Chain arreglo4=new Chain();
	Chain arreglo5=new Chain();
	arreglo0.add(0,2);
	arreglo0.add(1,2);
	arreglo0.add(2,2);
	arreglo0.add(3,2);
	arreglo0.add(4,2);
	arreglo0.add(5,2);
	arreglo0.add(6,2);
	arreglo1.add(0,2);
	arreglo1.add(1,0);
	arreglo1.add(2,8);
	arreglo1.add(3,4);
	arreglo1.add(4,1);
	arreglo1.add(5,2);
	arreglo1.add(6,2);
	arreglo2.add(0,2);
	arreglo2.add(1,0);
	arreglo2.add(2,0);
	arreglo2.add(3,8);
	arreglo2.add(4,0);
	arreglo2.add(5,0);
	arreglo2.add(6,2);
	arreglo3.add(0,2);
	arreglo3.add(1,0);
	arreglo3.add(2,0);
	arreglo3.add(3,8);
	arreglo3.add(4,2);
	arreglo3.add(5,0);
	arreglo3.add(6,2);
	arreglo4.add(0,2);
	arreglo4.add(1,0);
	arreglo4.add(2,4);
	arreglo4.add(3,8);
	arreglo4.add(4,4);
	arreglo4.add(5,0);
	arreglo4.add(6,2);
	arreglo5.add(0,2);
	arreglo5.add(1,2);
	arreglo5.add(2,2);
	arreglo5.add(3,2);
	arreglo5.add(4,2);
	arreglo5.add(5,2);
	arreglo5.add(6,2);
	
	arreglo.add(0,arreglo0);
	arreglo.add(1,arreglo1);
	arreglo.add(2,arreglo2);
	arreglo.add(3,arreglo3);
	arreglo.add(4,arreglo4);
	arreglo.add(5,arreglo5);
	
	//Se imprime el mapa inicial
	for(int l=0;l<arreglo.size;l++){
		System.out.println(arreglo.get(l));
		
	}
	// El while se utiliza para la eleccion del movimiento
	while(entrar==true){
	String mover=sc.nextLine();
	if(mover.equals("d")){//Si el usuario espicha la tecla d se realiza la condicion
		movimientos++;//el entero movimientos aumenta +1
		if(fila==1){//si el personaje se encuentra en la fila 1 realizara esta condicion
			
			//los siguientes condicionales if son usados para la logica de la indicacion donde debe ir la caja 
			if((int)arreglo1.get(3)==4){
				arreglo1.remove(3);
				arreglo1.add(3,0);
			}
			if((int)arreglo4.get(2)==4){
				arreglo4.remove(2);
				arreglo4.add(2,0);
			}
			if((int)arreglo4.get(3)==4){
				arreglo4.remove(3);
				arreglo4.add(3,0);
			}
			if((int)arreglo4.get(4)==4){
				arreglo4.remove(4);
				arreglo4.add(4,0);
			}
			Movimientos.Mderecha(arreglo1);//Se llama al metodo encargado del movimiento a la derecha y se manda el arreglo donde se encuentra el personaje
			if((int)arreglo1.get(3)==0){
				arreglo1.remove(3);
				arreglo1.add(3,4);
			}
			if((int)arreglo4.get(2)==0){
				arreglo4.remove(2);
				arreglo4.add(2,4);
			}
			if((int)arreglo4.get(3)==0){
				arreglo4.remove(3);
				arreglo4.add(3,4);
			}
			if((int)arreglo4.get(4)==0){
				arreglo4.remove(4);
				arreglo4.add(4,4);
			}
		}
	else if(fila==2){//si el personaje se encuentra en la fila 2 realizara esta condicion
		//los siguientes condicionales if son usados para la logica de la indicacion donde debe ir la caja 
		if((int)arreglo1.get(3)==4){
			arreglo1.remove(3);
			arreglo1.add(3,0);
		}
		if((int)arreglo4.get(2)==4){
			arreglo4.remove(2);
			arreglo4.add(2,0);
		}
		if((int)arreglo4.get(3)==4){
			arreglo4.remove(3);
			arreglo4.add(3,0);
		}
		if((int)arreglo4.get(4)==4){
			arreglo4.remove(4);
			arreglo4.add(4,0);
		}
		Movimientos.Mderecha(arreglo2);//Se llama al metodo encargado del movimiento a la derecha y se manda el arreglo donde se encuentra el personaje
		if((int)arreglo1.get(3)==0){
			arreglo1.remove(3);
			arreglo1.add(3,4);
		}
		if((int)arreglo4.get(2)==0){
			arreglo4.remove(2);
			arreglo4.add(2,4);
		}
		if((int)arreglo4.get(3)==0){
			arreglo4.remove(3);
			arreglo4.add(3,4);
		}
		if((int)arreglo4.get(4)==0){
			arreglo4.remove(4);
			arreglo4.add(4,4);
		}
		
	}
	else if(fila==3){//si el personaje se encuentra en la fila 3 realizara esta condicion
		//los siguientes condicionales if son usados para la logica de la indicacion donde debe ir la caja 
		if((int)arreglo1.get(3)==4){
			arreglo1.remove(3);
			arreglo1.add(3,0);
		}
		if((int)arreglo4.get(2)==4){
			arreglo4.remove(2);
			arreglo4.add(2,0);
		}
		if((int)arreglo4.get(3)==4){
			arreglo4.remove(3);
			arreglo4.add(3,0);
		}
		if((int)arreglo4.get(4)==4){
			arreglo4.remove(4);
			arreglo4.add(4,0);
		}
		Movimientos.Mderecha(arreglo3);//Se llama al metodo encargado del movimiento a la derecha y se manda el arreglo donde se encuentra el personaje
		if((int)arreglo1.get(3)==0){
			arreglo1.remove(3);
			arreglo1.add(3,4);
		}
		if((int)arreglo4.get(2)==0){
			arreglo4.remove(2);
			arreglo4.add(2,4);
		}
		if((int)arreglo4.get(3)==0){
			arreglo4.remove(3);
			arreglo4.add(3,4);
		}
		if((int)arreglo4.get(4)==0){
			arreglo4.remove(4);
			arreglo4.add(4,4);
		}
	}
	else if(fila==4){//si el personaje se encuentra en la fila 4 realizara esta condicion
		//los siguientes condicionales if son usados para la logica de la indicacion donde debe ir la caja 
		if((int)arreglo1.get(3)==4){
			arreglo1.remove(3);
			arreglo1.add(3,0);
		}
		if((int)arreglo4.get(2)==4){
			arreglo4.remove(2);
			arreglo4.add(2,0);
		}
		if((int)arreglo4.get(3)==4){
			arreglo4.remove(3);
			arreglo4.add(3,0);
		}
		if((int)arreglo4.get(4)==4){
			arreglo4.remove(4);
			arreglo4.add(4,0);
		}
		Movimientos.Mderecha(arreglo4);//Se llama al metodo encargado del movimiento a la derecha y se manda el arreglo donde se encuentra el personaje
		if((int)arreglo1.get(3)==0){
			arreglo1.remove(3);
			arreglo1.add(3,4);
		}
		if((int)arreglo4.get(2)==0){
			arreglo4.remove(2);
			arreglo4.add(2,4);
		}
		if((int)arreglo4.get(3)==0){
			arreglo4.remove(3);
			arreglo4.add(3,4);
		}
		if((int)arreglo4.get(4)==0){
			arreglo4.remove(4);
			arreglo4.add(4,4);
		}
	}
	}
	else if(mover.equals("a")){//Si el usuario espicha la tecla a se realiza la condicion
		movimientos++;//el entero movimientos aumenta +1
		if(fila==1){//si el personaje se encuentra en la fila 1 realizara esta condicion
			//los siguientes condicionales if son usados para la logica de la indicacion donde debe ir la caja 
			if((int)arreglo1.get(3)==4){
				arreglo1.remove(3);
				arreglo1.add(3,0);
			}
			if((int)arreglo4.get(2)==4){
				arreglo4.remove(2);
				arreglo4.add(2,0);
			}
			if((int)arreglo4.get(3)==4){
				arreglo4.remove(3);
				arreglo4.add(3,0);
			}
			if((int)arreglo4.get(4)==4){
				arreglo4.remove(4);
				arreglo4.add(4,0);
			}
			Movimientos.Mizquierda(arreglo1);//Se llama al metodo encargado del movimiento a la izquierda y se manda el arreglo donde se encuentra el personaje
		if((int)arreglo1.get(3)==0){
			arreglo1.remove(3);
			arreglo1.add(3,4);
		}
		if((int)arreglo4.get(2)==0){
			arreglo4.remove(2);
			arreglo4.add(2,4);
		}
		if((int)arreglo4.get(3)==0){
			arreglo4.remove(3);
			arreglo4.add(3,4);
		}
		if((int)arreglo4.get(4)==0){
			arreglo4.remove(4);
			arreglo4.add(4,4);
		}
	}
		else if(fila==2){//si el personaje se encuentra en la fila 2 realizara esta condicion
			//los siguientes condicionales if son usados para la logica de la indicacion donde debe ir la caja 
			if((int)arreglo1.get(3)==4){
				arreglo1.remove(3);
				arreglo1.add(3,0);
			}
			if((int)arreglo4.get(2)==4){
				arreglo4.remove(2);
				arreglo4.add(2,0);
			}
			if((int)arreglo4.get(3)==4){
				arreglo4.remove(3);
				arreglo4.add(3,0);
			}
			if((int)arreglo4.get(4)==4){
				arreglo4.remove(4);
				arreglo4.add(4,0);
			}
			Movimientos.Mizquierda(arreglo2);//Se llama al metodo encargado del movimiento a la izquierda y se manda el arreglo donde se encuentra el personaje
			if((int)arreglo1.get(3)==0){
				arreglo1.remove(3);
				arreglo1.add(3,4);
			}
			if((int)arreglo4.get(2)==0){
				arreglo4.remove(2);
				arreglo4.add(2,4);
			}
			if((int)arreglo4.get(3)==0){
				arreglo4.remove(3);
				arreglo4.add(3,4);
			}
			if((int)arreglo4.get(4)==0){
				arreglo4.remove(4);
				arreglo4.add(4,4);
			}
		}
		else if(fila==3){//si el personaje se encuentra en la fila 3 realizara esta condicion
			//los siguientes condicionales if son usados para la logica de la indicacion donde debe ir la caja 
			if((int)arreglo1.get(3)==4){
				arreglo1.remove(3);
				arreglo1.add(3,0);
			}
			if((int)arreglo4.get(2)==4){
				arreglo4.remove(2);
				arreglo4.add(2,0);
			}
			if((int)arreglo4.get(3)==4){
				arreglo4.remove(3);
				arreglo4.add(3,0);
			}
			if((int)arreglo4.get(4)==4){
				arreglo4.remove(4);
				arreglo4.add(4,0);
			}
			Movimientos.Mizquierda(arreglo3);//Se llama al metodo encargado del movimiento a la izquierda y se manda el arreglo donde se encuentra el personaje
			if((int)arreglo1.get(3)==0){
				arreglo1.remove(3);
				arreglo1.add(3,4);
			}
			if((int)arreglo4.get(2)==0){
				arreglo4.remove(2);
				arreglo4.add(2,4);
			}
			if((int)arreglo4.get(3)==0){
				arreglo4.remove(3);
				arreglo4.add(3,4);
			}
			if((int)arreglo4.get(4)==0){
				arreglo4.remove(4);
				arreglo4.add(4,4);
			}
		}
		else if(fila==4){//si el personaje se encuentra en la fila 4 realizara esta condicion
			//los siguientes condicionales if son usados para la logica de la indicacion donde debe ir la caja 
			if((int)arreglo1.get(3)==4){
				arreglo1.remove(3);
				arreglo1.add(3,0);
			}
			if((int)arreglo4.get(2)==4){
				arreglo4.remove(2);
				arreglo4.add(2,0);
			}
			if((int)arreglo4.get(3)==4){
				arreglo4.remove(3);
				arreglo4.add(3,0);
			}
			if((int)arreglo4.get(4)==4){
				arreglo4.remove(4);
				arreglo4.add(4,0);
			}
			Movimientos.Mizquierda(arreglo4);//Se llama al metodo encargado del movimiento a la izquierda y se manda el arreglo donde se encuentra el personaje
			if((int)arreglo1.get(3)==0){
				arreglo1.remove(3);
				arreglo1.add(3,4);
			}
			if((int)arreglo4.get(2)==0){
				arreglo4.remove(2);
				arreglo4.add(2,4);
			}
			if((int)arreglo4.get(3)==0){
				arreglo4.remove(3);
				arreglo4.add(3,4);
			}
			if((int)arreglo4.get(4)==0){
				arreglo4.remove(4);
				arreglo4.add(4,4);
			}
		}
			
		}
	else if(mover.equals("s")){//Si el usuario espicha la tecla s se realiza la condicion
		movimientos++;//el entero movimientos aumenta +1
		if(fila==1){//si el personaje se encuentra en la fila 1 realizara esta condicion
			//los siguientes condicionales if son usados para la logica de la indicacion donde debe ir la caja 
			if((int)arreglo1.get(3)==4){
				arreglo1.remove(3);
				arreglo1.add(3,0);
			}
			if((int)arreglo4.get(2)==4){
				arreglo4.remove(2);
				arreglo4.add(2,0);
			}
			if((int)arreglo4.get(3)==4){
				arreglo4.remove(3);
				arreglo4.add(3,0);
			}
			if((int)arreglo4.get(4)==4){
				arreglo4.remove(4);
				arreglo4.add(4,0);
			}
			for(int l=0;l<arreglo1.size;l++){//For encargado de los movimientos hacia abajo en la fila 1
				if(1==(int)arreglo1.get(l)){
					if((int)arreglo2.get(l)==0){
					arreglo1.remove(l);
					arreglo1.add(l,0);
					arreglo2.remove(l);
					arreglo2.add(l,1);
					fila++;
					}
					else if((int)arreglo2.get(l)!=0&&(int)arreglo3.get(l)==0&&(int)arreglo2.get(l)!=2){
						arreglo1.remove(l);
						arreglo1.add(l,0);
						arreglo2.remove(l);
						arreglo2.add(l,1);
						arreglo3.remove(l);
						arreglo3.add(l,8);
						fila=2;
					}
				}
				
			}
			if((int)arreglo1.get(3)==0){
				arreglo1.remove(3);
				arreglo1.add(3,4);
			}
			if((int)arreglo4.get(2)==0){
				arreglo4.remove(2);
				arreglo4.add(2,4);
			}
			if((int)arreglo4.get(3)==0){
				arreglo4.remove(3);
				arreglo4.add(3,4);
			}
			if((int)arreglo4.get(4)==0){
				arreglo4.remove(4);
				arreglo4.add(4,4);
			}
			
		}
		else if(fila==2){//si el personaje se encuentra en la fila 2 realizara esta condicion
			//los siguientes condicionales if son usados para la logica de la indicacion donde debe ir la caja 
			if((int)arreglo1.get(3)==4){
				arreglo1.remove(3);
				arreglo1.add(3,0);
			}
			if((int)arreglo4.get(2)==4){
				arreglo4.remove(2);
				arreglo4.add(2,0);
			}
			if((int)arreglo4.get(3)==4){
				arreglo4.remove(3);
				arreglo4.add(3,0);
			}
			if((int)arreglo4.get(4)==4){
				arreglo4.remove(4);
				arreglo4.add(4,0);
			}
			for(int l=0;l<arreglo2.size;l++){//For encargado de los movimientos hacia abajo en la fila 2
				if(1==(int)arreglo2.get(l)){
					if((int)arreglo3.get(l)==0){
					arreglo2.remove(l);
					arreglo2.add(l,0);
					arreglo3.remove(l);
					arreglo3.add(l,1);
					fila++;
					} 
					else if((int)arreglo3.get(l)!=0&&(int)arreglo4.get(l)==0&&(int)arreglo3.get(l)!=2){
						arreglo2.remove(l);
						arreglo2.add(l,0);
						arreglo3.remove(l);
						arreglo3.add(l,1);
						arreglo4.remove(l);
						arreglo4.add(l,8);
						fila=3;
					}
				}
				
			}
			if((int)arreglo1.get(3)==0){
				arreglo1.remove(3);
				arreglo1.add(3,4);
			}
			if((int)arreglo4.get(2)==0){
				arreglo4.remove(2);
				arreglo4.add(2,4);
			}
			if((int)arreglo4.get(3)==0){
				arreglo4.remove(3);
				arreglo4.add(3,4);
			}
			if((int)arreglo4.get(4)==0){
				arreglo4.remove(4);
				arreglo4.add(4,4);
			}
		}
		else if(fila==3){//si el personaje se encuentra en la fila 3 realizara esta condicion
			//los siguientes condicionales if son usados para la logica de la indicacion donde debe ir la caja 
			if((int)arreglo1.get(3)==4){
				arreglo1.remove(3);
				arreglo1.add(3,0);
			}
			if((int)arreglo4.get(2)==4){
				arreglo4.remove(2);
				arreglo4.add(2,0);
			}
			if((int)arreglo4.get(3)==4){
				arreglo4.remove(3);
				arreglo4.add(3,0);
			}
			if((int)arreglo4.get(4)==4){
				arreglo4.remove(4);
				arreglo4.add(4,0);
			}
			for(int l=0;l<arreglo3.size;l++){//For encargado del movimientos hacia abajo en la fila 3
				if(1==(int)arreglo3.get(l)){
					if((int)arreglo4.get(l)==0){
					arreglo3.remove(l);
					arreglo3.add(l,0);
					arreglo4.remove(l);
					arreglo4.add(l,1);
					fila=4;
				}
					else fila=3;
				}
				
			}
			if((int)arreglo1.get(3)==0){
				arreglo1.remove(3);
				arreglo1.add(3,4);
			}
			if((int)arreglo4.get(2)==0){
				arreglo4.remove(2);
				arreglo4.add(2,4);
			}
			if((int)arreglo4.get(3)==0){
				arreglo4.remove(3);
				arreglo4.add(3,4);
			}
			if((int)arreglo4.get(4)==0){
				arreglo4.remove(4);
				arreglo4.add(4,4);
			}
		}
		
	}
	else if(mover.equals("w")){//Si el usuario espicha la tecla w se realiza la condicion
		movimientos++;//el entero movimientos aumenta +1
		if(fila==2){//si el personaje se encuentra en la fila 2 realizara esta condicion
			//los siguientes condicionales if son usados para la logica de la indicacion donde debe ir la caja 
			if((int)arreglo1.get(3)==4){
				arreglo1.remove(3);
				arreglo1.add(3,0);
			}
			if((int)arreglo4.get(2)==4){
				arreglo4.remove(2);
				arreglo4.add(2,0);
			}
			if((int)arreglo4.get(3)==4){
				arreglo4.remove(3);
				arreglo4.add(3,0);
			}
			if((int)arreglo4.get(4)==4){
				arreglo4.remove(4);
				arreglo4.add(4,0);
			}
			for(int l=0;l<arreglo2.size;l++){//For encargado del movimiento hacia arriba en la fila 2
				if(1==(int)arreglo2.get(l)){
					if((int)arreglo1.get(l)==0){
					arreglo2.remove(l);
					arreglo2.add(l,0);
					arreglo1.remove(l);
					arreglo1.add(l,1);
					fila--;
					}
					else fila=2;
				}
				
			}
			if((int)arreglo1.get(3)==0){
				arreglo1.remove(3);
				arreglo1.add(3,4);
			}
			if((int)arreglo4.get(2)==0){
				arreglo4.remove(2);
				arreglo4.add(2,4);
			}
			if((int)arreglo4.get(3)==0){
				arreglo4.remove(3);
				arreglo4.add(3,4);
			}
			if((int)arreglo4.get(4)==0){
				arreglo4.remove(4);
				arreglo4.add(4,4);
			}
		}
		else if(fila==3){//si el personaje se encuentra en la fila 3 realizara esta condicion
			//los siguientes condicionales if son usados para la logica de la indicacion donde debe ir la caja 
			if((int)arreglo1.get(3)==4){
				arreglo1.remove(3);
				arreglo1.add(3,0);
			}
			if((int)arreglo4.get(2)==4){
				arreglo4.remove(2);
				arreglo4.add(2,0);
			}
			if((int)arreglo4.get(3)==4){
				arreglo4.remove(3);
				arreglo4.add(3,0);
			}
			if((int)arreglo4.get(4)==4){
				arreglo4.remove(4);
				arreglo4.add(4,0);
			}
			for(int l=0;l<arreglo3.size;l++){//For encargado del movimiento hacia arriba en la fila 3
				if(1==(int)arreglo3.get(l)){
					if((int)arreglo2.get(l)==0){
					arreglo3.remove(l);
					arreglo3.add(l,0);
					arreglo2.remove(l);
					arreglo2.add(l,1);
					fila--;
					}
					else if((int)arreglo2.get(l)!=0&&(int)arreglo1.get(l)==0&&(int)arreglo2.get(l)!=2){
						arreglo3.remove(l);
						arreglo3.add(l,0);
						arreglo2.remove(l);
						arreglo2.add(l,1);
						arreglo1.remove(l);
						arreglo1.add(l,8);
						fila--;
					}
				}
			}
			if((int)arreglo1.get(3)==0){
				arreglo1.remove(3);
				arreglo1.add(3,4);
			}
			if((int)arreglo4.get(2)==0){
				arreglo4.remove(2);
				arreglo4.add(2,4);
			}
			if((int)arreglo4.get(3)==0){
				arreglo4.remove(3);
				arreglo4.add(3,4);
			}
			if((int)arreglo4.get(4)==0){
				arreglo4.remove(4);
				arreglo4.add(4,4);
			}
		}
		else if(fila==4){//si el personaje se encuentra en la fila 4 realizara esta condicion
			//los siguientes condicionales if son usados para la logica de la indicacion donde debe ir la caja 
			if((int)arreglo1.get(3)==4){
				arreglo1.remove(3);
				arreglo1.add(3,0);
			}
			if((int)arreglo4.get(2)==4){
				arreglo4.remove(2);
				arreglo4.add(2,0);
			}
			if((int)arreglo4.get(3)==4){
				arreglo4.remove(3);
				arreglo4.add(3,0);
			}
			if((int)arreglo4.get(4)==4){
				arreglo4.remove(4);
				arreglo4.add(4,0);
			}
			for(int l=0;l<arreglo4.size;l++){//for encargado del movimientos hacia arriba de la fila 4
				if(1==(int)arreglo4.get(l)){
					if((int)arreglo3.get(l)==0){
					arreglo4.remove(l);
					arreglo4.add(l,0);
					arreglo3.remove(l);
					arreglo3.add(l,1);
					fila--;
					}
					else if((int)arreglo3.get(l)!=0&&(int)arreglo2.get(l)==0&&(int)arreglo3.get(l)!=2){
						arreglo4.remove(l);
						arreglo4.add(l,0);
						arreglo3.remove(l);
						arreglo3.add(l,1);
						arreglo2.remove(l);
						arreglo2.add(l,8);
						fila--;
					}
				}
			}
			if((int)arreglo1.get(3)==0){
				arreglo1.remove(3);
				arreglo1.add(3,4);
			}
			if((int)arreglo4.get(2)==0){
				arreglo4.remove(2);
				arreglo4.add(2,4);
			}
			if((int)arreglo4.get(3)==0){
				arreglo4.remove(3);
				arreglo4.add(3,4);
			}
			if((int)arreglo4.get(4)==0){
				arreglo4.remove(4);
				arreglo4.add(4,4);
			}
			
		}
		
	}
	System.out.println("Movimientos :"+movimientos);//Imprime el numero de movimientos que ha realizado
	for(int l=0;l<arreglo.size;l++){//Se imprime la matriz con el movimiento realizado
		System.out.println(arreglo.get(l));
		
	}
	if((int)arreglo1.get(3)==8&&(int)arreglo4.get(2)==8&&(int)arreglo4.get(3)==8&&(int)arreglo4.get(4)==8){//Si se cumple significa que las cajas estan en su posicion
		System.out.println("Bien hecho ");
		mover="x";
		m=movimientos;
	}
	if(mover.equals("x")){
		entrar=false;
	}
	}

	return m;
}

}
