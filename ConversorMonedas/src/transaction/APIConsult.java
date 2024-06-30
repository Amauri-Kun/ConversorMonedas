package transaction;
import com.google.gson.Gson;
import model.CoinImmutable;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class APIConsult {
    public CoinImmutable searchCoin (String originCoin, String finalCoin ) {
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/6ae928f648b43262cc798ff2/pair/"+ originCoin + "/"+ finalCoin);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(direccion).build();
        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), CoinImmutable.class);
        } catch (Exception e) {
            throw new RuntimeException("No se eocntró la moneda");
        }
    }
}
