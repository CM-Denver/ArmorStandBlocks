package com.william.plugin;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.TreeType;
import org.bukkit.World;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.Blaze;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.player.PlayerBedEnterEvent;
import org.bukkit.event.player.PlayerBedLeaveEvent;
import org.bukkit.event.player.PlayerEggThrowEvent;
import org.bukkit.event.player.PlayerItemConsumeEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class Main extends JavaPlugin implements Listener{

	@Override
	public void onEnable() {
		System.out.println("ArmorStandBlocks plugin has worked (sorta)");
		
		World world = Bukkit.getWorld("world");
		
		//Side of wall:
		//Call class 'spawnStand' to place an armor stand that will appear as a mini log block:
		spawnStand(new Location(world, -203.5, 69.3125, 253.5), new ItemStack(Material.LOG));
		spawnStand(new Location(world, -203.5, 69.75, 253.5), new ItemStack(Material.LOG));
		spawnStand(new Location(world, -203.5, 70.1875, 253.5), new ItemStack(Material.LOG));
		spawnStand(new Location(world, -203.5, 70.625, 253.5), new ItemStack(Material.LOG));
		
		//Wall One:
		spawnStand(new Location(world, -203.5, 69.3125, 253.0625), new ItemStack(Material.WOOD));
		spawnStand(new Location(world, -203.5, 69.75, 253.0625), new ItemStack(Material.WOOD));
		spawnStand(new Location(world, -203.5, 70.1875, 253.0625), new ItemStack(Material.WOOD));
		spawnStand(new Location(world, -203.5, 70.625, 253.0625), new ItemStack(Material.WOOD));
		
		spawnStand(new Location(world, -203.5, 69.3125, 252.625), new ItemStack(Material.WOOD));
		spawnStand(new Location(world, -203.5, 69.75, 252.625), new ItemStack(Material.WOOD));
		spawnStand(new Location(world, -203.5, 70.1875, 252.625), new ItemStack(Material.WOOD));
		spawnStand(new Location(world, -203.5, 70.625, 252.625), new ItemStack(Material.WOOD));
		
		spawnStand(new Location(world, -203.5, 69.3125, 252.1875), new ItemStack(Material.WOOD));
		spawnStand(new Location(world, -203.5, 69.75, 252.1875), new ItemStack(Material.WOOD));
		spawnStand(new Location(world, -203.5, 70.1875, 252.1875), new ItemStack(Material.WOOD));
		spawnStand(new Location(world, -203.5, 70.625, 252.1875), new ItemStack(Material.WOOD));
		
		//Other side of wall:
		spawnStand(new Location(world, -203.5, 69.3125, 251.75), new ItemStack(Material.LOG));
		spawnStand(new Location(world, -203.5, 69.75, 251.75), new ItemStack(Material.LOG));
		spawnStand(new Location(world, -203.5, 70.1875, 251.75), new ItemStack(Material.LOG));
		spawnStand(new Location(world, -203.5, 70.625, 251.75), new ItemStack(Material.LOG));
		
		Bukkit.getPluginManager().registerEvents(this, this);
	}
	
	@Override
	public void onDisable() {
		System.out.println("ArmorStandBlocks plugin disabled");
	}
	
	//Class that creates the armor stand:
	private void spawnStand(Location location, ItemStack material) {
		
		//Spawns armor stand:
		ArmorStand stand = (ArmorStand) location.getWorld().spawnEntity(location, EntityType.ARMOR_STAND);
		
		stand.setBasePlate(false);
		
		//Stand won't take damage or have gravity:
		stand.setGravity(false);
		
		stand.setInvulnerable(true);
		
		//Stand will be invisible and appear as a mini block:
		stand.setSmall(true);
		
		stand.setVisible(false);
		
		//This is the mini 'block' that will be visible:
		stand.setHelmet(material);
	}
	
}
