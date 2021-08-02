package com.citrus.application.events;

public class Event<T> {
	public final T id;
	public Event (T id)
	{
		this.id = id;
	}

}
