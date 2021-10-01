import java.util.Scanner;

public class Cliente {
    //Atributos

    private String nombre;
    private String apellido;
    private Integer numeroCuenta;
    private Double saldo;

    //Setters y getters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre(){
        return this.nombre;
    }

    public void setApellido(String apellido){
        this.apellido = apellido;
    }

    public String getApellido(){
        return this.apellido;
    }

    public void setNumeroCuenta(Integer numeroCuenta){
        this.numeroCuenta = numeroCuenta;
    }

    public Integer getNumeroCuenta(){
        return this.numeroCuenta;
    }

    public void setSaldo(Double saldo){
        this.saldo = saldo;
    }

    public Double getSaldo(){
        return this.saldo;
    }

    //Método para pedir datos
    public void pedirDatos(){
        Scanner lectura = new Scanner(System.in);

        System.out.println("Ingrese el nombre: ");
        setNombre(lectura.next());

        System.out.println("Ingrese el apellido: ");
        setApellido(lectura.next());

        System.out.println("Ingrese el número de cuenta: ");
        setNumeroCuenta(lectura.nextInt());

        System.out.println("Ingrese el saldo: ");
        setSaldo(lectura.nextDouble());
    } 

    @Override
    public String toString() {
        return "\nNombre: " + nombre +" "+ apellido + "\nNúmero de cuenta: " + numeroCuenta + "\nSaldo: " + saldo;
    }

    //Métdodo para realizar deposito
    public boolean deposito(double n) {

        boolean depositoCorrecto = true;

        Scanner lectura = new Scanner(System.in);
        System.out.println("Ingrese la cantidad a depositar: ");
        n = lectura.nextDouble();

        if (n < 0) {
            depositoCorrecto = false;
        } else {
            saldo = saldo + n;
        }
        return depositoCorrecto;
    }

    //Método para realizar retiro
    public boolean retiro(double n) {
        boolean retiroCorrecto = true;  

        if (n < 0.0) {
            retiroCorrecto = false;

        } else{

            if (saldo >= n){
                saldo -= n;

            }else{
                retiroCorrecto = false;
            }
        }
        return retiroCorrecto;
    }

    //Método para para realizar transferencia
    public boolean transferir(Cliente cliente, double y ){

        boolean tranferenciaCorrecta= true;

        if (y < 0.0) {

            tranferenciaCorrecta = false;

        } else{
            if (cliente.getSaldo() >= y) {

                retiro(y);
                cliente.deposito(y);

            } else {

                tranferenciaCorrecta = false;
            }
        }
        return tranferenciaCorrecta;
    }
}