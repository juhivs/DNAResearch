package com.mastek.TestDNA;

import org.biojava.nbio.structure.Structure;
import org.biojava.nbio.structure.StructureIO;
import org.biojava.nbio.structure.StructureTools;

public class BacteriophageProteinCapsid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  try {
              Structure structure = StructureIO.getStructure("1GAV");
              // and let's print out how many atoms are in this structure
              System.out.println(StructureTools.getNrGroups(structure));
      } catch (Exception e){
              e.printStackTrace();
      }
		
	
        
	}

}
