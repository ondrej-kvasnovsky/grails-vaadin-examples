package helloworld

class UserService {

	static transactional = true
	
    void update(User user) {
		// TODO: ... implement the logic ... 
		user.save(flush:true, failOnError:true)
    }
}
