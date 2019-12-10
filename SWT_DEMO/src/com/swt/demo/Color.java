package com.swt.demo;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

public class Color {
	
	public Color(Display display)
	{
		initUI(display);
	}
	
	private void initUI(Display display) {
		
		Shell shell = new Shell(); 
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
