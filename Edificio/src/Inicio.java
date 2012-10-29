import java.util.List;
import java.util.Random;
import java.util.ArrayList;

public class Inicio 
{
	public static void main(String[] args)
	{
		Random n = new Random();
		List<Departamento> dep = new ArrayList<Departamento>();
		List<Cochera> coch = new ArrayList<Cochera>();
		
		String propietario[] = {"pedro1","pedro2","pedro3","pedro4","pedro5"};
		
		for (int i=0;i<25;i++)
		{
			int ambientes = (int)(Math.random()*(6-1+1)+1);

			int aux = n.nextInt(2);
			String balcon[] = {"SI","NO"};
			
			int cubierta = (int)(Math.random()*(100-50+1)+50);
			int descubierta = (int)(Math.random()*(10-5+1)+5);
			 
			int aux2 = n.nextInt(5);
			
			String identifica[] = {"A","B","C","D","E"};
			int aux3 = n.nextInt(5);
			
			int expensas = cubierta*50+descubierta*25;
			
			dep.add(new Departamento(ambientes,balcon[aux],cubierta,descubierta,propietario[aux2],identifica[aux3],expensas));
		}
		
		for(int i=0;i<10;i++)
		{
			int numero = i+1;
			int aux = n.nextInt(5);
			
			int documento = (int)(Math.random()*(5000-4000+1)+4000);
			int telefono = (int)(Math.random()*(4000-3000+1)+3000);
			
			coch.add(new Cochera(numero,documento,propietario[aux],telefono,100));
		}
		
		int promedio = 0;
		
		for(Departamento d:dep)
		{
			System.out.println("El departamento: "+d.getLetra() +" Propietario: "+d.getPropietario());
			System.out.println("Tiene Balcon: "+d.getBalcon());
			System.out.println("Superficie Cubierta: "+d.getCubierta()+" Descubierta: "+d.getDescubierta());
			System.out.println("Expensas a pagar: "+d.getExpensas()+"$");
			
			promedio = d.getExpensas() + promedio;
		}
		
		promedio = promedio/25;
		
		for(Cochera c:coch)
		{
			System.out.println("Cochera: "+c.getNumero());
			System.out.println("Propietario: "+c.getNombre());
			System.out.println("Documento: "+c.getDocumento());
			System.out.println("Telefono: "+c.getTelefono());
			System.out.println("Expensas a pagar: "+c.getExpensas());
		}
		
		int promedioCochera = 100;
		int promedioTotal = (promedio+promedioCochera)/2;
		
		System.out.println("El promedio de los Departamentos es: "+promedio);
		System.out.println("El promedio de las cocheras es: "+promedioCochera);
		System.out.println("El promedio Total: "+promedioTotal);
	}
}
