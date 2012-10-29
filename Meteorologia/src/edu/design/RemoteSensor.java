package edu.design;

public class RemoteSensor implements Sensor {

	private Sensor sensor;
	

	public RemoteSensor(Sensor s) {
		this.sensor = s;
	}

	@Override
	public void add(SensorListener listener) {
		sensor.add(listener);
	}

	@Override
	public void remove(SensorListener listener) {
		sensor.remove(listener);
	}

	@Override
	public void start() {
		sensor.start();
	}

	@Override
	public void stop() {
		sensor.stop();
	}
	
	@Override
	public String getName() {
		return this.sensor.getName();
	}
}
