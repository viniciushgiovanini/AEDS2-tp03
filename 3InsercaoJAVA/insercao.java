//TP03 - INSERCAO
//Aluno: Vinícius Henrique Giovanini
//Matricula: 692225
//Matéria: AEDS2

//RESULTADO DO PROGRAMA: O programa deu 100%, fazendo todas as operações de ordenação por seleção
//Esse programa tem que ordenar pelo idioma, ele faz a mesma coisa que o selecao porem com o idioma, quando é pra ordenar ele insere na posicao menor possivel, tipo se a string tiver que entrar
//na segunda posicao, ele faz shift dos elementos e insere a string na posicao 2 (EXEMPLO)

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class SerieINSERCAO {

  private String nome;
  private String formato;
  private String duracao;
  private String pais;
  private String idioma;
  private String emissora;
  private String transmissao;
  private int ntemp;
  private String receberntemp;
  private int nepisodio;
  private String recebernepisodio;
  private String concatenado;

  // NA CLASSE TODAS RECEBEM A STRING TODA SUJA PELO SET NOME E MANDA PRO GETNOME,
  // QUANDO É ACIONADO O BUSCAR NO MAIS, O MÉTODO BUSCAR PEGA A STRING SUJA E
  // COMECA A LIMPAR, E ELE LIMPA SEMPRE ENTRE > < DEIXANDO SOMENTE O CONTÉUDO
  // DENTRO DESSE ELEMENTOS PRESENTE NA STRING, ELE FAZ ESSA "LIMPEZA", COPIANDO
  // OS ELEMENTOS DENTRO DE > < PARA OUTRO ARRAY.

  // ------------------------------NOME------------------------------//

  public String getNome() {
    return this.nome;
  }

  public void setNome(String recebernome) {
    this.nome = recebernome;
  }

  public void buscanome() {

    String buscar = getNome();// MANDOU A STRING SUJA QUE ESTAVA EM GETNOME PARA A VARIAVEL BUSCAR
    char[] vetor = buscar.toCharArray();// SETOU ESSE VETOR COM CADA POSICAO UM ELEMENTO PRESENTE NA STRING SUJA
    char[] vetorreceber = new char[buscar.length()];// SETOU UM VETOR VAZIO COM O TAMANHO DO VETOR SUJO
    boolean marcador = false;
    int contador = 0;

    // String receber = "";
    // receber = buscar.replaceAll("<.*?>", "");
    // System.out.println(buscar);

    for (int k = 0; k < buscar.length(); k++) {// CADA MÉTODO TEM SUA ESPECIFICAÇÃO NESSA PARTE, O MÉTODO BUSCAR NOME
                                               // BUSCAR O NOME ATÉ ENCONTRAR UMA "/", QUANDO ELE ENCONTRA UMA BARRA ELE
                                               // FINALIZA A BUSCA PARA ECONOMIZAR PROCESSOS, E NESSE MÉTODO É IGNORADO
                                               // PARENTESES.

      if (vetor[k] == '<') {

        marcador = false;

      }

      if (vetor[k] == '>') {

        marcador = true;

      }

      if (marcador == true && vetor[k] != '(' && vetor[k] != ')' && vetor[k] != '>') {// QUANDO É ENCONTRADO UM VALOR
                                                                                      // ENTRE > < ESSE VALOR É COPIADO
                                                                                      // PARA A PRIMEIRA POSICAO DO
                                                                                      // VETORRECEBER, ISSO OCORRE POIS
                                                                                      // SE NÃO FOR FEITO ISSO A STRING
                                                                                      // VAI FICAR NA POSICAO ONDE FOI
                                                                                      // ACHADA QUE GERALMENTE NÃO É A
                                                                                      // PRIMEIRA POSIÇÃO

        vetorreceber[contador] = vetor[k];
        contador++;
      }

      if (vetor[k] == '/') {

        k = buscar.length() - 1;

      }

    }

    int contadorf = 0;

    for (int i = 0; i < vetorreceber.length; i++) {// ESSE FOR ESTÁ PRESENTE EM TODOS OS MÉTODOS, ELE É ENCARREGADO DE
                                                   // CONTAR QUANTAS POSIÇÕES DO VETOR ESTÁ PRESENTE ALGUM TIPO DE
                                                   // VALOR, POIS COMO FOI
                                                   // FEITO NO ÍNICIO O VETOR RECEBER FOI SETADO COM A QUANTIDADE DE
                                                   // POSICOES PRESENTE NA STRING SUJA, QUANDO ELA FOI LIMPADA E FOI
                                                   // COPIADO PARA ESSE VETOR FICOU SOBRANDO AS POSIÇÕES NÃO COPIADAS, E
                                                   // DESSA FORMA O CONTADORF, CONTA QUANTAS POSIÇÕES ESTÃO COM VALOR NO
                                                   // VETOR RECEBER.

      if (vetorreceber[i] != 0) {
        contadorf++;
      }

    }

    char[] vetorfinal = new char[contadorf];

    for (int f = 0; f < contadorf; f++) {// DEPOIS DE CONTAR A QUANTIDADE DE POSICOES SEM ESTAR VAZIA, ESSE FOR VAI
                                         // FAZER EXATAMENTE O LOOP DE QUANTIDADE DE VALORES VALIDOS, JÁ QUE OS VALORES
                                         // DO VETOR RECBER FORAM COPIADOS PARA A POSICAO 1,2,3 ASSIM EM DIANTE, É SO
                                         // COPIAR ESSAS POSIÇÕES INICIAIS PARA OUTRO VETOR, E QUANDO ACABAR OS VALORES
                                         // VALIDOS O FOR VAI ACABAR, FICANDO PRESENTE NO VETOR FINAL SOMENTE VALORES
                                         // VALIDOS.

      vetorfinal[f] = vetorreceber[f];

    }

    String receber = String.valueOf(vetorfinal);// ESSE COMANDO VAI PEGAR A STRING LIMPA E COM POSIÇÕES OCUPADAS POR
                                                // VALORES VALIDOS E VAI CONVERTER EM STRING
    this.nome = receber;// AQUI VAI RETORNAR PRA VARIAVEL/OBJ NOME QUE VAI PARA O MÉTODO GETNOME

  }

  // ------------------------------FORMATO------------------------------//

  public String getFormato() {
    return this.formato;
  }

  public void setFormato(String receberFormato) {
    this.formato = receberFormato;
  }

  public void buscaformato() {// BUSCA DA MESMA MANEIRA DO QUE NOME BUSCA

    String buscar = getFormato();
    char[] vetor = buscar.toCharArray();
    char[] vetorreceber = new char[buscar.length()];
    boolean marcador = false;
    int contador = 0;

    // String receber = "";
    // receber = buscar.replaceAll("<.*?>", "");
    // System.out.println(buscar);

    for (int k = 0; k < buscar.length(); k++) {

      if (vetor[k] == '<') {

        marcador = false;

      }

      if (vetor[k] == '>') {

        marcador = true;

      }

      if (marcador == true && vetor[k] != '(' && vetor[k] != ')' && vetor[k] != '>') {

        vetorreceber[contador] = vetor[k];
        contador++;
      }

    }

    int contadorf = 0;

    for (int i = 0; i < vetorreceber.length; i++) {

      if (vetorreceber[i] != 0) {
        contadorf++;
      }

    }

    char[] vetorfinal = new char[contadorf];

    for (int f = 0; f < contadorf; f++) {

      vetorfinal[f] = vetorreceber[f];

    }

    String receber = String.valueOf(vetorfinal);
    this.formato = receber;

  }

  // ------------------------------DURAÇÃO------------------------------//

  public String getDuracao() {
    return this.duracao;
  }

  public void setDuracao(String receberDuracao) {
    this.duracao = receberDuracao;
  }

  public void buscaduracao() {// BUSCA DURAÇÃO TEM UMA DIFERENÇA, LA NO FINAL DO MÉTODO

    String buscar = getDuracao();
    char[] vetor = buscar.toCharArray();
    char[] vetorreceber = new char[buscar.length()];
    boolean marcador = false;
    int contador = 0;

    // String receber = "";
    // receber = buscar.replaceAll("<.*?>", "");
    // System.out.println(buscar);

    for (int k = 0; k < buscar.length(); k++) {

      if (vetor[k] == '<') {

        marcador = false;

      }

      if (vetor[k] == '>') {

        marcador = true;

      }

      if (marcador == true && vetor[k] != '>') {

        vetorreceber[contador] = vetor[k];
        contador++;
      }

    }

    int contadorf = 0;

    for (int i = 0; i < vetorreceber.length; i++) {

      if (vetorreceber[i] != 0) {
        contadorf++;
      }

    }

    char[] vetorfinal = new char[contadorf];

    for (int f = 0; f < contadorf; f++) {

      vetorfinal[f] = vetorreceber[f];

    }

    String receber = String.valueOf(vetorfinal);
    receber = receber.trim();// ESSE COMANDO ELEMINA QUALQUER TIPO DE ESPAÇO PRESENTE NO COMEÇO OU NO FINAL
                             // DA STRING E DEPOIS RETORNA PARA A VARIAVEL DURAÇÃO
    this.duracao = receber;
  }

  // ------------------------------Pais de Origem------------------------------//

  public String getPais() {
    return this.pais;
  }

  public void setPais(String receberPais) {
    this.pais = receberPais;
  }

  public void buscapais() {

    String buscar = getPais();
    char[] vetor = buscar.toCharArray();
    char[] vetorreceber = new char[buscar.length()];
    boolean marcador = false;
    int contador = 0;

    // String receber = "";
    // receber = buscar.replaceAll("<.*?>", "");
    // System.out.println(buscar);

    for (int k = 0; k < buscar.length(); k++) {

      if (vetor[k] == '<' || vetor[k] == '&') {

        marcador = false;

      }

      if (vetor[k] == '>') {

        marcador = true;

      }

      if (marcador == true && vetor[k] != '>' && vetor[k] != '&' && vetor[k] != '#' & vetor[k] != '1' && vetor[k] != '6'
          && vetor[k] != '0' && vetor[k] != ';') {// AQUI TEM UMA DIFERENÇA NA LINHA PEGADA QUANDO SE SETA PAIS DE
                                                  // ORIGEM DE CARACTERES INDESEJADOS ENTRE > <, DESSA FORMA COLOQUEI NO
                                                  // IF TODOS ELES PARA SEREM IGNORADOS COMO POR EXEMPLO >&#160;<

        vetorreceber[contador] = vetor[k];
        contador++;
      }

    }

    int contadorf = 0;

    for (int i = 0; i < vetorreceber.length; i++) {

      if (vetorreceber[i] != 0) {
        contadorf++;
      }

    }

    char[] vetorfinal = new char[contadorf];

    for (int f = 0; f < contadorf; f++) {

      vetorfinal[f] = vetorreceber[f];

    }

    String receber = String.valueOf(vetorfinal);
    receber = receber.trim();

    this.pais = receber;
  }

  // ------------------------------Idioma------------------------------//
  public String getIdioma() {
    return this.idioma;
  }

  public void setIdioma(String receberIdioma) {
    this.idioma = receberIdioma;
  }

  public void buscaidioma() {

    String buscar = getIdioma();
    char[] vetor = buscar.toCharArray();
    char[] vetorreceber = new char[buscar.length()];
    boolean marcador = false;
    int contador = 0;

    // String receber = "";
    // receber = buscar.replaceAll("<.*?>", "");
    // System.out.println(buscar);

    for (int k = 0; k < buscar.length(); k++) {

      if (vetor[k] == '<') {

        marcador = false;

      }

      if (vetor[k] == '>') {

        marcador = true;

      }

      if (marcador == true && vetor[k] != '>') {

        vetorreceber[contador] = vetor[k];
        contador++;
      }

    }

    int contadorf = 0;

    for (int i = 0; i < vetorreceber.length; i++) {

      if (vetorreceber[i] != 0) {
        contadorf++;
      }

    }

    char[] vetorfinal = new char[contadorf];

    for (int f = 0; f < contadorf; f++) {

      vetorfinal[f] = vetorreceber[f];

    }

    String receber = String.valueOf(vetorfinal);
    receber = receber.trim();
    this.idioma = receber;
  }

  // ------------------------------Emissora_de_TV------------------------------//
  public String getEmissora() {
    return this.emissora;
  }

  public void setEmissora(String receberEmissora) {
    this.emissora = receberEmissora;
  }

  public void buscaemissora() {

    String buscar = getEmissora();
    char[] vetor = buscar.toCharArray();
    char[] vetorreceber = new char[buscar.length()];
    boolean marcador = false;
    int contador = 0;
    int receberk = 0;

    // String receber = "";
    // receber = buscar.replaceAll("<.*?>", "");
    // System.out.println(buscar);

    /*
     * int tamanhostring = getEmissora().length();
     * 
     * if (tamanhostring <= 300) {
     * 
     * receberk = 0;
     * 
     * }
     * 
     * if (tamanhostring >= 300) { receberk = 620; }
     */

    for (int k = receberk; k < buscar.length(); k++) {

      if (vetor[k] == '<') {

        marcador = false;

      }

      if (vetor[k] == '>') {

        marcador = true;

      }

      if (marcador == true && vetor[k] != '>') {

        vetorreceber[contador] = vetor[k];
        contador++;
      }

    }

    int contadorf = 0;

    for (int i = 0; i < vetorreceber.length; i++) {

      if (vetorreceber[i] != 0) {
        contadorf++;
      }

    }

    char[] vetorfinal = new char[contadorf];

    for (int f = 0; f < contadorf; f++) {

      vetorfinal[f] = vetorreceber[f];

    }

    String receber = String.valueOf(vetorfinal);
    receber = receber.trim();
    this.emissora = receber;
  }

  // ------------------------------Transmissao_Original------------------------------//
  public String getTrasmissao() {
    return this.transmissao;
  }

  public void setTrasmissao(String receberTrasmissao) {
    this.transmissao = receberTrasmissao;
  }

  public void buscatrasmissao() {

    String buscar = getTrasmissao();
    char[] vetor = buscar.toCharArray();
    char[] vetorreceber = new char[buscar.length()];
    boolean marcador = false;
    int contador = 0;

    for (int k = 0; k < buscar.length(); k++) {

      if (vetor[k] == '<' || vetor[k] == '&') {

        marcador = false;

      }

      if (vetor[k] == '>' || vetor[k] == '(') {

        marcador = true;

      }

      if (marcador == true && vetor[k] != '>') {

        vetorreceber[contador] = vetor[k];
        contador++;
      }

    }

    int contadorf = 0;

    for (int i = 0; i < vetorreceber.length; i++) {

      if (vetorreceber[i] != 0) {
        contadorf++;
      }

    }

    char[] vetorfinal = new char[contadorf];

    for (int f = 0; f < contadorf; f++) {

      vetorfinal[f] = vetorreceber[f];

    }

    String receber = String.valueOf(vetorfinal);
    receber = receber.trim();
    this.transmissao = receber;
  }

  // ------------------------------Número_de_Temporadas------------------------------//

  // ESSE MÉTODO AQUI É DIFERENTE DOS OUTROS, POIS ELE SE TRATADA DE NUMERO
  // INTEIRO PARA SER RETORNADO, DESSA FORMA, ELE RECEBE A STRING SUJA COM
  // SETNTEMPORADAS E SO PODE SER ACESSADA COM GETNTEMPORADAS, DESSA FORMA FOI
  // CRIADO MAIS UM GETNTEMPORADAS COM VALOR INT, O PQ VAI SER EXPLICADO NO FINAL
  // DO MÉTODO

  public String getNtemporadas() {
    return this.receberntemp;
  }

  public void setNtemporadas(String receberNtemporadas) {
    this.receberntemp = receberNtemporadas;
  }

  public int getNtemporadasINTEIRO() {
    return this.ntemp;
  }

  public void buscaNtemporadas() {// DESSA FORMA ELE VAI FAZER A BUSCA

    String buscar = getNtemporadas();// AQUI VAI SER MANDADO A STRING SUJA
    char[] vetor = buscar.toCharArray();
    char[] vetorreceber = new char[buscar.length()];
    boolean marcador = false;
    int contador = 0;

    // String receber = "";
    // receber = buscar.replaceAll("<.*?>", "");
    // System.out.println(buscar);

    for (int k = 0; k < buscar.length(); k++) {

      if (vetor[k] == '<' || vetor[k] == '&') {// TODO VEZ QUE VETOR NA POSICAO K FOR IGUAL A < OU & ELE VAI PARAR DE
                                               // SALVAR O VALOR CONTIDO LOGO APOS

        marcador = false;

      }

      if (vetor[k] == '>' || vetor[k] == '(') {// TODA VEZ QUE O VETOR FOR IGUAL A > OU ( ELE VAI COMECAR A SALVAR OS
                                               // VALORES QUE VEM EM SEGUIDA (NA VDD ELE BOTA O MARCADOR COMO TRUE,
                                               // DIZENDO ASSIM QUE PODE COMECAR A SALVAR)

        marcador = true;

      }

      if (marcador == true && vetor[k] != '>') {// PARA EVITAR SALVAR O > COLOQUEI QUE SE O CARACTER PRESENTE NO VETOR
                                                // FOR IGUAL AO > ELE N SALVAR, DESSA FORMA ELE SO VAI COMEÇAR A SALVAR
                                                // NO PROXIMO LOOP. E ELE VAI PEGAR O CARACTER APTO A SER SALVO E SALVAR
                                                // NA PRIMEIRA POSIÇÃO DO VETOR RECEBER, E ASSIM POR DIANTE.

        vetorreceber[contador] = vetor[k];
        contador++;
      }

    }

    int contadu = 0;

    // AQUI É DIFERENTE TAMBÉM

    for (int j = 0; j < 2; j++) {

      if (vetorreceber[j] == '0' || vetorreceber[j] == '1' || vetorreceber[j] == '2' || vetorreceber[j] == '3'
          || vetorreceber[j] == '4' || vetorreceber[j] == '5' || vetorreceber[j] == '6' || vetorreceber[j] == '7'
          || vetorreceber[j] == '8' || vetorreceber[j] == '9') {// PARA RETIRAR AS POSICÕES VAZIAS, JA QUE QUEREMOS
                                                                // SOMENTE UM NUMERO, SE O VETOR RECEBER TIVER ALGUEM
                                                                // NUMERO, O CONTADOR VAI SER ACIONADO

        contadu++;

      }

    }

    char[] vetorfinal = new char[contadu];// ABRI O VETOR FINAL QUE VAI TER O TAMANHO IGUAL A QUANTIDADE DE CARACTERES
                                          // PRESENTE NO VETOR RECEBER QUE FOI SETADO NO FOR ACIMA

    for (int v = 0; v < vetorfinal.length; v++) {// ESSE FOR VAI SER EXECUTADO SÓ ATÉ A QUANTIDADE DE CARACTERES
                                                 // PRESENTE NO VETOR RECEBER QUE FOI CONTADO COM CONTADU

      vetorfinal[v] = vetorreceber[v]; // JA QUE OS CARACTERES ESTÃO NA PRIMEIRA POSICAO EM VETOR RECEBER, VAI PASSAR
                                       // PARA VETOR FINAL TAMBÉM NA PRIMEIRA POSICAO PORÉM VETOR RECEBER ESTÁ COM
                                       // POSICÕES DE TODOS OS CARACTERES DA STRING SUJA, E AGORA QUEREMOS UM VETOR
                                       // SOMENTE COM POSIÇÕES DO CARACTERES DESEJADOS

    }

    String receber = String.valueOf(vetorfinal);// CONVERTER A STRING VETOR FINAL PARA STRING RECEBER
    int intconvertido = Integer.valueOf(receber);// AQUI QUE VEM O DIFERENCIAL, ESSE MÉTODO TEM QUE SER RETORNADO INT,
                                                 // DESSA FORMA PEGAMOS O VALOR PRESENTE NA STRING RECEBER QUE É UM
                                                 // CARACTER NUMERICO E CONVERTEMOS PARA INT, MANDANDO PARA
                                                 // INTCONVERTIDO.
    this.ntemp = intconvertido; // LOGO EM SEGUIDA RETORNARMOS O NUMERO INTEIRO PARA O NTEMP, QUE SO PODE SER
                                // ACESSADO COM GETNTEMPO, POIS É UM ATRIBUTO PRIVADO
  }
  // ------------------------------Número_de_Episodios------------------------------//

  // O NÚMERO DE EP USA A LOGICA EXPLICADA ACIMA, POIS TAMBÉM REQUER UM NUMERO
  // INTEIRO PARA SER RETORNADO.

  public String getNepisodio() {
    return this.recebernepisodio;
  }

  public void setNepisodio(String receberNepisodio) {
    this.recebernepisodio = receberNepisodio;
  }

  public int getNepisodioINTEIRO() {
    return this.nepisodio;
  }

  public void buscaNepisodio() {

    String buscar = getNepisodio();
    char[] vetor = buscar.toCharArray();
    char[] vetorreceber = new char[buscar.length()];
    boolean marcador = false;
    int contador = 0;

    // String receber = "";
    // receber = buscar.replaceAll("<.*?>", "");
    // System.out.println(buscar);

    for (int k = 0; k < 54; k++) {

      if (vetor[k] == '<' || vetor[k] == '&') {

        marcador = false;

      }

      if (vetor[k] == '>' || vetor[k] == '(') {

        marcador = true;

      }

      if (marcador == true && vetor[k] != '>') {

        vetorreceber[contador] = vetor[k];
        contador++;
      }

    }

    int contadu = 0;

    for (int j = 0; j < 3; j++) {

      if (vetorreceber[j] == '0' || vetorreceber[j] == '1' || vetorreceber[j] == '2' || vetorreceber[j] == '3'
          || vetorreceber[j] == '4' || vetorreceber[j] == '5' || vetorreceber[j] == '6' || vetorreceber[j] == '7'
          || vetorreceber[j] == '8' || vetorreceber[j] == '9') {

        contadu++;

      }

    }

    char[] vetorfinal = new char[contadu];

    for (int v = 0; v < vetorfinal.length; v++) {

      vetorfinal[v] = vetorreceber[v];

    }

    String receber = String.valueOf(vetorfinal);
    int intconvertido = Integer.valueOf(receber);
    this.nepisodio = intconvertido;
  }

  public String getConcatenado() {
    return this.concatenado;
  }

  public void setConcatenado(String receberConcatenado) {
    this.concatenado = receberConcatenado;
  }

  public void Concatenar() {

    setConcatenado(getNome() + " " + getFormato() + " " + getDuracao() + " " + getPais() + " " + getIdioma() + " "
        + getEmissora() + " " + getTrasmissao() + " " + getNtemporadasINTEIRO() + " " + getNepisodioINTEIRO());

  }

}

