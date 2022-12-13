package de.demmer.dennis;

public class Application {

	public static void main(String[] args) {
		
		EMail mail1 = new EMail("Dennis.Demmer@uni-koeln.de", "Max.Mustermann@web.de", "Test-Email1");
		EMail mail2 = new EMail("D.Demmer@web.de", "Test@web.de", "Test-Email2");
		EMail mail3 = new EMail("Demmer.D@yahoo.de", "Bla.Bla@web.de", "Test-Email3");

		Outbox outbox = new Outbox(5);
		outbox.addMail(mail1);
		outbox.addMail(mail2);
		outbox.addMail(mail3);
	
		outbox.printAllMails();
		
		int indexToDelete = 1;
		if(outbox.deleteEMail(indexToDelete) == false) {
			System.out.println("Keine Email an der Stelle " + indexToDelete +" vorhanden!");
		}
		
		System.out.println("----------");
		outbox.printAllMails();
		System.out.println("----------");

		
		Inbox inbox = new Inbox(5);
		inbox.printAllMails();
		
		
	}
	
	
	
}
