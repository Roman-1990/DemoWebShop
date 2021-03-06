package config;

import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "system:properties",
        "classpath:config/local.properties"
})
public interface ProjectConfig extends Config {

    @Config.Key("remoteDriverUrl")
    String remoteDriverUrl();

    @Config.Key("videoStorage")
    String videoStorage();
}
