
public class BlobDriver2 {

	//declarando variáveis do tipo Blob
		private Blob0 blob1;
		private Blob0 blob2;
		
		//Construtor da classe blob 2;
		public BlobDriver2(Blob0 blob1, Blob0 blob2)
		{
			this.blob1 = blob1;
			this.blob2 = blob2;
		}
		
		//método de teste
		public void test1()
		{
			//Define o raio do blob1 baseado no raio do blob2;
			blob1.setR(2 * blob2.getR());
			//Define a velocidade do blob2, os parametros passados são armazenados nas variáveis dx e dy;
			blob2.setVelocity(3, 4);
			//atualiza o raio e a posição do blob baseado no crescimento e na velocidade do mesmo.
			blob2.step();
			//define o crescimento do blob o parametro é armazenado na variavel dr
			blob1.setGrowth(10);
			//atualiza o raio e a posição do blob baseado no crescimento e na velocidade do mesmo.
			blob1.step();
			
			System.out.println("Blob 1: at" + blob1.getX() + " ," + "; sized" + blob2.getR());
		}
}
