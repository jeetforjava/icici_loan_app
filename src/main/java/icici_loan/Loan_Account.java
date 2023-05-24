package icici_loan;

public class Loan_Account {
		String account;
		public static void main(String[] args) {
			System.out.println("Housing loan account");
		}
<<<<<<< Updated upstream
		int principal;
=======
		int InterestCal(int I,int P, int N, int R) {
			I=P*N*R/100;
			return I; 
		}
		int Loan_Due(int I,int P) {
			int P1=P-I;
			return P1; 
		}
>>>>>>> Stashed changes
}
