package me.jdweak.customItems;

import org.bukkit.plugin.java.JavaPlugin;
import Listeners.Listeners;

public class Main extends JavaPlugin{
	
	private static Main instance;
	
	public static Main getInstance() {
		return instance;
	}
	
	@Override
	public void onEnable() {
		instance = this;
		
		getServer().getPluginManager().registerEvents(new Listeners(), this);
		System.out.println("plugin enabled with updates");
	}
	
	
}