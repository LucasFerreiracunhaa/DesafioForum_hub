package desafioforum_hub.forum_hub.topico;

import jakarta.validation.constraints.NotNull;

public record DadosAtualizacaoTopico(
        @NotNull
        String titulo,
        @NotNull
        String mensagem) {
}
