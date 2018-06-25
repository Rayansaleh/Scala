//Duplicate every element of the list

def duplicateElements[A](elements: List[Char]): List[Char] = {

  elements flatMap {e => List.fill(2)(e).mkString}

}

val exl: List[Char] = List('a', 'a', 'a', 'a', 'a', 'a', 'b', 'b', 'a', 'a','c')

duplicateElements(exl)