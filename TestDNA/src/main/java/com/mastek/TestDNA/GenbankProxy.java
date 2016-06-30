package com.mastek.TestDNA;

import java.io.IOException;

import org.biojava.nbio.core.exceptions.CompoundNotFoundException;
import org.biojava.nbio.core.sequence.DNASequence;
import org.biojava.nbio.core.sequence.ProteinSequence;
import org.biojava.nbio.core.sequence.compound.AminoAcidCompound;
import org.biojava.nbio.core.sequence.compound.AminoAcidCompoundSet;
import org.biojava.nbio.core.sequence.compound.DNACompoundSet;
import org.biojava.nbio.core.sequence.compound.NucleotideCompound;
import org.biojava.nbio.core.sequence.loader.GenbankProxySequenceReader;

public class GenbankProxy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GenbankProxySequenceReader<AminoAcidCompound> genbankProteinReader = null;
		try {
			genbankProteinReader = new GenbankProxySequenceReader<AminoAcidCompound>("/tmp", "NP_000257",
			    AminoAcidCompoundSet.getAminoAcidCompoundSet());
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (CompoundNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
			ProteinSequence proteinSequence = new ProteinSequence(genbankProteinReader);
			genbankProteinReader.getHeaderParser().parseHeader(
			    genbankProteinReader.getHeader(), proteinSequence);
			System.out.format("Sequence(%s,%d)=%s...",
			    proteinSequence.getAccession(),
			    proteinSequence.getLength(),
			    proteinSequence.getSequenceAsString().substring(0, 10));

			GenbankProxySequenceReader<NucleotideCompound> genbankDNAReader = null;
			try {
				genbankDNAReader = new GenbankProxySequenceReader<NucleotideCompound>("/tmp", "NM_001126",
			        DNACompoundSet.getDNACompoundSet());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (CompoundNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			DNASequence dnaSequence = new DNASequence(genbankDNAReader);
			genbankDNAReader.getHeaderParser().parseHeader(genbankDNAReader.getHeader(), dnaSequence);
			System.out.format("Sequence(%s,%d)=%s...", dnaSequence.getAccession(),
			    dnaSequence.getLength(),
			    dnaSequence.getSequenceAsString().substring(0, 10));

	}

}
