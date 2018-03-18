package org.intercomics.domain;

import org.json.JSONObject;

public class OAuth2VO {

	private String access_token;
	private String refresh_token;
	private String token_type;
	private int expires_in;

	public OAuth2VO(String oAuthTokn) {
		super();
		JSONObject json = new JSONObject(oAuthTokn);
		this.access_token = json.getString("access_token");
		this.refresh_token = json.getString("access_token");
		this.token_type = json.getString("access_token");
		this.expires_in = json.getInt("expires_in");
	}

	public String getAccess_token() {
		return access_token;
	}

	public void setAccess_token(String access_token) {
		this.access_token = access_token;
	}

	public String getRefresh_token() {
		return refresh_token;
	}

	public void setRefresh_token(String refresh_token) {
		this.refresh_token = refresh_token;
	}

	public String getToken_type() {
		return token_type;
	}

	public void setToken_type(String token_type) {
		this.token_type = token_type;
	}

	public int getExpires_in() {
		return expires_in;
	}

	public void setExpires_in(int expires_in) {
		this.expires_in = expires_in;
	}

	@Override
	public String toString() {
		return "OAuth2VO [access_token=" + access_token + ", refresh_token=" + refresh_token + ", token_type="
				+ token_type + ", expires_in=" + expires_in + "]";
	}

}
