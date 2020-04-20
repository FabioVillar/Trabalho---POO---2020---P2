package trabalho2;
public class PecaDama extends Pecas{
	public PecaDama(int emjogo){
		this.emjogo = emjogo;
	}
	
	public boolean AnaliseDama(Tabuleiro t, int l1, int c1, int l2, int c2) {
		boolean verif = true;
		int auxl, auxc;
		if(Math.abs(l2 - l1) != Math.abs(c2 - c1)) {
			verif = false; // é um movimento inválido
		}
		
		if(t.p[l1][c1].emjogo == 3) {//é uma dama branca
			if(l2 > l1 && c2 > c1) {// ela foi pra cima e pra direita
				auxl = l1+1;
				auxc = c1+1;
				while(auxl != l2 && auxc != c2) {
					if(t.p[auxl][auxc].emjogo == 1 || t.p[auxl][auxc].emjogo == 3) {//existe uma peça branca no meio da diagonal
						verif = false;
					}
					auxl ++;
					auxc ++;
				}
				if(verif == true) {
					auxl = l1+1;
					auxc = c1+1;
					while(auxl != l2 && auxc != c2) {
						if(t.p[auxl][auxc].emjogo == 2 || t.p[auxl][auxc].emjogo == 4) {//existe uma peça preta no meio da diagonal
							t.p[auxl][auxc] = new PecaComum(0);
							l2 = auxl + 1;
							c2 = auxc + 1;
							break;
						}
						auxl ++;
						auxc ++;
					}
					t.p[l2][c2] = t.p[l1][c1];
					t.p[l1][c1] = new PecaComum(0);
				}
			}
			
			if(l2 > l1 && c2 < c1) {// ela foi pra cima e pra esquerda
				auxl = l1+1;
				auxc = c1-1;
				while(auxl != l2 && auxc != c2) {
					if(t.p[auxl][auxc].emjogo == 1 || t.p[auxl][auxc].emjogo == 3) {//existe uma peça branca no meio da diagonal
						verif = false;
					}
					auxl ++;
					auxc --;
				}
				if(verif == true) {
					auxl = l1+1;
					auxc = c1-1;
					while(auxl != l2 && auxc != c2) {
						if(t.p[auxl][auxc].emjogo == 2 || t.p[auxl][auxc].emjogo == 4) {//existe uma peça preta no meio da diagonal
							t.p[auxl][auxc] = new PecaComum(0);
							l2 = auxl + 1;
							c2 = auxc - 1;
							break;
						}
						auxl ++;
						auxc --;
					}
					t.p[l2][c2] = t.p[l1][c1];
					t.p[l1][c1] = new PecaComum(0);
				}
			}
			
			if(l2 < l1 && c2 > c1) {// ela foi pra baixo e pra direita
				auxl = l1-1;
				auxc = c1+1;
				while(auxl != l2 && auxc != c2) {
					if(t.p[auxl][auxc].emjogo == 1 || t.p[auxl][auxc].emjogo == 3) {//existe uma peça branca no meio da diagonal
						verif = false;
					}
					auxl --;
					auxc ++;
				}
				if(verif == true) {
					auxl = l1-1;
					auxc = c1+1;
					while(auxl != l2 && auxc != c2) {
						if(t.p[auxl][auxc].emjogo == 2 || t.p[auxl][auxc].emjogo == 4) {//existe uma peça preta no meio da diagonal
							t.p[auxl][auxc] = new PecaComum(0);
							l2 = auxl - 1;
							c2 = auxc + 1;
							break;
						}
						auxl --;
						auxc ++;
					}
					t.p[l2][c2] = t.p[l1][c1];
					t.p[l1][c1] = new PecaComum(0);
				}
			}
			
			if(l2 < l1 && c2 < c1) {// ela foi pra baixo e pra esquerda
				auxl = l1-1;
				auxc = c1-1;
				while(auxl != l2 && auxc != c2) {
					if(t.p[auxl][auxc].emjogo == 1 || t.p[auxl][auxc].emjogo == 3) {//existe uma peça branca no meio da diagonal
						verif = false;
					}
					auxl --;
					auxc --;
				}
				if(verif == true) {
					auxl = l1-1;
					auxc = c1-1;
					while(auxl != l2 && auxc != c2) {
						if(t.p[auxl][auxc].emjogo == 2 || t.p[auxl][auxc].emjogo == 4) {//existe uma peça preta no meio da diagonal
							t.p[auxl][auxc] = new PecaComum(0);
							l2 = auxl - 1;
							c2 = auxc - 1;
							break;
						}
						auxl --;
						auxc --;
					}
					t.p[l2][c2] = t.p[l1][c1];
					t.p[l1][c1] = new PecaComum(0);
				}
			}
		}
		
		
		
		if(t.p[l1][c1].emjogo == 4) {//é uma dama preta
			if(l2 > l1 && c2 > c1) {// ela foi pra cima e pra direita
				auxl = l1+1;
				auxc = c1+1;
				while(auxl != l2 && auxc != c2) {
					if(t.p[auxl][auxc].emjogo == 2 || t.p[auxl][auxc].emjogo == 4) {//existe uma peça preta no meio da diagonal
						verif = false;
					}
					auxl ++;
					auxc ++;
				}
				if(verif == true) {
					auxl = l1+1;
					auxc = c1+1;
					while(auxl != l2 && auxc != c2) {
						if(t.p[auxl][auxc].emjogo == 1 || t.p[auxl][auxc].emjogo == 3) {//existe uma peça branca no meio da diagonal
							t.p[auxl][auxc] = new PecaComum(0);
							l2 = auxl + 1;
							c2 = auxc + 1;
							break;
						}
						auxl ++;
						auxc ++;
					}
					t.p[l2][c2] = t.p[l1][c1];
					t.p[l1][c1] = new PecaComum(0);
				}
			}
			
			if(l2 > l1 && c2 < c1) {// ela foi pra cima e pra esquerda
				auxl = l1+1;
				auxc = c1-1;
				while(auxl != l2 && auxc != c2) {
					if(t.p[auxl][auxc].emjogo == 2 || t.p[auxl][auxc].emjogo == 4) {//existe uma peça preta no meio da diagonal
						verif = false;
					}
					auxl ++;
					auxc --;
				}
				if(verif == true) {
					auxl = l1+1;
					auxc = c1-1;
					while(auxl != l2 && auxc != c2) {
						if(t.p[auxl][auxc].emjogo == 1 || t.p[auxl][auxc].emjogo == 3) {//existe uma peça branca no meio da diagonal
							t.p[auxl][auxc] = new PecaComum(0);
							l2 = auxl + 1;
							c2 = auxc - 1;
							break;
						}
						auxl ++;
						auxc --;
					}
					t.p[l2][c2] = t.p[l1][c1];
					t.p[l1][c1] = new PecaComum(0);
				}
			}
			
			if(l2 < l1 && c2 > c1) {// ela foi pra baixo e pra direita
				auxl = l1-1;
				auxc = c1+1;
				while(auxl != l2 && auxc != c2) {
					if(t.p[auxl][auxc].emjogo == 2 || t.p[auxl][auxc].emjogo == 4) {//existe uma peça preta no meio da diagonal
						verif = false;
					}
					auxl --;
					auxc ++;
				}
				if(verif == true) {
					auxl = l1-1;
					auxc = c1+1;
					while(auxl != l2 && auxc != c2) {
						if(t.p[auxl][auxc].emjogo == 1 || t.p[auxl][auxc].emjogo == 3) {//existe uma peça branca no meio da diagonal
							t.p[auxl][auxc] = new PecaComum(0);
							l2 = auxl - 1;
							c2 = auxc + 1;
							break;
						}
						auxl --;
						auxc ++;
					}
					t.p[l2][c2] = t.p[l1][c1];
					t.p[l1][c1] = new PecaComum(0);
				}
			}
			
			if(l2 < l1 && c2 < c1) {// ela foi pra baixo e pra esquerda
				auxl = l1-1;
				auxc = c1-1;
				while(auxl != l2 && auxc != c2) {
					if(t.p[auxl][auxc].emjogo == 2 || t.p[auxl][auxc].emjogo == 4) {//existe uma peça preta no meio da diagonal
						verif = false;
					}
					auxl --;
					auxc --;
				}
				if(verif == true) {
					auxl = l1-1;
					auxc = c1-1;
					while(auxl != l2 && auxc != c2) {
						if(t.p[auxl][auxc].emjogo == 1 || t.p[auxl][auxc].emjogo == 3) {//existe uma peça branca no meio da diagonal
							t.p[auxl][auxc] = new PecaComum(0);
							l2 = auxl - 1;
							c2 = auxc - 1;
							break;
						}
						auxl --;
						auxc --;
					}
					t.p[l2][c2] = t.p[l1][c1];
					t.p[l1][c1] = new PecaComum(0);
				}
			}
		}
		
		return verif;
    }	
}