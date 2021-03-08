package by.htp.les18.dao.find.appliance;

import java.io.IOException;
import java.util.List;


public interface ApplianceReader {
	 List<String> readerByFilter() throws IOException;

}
