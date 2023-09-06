package entidades;

public class Barco {

    private String matricula;
    private double eslora;
    private String fechaFabricacion;

    public Barco() {
    }

    public Barco(String matricula, double eslora, String fechaFabricacion) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.fechaFabricacion = fechaFabricacion;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getEslora() {
        return eslora;
    }

    public void setEslora(double eslora) {
        this.eslora = eslora;
    }

    public String getFechaFabricacion() {
        return fechaFabricacion;
    }

    public void setFechaFabricacion(String fechaFabricacion) {
        this.fechaFabricacion = fechaFabricacion;
    }

    public double calcularModulo(){
        double modulo = eslora * 10;

        return modulo;
    }

    @Override
    public String toString() {
        return "Barco{" +
                "matricula='" + matricula + '\'' +
                ", eslora=" + eslora +
                ", fechaFabricacion='" + fechaFabricacion + '\'' +
                '}';
    }
}
