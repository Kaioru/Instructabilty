package instructabilty;

import instructabilty.command.CommandListener;
import sx.blah.discord.Discord4J;
import sx.blah.discord.api.IDiscordClient;
import sx.blah.discord.modules.IModule;

public class Instructability implements IModule {

	private IDiscordClient client;
	private CommandListener listener = new CommandListener();

	@Override
	public boolean enable(IDiscordClient client) {
		this.client = client;

		client.getDispatcher().registerListener(listener);
		Discord4J.LOGGER.info(getName() + " Command Listener registered");
		return true;
	}

	@Override
	public void disable() {
		client.getDispatcher().unregisterListener(listener);
		Discord4J.LOGGER.info(getName() + " Command Listener unregistered");
	}

	@Override
	public String getName() {
		return "Instructability";
	}

	@Override
	public String getAuthor() {
		return "Kaioru";
	}

	@Override
	public String getVersion() {
		return "1.0";
	}

	@Override
	public String getMinimumDiscord4JVersion() {
		return "2.4.6";
	}

}
