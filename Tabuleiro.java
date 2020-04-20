package trabalho2;
public class Tabuleiro {
    Pecas p[][] = new Pecas[8][8];
    //o primeiro numero da matriz indica a linha e o segundo, a coluna
    public Tabuleiro(){
        this.p[0][0] = new PecaComum(1); 
        this.p[0][1] = new PecaComum(0); 
        this.p[0][2] = new PecaComum(1);
        this.p[0][3] = new PecaComum(0); 
        this.p[0][4] = new PecaComum(1);
        this.p[0][5] = new PecaComum(0); 
        this.p[0][6] = new PecaComum(1);
        this.p[0][7] = new PecaComum(0); 
        
        this.p[1][0] = new PecaComum(0); 
        this.p[1][1] = new PecaComum(1);
        this.p[1][2] = new PecaComum(0); 
        this.p[1][3] = new PecaComum(1);
        this.p[1][4] = new PecaComum(0); 
        this.p[1][5] = new PecaComum(1);
        this.p[1][6] = new PecaComum(0); 
        this.p[1][7] = new PecaComum(1);
        
        this.p[2][0] = new PecaComum(1);
        this.p[2][1] = new PecaComum(0);  
        this.p[2][2] = new PecaComum(1);
        this.p[2][3] = new PecaComum(0);  
        this.p[2][4] = new PecaComum(1);
        this.p[2][5] = new PecaComum(0); 
        this.p[2][6] = new PecaComum(1);
        this.p[2][7] = new PecaComum(0); 
        
        this.p[3][0] = new PecaComum(0);  
        this.p[3][1] = new PecaComum(0); 
        this.p[3][2] = new PecaComum(0);  
        this.p[3][3] = new PecaComum(0); 
        this.p[3][4] = new PecaComum(0); 
        this.p[3][5] = new PecaComum(0); 
        this.p[3][6] = new PecaComum(0); 
        this.p[3][7] = new PecaComum(0); 
        
        this.p[4][0] = new PecaComum(0);  
        this.p[4][1] = new PecaComum(0); 
        this.p[4][2] = new PecaComum(0);  
        this.p[4][3] = new PecaComum(0); 
        this.p[4][4] = new PecaComum(0); 
        this.p[4][5] = new PecaComum(0); 
        this.p[4][6] = new PecaComum(0); 
        this.p[4][7] = new PecaComum(0); 
        
        this.p[5][0] = new PecaComum(0); 
        this.p[5][1] = new PecaComum(2);
        this.p[5][2] = new PecaComum(0); 
        this.p[5][3] = new PecaComum(2);
        this.p[5][4] = new PecaComum(0);  
        this.p[5][5] = new PecaComum(2);
        this.p[5][6] = new PecaComum(0); 
        this.p[5][7] = new PecaComum(2);
        
        this.p[6][0] = new PecaComum(2); 
        this.p[6][1] = new PecaComum(0); 
        this.p[6][2] = new PecaComum(2);
        this.p[6][3] = new PecaComum(0); 
        this.p[6][4] = new PecaComum(2);
        this.p[6][5] = new PecaComum(0); 
        this.p[6][6] = new PecaComum(2);
        this.p[6][7] = new PecaComum(0); 
        
        this.p[7][0] = new PecaComum(0); 
        this.p[7][1] = new PecaComum(2);
        this.p[7][2] = new PecaComum(0); 
        this.p[7][3] = new PecaComum(2);
        this.p[7][4] = new PecaComum(0);  
        this.p[7][5] = new PecaComum(2);
        this.p[7][6] = new PecaComum(0); 
        this.p[7][7] = new PecaComum(2);
        
    }
    void imprimirtabuleiro(){
        int linha = 7, coluna = 0;
        while(linha >= 0){
        		if(linha == 7){
        			System.out.print("8 ");
        		}
                if(linha == 6){
                    System.out.print("7 ");
                 }
                if(linha == 5){
                    System.out.print("6 ");
                 }
                if(linha == 4){
                    System.out.print("5 ");
                 }
                if(linha == 3){
                    System.out.print("4 ");
                 }
                if(linha == 2){
                    System.out.print("3 ");
                 }
                if(linha == 1){
                    System.out.print("2 ");
                 }
                if(linha == 0){
                    System.out.print("1 ");
                 }
                while(coluna <= 7){
                    System.out.print(this.p[linha][coluna].checar());
                    coluna ++;
                    System.out.print(" ");
                }
                System.out.print("\n");
                coluna = 0;
                linha --;
        }
        System.out.println("  a b c d e f g h");   
    }
}
