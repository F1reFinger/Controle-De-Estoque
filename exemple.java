class Main {
	int secao[10][10];

	public static void reseta () {
		for(int i = 0; i < 10; i++){
			for(int j = 0; j < 10; j++){
				secao[i][j] = 0;
			}
		}
	} 
	
	public static void SetIdPrduto(int id, int secao){
		this.secao[secao - 1][id - 1]++;
	}
	
  public static void main(String[] args) {
    System.out.println("Hello world!");
  }
}