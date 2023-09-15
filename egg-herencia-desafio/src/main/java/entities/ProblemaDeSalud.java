package entities;

public class ProblemaDeSalud {

    private Integer orden;

    private Integer IDE;

    private boolean HTA;

    private boolean DBT;

    public ProblemaDeSalud(Integrante persona,Integer orden, Integer IDE, boolean HTA, boolean DBT) {
        this.orden = persona.orden;
        this.IDE = persona.getFamilia().IDE;
        this.HTA = HTA;
        this.DBT = DBT;
    }

    public ProblemaDeSalud() {
    }

    public Integer getOrden() {
        return orden;
    }

    public void setOrden(Integer orden) {
        this.orden = orden;
    }

    public Integer getIDE() {
        return IDE;
    }

    public void setIDE(Integer IDE) {
        this.IDE = IDE;
    }

    public boolean isHTA() {
        return HTA;
    }

    public void setHTA(boolean HTA) {
        this.HTA = HTA;
    }

    public boolean isDBT() {
        return DBT;
    }

    public void setDBT(boolean DBT) {
        this.DBT = DBT;
    }
    
    
}
