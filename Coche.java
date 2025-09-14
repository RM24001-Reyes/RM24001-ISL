public abstract class Coche {
    String marca;
    String modelo;
    String color;
    boolean encendido;

    public Coche( String marca, String modelo, String color) {
    
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.encendido = false;
    }
    public void arrancar (){
        this.encendido= true;
        System.out.println("El " + this.marca + " " + this.modelo+ " ha arrancado");
    }
    public void apagar (){
        this.encendido = false;
        System.out.println("El " + this.marca + " " + this.modelo + " esta apagado");
    }
    public void describir (){
        String estado = this.encendido ? "encendido" : "apagado";
        System.out.println( "El " + this.marca + " " + this.modelo + " de color " + this.color + " esta " + estado);
    }

}
