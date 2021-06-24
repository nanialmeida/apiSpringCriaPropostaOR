package br.com.criaproposta.demo.criaproposta;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface PropostaRepository extends JpaRepository<Proposta, Long> {

	Optional<Proposta> findByDocumento( String documento);

	List<Proposta> findByEstadoPropostaAndCartaoIsNull(EstadoProposta elegivel);

}