public class Automata {
	public static void main(String [] args) {
		//вход
		int [] input = new int[]{0, 0, 1, 0};
		//функция переходов
		int [][] f = new int[][]{{2, 1, 2, 1},{1, 1, 3, 3}};
		//текущее состояние. Начальное - 0
		int s = 0;
		
		//работа автомата
		for (int i = 0; i < input.length; i++)
			s = f[input[i]][s];
			
		//проверка того, что состояние - финальное
		if (s == 3)
			System.out.println("YES");
		else
			System.out.println("NO");
	}
}