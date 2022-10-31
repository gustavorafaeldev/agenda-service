package pdev.com.agenda.domain.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
public class Agenda {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String descricao;
    private LocalDateTime horario;
    private LocalDateTime dataCriacao;

    @ManyToOne
    private Paciente paciente;

}
