package com.bridgelaz;

import java.util.Scanner;

	public class FlipCoin {

			static int headCounter;
			static int tailCounter;

				public static void main(String[] args) {
					// TODO Auto-generated method stub
					float heads=0;
					float tails=0;
					float headPercentage=0;
					float tailPercentage=0;

					Scanner sc = new Scanner(System.in);
					System.out.println("Enter the number of times coin flipped  ");
					int totalCoin = sc.nextInt();
					double flipCoin; 
						for(int i = 0;i < totalCoin; i++){
							flipCoin = Math.random();
							if (flipCoin < 0.5) 
							{
								heads++ ;
								System.out.println("Heads");
							}
							else 
							{
								tails++ ;
								System.out.println("Tails");
							}   
							
						}
						headPercentage =(float)(heads/totalCoin) * 100;
						tailPercentage = (float)(tails/totalCoin) * 100;

						System.out.println("Head percentage :" +headPercentage);
						System.out.println("Tail percentage :" +tailPercentage);
					}
					
			}