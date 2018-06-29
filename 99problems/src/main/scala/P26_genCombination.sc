def genCombination[A, B](elements: List[A])(res: (List[A]) => List[B]): List[B] = elements match {
  case Nil => Nil
  case sublist@(_ :: tail) => res(sublist) ::: genCombination(tail)(res)
}

def combi[A](i: Int, elements: List[A]): List[List[A]] = {
  if (i == 0) List(Nil)
  else genCombination(elements){
    elements => combi(i - 1, elements.tail) map {elements.head :: _}
  }
}

val exl: List[Symbol] = List('a, 'b, 'c, 'e, 'f, 'g, 'h, 'i, 'j, 'k, 'l)

combi(3, exl)