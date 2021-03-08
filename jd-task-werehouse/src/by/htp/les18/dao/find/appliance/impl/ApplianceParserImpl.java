package by.htp.les18.dao.find.appliance.impl;


import by.htp.les18.dao.find.appliance.ApplianceParser;

public class ApplianceParserImpl implements ApplianceParser{
	private static final String SPLIT_1 = "\\s+:\\s+";
	private static final String SPLIT_2  = ",\\s+";
	private static final String SPLIT_3 = "=";

	@Override
	public String parserByName(String dataAppliance) {
	     return dataAppliance.split(SPLIT_1)[0];
		
	}

	@Override
	public String[] parserParameters(String dataAppliance) {
		String data;
		String[] parameters;
		
		data = dataAppliance.split(SPLIT_1)[1];
		parameters = new String[data.split(SPLIT_2).length];
		for (int i = 0; i < parameters.length; i++) {
			parameters[i] = data.split(SPLIT_2)[i].split(SPLIT_3)[1];
		}
		return parameters;
	}

}
