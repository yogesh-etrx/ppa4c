package control;

import java.awt.EventQueue;

import javax.swing.UIManager;
import javax.swing.UIManager.*;
import javax.swing.UnsupportedLookAndFeelException;

import mainWindow.MainWindow;

public class PPA4C {

	public static void main(String[] args) {
		/*
		 * Code copied from
		 * http://docs.oracle.com/javase/tutorial/uiswing/lookandfeel
		 * /plaf.html#programmatic and
		 * http://docs.oracle.com/javase/tutorial/uiswing
		 * /lookandfeel/nimbus.html
		 * 
		 * This should be the only place to set L&F!
		 */

		try {
			for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedLookAndFeelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// If Nimbus is not available, you can set the GUI to another look and
		// feel.

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					@SuppressWarnings("unused")
					MainWindow frame = new MainWindow();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
