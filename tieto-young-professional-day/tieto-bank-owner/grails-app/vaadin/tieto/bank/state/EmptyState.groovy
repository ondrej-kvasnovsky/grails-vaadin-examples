package tieto.bank.state

import tieto.bank.*;

class EmptyState extends AbstractState {

	@Override
	public void initTxtAccountBalance(AccountDetailForm form) {
		super.initTxtAccountBalance(form)
		form.txtAccountBalance.setValue(0)
	}
}
