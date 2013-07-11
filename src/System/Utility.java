package System;

import java.util.Hashtable;

import jpl.Atom;
import jpl.Query;
import jpl.Term;
import jpl.Variable;

public class Utility {
    public static void main(String[] args) {
        System.out.println("Sei un coglione!!! Pasquale va' con i neri sordi...");
        System.out.println("Ricordiamoci di mantenere un contegno perche' il progetto e' pubblico");
        
        Query q1 = new Query("consult", new Term[] {new Atom("prolog.pl")} );
        q1.open();
        q1.getSolution();
        
        
        Query q2 = new Query("descendent_of",new Term[] {new Variable("X"),new Atom("joe")} );
    	
    	@SuppressWarnings("rawtypes")
		Hashtable solution;
    	//ciao
    	

    	while ( q2.hasMoreSolutions() ){
    	    solution = q2.nextSolution();
    	    System.out.println( "X = " + solution.get("X"));
    	}
        
    }

}
