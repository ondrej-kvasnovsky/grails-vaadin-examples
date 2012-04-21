package tieto.bank.state;

import tieto.bank.*;

public interface State {

	void initTxtAccountBalance(AccountDetailForm form);
	void initBtnRemove(AccountDetailForm form);
	void initBtnSave(AccountDetailForm form);
}
