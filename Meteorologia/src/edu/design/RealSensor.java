package edu.design;

import java.util.ArrayList;

public abstract class RealSensor implements Sensor {

	private ArrayList<SensorListener> listeners = new ArrayList<SensorListener>();
	private ArrayList<SamplingStrategy> strategies = new ArrayList<SamplingStrategy>();
	private String name;

	
	protected RealSensor(String name)
	{
		this.name = name;
		this.strategies.add(new PCT());
		this.strategies.add(new PJP());
	}
	
	public void add(SensorListener listener) {
		this.listeners.add(listener);
	}

	public void remove(SensorListener listener) {
		this.listeners.remove(listener);
	}

	protected void collect() {
		initHardware();
		SamplingStrategy strategy = select(this.strategies);
		Sample sample = strategy.collect();
		for (SensorListener l : listeners) {
			l.receive(sample, this);
		}
	}
	
	protected ArrayList<SamplingStrategy> getSamplingStrategies()
	{
		return this.strategies;
	}
	
	
	@Override
	public String getName() {
		return this.name;
	}
	
	public abstract void start();
	public abstract void stop();
	protected abstract void initHardware();
	protected abstract SamplingStrategy select(ArrayList<SamplingStrategy> strategies);
}
