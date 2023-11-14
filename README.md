[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-24ddc0f5d75046c5622901739e7c5dd533143b0c8e959d652212380cedb1ea36.svg)](https://classroom.github.com/a/A9eK7Esk)
# DAM2_23_24_PMDM_U2_Practica02

## Práctica 2 - Carta más alta

	
	Métodos:
	
	* crearBaraja() => Generar la lista de 52 cartas de la baraja.
	* barajar() => Desordenar las cartas de la lista de cartas de la baraja (shuffle)
	* dameCarta() => Retorna la última carta de la lista de cartas y la elimina de la baraja.

Funcionamiento de la aplicación:

	* La aplicación debe mostrar una carta boca abajo y debajo de ella dos botones: "Dame Carta" y "Reiniciar".

	* Si pulsamos en el primer botón cambiará la imagen por una carta de la baraja (método dameCarta de Baraja)

	* Si pulsamos en el segundo botón volverá a crear la lista de cartas de la baraja, las desordenará y mostrará la imagen de la carta boca abajo.

Recursos:

	* 53 imágenes en la carpeta drawable, una boca abajo y el resto de cartas de una baraja francesa (por ejemplo, en Freepik tenéis recursos gratuitos con los que podéis hacerlo).
	* Las imágenes tendrán un tamaño reducido que ocupen poco espacio (si son redondeadas, mejor en PNG por permitir la transparencia del fondo).
	* Para retornar el id de un recurso mediante una variable podéis usar 
	
	    val context = LocalContext.current

		context.resources.getIdentifier("nombreRecurso", "drawable", context.packageName)

	** Si generáis los nombres de los recursos cómo el nombre del palo y su idDrawable os será muy fácil crear una función Composable que recupere el id del recurso...
		Por ejemplo, algo así... "${carta.palo.toString().lowercase()}_${carta.idDrawable}"
