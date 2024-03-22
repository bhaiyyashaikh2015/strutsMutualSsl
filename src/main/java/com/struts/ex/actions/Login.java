package com.struts.ex.actions;


public class Login {
	private String name, password;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String execute() {
//		int a = 10 / 0;
		if (password.equals("admin")) {
			SetUrl setUrl = new SetUrl();
			setUrl.setMutualSslUrl("SHAIKH");
			return "success";
		} else {
			return "error";
		}
	}

}
