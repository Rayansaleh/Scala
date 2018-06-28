//Print the original list from the start and stop point given in parameters

def extractSlice[A](start: Int, stop: Int, elements: List[A]): List[A] = {

  elements drop start take (stop - (start max 0))

}

val exl: List[Char] = List('a', 'a', 'a', 'a', 'a', 'a', 'b', 'b', 'a', 'a','c')

extractSlice(3, 7, exl)