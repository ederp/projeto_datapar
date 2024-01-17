package io.swagger.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import io.swagger.model.Avaliacao;

@Service
public class AvaliacaoService {

	private AvaliacaoRepository avaliacaoRepository;

	public AvaliacaoService(AvaliacaoRepository avaliacaoRepository) {
		super();
		this.avaliacaoRepository = avaliacaoRepository;
	}
	
	private Optional<Avaliacao> findByEmail(String email) {
		return Optional.ofNullable(avaliacaoRepository.findByEmail(email));
	}
	
	public Avaliacao create(Avaliacao avaliacao) {
		Optional<Avaliacao> optAvaliacao = this.findByEmail(avaliacao.getEmail());
		if(optAvaliacao.isEmpty()) {
			return avaliacaoRepository.save(avaliacao);
		}
		return null;
	}
	
	public List<Avaliacao> findAll() {
		return avaliacaoRepository.findAll();
	}
	
	private Optional<Avaliacao> getById(Integer id) {
		return avaliacaoRepository.findById(id);
	}
	
	public String deleteById(Integer id) {
		Optional<Avaliacao> optAvaliacao = this.getById(id);
		if(! optAvaliacao.isEmpty()) {
			Avaliacao avaliacao = optAvaliacao.get();
			avaliacaoRepository.delete(avaliacao);
			return "Avaliação excluída com sucesso";
		}
		return "Avaliação não encontrada";
	}
}
