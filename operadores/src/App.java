public class App {
    public static void main(String[] args) throws Exception {
        
        int x = 9;
        int y = 2;

        int soma = x + y;
        int subtracao = x - y;
        int multiplicacao = x * y;
        int divisao = x / y;
        int modulo = x % y; 
         
        System.out.println("O resultado da adição é: " + soma);
        System.out.println("O resultado da subtração é: "+ subtracao);
        System.out.println("O resultado da multiplicação é: " + multiplicacao);
        System.out.println("O resultado da divisão é: "+ divisao);
        System.out.println("O resultdado do resto é: " +modulo);

        x++;
        System.out.println("O resultado do incremento de x é: " + x);

        y--;
        System.out.println("O resultado do decremento de y é: "+ y);

        x += 10;
        System.out.println("A atribuição aditiva de X é: " + x);

        y -= 10;
        System.out.println("A atribuição subtratuva é: " + y);

    }
}
