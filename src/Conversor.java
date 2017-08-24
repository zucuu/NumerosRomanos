
public class Conversor {
	public static void main(String[] args) {
		
		int numero = 0;
		ObjetoRobot obj = new ObjetoRobot();
		
		while (obj.PedirNuevamente){
			System.out.println("Ingrese un número del 1 al 3999.");
			numero = (int)obj.Leer();
						
			if (!obj.PedirNuevamente){
				if (numero < 1 || numero > 3999) {
					System.out.println("El número debe ser mayor a 1 y menor 3999.");
					obj.PedirNuevamente = true;
				}
			}						
		}
		
		System.out.println("El número romano es: " + convertirANumerosRomanos(numero));
	}
	
	public static String convertirANumerosRomanos(int nro) {
		String rta = "";
		int mil, centena, decena, unidad;
						
		mil = nro / 1000;
		centena = (nro - (mil*1000)) / 100;
		decena = (nro - (mil*1000) - (centena*100)) / 10;
		unidad = (nro - (mil*1000) - (centena*100) - (decena*10));
		
		if (mil > 0 ){
			for (int i = 0; i < mil; i++) {
				rta += "M";
			}
		}
		
		if (centena > 0){
			switch (centena) {
			case 1:
			case 2:
			case 3:
				for (int i = 0; i < centena; i++) {
					rta += "C";
				}
				break;
			case 4 :
				rta += "CD";
				break;
			case 5:
				rta += "D";
				break;
			case 6:
			case 7:
			case 8:
				rta += "D";
				for (int i = 5; i < centena; i++) {
					rta += "C";
				}
				break;
			case 9:
				rta += "CM";
				break;
			}
		}
		
		if (decena > 0){
			switch (decena) {
			case 1:
			case 2:
			case 3:
				for (int i = 0; i < decena; i++) {
					rta += "X";
				}
				break;
			case 4 :
				rta += "XL";
				break;
			case 5:
				rta += "L";
				break;
			case 6:
			case 7:
			case 8:
				rta += "L";
				for (int i = 5; i < decena; i++) {
					rta += "X";
				}
				break;
			case 9:
				rta += "XC";
				break;
			}
		}
		
		if (unidad > 0){
			switch (unidad) {
			case 1:
			case 2:
			case 3:
				for (int i = 0; i < unidad; i++) {
					rta += "I";
				}
				break;
			case 4 :
				rta += "IV";
				break;
			case 5:
				rta += "V";
				break;
			case 6:
			case 7:
			case 8:
				rta += "V";
				for (int i = 5; i < unidad; i++) {
					rta += "I";
				}
				break;
			case 9:
				rta += "IX";
				break;
			}
		}
		return rta;
	}
}

