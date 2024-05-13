package paterns.singleton;

public class LoggerRunner {

    public static void main(String[] args) {

        Logger logger = Logger.getLogger();
        logger.addLogInfo("First log 1");
        logger.addLogInfo("Second log 2");
        logger.addLogInfo("Third log 3");
        logger.addLogInfo("logger hash code="+logger.toString());

        logger.addLogInfo("4 log ");
        logger.addLogInfo("5 log ");
        logger.addLogInfo("6 log ");

        logger.addLogInfo("logger hash code="+logger.toString());

        logger.getLogFile();


    }
}
