package trabalho2;
import java.util.Objects;
public class Movimentacao{
    Tabuleiro t;
    String vetor[];
    static int tamanho;
    static int jogadas = 0;
    int numerizarcoluna(String c){
    	if(Objects.equals(c,"a") == true) {
    		return 0;
    	}
    	if(Objects.equals(c,"b") == true) {
    		return 1;
    	}
    	if(Objects.equals(c,"c") == true) {
    		return 2;
    	}
    	if(Objects.equals(c,"d") == true) {
    		return 3;
    	}
    	if(Objects.equals(c,"e") == true) {
    		return 4;
    	}
    	if(Objects.equals(c,"f") == true) {
    		return 5;
    	}
    	if(Objects.equals(c,"g") == true) {
    		return 6;
    	}
    	if(Objects.equals(c,"h") == true) {
    		return 7;
    	}
    	return -1;
    }
    Movimentacao(Tabuleiro t, String vetor[]){
        this.t = t;
        this.vetor = vetor;
        String comando = vetor[jogadas];
        String mov[] = comando.split(":");
        String ci = mov[0].substring(0,1);
        String li = mov[0].substring(1,2);
        String cf = mov[1].substring(0,1);
        String lf = mov[1].substring(1,2);
        int l1 = Integer.parseInt(li) - 1;
        int l2 = Integer.parseInt(lf) - 1;
        int c1 = numerizarcoluna(ci);
        int c2 = numerizarcoluna(cf);
        Boolean verif = true;
        //Hora de analisar o movimento da peça  
        if(t.p[l1][c1].emjogo != 0 && t.p[l2][c2].emjogo == 0){// a casa inicial nao pode estar vazia, e a final deve estar
        	//Primeira etapa: analisar se o movimento condiz com o tipo de peça
        	if(t.p[l1][c1].emjogo == 1 || t.p[l1][c1].emjogo == 2){ //é uma peça comum
        		verif = ((PecaComum) t.p[l1][c1]).AnaliseComum(t,l1,c1,l2,c2);
        	}
        	else if(t.p[l1][c1].emjogo == 3 || t.p[l1][c1].emjogo == 4) { // é uma dama
        		verif = ((PecaDama) t.p[l1][c1]).AnaliseDama(t,l1,c1,l2,c2);
        	}
        	if(verif == true){
        		System.out.println("\nSource: "+mov[0]);
		        System.out.println("Target: "+mov[1]);
		        t.imprimirtabuleiro();
        	}
        }
        jogadas ++;
    }
}
