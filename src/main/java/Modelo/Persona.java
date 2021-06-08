package Modelo;

public class Persona {

    private String nombre;
    private int id;  //static
    private int peso;
    private float estatura;
    private int edad;

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
        return "Persona{" + "nombre=" + nombre + ", id=" + id + ", peso=" + peso + ", estatura=" + estatura + ", edad=" + edad + '}';
    }
}
