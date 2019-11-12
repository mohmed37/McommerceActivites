package com.clientui.beans;

public class ExpeditionBean {

    private int id;

    private Integer idCommande;

    private Integer etat;

    public ExpeditionBean() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Integer getIdCommande() {
        return idCommande;
    }

    public void setIdCommande(Integer idCommande) {
        this.idCommande = idCommande;
    }

    public Integer getEtat() {
        return etat;
    }

    public void setEtat(Integer etat) {
        this.etat = etat;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("ExpeditionBean{");
        sb.append("id=").append(id);
        sb.append(", idCommande=").append(idCommande);
        sb.append(", etat=").append(etat);
        sb.append('}');
        return sb.toString();
    }
}
