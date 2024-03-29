package edu.design;
//Un grupo de investigadores encontro hace unos a�os, en un sotano de Palermo,
//un objeto extra�o y de altisima tecnologia. Luego de meses de estudio, se
//logro deducir que el objeto era una "maquina del tiempo" inventada por un tal
//Dr. Marron.
//
//Como la maquina hace mucho tiempo que no se usa, se desea hacer primero
//una prueba con alumnos de dise�o de sistemas como pasajeros, para garantizar
//la integridad de los atomos que conforman los cuerpos de los profesores.
//
//Un equipo de programadores ha desarrollado un sistema que determina puntos
//"interesantes" en el tiempo que son dignos de ser visitados, y los devuelve
//como objetos Date de Java.
//
//Debido a la altisima complejidad que presenta la maquina del tiempo del
//Dr. Marron, no se puede hacer *NINGUN* cambio y tampoco se tiene idea de como
//funciona.
//
//Lo unico que se conoce acerca de la maquina es que se invoca el metodo 
//timejump() y especificando a que punto en el tiempo en ticks Unix al que
//deseamos viajar.
//Recordemos que el tick 0 corresponde al 1/1/1970 a las 00:00:00.
//Ticks positivos representan milisegundos despues de ese momento en el tiempo, y
//ticks negativos representan milisegundos antes de ese momento en el tiempo.
//
//TimeMachine:
//       public void timejump(long ticks);
//
//Notese la incompatibilidad entre el tipo de dato devuelto por el sistema de
//tiempos interesantes y el tipo de dato del parametro requerido por el metodo
//timejump(). 
//
//Su trabajo es solucionar esta incompatibilidad.
import java.util.Date;

public class Program {
	public static void main(String[] args) {
		
		TargetTimeMachine granInvento = new TimeMachineUnixAdapter();
		ExistingSystem myBoss = new ExistingSystem();
		
		Date dateToJump = myBoss.WhenToJumpTo();
		
		granInvento.timejump(dateToJump); //UPS
		
		
	}

}
