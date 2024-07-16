package desafioforum_hub.forum_hub.validacao;

import desafioforum_hub.forum_hub.topico.TopicoRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class ValidadorNaoHaDuplicidade {
    private final TopicoRepository topicoRepository;

    @Autowired
    public ValidadorNaoHaDuplicidade(TopicoRepository topicoRepository) {
        this.topicoRepository = topicoRepository;
    }

    public void validarDuplicidade(String titulo, String mensagem) {
        if (topicoRepository.existsByTituloAndMensagem(titulo, mensagem)) {
            throw new ValidacaoException("Já existe um tópico com o mesmo título e mensagem.");
        }
    }

}
