
public class Departamento 
{
	private int CantidadAmbientes;
	private String Balcon;
	private int SupCubierta;
	private int SubDescubierta;
	private String Propietario;
	private String Letra;
	private int Expensas;
	
	public Departamento(int cantidad,String balcon,int cubierta,int descubierta,String propietario, String letra,int expensas)
	{
		this.CantidadAmbientes = cantidad;
		this.Balcon = balcon;
		this.SupCubierta = cubierta;
		this.SubDescubierta = descubierta;
		this.Propietario = propietario;
		this.Letra = letra;
		this.Expensas = expensas;
	}

	public int getCantidadAmbientes() 
	{
		return CantidadAmbientes;
	}
	public String getBalcon()
	{
		return Balcon;
	}
	public int getCubierta()
	{
		return SupCubierta;
	}
	public int getDescubierta()
	{
		return SubDescubierta;
	}
	public String getPropietario()
	{
		return Propietario;
	}
	public String getLetra()
	{
		return Letra;
	}
	public int getExpensas()
	{
		return Expensas;
	}
}
