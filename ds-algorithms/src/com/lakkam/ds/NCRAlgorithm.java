package com.lakkam.ds;

/**
 * NCR algo is NCR = N!/R!*(N-R)! This is for obtaining combinations of N and
 * R..like for a,b,c,d - > NCR values are abc, abd,bcd..etc...
 * 
 * @author ranga
 *
 */
public class NCRAlgorithm {

	public static void main(String[] args) {
		int n = 4;
		int r = 4;
		System.out.println("NCR for 4 and 3 : " + findNCR(n, r));
		System.out.println("NCR for 4 and 3 : " + ncrFromPascalAlgo(n, r));

		

	}

	/**
	 * pascal algo says, we can obtain NCR value by adding its previous values
	 * recursively. For example, 4c2 can be obtained from 3c1+3c2 ncr can be
	 * obtained from (n-1)C(r-1)+(n-1)Cr
	 * 
	 * @param n
	 * @param r
	 * @return
	 */
	private static int ncrFromPascalAlgo(int n, int r) {
		if (r > n) {
			return -1;
		}
		if (r == 0 || r == n)
			return 1;
		else {
			return ncrFromPascalAlgo(n - 1, r - 1) + ncrFromPascalAlgo(n - 1, r);
		}
	}

	private static int fact(int i) {

		if (i == 0 || i == 1)
			return i;
		else {
			return fact(i - 1) * i;
		}
	}

	private static int findNCR(int n, int r) {

		// first this is as for formular, lets find out factorial of n or r

		if (r > n) {
			return -1;
		}
		if (r == 0 || r == n)
			return 1;
		else {
			int nFact = fact(n);
			System.out.println("nFact : " + nFact);
			int rFact = fact(r);
			System.out.println("rFact : " + rFact);
			int nminusrFact = fact(n - r);
			System.out.println("n-r fact : " + nminusrFact);
			return nFact / (rFact * nminusrFact);
		}

	}

}
