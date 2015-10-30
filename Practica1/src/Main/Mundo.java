package Main;

public class Mundo {

	private Superficie superficie;
	
	
	public Mundo(){
		this.superficie = new Superficie(Constantes.NUM_FILAS, Constantes.NUM_COLUMNAS);
		this.iniciarMundo();
			
	}
	
	private void iniciarMundo() {
		int numcelulas = 0;
		int fila = (int)(Math.random()*(Constantes.NUM_FILAS));
		int col = (int)(Math.random()*(Constantes.NUM_COLUMNAS));
		
		while(numcelulas <= Constantes.NUM_CELULAS){
			if(this.superficie.casillaVacia(fila,col)){
				this.superficie.generaCelula(fila, col);
				//this.superficie.createCell(fila, col);
				numcelulas++;
			}
		fila = (int)(Math.random()*Constantes.NUM_FILAS);
		col = (int)(Math.random()*Constantes.NUM_COLUMNAS);	
		}
		
	}
	
	public void evoluciona(){
		
	}

	//Crea celula en un espacio vacio. REVISAR!
	public Boolean createCell(int f, int c){
		boolean correcto = false;
		if(this.superficie.casillaVacia(f,c)){
			this.superficie.generaCelula(f, c);
			correcto = true;
		}
		return correcto;
	}
	//REVISAR!
	public Boolean killCell(int f, int c){
		boolean correcto = true;
		
		return correcto;
	}
	


}
