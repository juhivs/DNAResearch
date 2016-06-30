package com.mastek.TestDNA;

import java.io.IOException;

import org.biojava.nbio.structure.Chain;
import org.biojava.nbio.structure.Group;
import org.biojava.nbio.structure.Structure;
import org.biojava.nbio.structure.StructureException;
import org.biojava.nbio.structure.StructureIO;
import org.biojava.nbio.structure.align.gui.jmol.StructureAlignmentJmol;

public class MSE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Structure structure = null;
		try {
			structure = StructureIO.getStructure("1A62");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (StructureException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		for (Chain chain : structure.getChains()){
		    for (Group group : chain.getAtomGroups()){
		        if ( group.getPDBName().equals("MSE") || group.getPDBName().equals("HOH")){
		            System.out.println(group.getPDBName() + " is a group of type " + group.getType());
		        }
		    }
		}
		
		
	
		
		try {

            Structure struc = StructureIO.getStructure("1A62");

            StructureAlignmentJmol jmolPanel = new StructureAlignmentJmol();

            jmolPanel.setStructure(struc);

            // send some commands to Jmol
            jmolPanel.evalString("select * ; color chain;");            
            jmolPanel.evalString("select *; spacefill off; wireframe off; cartoon on;  ");
            jmolPanel.evalString("select ligands; cartoon off; wireframe 0.3; spacefill 0.5; color cpk;");

        } catch (Exception e){
            e.printStackTrace();
        }
	}

}
