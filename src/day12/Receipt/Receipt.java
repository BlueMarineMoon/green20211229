package day12.Receipt;

public class Receipt {
	String name;
	int danga;
	int ea;
	double bugase = 1.1;
	
	public Receipt() {
		
	}
	
	public Receipt(String n, int d, int e) {
		name = n;
		danga = d;
		ea = e;
	}
	public int price() {
		return danga * ea;
	}
	public int gong(int total) {
		return(int)(total / bugase);
	}
	public int bugase(int total, int gong) {
		return total-gong;
	}
	public int chungu(int gong, int bugase) {
		return gong + bugase;
	}
}
