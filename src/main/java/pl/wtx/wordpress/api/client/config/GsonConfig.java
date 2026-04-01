package pl.wtx.wordpress.api.client.config;

import java.time.OffsetDateTime;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.Strictness;

public class GsonConfig {

    public static Gson createGson() {

        return new GsonBuilder()
                .setStrictness(Strictness.LENIENT)
                .registerTypeAdapter(OffsetDateTime.class, new OffsetDateTimeAdapter())
                .create();

    }

}
