package tieto.bank.state

import tieto.bank.*

class StateHolder {

	private AccountDetailForm form
	private State state
	
	public StateHolder(AccountDetailForm form, State state) {
		super();
		this.form = form;
		this.state = state;
		applyState();
	}

	public void setState(State state) {
		this.state = state
		applyState()
	}
	
	private void applyState() {
		state.initTxtAccountBalance(form)
		state.initBtnRemove(form)
		state.initBtnSave(form)
	}
}
