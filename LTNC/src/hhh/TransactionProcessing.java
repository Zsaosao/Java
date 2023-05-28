package hhh;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class TransactionProcessing {
	private ArrayList<Payment> paymentObjects;
	private IDCardManagement idcm;

	public TransactionProcessing(String idCardFilePath, String paymentFilePath) throws CannotCreateCard {
		paymentObjects = new ArrayList<Payment>();
		idcm = new IDCardManagement(idCardFilePath);

		try {
			File filePaymentFilePath = new File(paymentFilePath);
			try (Scanner scannerPaymentFilePath = new Scanner(filePaymentFilePath)) {
				while (scannerPaymentFilePath.hasNextLine()) {
					String line = scannerPaymentFilePath.nextLine();
					String[] parts = line.split(",");
					int IdPayment = Integer.parseInt(parts[0]);
					if (parts.length == 1) {
						if (IdPayment >= 100000 && IdPayment <= 999999) {
							for (int i = 0; i < idcm.getIDCards().size(); i++) {
								if (idcm.getIDCards().get(i).getIdentificationNumber() == IdPayment) {
									paymentObjects.add(new ConvenientCard(idcm.getIDCards().get(i)));
								}
							}
						} else if (IdPayment >= 1000000 && IdPayment <= 9999999) {
							paymentObjects.add(new EWallet(IdPayment));
						}
					} else {
						paymentObjects.add(new BankAccount(IdPayment, Double.parseDouble(parts[1])));
					}

				}
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			System.out.println("File not found: " + paymentFilePath);
		}
	}

	public ArrayList<Payment> getPaymentObject() {
		return paymentObjects;
	}

	// public boolean readPaymentObject(String path) {

	// }
}
