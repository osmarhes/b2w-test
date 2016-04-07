package hell.triangle.b2w.service;

import hell.triangle.b2w.service.factory.FactoryHell;
import hell.triangle.b2w.service.util.HellTriangle;

public class HellTriangleService {

	final HellTriangle hellTriangle;

	public HellTriangleService() {
		this.hellTriangle = FactoryHell.geTriangle();
	}

	public Integer findMaximumTotal(final int[][] input) {
		for (int i = 0; i < input.length; i++) {
			if (!((i + 1) == input[i].length)) {
				throw new IllegalArgumentException(
						"The triangle from above would be: example = [[6],[3,5],[9,7,1],[4,6,8,4]]");
			}

		}
		return hellTriangle.findMaximumTotal(input);
	}

}
