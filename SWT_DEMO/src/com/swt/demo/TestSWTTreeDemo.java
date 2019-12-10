package com.swt.demo;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.TreeEvent;
import org.eclipse.swt.events.TreeListener;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.widgets.TreeItem;

public class TestSWTTreeDemo {
	
	private static int shellWidth = 1000;
	private static int shellHeight = 700;
	
	private static void addWidgetsToShell(Display display, Shell shell)
	{
		Tree tree = new Tree(shell, SWT.MULTI | SWT.BORDER );
		
		tree.setSize(150, 150);
		tree.setLocation(5, 5);
		
		TreeItem child1 = new TreeItem(tree, SWT.NONE);
		child1.setText("Child1");
		
		TreeItem child2 = new TreeItem(tree, SWT.NONE);
		child2.setText("Child2");
		
		TreeItem child3 = new TreeItem(tree, SWT.NONE);
		child3.setText("Child3");
		
		TreeItem child4 = new TreeItem(tree, SWT.NONE, 1);
		child4.setText("Child4");
		
		TreeItem child4_1 = new TreeItem(child4, SWT.NONE);
		child4_1.setText("Child4_1");
		
		TreeItem child4_2 = new TreeItem(child4, SWT.NONE);
		child4_2.setText("Child4_2");
		
		tree.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e)
			{
				TreeItem[] selectedItems = tree.getSelection();
				System.out.println("Selected Items: ");
				for(int i = 0; i< selectedItems.length;i++)
				{
					System.out.print(selectedItems[i].getText() +", ");
				}
				System.out.println();
			}
		});
		
		tree.addTreeListener(new TreeListener() {
			
			@Override
			public void treeCollapsed(TreeEvent e)
			{
				System.out.println("Tree collapsed.");
			}

			@Override
			public void treeExpanded(TreeEvent e)
			{
				System.out.println("TreeExpanded");
			}
		});
	}
	
	public static void main(String[] args)
	{
		Display display = new Display();
		
		Shell shell = new Shell(display);
		shell.setSize(shellWidth, shellHeight);
		shell.setText("SWT Tutorial");
		
		addWidgetsToShell(display, shell);
		shell.open();
		
		while(!shell.isDisposed())
		{
			if(!display.readAndDispatch())
			{
				display.sleep();
			}
		}
		display.dispose();
	}
}
