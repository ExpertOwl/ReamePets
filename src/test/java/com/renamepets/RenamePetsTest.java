package com.renamepets;

import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;

public class RenamePetsTest
{
	public static void main(String[] args) throws Exception
	{
		ExternalPluginManager.loadBuiltin(RenamePetsPlugin.class);
		RuneLite.main(args);
	}
}