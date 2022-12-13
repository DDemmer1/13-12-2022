package de.demmer.dennis;

public class Mailbox {

	private EMail[] mails;
	
	
	public Mailbox(int size) {
		mails = new EMail[size];
	}


	public void addMail(EMail mail) {

		for (int i = 0; i < mails.length; i++) {

			if (mails[i] == null) {
				mails[i] = mail;
				return;
			}
		}
	}

	public void printAllMails() {

		for (int i = 0; i < mails.length; i++) {

			if (mails[i] == null) {
				System.out.println(i + ".  -");
			} else {
				System.out.println(i + ". " + mails[i].subject + ", " + mails[i].recipient);
			}
		}

	}

	public boolean deleteEMail(int index) {

		if (mails[index] == null) {
			return false;
		} else {
			mails[index] = null;
			return true;
		}

	}

}
