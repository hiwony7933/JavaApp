package java_study_0117;

import java.util.Comparator;

public class StringComp implements Comparator<String> {

	@Override
	public int compare(String arg0, String arg1) {
		return arg0.compareTo(arg1);
	}
}
