package helloworld

import com.vaadin.Application
import com.vaadin.ui.Label
import com.vaadin.ui.Window

class HelloWorldApplication extends Application {

	@Override
	public void init() {
		Window w = new Window("Hello world!")
		List<User> users = User.list()
		for(User u : users) {
			w.addComponent(new Label(u.getName()))
		}
		setMainWindow(w)
	}
}
