package com.java.agent;

import java.lang.instrument.Instrumentation;
//com.java.agent.JavaAgentTest
public class JavaAgentTest {
	
	 public static void premain(String agentArgument, 
	            Instrumentation instrumentation) { 
	        System.out.println("Test Java Agent"); 
	    } 
	 
}
