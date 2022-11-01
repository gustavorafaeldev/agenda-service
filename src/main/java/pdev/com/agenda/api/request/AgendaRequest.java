package pdev.com.agenda.api.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;
import pdev.com.agenda.api.response.PacienteResponse;

import javax.validation.constraints.Future;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AgendaRequest {

    @NotBlank(message = "Descrição é obrigatório")
    private String descricao;

    @NotNull(message = "Horário é obrigatório")
    @Future(message = "Digite uma data futura")
    @DateTimeFormat(pattern = "yyyy-MM-ddTHH:mm:ss")
    private LocalDateTime horario;

    @NotNull(message = "Paciente deve ser obrigatório")
    private Long pacienteId;
}
