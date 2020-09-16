package moegaddon.config;


import java.io.File;

import net.minecraftforge.common.config.Configuration;

import static moegaddon.CommonProxy.LOGGER;

public abstract class ConfigManager
{
    private File            _mainconfigDir   = null;
    private File            _blocksconfigDir = null;
    private String          _mModCollection  = "";
    private String          _mModID          = "";

    protected Configuration _mainConfig      = null;

    protected File          _mConfigBaseDirectory;
    public boolean          DoDebugMessages  = false;

    protected abstract void PreInit();

    protected abstract void Init();

    protected abstract void PostInit();

    public ConfigManager( File pConfigBaseDirectory, String pModCollectionDirectory, String pModID )
    {
        _mModCollection = pModCollectionDirectory;
        _mModID = pModID;
        _mConfigBaseDirectory = pConfigBaseDirectory;
    }

    /**
     * Load/init the config file
     *
     * @return true/false if the load/init was successful or not
     */
    public boolean LoadConfig()
    {
        try
        {
            InitConfigDirs();
            if( _mainConfig == null )
                return false;

            PreInit();
            _mainConfig.load();
            Init();

            DoDebugMessages = _mainConfig.getBoolean( "DoDebugMessages", "Debug", false, "Enable debug output to fml-client-latest.log" );
            _mainConfig.save();

            PostInit();

            return true;
        }
        catch( Exception e )
        {
            LOGGER.warn("Unable to init config file");
            return false;
        }
    }

    /**
     * Search for required config-directory / file and create them if they can't be found
     */
    private void InitConfigDirs()
    {
        LOGGER.info( "Checking/creating config folders" );

        _mainconfigDir = new File( String.format( "%s%s%s", _mConfigBaseDirectory, File.separator, _mModCollection ) );

        if( !_mainconfigDir.exists() )
        {
            LOGGER.info( "Config folder not found. Creating..." );
            _mainconfigDir.mkdir();
        }

        File tRealConfigFile = new File( String.format( "%s%s%s%s", _mainconfigDir, File.separator, _mModID, ".cfg" ) );

        _mainConfig = new Configuration( tRealConfigFile );
    }
}
