package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Avaliacao
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-01-17T03:00:28.791899576Z[GMT]")


@Entity
@Table(name = "avaliacao")
public class Avaliacao {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "email", nullable = false)
	@JsonProperty("email")
	private String email;

	@Column(name = "pontuacao", nullable = false)
	@JsonProperty("pontuacao")
	private Integer pontuacao;

	@JsonProperty("observacoes")
	private String observacoes;

	@Column(name = "numero_celular")
	@JsonProperty("numero_celular")
	private String numeroCelular;

	@Column(name = "horario_contato")
	@JsonProperty("horario_contato")
	private String horarioContato;

	public Avaliacao email(String email) {
		this.email = email;
		return this;
	}
	
	public Avaliacao(Integer id, String email, Integer pontuacao, String observacoes, String numeroCelular,
			String horarioContato) {
		super();
		this.id = id;
		this.email = email;
		this.pontuacao = pontuacao;
		this.observacoes = observacoes;
		this.numeroCelular = numeroCelular;
		this.horarioContato = horarioContato;
	}
	
	public Integer getId() {
		return id;
	}

	/**
	 * Get email
	 * @return email
	 **/
	@Schema(description = "")

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Avaliacao pontuacao(Integer pontuacao) {
		this.pontuacao = pontuacao;
		return this;
	}

	/**
	 * Get pontuacao
	 * minimum: 1
	 * maximum: 5
	 * @return pontuacao
	 **/
	@Schema(description = "")

	@Min(1) @Max(5)   public Integer getPontuacao() {
		return pontuacao;
	}

	public void setPontuacao(Integer pontuacao) {
		this.pontuacao = pontuacao;
	}

	public Avaliacao observacoes(String observacoes) {
		this.observacoes = observacoes;
		return this;
	}

	/**
	 * Get observacoes
	 * @return observacoes
	 **/
	@Schema(description = "")

	public String getObservacoes() {
		return observacoes;
	}

	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}

	public Avaliacao numeroCelular(String numeroCelular) {
		this.numeroCelular = numeroCelular;
		return this;
	}

	/**
	 * Get numeroCelular
	 * @return numeroCelular
	 **/
	@Schema(description = "")

	public String getNumeroCelular() {
		return numeroCelular;
	}

	public void setNumeroCelular(String numeroCelular) {
		this.numeroCelular = numeroCelular;
	}

	public Avaliacao horarioContato(String horarioContato) {
		this.horarioContato = horarioContato;
		return this;
	}

	/**
	 * Get horarioContato
	 * @return horarioContato
	 **/
	@Schema(description = "")

	public String getHorarioContato() {
		return horarioContato;
	}

	public void setHorarioContato(String horarioContato) {
		this.horarioContato = horarioContato;
	}


	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Avaliacao avaliacao = (Avaliacao) o;
		return Objects.equals(this.email, avaliacao.email) &&
				Objects.equals(this.pontuacao, avaliacao.pontuacao) &&
				Objects.equals(this.observacoes, avaliacao.observacoes) &&
				Objects.equals(this.numeroCelular, avaliacao.numeroCelular) &&
				Objects.equals(this.horarioContato, avaliacao.horarioContato);
	}

	@Override
	public int hashCode() {
		return Objects.hash(email, pontuacao, observacoes, numeroCelular, horarioContato);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Avaliacao {\n");

		sb.append("    email: ").append(toIndentedString(email)).append("\n");
		sb.append("    pontuacao: ").append(toIndentedString(pontuacao)).append("\n");
		sb.append("    observacoes: ").append(toIndentedString(observacoes)).append("\n");
		sb.append("    numeroCelular: ").append(toIndentedString(numeroCelular)).append("\n");
		sb.append("    horarioContato: ").append(toIndentedString(horarioContato)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	/**
	 * Convert the given object to string with each line indented by 4 spaces
	 * (except the first line).
	 */
	private String toIndentedString(java.lang.Object o) {
		if (o == null) {
			return "null";
		}
		return o.toString().replace("\n", "\n    ");
	}
}
