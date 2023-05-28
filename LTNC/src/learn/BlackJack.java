package learn;

import java.util.ArrayList;
import java.util.Scanner;

public class BlackJack {

	public static ArrayList<Integer> take52Cards() {
		ArrayList<Integer> deckOfCards = new ArrayList<Integer>();
		for (int i = 4; i < 56; i++) {
			deckOfCards.add(i);
		}
		return deckOfCards;
	}

	public static int draw1Card(ArrayList<Integer> theRestOfTheDeck) {
		int randomCard = (int) (Math.random() * theRestOfTheDeck.size());
		int cardIsDrawn = theRestOfTheDeck.get(randomCard);
		theRestOfTheDeck.remove(randomCard);
		return cardIsDrawn;
	}

	public static String cardAnalysisPoint(int card) {
		int cardPoints = card / 4;
		if (cardPoints == 13) {
			return ("K");
		} else if (cardPoints == 12) {
			return ("Q");
		} else if (cardPoints == 11) {
			return ("J");
		} else if (cardPoints == 1) {
			return ("A");
		} else {
			return (cardPoints + "");
		}

	}

	public static String cardAnalysisSuit(int card) {
		int suit = card % 13;
		if (suit == 1) {
			return "Hearts";
		} else if (suit == 2) {
			return "Diamonds";
		} else if (suit == 3) {
			return "Clubes";
		} else {
			return "Spades";
		}

	}

	public static void cardAnalys(int card) {
		System.out.println(cardAnalysisPoint(card) + " " + cardAnalysisSuit(card));
	}

	public static int countA(ArrayList<Integer> deck) {
		int count = 0;
		for (int i = 0; i < deck.size(); i++) {
			if (deck.get(i) / 4 == 1) {
				count += 1;
			}
		}
		return count;
	}

	public static int sumArrayList(ArrayList<Integer> deck) {
		int count = 0;
		for (int i = 0; i < deck.size(); i++) {
			if (deck.get(i) / 4 > 10) {
				count += 10;
			} else {
				count += deck.get(i) / 4;
			}
		}
		return count;
	}

	public static int currentPonit(ArrayList<Integer> deck) {
		if (deck.size() == 2) {
			if (deck.get(0) / 4 == 1 && deck.get(1) / 4 == 1) {
				System.out.println("Double Aces");
				return 21;
			} else if ((deck.get(0) / 4 == 1 && deck.get(1) / 4 >= 10 || deck.get(0) / 4 >= 10 && deck.get(1)
					/ 4 == 1)) {
				System.out.println("Black Zack");
				return 21;
			} else if (deck.get(0) / 4 == 1 || deck.get(1) / 4 == 1) {
				System.out.println(10 + sumArrayList(deck));
				return 10 + sumArrayList(deck);
			} else {
				System.out.println(sumArrayList(deck));
				return sumArrayList(deck);
			}
		} else if (deck.size() == 3) {
			if (countA(deck) == 0) {
				System.out.println(sumArrayList(deck));
				return sumArrayList(deck);
			} else if (countA(deck) == 1) {
				int sum = 10 + sumArrayList(deck);

				if (sum > 21) {
					sum--;
				}
				if (sum > 21) {
					sum -= 9;
				}

				System.out.println(sum);
				return sum;
			} else {
				int sum = 20 + sumArrayList(deck);
				if (sum > 21) {
					sum--;
				}
				if (sum > 21) {
					sum -= 2;
				}
				if (sum > 21) {
					sum -= 10;
				}
				if (sum > 21) {
					sum -= 11;
				}
				if (sum > 21) {
					sum -= 20;
				}
				System.out.println(sum);
				return sum;
			}
		} else {
			System.out.println(sumArrayList(deck));
			return sumArrayList(deck);
		}
	}

	public static ArrayList<Integer> playingMachine(ArrayList<Integer> deck) {

		int newlyWithdrawnCard;

		ArrayList<Integer> cardOfMachine = new ArrayList<Integer>();
		System.out.print("Machine first card is: ");
		newlyWithdrawnCard = draw1Card(deck);
		cardOfMachine.add(newlyWithdrawnCard);
		cardAnalys(newlyWithdrawnCard);

		System.out.print("Machine second card is: ");
		newlyWithdrawnCard = draw1Card(deck);
		cardOfMachine.add(newlyWithdrawnCard);
		cardAnalys(newlyWithdrawnCard);
		System.out.print("Total machine score is: ");
		for (int i = 0; i < 3; i++) {
			if (currentPonit(cardOfMachine) < 16) {
				newlyWithdrawnCard = draw1Card(deck);
				cardOfMachine.add(newlyWithdrawnCard);
				System.out.print("The machine's next card is: ");
				cardAnalys(newlyWithdrawnCard);
				System.out.print("Your machine score is: ");
			} else if (i == 2) {
				currentPonit(cardOfMachine);
			} else {
				break;
			}
		}

		return cardOfMachine;
	}

