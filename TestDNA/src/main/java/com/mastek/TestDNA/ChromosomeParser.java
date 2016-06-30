package com.mastek.TestDNA;

import java.util.List;

import org.biojava.nbio.genome.parsers.genename.GeneChromosomePosition;
import org.biojava.nbio.genome.parsers.genename.GeneChromosomePositionParser;


public class ChromosomeParser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		

		 try {

	            List<GeneChromosomePosition> genePositions= GeneChromosomePositionParser.getChromosomeMappings();
	            System.out.println("got " + genePositions.size() + " gene positions") ;

	            for (GeneChromosomePosition pos : genePositions){
	                if ( pos.getGeneName().equals("FOLH1")) {
	                    System.out.println(pos);
	                    break;
	                }
	            }

	        } catch(Exception e){
	            e.printStackTrace();
	        }
	}

}
