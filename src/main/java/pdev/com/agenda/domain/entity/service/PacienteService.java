package pdev.com.agenda.domain.entity.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pdev.com.agenda.domain.entity.Paciente;
import pdev.com.agenda.domain.entity.repository.PacienteRepository;
import pdev.com.agenda.exception.BusinessException;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
@RequiredArgsConstructor
public class PacienteService {

    private final PacienteRepository repository;

    public Paciente salvar(Paciente paciente){

        //TODO: para validar se o cpf já não existe.
        boolean existeCpf = false;
        Optional<Paciente> optPaciente = repository.findByCpf(paciente.getCpf());

        if(optPaciente.isPresent()) {
            if(optPaciente.get().getId().equals(paciente.getId())) {
                existeCpf = true;
            }
        }

        if(existeCpf) {
            throw new BusinessException("CPF já cadastrado.");
        }

        return repository.save(paciente);
    }

    public void deletar(Long id){
        repository.deleteById(id);
    }

    public List<Paciente> listarTodos(){
        return repository.findAll();
    }

    public Optional<Paciente> listarPorId(Long id){
        return repository.findById(id);
    }
}
