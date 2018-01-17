package Snippets;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class Voting {
	static int max = 0;
	static int i, n;
static String winner="";
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number of voters");
		n = sc.nextInt();
		String cand[] = new String[n + 1];
		for (i = 0; i < cand.length; i++) {
			cand[i] = sc.nextLine();
		}
		sc.close();
		HashMap<String, Integer> hs = new HashMap<>();

		for (int i = 0; i < cand.length; i++) {

			if (hs.containsKey(cand[i])) {
				hs.put(cand[i], hs.get(cand[i]) + 1);
			}

			else {
				hs.put(cand[i], 1);
			}
		}

		ArrayList<String> win = new ArrayList<>();
		for (int i = 0; i < cand.length; i++) {
			if (hs.get(cand[i]) > max) {
				if (win.contains(cand[i])) {

					max = hs.get(cand[i]);
				} else {

					max = hs.get(cand[i]);
					win.add(cand[i]);
				}
			}

			else if (hs.get(cand[i]) == max) {
				if (win.contains(cand[i])) {

					max = hs.get(cand[i]);
				} else {

					max = hs.get(cand[i]);
					win.add(cand[i]);
				}
			}

		}
	
		for (int k = 0; k < cand.length; k++) {
			if (max > hs.get(cand[k])) {
				Collections.sort(win);

			 winner = win.get(win.size() - 1);
			}
			else if(max== hs.get(cand[k]))
			{
				winner = (cand[k]);
			}
		}
		
		System.out.println(winner +" has won the election");
	}
	}

