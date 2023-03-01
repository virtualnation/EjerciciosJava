public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente();
        cliente1.setEdad(22);
        cliente1.setNombre("Marina");
        cliente1.setTelefono(652437454);
        cliente1.setCredito(10000);

        System.out.println("\nDatos del cliente:");
        System.out.println("Nombre: "+cliente1.getNombre());
        System.out.println("Edad: "+cliente1.getEdad());
        System.out.println("Teléfono: "+cliente1.getTelefono());
        System.out.println("Crédito: "+cliente1.getCredito());

        Trabajador trabajador1 = new Trabajador();
        trabajador1.setEdad(43);
        trabajador1.setNombre("Pau");
        trabajador1.setTelefono(651325476);
        trabajador1.setSalario(1600);

        System.out.println("\nDatos del trabajador:");
        System.out.println("Nombre: "+trabajador1.getNombre());
        System.out.println("Edad: "+trabajador1.getEdad());
        System.out.println("Teléfono: "+trabajador1.getTelefono());
        System.out.println("Salario: "+trabajador1.getSalario()+"€");
    }
}
class Persona{
    int edad;
    String nombre;
    int telefono;
}
class Cliente extends Persona{
    int credito;

    //Edad
    public void setEdad(int edad){
        this.edad = edad;
    }
    public int getEdad(){
        return this.edad;
    }

    //Nombre
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return this.nombre;
    }

    //Telefono
    public void setTelefono(int telefono){
        this.telefono = telefono;
    }
    public int getTelefono(){
        return this.telefono;
    }

    //Credito
    public void setCredito(int credito){
        this.credito = credito;
    }
    public int getCredito(){
        return this.credito;
    }
}
class Trabajador extends Persona{
    int salario;

    //Edad
    public void setEdad(int edad){
        this.edad = edad;
    }
    public int getEdad(){
        return this.edad;
    }

    //Nombre
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return this.nombre;
    }

    //Telefono
    public void setTelefono(int telefono){
        this.telefono = telefono;
    }
    public int getTelefono(){
        return this.telefono;
    }

    //Salario

    public void setSalario(int salario){
        this.salario = salario;
    }
    public int getSalario(){
        return this.salario;
    }
}



