package observer;

import java.util.LinkedList;
import java.util.List;

public interface Subject 
{
	void attach(Observer nouveauObserver);
	void detach(Observer ancienObserver);
	public abstract class Default implements Subject
	{
		public final List<Observer> observers = new LinkedList<Observer>();
		
		public void attach(Observer nouveauObserver) {
			observers.add(nouveauObserver);
			updateSafely(nouveauObserver);
		}
		
		public void detach(Observer ancienObserver)
		{
			observers.removeIf(observer -> observer.equals(ancienObserver));
			
		}
		
		public void notifyObservers()
		{
			observers.forEach(this::updateSafely);
		}
		
		private void updateSafely(Observer observer)
		{
			try
			{
				observer.update(this);
			}
			catch(Exception exception)
			{
				exception.printStackTrace();
			}
		}
	}

	
	
	
	
	
	
	
}
