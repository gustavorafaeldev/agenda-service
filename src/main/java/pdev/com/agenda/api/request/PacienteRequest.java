package pdev.com.agenda.api.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PacienteRequest {

    private String nome;
    private String sobrenome;
    private String email;
    private String cpf;
}
