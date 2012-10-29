package edu.design;

public class PCT implements SamplingStrategy {

	@Override
	public Sample collect() {
		return new Sample((int)(Math.random() * Integer.MIN_VALUE));
	}

}
