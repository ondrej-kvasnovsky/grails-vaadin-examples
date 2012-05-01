package tieto.bank

import tieto.bank.admin.Account;
import tieto.bank.admin.User

import com.vaadin.data.Property
import com.vaadin.data.Property.ValueChangeEvent;
import com.vaadin.data.Property.ValueChangeListener
import com.vaadin.ui.*

class ShowBalanceListener implements ValueChangeListener {

	OwnerApp app

	@Override
	public void valueChange(ValueChangeEvent event) {
		Property p = event.getProperty()
		User u = p?.getValue()
		if(u) {
			List accounts = Account.findAllByOwner(u)
			if(accounts) {
				Table table = app.tableAccounts
				table.removeAllItems()
				table.addContainerProperty("Id", Long.class, null)
				table.addContainerProperty("Balance", Integer.class, null)
				table.addContainerProperty("Type", String.class, null)
				for(Account a : accounts) {
					Object [] values = new Object[3]
					values[0] = a.id
					values[1] = a.balance
					values[2] = a.type
					table.addItem(values, a)
				}
			}
		}
	}
}