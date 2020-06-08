package ui;

import javax.swing.JLabel;

import mailbox.Mail;
import mailbox.MailBox;
import observer.Observer;
import observer.Subject;

public class MailLabel extends JLabel implements Observer
{
	private static final long serialVersionUID = 7719285668442435147L;
	public MailLabel()
	{
		super("<html><i>No mail</i></html>");
	}
	@Override
	public void update(Subject subject) {
		if( ! (subject instanceof MailBox))
		{
			throw new ClassCastException("Updated with unexpected value (got: "+ subject+" expected instance of MailBox");
		}
		((MailBox)subject).readlast().ifPresent(this::showContent);
	}
	private void showContent(Mail mail)
	{
		setText("<html>Subject : "+mail.getSubject()+" <br/>Body: " + mail.getBody() + " </html>");
	}

}
