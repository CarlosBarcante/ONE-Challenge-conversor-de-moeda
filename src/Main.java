import com.github.carlosbarcante.onedesafioconversordemoedas.models.BuscaTaxas;
import com.github.carlosbarcante.onedesafioconversordemoedas.models.Conversor;
import com.github.carlosbarcante.onedesafioconversordemoedas.models.TaxaDeConversao;
import com.github.carlosbarcante.onedesafioconversordemoedas.models.TaxaDeConversaoERAPI;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int opcao = 0;
        double valor = 0.0;
        Scanner leitura = new Scanner(System.in);

        System.out.print("""
                **************************************************
                
                Bem Vindo ao nosso sistema de conversão de moedas.
                
                **************************************************
                
                Escolha uma opção de conversão:
                
                1 - Real para Dólar
                2 - Real para Yuan
                3 - Real para Libra
                4 - Real para Peso Argentino
                5 - Real para Iene
                6 - Real para Won
                
                """);
        opcao = leitura.nextInt();
        leitura.nextLine();

        System.out.println("Digite o valor que deseja converter: ");
        valor = leitura.nextDouble();
        leitura.nextLine();

        BuscaTaxas buscaTaxas = new BuscaTaxas();
        TaxaDeConversaoERAPI taxaDeConversaoERAPI = buscaTaxas.BuscarTaxa();
        TaxaDeConversao taxaDeConversao = new TaxaDeConversao(taxaDeConversaoERAPI);
        Conversor conversor = new Conversor();
        double valorConvertido = conversor.ConverteMoeda(opcao,valor,taxaDeConversao);

        System.out.println("O valor convertido fica: " + valorConvertido);

    }
}