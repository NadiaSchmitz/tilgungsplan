import Prog1Tools.IOTools;

import java.text.DecimalFormat;

public class Kredit {

	public static void main(String[] args) {
		
		int jahr, laufzeit;
		double kreditbeitrag, zinssatz, zinsen, kredit, rate, restzahlung;
		
		DecimalFormat df = new DecimalFormat("###.##");
		
		kreditbeitrag = IOTools.readDouble("Geben Sie den Kreditbeitrag ein: ");
		zinssatz = IOTools.readDouble("Geben Sie den Zinsensatz ein: ");
		laufzeit = IOTools.readInteger("Geben Sie die Laufzeit ein: "); 
		kredit = kreditbeitrag / laufzeit;
		restzahlung = kreditbeitrag;
		
		System.out.println();
		System.out.println("---------------------------------------------------------------");
		System.out.println("                       TILGUNGSPLAN");
		System.out.println("---------------------------------------------------------------");
		System.out.println("   Jahr   " + "    Kredit    " + "  Zinsen  " + "    Rate    " + "  Restzahlung  ");
		System.out.println("---------------------------------------------------------------");
		
		for (jahr = 2021; jahr < 2021 + laufzeit; jahr ++) {
			
			
			zinsen = restzahlung * zinssatz / 100;
			restzahlung = restzahlung - kredit;
			rate = kredit + zinsen;
			System.out.println("   " + jahr + "       " + df.format(kredit) + "        " + df.format(zinsen) + "         " + df.format(rate) + "      " + df.format(restzahlung));
			
		}
	}
}
