//Complete
public class MedLinkedList {
	private MedNode head;

	public MedLinkedList() {
		super();
		head = null;
	}
	
	

	public boolean isEmpty() {
		boolean empty = true;
		
		if(head != null) {
			empty = false;
		}
	return empty;}
	public void add(MedNode obj) {
		boolean status = true;
		
		if(obj.getPatient() == null){
			status = false;
		}
		else {//Add to beginning
			if(isEmpty() == true) {
				head = obj;
			}
			else {//Add to middle or end
				boolean found = false;
				MedNode cur = head;
				MedNode prev = null;
				Patient newPatient = obj.getPatient();
				Patient curPatient = cur.getPatient();
				
				if(newPatient.getPriority() < curPatient.getPriority()) {
					obj.setNext(head);
					head = obj;
					found = true;
				}
				while(cur != null && !found) {
					curPatient = cur.getPatient();
					
					if(curPatient.getPriority() < newPatient.getPriority()) {
						prev = cur;
						cur = cur.getNext();
					}
					else  {
						prev = cur;
						cur = cur.getNext();
						prev.setNext(obj);
						obj.setNext(cur);
						found = true;
						
						;}
				
				}
				if(cur == null) {
					prev.setNext(obj);
				}
			}
		}
		
	}
	public void remove(){
		MedNode cur = head;
		MedNode next = head.getNext();
		head = next;
		
	}
	public String toString() {
		String msg = Patient.header() + "\n";
		MedNode cur = head;
		
		while(cur != null) {
			msg += cur.getPatient().toString() + "\n";
			cur = cur.getNext();
		}
	return msg;}
	
}
