package api;

import java.net.URI;

import com.wrapper.spotify.SpotifyApi;

public class MainApi {

	public static void main(String[] args) {
		
		String clientID = "18c0056f5e374a8798e8ff5c6b566e11";
		String clientSecret = "32aa922fdaa14948ab42432d78e26a2b";
		URI redirectUri = null;
		SpotifyApi client = new SpotifyApi.Builder().setClientId(clientID).setClientSecret(clientSecret).setRedirectUri(redirectUri).build();
		
		System.out.println(client.getUsersTopArtists());
	}

}
