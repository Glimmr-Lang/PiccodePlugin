package com.piccode.piccodeplugin;

import java.awt.Component;
import javax.swing.JPanel;

/**
 *
 * @author hexaredecimal
 */
public class PiccodePluginPanel extends JPanel implements PiccodePluginInterface {
	protected PiccodePluginPanel instance;
	protected Component editor;
	public PiccodePluginPanel() {
		super();
		editor = null;
	}

	@Override
	public void init() {
		instance = new PiccodePluginPanel();
	}

	@Override
	public PiccodePluginPanel getMainPanel() {
		return instance;
	}

	@Override
	public void setEditor(Component editor) {
		this.editor = editor;
	}

	@Override
	public void setThemeMode(boolean dark) {
	}
}
