package desafioforum_hub.forum_hub.topico;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DadosCadastroTopico(@NotBlank
                                 String titulo,
                                  @NotBlank
                                  String curso,
                                  String mensagem) {
}
