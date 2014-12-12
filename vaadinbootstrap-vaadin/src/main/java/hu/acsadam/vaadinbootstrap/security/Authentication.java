package hu.acsadam.vaadinbootstrap.security;

import hu.acsadam.vaadinbootstrap.UIEventBus;

public class Authentication {
	private boolean authenticated;


	public Authentication() {
	}

	public void login(String username, String password) {
		authenticated = true;
		UIEventBus.register(this);
		UIEventBus.post(new LoginEvent(username));
	}


	public boolean isAuthenticated() {
		return authenticated;
	}
}
