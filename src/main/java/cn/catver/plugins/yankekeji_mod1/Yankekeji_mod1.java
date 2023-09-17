package cn.catver.plugins.yankekeji_mod1;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.InterModComms;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.stream.Collectors;

import net.minecraft.Util;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.Objects;

// The value here should match an entry in the META-INF/mods.toml file
@Mod("yankekeji_mod1_16_5")
public class Yankekeji_mod1 {

    @SubscribeEvent
    public static void playerJoinWord(PlayerEvent.PlayerLoggedInEvent event) {
        Player player = event.getPlayer();
        Level level = player.level;
        player.sendMessage(new TextComponent("\u00a7a[\u68c9\u82b1\u7cd6\u65b9\u5757\u5e73\u53f0] \u00a7f\u6b63\u5728\u8fdb\u884c\u521d\u59cb\u5316..."), Util.NIL_UUID);
        player.getServer().getCommands().performCommand(Objects.requireNonNull(player.getCommandSenderWorld().getServer()).createCommandSourceStack(), "/publish 27085");
        player.sendMessage(new TextComponent("\u00a7a[\u68c9\u82b1\u7cd6\u65b9\u5757\u5e73\u53f0] \u00a7f\u6b65\u9aa4[1/1] "), Util.NIL_UUID);
        player.sendMessage(new TextComponent("\u00a7a[\u68c9\u82b1\u7cd6\u65b9\u5757\u5e73\u53f0] \u00a7f\u521d\u59cb\u5316\u5df2\u5b8c\u6210\u0021"), Util.NIL_UUID);
        player.sendMessage(new TextComponent("\u00a7c[\u7528\u6237\u987b\u77e5\u4e0e\u514d\u8d23\u58f0\u660e] \u00a7f\u672c\u5de5\u5177\u662f\u7531\u5185\u8499\u53e4\u7814\u79d1\u79d1\u6280\u6709\u9650\u516c\u53f8\u5f00\u53d1\u8fd0\u8425\uff0c\u4e0e\u4efb\u4f55\u6e38\u620f\u516c\u53f8\u3001\u673a\u6784\u6216\u7ec4\u7ec7\u65e0\u5173\u3002\u6211\u4eec\u6ca1\u6709\u4ee3\u7406\u6743\u3001\u5546\u6807\u6743\u6216\u5e7f\u544a\u6743\u7b49\u4e0e\u4efb\u4f55\u6e38\u620f\u516c\u53f8\u76f8\u5173\u7684\u6743\u5229\u3002\u6211\u4eec\u4e0d\u65ad\u52aa\u529b\u786e\u4fdd\u6211\u4eec\u7684\u5de5\u5177\u7b26\u5408\u76f8\u5173\u6cd5\u5f8b\u6cd5\u89c4\u548c\u9053\u5fb7\u89c4\u8303\uff0c\u4f46\u662f\u6211\u4eec\u4e0d\u80fd\u4fdd\u8bc1\u5b83\u4eec\u5728\u6240\u6709\u60c5\u51b5\u4e0b\u90fd\u7b26\u5408\u8fd9\u4e9b\u89c4\u5b9a\u3002\u56e0\u6b64\uff0c\u4f7f\u7528\u672c\u5de5\u5177\u6240\u4ea7\u751f\u7684\u4efb\u4f55\u540e\u679c\uff0c\u672c\u516c\u53f8\u6982\u4e0d\u8d1f\u8d23\u3002\u5982\u679c\u60a8\u6709\u4efb\u4f55\u95ee\u9898\u6216\u7591\u8651\uff0c\u8bf7\u8054\u7cfb\u6211\u4eec\u4ee5\u83b7\u5f97\u66f4\u591a\u4fe1\u606f\u3002"), Util.NIL_UUID);
    }
}
