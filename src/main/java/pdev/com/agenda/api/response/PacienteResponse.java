package pdev.com.agenda.api.response;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PacienteResponse {

    private Long id;
    private String nome;
    private String sobrenome;
    private String email;
    private String cpf;
}
