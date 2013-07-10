package System;

import java.util.Hashtable;

import jpl.Atom;
import jpl.Query;
import jpl.Term;
import jpl.Variable;

public class utility {
    public static void main(String[] args) {
        System.out.println("Sei un coglione!!! Vincenzo v� con i neri sordi..."); // Display the string.
        
        Query q1 = new Query("consult", new Term[] {new Atom("prolog.pl")} );
        q1.open();
        q1.getSolution();
        
        
        Query q2 = new Query("descendent_of",new Term[] {new Variable("X"),new Atom("joe")} );
    	
    	Hashtable solution;
    	

    	while ( q2.hasMoreSolutions() ){
    	    solution = q2.nextSolution();
    	    System.out.println( "X = " + solution.get("X"));
    	}
        
    }

}
