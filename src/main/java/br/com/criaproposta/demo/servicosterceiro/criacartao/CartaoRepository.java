package br.com.criaproposta.demo.servicosterceiro.criacartao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartaoRepository extends JpaRepository<Cartao, Long> {

	Cartao findByPropostaId(Long idProposta);

}
