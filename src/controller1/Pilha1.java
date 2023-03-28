package controller1;

import br.edu.fateczl.pilhaint.Pilha;

public class Pilha1 {

	public Pilha1() {
		super();

	}

	public void ExercA() {
		Pilha p = new Pilha();
		for(int i=0 ; i<10 ; i++) {
			if(i % 2 == 0) {
				p.push(i*i);
			}else {
				if(i <= 5) {
					p.push(i);
				}else {
					try {
						p.pop();
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
				try {
					p.top();
					System.out.println(p.size());
				} catch (Exception e) {
					e.printStackTrace();
				}
				p.size(); 
			}
		}
		
	}

	public void ExercB() {
		Pilha p = new Pilha();
		for(int i=100 ; i<115 ; i++) {
			if(i % 2 == 0) {
				p.push(i+100);
			}else {
				if(p.size() <= 4) {
					p.push(i+50);
				}else {
					try {
						p.pop();
						
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
				try {
					p.top();
					System.out.println(p.size());
				} catch (Exception e) {
					e.printStackTrace();
				}
				p.size(); 
			}
		}
		
	}
	
}
