package com.mastek.TestDNA;

import java.io.IOException;
import java.util.List;

import org.biojava.nbio.structure.Atom;
import org.biojava.nbio.structure.Chain;
import org.biojava.nbio.structure.Group;
import org.biojava.nbio.structure.Structure;
import org.biojava.nbio.structure.StructureException;
import org.biojava.nbio.structure.StructureIO;

public class Test4 {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Structure structure = null;
		try {
			structure = StructureIO.getStructure("4hhb");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (StructureException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}         

        List<Chain> chains = structure.getChains();

        System.out.println(" # chains: " + chains.size());

        for (Chain c : chains) {

            System.out.println("   Chain: " + c.getChainID() + " # groups with atoms: " + c.getAtomGroups().size());

            for (Group g: c.getAtomGroups()){

                if ( g.getPDBName().equalsIgnoreCase("HEM")) {

                    System.out.println("   " + g);

                    for (Atom a: g.getAtoms()) {

                        System.out.println("    " + a);

                    }
                }
            }
        }	
	
        
	    
	}

}
