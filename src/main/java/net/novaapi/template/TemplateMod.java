package net.novaapi.template;

import nova.core.block.BlockManager;
import nova.core.loader.Loadable;
import nova.core.loader.Mod;

@Mod(id = TemplateMod.MOD_ID, name = TemplateMod.NAME, version = TemplateMod.VERSION, novaVersion = "0.0.1")
public class TemplateMod implements Loadable {
	public static final String MOD_ID = "template_mod";
	public static final String NAME = "Example Mod";
	public static final String VERSION = "0.1.0";

	public final BlockManager blockManager;

	public TemplateMod(BlockManager blockManager) {
		this.blockManager = blockManager;
	}

	@Override
	public void init() {
		// some example code
		System.out.println("AIR BLOCK >> " + this.blockManager.getAirBlock().getID());
	}
}
