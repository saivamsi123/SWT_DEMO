package com.swt.demo;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.RowData;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

public class RowLayoutEx {

	public RowLayoutEx(Display display)
	{
		initUI(display);
	}

	private void initUI(Display display) {
		Shell shell = new Shell(display, SWT.SHELL_TRIM | SWT.CENTER);
		
		RowLayout rowLayout = new RowLayout(SWT.HORIZONTAL);
		rowLayout.marginTop = 10;
		rowLayout.marginBottom = 10;
		rowLayout.marginLeft = 5;
		rowLayout.marginRight = 5;
		rowLayout.spacing =10;
		shell.setLayout(rowLayout);
		
		Button btn1 = new Button(shell, SWT.PUSH);
		btn1.setText("Button");
		btn1.setLayoutData(new RowData(80,30));
		
		Button btn2 = new Button(shell, SWT.PUSH);
		btn2.setText("Button");
		btn2.setLayoutData(new RowData(80,30));
		
		Button btn3 = new Button(shell, SWT.PUSH);
		btn3.setText("Button");
		btn3.setLayoutData(new RowData(80,30));
		
		shell.setText("RowLayout");
		shell.pack();
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
		RowLayoutEx rowLayout = new RowLayoutEx(display);
		rowLayout.initUI(display);
		display.dispose();
	}
}
