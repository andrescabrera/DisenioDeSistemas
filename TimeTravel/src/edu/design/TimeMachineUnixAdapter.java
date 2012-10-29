package edu.design;

import java.util.Date;

public class TimeMachineUnixAdapter implements TargetTimeMachine {
		
	private UnixTimeMachine granInvento = new UnixTimeMachine();
	
	/* (non-Javadoc)
	 * @see edu.design.TimeMachine#timejump(java.util.Date)
	 */
	public void timejump(Date date) {
		
		long fechaEnTicks = Date.UTC(date.getYear(), date.getMonth(), date.getDate(), date.getHours(), date.getMinutes(), date.getSeconds());
		
		granInvento.timejump(fechaEnTicks);

	}
	
	
	
}
