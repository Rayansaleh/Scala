def rotateList[A](roll: Int, elements: List[A]): List[A] = {

  val rolltest = if(elements.isEmpty) 0 else (roll % elements.length)
  if(rolltest < 0) rotateList(elements.length + roll, elements)
  else elements.drop(rolltest) ::: elements.take(rolltest)
}

val exl: List[Char] = List('a', 'a', 'a', 'a', 'a', 'a', 'b', 'b', 'a', 'a','c')

rotateList(3, exl)