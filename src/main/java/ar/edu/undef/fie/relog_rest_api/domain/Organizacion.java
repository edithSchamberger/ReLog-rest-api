package ar.edu.undef.fie.relog_rest_api.domain;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Organizacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idOrganizacion;
    private String nombre;

    @OneToOne
    private PosicionGeo posicionGeografica;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "organizacion")
    private List<EstadoAbastecimiento> estadosAbastecimientos = new ArrayList<>();


    //contructores

    public Organizacion() {
    }

    public Organizacion(String nombre, PosicionGeo posicionGeografica) {
        this.nombre = nombre;
        this.posicionGeografica = posicionGeografica;
        this.estadosAbastecimientos =new ArrayList<EstadoAbastecimiento>();
    }

    //Getters y Setters


    public Long getIdOrganizacion() {
        return idOrganizacion;
    }

    public void setIdOrganizacion(Long id) {
        this.idOrganizacion = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public PosicionGeo getPosicionGeografica() {
        return posicionGeografica;
    }

    public void setPosicionGeografica(PosicionGeo posicionGeografica) {
        this.posicionGeografica = posicionGeografica;
    }

    public List<EstadoAbastecimiento> getEstadosAbastecimientos() {
        return estadosAbastecimientos;
    }

    public void setEstadosAbastecimientos(List<EstadoAbastecimiento> estadosAbastecimientos) {
        this.estadosAbastecimientos = estadosAbastecimientos;
    }
}
