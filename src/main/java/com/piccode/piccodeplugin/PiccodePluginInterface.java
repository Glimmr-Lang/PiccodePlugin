package com.piccode.piccodeplugin;

import java.awt.Component;

/**
 *
 * @author hexaredecimal
 */
public interface PiccodePluginInterface {
	public void init();
	public PiccodePluginPanel getMainPanel();
	public void setEditor(Component editor);
}
