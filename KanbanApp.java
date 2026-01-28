package br.sp.uninove.kanban;

import java.util.Scanner;
import java.util.List;

public class KanbanApp {
    public static void main(String[] args) {
        GerenciadorTarefas gerenciador = new GerenciadorTarefas();
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("🏢 KANBAN JAVA ÁGIL");
        
        while (true) {
            System.out.print("\n[1]Listar [2]Adicionar [3]Mover [4]Métricas [5]Sair: ");
            String opcao = scanner.nextLine();
            
            switch (opcao) {
                case "1":
                    gerenciador.listarQuadro();
                    break;
                case "2":
                    System.out.print("Título: ");
                    String titulo = scanner.nextLine();
                    System.out.print("Prioridade (ALTA/MÉDIA/BAIXA): ");
                    Prioridade prio = Prioridade.valueOf(scanner.nextLine().toUpperCase());
                    gerenciador.adicionarTarefa(titulo, prio);
                    break;
                case "3":
                    gerenciador.moverTarefa();
                    break;
                case "4":
                    gerenciador.mostrarMetricas();
                    break;
                case "5":
                    gerenciador.salvar();
                    System.out.println("👋 Até logo!");
                    return;
            }
        }
    }
}
