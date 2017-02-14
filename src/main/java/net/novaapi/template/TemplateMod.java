package net.novaapi.template;

import nova.core.block.BlockManager;
import nova.core.event.bus.GlobalEvents;
import nova.core.loader.Mod;
import org.slf4j.Logger;

@Mod(id = TemplateMod.MOD_ID, name = TemplateMod.NAME, version = TemplateMod.VERSION, novaVersion = "0.0.1")
public class TemplateMod {
	public static final String MOD_ID = "template_mod";
	public static final String NAME = "Example Mod";
	public static final String VERSION = "0.1.0";

	public final GlobalEvents events;
	public final Logger logger;

	public TemplateMod(GlobalEvents events,
	                   BlockManager blockManager,
	                   Logger logger) {
		this.events = events;
		this.logger = logger;

		events.on(BlockManager.Init.class).bind(evt -> this.registerBlocks(evt.manager));
	}

	public void registerBlocks(BlockManager blockManager) {
		// some example code
		this.logger.info("AIR BLOCK >> " + blockManager.getAirBlock().getID());
	}
}
