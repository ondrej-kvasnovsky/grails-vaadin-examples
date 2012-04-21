package tieto.bank.state

import tieto.bank.*;

class LoadedState extends AbstractState {

	@Override
	public void initTxtAccountBalance(AccountDetailForm form) {
		form.txtAccountBalance.setEnabled(true)
		form.txtAccountBalance.setValue(form.account.getBalance())
	}
}