	public static int resuild(ArrayList<Integer> player, ArrayList<Integer> machine) {
		if (player.size() == 2 && player.get(0) / 4 == 1 && player.get(1) / 4 == 1) {
			if (machine.get(0) / 4 == 1 && machine.get(1) / 4 == 1 && machine.size() == 2) {
				return 0;
			} else {
				return 1;
			}
		} else if (machine.size() == 2 && machine.get(0) / 4 == 1 && machine.get(1) / 4 == 1) {
			if (player.get(0) / 4 == 1 && player.get(1) / 4 == 1 && player.size() == 2) {
				return 0;
			} else {
				return -1;
			}
		} else if (player.size() == 2
				&& (player.get(0) / 4 == 1 && player.get(1) / 4 >= 10 || player.get(0) / 4 >= 10
						|| player.get(1) / 4 == 1)) {

			if (machine.get(0) / 4 == 1 && machine.get(1) / 4 >= 10 || machine.get(0) / 4 >= 10
					|| machine.get(1) / 4 == 1) {
				return 0;
			} else {
				return 1;
			}

		} else if (machine.size() == 2
				&& (machine.get(0) / 4 == 1 && machine.get(1) / 4 >= 10 || machine.get(0) / 4 >= 10
						&& machine.get(1) / 4 == 1)) {
			if (player.get(0) / 4 == 1 && player.get(1) / 4 >= 10 || player.get(0) / 4 >= 10
					&& player.get(1) / 4 == 1) {
				return 0;
			} else {
				return -1;
			}

		} else if (player.size() == 5 && sumArrayList(player) <= 21) {
			if (machine.size() == 5 && sumArrayList(machine) <= 21) {
				return 0;
			} else {
				return 1;
			}
		} else if (machine.size() == 5 && sumArrayList(machine) <= 21) {
			if (player.size() == 5 && sumArrayList(player) <= 21) {
				return 0;
			} else {
				return -1;
			}
		} else if (sumArrayList(player) <= 21 && sumArrayList(machine) > 21) {
			return 1;
		} else if (sumArrayList(player) > 21 && sumArrayList(machine) <= 21) {
			return -1;
		} else if (sumArrayList(player) > 21 && sumArrayList(machine) > 21) {
			return 0;
		} else if (sumArrayList(player) > sumArrayList(machine)) {
			return 1;
		} else if (sumArrayList(player) < sumArrayList(machine)) {
			return -1;
		} else {
			return 0;
		}

	}

	public static void playBlackJack(int money) {
		Scanner sc = new Scanner(System.in);
		while (money > 0) {
			System.out.println(money + "k");
			ArrayList<Integer> deck = take52Cards();
			ArrayList<Integer> cardOfPlayer = new ArrayList<Integer>();
			int newlyWithdrawnCard;
			String getMoreCards;

			System.out.print("Enter the amount you want to bet: ");
			int bet = sc.nextInt();

			while (bet > money) {
				System.out.println("Bet is more than the amount available: ");
				System.out.print("Enter again money: ");
				bet = sc.nextInt();
			}

			System.out.print("Your first card is: ");
			newlyWithdrawnCard = draw1Card(deck);
			cardOfPlayer.add(newlyWithdrawnCard);
			cardAnalys(newlyWithdrawnCard);

			System.out.print("Your second card is: ");
			newlyWithdrawnCard = draw1Card(deck);
			cardOfPlayer.add(newlyWithdrawnCard);
			cardAnalys(newlyWithdrawnCard);
			System.out.print("Your total score is: ");

			if (currentPonit(cardOfPlayer) < 21) {
				System.out.print("Do you want to play for more cards ");
				getMoreCards = sc.next();
				if (getMoreCards.toLowerCase().equals("y") || getMoreCards.toLowerCase().equals("yes")) {
					newlyWithdrawnCard = draw1Card(deck);
					cardOfPlayer.add(newlyWithdrawnCard);
					cardAnalys(newlyWithdrawnCard);
					System.out.print("Your total score is: ");

					if (currentPonit(cardOfPlayer) < 21 && getMoreCards.toLowerCase().equals("y")
							|| getMoreCards.toLowerCase().equals("yes")) {
						System.out.print("Do you want to play for more cards ");
						getMoreCards = sc.next();
						if (getMoreCards.toLowerCase().equals("y") || getMoreCards.toLowerCase().equals("yes")) {
							newlyWithdrawnCard = draw1Card(deck);
							cardOfPlayer.add(newlyWithdrawnCard);
							cardAnalys(newlyWithdrawnCard);
							System.out.print("Your total score is: ");

						}
						if (currentPonit(cardOfPlayer) < 21 && getMoreCards.toLowerCase().equals("y")
								|| getMoreCards.toLowerCase().equals("yes")) {
							System.out.print("Do you want to play for more cards ");
							getMoreCards = sc.next();
							if (getMoreCards.toLowerCase().equals("y") || getMoreCards.toLowerCase().equals("yes")) {
								newlyWithdrawnCard = draw1Card(deck);
								cardOfPlayer.add(newlyWithdrawnCard);
								cardAnalys(newlyWithdrawnCard);
								System.out.print("Your total score is: ");
								currentPonit(cardOfPlayer);

							}
						}
					}
				}

			}
			System.out.println("-------------------------");
			ArrayList<Integer> cardOfMachine = playingMachine(deck);
			int resuild = resuild(cardOfPlayer, cardOfMachine);
			if (resuild == 1) {
				System.out.println("You won");
				money += bet;
			} else if (resuild == -1) {
				System.out.println("you lose");
				money -= bet;
			} else {
				System.out.println("you drew");
			}
			System.out.println("-------------------------");

		}
		sc.close();
	}

	public static void main(String[] args) {
		playBlackJack(1000);
	}
}
