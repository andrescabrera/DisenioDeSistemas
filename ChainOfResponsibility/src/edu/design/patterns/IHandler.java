package edu.design.patterns;

public interface IHandler {
	public IHandler getSuccesor();
	public void  setSuccesor(IHandler succesor);

	public void Handle(Request request) throws Exception;
}
