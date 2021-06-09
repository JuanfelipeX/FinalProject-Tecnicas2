package Modelo;

public class PacienteFatal extends Paciente{
    
    private boolean necesitaOxigeno; //true si, false no
    private boolean necesitaSillaRuedas; 
    private boolean tieneCovid;

    public PacienteFatal(boolean necesitaOxigeno, boolean necesitaSillaRuedas, boolean tieneCovid, String enfermedadPrincipal, int numeroPaciente, boolean estado, int temperatura, String sintomas, String nombre, int id, int peso, float estatura, int edad) {
        super(enfermedadPrincipal, numeroPaciente, estado, temperatura, sintomas, nombre, id, peso, estatura, edad);
        this.necesitaOxigeno = necesitaOxigeno;
        this.necesitaSillaRuedas = necesitaSillaRuedas;
        this.tieneCovid = tieneCovid;
    }
    
    public PacienteFatal(){
        
    }

    public boolean isNecesitaOxigeno() {
        return necesitaOxigeno;
    }

    public boolean isNecesitaSillaRuedas() {
        return necesitaSillaRuedas;
    }

    public boolean isTieneCovid() {
        return tieneCovid;
    }

    public void setNecesitaOxigeno(boolean necesitaOxigeno) {
        this.necesitaOxigeno = necesitaOxigeno;
    }

    public void setNecesitaSillaRuedas(boolean necesitaSillaRuedas) {
        this.necesitaSillaRuedas = necesitaSillaRuedas;
    }

    public void setTieneCovid(boolean tieneCovid) {
        this.tieneCovid = tieneCovid;
    }

    @Override
    public String toString() {
        return "Paciente Fatal:"+nombre + "\nNecesita Oxigeno: " + necesitaOxigeno + "\nNecesita silla de ruedas: " + necesitaSillaRuedas + "\nTiene Covid:" + tieneCovid ;
    }
}
