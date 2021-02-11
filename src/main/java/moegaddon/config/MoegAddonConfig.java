package moegaddon.config;

import java.io.File;


public class MoegAddonConfig extends ConfigManager {
    public boolean ModLoginMessage_Enabled;
    public String ModPackVersion;
    public String supportListURL;
    public String supportListGoldURL;
    public String supportListMEC1URL;
    public String supportListMEC2URL;
    public String supportListMEC3URL;
    public String supportListMEC4URL;
    public String supportListMEC5URL;
    public String modpackVersionURL;

    public MoegAddonConfig( File pConfigBaseDirectory, String pModCollectionDirectory, String pModID )
    {
        super( pConfigBaseDirectory, pModCollectionDirectory, pModID );

    }

    @Override
    protected void PreInit()
    {
        ModLoginMessage_Enabled = true;
        ModPackVersion = "3.6.0.0";
        supportListURL = "https://info.teammoeg.com/supportlistgold.txt";
        supportListGoldURL = "https://info.teammoeg.com/supportlist.txt";
        supportListMEC1URL = "https://info.teammoeg.com/mec1.txt";
        supportListMEC2URL = "https://info.teammoeg.com/mec2.txt";
        supportListMEC3URL = "https://info.teammoeg.com/mec3.txt";
        supportListMEC4URL = "https://info.teammoeg.com/mec4.txt";
        supportListMEC5URL = "https://info.teammoeg.com/mec5.txt";
        modpackVersionURL = "https://info.teammoeg.com/version.txt";
    }

    @Override
    protected void Init()
    {
        ModLoginMessage_Enabled = _mainConfig.getBoolean( "LoginMessage", "Modules", ModLoginMessage_Enabled, "Set to true to show login message with modpack version" );
        ModPackVersion = _mainConfig.getString( "ModPackVersion", "Modules", ModPackVersion, "Version of the Modpack" );
        supportListURL = _mainConfig.getString( "Support List URL", "URL", supportListURL, "" );
        supportListGoldURL = _mainConfig.getString( "Golden Support List URL", "URL", supportListGoldURL, "" );
        supportListMEC1URL = _mainConfig.getString( "MEC1 Support List URL", "URL", supportListMEC1URL, "" );
        supportListMEC2URL = _mainConfig.getString( "MEC2 Support List URL", "URL", supportListMEC2URL, "" );
        supportListMEC3URL = _mainConfig.getString( "MEC3 Support List URL", "URL", supportListMEC3URL, "" );
        supportListMEC4URL = _mainConfig.getString( "MEC4 Support List URL", "URL", supportListMEC4URL, "" );
        supportListMEC5URL = _mainConfig.getString( "MEC5 Support List URL", "URL", supportListMEC5URL, "" );
        modpackVersionURL = _mainConfig.getString( "Modpack Version URL", "URL", modpackVersionURL, "" );

    }

    @Override
    protected void PostInit()
    {

    }
}