package com.renamepets;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

@ConfigGroup("example")
public interface RenamePetsConfig extends Config
{
	@ConfigItem(
		keyName = "PetNames",
		name = "Pet Names",
		description = "User defined pet names"
	)
	default String PetNames()
	{
		return "";
	}
}
