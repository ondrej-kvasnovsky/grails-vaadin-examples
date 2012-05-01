package tieto.bank.admin

class PaymentController {

	def index() {
		List payments = Payment.list()
		return [payments:payments]
	}

	def remove() {
		Long pid = params.id as Long
		Payment p = Payment.get(pid)
		p?.delete()

		List payments = Payment.list()

		redirect(view:'index')
	}
}
