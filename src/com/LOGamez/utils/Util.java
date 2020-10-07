/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.LOGamez.utils;

/**
 * @author Ghomez
 * 
 */
public class Util {
    
    
    /**Attributes*/
    
    /**border variable of StatusBar object */
    private static final String OS = System.getProperty("os.name").toUpperCase();
    
    /**border variable of StatusBar object */
    private static String OSARC = System.getProperty("os.arch").toUpperCase();
    
    /**border variable of StatusBar object */
    private static final String OSVER = System.getProperty("os.version").toUpperCase();
    
    /**border variable of StatusBar object */
    private static final String ODIR = System.getProperty("user.dir").toUpperCase();
    
    /**border variable of StatusBar object */
    private static final String ONAM = System.getProperty("user.name").toUpperCase();
    
    /**border variable of StatusBar object */
    private static final String HDIR = System.getProperty("user.home").toUpperCase();

    
    
    /**Public Protocol */
    
    
    /**
     * getOSARC()
     * 
     * @return OSARC
     */
    public static String getOSARC() {
        if(OSARC.endsWith("X86")){
            String arch = System.getenv("PROCESSOR_ARCHITECTURE");
            String wow64Arch = System.getenv("PROCESSOR_ARCHITEW6432");

            OSARC = arch.endsWith("64")
                  || wow64Arch != null && wow64Arch.endsWith("64")
                      ? "X64" : "X86";
        }
        return OSARC;
    }

    
    /**
     * getOSVER()
     * 
     * @return OSVER
     */
    public static String getOSVER() {
        return OSVER;
    }

    
    /**
     * getUserNAME()
     * 
     * @return ONAM
     */
    public static String getUserNAME() {
        return ONAM;
    }

    
    /**
     * getHomeDIR()
     * 
     * @return HDIR
     */
    public static String getHomeDIR() {
        return HDIR;
    }
    
    
    /**
     * getOSName()
     * 
     * @return OS
     */
    public static String getOSName(){
        return OS;
    }
    
    
    /**
     * isWindows()
     * 
     * @return OS.contains("WIN")
     */
    public static boolean isWindows(){
        return OS.contains("WIN");
    }
    
    
    /**
     * isMac()
     * 
     * @return OS.contains("MAC")
     */
    public static boolean isMac(){
        return OS.contains("MAC");
    }
    
    
    /**
     * isUnix()
     * 
     * @return OS.contains("NIX") || OS.contains("NUX") || OS.contains("AIX")
     */
    public static boolean isUnix(){
        return OS.contains("NIX") || OS.contains("NUX") || OS.contains("AIX");
    }

    
    /**
     * getDIR()
     * 
     * @return ODIR
     */
    public static String getDIR() {
        return ODIR;
    }
    
    
}
