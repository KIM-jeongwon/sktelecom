package com.phone.jse.skcontroller;

import javax.swing.JOptionPane;

import com.phone.jse.skdomain.SkMemberBean;
import com.phone.jse.skdomain.SktelecomBean;
import com.phone.jse.skservice.SktelecomService;
import com.phone.jse.skserviceimpl.SktelecomServiceImpl;

public class Skcontroller {
	public static void main(String[] args) {
		SktelecomBean phone = null;
		SkMemberBean member = null;
		SktelecomService service = new SktelecomServiceImpl();
		while (true) {
			switch (JOptionPane.showInputDialog("0.종료 1.개통 2.요금납부")) {
				case "0":
					JOptionPane.showMessageDialog(null, "종료되었습니다.");
					return;
				case "1":
					phone = new SktelecomBean();
					member = new SkMemberBean();
					phone.setPhone((JOptionPane.showInputDialog(
							"어떤폰을 하시겠습니까?(1.GALAXY,2.IPHONE)")
							.equals("1")) ? "Galaxy": "I-phone");			
					member.setName(JOptionPane.showInputDialog("이름이 무엇입니까?"));
					JOptionPane.showMessageDialog(null,service.showMessage(member, phone));
					break;
					 
				//	break;
			// 어떤폰하시겠습니까
			// 1. 갤럭시 2. 아이폰
			// 이름이 무엇입니까
					
			// 전화번호는 랜덤으로 개통
			// 홍길동님 이름으로 010-xxxx-xxxx 갤럭시폰이 개통 되었습니다.
//				null          null
			}
		}
	}
}
