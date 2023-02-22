package consola;


public class Aplicacion {
	
	private static Restaurante restaurante = new modelo.Restaurante();
	private static ArrayList<ProductoAjustado> productos_pedido = new Arraylist<>;
	
	
	
	
	public static void mostrar_menu()
	{
		System.out.println("\nOpciones de la aplicación\n");
		System.out.println("1 Mostrar el menú");
		System.out.println("2 Iniciar un nuevo pedido");
		System.out.println("3 Agregar un elemento a un pedido");
		System.out.println("4 Cerrar un pedido y guardar la factura");
		System.out.println("5 Consultar la informacion de un pedido dado su id");
		System.out.println("6 Salir de la aplicación");
	}
	
}