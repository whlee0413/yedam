package com.yedam.lwh.classes.extendPkg;

public class DmbCellPhoneExample {
	public static void main(String[] args) {
		DmbCellPhone d1 = new DmbCellPhone("sky", "white", 10);
		d1.powerOn(); // CellPhone method
		d1.turnOnDmb(); // DmbCellPhone method
		d1.changeChannel(20);
		d1.turnOffDmb();
		d1.sendMessage("반갑습니다."); // CellPhone method
		d1.receiveMessage("안녕하세요");
		d1.powerOff();

		CellPhone c1 = new DmbCellPhone(); // Promotion

		if (c1 instanceof DmbCellPhone) {
			DmbCellPhone d2 = (DmbCellPhone) c1; // Casting 형변환(?)

			d2.turnOnDmb();
			d2.changeChannel(40);
			d2.turnOffDmb();
		}
		CellPhone c2 = new CellPhone();
		if (c2 instanceof DmbCellPhone) {
			DmbCellPhone d3 = (DmbCellPhone) c2;
		} else {
			System.out.println("casting 불가.");
		}

	}
}