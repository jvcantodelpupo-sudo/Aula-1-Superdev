import java.util.Scanner;

public class Tedio { //na aula de HTML 
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in)
        Integer select;
        String userIn = scn.nextLine();
        select = Integer.valueOf(userIn);
        switch(select) {
            case 1:
                System.out.println("Já terminei a minha tarefa, ele está\nensinando os outros alunos sobre identação");
                break;
            case 2:
                System.out.println("Ele ensinou sobre citações, listas e\nlistas aninhadas, falta 1h para o almoço");
                break;
            case 3:
                System.out.println("Acho que ele não vai pedir mais nada.\nFaltam 30min para o almoço e já teminei\ntodas as minhas tarefas até agora");
                break;
            case 4:
                System.out.println("Aula depois do almoço. Eu estava errado,\n ele passou uma tarefa simples antes de\nsairmos, minha cabeça dói");
                break;
            case 5: 
                System.out.println("Ainda faltam 2 horas para irmos embora,\nnão aguento mais esse lugar. Pelo menos\n agora sei fazer tabelas e cabeçalhos\nem html")
        }
            
    }
}