package com.mastek.TestDNA;

import java.io.File;
import java.io.IOException;

import org.biojava.nbio.genome.parsers.twobit.TwoBitParser;

public class Karyotype {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		File f = new File("/path/to/file.2bit");
		
		TwoBitParser p = null;
		try {
			p = new TwoBitParser(f);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		String[] names = p.getSequenceNames();
		for(int i=0;i<names.length;i++) {
		  try {
			p.setCurrentSequence(names[i]);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  try {
			p.printFastaSequence();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  try {
			p.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}

}
