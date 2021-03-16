package org.hst.factoryofideas.repository;

import java.util.ArrayList;
import java.util.List;

import org.hst.factoryofideas.model.Sector;

public class IdeaRepository {

	private static List<Sector> sectors = new ArrayList<Sector>();
	
	public static List<Sector> getSectors() {
		return sectors;
	}

	public static void setSectors(List<Sector> newSector) {
		sectors = newSector;
	}
}
