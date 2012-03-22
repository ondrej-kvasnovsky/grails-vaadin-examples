package vaadin7;

import com.vaadin.terminal.WrappedRequest;
import com.vaadin.ui.Panel
import com.vaadin.ui.Root;
import com.vaadin.ui.TabSheet

/**
 * Root with few components to test integration between Grails and Vaadin7.
 * 
 * @author ondrejkvasnovsky
 */
class MyRoot extends Root {

    @Override
    protected void init(WrappedRequest request) {
        TabSheet tabSheet = new TabSheet()
        Panel pnl1 = new Panel("Tab 1")
        Panel pnl2 = new Panel("Tab 2")
        tabSheet.addTab(pnl1)
        tabSheet.addTab(pnl2)
        setContent(tabSheet)
    }
}