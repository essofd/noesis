
# [](https://github.com/essofd/noesis) DesafioQA Noesis - Automação de Teste de Software

Donwload do projeto: [noesis](https://github.com/essofd/noesis/archive/master.zip).

Softwares necessários:
IDE: [Eclipse](http://www.eclipse.org/)
Java: [Java](http://www.oracle.com/technetwork/pt/java/index.html)
Maven: [Maven](https://maven.apache.org/download.cgi)

**Desafio 1**
Criar um projeto de automação utilizando BDD e em linguagem de programação de sua preferência
os cenários para as duas funcionalidades abaixo:
1. No site https://www.unimed.coop.br/ validar a seguinte sequência de ações:

    • Acessar Guia Médico

    • Realizar uma pesquisa de médicos no Rio de Janeiro.

    • Validar a apresentação dos resultados com a Especialidade e Cidade
2. No mesmo site, validar:

    • Acessar Guia Médico

    • Realizar uma pesquisa de médicos no Rio de Janeiro.

    • Validar nas páginas 1, 2, e 3 do resultado, NÃO apresentação do resultado com cidade São Paulo

**Desafio 2**
Fazer os testes automatizados para este serviço, considerando todas as regras de negócio
descritas acima. Criá-los Desafio 2
Criar um projeto de automação para API utilizando framework de sua preferência os cenários para as
duas funcionalidades abaixo:

EndPoint http://www.omdbapi.com/?i=[ID_DO_FILME]&apikey=[API_KEY]
Parametros ID_DO_FILME: tt1285016 API_KEY= 52ec71bf
ID_DO_FILME e API_KEY deverão ser passados por variáveis GLOBAIS
1. No endpoint validar o response para:

    • Título do Filme

    • Ano do Filme

    • Idioma do filme

2.  No endpoint validar o response para:

    • Busca filme inexistente sua linguagem ou ferramenta de preferência.

  Após fazê-los, gerar um relatório de falhas e estatística de falhas/acerto.

**Desafio 3**
Desenvolva uma solução em linguagem de programação de sua preferência para atender aos critérios
da história abaixo, usando TDD:
Como lojista
Quero saber quanto de desconto posso conceder no carrinho
Para fidelizar um cliente
Critérios

• Acima de R$ 100 e abaixo de R$ 200 => 10%

• Acima de R$ 200 e abaixo de R$ 300 => 20%

• Acima de R$ 300 e abaixo de R$ 400 => 25%

• Acima de R$ 400 => 30%

• Se existir no carrinho um filme com gênero ação somar + 5% de desconto

Regras

• Criar somente uma classe

• Carrinho será um array de int com ids dos filmes

• Passar sempre valor da compra + id do filme

**Preparação do ambiente - Passo a Passo:**
 1. Baixe e instale o Eclipse;
 2. Baixe e instale o Java: JRE e JDK;
 3. Baixe e descompacte o Maven;
 4. Configure o Java e o Maven no Windows 10: vá até o Painel de Controle > Sistema e Segurança > Sistema;
 5. Clique em "Configurações avançadas do sistema";
 6. Clique em "Variáveis de Ambiente...";
 7. Clique no botão “Nova” em “Variáveis do sistema”;
 8. Digite no nome da variável: "JAVA_HOME";
 9. No valor da variável: coloque o endereço onde foi instalado. Exemplo: “C:\Program Files\Java\jdk1.8.0_161”;
 10. Clique em "OK";
 11. Clique novamente no botão “Nova” em “Variáveis do sistema”;
 12. Digite no nome da variável: "MAVEN_HOME";
 13. No valor da variável: coloque o endereço onde foi instalado. Exemplo: “C:\Program Files\Maven\apache-maven”;
 14. Clique em "OK";
 15. Selecione "Path" e clique em "Editar...";
 16. Clique em "Novo" e digite "%JAVA_HOME%\bin";
 17. Clique em "Novo" novamente e digite "%MAVEN_HOME%\bin" e depois clique em "OK"
 18. Clique em "Novo" novamente e informe o caminho físico do seu driver onde esta contido os drivers do Chrome ou Firefox. Exemplo: "C:\dev\drivers"
 18. Clique em "OK" novamente para salvar as configurações;
 19. Para confirmar se foi configurado certo e a verificar a versão:

            vá ao CMD(Prompt de comando) e digite: "java -version" e clique em <ENTER>
            e após isto no CMD digite: "mvn -version" e clique em <ENTER>

**Executando o script - Passo a Passo via Maven**
 1. Baixe o projeto e descompacte-o;
 2. Acesse o o comand prompt (CMD)
 3. Vá até o caminho aonde esta a solução do projeto e digite: "mvn clean test"
 4. Espere o teste ser executado e confira o resultado;

 **Executando o script - Passo a Passo via Eclise**
 1. Baixe o projeto e descompacte-o;
 2. Acesse o Eclipse;
 3. Dentro do eclipse clique em "File" e depois em "Open Projects from File System...";
 4. Em Import source, digite o endereço do projeto. Exemplo: "C:\Repositorio\noesis". Ou clique em "Directory" e selecione a pasta do projeto e clique em "OK";
 5. Clique em "Finish" e espere o projeto carregar;
 6. Após, clique em "src/test/java";
 7. Clique no pacote onde se encontra o caso de teste e selecione "Run As" e após "JUnit Test";
 8. Espere o teste ser executado e confira o resultado;

Casos de testes:

 Desafio 1==> "RunnerTest.java"

 Desafio 2==> "FilmeTest.java"

 Desafio 3==> "LojistaTest.java"
