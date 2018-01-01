package com.gvnavin.log.log4j;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.config.Configurator;

//http://javarevisited.blogspot.in/2013/08/why-use-sl4j-over-log4j-for-logging-in.html
public class Log4j2MainTest {
    
    public static void main(String[] args) {
        
        Configurator.setLevel("com.gvnavin", Level.ALL);
        
        // Log4j2
        //private static final org.apache.logging.log4j.Logger log = org.apache.logging.log4j.LogManager.getLogger(LogExample.class);
        
        Logger logger = LogManager.getLogger(Log4j2MainTest.class);
        final int runtimeInt = 10;
        final String runtimeString = "test logging";
    
        final Exception exception = new Exception("");
    
        logger.trace(
            "NET :: JournalDev :: LEVEL :: NetJournalDevApp ERROR Message :: param1 - {}, param2 - {}, param3 - {}",
            runtimeInt,
            runtimeString,
            runtimeInt,
            exception);
    
        logger.trace(
            "NET :: JournalDev :: LEVEL :: NetJournalDevApp ERROR Message :: param1 - {}, param2 - {}, param3 - {}",
            runtimeInt,
            runtimeString,
            exception);
    
        logger.trace(
            "NET :: JournalDev :: LEVEL :: NetJournalDevApp ERROR Message",
            exception);
    
        logger.trace(
            "NET :: JournalDev :: LEVEL :: NetJournalDevApp ERROR Message {}");
        
    }
}
