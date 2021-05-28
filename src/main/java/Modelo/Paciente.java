package Modelo;

public class Paciente extends Persona{
    
    private String enfermedadPrincipal;
    private int numeroPaciente;
    private boolean estado;  //true se encuentra bien el paciente, false paciente se encuentra mal

    public Paciente(String enfermedadPrincipal, int numeroPaciente, boolean estado, String nombre, int id, int peso, float estatura, int edad) {
        super(nombre, id, peso, estatura, edad);
        this.enfermedadPrincipal = enfermedadPrincipal;
        this.numeroPaciente = numeroPaciente;
        this.estado = estado;
    }

    public String getEnfermedadPrincipal() {
        return enfermedadPrincipal;
    }

    public int getNumeroPaciente() {
        return numeroPaciente;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEnfermedadPrincipal(String enfermedadPrincipal) {
        this.enfermedadPrincipal = enfermedadPrincipal;
    }

    public void setNumeroPaciente(int numeroPaciente) {
        this.numeroPaciente = numeroPaciente;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    
}
