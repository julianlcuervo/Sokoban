package Sokoban;

import Implementacion.Chain;
/**
 * Esta Clase se implementa para los movimientos de derecha eh izquierda del jugador
 * @author julian Cuervo 
 */
public class Movimientos {
	/**
	 * 
	 * @param arreglo1- recibe el arreglo donde se encuentra el jugador
	 * 
	 * Este metodo mueve al jugador a la derecha
	 */
	public static void Mderecha(Chain arreglo1){
		for(int l=0;l<arreglo1.size;l++){
			if(1==(int)arreglo1.get(l)){
				if((int)arreglo1.get(l+1)==0){
				arreglo1.remove(l);
				arreglo1.add(l,0);
				arreglo1.remove(l++);
				arreglo1.add(l++,1);
				}
			else if((int)arreglo1.get(l+1)!=0&&(int)arreglo1.get(l+1)!=2){
				if((int)arreglo1.get(l+2)==0){
				arreglo1.remove(l);
				arreglo1.add(l,0);
				arreglo1.remove(l+1);
				l--;
				arreglo1.add(l+1,1);
				arreglo1.remove(l+2);
				arreglo1.add(l+3,8);
				}
			}
			}
			
		}
	}
	/**
	 * 
	 * @param arreglo1- recibe el arreglo donde se encuentra el jugador
	 * Este metodo mueve al jugador a la izquierda
	 */
	public static void Mizquierda(Chain arreglo1){
		for (int l = 0; l < arreglo1.size(); l++) {
			if(1==(int)arreglo1.get(l)){
				if((int)arreglo1.get(l-1)==0){
					arreglo1.remove(l);
					arreglo1.add(l,0);
					arreglo1.remove(l--);
					arreglo1.add(l,1);
					}
				else if((int)arreglo1.get(l-1)!=0&&(int)arreglo1.get(l-1)!=2){
					if((int)arreglo1.get(l-2)==0){
					arreglo1.remove(l);
					arreglo1.add(l,0);
					arreglo1.remove(l-1);
					arreglo1.add(l--,1);
					arreglo1.remove(l--);
					arreglo1.add(l,8);	
					}
				}
			}
		}
	}

}
	
