package edu.design;

import java.util.ArrayList;

public class XZ25 extends RealSensor {
	private int i = 0;
	private boolean started = false;
	private Thread th = null;

	public XZ25(String name) {
		super(name);
		th = new Thread(new Runnable() {

			@Override
			public void run() {
				while (started) {
					try {
						fireCollect();
						Thread.sleep(30000);
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
	protected SamplingStrategy select(ArrayList<SamplingStrategy> strategies) {
		i++;
		return strategies.get(i % 2);
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

}
