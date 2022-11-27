package ar.edu.undef.fie.relog_rest_api.domain;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
//@Table(name = "estado_abastecimiento")
public class EstadoAbastecimiento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEstAb;
    private Efecto efecto;
    private List<Movimiento> movimientos;
    private Estado estado;

    // contructores

    public EstadoAbastecimiento() {
    }

    public EstadoAbastecimiento(Efecto efecto) {
        this.efecto = efecto;
        this.movimientos = new ArrayList<Movimiento>();
        this.estado = estado;
    }

    //Getters y Setters
    public Long getIdEstAb() {
        return idEstAb;
    }

    public void setIdEstAb(Long idEstAb) {
        this.idEstAb = idEstAb;
    }

    public Efecto getEfecto() {
        return efecto;
    }

    public void setEfecto(Efecto efecto) {
        this.efecto = efecto;
    }

    public List<Movimiento> getMovimientos() {
        return movimientos;
    }

    public void setMovimientos(List<Movimiento> movimientos) {
        this.movimientos = movimientos;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }







    /*@ManyToOne
    @JoinColumn(name = "organizacion_id_organizacion")
    private Organizacion organizacion;

    public Organizacion getOrganizacion() {
        return organizacion;
    }

    public void setOrganizacion(Organizacion organizacion) {
        this.organizacion = organizacion;
    }*/
}