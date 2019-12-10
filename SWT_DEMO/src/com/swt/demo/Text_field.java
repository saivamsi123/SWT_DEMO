package com.swt.demo;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.RowData;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
public class Text_field {
	 public static void main(String[] args) {
		 
	        Display display = new Display();
	        Shell shell = new Shell(display);
	        shell.setText("SWT Text (o7planning.org)");
	 
	 
	        // Label
	        Label label = new Label(shell, SWT.NONE);
	        label.setText("Your Name: ");
	 
	     
	 
	        shell.setSize(400, 200);
	        shell.open();
	        while (!shell.isDisposed()) {
	            if (!display.readAndDispatch())
	                display.sleep();
	        }
	        display.dispose();
	    }
}
