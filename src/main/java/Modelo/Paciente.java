package Modelo;

public class Paciente extends Persona{
    
    private String enfermedadPrincipal;
    private int numeroPaciente;
    private boolean estado;  //true se encuentra bien el paciente, false paciente se encuentra mal
    private int temperatura;
    private String sintomas;

    public Paciente(String enfermedadPrincipal, int numeroPaciente, boolean estado, int temperatura, String sintomas, String nombre, int id, int peso, float estatura, int edad) {
        super(nombre, id, peso, estatura, edad);
        this.enfermedadPrincipal = enfermedadPrincipal;
        this.numeroPaciente = numeroPaciente;
        this.estado = estado;
        this.temperatura = temperatura;
        this.sintomas = sintomas;
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

    public int getTemperatura() {
        return temperatura;
    }

    public String getSintomas() {
        return sintomas;
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

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }

    public void setSintomas(String sintomas) {
        this.sintomas = sintomas;
    }
    
}
