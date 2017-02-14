package br.com.caelum.ichat.event;

import br.com.caelum.ichat.modelo.Mensagem;

/**
 * Created by felipepaiva on 14/02/17.
 */
public class MensagemEvent {

    public Mensagem mensagem;

    public MensagemEvent(Mensagem mensagem) {
        this.mensagem = mensagem;
    }
}
