  
package mailbox;

import javax.swing.JLabel;

import observer.Observer;
import observer.Subject;

public class CounterObserver extends JLabel implements Observer {

	public CounterObserver(){
		setText("" + 0);
	}

	@Override
	public void update(Subject s) {
		MailBox mailBox = (MailBox) s;
		int nbMail = mailBox.getNbreMail();
		this.setText("" + nbMail);
	}

}