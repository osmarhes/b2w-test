package hell.triangle.b2w.service.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import hell.triangle.b2w.model.Element;

public class HellTriangleCalculate implements HellTriangle{

	@Override
	public Integer findMaximumTotal(final int[][] input) {
		final Element[][] elements = new Element[input.length][];
		for (int i = 0; i < input.length; i++) {
			elements[i] = new Element[input[i].length];
			for (int j = 0; j < i + 1; j++) {
				if (j == 0 || j == (i)) {
					elements[i][j] = new Element(input[i][j], 1);
				} else {
					elements[i][j] = new Element(input[i][j],
							elements[i - 1][j].getSums().length + elements[i - 1][j - 1].getSums().length);
				}
			}
			if (i != 0) {
				for (int j = 0; j < elements[i].length - 1; j++) {
					for (int k = 0; k < elements[i - 1][j].getSums().length; k++) {
						elements[i][j].add(elements[i - 1][j].getSums()[k]);
						elements[i][j + 1].add(elements[i - 1][j].getSums()[k]);
					}
				}
			} else {
				elements[i][0].add(0);
			}
		}
		final List<Integer> result = new ArrayList<>();
		for (Element element : elements[elements.length - 1]) {
			result.addAll(Arrays.asList(element.getSums()));
		}
		Collections.sort(result, Collections.reverseOrder());
		return result.get(0);
	}
}
