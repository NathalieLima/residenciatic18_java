# P001 - RESPOSTAS

### Exercício 1

>  O que é uma exceção em Java e qual é o propósito de usá-las em programas?

É a indicação de um problema que ocorre durante a execução de um programa. 

O uso de exceções permite separar a detecção da ocorrência de uma situação excepcional do seu tratamento, ao se programar um método em Java. Dessa forma, é possível controlar erros para que estes, quando ocorrerem, não quebrem a aplicação.

### Exercício 2

> Pesquise sobre a diferença entre exceções verificadas e não verificadas em Java. Dê exemplos de cada uma.

As exceções verificadas são exceções já previstas pelo compilador. Usualmente são geradas pela palavra chave throw. Como ela é prevista já em tempo de compilação, faz -se necessária a utilização do bloco try / catch ou da palavra chave throws. A princípio, todas as classes filhas de Exception são do tipo checked, exceto pelas subclasses de java.lang.RuntimeException (exceção em tempo de execução).

Um dos fatores que tornam a RuntimeException e suas classes filhas tão específicas em relação as demais subclasses de Exception é que elas são exceções não diretamente previstas por acontecer em tempo de execução, ou seja, são exceções não verificadas. Por exemplo:

A maior diferença entre as exceções verificadas e não verificadas é que as exceções verificadas são forçadas pelo compilador e usadas para indicar condições excepcionais que estão fora do controle do programa, enquanto as exceções não verificadas ocorrem durante o tempo de execução e são usadas para indicar erros de programação.

~~~java
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ExcecaoVerificada {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("arquivo.txt"));
            String linha = br.readLine();
            System.out.println(linha);
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
~~~

~~~java
public class ExcecaoNaoVerificada {
    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        int resultado = array[5];  // Isso causará uma exceção ArrayIndexOutOfBoundsException
        System.out.println(resultado);
    }
}
~~~

### Exercício 3

> Como você pode lidar com exceções em Java? Quais são as palavras-chave e as práticas comuns para tratamento de exceções? 

Através de palavras reservadas do sistema próprias para essa finalidade. São elas: try, catch, finally, throw e throws. Cada uma possui sua própria funcionalidade, e são essenciais para o tratamento de exceções. Algumas práticas comuns são de especificar exceções apropriadas, não as capturando genericamente, e usar o bloco finally para liberação de recursos.

### Exercício 4

> O que é o bloco "try-catch" em Java? Como ele funciona e por que é importante usá-lo ao lidar com exceções? 

O bloco try-catch em Java é uma estrutura usada para lidar com exceções. Ele permite que você coloque código que pode gerar uma exceção dentro de um bloco try, e, caso uma exceção ocorra, você pode capturá-la e lidar com ela no bloco catch. O principal motivo é lidar com exceções de maneira controlada, de modo a evitar que o programa seja encerrado abruptamente devido a um erro.

### Exercício 5

> Quando é apropriado criar suas próprias exceções personalizadas em Java e como você pode fazer isso? Dê um exemplo de quando e por que você criaria uma exceção personalizada.

Quando é preciso especificar erros ao usuário ou para gerar logs. Dessa forma, não há confusão sobre o que é uma exceção de Java com uma exceção do sistema ou referente a alguma regra de negócio. 

A geração de exceções pode tornar mais claros determinados tipos de erro, como objetos não preenchidos corretamente, validações incorretas etc.