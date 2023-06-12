package C18_RelacionClases;

import java.util.List;

public class Auto {
    private long id;
    private String marca;
    private String modelo;

    //Auto y propietario tienen relacion de 1 a 1
    //private Propietario propietario;

    //Relación N a N
    private List<Propietario> propietarioList;
    public Auto() {
    }

    public Auto(long id, String marca, String modelo, List<Propietario> propietarioList) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.propietarioList = propietarioList;
    }

    public List<Propietario> getPropietarioList() {
        return propietarioList;
    }

    public void setPropietarioList(List<Propietario> propietarioList) {
        this.propietarioList = propietarioList;
    }

    public Auto(long id, String marca, String modelo) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Propietario{" +
                "id=" + id +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }}
