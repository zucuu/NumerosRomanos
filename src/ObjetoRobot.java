import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ObjetoRobot {


	boolean  PedirNuevamente = true;
	
	public void lineaHorizontal (int A){
		for (int x = 0 ; x < A ; x++){
			System.out.print("*");
		}
	}
	
	public void lineaVertical (int A){

		for (int i = 0; i < A; i++) {
			System.out.print('\n');
			for (int y = 0 ; y < A ; y ++){
			if ( y == 0 || (y+1) == A )
				System.out.print("*");
			else
				System.out.print("  ");
			}
		}
	}
	public void cuadrado(){
		lineaHorizontal (5);
		lineaVertical (5);
		System.out.println();
		lineaHorizontal (5);
	}
	public float Leer() {
		String ValorLeido = "";
		float ValorConvertido = 0;
		try { InputStreamReader io = new InputStreamReader(System.in);
			  BufferedReader leer = new BufferedReader(io);
			  ValorLeido = leer.readLine();
			  ValorConvertido = Float.parseFloat(ValorLeido);
			  PedirNuevamente = false;
			  
					
		} catch (NumberFormatException nf) {
			// TODO: handle exception
			System.out.println("Disculpe usted ha colocado un valor erróneo");
			PedirNuevamente = true;
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Ha ocurrido un error general");
			PedirNuevamente = true;
		}
			return ValorConvertido;
	}
	public String LeerTexto() {
		String ValorLeido = "";
		try { InputStreamReader io = new InputStreamReader(System.in);
			  BufferedReader leer = new BufferedReader(io);
			  ValorLeido = leer.readLine();
			  PedirNuevamente = false;
			  
					
		} catch (IOException objexcepcion) {
			// TODO: handle exception
			System.out.println("Disculpe ocurrió un error");
			PedirNuevamente = true;
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Ha ocurrido un error general");
			PedirNuevamente = true;
		}
			return ValorLeido;
	}
}