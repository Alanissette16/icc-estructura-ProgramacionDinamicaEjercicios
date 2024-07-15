package Ejercicio;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
 * Implementa un método para devolver todos los subconjuntos de un arreglo de enteros
 * 
 * Se puede sin recursividad
 * Ejemplo:
 *  Input: [1,2,3]
 *
 *  Output:
 *    [
 *      [1,2,3],
 *      [1,2],
 *      [1,3],
 *      [2,3],
 *      [1],
 *      [2],
 *      [3],
 *      []
 *    ]
 * 
 * El  metodo me debe devolver una lista de listas de enteros. 
 * Se puede usar varios metodos 
 * 
 * Ecoja la mejor estructura de datos para que sea mas eficiente
*/
public class EjercicioUno {

    public List<List<Integer>> subsets(List<Integer> set) {
        Set<List<Integer>> resultSet = new HashSet<>();
        int n = set.size();
        int subsetCount = 1 << n; // 2^n

        for (int i = 0; i < subsetCount; i++) {
            List<Integer> subset = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) != 0) {
                    subset.add(set.get(j));
                }
            }
            resultSet.add(subset);
        }

        return new ArrayList<>(resultSet);
       
        /*List<List<Integer>> subsets = new ArrayList<>();
        subsets.add(new ArrayList<Integer>());
        for(Integer element : set){
            addSetByElement(element, subsets);
        }
        return subsets;

        private void addSetByElement(Integer element, List<List<Integer>> subsets) {
        //n = tamaño de la coleccion
        int n = subsets.size();
        for(int i = 0; i<n; i++){
            List<Integer> newSubset = new ArrayList<Integer>(subsets.get(i));
            newSubset.add(element);
            subsets.add(newSubset);
        }
    }
     */

    }

    

}
