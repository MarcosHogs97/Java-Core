package EstruturaDecisao;

import java.util.Scanner;

public class Se {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double valor01 = 0;
		double valor02 = 0;
		double valor03 = 0;
		double valor04 = 0;
		double valor05 = 0;
				
		System.out.println("Informe um numero: ");
		valor01 = sc.nextDouble();
		if(valor01 != 0) {
			System.out.println("Informe um numero: ");
			valor02 = sc.nextDouble();
			}if(valor02 != 0){
				System.out.println("Informe um numero: ");
				valor03 = sc.nextDouble();
				}if(valor03 != 0){
					System.out.println("Informe um numero: ");
					valor04 = sc.nextDouble();
					}if(valor04 != 0){
						System.out.println("Informe um numero: ");
						valor05 = sc.nextDouble();
					}
		if(valor05 != 0){
				valor01 = valor01 + valor02 + valor03 + valor04 + valor05;
				System.out.printf("A soma dos valores foi %.2f",valor01);
		}else {
				System.out.println("Tente novamente");							
		}
		
		sc.close();

	}

}
