package javapplication02;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class menorNum {

	public static void main(String[] args) {
		
		int[] nums = new int[5];
		int menor = 0;
		
		for(int i=0; i < nums.length; i++) {
			JOptionPane.showInputDialog("Digite 15 números: ");
		}
	
		Arrays.sort(nums);
		
		menor = nums[0];
		
		/*JOptionPane.showMessageDialog(null, "O menor número é: " + menor);*/
		
		System.out.println(menor);

	}

}
