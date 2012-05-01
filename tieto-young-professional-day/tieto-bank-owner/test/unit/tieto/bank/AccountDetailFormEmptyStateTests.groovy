package tieto.bank

import static org.junit.Assert.*

import grails.test.mixin.*
import grails.test.mixin.support.*
import org.junit.*
import tieto.bank.admin.Account

/**
 * See the API for {@link grails.test.mixin.support.GrailsUnitTestMixin} for usage instructions
 */
@TestMixin(GrailsUnitTestMixin)

class AccountDetailFormEmptyStateTests {

	AccountDetailForm form
	
    void setUp() {
		form = new AccountDetailForm()
    }

    void testTxtAccountBalance_IsEnabled() {
		boolean enabled = form.txtAccountBalance.isEnabled()
		assertEquals(false, enabled)
    }
	
	void testTxtAccountBalance_GetValue() {
		Object value = form.txtAccountBalance.getValue()
		assertEquals(0, value)
	}
}