public class insercao {

  public static int quantidadeElementos(String[] vetor) {// função para pegar a quantidade de elementos presente no
                                                         // vetor

    int qtdELEMENTOS = 0;

    for (int i = 0; i < vetor.length; i++) {

      if (vetor[i] != null) {

        qtdELEMENTOS++;

      } else {
        i = vetor.length;
      }

    }

    return qtdELEMENTOS;

  }

  public static void ordenarIDIOMA(String[] todasasentradas, String[] paisDeorigem, String[] nomedaSerie) {// Explicação
    // dessa funcao
    // no
    // cabeçalho.

    int qtdELEMENTOS = quantidadeElementos(todasasentradas);
    int j = 0;
    String tmp = "";
    String tmpTUDO = "";
    String tmpNOME = "";
    boolean marcadorpodefazerop = false;
    boolean marcadorIDpodefazerop = false;
    int contador = 0;
    for (int i = 1; i < qtdELEMENTOS; i++) {

      tmp = paisDeorigem[i].toString();// pega a string que vai ser testada
      tmpTUDO = todasasentradas[i].toString();
      tmpNOME = nomedaSerie[i].toString();
      j = i - 1;
      marcadorpodefazerop = false;

      marcadorpodefazerop = palavrasCRESCENTES(paisDeorigem[j], tmp);// testa com a posicao seguinte dela se ela é uma
                                                                     // canditada possivel para ser trocada
      contador = j;// contador pega a posicao na qual foi pega
      while (j >= 0 && marcadorpodefazerop == true) {// se contador for >=0 e ela for canditada a ser trocada entra no
                                                     // while

        String str1 = paisDeorigem[j].toString();// aqui o insercao vai ter que testar com todos os elementos que vem
                                                 // antes do elemento testado, essa string vai pegar todos esses
                                                 // elementos

        marcadorIDpodefazerop = palavrasCRESCENTES(str1, tmp);// testa cada elemento antes da string a ser trocada com a
                                                              // string ser trocada, quando achar um local que ela está
                                                              // maior que tmp ela vai fazendo j-- e contador--, quando
                                                              // ela encontrar um string que nao é mais sucestivel a
                                                              // trocar ele da false. Em quanto for true ele vai fazendo
                                                              // shift dos elementos do array, tem j e contador pq para
                                                              // sair do array j tem que ir até 0, e contador que seta
                                                              // onde vai ser colocado a string tmp

        if (marcadorIDpodefazerop == true) {// faz o

          paisDeorigem[contador + 1] = paisDeorigem[contador];
          todasasentradas[contador + 1] = todasasentradas[contador];
          nomedaSerie[contador + 1] = nomedaSerie[contador];
          contador--;
        }
        j--;

      }

      if (marcadorpodefazerop == true) {// copia tmp para determinada posicao

        paisDeorigem[contador + 1] = tmp;
        todasasentradas[contador + 1] = tmpTUDO;
        nomedaSerie[contador + 1] = tmpNOME;
      }
    }

  }

