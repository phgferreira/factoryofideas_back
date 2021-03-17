package org.hst.factoryofideas.repository;

import java.util.ArrayList;
import java.util.List;

import org.hst.factoryofideas.model.Sector;

public class SectorRepository {

	private static List<Sector> sectors = new ArrayList<Sector>();
	
	public static Sector getSector(Integer id) {
		for (Sector sector : sectors)
			if (sector.getId().equals(id))
				return sector;
		return null;
	}
	
	public static List<Sector> getSectors() {
		return sectors;
	}

	public static void setSectors(List<Sector> newSector) {
		sectors = newSector;
	}
}
