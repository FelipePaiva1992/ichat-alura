package br.com.caelum.ichat.app;

import android.app.Application;
import android.text.style.TtsSpan;

import br.com.caelum.ichat.component.ChatComponent;
import br.com.caelum.ichat.component.DaggerChatComponent;

/**
 * Created by felipepaiva on 10/02/17.
 */

public class ChatApplication extends Application{

    private ChatComponent component;

    @Override
    public void onCreate() {
        component = DaggerChatComponent.builder().build();
    }

    public ChatComponent getComponent(){
        return component;
    }
}
