package edu.design;

import java.util.Calendar;
import java.util.Date;

public class ExistingSystem {
	public Date WhenToJumpTo() {
		Calendar c1 = Calendar.getInstance();
		c1.set(1999, 0, 20); // 1999 jan 20
		return c1.getTime();
	}
}
