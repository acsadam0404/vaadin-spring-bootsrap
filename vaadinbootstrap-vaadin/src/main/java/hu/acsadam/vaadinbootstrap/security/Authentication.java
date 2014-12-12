package hu.acsadam.vaadinbootstrap.security;

import com.vaadin.server.VaadinSession;

import hu.acsadam.vaadinbootstrap.UIEventBus;
import hu.acsadam.vaadinbootstrap.user.User;


public class Authentication {
	public Authentication() {}


	public void login(String username, String password) {
		User user = User.get(username);
		if (user != null) {
			if (password.equals(user.getPassword())) {
				VaadinSession.getCurrent().setAttribute("username", username);
				UIEventBus.post(new LoginEvent(username));
			}
			else {
				System.out.println("wrong password");
			}
		}
		else {
			System.out.println("no such user");
		}
	}


	public boolean isAuthenticated() {
		return getUsernameFromSession() != null;
	}


	private static String getUsernameFromSession() {
		return (String) VaadinSession.getCurrent().getAttribute("username");
	}


	public static User getUser() {
		return User.get(getUsernameFromSession());
	}
}
