import Anagramas._
//Lista de ocurrencia de una palabra
lOcPal("")
lOcPal("palindromo")
lOcPal("anagrama")
lOcPal("esternocleidomastoideo")
lOcPal("electroencefalografista")

//Lista de ocurrencias de una frase
lOcFrase(List("colorin","colorado","este","cuento","se","a","acabado"))
lOcFrase(List("en","algun","lugar","de","la","mancha"))
lOcFrase(List("cuyo","nombre","no","quiero","acordarme"))
lOcFrase(List("cria","cuervos","y","te","comeran","los","ojos"))
lOcFrase(List("los","comediantes","son","aquellos","que","comen","un","dia","antes"))

//Anagramas de una palabra
anagramasDePalabra("caro")
anagramasDePalabra("")
anagramasDePalabra("y")
anagramasDePalabra("lata")
anagramasDePalabra("sosa")

//Combinaciones de una lista de ocurrencias
combinaciones(List(('a', 2), ('b', 2),('c',3)))
combinaciones(List(('x', 1), ('y', 2),('z',4)))
combinaciones(List(('z',4)))
combinaciones(Nil)
combinaciones(lOcPal("hola"))

//Complemento de una lista de ocurrencias
complemento(List(('a', 2), ('b', 2),('c',3)), Nil)
complemento(List(('z',4)), List(('z',3)))
complemento(List(('x', 1), ('y', 2),('z',4)), List(('x',1)))
complemento(lOcPal("hola"), lOcPal("ola"))
complemento(lOcFrase(List("en","algun","lugar","de","la","mancha")), lOcFrase(List("la","mancha","de","algun","lugar")))

//Anagramas de una frase
anagramasDeFrase(List("ramo", "de", "rosa"))
anagramasDeFrase(List("sol", "y", "luna"))
anagramasDeFrase(Nil)
anagramasDeFrase(List("tala", "el", "ramo"))
anagramasDeFrase(List("soy","yo"))

