package helloworld

import com.vaadin.Application
import com.vaadin.ui.Label
import com.vaadin.ui.Window

class HelloWorldApplication extends Application {

	@Override
	public void init() {
		Window w = new Window("Hello world!")
		
		w.addComponent(new Label(i18n("app.title")))
		
		List<User> users = User.list()
		for(User u : users) {
			
			u.name = "Joshua"
			
			getBean(UserService).update(u)
			
			w.addComponent(new Label(u.getName()))
		}
		setMainWindow(w)
	}
}
