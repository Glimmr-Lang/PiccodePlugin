package com.piccode.piccodeplugin;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.FlowLayout;
import java.awt.Font;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author hexaredecimal
 */
public class PiccodePluginPanel extends JPanel implements PiccodePluginInterface {

	protected PiccodePluginPanel instance;
	protected Component editor;
	private JPanel headerPanel;
	private List<JLabel> labels = new ArrayList<JLabel>();

	public static Color PLUGIN_TITLE_BG = Color.WHITE;
	public static Color PLUGIN_TITLE_FG = Color.BLACK;

	public PiccodePluginPanel() {
		super();
		editor = null;
	}

	@Override
	public void init() {
		instance = new PiccodePluginPanel();

		headerPanel = new JPanel();
		headerPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		// headerPanel.setLayout(new BoxLayout(headerPanel, BoxLayout.X_AXIS)); // Use BoxLayout for horizontal arrangement
		headerPanel.setBackground(PLUGIN_TITLE_BG);
		var cmds = new String[]{};
		for (String command : cmds) {

			if (command.equals("_")) {
				JLabel sep_lbl = new JLabel("| ");
				labels.add(sep_lbl);
				sep_lbl.setForeground(PLUGIN_TITLE_FG);
				headerPanel.add(sep_lbl);
				continue;
			}

			JLabel commandLabel = new JLabel(command + "  ");
			labels.add(commandLabel);
			var fnt = commandLabel.getFont();
			fnt = new Font(fnt.getFontName(), fnt.getStyle(), 9);
			commandLabel.setFont(fnt);
			commandLabel.setForeground(PLUGIN_TITLE_FG);
			commandLabel.setCursor(new Cursor(Cursor.HAND_CURSOR));
			headerPanel.add(commandLabel);
		}

		instance.add(headerPanel, BorderLayout.NORTH);
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
		if (dark) {
			PLUGIN_TITLE_BG = Color.WHITE;
			PLUGIN_TITLE_FG = Color.BLACK;
		} else {
			PLUGIN_TITLE_BG = Color.WHITE;
			PLUGIN_TITLE_FG = Color.BLACK;
		}

		headerPanel.setBackground(PLUGIN_TITLE_BG);
		for (var label: labels) {
			label.setForeground(PLUGIN_TITLE_FG);
		}
	}
}
