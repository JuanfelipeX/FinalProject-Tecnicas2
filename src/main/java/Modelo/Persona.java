package Modelo;

public class Persona {

    protected String nombre;
    protected int id;  //static
    protected int peso;
    protected float estatura;
    protected int edad;

    public Persona(String nombre, int id, int peso, float estatura, int edad) {
        this.nombre = nombre;
        this.id = id;
        this.peso = peso;
        this.estatura = estatura;
        this.edad = edad;
    }

    public Persona() {
    }

    public String getNombre() {
        return nombre;
    }

    public int getPeso() {
        return peso;
    }

    public float getEstatura() {
        return estatura;
    }

    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public void setEstatura(float estatura) {
        this.estatura = estatura;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "La Persona:" + nombre + "\nIdentificacion: " + id + "\nPeso: " + peso + "\nEstatura: " + estatura + "\nEdad: " + edad ;
    }
}
