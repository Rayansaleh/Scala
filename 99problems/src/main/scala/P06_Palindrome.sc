//Print whether yes or no the list is a palindrome

def palindrome[A](elements: List[A]): Boolean = { elements == elements.reverse }

val exl: List[Int] = List(1, 2, 3, 2, 1)

palindrome(exl)