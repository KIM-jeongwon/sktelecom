package com.phone.jse.skserviceimpl;

import com.phone.jse.skdomain.SkMemberBean;
import com.phone.jse.skdomain.SktelecomBean;
import com.phone.jse.skservice.SktelecomService;

public class SktelecomServiceImpl implements SktelecomService{
	SkMemberBean[] members;
	SktelecomBean[] phones;
	private int memberCount, phoneCount;
	
	public SktelecomServiceImpl() {
			members = new SkMemberBean[2];
			phones = new SktelecomBean[2];
			memberCount = phoneCount = 0;
	}
	public void addUser(SkMemberBean member,SktelecomBean phone) {
			this.members[memberCount++]=member;
			this.phones[phoneCount++]=phone;
		for(int i=1; i>=1000; i++) {
			if(i>=1000) {
				
			}else{}
		}
	}

	@Override
	public String showMessage(SkMemberBean member,SktelecomBean phone) {
		phone.setNumber(makeNumber());
		addUser(member,phone);
		String message = 
				String.format("[%s]님 이름으로  [%s]  [%s]폰이 개통 되었습니다.",
							member.getName(),phone.getNumber(),phone.getPhone());
		return message;
	}

	@Override
	public String makeNumber() {
		 int min =(int)(Math.random()*10000+1);
		 int max =(int)(Math.random()*10000+1);
		 String a = "-"+min+"-"+max;
		 return "010"+a;
	}
}
