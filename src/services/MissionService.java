package services;

import java.util.HashSet;
import java.util.Set;

import entities.Mission;

public class MissionService {

	Set<Mission> missionsSet;

	public MissionService() {
		missionsSet = new HashSet<>();
	}

	public void addMission(String description) {
		Mission mission = new Mission(description);
		missionsSet.add(mission);
	}

	public void removeMission(String description) {
		if (!missionsSet.isEmpty()) {
			Mission missionToRemove = null;
			for (Mission m : missionsSet) {
				if (m.getDescription().equalsIgnoreCase(description)) {
					missionToRemove = m;
					break;
				}
			}
			missionsSet.remove(missionToRemove);
		} else {
			System.out.println("\nEmpty List");
		}
	}

	public void showAllMissions() {
		System.out.println();
		if (!missionsSet.isEmpty()) {
			for (Mission m : missionsSet) {
				System.out.println(m);
			}
		} else {
			System.out.println("\nEmpty List.");
		}
	}

	public void countMissions() {
		if (!missionsSet.isEmpty()) {
			System.out.println("\nTotal number of missions: " + missionsSet.size());
		} else {
			System.out.println("\nEmpty List.");
		}
	}

	public void getAllCompleteMissions() {
		if (!missionsSet.isEmpty()) {
			Set<Mission> completeMissions = new HashSet<>();
			System.out.println("\nComplete Missions: ");
			for (Mission m : missionsSet) {
				if (m.isComplete() == true) {
					completeMissions.add(m);
					System.out.println(m);
				}
			}
		} else {
			System.out.println("\nEmpty List.");
		}
	}
	

	public void getAllIncompleteMissions() {
		if (!missionsSet.isEmpty()) {
			Set<Mission> incompleteMissions = new HashSet<>();
			System.out.println("\nComplete Missions: ");
			for (Mission m : missionsSet) {
				if (m.isComplete() == false) {
					incompleteMissions.add(m);
					System.out.println(m);
				}
			}
		} else {
			System.out.println("\nEmpty List.");
		}
	}
	
	public void markMissionAsComplete (String description) {
		if(!missionsSet.isEmpty()) {
			for (Mission m: missionsSet) {
				if (m.getDescription().equalsIgnoreCase(description)) {
					m.setComplete(true);
					System.out.println("Mission '" + description + "' is complete.");
				}
			}
		} else {
			System.out.println("\nEmpty List.");
		}
	}
	
	public void markMissionAsIncomplete (String description) {
		if(!missionsSet.isEmpty()) {
			for (Mission m: missionsSet) {
				if (m.getDescription().equalsIgnoreCase(description)) {
					m.setComplete(false);
					System.out.println("Mission '" + description + "' is incomplete.");
				}
			}
		} else {
			System.out.println("\nEmpty List.");
		}
	}
	
	public void clearMissionsSet() {
		missionsSet.clear();
	}
}