package Observer;

public class TopicSubscriber implements Observer
{
	private String observerName;
	private Observable topic;

	public  TopicSubscriber( String observerName )
	{
		this.setObserverName( observerName );
	}

	@Override
	public void update()
	{
		if( topic == null )
		{
			System.out.println( "No topic" );
			return;
		}

		String topicName = topic.getUpdate();
		System.out.println( this.getObserverName() + " is updated with this Topic : " + topicName );

	}

	@Override
	public void setTopic( Observable topic )
	{
		this.topic = topic;
	}

	public String getObserverName()
	{
		return observerName;
	}

	public void setObserverName( String observerName )
	{
		this.observerName = observerName;
	}
}
