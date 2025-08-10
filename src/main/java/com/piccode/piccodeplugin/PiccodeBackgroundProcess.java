package com.piccode.piccodeplugin;

import java.awt.Component;
import javax.swing.JPanel;

/**
 *
 * @author hexaredecimal
 */
public class PiccodeBackgroundProcess extends JPanel implements PiccodePluginInterface {
	protected Component editor;
	public PiccodeBackgroundProcess() {
		super();
		editor = null;
	}

	@Override
	public void init() {
	}


	@Override
	public void setEditor(Component editor) {
		this.editor = editor;
	}

	@Override
	public PiccodePluginPanel getMainPanel() {
		return null;
	}

	@Override
	public void setThemeMode(boolean dark) {
	}
}
