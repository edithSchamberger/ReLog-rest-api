package ar.edu.undef.fie.relog_rest_api.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;
import java.util.List;

@Entity
public class Requerimiento {
    // strategy Identity, genera una secuencia
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDateTime fechaDeEntregaRequerida;
    private Organizacion organizacion;

    private List<Solicitud> solicitudes;



}
