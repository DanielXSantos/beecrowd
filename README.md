# ? Beecrowd Solutions - Java

Este repositório contém minhas resoluções para os desafios de programação da plataforma **Beecrowd** (antigo URI Online Judge). O objetivo é praticar lógica de programação, algoritmos e estruturas de dados utilizando a linguagem Java.

## ? Sobre o Beecrowd

O [Beecrowd](https://www.beecrowd.com.br/) é uma das maiores plataformas de desafios de programação do mundo. Ela oferece mais de 2.000 problemas divididos em diversas categorias, como:
- Iniciante
- Ad-hoc
- Strings
- Estruturas de Dados e Algoritmos
- Matemática
- Geometria Computacional
- E muito mais!

É uma excelente ferramenta para quem deseja se preparar para competições de programação (como a Maratona de Programação da SBC) ou entrevistas técnicas.

## ?? Tecnologias Utilizadas

O projeto foi desenvolvido utilizando as seguintes tecnologias:

*   **Linguagem:** Java
*   **Versão do Java:** 17 (OpenJDK 17.0.17)
*   **IDE:** IntelliJ IDEA (opcional, baseado nos arquivos `.iml` e pasta `out`)

## ? Estrutura do Projeto

Os problemas estão organizados por categorias, conforme a estrutura original da plataforma:

```text
beecrowd/
??? adhoc/       # Problemas que exigem lógica variada (simulações, jogos, etc.)
??? beginner/    # Problemas de nível básico para iniciantes (entrada, saída, condicionais)
??? strings/     # Desafios focados em manipulação de textos e padrões
```

Cada arquivo segue o padrão de nomenclatura `PXXXX.java`, onde `XXXX` é o número do problema na plataforma.

## ? Como Executar

Para compilar e executar qualquer um dos problemas localmente, siga os passos abaixo:

1.  Certifique-se de ter o **JDK 17** instalado.
2.  Navegue até a pasta do problema desejado.
3.  Compile o arquivo:
    ```bash
    javac NomeDoArquivo.java
    ```
4.  Execute o programa:
    ```bash
    java NomeDoArquivo
    ```
    *(Nota: Como os arquivos possuem declaração de `package`, a execução correta deve ser feita a partir da raiz do diretório `beecrowd/` usando o nome qualificado da classe, por exemplo: `java beginner.P1001`)*

---
*Desenvolvido por Daniel Santos.*
