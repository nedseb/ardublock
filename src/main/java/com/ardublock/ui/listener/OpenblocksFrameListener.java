package com.ardublock.ui.listener;

public interface OpenblocksFrameListener {
	public void didNew();
	public void didSave();
	public void didSaveAs();
	public void didImport();
	public void didLoad();	
	public void didGenerate(String source);
}
