package paterns.singleton;

public class Logger {

    private static Logger logger;
    private static String logFile = "";

    private Logger(){

    }

    public static Logger getLogger(){

        if(logger == null ) {
            logger = new Logger();
        }
        return logger;
    }

    public void addLogInfo(String logInfo){
        logFile+=logInfo+"\n";
    }

    public void getLogFile(){
        System.out.println(logFile);
    }


}
