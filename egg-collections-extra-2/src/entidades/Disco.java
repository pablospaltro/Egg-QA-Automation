package entidades;

public class Disco implements Comparable<Disco> {

    private String nombre;
    private Integer cantidadVendida;

    public Disco() {
    }

    public Disco(String nombre, Integer cantidadVendida) {
        this.nombre = nombre;
        this.cantidadVendida = cantidadVendida;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getCantidadVendida() {
        return cantidadVendida;
    }

    public void setCantidadVendida(Integer cantidadVendida) {
        this.cantidadVendida = cantidadVendida;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
        result = prime * result + cantidadVendida;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Disco other = (Disco) obj;
        if (nombre == null) {
            if (other.nombre != null)
                return false;
        } else if (!nombre.equals(other.nombre))
            return false;
        if (cantidadVendida != other.cantidadVendida)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "nombre= " + nombre + ", cantidadVendida= " + cantidadVendida;
    }

    @Override
    public int compareTo(Disco o) {
        return o.getCantidadVendida().compareTo(this.cantidadVendida);
    }
}
