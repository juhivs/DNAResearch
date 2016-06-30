package com.mastek.TestDNA;

import java.io.IOException;

import org.biojava.nbio.structure.Bond;
import org.biojava.nbio.structure.Structure;
import org.biojava.nbio.structure.StructureException;
import org.biojava.nbio.structure.StructureIO;

public class StructureEntity {

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

        System.out.println(structure);

        System.out.println(" # of compounds (entities) " + structure.getSSBonds().size());

        for ( Bond entity: structure.getSSBonds()) {
            System.out.println("   " + entity);
        }
       


}
}
