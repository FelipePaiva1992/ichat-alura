package br.com.caelum.ichat.module;

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

    @Provides
    public ChatService getChatService(){
        Retrofit retrofit = new Retrofit.Builder()
                // Altere para o seu IP
                .baseUrl("http://192.168.0.103:8080/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        return retrofit.create(ChatService.class);
    }
}
