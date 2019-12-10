package com.swt.demo;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

public class ButtonsEx1 {
	public ButtonsEx1(Display display)
	{
		initUI(display);
	}

	private void initUI(Display display) {
		Shell shell = new Shell(display, SWT.SHELL_TRIM | SWT.CENTER);
		
		FormLayout formLayout = new FormLayout();
		shell.setLayout(formLayout);
		
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
		
		Text text2 = new Text(shell, SWT.BORDER | SWT.H_SCROLL | SWT.V_SCROLL);
		text2.setText("Bordered scrolled text box");
		text2.setBounds(80, 80, 100, 100);
		
		FormData okData = new FormData(80, 30);
		okData.right = new FormAttachment(20);
		okData.bottom = new FormAttachment(95);
		okBtn.setLayoutData(okData);
		
		FormData cancData = new FormData(80, 30);
		cancData.right = new FormAttachment(okBtn, 100, SWT.RIGHT);
		cancData.bottom = new FormAttachment(okBtn, 0, SWT.BOTTOM);
		cancBtn.setLayoutData(cancData);
		
		shell.setText("Buttons");
		shell.setSize(350,200);
		shell.open();
		
		while(!shell.isDisposed())
		{
			if(!display.readAndDispatch())
			{
				display.sleep();
			}
		}
		
	}
	public static void main(String[] args)
	{
		Display display = new Display();
		ButtonsEx1 btnEx = new ButtonsEx1(display);
		display.dispose();
	}
}
