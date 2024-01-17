package io.swagger.api;

import io.swagger.model.Avaliacao;
import io.swagger.service.AvaliacaoService;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-01-17T03:00:28.791899576Z[GMT]")
@RestController
public class AvaliacoesApiController implements AvaliacoesApi {

    private static final Logger log = LoggerFactory.getLogger(AvaliacoesApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;
    
    private final AvaliacaoService avaliacaoService;

    @org.springframework.beans.factory.annotation.Autowired
    public AvaliacoesApiController(ObjectMapper objectMapper, HttpServletRequest request, AvaliacaoService avaliacaoService) {
        this.objectMapper = objectMapper;
        this.request = request;
        this.avaliacaoService = avaliacaoService;
    }

    public ResponseEntity<List<Avaliacao>> avaliacoesListaGet() {
    	List<Avaliacao> avaliacoes = avaliacaoService.findAll();

        if (avaliacoes.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(avaliacoes, HttpStatus.OK);
        }
    }


    public ResponseEntity<Avaliacao> avaliacoesPost(@Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody Avaliacao body
) {
    	Optional<Avaliacao> criaAvaliacao = Optional.ofNullable(avaliacaoService.create(body));
    	if (!criaAvaliacao.isEmpty()) {
    		return ResponseEntity.status(HttpStatus.CREATED).body(criaAvaliacao.get());
    	}
    	return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
    }

	@Override
	public ResponseEntity<?> avaliacoesIdDelete(Integer id) {
		// TODO Auto-generated method stub
		String mensagem = avaliacaoService.deleteById(id);
		if (mensagem.equalsIgnoreCase("Avaliação excluída com sucesso")) {
			return ResponseEntity.status(HttpStatus.OK).body(mensagem);
		}
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(mensagem);
	}

}
