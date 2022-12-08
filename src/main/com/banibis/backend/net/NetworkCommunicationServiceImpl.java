package main.com.banibis.backend.net;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class NetworkCommunicationServiceImpl implements NetworkCommunicationService {
    @Override
    public String getResponseBodyByURL(String url) {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();
        CompletableFuture<HttpResponse<String>> response = client.sendAsync(request, HttpResponse.BodyHandlers.ofString());
        try {
            return response.thenApply(HttpResponse::body).get(40, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println(e);
        } catch (ExecutionException e) {
            e.printStackTrace();
            System.out.println(e);
        } catch (TimeoutException e) {
            e.printStackTrace();
            System.out.println(e);
        }
        return "";
    }

}
