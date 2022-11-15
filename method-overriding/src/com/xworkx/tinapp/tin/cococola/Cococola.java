package com.xworkx.methodoverriding.tin.cococola;

import com.xworkx.methodoverriding.tinapp.Tin;

public class Cococola extends Tin{

	@Override
	public void toStoreLiquid() {
		System.out.println("Cococola is filled");
	}
}
