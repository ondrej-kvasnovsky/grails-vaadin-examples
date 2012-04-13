package tieto.bank

import tieto.bank.admin.Account;
import tieto.bank.admin.User

import com.vaadin.data.Property
import com.vaadin.data.Property.ValueChangeEvent;
import com.vaadin.data.Property.ValueChangeListener

class ShowBalanceListener implements ValueChangeListener {

	OwnerApp app

	@Override
	public void valueChange(ValueChangeEvent event) {
		Property p = event.getProperty()
		User u = p?.getValue()
		if(u) {
			Integer balance = Account.findAllByOwner(u).balance.sum()
			app.lblUserBalance.setCaption(u.name + "'s: " + balance)
		}
	}
}
