package api;

import java.net.URI;

import com.wrapper.spotify.SpotifyApi;

public class MainApi {

	public static void main(String[] args) {
		
		String clientID = "YOUR_CLIENT_ID_HERE";
		String clientSecret = "YOUR_CLIENT_SECRET_HERE";
		URI redirectUri = null;
		SpotifyApi client = new SpotifyApi.Builder().setClientId(clientID).setClientSecret(clientSecret).setRedirectUri(redirectUri).build();
		
		System.out.println(client.getUsersTopArtists());
	}

}
