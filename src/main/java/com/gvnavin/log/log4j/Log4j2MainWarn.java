package com.gvnavin.log.log4j;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.config.Configurator;

//http://javarevisited.blogspot.in/2013/08/why-use-sl4j-over-log4j-for-logging-in.html
public class Log4j2MainWarn {
    
    public static void main(String[] args) {
        
        /*
        
        FINEST -> TRACE
        FINER -> DEBUG
        FINE -> DEBUG
        INFO -> INFO
        WARNING -> WARN
        SEVERE -> ERROR
        
        Standard Level	intLevel
        ALL	Integer.MAX_VALUE
        TRACE	600
        DEBUG	500
        INFO	400
        WARN	300
        ERROR	200
        FATAL	100
        OFF	0
        
         */
    
        Configurator.setLevel("com.gvnavin", Level.WARN);
        
        // Log4j2
        //private static final org.apache.logging.log4j.Logger log = org.apache.logging.log4j.LogManager.getLogger(LogExample.class);
        
        Logger logger = LogManager.getLogger(Log4j2MainWarn.class);
        final int runtimeInt = 10;
        final String runtimeString = "test logging";
    
        logger.trace("NET :: JournalDev :: LEVEL :: NetJournalDevApp ERROR Message ::{}, {}, {}",
            runtimeInt,
            runtimeString,
            runtimeInt);
        logger.debug("NET :: JournalDev :: LEVEL :: NetJournalDevApp ERROR Message ::{}, {}, {}",
            runtimeInt,
            runtimeString,
            runtimeInt);
        logger.info("NET :: JournalDev :: LEVEL :: NetJournalDevApp ERROR Message ::{}, {}, {}",
            runtimeInt,
            runtimeString,
            runtimeInt);
        logger.warn("NET :: JournalDev :: LEVEL :: NetJournalDevApp ERROR Message ::{}, {}, {}",
            runtimeInt,
            runtimeString,
            runtimeInt);
        logger.error("NET :: JournalDev :: LEVEL :: NetJournalDevApp ERROR Message ::{}, {}, {}",
            runtimeInt,
            runtimeString,
            runtimeInt);
        logger.fatal("NET :: JournalDev :: LEVEL :: NetJournalDevApp ERROR Message ::{}, {}, {}",
            runtimeInt,
            runtimeString,
            runtimeInt);
        
    }
}
