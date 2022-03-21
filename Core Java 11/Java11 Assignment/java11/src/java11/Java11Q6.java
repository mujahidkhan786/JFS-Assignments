package java11;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
public class Java11Q6 {

	public static void main(String[] args) {
		
		String Uri = "https://httpbin.org/get";
		
		HttpRequest req = HttpRequest.newBuilder()
				.uri(URI.create(Uri))
				.GET()
				.build();

		
		HttpClient client = HttpClient.newBuilder()
				.build();
		
		try {
		HttpResponse<String> resp =client.send(req,BodyHandlers.ofString());
		System.out.println(resp.headers());
		System.out.println(resp.statusCode());
		System.out.println(resp.body());
		}catch (IOException|InterruptedException e) {
			e.printStackTrace();
		}
 	}

}
