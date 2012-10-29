
public class Cochera 
{
	private int NumeroIdentifica;
	private int Documento;
	private String Nombre;
	private int Telefono;
	private int Expensas;
	
	
	public Cochera(int numero,int documento,String nombre,int telefono,int expensas)
	{
		this.NumeroIdentifica = numero;
		this.Documento = documento;
		this.Nombre = nombre;
		this.Telefono = telefono;
		this.Expensas = expensas;
	}
	
	public int getNumero()
	{
		return NumeroIdentifica;
	}
	public int getDocumento()
	{
		return Documento;
	}
	public String getNombre()
	{
		return Nombre;
	}
	public int getTelefono()
	{
		return Telefono;
	}
	public int getExpensas()
	{
		return Expensas;
	}
}
