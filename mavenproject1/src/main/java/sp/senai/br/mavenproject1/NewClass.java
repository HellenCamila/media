/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sp.senai.br.mavenproject1;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class NewClass {
    
    
	public static void main(String[] args) {
    double[] notas = new double[4];
    Scanner sc = new Scanner(System.in);
    System.out.println("Por favor insira as quatro notas do aluno:");
    for (int i = 0; i < notas.length; i++) {
      notas[i] = sc.nextDouble();
    }
    double media = calcularMedia(notas);
    String situacao = verificarSituacao(media);
    exibirResultados(media, situacao);
  }

  public static void inserirNotas(double[] notas) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Por favor insira as notas do aluno:");
    for (int i = 0; i < notas.length; i++) {
      notas[i] = sc.nextDouble();
    }
  }

  public static double calcularMedia(double[] notas) {
    double soma = 0;
    for (int i = 0; i < notas.length; i++) {
      soma += notas[i];
    }
    double media = soma / notas.length;
    return media;
  }

  public static String verificarSituacao(double media) {
    if (media >= 6) {
      return "Aprovado";
    } else {
      return "Reprovado";
    }
  }

  public static void exibirResultados(double media, String situacao) {
    System.out.println("Média final desse aluno é de: " + media);
    System.out.println("Situação do aluno: " + situacao);
  }
}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    