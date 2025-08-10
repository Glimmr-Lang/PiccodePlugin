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
	public void setThemeMode(boolean dark);

	public String getPluginName();
	public String getDescription();
}
