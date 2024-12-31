
import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConseguirValorMoneda {
    public ValorMonedas buscarMoneda(String monedaBase, String modedaTarget){
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/00f0b123debfdd33be3770b9/pair/" + monedaBase + "/" + modedaTarget);

        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();

        try{
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), ValorMonedas.class);
        }catch (Exception e){
            throw new RuntimeException("No se encontro la Moneda");
        }
    }
}
