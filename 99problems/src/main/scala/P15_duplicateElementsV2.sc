//Duplicate every element of the list depending on the number of time given

def duplicateElementsV2[A](nb: Int, elements: List[Char]): List[Char] = {

  elements flatMap {case c: Char => List.fill(nb)(c).mkString}

}

val exl: List[Char] = List('a', 'a', 'a', 'a', 'a', 'a', 'b', 'b', 'a', 'a','c')

duplicateElementsV2(2, exl)