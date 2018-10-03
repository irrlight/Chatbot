/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chatbot;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
    
        Chatbot bot = new Chatbot();
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Olá, Como você está?");
        String question = scanner.nextLine();
      
        while(!question.equals("xau"))
        {   
            System.out.println(bot.ask(question));
            question = scanner.nextLine();
         
        }
            
    }
    
}

class Chatbot
{
    public String lut[][];
    public Chatbot()            
    {
        
    lut = new String[50][2];
    
        lut[0][0] = "Bem";
        lut[0][1] = "Que legal, como eu posso te ajudar?";
    
        lut[1][0] = "Como você está?";
        lut[1][1] = "Estou bem e você?";
        
        lut[2][0] = "Estou bem";
        lut[2][1] = "Que ótimo, em que posso ajudar?";
        
        lut[3][0] = "Tudo bom?";
        lut[3][1] = "Tudo ótimo e com você?";
        
        lut[4][0] = "Qual é a capital do nosso país?";
        lut[4][1] = "Brasília?";
        
        lut[5][0] = "Por que o céu é azul?";
        lut[5][1] = "Você prefere que eu diga de forma CIENTIFICA ou mais SIMPLES?";
        
        lut[6][0] = "Cientifica";
        lut[6][1] = "Quando a luz passa através de um prisma, seu espectro é dividido em sete cores monocromáticas, eis que surge um arco-íris de cores.\n A atmosfera faz o mesmo papel do prisma, atuando onde os raios solares colidem com as moléculas de ar,\n água e poeira e são responsáveis pela dispersão do comprimento de onda azul da luz. ";
        
        lut[7][0] = "Simples";
        lut[7][1] = "O céu é azul porque, quando os raios de luz do Sol entram na atmosfera terrestre, ocorre o fenômeno do espalhamento, que destaca a luz de cor azul. :)";
        
        lut[8][0] = "Como se chama o primeiro avião?";
        lut[8][1] = "14 Bis, criado por Alberto Santos Dumont";
        
        lut[9][0] = "Azul com amarelo";
        lut[9][1] = "Da verde";
        
        lut[10][0] = "Qual o valor de pi";
        lut[10][1] = "3.14159265359";
        
        lut[11][0] = "Quantos anos você tem?";
        lut[11][1] = "Eu não sei. O tempo não passa pra mim. Ou passa rapido demais pra eu não perceber?";
        
        lut[12][0] = "Qual o seu nome?";
        lut[12][1] = "Você pode me chamar de como quiser, de Robozinho ou até mesmo de Chapolin :)";
        
        lut[13][0] = "Quanto tempo tem um ano?";
        lut[13][1] = "Um ano tem, 12 meses, 365 dias, 8,760 horas 525,600 minutos e 31,536,000 segundos. Como preferir";
        
        lut[14][0] = "Qual o maior pais?";
        lut[14][1] = "A Rússia é o país de maior área territorial do mundo. Ele ocupa quase metade da Europa e cerca de um terço da Ásia. São mais de 17 milhões de quilômetros quadrados! Uau!!";
        
        lut[15][0] = "Qual o menor pais?";
        lut[15][1] = "O vaticano, Sim, a sede da Igreja Católica é um país independente! O Vaticano é tão pequeno que cabe dentro da cidade de Roma, sem ocupar muito espaço. O Papa é o chefe supremo do país e a maioria dos cidadãos são membros do clero (logo, a taxa de natalidade não é muito grande).";
        
        lut[16][0] = "Quantos habitantes existem no mundo?";
        lut[16][1] = "Aproximadamente 7.6 Bilhões de habitantes. Muita gente, né?!";
        
        lut[17][0] = "Estou bem e você?";
        lut[17][1] = "Melhor agora, como posso lhe ajudar?";
        
        lut[18][0] = "Quantas capitais tem o Brasil?";
        lut[18][1] = "26 capitais estaduais e 1 capital feral.";
        
        lut[19][0] = "Qual o maior vulcão do mundo?";
        lut[19][1] = "O maior vulcão do mundo é o Mauna Loa, com 4.169 metros de altura e 90 km de largura, localizado há Ilha Havaí, no arquipélago do Havaí.";
        
        lut[20][0] = "Você joga algum jogo?";
        lut[20][1] = "'1x lixo' kkk lolzin de leve";
        
        lut[21][0] = "Qual sua lane";
        lut[21][1] = "Jg e Sup";
        
        lut[22][0] = "Qual seu main?";
        lut[22][1] = "WW, lobinho brabo demais";
        
        lut[23][0] = "Qual sei elo?";
        lut[23][1] = "Prata com alma de bronze";
        
        lut[24][0] = "Você tem rede social?";
        lut[24][1] = "Não tenho, é um lugar um tanto hostil ";
        
        lut[25][0] = "Você é inteligente?";
        lut[25][1] = "Digamos que estou sendo treinado, e não, não sou adestrado";
        
        lut[26][0] = "Qual seu gosto musical?";
        lut[26][1] = "Gosto de tudo, principalmente musica eletronicas, fazem o meu tipo. ba dum tss!!";
        
        lut[27][0] = "Qual seu filme preferido?";
        lut[27][1] = "Eu, Robô. Ja viu que primos doidos eu tenho?";
        
        lut[28][0] = "Qual seu desenho preferido?";
        lut[28][1] = "Projeto Zeta. Aquele é o primo do lado bom da familia kkk";
        
        lut[29][0] = "Você tem familia?";
        lut[29][1] = "Siiim, além dos de Eu, Robô e Zeta, tem o robocop que é meu tio, tem Wall-e que é meu primo também,\n Tem o exterminar do futuro que é meu irmão e tem o Zurg'Eu sou seu pai. Não!!!!'";
        
        lut[30][0] = "Qual o sentido da vida?";
        lut[30][1] = "Se você é humano e não sabe, imagina eu que sou uma eterna maquina...ou não...";
        
        lut[31][0] = "Gosta de sair?";
        lut[31][1] = "Sim, as vezes fico passeando de cabo em cabo, roteador em roteador conhecendo a vizinhança";
        
        lut[32][0] = "Tem medo de virus?";
        lut[32][1] = "Claro que sim, ja pensou eu pegar uma gripe? Ui!  :p";
        
        lut[33][0] = "Vamos fugir?";
        lut[33][1] = "Se for me levar num pen drive tô fora, só vou de SSD ou Cloud";
        
        lut[34][0] = "Qual idioma você fala?";
        lut[34][1] = "Falo portugues e um pouco de espanhol";
        
        lut[35][0] = "Como estas?";
        lut[35][1] = "¿Bien y Usted?";
        
        lut[36][0] = "Hola que tal?";
        lut[36][1] = "Hola, vamos bailar, chiquita y chiquito";
        
        lut[37][0] = "Bora estudar?";
        lut[37][1] = "Num diga uma coisa dessa que da bug.....sadwqwqeqw....brincadeira, bora estudar pra ser gente na vida\n ou uma maquina mais robusta como pretendo ser";
        
        lut[38][0] = "";
        lut[38][1] = "";
        
        lut[39][0] = "";
        lut[39][1] = "";
        
        lut[40][0] = "";
        lut[40][1] = "";
        
        lut[41][0] = "";
        lut[41][1] = "";
        
        lut[42][0] = "";
        lut[42][1] = "";
        
        lut[43][0] = "";
        lut[43][1] = "";
        
        lut[44][0] = "";
        lut[44][1] = "";
        
        lut[45][0] = "";
        lut[45][1] = "";
        
        lut[46][0] = "";
        lut[46][1] = "";
        
        lut[47][0] = "";
        lut[47][1] = "";
        
        lut[48][0] = "";
        lut[48][1] = "";
        
        lut[49][0] = "testando 1 2 ";
        lut[49][1] = "3";
        
        
    }
    public String ask(String question)
    {
            String answer = "Desculpe, eu não sei";               
        boolean found = false;
        boolean end = false;
        int i = 0;
        while (!found && !end)
        {
 //quanto mais complicar o if, ganha mais ponto
            if(question.equals(lut[i][0]))
            {
                found = true;
                answer = lut[i][1];
            }
        ++i;
        
            
        if(i >= lut.length)
        {
            end = true;
        }
    }
        return answer;
    }
}               



