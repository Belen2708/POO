import java.util.Scanner;

public class VistaCliente {
    
    private Scanner lectura;

    public Integer Menu(){
        lectura = new Scanner(System.in);
       
        System.out.println("\n***Menú***");
        System.out.println("1-Agregar cliente ");
        System.out.println("2-Realizar deposito ");
        System.out.println("3-Realizar retiro ");
        System.out.println("4-Realizar transferencia ");
        System.out.println("5-Búsqueda de cliente por cuenta ");
        System.out.println("6-Salir");
        System.out.print("\nOpción : ");
        
        return lectura.nextInt();
    }

    //Pedir número de cuenta por cliente
    public Integer pedirNumeroCuenta(){
         
        lectura = new Scanner(System.in);
        System.out.println("Número de cuenta: ");
        return lectura.nextInt();
    }

    //Imprimir información del cliente por número de cuenta 
    public void imprimirInfoCliente(Cliente obj1){ //Impresión de información de estudiante
        if (obj1 != null) {
            System.out.println("Cliente encontrado");
            System.out.println(obj1);
            
        }else{
            System.out.println("Cliente no encontrado");
        } 
    }

    //Pedir cantidad de deposito
    public double cantidadDeposito(Cliente n) {

        double cantidad;

        if(n != null){

            System.out.println("Ingrese la cantidad que desea depositar: ");
            cantidad = lectura.nextDouble();

            return cantidad;
        }else{
            System.out.println("--No se encontro al cliente--");

            return cantidad = 0.0;
        } 
    }

    //Imprimir si el deposito fue correcto o no
    public void informacionDeposito(boolean info){

        if(info == false){
            System.out.println("--No se pudo realizar el deposito--");

        }else{
            System.out.println("--El deposito fue correcto--");
        } 
    }

    //Pedir cantidad a retirar
    public double cantidadRetiro(Cliente d){

        double cantidadRet;

        if(d != null){
            System.out.println("Ingrese la cantidad que desea retirar: ");
            cantidadRet = lectura.nextDouble();

            return cantidadRet;

        }else{
            System.out.println("--No se encontro al cliente--");

            return cantidadRet = 0.0;
        } 
    }

    //Imprimir si el retiro fue correcto o no
    public void informacionRetiro(boolean info){

        if(info == false){
            System.out.println("--No se pudo realizar el retiro--");

        }else{

            System.out.println("--El retiro fue correcto--");
        } 
    }

    //Pedir el numero de cuenta donde se hara la tranferencia
    public int pedirCuentaTransferir() {

        System.out.println("Ingrese el número de cuenta: ");

        return lectura.nextInt();
    }

    //Pedir el numero de cuenta donde se va a trasferir
    public int pedirCuentaRecibir(){

        System.out.println("Ingrese el número de cuenta donde se desea transferir: ");
        return lectura.nextInt();

    }

    //Pedir cantidad a transferir
    public double cantidadTransferir(Cliente e){
        double cantidad3;

        if(e==null){

            System.out.println("--No se encontro el número de cuenta para la trasnferencia--");

            return cantidad3 = 0.0;

        }else{
            System.out.println("Ingrese la cantidad a transferir: ");
            cantidad3 = lectura.nextDouble();

            return cantidad3;

        }
    }

    //Imprimir si la transferencia fue correcta o no
    public void informacionTransferir(boolean inf){

        if(inf == false){

            System.out.println("--No se pudo realizar la transferencia--");

        }else{

            System.out.println("--La transferencia fue correcta--");
        }

    }



}