  public static void ordenarNOME(String[] todasasentradas, String[] paisdeOrigem, String[] nomedaSerie) {// Essa função
                                                                                                         // ordenao nome

    // Essa funcao faz a mesma coisa q a idioma porem com nome, so que aqui tem uma
    // coisa diferente.

    int qtdELEMENTOS = quantidadeElementos(nomedaSerie);
    String tmpTUDO = "";
    String tmp = "";
    String tmpPAIS = "";
    boolean marcadorpodefazerop = false;
    boolean marcadorNOMEpodefazerop = false;
    int contador = 0;

    for (int i = 1; i < qtdELEMENTOS; i++) {

      tmp = nomedaSerie[i].toString();
      tmpTUDO = todasasentradas[i].toString();
      tmpPAIS = paisdeOrigem[i].toString();
      marcadorpodefazerop = false;
      int j = i - 1;

      if (paisdeOrigem[j].contains(paisdeOrigem[i])) {// Os paises tem que ser o mesmo para passar para dentro do if

        marcadorpodefazerop = palavrasCRESCENTES(nomedaSerie[j], tmp);
        contador = j;
        while ((j >= 0) && (marcadorpodefazerop == true)) {
          marcadorNOMEpodefazerop = false;
          if (paisdeOrigem[j].contains(paisdeOrigem[j + 1])) {// Quando tiver testando o da posicao tmp ate 0 tem que
                                                              // testar se os paises sao iguais dnv

            String strj = nomedaSerie[j].toString();

            marcadorNOMEpodefazerop = palavrasCRESCENTES(strj, tmp);

            if (marcadorNOMEpodefazerop == true) {

              nomedaSerie[contador + 1] = nomedaSerie[contador];
              todasasentradas[contador + 1] = todasasentradas[j];
              paisdeOrigem[contador + 1] = paisdeOrigem[contador];
              contador--;
            }

            j--;

          } else {// quando o pais for diferente ele para de testar
            j = -1;
          }
        }

        if (marcadorpodefazerop == true) {// e faz a troca

          nomedaSerie[contador + 1] = tmp;
          todasasentradas[contador + 1] = tmpTUDO;
          paisdeOrigem[contador + 1] = tmpPAIS;

        }

      }
    }

  }

