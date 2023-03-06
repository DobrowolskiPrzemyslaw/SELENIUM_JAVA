package przyklady.logi;//package Logi;
//
//import org.testng.annotations.Test;
//import org.testng.log4testng.Logger;
//
//import java.util.logging.LogManager;
//
//// Od najniszego do najwyzszego priorytetuÓ
//public class LogiSout2 {
//
//    @Test(priority = 2)
//    public void test(){
//        logger.info("Info");
//        logger.error("Error");
//        logger.warn("Warn");
//        logger.debug("Debug");
//        logger.fatal("Fatal");
//        logger.trace("Trace");
//    }
//    // jesli poziom logowanie bedzie na trace to wypisze wszystkie
//    // jesli poziom logowanie bedzie na debug to wypisze info, error, warn, fatal, debug
//    // TODO jesli poziom logowanie bedzie na info to wypisze info, error, warn, fatal
//    // jesli poziom logowanie bedzie na warn to wypisze tylko fatal, error, warn
//    // TODO jesli poziom logowanie bedzie na error to wypisze tylko fatal, error
//    // jesli poziom logowanie bedzie na fatal to wypisze tylko fatal
//}
