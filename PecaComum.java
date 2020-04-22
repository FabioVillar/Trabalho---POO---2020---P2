package trabalho2;
public class PecaComum extends Pecas{
	public PecaComum(int emjogo){
		this.emjogo = emjogo;
	}
	public boolean AnaliseComum(Tabuleiro t, int l1, int c1, int l2, int c2) {
		boolean verif = true;
		if(((Math.abs(l2 - l1) != 1 && Math.abs(c2 - c1) != 1) &&  (Math.abs(l2 - l1) != 2 &&  Math.abs(c2 - c1) != 2)) || (Math.abs(l2 - l1) != Math.abs(c2 - c1))){
			verif = false;
		}
		if(Math.abs(l2 - l1) == 2 && Math.abs(c2 - c1) == 2) {//Vai haver uma captura
			if(t.p[l1][c1].emjogo == 1) {//é uma peça branca
						if(l2>l1 && c2>c1) {//foi pra cima e pra direita
							if(t.p[l1+1][c1+1].emjogo == 0 || t.p[l1+1][c1+1].emjogo == 1 || t.p[l1+1][c1+1].emjogo == 3) {
								verif = false;
							}
							else {
								t.p[l1+1][c1+1].emjogo = 0;
								t.p[l2][c2] = t.p[l1][c1];
								CheckDama(t,l2,c2);
								t.p[l1][c1] = new PecaComum(0);
							}
						}
						if(l2>l1 && c2<c1) {//foi pra cima e pra esquerda
							if(t.p[l1+1][c1-1].emjogo == 0 || t.p[l1+1][c1-1].emjogo == 1 || t.p[l1+1][c1-1].emjogo == 3) {
								verif = false;
							}
							else {
								t.p[l1+1][c1-1].emjogo = 0;
								t.p[l2][c2] = t.p[l1][c1];
								CheckDama(t,l2,c2);
								t.p[l1][c1] = new PecaComum(0);
							}
						}
						if(l2<l1 && c2>c1) {//foi pra baixo e pra direita
							if(t.p[l1-1][c1+1].emjogo == 0 || t.p[l1-1][c1+1].emjogo == 1 || t.p[l1-1][c1+1].emjogo == 3) {
								verif = false;
							}
							else {
								t.p[l1-1][c1+1].emjogo = 0;
								t.p[l2][c2] = t.p[l1][c1];
								CheckDama(t,l2,c2);
								t.p[l1][c1] = new PecaComum(0);
							}
						}
						
						if(l2<l1 && c2<c1) {//foi pra baixo e pra esquerda
							if(t.p[l1-1][c1-1].emjogo == 0 || t.p[l1-1][c1-1].emjogo == 1 || t.p[l1-1][c1-1].emjogo == 3) {
								verif = false;
							}
							else {
								t.p[l1-1][c1-1].emjogo = 0;
								t.p[l2][c2] = t.p[l1][c1];
								CheckDama(t,l2,c2);
								t.p[l1][c1] = new PecaComum(0);
							}
						}
			}
			if(t.p[l1][c1].emjogo == 2) {//é uma peça preta
						if(l2>l1 && c2>c1) {//foi pra cima e pra direita
							if(t.p[l1+1][c1+1].emjogo == 0 || t.p[l1+1][c1+1].emjogo == 2 || t.p[l1+1][c1+1].emjogo == 4) {
								verif = false;
							}
							else
								t.p[l1+1][c1+1].emjogo = 0;
								t.p[l2][c2] = t.p[l1][c1];
								CheckDama(t,l2,c2);
								t.p[l1][c1] = new PecaComum(0);
						}
						
						if(l2>l1 && c2<c1) {//foi pra cima e pra esquerda
							if(t.p[l1+1][c1-1].emjogo == 0 || t.p[l1+1][c1-1].emjogo == 2 || t.p[l1+1][c1-1].emjogo == 4) {
								verif = false;
							}
							else
								t.p[l1+1][c1-1].emjogo = 0;
								t.p[l2][c2] = t.p[l1][c1];
								CheckDama(t,l2,c2);
								t.p[l1][c1] = new PecaComum(0);
						}
						
						if(l2<l1 && c2>c1) {//foi pra baixo e pra direita
							if(t.p[l1-1][c1+1].emjogo == 0 || t.p[l1-1][c1+1].emjogo == 2 || t.p[l1-1][c1+1].emjogo == 4) {
								verif = false;
							}
							else
								t.p[l1-1][c1+1].emjogo = 0;
								t.p[l2][c2] = t.p[l1][c1];
								CheckDama(t,l2,c2);
								t.p[l1][c1] = new PecaComum(0);
						}
						
						if(l2<l1 && c2<c1) {//foi pra baixo e pra esquerda
							if(t.p[l1-1][c1-1].emjogo == 0 || t.p[l1-1][c1-1].emjogo == 2 || t.p[l1-1][c1-1].emjogo == 4) {
								verif = false;
							}
							else {
								t.p[l1-1][c1-1].emjogo = 0;
								t.p[l2][c2] = t.p[l1][c1];
								CheckDama(t,l2,c2);
								t.p[l1][c1] = new PecaComum(0);
							}
						}
			}
		}
		
		else {//Nao vai haver captura
			if(t.p[l1][c1].emjogo == 1) { // é uma peça branca
				if(l2<l1) {
					verif = false;
				}
				else if(l2>l1 && verif == true){
					t.p[l2][c2] = t.p[l1][c1];
					t.p[l1][c1] = new PecaComum(0);
					CheckDama(t,l2,c2);
				}
			}
			if(t.p[l1][c1].emjogo == 2) { // é uma peça preta
				if(l1<l2) {
					verif = false;
				}
				else if(l1>l2 && verif == true){
					t.p[l2][c2] = t.p[l1][c1];
					t.p[l1][c1] = new PecaComum(0);
					CheckDama(t,l2,c2);
				}
			}
		}
		return verif;
    }
}