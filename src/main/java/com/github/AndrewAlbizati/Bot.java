package com.github.AndrewAlbizati;

import org.javacord.api.DiscordApi;
import org.javacord.api.DiscordApiBuilder;
import org.javacord.api.interaction.SlashCommand;

import java.util.List;
import java.util.concurrent.ExecutionException;

public class Bot implements Runnable {
    private final DiscordApi api;
    public Bot(String token) {
        api = new DiscordApiBuilder().setToken(token).login().join();
        System.out.println("Logged in as " + api.getYourself().getDiscriminatedName());
    }

    public DiscordApi getApi() {
        return api;
    }

    /**
     * Delete all bot Slash Commands.
     * Disconnects bot once all commands have been deleted.
     */
    @Override
    public void run() {
        try {
            List<SlashCommand> commands = api.getGlobalSlashCommands().get();
            for (SlashCommand command : commands) {
                System.out.println("/" + command.getName() + " command removed from " + api.getYourself().getDiscriminatedName());
                command.deleteGlobal().join();
            }
        } catch (ExecutionException | InterruptedException e) {
            e.printStackTrace();
        }
        api.disconnect();
        System.out.println("All Slash Commands deleted successfully!");
    }
}
