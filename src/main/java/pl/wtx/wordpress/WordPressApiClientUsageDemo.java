package pl.wtx.wordpress;

import java.util.List;

import pl.wtx.wordpress.api.client.PostsApi;
import pl.wtx.wordpress.api.client.invoker.ApiException;
import pl.wtx.wordpress.api.client.model.Post;

/**
 * WordPress API Client — minimal usage demo (list posts).
 *
 * @author WTX Labs
 * @see <a href="https://github.com/wtx-labs/wordpress-api-client-java">wordpress-api-client-java</a>
 */
public class WordPressApiClientUsageDemo {

    // TODO: Set your WordPress REST API base path.
    private static final String API_BASE_PATH = "https://your-wordpress-site.com/wp-json/wp/v2";
    private static final String API_USERNAME = "TODO_SET_USERNAME";
    private static final String API_PASSWORD = "TODO_SET_APPLICATION_PASSWORD";

    public static void main(String[] args) {

        System.out.println(">>> Start running the WordPressApiClientUsageDemo...");

        // Use WordPressApiClient(true) if you need to log API communication messages.
        WordPressApiClient apiClient = new WordPressApiClient();

        apiClient.setBasePath(API_BASE_PATH);
        apiClient.setUsername(API_USERNAME);
        apiClient.setPassword(API_PASSWORD);

        PostsApi postsApi = new PostsApi(apiClient);

        try {

            List<Post> posts = postsApi.postsGet(
                    null, null, null, null, null, null, null, null, null, null,
                    null, null, null, null, null, null, null, null, null, null,
                    null, null, null, null, null, null, null);

            posts.forEach(p -> System.out.println("Post id=" + p.getId() + " slug=" + p.getSlug()));

        } catch (ApiException e) {
            System.err.println("Error occurred during API call: " + e);
        }

        System.out.println("<<< The WordPressApiClientUsageDemo has been finished.");

    }

}
