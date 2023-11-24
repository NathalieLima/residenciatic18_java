# P001 - RESPOSTAS

### Exercício 1

> O que é uma classe em Java e qual é a diferença entre uma classe e um objeto? Dê 5 exemplos mostrando-os em C++ e em Java. 

Classes são abstrações do mundo real. Elas surgem da necessidade de representar em código objetos da realidade, originando a programação orientada a objetos. Já objetos são instâncias das classes, portanto são a expressão desses modelos.

Um exemplo é a classe Carro. Quando se tem somente a classe, não existe nada além da ideia do que é um carro, a partir da definição de seus atributos (características) e métodos (ações). Contudo, com os objetos, tem-se agora representações reais, por exemplo, um carro da marca Fiat, de cor vermelha e que se movimenta.

Exemplos de classes em Java e seus equivalentes em C++:

~~~cpp
class Carro {
    private:
        std::string modelo;
        int ano;
        float preco;

    public:
        Carro(std::string modelo, int ano, float preco);
        void exibirInformacoes();
};
~~~

~~~java
public class Carro {
    private String modelo;
    private int ano;
    private float preco;

    public Carro(String modelo, int ano, float preco) {
        this.modelo = modelo;
        this.ano = ano;
        this.preco = preco;
    }

    public void exibirInformacoes() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Preço: " + preco);
    }
}
~~~

~~~cpp
class Pessoa {
    private:
        std::string nome;
        int idade;

    public:
        Pessoa(std::string nome, int idade);
        void imprimirDados();
};
~~~

~~~java
public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void imprimirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }
}
~~~

~~~cpp
class Retangulo {
    private:
        float comprimento;
        float largura;

    public:
        Retangulo(float comprimento, float largura);
        float calcularArea();
};
~~~

~~~java
public class Retangulo {
    private float comprimento;
    private float largura;

    public Retangulo(float comprimento, float largura) {
        this.comprimento = comprimento;
        this.largura = largura;
    }

    public float calcularArea() {
        return comprimento * largura;
    }
}
~~~

~~~cpp
class Janela {
    private:
        int altura;
        int largura;

    public:
        Janela(int altura, int largura);
        void redimensionar(int novaAltura, int novaLargura);
};
~~~

~~~java
public class Janela {
    private int altura;
    private int largura;

    public Janela(int altura, int largura) {
        this.altura = altura;
        this.largura = largura;
    }

    public void redimensionar(int novaAltura, int novaLargura) {
        this.altura = novaAltura;
        this.largura = novaLargura;
    }
}
~~~

~~~cpp
class Loja {
    private:
        std::string nome;
        std::string endereco;

    public:
        Loja(std::string nome, std::string endereco);
        void exibirDetalhes();
};
~~~

~~~java
public class Loja {
    private String nome;
    private String endereco;

