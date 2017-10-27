package org.ipn.escom;

import javax.naming.InitialContext;

public class ClientEJB {
    
    public static void main(String args[]) throws Exception{       
     InitialContext ctx = new InitialContext();   
     HolaMundoEJB ejb = (HolaMundoEJB) ctx.lookup("org.ipn.escom.HolaMundoEJB");
     System.out.println(":: " + ejb.saludarConEJB("Eduardo Castillo"));
     
        System.out.println(":::: Fin");
    }
}