  public static boolean palavrasCRESCENTES(String um, String dois) {

    // Essa função analisa sempre as 2 palavras posicao por posicao.
    // Ela faz isso pegando o tamanho da string menor e analisando todas as letras
    // das 2 string até esse numero, para o for nao comparar a letra que tem a mais
    // na string maior com vazio.
    // Depois ele tem que sempre ignorar letras de espaços que não são comparados.
    // Ai ele pega sempre a letra na posicao 0 da string 1 com a letra da posicao 0
    // da string 2, se a primeira letra que aparecer diferente da string 2 com a
    // string 1 for menor que a letra diferente da string 1, ele transforma em true
    // a resposta, deixando a palavra presente na casa dois da função habilidade
    // para ser trocado com a string presente na casa um, isso quer dizer que ordem
    // alfabetica, a string dois vem antes da string um.
    // Se for achando as letras diferentes e string1 < string2 ele termina a funcao
    // pois não precisa ser feita a troca

    char[] letraSTR1 = new char[50];
    letraSTR1 = um.toCharArray();
    int valorSTR1 = 0;
    char[] letraSTR2 = new char[50];
    letraSTR2 = dois.toCharArray();
    int valorSTR2 = 0;
    boolean resp = false;

    int valormenor = 1000;

    int tam1 = um.length();
    int tam2 = dois.length();
    int tamanhofor = 0;

    if (tam1 < tam2) {

      tamanhofor = tam1;

    }

    if (tam2 < tam1) {

      tamanhofor = tam2;

    }

    if (tam1 == tam2) {

      tamanhofor = tam1;

    }

    for (int i = 0; i < tamanhofor; i++) {

      if (letraSTR1[i] != ' ' && letraSTR2[i] != ' ') {

        valorSTR1 = (int) letraSTR1[i];
        valorSTR2 = (int) letraSTR2[i];
      }

      if (valorSTR1 > valorSTR2) {

        if (valormenor > valorSTR2) {

          valormenor = valorSTR2;
          resp = true;
          i = letraSTR2.length;
        }
      }

      if (valorSTR1 < valorSTR2) {

        i = tamanhofor;

      }
    }

    return resp;

  }

