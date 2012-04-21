package bank

import tieto.bank.admin.*

import com.vaadin.*
import com.vaadin.ui.*

class PaymentApp extends Application {

	void init() {
		Window w = new Window("Payment application")

		Label lblTitle = new Label("Payment history:")
		w.addComponent(lblTitle)

		Table table = new Table()
		table.addContainerProperty("Id", Long.class, null)
		table.addContainerProperty("Date", Date.class, null)
		table.addContainerProperty("Transfered Amount", Integer.class, null)
		table.addContainerProperty("From", String.class, null)
		table.addContainerProperty("To", String.class, null)

		List payments = Payment.list()
		for(Payment p : payments) {
			Object [] values = new Object[5]
			values[0] = p.id
			values[1] = p.date
			values[2] = p.amount
			values[3] = p.from.getOwner().name
			values[4] = p.to.owner.name
			table.addItem(values, p)
		}

		w.addComponent(table)

		setMainWindow(w)
	}
}
