package by.htp.les18.dao.find.appliance.impl;

import java.io.BufferedReader;
import java.io.Closeable;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import by.htp.les18.dao.find.appliance.ApplianceFilter;
import by.htp.les18.dao.find.appliance.ApplianceReader;

public class ApplianceSourceReaderImpl implements ApplianceReader, Closeable {
	private BufferedReader sourceReader = null;
	private ApplianceFilter applianceFilter = null;

	public ApplianceSourceReaderImpl(String path, ApplianceFilter applianceFilter) throws FileNotFoundException {
		sourceReader = new BufferedReader(new FileReader(path));
		this.applianceFilter = applianceFilter;
	}

	@Override
	public List<String> readerByFilter() throws IOException {
		List<String> result = new ArrayList<String>();
		String data;
		while(sourceReader.ready()) {
			data = sourceReader.readLine();
			if(applianceFilter.filter(data)==true) {
				result.add(data);
			}
		}
		return result;
		
	}

	@Override
	public void close() throws IOException {
		sourceReader.close();

	}

}
