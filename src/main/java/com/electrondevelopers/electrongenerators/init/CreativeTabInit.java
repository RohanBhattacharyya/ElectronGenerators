package com.electrondevelopers.electrongenerators.init;

import com.electrondevelopers.electrongenerators.ElectronGenerators;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;



@Mod.EventBusSubscriber(modid = ElectronGenerators.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class CreativeTabInit
{
    public static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ElectronGenerators.MODID);


    public static final RegistryObject<CreativeModeTab> Electron_Tab = TABS.register("electron_tab",
            () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup.electron_tab"))
                    .icon(ItemInit.antimatter_block_item.get()::getDefaultInstance)
                    .displayItems(((itemDisplayParameters, output) -> {
                        output.accept(ItemInit.antimatter_block_item.get());
                        output.accept(ItemInit.ANTIMATTER_GLOB.get());
                        output.accept(ItemInit.ANTIMATTER_SHARD.get());
                    }))
                    .build()
    );

    @SubscribeEvent
    public static void buildContents(BuildCreativeModeTabContentsEvent event){
        if(event.getTabKey().equals(CreativeModeTabs.FUNCTIONAL_BLOCKS)){
            event.accept(ItemInit.antimatter_block_item);
        }
    }
}
