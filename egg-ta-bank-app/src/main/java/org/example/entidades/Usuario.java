package org.example.entidades;

public class Usuario {

    String usuarioNombre;
    String usuarioPassword;
    int usuarioFondos;

    public Usuario() {
    }

    public Usuario(String usuarioNombre, String usuarioPassword, int usuarioFondos) {
        this.usuarioNombre = usuarioNombre;
        this.usuarioPassword = usuarioPassword;
        this.usuarioFondos = usuarioFondos;
    }

    public String getUsuarioNombre() {
        return usuarioNombre;
    }

    public void setUsuarioNombre(String usuarioNombre) {
        this.usuarioNombre = usuarioNombre;
    }

    public String getUsuarioPassword() {
        return usuarioPassword;
    }

    public void setUsuarioPassword(String usuarioPassword) {
        this.usuarioPassword = usuarioPassword;
    }

    public int getUsuarioFondos() {
        return usuarioFondos;
    }

    public void setUsuarioFondos(int usuarioFondos) {
        this.usuarioFondos = usuarioFondos;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "usuarioNombre='" + usuarioNombre + '\'' +
                ", usuarioPassword='" + usuarioPassword + '\'' +
                ", usuarioFondos=" + usuarioFondos +
                '}';
    }
}
