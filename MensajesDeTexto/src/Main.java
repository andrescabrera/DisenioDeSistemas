
public class Main {

	public static void main(String[] args) {
		Antena antena = new Antena();
		
		Celular c1 = new Celular(1111, antena);
		
		Celular c2 = new Celular(2222, antena);
		Celular c3 = new Celular(3333, antena);
		
		c1.enviarMensaje(new Mensaje("hola mundo 1", 2222));
		c2.enviarMensaje(new Mensaje("gracias c1, hola mundo para vos", 1111));
		
		c2.enviarMensaje(new Mensaje("hola mundo 2", 3333));
		c3.enviarMensaje(new Mensaje("gracias c2, hola mundo para vos", 2222));
		
	}

}
