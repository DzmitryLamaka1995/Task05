package by.htp.les18.dao.impl;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import by.htp.les18.bean.Appliance;
import by.htp.les18.bean.appliance.Laptop;
import by.htp.les18.bean.appliance.Oven;
import by.htp.les18.bean.appliance.Refrigerator;
import by.htp.les18.bean.appliance.Speakers;
import by.htp.les18.bean.appliance.TabletPC;
import by.htp.les18.bean.appliance.VacuumCleaner;
import by.htp.les18.dao.DAOException;
import by.htp.les18.dao.FindApplianceDAO;


public class FileFindApplianceDAO implements FindApplianceDAO {
	private static final File file = new File("resources/appliances.db");
	private BufferedReader br;

	@Override
	public List<Appliance> findByCategory(String name) throws DAOException {
		String line;
		String res;
		String[] mas;
		List<Appliance> result = new ArrayList<Appliance>();
		try {
			br = new BufferedReader(new FileReader(file));
			while (br.ready()) {
				line = br.readLine();
				res = line.split("\\s+:\\s+")[0];

				if (name.equalsIgnoreCase(res) && name.equalsIgnoreCase("Oven")) {
					line = line.split("\\s+:\\s+")[1];
					mas = new String[line.split(",\\s+").length];

					for (int i = 0; i < mas.length; i++) {
						res = line.split(",\\s+")[i];
						mas[i] = res.split("=")[1];
					}

					result.add(new Oven(mas[0], Integer.parseInt(mas[1]), Double.parseDouble(mas[2]),
							Integer.parseInt(mas[3]), Double.parseDouble(mas[4]), Double.parseDouble(mas[5]),
							Double.parseDouble(mas[6])));
				}
				if (name.equalsIgnoreCase(res) && name.equalsIgnoreCase("Laptop")) {
					line = line.split("\\s+:\\s+")[1];
					mas = new String[line.split(",\\s+").length];

					for (int i = 0; i < mas.length; i++) {
						res = line.split(",\\s+")[i];
						mas[i] = res.split("=")[1];
					}

					result.add(new Laptop(mas[0], Double.parseDouble(mas[1]), mas[2], Integer.parseInt(mas[3]),
							Integer.parseInt(mas[4]), Double.parseDouble(mas[5]), Double.parseDouble(mas[6])));

				}
				if (name.equalsIgnoreCase(res) && name.equalsIgnoreCase("Refrigerator")) {
					line = line.split("\\s+:\\s+")[1];
					mas = new String[line.split(",\\s+").length];

					for (int i = 0; i < mas.length; i++) {
						res = line.split(",\\s+")[i];
						mas[i] = res.split("=")[1];
					}

					result.add(new Refrigerator(mas[0], Integer.parseInt(mas[1]), Double.parseDouble(mas[2]),
							Double.parseDouble(mas[3]), Double.parseDouble(mas[4]), Double.parseDouble(mas[5]),
							Double.parseDouble(mas[6])));
				}
				if (name.equalsIgnoreCase(res) && name.equalsIgnoreCase("VacuumCleaner")) {
					line = line.split("\\s+:\\s+")[1];
					mas = new String[line.split(",\\s+").length];

					for (int i = 0; i < mas.length; i++) {
						res = line.split(",\\s+")[i];
						mas[i] = res.split("=")[1];
					}

					result.add(new VacuumCleaner(mas[0], Integer.parseInt(mas[1]), mas[2], mas[3], mas[4],
							Integer.parseInt(mas[5]), Integer.parseInt(mas[6])));
				}
				if (name.equalsIgnoreCase(res) && name.equalsIgnoreCase("TabletPC")) {
					line = line.split("\\s+:\\s+")[1];
					mas = new String[line.split(",\\s+").length];

					for (int i = 0; i < mas.length; i++) {
						res = line.split(",\\s+")[i];
						mas[i] = res.split("=")[1];
					}

					result.add(new TabletPC(mas[0], Double.parseDouble(mas[1]), Double.parseDouble(mas[2]),
							Integer.parseInt(mas[3]), Integer.parseInt(mas[4]), mas[5]));

				}
				if (name.equalsIgnoreCase(res) && name.equalsIgnoreCase("Speakers")) {
					line = line.split("\\s+:\\s+")[1];
					mas = new String[line.split(",\\s+").length];

					for (int i = 0; i < mas.length; i++) {
						res = line.split(",\\s+")[i];
						mas[i] = res.split("=")[1];

					}

					result.add(new Speakers(mas[0], Integer.parseInt(mas[1]), Integer.parseInt(mas[2]), mas[3],
							Double.parseDouble(mas[4])));
				}
			}
		} catch (FileNotFoundException e) {
			throw new DAOException(e);
		} catch (IOException e) {
			throw new DAOException(e);
		}
		return result;
	}

}
