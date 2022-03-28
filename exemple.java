class Main {
	int secao[][];
	
	public void SetIdPrduto(int id, int secao){
		this.secao[secao - 1][id - 1]++;
	}
	
  public static void main(String[] args) {
    System.out.println("Hello world!");
  }
}