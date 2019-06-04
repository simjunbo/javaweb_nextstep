package chapter11;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DateMessageProviderTest {

	@Test
	public void 오전() throws Exception {
		Hour hour = new Hour(11);
		assertEquals("오전", hour.getMessage());
	}

	@Test
	public void 오후() throws Exception {
		Hour hour = new Hour(16);
		assertEquals("오후", hour.getMessage());
	}

}
