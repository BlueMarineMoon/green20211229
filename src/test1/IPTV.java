package test1;


public class IPTV extends ColorTV {
	private int resolution;
	private String add;
	
	IPTV(String add,int size, int resolution) {
		super(size,resolution);
		this.add = add;
		this.resolution = resolution;
	}
	
	public void printProperty() {
		System.out.println("나의 IPTV는 " + add + " 주소의 " + getSize() + "인치 " + resolution + "컬러");
	}
	

	public static void main(String[] args) {
		IPTV iptv = new IPTV("192.1.1.2", 32, 2048); // "192.1.1.2" 주소에 32인치, 2048 컬러
		iptv.printProperty();
	}

	
}

