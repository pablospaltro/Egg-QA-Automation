package entidades;

public class Velero extends Barco{

    private double numeroDeMastiles;

    public Velero() {
    }

    public Velero(String matricula, double eslora, String fechaFabricacion, double numeroDeMastiles) {
        super(matricula, eslora, fechaFabricacion);
        this.numeroDeMastiles = numeroDeMastiles;
    }

    public double getNumeroDeMastiles() {
        return numeroDeMastiles;
    }

    public void setNumeroDeMastiles(double numeroDeMastiles) {
        this.numeroDeMastiles = numeroDeMastiles;
    }

    @Override
    public double calcularModulo() {
        double veleroModulo = super.calcularModulo() + numeroDeMastiles;
        return veleroModulo;
    }

    @Override
    public String toString() {
        return "Velero{" +
                "numeroDeMastiles=" + numeroDeMastiles +
                "} " + super.toString();
    }
}
