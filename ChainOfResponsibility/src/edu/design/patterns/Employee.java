package edu.design.patterns;

public class Employee implements IHandler {
	private float maxAmount = 0;
	private IHandler succesor = null;
	private String name;

	public Employee(String name, float maxAmount, IHandler succesor) {
		this.name = name;
		this.maxAmount = maxAmount;
		this.succesor = succesor;
	}

	public void Handle(Request request) throws Exception {
		if (request.getAmount() > this.maxAmount) {
			IHandler s = this.getSuccesor();
			if (s == null)
				throw new Exception("Nadie lo puede aprobar!!!");
			System.out.println(this.name +  " - Se lo paso a mi superior...");
			this.getSuccesor().Handle(request);
		} else {
			System.out.println(this.name +  " - Yo lo aprobe");
			request.setApproved(true);
		}
	}

	public IHandler getSuccesor() {
		return this.succesor;
	}

	public void setSuccesor(IHandler succesor) {
		this.succesor = succesor;

	}

}
