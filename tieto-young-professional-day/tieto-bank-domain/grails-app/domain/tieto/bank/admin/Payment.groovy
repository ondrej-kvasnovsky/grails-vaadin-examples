package tieto.bank.admin

/**
 * Payment maps transactions between two accounts.
 * 
 * @author Administrator
 */
class Payment {

	Date date
	Integer amount
	Account from
	Account to

	static constraints = {
		// amount must be higher than 0
		amount min:1
		from nullable:true
		to nullable:true
	}

	def beforeValidate() {
		date = new Date()
	}
}
