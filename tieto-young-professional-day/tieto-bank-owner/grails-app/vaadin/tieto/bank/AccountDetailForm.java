package tieto.bank;

import tieto.bank.admin.*;

import com.vaadin.annotations.*;
import com.vaadin.ui.*;

public class AccountDetailForm extends CustomComponent {

	@AutoGenerated
	private GridLayout mainLayout;
	@AutoGenerated
	private Button btnSave;
	@AutoGenerated
	private Button btnRemove;
	@AutoGenerated
	private TextField txtAccountBalance;
	@AutoGenerated
	private Label lblAccountBalance;

	/*- VaadinEditorProperties={"grid":"RegularGrid,20","showGrid":true,"snapToGrid":true,"snapToObject":true,"movingGuides":false,"snappingDistance":10} */

	

	/*- VaadinEditorProperties={"grid":"RegularGrid,20","showGrid":true,"snapToGrid":true,"snapToObject":true,"movingGuides":false,"snappingDistance":10} */

	

	/*- VaadinEditorProperties={"grid":"RegularGrid,20","showGrid":true,"snapToGrid":true,"snapToObject":true,"movingGuides":false,"snappingDistance":10} */

	

	/*- VaadinEditorProperties={"grid":"RegularGrid,20","showGrid":true,"snapToGrid":true,"snapToObject":true,"movingGuides":false,"snappingDistance":10} */

	

	/*- VaadinEditorProperties={"grid":"RegularGrid,20","showGrid":true,"snapToGrid":true,"snapToObject":true,"movingGuides":false,"snappingDistance":10} */

	

	/*- VaadinEditorProperties={"grid":"RegularGrid,20","showGrid":true,"snapToGrid":true,"snapToObject":true,"movingGuides":false,"snappingDistance":10} */

	

	/*- VaadinEditorProperties={"grid":"RegularGrid,20","showGrid":true,"snapToGrid":true,"snapToObject":true,"movingGuides":false,"snappingDistance":10} */

	

	/*- VaadinEditorProperties={"grid":"RegularGrid,20","showGrid":true,"snapToGrid":true,"snapToObject":true,"movingGuides":false,"snappingDistance":10} */

	

	/*- VaadinEditorProperties={"grid":"RegularGrid,20","showGrid":true,"snapToGrid":true,"snapToObject":true,"movingGuides":false,"snappingDistance":10} */

	

	/*- VaadinEditorProperties={"grid":"RegularGrid,20","showGrid":true,"snapToGrid":true,"snapToObject":true,"movingGuides":false,"snappingDistance":10} */

	

	/*- VaadinEditorProperties={"grid":"RegularGrid,20","showGrid":true,"snapToGrid":true,"snapToObject":true,"movingGuides":false,"snappingDistance":10} */

	

	/*- VaadinEditorProperties={"grid":"RegularGrid,20","showGrid":true,"snapToGrid":true,"snapToObject":true,"movingGuides":false,"snappingDistance":10} */

	/**
	 * The constructor should first build the main layout, set the
	 * composition root and then do any custom initialization.
	 *
	 * The constructor will not be automatically regenerated by the
	 * visual editor.
	 */
	public AccountDetailForm() {
		buildMainLayout();
		setCompositionRoot(mainLayout);

		// init components from account
	}
	
	public void setAccount(Account account) {
		txtAccountBalance.setValue(account.getBalance());
	}

	@AutoGenerated
	private GridLayout buildMainLayout() {
		// common part: create layout
		mainLayout = new GridLayout();
		mainLayout.setImmediate(false);
		mainLayout.setWidth("100%");
		mainLayout.setHeight("100%");
		mainLayout.setMargin(false);
		mainLayout.setColumns(2);
		mainLayout.setRows(2);
		
		// top-level component properties
		setWidth("100.0%");
		setHeight("100.0%");
		
		// lblAccountBalance
		lblAccountBalance = new Label();
		lblAccountBalance.setImmediate(false);
		lblAccountBalance.setWidth("-1px");
		lblAccountBalance.setHeight("-1px");
		lblAccountBalance.setValue("Account balance:");
		mainLayout.addComponent(lblAccountBalance, 0, 0);
		mainLayout.setComponentAlignment(lblAccountBalance, new Alignment(48));
		
		// txtAccountBalance
		txtAccountBalance = new TextField();
		txtAccountBalance.setImmediate(false);
		txtAccountBalance.setWidth("-1px");
		txtAccountBalance.setHeight("-1px");
		txtAccountBalance.setSecret(false);
		mainLayout.addComponent(txtAccountBalance, 1, 0);
		mainLayout.setComponentAlignment(txtAccountBalance, new Alignment(48));
		
		// btnRemove
		btnRemove = new Button();
		btnRemove.setCaption("Remove");
		btnRemove.setImmediate(false);
		btnRemove.setWidth("-1px");
		btnRemove.setHeight("-1px");
		mainLayout.addComponent(btnRemove, 0, 1);
		mainLayout.setComponentAlignment(btnRemove, new Alignment(48));
		
		// btnSave
		btnSave = new Button();
		btnSave.setCaption("Save");
		btnSave.setImmediate(false);
		btnSave.setWidth("-1px");
		btnSave.setHeight("-1px");
		mainLayout.addComponent(btnSave, 1, 1);
		mainLayout.setComponentAlignment(btnSave, new Alignment(48));
		
		return mainLayout;
	}

}
