import java.util.ArrayList;

public class ControladorCliente {

    //Crear lista de clientes
    private ArrayList <Cliente> List;

    VistaCliente vista;

    ControladorCliente(VistaCliente vista){
        List = new ArrayList<Cliente>();
        this.vista = vista;
    }
 
    //Añadir cliente
    public void addCliente(){
       List.add(0, new Cliente());
       List.get(0).pedirDatos();
      
    }

    //Imrpimir lista de clientes
    public void imprimirListaClientes(){ 
        for (int i = 0; i < List.size(); i++) {
            System.out.println(List.get(i));
          } 
       }

    //Buscar cliente por número de cuenta
    public int obtNumeroCuenta(int buscarNumeroCuenta){ // Buscar cliente en el ArrayList

        int posicion = -1;
        for (int i = 0; i < List.size(); i++) {
            if (List.get(i).getNumeroCuenta() == buscarNumeroCuenta) {
                    return i;
            }
        }
        return posicion;
    }

    //Mostrar información del cliente por número de cuenta
    public Cliente informacionCliente(int posicion){ 

        if (posicion != -1) {
           return List.get(posicion);
        }
        return null;
  
     } 

    //Método controlador para depositar
    public void controladorDepositar(Cliente c){

        if(c != null){

            vista.informacionDeposito(c.deposito(vista.cantidadDeposito(c)));

        }else{

            vista.cantidadDeposito(c);
        }

    }

    //Método controlador para retirar
    public void controladorRetirar(Cliente d){

        if(d != null){

            vista.informacionRetiro(d.retiro(vista.cantidadRetiro(d)));

        }else{

            vista.cantidadRetiro(d);
        }

    }

    //Método controlador para transferir
    public void controladorTrasferir(Cliente cliente1,Cliente cliente2){

        if(cliente1 == null){

            vista.cantidadTransferir(cliente1);

        }else{
            if(cliente2 == null){

                vista.cantidadTransferir(cliente2);

            }else{

                vista.informacionTransferir(cliente1.transferir(cliente2, vista.cantidadTransferir(cliente1)));
            }
        }
    }

    //Menu principal
    public void MenuCliente(){
        Integer opcion = 0;

        while(opcion != 6){
            switch(vista.Menu()){
                case 1: addCliente(); break; //Añadir cliente

                case 2: Cliente c; //Realizar deposito
                        c = informacionCliente(vista.pedirNumeroCuenta());
                        controladorDepositar(c);
                        break;

                case 3: Cliente d; //Realizar retiro
                        d = informacionCliente(vista.pedirNumeroCuenta());
                        controladorRetirar(d);
                        break;

                case 4: Cliente cliente1; //Realizar retiro
                        cliente1 = informacionCliente(vista.pedirCuentaTransferir());
                        Cliente cliente2;
                        cliente2 = informacionCliente(vista.pedirCuentaRecibir());
                        controladorTrasferir(cliente1, cliente2);
                        break;

                case 5: Integer aux; //Búsqueda del cliente por cuenta
                        aux = vista.pedirNumeroCuenta(); 
                        vista.imprimirInfoCliente(informacionCliente(obtNumeroCuenta(aux)));
                        break; 

                case 6: opcion = 6; break; //Salir del menú

            } //Fin switch
        } //Fin while
    }



}
