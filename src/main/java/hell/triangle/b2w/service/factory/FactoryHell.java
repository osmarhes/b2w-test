package hell.triangle.b2w.service.factory;

import hell.triangle.b2w.service.util.HellTriangle;
import hell.triangle.b2w.service.util.HellTriangleCalculate;

public class FactoryHell {
	public static HellTriangle geTriangle() {
		return new HellTriangleCalculate();
	}
}
