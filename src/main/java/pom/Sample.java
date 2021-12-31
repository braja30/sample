package pom;

public class Sample {
	public static void main(String[] args) {
		int a[]= {0,1,2,3,10,5,9};
		int num;
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if(a[i]>a[j]) {
					num=a[i];
					a[i]=a[j];
					a[j]=num;	
			}	
			}	
		}
		for (int j = 0; j < a.length; j++) {
			System.out.println("Asyning order"+a[j]);
		}
		
	}

}
