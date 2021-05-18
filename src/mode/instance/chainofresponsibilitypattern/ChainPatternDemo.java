package mode.instance.chainofresponsibilitypattern;

public class ChainPatternDemo {
    private static AbstractLogger getChainOfLogger(){
        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
        AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);

        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);

        return errorLogger;
    }
    public static  void main(String[] args){
        AbstractLogger loggerChain = getChainOfLogger();

        loggerChain.logMassage(AbstractLogger.INFO,"This is an information.");

        loggerChain.logMassage(AbstractLogger.DEBUG,"This is a debug level information.");

        loggerChain.logMassage(AbstractLogger.ERROR,"This is an error information.");
    }
}