  public static void Imprimir(String[] todasasentradas) {

    int qtdELEMENTOS = quantidadeElementos(todasasentradas);

    for (int i = 0; i < qtdELEMENTOS; i++) {

      System.out.println(todasasentradas[i]);

    }

  }

  public static void main(String[] args) {

    // StringBuilder entradapasta = new StringBuilder("series/");

    String entrada;
    entrada = MyIO.readLine(); // Faz a entrada do nome do arquivo. (EX 24.html)
    String[] todasasentradas = new String[100];// vetor com todas os elementos da classe
    String[] idioma = new String[100];// vetor com o elementos pais
    String[] nomedaSerie = new String[100];// vetor com elemento nome
    int contadorentrada = 0;
    // entradapasta.append(entrada);
    // System.out.println(entradapasta);

    SerieINSERCAO nt = new SerieINSERCAO();// Faz a ligacao com a classe
    while (!(entrada.equals("FIM"))) {// roda até entrada ser digitado FIM

      try {

        // MEU DIRETORIO
        // "/mnt/d/PASTAS_AREA_DE_TRABALHO/Faculdade_4_Periodo/AEDS2REMAKE/AEDSPRATICO/tp02/series/"

        BufferedReader in = new BufferedReader(new FileReader("/tmp/series/" + entrada));
        // aqui as series estão localizadas na pasta series, a entrada é o nome do
        // arquivo que será adicionado ao diretório serie/(NOME_DO_ARQUIVO)
        String str;
        while ((str = in.readLine()) != null) {

          // System.out.println(str);

          // NESSA PARTE CADA CONTAIS ESTA SETADO PARA IDENTIFICAR A LINHA QUE EU QUERO
          // BUSCAR O NOME, FORMATO ETC, ALGUMAS LINHA TEM QUE PARAR NELAS E LER MAIS UMA
          // ONDE ESTÁ LOCALIZADO A MINHA LINHA DESEJADA, QUANDO ELE ENCONTRA A LINHA, ELE
          // ACIONA A CLASSE E MANDA A STRING ENCONTRADA PRA CLASSE, E LOGO EM SEGUIDA ELE
          // ACIONA O MÉTODO BUSCAR DA LINHA ENCONTRADA, QUE VAI TER A FUNÇÃO DE LIMPAR A
          // LINHA QUE ESTÁ COM VÁRIOS ELEMENTOS HTML, SOBRANDO ASSIM SOMENTE A STRING
          // DESEJADA COMO O NOME DA SÉRIE, O FORMATO ETC

          if (str.contains("firstHeading")) {// buscar o nome

            nt.setNome(str);// enviar a string
            nt.buscanome();// fazer a busca e filtro na string enviada

          }

          if (str.contains(
              "<td scope=\"row\" style=\"vertical-align: top; text-align: left; font-weight:bold;\">Formato</td>")) {// BUSCAR
                                                                                                                     // O
                                                                                                                     // FORMATO
            str = in.readLine();
            nt.setFormato(str);
            nt.buscaformato();
          }

          if (str.contains(
              "<td scope=\"row\" style=\"vertical-align: top; text-align: left; font-weight:bold;\">Duração</td>")) {// BUSCAR
                                                                                                                     // A
                                                                                                                     // DURAÇÃO

            str = in.readLine();
            nt.setDuracao(str);
            nt.buscaduracao();

          }

          if (str.contains(
              "<td scope=\"row\" style=\"vertical-align: top; text-align: left; font-weight:bold;\">País de origem</td>")) {// BUSCAR
                                                                                                                            // O
                                                                                                                            // PAIS
                                                                                                                            // DE
                                                                                                                            // ORIGEM
            str = in.readLine();
            nt.setPais(str);
            nt.buscapais();
          }

          if (str.contains(
              "<td scope=\"row\" style=\"vertical-align: top; text-align: left; font-weight:bold;\">Idioma original</td>")) {// BUSCAR
                                                                                                                             // O
                                                                                                                             // IDIOMA

            str = in.readLine();
            nt.setIdioma(str);
            nt.buscaidioma();

          }

          if (str.contains(
              "<td scope=\"row\" style=\"vertical-align: top; text-align: left; font-weight:bold;\">Emissora de televisão original</td>")) {// BUSCAR
                                                                                                                                            // A
                                                                                                                                            // EMISSORA
            str = in.readLine();
            nt.setEmissora(str);
            nt.buscaemissora();

          }

          if (str.contains(
              "<td scope=\"row\" style=\"vertical-align: top; text-align: left; font-weight:bold;\">Transmissão original</td>")) {// BUSCAR
                                                                                                                                  // A
                                                                                                                                  // TRANSMISSAO
            str = in.readLine();
            nt.setTrasmissao(str);
            nt.buscatrasmissao();
          }

          if (str.contains(
              "<td scope=\"row\" style=\"vertical-align: top; text-align: left; font-weight:bold;\">N.º de temporadas</td>")) {// BUSCAR
                                                                                                                               // O
                                                                                                                               // NUMERO
                                                                                                                               // DE
                                                                                                                               // TEMPORADAS
            str = in.readLine();
            nt.setNtemporadas(str);
            nt.buscaNtemporadas();

          }

          if (str.contains(
              "<td scope=\"row\" style=\"vertical-align: top; text-align: left; font-weight:bold;\">N.º de episódios</td>")) {// BUSCAR
                                                                                                                              // O
                                                                                                                              // NUMERO
                                                                                                                              // DE
                                                                                                                              // EPISODIOS
            str = in.readLine();
            nt.setNepisodio(str);
            nt.buscaNepisodio();

          }

        }
        in.close();

      } catch (IOException e) { // CASO NAO ENCONTRE O ARQUIVO RETORNA O ERRO
        System.out.println("ERROR IOEXCEPTION");
      }

      nt.Concatenar();
      // System.out.println(nt.getConcatenado());
      todasasentradas[contadorentrada] = nt.getConcatenado();
      idioma[contadorentrada] = nt.getIdioma();
      nomedaSerie[contadorentrada] = nt.getNome();
      contadorentrada++;

      entrada = MyIO.readLine();// E PEDE PRA ESCREVER O NOME DO NOVO ARQUIVO, SE FOR "FIM" ELE TERMINA O
                                // PROGRAMA

    }

    ordenarIDIOMA(todasasentradas, idioma, nomedaSerie);
    ordenarNOME(todasasentradas, idioma, nomedaSerie);
    Imprimir(todasasentradas);
    // System.out.println("ACABOU");

  }

}