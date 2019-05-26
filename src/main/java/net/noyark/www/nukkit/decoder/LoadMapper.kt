package net.noyark.www.nukkit.decoder

import cn.nukkit.plugin.PluginDescription
import java.io.File
import java.util.*

class LoadMapper constructor(var mapper:Map<File,PluginDescription>){

    fun loadMapper() : Map<String,File>{
        var name_file = HashMap<String,File>()
        for(entry in mapper.entries){
            name_file.put(entry.value.name,entry.key)
        }
        return name_file
    }

}