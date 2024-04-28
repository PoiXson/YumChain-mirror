package com.poixson.yumchain.commands;

import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.poixson.tools.commands.pxnCommand;
import com.poixson.yumchain.YumChainDAO;
import com.poixson.yumchain.YumChainPlugin;


public class Command_Reset extends pxnCommand {

	protected final YumChainPlugin plugin;



	public Command_Reset(final YumChainPlugin plugin) {
		super(
			null, null,
			new String[] {
				"reset"
			}
		);
		this.plugin = plugin;
	}



	@Override
	public boolean run(final CommandSender sender, final String[] args) {
		final Player player = (sender instanceof Player ? (Player)sender : null);
//TODO: permissions
//TODO: reset other player
		final YumChainDAO chain = this.plugin.getYumChain(player);
		chain.reset(true);
		return true;
	}



}