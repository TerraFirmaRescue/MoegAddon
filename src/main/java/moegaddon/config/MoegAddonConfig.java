package moegaddon.config;

import java.io.File;


public class MoegAddonConfig extends ConfigManager
{
    public MoegAddonConfig( File pConfigBaseDirectory, String pModCollectionDirectory, String pModID )
    {
        super( pConfigBaseDirectory, pModCollectionDirectory, pModID );

    }

    static public boolean ModLoginMessage_Enabled;
    static public String ModPackVersion;


    @Override
    protected void PreInit()
    {
        ModLoginMessage_Enabled = true;
        ModPackVersion = "3.6.0.0";
    }

    @Override
    protected void Init()
    {
        ModLoginMessage_Enabled = _mainConfig.getBoolean( "LoginMessage", "Modules", ModLoginMessage_Enabled, "Set to true to show login message with modpack version" );
        ModPackVersion = _mainConfig.getString( "ModPackVersion", "Modules", ModPackVersion, "Version of the Modpack" );
    }

    @Override
    protected void PostInit()
    {

    }
}