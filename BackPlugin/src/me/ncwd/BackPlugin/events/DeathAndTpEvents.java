package me.ncwd.BackPlugin.events;

import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.event.player.PlayerTeleportEvent;

public class DeathAndTpEvents implements Listener{
	public static Location l;
	@EventHandler
	public static void PlayerTeleportEvent(Player player, Location from, Location to) {
		l = from;
	}
	
}
