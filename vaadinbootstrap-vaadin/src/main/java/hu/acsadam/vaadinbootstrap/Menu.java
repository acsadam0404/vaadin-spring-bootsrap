package hu.acsadam.vaadinbootstrap;

import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.TextField;


public class Menu extends CustomComponent {
	public Menu() {
		setCompositionRoot(new TextField("menu"));
	}
}
