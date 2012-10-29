package edu.design;

import java.util.ArrayList;

public class L350 extends RealSensor {

	private boolean started = false;
	private Thread th = null;
	
	public L350(String name, final int millis) {
		super(name);
		th = new Thread(new Runnable() {

			@Override
			public void run() {
				while (started) {
					try {
						fireCollect();
						Thread.sleep(millis);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}

		});
	}

	private void fireCollect() {
		super.collect();
	}

	@Override
	protected void initHardware() {
		// TODO Auto-generated method stub

	}

	@Override
	public void stop() {
		this.started = false;
	}

	@Override
	public void start() {
		if (!this.started) {
			this.started = true;
			th.start();
		}
	}

	@Override
	protected SamplingStrategy select(ArrayList<SamplingStrategy> strategies) {
		return strategies.get(0);
	}

}
