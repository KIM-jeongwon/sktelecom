package com.phone.jse.skservice;

import com.phone.jse.skdomain.SkMemberBean;
import com.phone.jse.skdomain.SktelecomBean;

public interface SktelecomService {
	public String showMessage(SkMemberBean member,SktelecomBean phone);
	public String makeNumber();
	
}
