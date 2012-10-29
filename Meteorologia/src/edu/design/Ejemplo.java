package edu.design;

public class Ejemplo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Central c1 = new Central("c1");
		Central c2 = new Central("c2");
		
		Estacion e1 = new Estacion("e1");
		Estacion e2 = new Estacion("e2");
		Estacion e3 = new Estacion("e3");
		Estacion e4 = new Estacion("e4");
		
		c1.add(e1);
		c1.add(e2);
		c1.add(e3);
		c1.add(e4);
		
		c2.add(e2);
		c2.add(e4);
		
		Sensor s1 = new XZ25("s1");
		Sensor s2 = new L350("s2", 4000);
		Sensor s3 = new XZ25("s3");
		Sensor sp1 = new RemoteSensor(s1);
		Sensor sp2 = new RemoteSensor(s2);
		
		e1.add(s1);
		e1.add(s2);
		
		e2.add(s1);
		
		e3.add(s1);
		e3.add(s2);
		
		e4.add(sp1);
		e4.add(sp2);		
	
		s1.start();
		s2.start();
		s3.start();
		sp1.start();
		sp2.start();
		
		
	}

}
