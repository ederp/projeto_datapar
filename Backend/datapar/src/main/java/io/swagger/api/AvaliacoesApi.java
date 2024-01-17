/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.52).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.Avaliacao;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.bind.annotation.CookieValue;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-01-17T03:00:28.791899576Z[GMT]")
@Validated
public interface AvaliacoesApi {

    @Operation(summary = "Lista todas as avaliações cadastradas", description = "", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Lista de avaliações", content = @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = Avaliacao.class)))) })
    @RequestMapping(value = "/avaliacoes/lista",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<Avaliacao>> avaliacoesListaGet();


    @Operation(summary = "Registrar avaliação", description = "", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "201", description = "Cadastro realizado com sucesso"),
        
        @ApiResponse(responseCode = "400", description = "Erros no formulário, verifique os detalhes na resposta") })
    @RequestMapping(value = "/avaliacoes",
        consumes = { "application/json" }, 
        method = RequestMethod.POST)
    ResponseEntity<Void> avaliacoesPost(@Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody Avaliacao body
);

}
