package com.linmalu.library;

import com.linmalu.library.api.LinmaluMain;

public class LinmaluLibrary extends LinmaluMain
{
	@Override
	public void onEnable()
	{
		super.onEnable();
		registerEvents(new Main_Event());
	}
}
