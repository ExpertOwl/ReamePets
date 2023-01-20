package com.renamepets;

import com.google.inject.Provides;
import javax.inject.Inject;
import lombok.extern.slf4j.Slf4j;
import net.runelite.api.ChatMessageType;
import net.runelite.api.Client;
import net.runelite.api.GameState;
import net.runelite.api.events.GameStateChanged;
import net.runelite.api.events.MenuEntryAdded;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;

@Slf4j
@PluginDescriptor(
	name = "Example"
)
public class RenamePetsPlugin extends Plugin
{
	@Inject
	private Client client;

	@Inject
	private RenamePetsConfig config;

	@Subscribe
	public void onMenuEntryAdded(MenuEntryAdded event)
	{
		if (event.getMenuEntry().getTarget().contains("Giant Squirrel")) {
			event.getMenuEntry().setTarget(event.getTarget().replace("Giant Squirrel", config.PetNames()));
		}
	}


	@Provides
	RenamePetsConfig provideConfig(ConfigManager configManager)
	{
		return configManager.getConfig(RenamePetsConfig.class);
	}
}
