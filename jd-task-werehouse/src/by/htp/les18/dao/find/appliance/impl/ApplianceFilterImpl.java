package by.htp.les18.dao.find.appliance.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import by.htp.les18.dao.find.appliance.ApplianceFilter;

public class ApplianceFilterImpl implements ApplianceFilter {
	private List<String> filtredData;
	private List<Pattern> patterns = new ArrayList<Pattern>();

	public ApplianceFilterImpl(List<String> filterData) {
		this.filtredData = filterData;

		for (String string : filtredData) {
			this.patterns.add(Pattern.compile(string));
		}
	}

	@Override
	public boolean filter(String applianceData) {
		Matcher m;
		for (Pattern pattern : patterns) {
			m = pattern.matcher(applianceData);
			if (!m.find()) {
				return false;
			}
		}
		return true;

	}
}
