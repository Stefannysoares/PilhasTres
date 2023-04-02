package controller;
import br.edu.fateczl.pilhaI.pilhaInt;
public class PilhaController {

	public PilhaController() {
		super();
	}
	
	public static void carrega (int vet[]) {
		pilhaInt p = new pilhaInt();
		int t = vet.length;
		int a = 0;
		int b = 0;
		
		for (int i = 0; i < t; i ++) {
			if (vet[i]>=0) {
				p.push(vet[i]);
			}
			else {
				try {
					a = p.pop();
					b = p.pop();
				}catch (Exception e) {
					e.printStackTrace();
				}
				p.push(vet[i]);
				p.push(a+b);
			
			}
		}
		
		p.mostra(p);
		
	}

}
