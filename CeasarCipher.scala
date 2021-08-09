object CeasarCipher{
	def main(args:Array[String]){
		val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
    val key = (scala.io.StdIn.readLine("Enter the shift: ").toInt + alphabet.size) % alphabet.size
    val inputSecretmsg = scala.io.StdIn.readLine("Enter The Secret Message: ")
	val outputSecretmsg = inputSecretmsg.map( (c: Char) => { 

		val x = alphabet.indexOf(c.toUpper)
		if (x == -1){
			c
		}
		else{
			alphabet((x + key) % alphabet.size)
			} 
	});

	
	println(outputSecretmsg);
		
	}

}