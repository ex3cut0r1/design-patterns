package Observer;

import java.util.ArrayList;
import java.util.List;

public class Topic implements Observable {
	
	private List<Observer> observersList = new ArrayList<Observer>();
	private String topicName;

	public void setTopicName( String topicName )
	{
		this.topicName = topicName;
		this.notifyObservers();
	}

	@Override
	public void subscribe( Observer observer)
	{
		this.observersList.add( observer );
		observer.setTopic( this );
	}

	@Override
	public void unsubscribe( Observer observer )
	{
		this.observersList.remove( observer );
	}

	@Override
	public void notifyObservers()
	{
		for ( Observer observer : this.observersList )
		{
			observer.update();
		}
	}

	@Override
	public String getUpdate()
	{
		return this.topicName;
	}
}
