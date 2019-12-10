package com.swt.demo;

import java.awt.GridLayout;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;

public class HelloWorldSWT {
	public static void main(String[] args)
	{
		Display display = new Display();
		final Shell shell = new Shell(display);
		shell.setLayout(new FillLayout());
		
		//Label label = new Label(shell, SWT.CENTER);
//		label.setText("Hello World");
//		label.setBounds(shell.getClientArea());
		Composite parent = new Composite(shell, SWT.HOME);
		
//		GridLayout gridLayout = new GridLayout();
		FillLayout fillLayout = new FillLayout();
		fillLayout.type=SWT.VERTICAL;
		parent.setLayout(fillLayout);
		
		Button button = new Button(shell, SWT.PUSH );
		button.setText("I'm a push button");
		
		Button button1 = new Button(shell, SWT.HOME );
		button1.setText("I'm a push button");
		
		shell.pack();
		shell.setMinimumSize(10,20);
		button.setSize(10, 20);
		shell.open();
//		label.setBackgroundImage(new Image(display,"C:\\Users\\Allianz3075\\Desktop\\swt jars\\download.jpg"));
//		label.getBackgroundImage();
		while(!shell.isDisposed())
		{
			if(!display.readAndDispatch())
			{ 
				display.sleep();
			}
		}
		display.dispose();
		shell.dispose();
	}
	
}
