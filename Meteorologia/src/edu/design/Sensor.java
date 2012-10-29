package edu.design;

public interface Sensor {
	String getName();
	void add(SensorListener listener);
	void remove(SensorListener listener);
	void start();
	void stop();
}
