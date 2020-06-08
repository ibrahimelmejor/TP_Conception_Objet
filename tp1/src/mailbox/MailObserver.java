package mailbox;

import javax.swing.JLabel;

import observer.Observer;
import observer.Subject;

public class MailObserver extends JLabel implements Observer {

	public MailObserver(){
		setText("");
	}

	
	String text = new String("");
	@Override
	public void update(Subject subject) {
		MailBox mailBox = (MailBox) subject;
		int nbMessage = mailBox.getNbreMail();
		text += mailBox.getLastMail().subject + "<br>";
		this.setText("<html><body>" + nbMessage + "<br>" + text + "</body></html>");

	}

}