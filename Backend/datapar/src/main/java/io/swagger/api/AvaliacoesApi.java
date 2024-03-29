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
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;

import javax.validation.Valid;
import java.util.List;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-01-17T03:00:28.791899576Z[GMT]")
@Validated
public interface AvaliacoesApi {

    @Operation(summary = "Lista todas as avaliações cadastradas", description = "", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Lista de avaliações", content = @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = Avaliacao.class)))) })
    @GetMapping(value = "/avaliacoes/lista",
        produces = { "application/json" })
    ResponseEntity<List<Avaliacao>> avaliacoesListaGet();


    @Operation(summary = "Registrar avaliação", description = "", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "201"),
        
        @ApiResponse(responseCode = "400") })
    @PostMapping(value = "/avaliacoes",
        consumes = { "application/json" })
    ResponseEntity<Avaliacao> avaliacoesPost(@Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody Avaliacao body
);
    
    @Operation(summary = "Exclui uma avaliação por ID", description = "", security = {
            @SecurityRequirement(name = "jwt")    }, tags={  })
        @ApiResponses(value = { 
            @ApiResponse(responseCode = "204", description = "Avaliação excluída com sucesso"),
            @ApiResponse(responseCode = "404", description = "Avaliação não encontrada") })
        @DeleteMapping(value = "/avaliacoes/{id}")
    ResponseEntity<?> avaliacoesIdDelete(@Parameter(in = ParameterIn.PATH, description = "ID do produto", required=true, schema=@Schema()) @PathVariable("id") Integer id
    		);

}

