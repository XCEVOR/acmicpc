// 요세푸스 문제
// package boj_1158;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Queue<Integer> numQue = new LinkedList<Integer>();
		Queue<Integer> numJosephus = new LinkedList<Integer>();
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		//
		for (int i = 1; i <= n; i++) {
			numQue.offer(i);
		}
//		System.out.println(numQue.toString());			// TEST PRINT
		
		//
		while (!numQue.isEmpty()) {
			for (int i = 0; i < k - 1; i++) {
				int temp = numQue.poll();
				numQue.offer(temp);
			}
			int jNum = numQue.poll();
			numJosephus.offer(jNum);
		}
//		System.out.println(numJosephus.toString());			// TEST PRINT
		
		// result
		System.out.print("<");
		for (int i = 0; i < n - 1 ; i++) {
			System.out.print(numJosephus.poll() + ", ");
		}
		System.out.print(numJosephus.poll() + ">");

		sc.close();
	}

}
