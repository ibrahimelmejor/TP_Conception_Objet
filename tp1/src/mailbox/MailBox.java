package mailbox;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import observer.Subject;


public class MailBox extends Subject.Default
{

	List<Mail> mails = new ArrayList<Mail>();
	private MailBox(){
		
	}
	private static MailBox instance = null;
	
	
	public boolean isEmpty()
	{
		return mails.isEmpty();
	}
	
	public int receive(Mail mail)
	{
		this.mails.add(mail);
		notifyObservers();
		return mails.size()-1;
	}
	
	public Mail read(int position)
	{
		return this.mails.get(position);
	}
	
	public Optional<Mail> readlast()
	{
		if(isEmpty())
		{
			return Optional.empty();
		}
		return Optional.of(read(getNbreMail()-1));
	}
	
	public static MailBox getInstance() {
		if (instance==null)
			instance = new MailBox();
		return instance;
	}
	
	
	
	public void addMail(Mail m ){
		
		this.mails.add(m);
		}


	public Mail getLastMail() {
		return this.mails.get(mails.size()-1);
	}


	public Integer getNbreMail() {
		return mails.size();
	}
	
}
