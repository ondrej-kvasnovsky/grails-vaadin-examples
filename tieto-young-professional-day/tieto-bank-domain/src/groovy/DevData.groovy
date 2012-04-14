import tieto.bank.admin.*;

/**
 * 
 */

/**
 * @author ondrejkvasnovsky
 *
 */
class DevData {



	void insert() {
		def saveParams = [failOnError:true, flush:true]

		User user1 = new User(name:"Kristyna Wasylkiwova");
		user1.save(saveParams)
		User user2 = new User(name:"Petra Karasova");
		user2.save(saveParams)

		Account a1 = new Account(balance:200, owner:user1, type:AccountType.Private)
		a1.save(saveParams)
		Account a2 = new Account(balance:2000, owner:user1, type:AccountType.Corporate)
		a2.save(saveParams)

		Payment p1 = new Payment()
		p1.amount = 1000
		p1.from = a2
		p1.to = a1
		p1.save(saveParams)

		Account a3 = new Account(balance:-500, owner:user2, type:AccountType.Private)
		a3.save(saveParams)
		Account a4 = new Account(balance:-10000, owner:user2, type:AccountType.Corporate)
		a4.save(saveParams)
		Account a5 = new Account(balance:900, owner:user2, type:AccountType.Private)
		a5.save(saveParams)
	}
}
