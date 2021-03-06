package com.github.kaioru.instructability.command;

import com.github.kaioru.instructability.Defaults;

import java.util.ArrayList;
import java.util.List;

public abstract class CommandImpl implements Command {

	private final List<String> aliases;
	private final List<Command> commands;
	private final List<CommandVerifier> preVerifiers, postVerifiers;

	public CommandImpl() {
		this.aliases = new ArrayList<>();
		this.commands = new ArrayList<>();
		this.preVerifiers = new ArrayList<>();
		this.postVerifiers = new ArrayList<>();
	}

	@Override
	public String getPermission() { return Defaults.PERMISSION; }

	@Override
	public List<String> getAliases() {
		return aliases;
	}

	@Override
	public List<Command> getCommands() {
		return commands;
	}

	@Override
	public List<CommandVerifier> getPreVerifiers() {
		return preVerifiers;
	}

	@Override
	public List<CommandVerifier> getPostVerifiers() {
		return postVerifiers;
	}

	@Override
	public String toString() {
		return String.format(
				"%s - %s",
				getName(),
				getDesc()
		);
	}

}
