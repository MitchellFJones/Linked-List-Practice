//Complete
public class MedNode {
	private Patient patient;
	private MedNode next;
	
	public MedNode(Patient patient) {
		super();
		this.patient = patient;
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	public MedNode getNext() {
		return next;
	}

	public void setNext(MedNode next) {
		this.next = next;
	}
	public String toString() {
		return patient.toString();
	}
	
}
