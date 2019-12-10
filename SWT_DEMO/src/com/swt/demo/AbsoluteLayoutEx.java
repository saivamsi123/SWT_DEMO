package com.swt.demo;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

public class AbsoluteLayoutEx {
	
	public AbsoluteLayoutEx(Display display)
	{
		initUI(display);
	}
	private void initUI(Display display) {
		Shell shell = new Shell(display, SWT.SHELL_TRIM | SWT.CENTER);
		Button b1 = new Button(shell, SWT.PUSH);
		b1.setText("I'm button one");
		b1.setBounds(60, 20, 30, 40);
		
		
		Button b2 = new Button(shell, SWT.PUSH);
		b2.setText("I'm button two");
		b2.setSize(30, 40);
		b2.setLocation(50, 100);
		
		shell.setText("Absolute Layout");
		shell.setSize(300,400);
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
		AbsoluteLayoutEx absolute = new AbsoluteLayoutEx(display);
		//absolute.initUI(display);
		display.dispose();
	}
}