    public Loja(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    public void exibirDetalhes() {
        System.out.println("Nome: " + nome);
        System.out.println("Endereço: " + endereco);
    }
}
~~~

### Exercício 2

> Como você declara uma variável em Java e quais são os tipos de dados primitivos mais comuns? Faça um paralelo entre isso e a mesma coisa na linguagem C++ 

Da mesma forma que em C++: declarando primeiramente o tipo do objeto e em seguida o nome referente à sua variável.

Os mais comuns são int, double, float, boolean e char. À exceção do boolean, que se chama somente bool em C++, todos esses tipos possuem a mesma grafia em ambas as linguagens. Temos, ainda, alguns outros tipos primitivos como byte, que em C++ seria o equivalente a char.

No entanto, embora boa parte tenha nomes similares, há diferenças significativas no tamanho em bytes de cada tipo e a faixa de valores que eles podem armazenar.

### Exercício 3

> Explique o conceito de herança em Java e como você pode criar uma subclasse a partir de uma classe existente. Faça um paralelo com C++, apresentando 5 exemplos. 

O conceito de herança em Java é o mesmo que em C++, no qual se tem uma classe filha que herda as características de seu pai. Dessa forma, permite que uma classe herde campos e métodos de outra classe. Em Java, a herança é realizada usando a palavra-chave extends. A classe que é estendida é chamada de classe pai ou superclasse, enquanto a classe que herda é chamada de classe filha ou subclasse.

Em ambas as linguagens é possível especificar diferentes níveis de acesso, sendo eles: public, protected ou private. A depender do nível de acesso definido, a herança é abrangente, limitada ou protegida.

1. Herança pública

~~~java
class Animal {
    void fazerSom() {
        System.out.println("Som do animal");
    }
}

class Cachorro extends Animal {
    void latir() {
        System.out.println("Au au!");
    }
}
~~~

~~~cpp
class Animal {
public:
    void fazerSom() {
        std::cout << "Som do animal\n";
    }
};

class Cachorro : public Animal {
public:
    void latir() {
        std::cout << "Au au!\n";
    }
};
~~~

2. Herança pública com sobrescrita de método

~~~java
class Veiculo {
    void mover() {
        System.out.println("Veículo movendo-se");
    }
}

class Carro extends Veiculo {
    @Override
    void mover() {
        System.out.println("Carro movendo-se");
    }
}
~~~

~~~cpp
class Veiculo {
public:
    void mover() {
        std::cout << "Veículo movendo-se\n";
    }
};

class Carro : public Veiculo {
public:
    void mover() override {
        std::cout << "Carro movendo-se\n";
    }
};
~~~

3. Herança pública com interfaces

~~~java
interface Nadador {
    void nadar();
}

class Peixe implements Nadador {
    @Override
    public void nadar() {
        System.out.println("Peixe nadando");
    }
}
~~~

~~~cpp
class Nadador {
public:
    virtual void nadar() {
        std::cout << "Nadador nadando\n";
    }
};

class Peixe : public Nadador {
public:
    void nadar() override {
        std::cout << "Peixe nadando\n";
    }
};
~~~

4. Herança privada

~~~java
class Animal {
    private void comer() {
        System.out.println("Animal comendo");
    }
}

class Gato extends Animal {
    void brincar() {
        // Por ser privado, não é possível chamar 'comer()' aqui
        System.out.println("Gato brincando");
    }
}
~~~

~~~cpp
class Animal {
private:
    void comer() {
        std::cout << "Animal comendo\n";
    }
};

class Gato : private Animal {
public:
    void brincar() {
        // Não é possível chamar 'comer()' aqui, pois é um método privado em Animal
        std::cout << "Gato brincando\n";
    }
};
~~~

5. Herança protegida

~~~java

~~~

~~~cpp
class Pessoa {
protected:
    std::string nome;

public:
    Pessoa(std::string nome) : nome(nome) {}
};

class Estudante : protected Pessoa {
public:
    Estudante(std::string nome) : Pessoa(nome) {}

    void exibirInfo() {
        std::cout << "Nome: " << nome << "\n";
    }
};
~~~

## Exercício 4

> Quando declaramos uma variável em Java, temos, na verdade, um ponteiro. Em C++ é diferente. Discorra sobre esse aspecto. 

Em C++ você tem um maior controle sobre a memória, isto é, como os dados serão armazenados. Nele, é possível utilizar ponteiros e alocar memória manualmente. O que difere de Java, onde tudo é ponteiro. 

Em Java, quando você declara uma variável de objeto, é criada uma referência ao objeto, enquanto em C++, quando você declara um objeto, é criada uma instância real desse objeto na memória, não uma referência a ela. Em C++, você pode usar ponteiros para criar referências a objetos, dando mais controle sobre a alocação e liberação de memória, mas também requer maior responsabilidade por parte do programador.

Assim, a principal diferença está na gestão de memória: em Java, a coleta de lixo gerencia automaticamente as alocações e desalocações de memória, já em C++, é preciso gerenciar manualmente o ciclo de vida dos objetos usando ponteiros. Essa diferença reflete as abordagens distintas de gerenciamento de memória adotadas por essas linguagens.

Exemplo de como é em Java e em C++: 

~~~java
MinhaClasse objeto = new MinhaClasse();
~~~

~~~cpp
MinhaClasse* objeto = new MinhaClasse();
~~~