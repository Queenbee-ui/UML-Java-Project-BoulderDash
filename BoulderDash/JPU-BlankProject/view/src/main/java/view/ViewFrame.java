<<<<<<< HEAD
package view;

import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import contract.IController;
import contract.IModel;

/**
 * The ViewFrame class.
 *
 * @author Eliphaz
 * @version 1.0
 */
//
class ViewFrame extends JFrame implements KeyListener {

	/** The model. */
	private IModel model;
	/** The controller. */
	private IController controller;
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -697358409737458175L;
	
	/**
	 * Instantiates a new view frame.
	 *
	 * @param model the model
	 * @throws HeadlessException the headless exception
	 */
	public ViewFrame(final IModel model) throws HeadlessException {
		this.buildViewFrame(model);
	}

	/**
	 * Instantiates a new view frame.
	 *
	 * @param model the model
	 * @param gc    the gc
	 */
	public ViewFrame(final IModel model, final GraphicsConfiguration gc) {
		super(gc);
		this.buildViewFrame(model);
	}

	/**
	 * Instantiates a new view frame.
	 *
	 * @param model the model
	 * @param title the title
	 * @throws HeadlessException the headless exception
	 */
	public ViewFrame(final IModel model, final String title) throws HeadlessException {
		super(title);
		this.buildViewFrame(model);
	}

	/**
	 * Instantiates a new view frame.
	 *
	 * @param model the model
	 * @param title the title
	 * @param gc    the gc
	 */
	public ViewFrame(final IModel model, final String title, final GraphicsConfiguration gc) {
		super(title, gc);
		this.buildViewFrame(model);
	}

	/**
	 * Gets the controller.
	 *
	 * @return the controller
	 */
	private IController getController() {
		return this.controller;
	}

	/**
	 * Sets the controller.
	 *
	 * @param controller the new controller
	 */
	protected void setController(final IController controller) {
		this.controller = controller;
	}

	/**
	 * Gets the model.
	 *
	 * @return the model
	 */
	protected IModel getModel() {
		return this.model;
	}

	/**
	 * Sets the model.
	 *
	 * @param model the new model
	 */
	private void setModel(final IModel model) {
		this.model = model;
	}

	/**
	 * Builds the view frame.
	 *
	 * @param model the model
	 */
	private void buildViewFrame(final IModel model) {
		this.setModel(model);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(true);
		this.addKeyListener(this);
		ViewPanel vp = new ViewPanel(this);
		this.setTitle("Boulder Dash - Group 6    *****************************************************************************      MENU      ****************************************************************************");
		this.setContentPane(vp);
		//this.setSize(1830, 780);
		this.setSize(1480, 780);
		this.setLocationRelativeTo(null);
	}

	/**
	 * Prints the message.
	 *
	 * @param message the message
	 */
	public void printMessage(final String message) {
		JOptionPane.showMessageDialog(null, message);
	}
 
	/*
	 * (non-Javadoc)
	 *
	 * @see java.awt.event.KeyListener#keyTyped(java.awt.event.KeyEvent)
	 */
	public void keyTyped(final KeyEvent e) {

	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.awt.event.KeyListener#keyPressed(java.awt.event.KeyEvent)
	 */
	public void keyPressed(final KeyEvent e) {
		
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.awt.event.KeyListener#keyReleased(java.awt.event.KeyEvent)
	 */
	public void keyReleased(final KeyEvent e) {
		this.getController().orderPerform(View.keyCodeToControllerOrder(e.getKeyCode())); 
	}
}
=======
package view;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.border.Border;

import contract.IController;
import contract.IModel;
import main.java.entity.Entity;

/**
 * The Class ViewFrame.
 *
 * @author Eliphaz
 */
class ViewFrame extends JFrame implements KeyListener {

	Entity entity;
	/** The model. */
	private IModel model;

	/** The controller. */
	private IController controller;
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -697358409737458175L;

	/**
	 * Instantiates a new view frame.
	 *
	 * @param model the model
	 * 
	 */
	public ViewFrame(final IModel model) {
		this.buildViewFrame(model);
	}

	/**
	 * Gets the controller.
	 *
	 * @return the controller
	 */
	private IController getController() {
		return this.controller;
	}

	/**
	 * Sets the controller.
	 *
	 * @param controller the new controller
	 */
	protected void setController(final IController controller) {
		this.controller = controller;
	}

	/**
	 * Gets the model.
	 *
	 * @return the model
	 */
	protected IModel getModel() {
		return this.model;
	}

	/**
	 * Sets the model.
	 *
	 * @param model the new model
	 */
	private void setModel(final IModel model) {
		this.model = model;
	}

	/**
	 * Builds the view frame.
	 *
	 * @param model the model
	 */
	private void buildViewFrame(final IModel model) {
		this.setModel(model);
		//this.setBorder(BorderFactory.createLineBorder(Color.black));
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(true);
		this.addKeyListener(this);
		this.setContentPane(new ViewPanel(this));
		this.setSize(41 * 32 + this.getInsets().left + this.getInsets().right,
				24 * 32 + this.getInsets().top + this.getInsets().bottom);
		this.setLocationRelativeTo(null);
	}

	/*private void setBorder(Border createLineBorder) {
		// TODO Auto-generated method stub
		
	}*/

	/**
	 * Prints the message.
	 *
	 * @param message the message
	 */
	public void printMessage(final String message) {
		JOptionPane.showMessageDialog(null, message);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.awt.event.KeyListener#keyTyped(java.awt.event.KeyEvent)
	 */
	public void keyTyped(final KeyEvent e) {
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.awt.event.KeyListener#keyPressed(java.awt.event.KeyEvent)
	 */
	public void keyPressed(final KeyEvent e) {

	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.awt.event.KeyListener#keyReleased(java.awt.event.KeyEvent)
	 */
	public void keyReleased(final KeyEvent e) {
		switch (e.getKeyCode()) {
		case KeyEvent.VK_UP:
			this.getController().movement(e.getKeyCode());
			break;
		case KeyEvent.VK_DOWN:
			this.getController().movement(e.getKeyCode());
			break;
		case KeyEvent.VK_RIGHT:
			this.getController().movement(e.getKeyCode());
			break;
		case KeyEvent.VK_LEFT:
			this.getController().movement(e.getKeyCode());
			break;
		case KeyEvent.VK_1:
			this.getController().orderPerform(View.keyCodeToControllerOrder(e.getKeyCode()));
			break;
		case KeyEvent.VK_2:
			this.getController().orderPerform(View.keyCodeToControllerOrder(e.getKeyCode()));
			break;
		case KeyEvent.VK_3:
			this.getController().orderPerform(View.keyCodeToControllerOrder(e.getKeyCode()));
			break;
		case KeyEvent.VK_4:
			this.getController().orderPerform(View.keyCodeToControllerOrder(e.getKeyCode()));
			break;
		case KeyEvent.VK_6:
			this.getController().orderPerform(View.keyCodeToControllerOrder(e.getKeyCode()));
			break;
		case KeyEvent.VK_5:
			this.getController().orderPerform(View.keyCodeToControllerOrder(e.getKeyCode()));
			break;
		default:
			break;
		}
	}
}
>>>>>>> branch 'master' of https://github.com/Queenbee-ui/UML-Java-Project-BoulderDash
