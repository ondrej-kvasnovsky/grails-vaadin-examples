import grails.util.Environment;
import helloworld.User

class BootStrap {

	def init = { servletContext ->
		if(Environment.getCurrent().equals(Environment.DEVELOPMENT)) {
			User u1 = new User(name : "Gandalf Gray")
			u1.save(flush:true, failOnError:true)
			User u2 = new User(name : "Saruman White")
			u2.save(flush:true, failOnError:true)
		}
	}
	def destroy = {
	}
}
