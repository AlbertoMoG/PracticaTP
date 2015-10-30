package Main;

public class Superficie {
	//ATRIBUTOS
	private Celula[][] superficieCell;
	private int filas;
	private int columnas;
	
	//CONSTRUCTORAS
	public Superficie (int nf, int nc){
		this.filas = nf;
		this.columnas=nc;
		this.superficieCell = new Celula[this.filas][this.columnas];
		
		for (int i = 0; i <= nf; i++){//FILAS
			for (int j=0; j<= nc; j++){//COLUMNAS
				this.superficieCell[i][j]=null;
			}
		}
	}
	
	//METODOS
	//generarCelula SIN SENTIDO por createCell de Mundo??
	public void generaCelula(int f, int c){
		this.superficieCell[f][c]=new Celula();		
	}
	
	public Celula[][] getCelula(){
		return superficieCell;
	}
	
//Devuelve True si vacio, False si celula
	public boolean casillaVacia(int k, int n) {
		boolean vacia = false;
		if(this.superficieCell[k][n] == null ){
			vacia = true;
		}
		return vacia;
	}
}
