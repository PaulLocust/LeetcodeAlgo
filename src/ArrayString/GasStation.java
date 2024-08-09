package ArrayString;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
 * 134. Gas Station
 */
public class GasStation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] gas =  {5,8,2,8};
		int[] cost = {6,5,6,6};
		int sumCost = 0;
        for (int c : cost) {
            sumCost += c;
        }
        int sumGas = 0;
        for (int g : gas) {
            sumGas += g;
        }
        // Если сумма затрат на путь превышает сумму всего доступного бензина на станциях, то пройти этот
        // путь невозможно
        if (sumCost > sumGas) {
            System.out.println(-1);
        }
        
        /*
         * Идея проста, нужно проитерировать весь массив gas, чтобы выявить те станции от который невозможно 
         * доехать до следующей, как только разность gas[i] и cost[i] становится отрицательной
         * мы обнуляем переменную, отвечающую за сумму всех заправок с учетом затрат currentGas,
         * и делаем startingIndex = i + 1, то есть перескакиваем проблемный участок пути и начинаем с той
         * станции до которой не смогли доехать в текущую итерацию.
         */
        int currentGas = 0;
        int startingIndex = 0;

        for (int i = 0; i < gas.length; i++) {
            currentGas += gas[i] - cost[i];
            if (currentGas < 0) {
                currentGas = 0;
                startingIndex = i + 1;
            }
        }
        System.out.println(startingIndex);
		
		
		
	}

}
