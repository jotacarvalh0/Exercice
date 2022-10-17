/* 7- (Opcional) Modifique seu método	**recuperaDadosParaImpressao** para que ele devolva o valor	da
data De Abertura daquela Conta: */

class Conta	{
    Data dataDeAbertura;
    String	recuperaDadosParaImpressao() {
                    String	dados	=	"\nTitular:	"	+	this.titular;

                    dados	+=	"\nMês:	"	+	this.dataDeAbertura.mes;
                    dados	+=	"\nDia:	"	+	this.dataDeAbertura.dia;
                    dados	+=	"\nAno:	"	+	this.dataDeAbertura.ano;
                    return	dados;
    }
}

/* Teste-o. O que acontece se chamarmos o método recuperaDadosParaImpressao 
antes de atribuirmos uma data a essa Conta? */
/* RESPOSTA: Como não foi atribuido um valor, dia, mês e ano estão
com o valor de 0, é oque aparecera. */

class TestarConta {
    public static void main(String[] args) {
        Conta c1 = new Conta();
        c1.titular = "Hugo";
        c1.agencia = "00-a";
        c1.numero = 000000;
        c1.saldo = 100;
        c1.deposita(100);
        c1.dataDeAbertura = new Data();
        System.out.println(c1.recuperaDadosParaImpressao());
        c1.dataDeAbertura.preencheData(10, 16, 2022);
    }

/*8- (Opcional) O que acontece se	você tentar acessar	um atributo	diretamente na classe? Da erro de compilação.

Por exemplo:
Conta.saldo = 1234;
Esse	código faz sentido?*/ 

/*RESPOSTA: Não, não é um objeto para ser alterado o seu valor.*/   

/*E este:
Conta.calculaRendimento();
Faz sentido perguntar ao esquema da Conta	seu valor anual?*/

/* RESPOSTA: Não, já que não definimos valor a ele.*/

/*9- (Opcional e	avançado) Crie um método na classe Data que devolva
o valor formatado da data, isto é, devolva uma String com "dia/mês/ano".
Tudo isso para que o método recuperaDadosParaImpressao da classe	
Conta possa ficar assim:*/

class Conta	{
    //	atributos	e	metodos
    String	recuperaDadosParaImpressao() {
                    //	imprime	outros	atributos...
                    dados	+=	"\nData	de	abertura:	"	+	this.dataDeAbertura.formatada();
                    return	dados;
    }
}
/* Criar um objeto para a data, vai facilicar a declaração*/
public class Date {
	int mes;
	int dia;S
	int ano;
	
 public String FormatDate() {
		return (mes+"/"+dia+"/"+ano);	
	}
}