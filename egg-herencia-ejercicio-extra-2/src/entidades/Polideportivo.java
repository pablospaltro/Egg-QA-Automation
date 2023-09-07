package entidades;

public class Polideportivo extends Edificio {

    private String nombre;
    private String tipoDeInstalacion;

    public Polideportivo() {
    }

    public Polideportivo(double ancho, double alto, double largo, String nombre, String tipoDeInstalacion) {
        super(ancho, alto, largo);
        this.nombre = nombre;
        this.tipoDeInstalacion = tipoDeInstalacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoDeInstalacion() {
        return tipoDeInstalacion;
    }

    public void setTipoDeInstalacion(String tipoDeInstalacion) {
        this.tipoDeInstalacion = tipoDeInstalacion;
    }






    @Override
    public double calcularSuperficie() {
        double superficiePolideportivo = 2 * (getLargo() * getAncho() + getLargo() * getAlto() + getAncho() * getAlto());
        return superficiePolideportivo;
    }

    @Override
    public double calcularVolumen() {
        double volumenPolideportivo = getLargo() * getAncho() * getAlto();
        return volumenPolideportivo;
    }
}
