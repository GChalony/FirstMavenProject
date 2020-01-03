package com.gchalony;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class MessageTest {

	@Test
	public void testInstantiate() {
		Message msg = new Message();
		
		assertEquals(msg.content, "Maven is great!");
	}
}
