package entidades;

public class Yate extends BarcoAMotor{

    private double numeroDeCamarotes;

    public Yate() {
    }

    public Yate(String matricula, double eslora, String fechaFabricacion, double potencia, double numeroDeCamarotes) {
        super(matricula, eslora, fechaFabricacion, potencia);
        this.numeroDeCamarotes = numeroDeCamarotes;
    }

    public double getNumeroDeCamarotes() {
        return numeroDeCamarotes;
    }

    public void setNumeroDeCamarotes(double numeroDeCamarotes) {
        this.numeroDeCamarotes = numeroDeCamarotes;
    }

    @Override
    public double calcularModulo() {
        double yateModulo = super.calcularModulo() + numeroDeCamarotes;
        return yateModulo;
    }

    @Override
    public String toString() {
        return "Yate{" +
                "numeroDeCamarotes=" + numeroDeCamarotes +
                "} " + super.toString();
    }
}
