import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import static java.net.http.HttpClient.newHttpClient;

public class GetMoneda {
    public Moneda cambiarMoneda(String ticker1, String ticker2, double valor) {

        URI direction = URI.create("https://v6.exchangerate-api.com/v6/57266330de3766fb113507a6/pair/" + ticker1 + "/" + ticker2 + "/" + valor);

        HttpClient client = newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direction)
                .build();
        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Moneda.class);
        } catch (Exception e) {
            throw new RuntimeException("No se pudo obtener el tipo de cambio.");
        }

    }
}
