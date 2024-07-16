package desafioforum_hub.forum_hub.topico;

import java.time.LocalDateTime;

public record DadosListagemTopico(Long id, String titulo, String mensagem, LocalDateTime dataCriacao) {
public DadosListagemTopico(Topico topico){
    this(topico.getId(), topico.getTitulo(), topico.getMensagem(), topico.getDataCriacao());
}
}

