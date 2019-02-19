package com.cards.standalone;
import java.util.Arrays;
import java.util.Scanner;

public class CardTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter number player: ");
		int player = sc.nextInt();
		System.out.print("Please enter number cards: ");
		int card = sc.nextInt();
		sc.nextLine();
	
		Card[][] playercards = new Card[player][card];
		for(int i=0; i<player; i++ ) {
			System.out.println("Please enter cards for player "+(i+1));
			String[] cards = sc.nextLine().split(", ");
			for(int j=0; j<card; j++ ) {
				playercards[i][j] = new Card(cards[j]);
			}
			Arrays.sort(playercards[i]);
		}
		
		Card higher = null;
		int playerwin = 1;
		boolean isChanged = false;
		for(int j=card-1; j>=0; j-- ) {
			if(!isChanged) {
				higher = playercards[0][j];	
			}
			for(int i=1; i<player; i++ ) {
				if( higher.compareTo(playercards[i][j]) < 0 ) {
					higher = playercards[i][j];
					isChanged = true;
					playerwin = i+1;
				}
				if( higher.compareTo(playercards[i][j]) > 0 ) {
					isChanged = true;
				}
			}
			if(isChanged) {
				break;
			}
		}
		
		if(isChanged ) {
			System.out.println("Player "+playerwin+" has won by high card: "+higher);
		}else {
			System.out.println("Match was drawn");
		}
		
		sc.close();
		
	}

}
