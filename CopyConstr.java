
public class CopyConstr {
	public static void main(String[] args) {
		Data data = new Data(10,20);
		data.show();
	}

}

class Data {
	int data1,d1;
	int data2,d2;
	
	public Data(int a,int b) {
		data1=a;
		data2=b;
	}
	public Data(Data obj) {
		d1=obj.data1;
		d2=obj.data2;
	}
	void show() {
		System.out.println("Data 1-"+d1);
		System.out.println("Data 2-"+d2);
	}
}

