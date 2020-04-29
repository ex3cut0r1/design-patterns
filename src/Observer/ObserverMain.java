package Observer;

public class ObserverMain
{
	public static void main( String[] args )
	{
		Topic topic = new Topic();

		Observer observer1 = new TopicSubscriber( "Subscriber 1" );
		Observer observer2 = new TopicSubscriber( "Subscriber 2" );
		Observer observer3 = new TopicSubscriber( "Subscriber 3" );

		topic.subscribe( observer1 );
		topic.subscribe( observer2 );
		topic.subscribe( observer3 );

		topic.setTopicName( "New Topic" );
		topic.setTopicName( "Another Topic" );
		topic.setTopicName( "Other Topic" );
	}
}
