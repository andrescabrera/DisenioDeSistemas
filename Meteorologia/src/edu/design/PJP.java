package edu.design;

public class PJP implements SamplingStrategy {

	@Override
	public Sample collect() {
		return new Sample((int)(Math.random() * Integer.MAX_VALUE));
	}

}
