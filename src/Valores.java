
public class Valores implements ValoresITF{
	private int array[] = new int[10];

	public boolean ins(int v) {

		if (v > 0) {

			for (int i = 0; i < array.length; i++) {
				if (array[i] == 0) {
					array[i] = v;
					return true;
				}
			}

		}
		return false;
	}

	public int del(int i) {
		int aux = 0;
		boolean flag =false;
		for (int j = 0; j < array.length; j++) {
			if (array[i] !=0) {
				flag =true;
			}

		}
		if(flag=true) {
			if (i >= 0 && i <= 9) {
				aux = array[i];
				array[i] = 0;
			} else {
				return -1;

		}

		return aux;
		}else {
			return -1;
		}
	}
	public int size() {
		int cont =0;
	
		for (int i = 0; i < array.length; i++) {
			if(array[i]!=0) {
				cont = cont +1;
			}
		}
		return cont;

	}

}
