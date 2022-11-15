package com.xworkx.methodoverriding.tin;

import com.xworkx.methodoverriding.tin.cococola.Cococola;
import com.xworkx.methodoverriding.tin.pepsi.Pepsi;
import com.xworkx.methodoverriding.tinapp.Tin;

public class TinTester {
public static void main(String[] args) {
	
	Tin tin = new Cococola();
	tin.toStoreLiquid();
	
	Tin t = new Pepsi();
	t.toStoreLiquid();
}
}
