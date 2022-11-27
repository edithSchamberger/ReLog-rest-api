package ar.edu.undef.fie.relog_rest_api.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class PosicionGeo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPosicionGeo;
    private Double latitud;
    private Double longitud;

    //contructores

    public PosicionGeo() {
    }

    public PosicionGeo(Double latitud, Double longitud) {
        this.latitud = latitud;
        this.longitud = longitud;
    }

    //Getters y Setters


    public Long getIdPosicionGeo() {
        return idPosicionGeo;
    }

    public void setIdPosicionGeo(Long id) {
        this.idPosicionGeo = id;
    }

    public Double getLatitud() {
        return latitud;
    }

    public void setLatitud(Double latitud) {
        this.latitud = latitud;
    }

    public Double getLongitud() {
        return longitud;
    }

    public void setLongitud(Double longitud) {
        this.longitud = longitud;
    }
}
