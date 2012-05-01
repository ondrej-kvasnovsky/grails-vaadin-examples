package tieto.bank.state

import tieto.bank.*;

class CorporateState extends LoadedState {

	@Override
	public void initBtnRemove(AccountDetailForm form) {
		form.btnRemove.setEnabled(true)
	}

	@Override
	public void initBtnSave(AccountDetailForm form) {
		form.btnSave.setEnabled(true)
	}

}
