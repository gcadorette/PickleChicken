package com.example;

import com.picklechicken.PickleChickenPlugin;
import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;

public class PickleChickenTest
{
	public static void main(String[] args) throws Exception
	{
		ExternalPluginManager.loadBuiltin(PickleChickenPlugin.class);
		RuneLite.main(args);
	}
}