package EstacionesMedicion;

/**
 * @version 1.0
 * @created 17-may-2012 08:26:48 p.m.
 */
public interface ICapturador {

	public byte[] capturarDelAmbiente();

	public void prepararHardware();

}