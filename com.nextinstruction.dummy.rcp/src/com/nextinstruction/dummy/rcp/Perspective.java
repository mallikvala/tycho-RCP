package com.nextinstruction.dummy.rcp;

import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;

import com.nextinstruction.dummy.views.DummyView;

public class Perspective implements IPerspectiveFactory {

	public void createInitialLayout(IPageLayout layout) {
		layout.setEditorAreaVisible(false);
		layout.setFixed(true);
		
		final String editorRef  =layout.getEditorArea();
		layout.addView(DummyView.ID, IPageLayout.TOP, 0.0F, editorRef);
		
	}

}
