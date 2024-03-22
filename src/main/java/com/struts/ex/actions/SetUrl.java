package com.struts.ex.actions;

public class SetUrl {

	String mutualSslUrl;

	public String getMutualSslUrl() {
		return mutualSslUrl;
	}

	public void setMutualSslUrl(String mutualSslUrl) {
		this.mutualSslUrl = mutualSslUrl;
	}

	public String execute() {
		mutualSslUrl = "SHAIKH";
		return "success";
	}

}
