package tieto.bank.admin

class UserController {

	def login() {
		String name = params.login
		User user = User.findByName(name)

		if(user) {
			session.user = user
			redirect(controller: 'payment', view:'index')
		}
		else {
			flash.message = "login failed"
			redirect(uri:"/")
		}
	}
	def logout() {
		session.user = user
		redirect(controller: 'payment', view:'index')
	}
}
