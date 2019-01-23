


public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Driver newDriver = new Driver();
		newDriver.run();

	}
	
	private void run() {
		MedLinkedList patientList = new MedLinkedList();
		
		Patient newPatient = new Patient("Frank Sinatra", 87, 'M', 2);
		MedNode newMedNode = new MedNode(newPatient);
		patientList.add(newMedNode);
		
		newPatient = new Patient("Jennifer Granholm", 45, 'F', 3);
		newMedNode = new MedNode(newPatient);
		patientList.add(newMedNode);
		
		newPatient = new Patient("Patrick Kinnicutt", 89, 'M', 0);
		newMedNode = new MedNode(newPatient);
		patientList.add(newMedNode);
		
		newPatient = new Patient("Sarah Palin", 46, 'F', 0);
		newMedNode = new MedNode(newPatient);
		patientList.add(newMedNode);
		
		newPatient = new Patient("Bill Clinton", 65, 'M', 4);
		newMedNode = new MedNode(newPatient);
		patientList.add(newMedNode);
		
		newPatient = new Patient("Barack Obama", 48, 'M', 1);
		newMedNode = new MedNode(newPatient);
		patientList.add(newMedNode);
		
		System.out.println(patientList);
		
		patientList.remove();
		
		System.out.println(patientList);
		
	}
	
	
//	 __       __  __    __                __                  __  __           _____                                         
//	 /  \     /  |/  |  /  |              /  |                /  |/  |         /     |                                        
//	 $$  \   /$$ |$$/  _$$ |_     _______ $$ |____    ______  $$ |$$ |         $$$$$ |  ______   _______    ______    _______ 
//	 $$$  \ /$$$ |/  |/ $$   |   /       |$$      \  /      \ $$ |$$ |            $$ | /      \ /       \  /      \  /       |
//	 $$$$  /$$$$ |$$ |$$$$$$/   /$$$$$$$/ $$$$$$$  |/$$$$$$  |$$ |$$ |       __   $$ |/$$$$$$  |$$$$$$$  |/$$$$$$  |/$$$$$$$/ 
//	 $$ $$ $$/$$ |$$ |  $$ | __ $$ |      $$ |  $$ |$$    $$ |$$ |$$ |      /  |  $$ |$$ |  $$ |$$ |  $$ |$$    $$ |$$      \ 
//	 $$ |$$$/ $$ |$$ |  $$ |/  |$$ \_____ $$ |  $$ |$$$$$$$$/ $$ |$$ |      $$ \__$$ |$$ \__$$ |$$ |  $$ |$$$$$$$$/  $$$$$$  |
//	 $$ | $/  $$ |$$ |  $$  $$/ $$       |$$ |  $$ |$$       |$$ |$$ |      $$    $$/ $$    $$/ $$ |  $$ |$$       |/     $$/ 
//	 $$/      $$/ $$/    $$$$/   $$$$$$$/ $$/   $$/  $$$$$$$/ $$/ $$/        $$$$$$/   $$$$$$/  $$/   $$/  $$$$$$$/ $$$$$$$/

}
