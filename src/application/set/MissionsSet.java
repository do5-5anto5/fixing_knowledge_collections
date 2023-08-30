package application.set;

import services.MissionService;

public class MissionsSet {

	public static void main(String[] args) {
		
		MissionService service = new MissionService();
		
		service.addMission("travel");
		service.addMission("fight");
		service.addMission("enter in castle");
		service.addMission("fight again");
		service.addMission("save the princess");
		
		service.countMissions();
		service.showAllMissions();
		
		service.markMissionAsComplete("travel");
		service.markMissionAsComplete("fight");
		service.markMissionAsComplete("enter in castle");
		service.getAllCompleteMissions();
		service.getAllIncompleteMissions();
		
		service.clearMissionsSet();
		
		service.countMissions();
		service.showAllMissions();
		
	}

}
