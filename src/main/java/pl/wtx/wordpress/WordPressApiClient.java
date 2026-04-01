package pl.wtx.wordpress;

import pl.wtx.wordpress.api.client.config.GsonConfig;
import pl.wtx.wordpress.api.client.config.OkHttpClientConfig;
import pl.wtx.wordpress.api.client.invoker.ApiClient;
import pl.wtx.wordpress.api.client.invoker.JSON;

/**
 * WordPress REST API client.
 *
 * @author WTX Labs
 * @see <a href="https://github.com/wtx-labs/wordpress-api-client-java">wordpress-api-client-java</a>
 */
public class WordPressApiClient extends ApiClient {

    public WordPressApiClient() {
        JSON.setGson(GsonConfig.createGson());
        setUserAgent("WordPressApiClient (by wtx-labs)");
    }

    public WordPressApiClient(boolean enableLoggingApiMessages) {
        JSON.setGson(GsonConfig.createGson());
        setUserAgent("WordPressApiClient (by wtx-labs)");
        if (enableLoggingApiMessages) {
            setHttpClient(OkHttpClientConfig.configureClient(getHttpClient()));
        }
    }

}
