package tieto.bank.payments

class SecurityFilters {

	def filters = {
		all(controller:'*', action:'*') {
			before = {
				if(!session.user && !actionName.equals('login')) {
					redirect(uri: '/')
					return false
				}
			}
			after = { Map model ->
			}
			afterView = { Exception e ->
			}
		}
	}
}
