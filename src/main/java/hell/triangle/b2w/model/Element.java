package hell.triangle.b2w.model;

import lombok.Data;

@Data
public class Element {
	private final Integer value;
	private final Integer[] sums; 
	
	public Element(final Integer value, final Integer size) {
		this.value =  value;
		this.sums = new Integer[size];
	}
	
	public void add(Integer n) {
		for (int i = 0; i < sums.length; i++) {
			if(sums[i] == null) {
				sums[i] =  n + value;
				break;
			}
		}
	}
}
