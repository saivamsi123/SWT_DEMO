package com.swt.demo;

import java.awt.TextField;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.layout.RowData;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

public class Login {
	
	public Login(Display display)
	{
		initUI(display);
	}

	private void initUI(Display display) {
        Shell shell = new Shell(display, SWT.SHELL_TRIM | SWT.CENTER);
		shell.setSize(250, 250);
		shell.setText("A Text Field Example");
        Label label = new Label(shell, SWT.NONE);
        label.setText("Your Name: ");
        final Text text1 = new Text(shell, SWT.SINGLE | SWT.BORDER);
        text1.setBounds(100, 50, 100, 20);
        final Text text2 = new Text(shell, SWT.SINGLE | SWT.BORDER);
        text2.setBounds(100, 75, 100, 20);
		
		Button okBtn = new Button(shell,SWT.PUSH);
		okBtn.setText("OK");
		okBtn.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e)
			{
				System.out.println("Submit button was clicked");
			}
		});
		
		
		
		Button cancBtn = new Button(shell, SWT.PUSH);
		cancBtn.setText("Cancel");
		
		cancBtn.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e)
			{
				System.out.println("Cancel button was clicked");
			}
		});
		
		FormData okData = new FormData(80, 30);
		okData.right = new FormAttachment(20);
		okData.bottom = new FormAttachment(95);
		okBtn.setLayoutData(okData);
		
		FormData cancData = new FormData(80, 30);
		cancData.right = new FormAttachment(okBtn, 100, SWT.RIGHT);
		cancData.bottom = new FormAttachment(okBtn, 0, SWT.BOTTOM);
		cancBtn.setLayoutData(cancData);
		
		shell.open();
		
		while(!shell.isDisposed())
		{
			if(!display.readAndDispatch())
			{
				display.sleep();
			}
		}
	}
	
	public static void main(String args[])
	{
		Display display = new Display();
		Login login = new Login(display);
		display.dispose();
	}
}
