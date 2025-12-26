package neetcode

import kotlin.io.println

/**Remove Element
You are given an integer array nums and an integer val. Your task is to remove all occurrences of val from nums in-place.

After removing all occurrences of val, return the number of remaining elements, say k, such that the first k elements
of nums do not contain val.

Note:

The order of the elements which are not equal to val does not matter.
It is not necessary to consider elements beyond the first k positions of the array.
To be accepted, the first k elements of nums must contain only elements not equal to val.
Return k as the final result.

Example 1:

Input: nums = [1,1,2,3,4], val = 1

Output: [2,3,4]
Explanation: You should return k = 3 as we have 3 elements which are not equal to val = 1.

Example 2:

Input: nums = [0,1,2,2,3,0,4,2], val = 2

Output: [0,1,3,0,4]
Explanation: You should return k = 5 as we have 5 elements which are not equal to val = 2.

Constraints:

0 <= nums.length <= 100
0 <= nums[i] <= 50
0 <= val <= 100
 **/


fun main() {
    removeElement(
        nums = intArrayOf(1, 1, 2, 3, 4),
        value = 1
    )
}

//two pointers
//duas variáveis = o leitor (i): ele vai olhar cada elemento, um por um, do início ao fim / o escritor (k): ele só move quando o
//leitor encontra algo que NÃO é lixo. Ele marca onde o próximo elemento válido deve ser colocado

fun removeElement(nums: IntArray, value: Int): Int {

    if (nums.isEmpty()) {
        return 0
    }
    //k = é o escritor. Começa na posição zero
    var k = 0
    //o i é o leitor, percorrendo o array (O(n))
    for (i in nums.indices) {
        //se o leitor viu NÃO é o valor que quero remover. Quero achar o elemento que é IGUAL ao Val e remover
        if (nums[i] != value) {
            //escrevemos esse valor na posicao do escritor
            nums[k] = nums[i]
            //e movemos o escritor para o próximo elemento
            k++
        }
        //se for o valor para remover, o leitor apenas ignora e segue em frente.
        //o escritor fica parado esperando algo válido
    }
    //no fim, k será exatamente a quantidade de elementos que restaram!
    println("Restam $k elementos")
    return k
}