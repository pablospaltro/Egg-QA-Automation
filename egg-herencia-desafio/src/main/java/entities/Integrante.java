package entities;

import enums.Sexo;
import enums.Vinculos;
import java.time.LocalDate;

public class Integrante {

    protected Integer orden;

    protected String apellido;

    protected String nombre;

    protected LocalDate fechaNacimiento;

    protected Integer DNI;

    protected Sexo sexo;

    protected Vinculos vinculo;

    protected ProblemaDeSalud salud;

    protected AbordajeNutricional nutricion;
    
    protected Familia familia;

    public Integrante() {
    }

    public Integrante(Integer orden, String apellido, String nombre, LocalDate fechaNacimiento, Integer DNI, Sexo sexo, Vinculos vinculo) {
        this.orden = orden;
        this.apellido = apellido;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.DNI = DNI;
        this.sexo = sexo;
        this.vinculo = vinculo;
    }

    public Familia getFamilia() {
        return familia;
    }

    public void setFamilia(Familia familia) {
        this.familia = familia;
    }

    public Integer getOrden() {
        return orden;
    }

    public void setOrden(Integer orden) {
        this.orden = orden;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Integer getDNI() {
        return DNI;
    }

    public void setDNI(Integer DNI) {
        this.DNI = DNI;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public Vinculos getVinculo() {
        return vinculo;
    }

    public void setVinculo(Vinculos vinculo) {
        this.vinculo = vinculo;
    }

    public ProblemaDeSalud getSalud() {
        return salud;
    }

    public void setSalud(ProblemaDeSalud salud) {
        salud.setOrden(this.orden);
        this.salud = salud;
    }

    public AbordajeNutricional getNutricion() {
        return nutricion;
    }

    public void setNutricion(AbordajeNutricional nutricion) {
        this.nutricion = nutricion;
    }

    @Override
    public String toString() {
        return "Integrante{" +
                "orden=" + orden +
                ", apellido='" + apellido + '\'' +
                ", nombre='" + nombre + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                ", DNI=" + DNI +
                ", sexo=" + sexo +
                ", vinculo=" + vinculo +
                ", salud=" + salud +
                ", nutricion=" + nutricion +
                ", familia=" + familia +
                '}';
    }
}
