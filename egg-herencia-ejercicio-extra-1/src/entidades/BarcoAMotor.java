package entidades;

public class BarcoAMotor extends Barco{

    private double potencia;

    public BarcoAMotor() {
    }

    public BarcoAMotor(String matricula, double eslora, String fechaFabricacion, double potencia) {
        super(matricula, eslora, fechaFabricacion);
        this.potencia = potencia;
    }

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    @Override
    public double calcularModulo() {
        double barcoAMotorModulo = super.calcularModulo() + potencia;
        return barcoAMotorModulo;
    }

    @Override
    public String toString() {
        return "BarcoAMotor{" +
                "potencia=" + potencia +
                "} " + super.toString();
    }
}
