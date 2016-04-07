package hell.triangle.b2w;

import org.junit.Assert;
import org.junit.Test;

import hell.triangle.b2w.service.HellTriangleService;

public class HellTriangleTest {
	
	@Test
	public void testLevel1Result6() {
		final HellTriangleService calc = getHell();
		Assert.assertSame(6, calc.findMaximumTotal(new int[][] {{6}}));

	}
	
	@Test
	public void testLevel2Result11() {
		final HellTriangleService calc = getHell();
		Assert.assertSame(11, calc.findMaximumTotal(new int[][] {{6}, { 3, 5 }}));

	}
	
	@Test
	public void testLevel3Result18() {
		final HellTriangleService calc = getHell();
		Assert.assertSame(18, calc.findMaximumTotal(new int[][] { { 6 }, { 3, 5 }, { 9, 7, 1 } }));

	}

	@Test
	public void testLevel4Result26() {
		final HellTriangleService calc = getHell();
		Assert.assertSame(26, calc.findMaximumTotal(new int[][] { { 6 }, { 3, 5 }, { 9, 7, 1 }, { 4, 6, 8, 4 } }));
	}

	@Test
	public void testLevel5Result52() {
		final HellTriangleService calc = getHell();
		Assert.assertSame(52, calc.findMaximumTotal(new int[][] { { 6 }, { 3, 5 }, { 9, 7, 1 }, { 4, 6, 8, 4 }, { 30, 6, 8, 10, 5 } }));
	}
	
	@Test
	public void testLevel6Result65() {
		final HellTriangleService calc = getHell();
		Assert.assertSame(65, calc.findMaximumTotal(new int[][] { { 6 }, { 3, 5 }, { 9, 7, 1 }, { 4, 6, 8, 4 }, { 4, 6, 8, 4, 5 }, { 10, 16, 2, 24, 35, 12 } }));
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testIlegalArgument() {
		final HellTriangleService calc = getHell();
		calc.findMaximumTotal(new int[][] { { 6 }, { 3, 5, 3 }, { 9, 7, 1 }, { 4, 6, 8, 4 }, { 4, 6, 8, 4, 5 }, { 10, 16, 2, 24, 35, 12 } });
	}

	private HellTriangleService getHell() {
		return new HellTriangleService();
	}
}
