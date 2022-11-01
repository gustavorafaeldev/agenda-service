package pdev.com.agenda.api.request;

import lombok.*;

import javax.validation.constraints.NotBlank;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PacienteRequest {

    @NotBlank(message = "Nome do paciente é obrigatório")
    private String nome;

    @NotBlank(message = "Sobrenomee do paciente é obrigatório")
    private String sobrenome;

    private String email;

    @NotBlank(message = "CPF do paciente é obrigatório")
    private String cpf;
}
