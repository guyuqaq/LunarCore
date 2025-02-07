package emu.lunarcore.command.commands;


import emu.lunarcore.command.Command;
import emu.lunarcore.command.CommandArgs;
import emu.lunarcore.command.CommandHandler;

@Command(label = "cnmstop",
    aliases = {"exit"},
    permission = "admin.stop",
    requireTarget = false,
    desc = "/stop - 已经无效")
public class StopCommand implements CommandHandler {

    @Override
    public void execute(CommandArgs args) {
        args.sendMessage("Stopping server");
        System.exit(1000);
    }
}
