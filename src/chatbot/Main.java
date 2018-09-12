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
      
        while(!question.equals("exit"))
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
        
    lut = new String[21][2];
        
        lut[0][0] = "Bem e você?";
        lut[0][1] = "Estou bem, como posso te ajudar?";
    
        lut[1][0] = "Como você está?";
        lut[1][1] = "Estou bem e você?";
        
        lut[2][0] = "Estou bem";
        lut[2][1] = "Que ótimo, em que posso ajudar?";
        
        lut[3][0] = "Tudo bom?";
        lut[3][1] = "Tudo ótimo e com você?";
        
        lut[4][0] = "Qual é a capital do nosso país?";
        lut[4][1] = "Brasília?";
        
        lut[5][0] = "";
        lut[5][1] = "";
        
        lut[6][0] = "";
        lut[6][1] = "";
        
        lut[7][0] = "";
        lut[7][1] = "";
        
        lut[8][0] = "";
        lut[8][1] = "";
        
        lut[9][0] = "";
        lut[9][1] = "";
        
        lut[10][0] = "";
        lut[10][1] = "";
        
        lut[11][0] = "";
        lut[11][1] = "";
        
        lut[12][0] = "";
        lut[12][1] = "";
        
        lut[13][0] = "";
        lut[13][1] = "";
        
        lut[14][0] = "";
        lut[14][1] = "";
        
        lut[15][0] = "";
        lut[15][1] = "";
        
        lut[16][0] = "";
        lut[16][1] = "";
        
        lut[17][0] = "";
        lut[17][1] = "";
        
        lut[18][0] = "";
        lut[18][1] = "";
        
        lut[19][0] = "";
        lut[19][1] = "";
        
        lut[20][0] = "";
        lut[20][1] = "";
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



