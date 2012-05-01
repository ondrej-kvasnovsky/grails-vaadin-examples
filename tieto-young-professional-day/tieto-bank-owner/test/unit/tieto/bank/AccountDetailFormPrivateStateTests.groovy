package tieto.bank

import static org.junit.Assert.*

import grails.test.mixin.*
import grails.test.mixin.support.*
import org.junit.*

import tieto.bank.admin.*

/**
 * See the API for {@link grails.test.mixin.support.GrailsUnitTestMixin} for usage instructions
 */
@TestMixin(GrailsUnitTestMixin)
@Mock([User, Account])
class AccountDetailFormPrivateStateTests {

	AccountDetailForm form

	void setUp() {
		form = new AccountDetailForm()
		Account account = new Account()
		account.balance = 1000
		account.type = AccountType.Private
		User user = new User()
		user.name = "Name"
		user.save(failOnError:true)
		account.owner = user
		account.save(failOnError:true)
		form.setAccount(account)
	}

	void testTxtAccountBalance_IsEnabled() {
		boolean enabled = form.txtAccountBalance.isEnabled()
		assertEquals(true, enabled)
    }
	
	void testTxtAccountBalance_GetValue() {
		Object value = form.txtAccountBalance.getValue()
		assertEquals(1000, value)
	}
}
