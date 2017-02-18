package br.com.caelum.ichat.module;

import android.app.Application;
import android.content.Context;
import android.view.inputmethod.InputMethodManager;

import com.squareup.picasso.Picasso;

import org.greenrobot.eventbus.EventBus;

import br.com.caelum.ichat.service.ChatService;
import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by felipepaiva on 10/02/17.
 */

@Module
public class ChatModule {

    private  Application app;

    public ChatModule(Application app) {
        this.app = app;
    }

    @Provides
    public ChatService getChatService(){
        Retrofit retrofit = new Retrofit.Builder()
                // Altere para o seu IP
                .baseUrl("https://ichat-alura-felipe.herokuapp.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        return retrofit.create(ChatService.class);
    }

    @Provides
    public Picasso getPicasso(){
        Picasso picasso = new Picasso.Builder(app).build();
        return  picasso;
    }

    @Provides
    public EventBus getEventBus(){
        return  EventBus.builder().build();
    }

    @Provides
    public InputMethodManager getInputMethodManager(){
        InputMethodManager inputMethodManager = (InputMethodManager) app.getSystemService(Context.INPUT_METHOD_SERVICE);
        return inputMethodManager;
    }
}
