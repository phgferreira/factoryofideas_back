package org.hst.factoryofideas.repository;

import java.util.ArrayList;
import java.util.List;

public class IdeaRepository {

	private static List<String> sectors = new ArrayList<String>();
	
	public static List<String> getSectors() {
		return sectors;
	}

	public static void setSectors(List<String> s) {
		sectors = s;
	}
}
