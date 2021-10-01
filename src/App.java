public class App {
    //Aplicacion para el banco
    public static void main(String[] args) throws Exception {
        VistaCliente vista = new VistaCliente();
        ControladorCliente Clientes = new ControladorCliente(vista);
        Clientes.MenuCliente();
    }
}
