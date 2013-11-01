package com.unittestcloud;

import org.apache.wicket.util.tester.WicketTester;
import org.junit.Before;
import org.junit.Test;

/**
 * Simple test using the WicketTester
 */
public class EventTest
{
	private WicketTester tester;

	@Before
	public void setUp()
	{
		tester = new WicketTester(new EventApplication());
	}

	@Test
	public void contentRendersSuccessfully()
	{
		//start and render the test page
		tester.startPage(Event.class);

		//assert rendered page class
		tester.assertRenderedPage(Event.class);
	}
}
