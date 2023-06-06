Algoritmo ConversionesNumericas
    Escribir "Ingrese un número:"
    Leer numero
	
    Escribir "Seleccione el sistema numérico actual:"
    Escribir "1. Binario"
    Escribir "2. Decimal"
    Escribir "3. Hexadecimal"
    Leer sistemaActual
	
    Escribir "Seleccione el sistema numérico al que desea convertir:"
    Escribir "1. Binario"
    Escribir "2. Decimal"
    Escribir "3. Hexadecimal"
    Leer sistemaDestino
	
    segun sistemaActual hacer
        caso 1:
            si sistemaDestino = 2 entonces
                resultado = BinarioADecimal(numero)
                Escribir "El número convertido es:", resultado
            fin si
            si sistemaDestino = 3 entonces
                resultado = BinarioAHexadecimal(numero)
                Escribir "El número convertido es:", resultado
            fin si
        fin caso
	caso 2:
		si sistemaDestino = 1 entonces
			resultado = DecimalABinario(numero)
			Escribir "El número convertido es:", resultado
		fin si
		si sistemaDestino = 3 entonces
			resultado = DecimalAHexadecimal(numero)
			Escribir "El número convertido es:", resultado
		fin si
	fin caso
caso 3:
	si sistemaDestino = 1 entonces
		resultado = HexadecimalABinario(numero)
		Escribir "El número convertido es:", resultado
	fin si
	si sistemaDestino = 2 entonces
		resultado = HexadecimalADecimal(numero)
		Escribir "El número convertido es:", resultado
	fin si
fin caso
fin segun

FinAlgoritmo

Funcion BinarioADecimal(binario)
    decimal = 0
    potencia = 0
    
    mientras binario > 0 hacer
        digito = binario % 10
        decimal = decimal + (digito * 2^potencia)
        binario = binario / 10
        potencia = potencia + 1
    fin mientras
    
    retornar decimal
FinFuncion

Funcion DecimalABinario(decimal)
    binario = 0
    i = 0
    
    mientras decimal > 0 hacer
        residuo = decimal % 2
        binario = binario + (residuo * 10^i)
        decimal = decimal / 2
        i = i + 1
    fin mientras
    
    retornar binario
FinFuncion

Funcion BinarioAHexadecimal(binario)
    decimal = BinarioADecimal(binario)
    hexadecimal = DecimalAHexadecimal(decimal)
    
    retornar hexadecimal
FinFuncion

Funcion DecimalAHexadecimal(decimal)
    hexadecimal = ""
    caracteresHex = "0123456789ABCDEF"
    
    mientras decimal > 0 hacer
        residuo = decimal % 16
        digito = SubCadena(caracteresHex, residuo + 1, 1)
        hexadecimal = digito + hexadecimal
        decimal = decimal / 16
    fin mientras
    
    retornar hexadecimal
FinFuncion

Funcion HexadecimalABinario(hexadecimal)
    decimal = HexadecimalADecimal(hexadecimal)
    binario = DecimalABinario(decimal)
    
    retornar binario
FinFuncion

Funcion HexadecimalADecimal(hexadecimal)
    decimal = 0
    potencia = 0
    caracteresHex = "0123456789ABCDEF"
    
    para i = Algoritmo ConversionesNumericas
			Escribir "Ingrese un número:"
			Leer numero
			
			Escribir "Seleccione el sistema numérico actual:"
			Escribir "1. Binario"
			Escribir "2. Decimal"
			Escribir "3. Hexadecimal"
			Leer sistemaActual
			
			Escribir "Seleccione el sistema numérico al que desea convertir:"
			Escribir "1. Binario"
			Escribir "2. Decimal"
			Escribir "3. Hexadecimal"
			Leer sistemaDestino
			
			segun sistemaActual hacer
				caso 1:
					si sistemaDestino = 2 entonces
						resultado = BinarioADecimal(numero)
						Escribir "El número convertido es:", resultado
					fin si
					si sistemaDestino = 3 entonces
						resultado = BinarioAHexadecimal(numero)
						Escribir "El número convertido es:", resultado
					fin si
				fin caso
			caso 2:
				si sistemaDestino = 1 entonces
					resultado = DecimalABinario(numero)
					Escribir "El número convertido es:", resultado
				fin si
				si sistemaDestino = 3 entonces
					resultado = DecimalAHexadecimal(numero)
					Escribir "El número convertido es:", resultado
				fin si
			fin caso
        caso 3:
            si sistemaDestino = 1 entonces
                resultado = HexadecimalABinario(numero)
                Escribir "El número convertido es:", resultado
            fin si
            si sistemaDestino = 2 entonces
                resultado = HexadecimalADecimal(numero)
                Escribir "El número convertido es:", resultado
            fin si
        fin caso
fin segun

FinAlgoritmo

Funcion BinarioADecimal(binario)
    decimal = 0
    potencia = 0
    
    mientras binario > 0 hacer
        digito = binario % 10
        decimal = decimal + (digito * 2^potencia)
        binario = binario / 10
        potencia = potencia + 1
    fin mientras
    
    retornar decimal
FinFuncion

Funcion DecimalABinario(decimal)
    definir binario Como real
    definir i Como Entero
    
    mientras decimal > 0 hacer
        residuo = decimal % 2
        binario = binario + (residuo * 10^i)
        decimal = decimal / 2
        i = i + 1
    fin mientras
    
    retornar binario
FinFuncion

Funcion BinarioAHexadecimal(binario)
    decimal = BinarioADecimal(binario)
    hexadecimal = DecimalAHexadecimal(decimal)
    
    retornar hexadecimal
FinFuncion

Funcion DecimalAHexadecimal(decimal)
    hexadecimal = ""
    caracteresHex = "0123456789ABCDEF"
    
    mientras decimal > 0 hacer
        residuo = decimal % 16
        digito = SubCadena(caracteresHex, residuo + 1, 1)
        hexadecimal = digito + hexadecimal
        decimal = decimal / 16
    fin mientras
    
    retornar hexadecimal
FinFuncion

Funcion HexadecimalABinario(hexadecimal)
    decimal = HexadecimalADecimal(hexadecimal)
    binario = DecimalABinario(decimal)
    
    retornar binario
FinFuncion

Funcion HexadecimalADecimal(hexadecimal)
    decimal = 0
    potencia = 0
    caracteresHex = "0123456789ABCDEF"
    
    para i = Longitud(hexadecimal) hasta 1 hacer
        digito = SubCadena(hexadecimal, i, 1)
        posicion = Posicion(caracteresHex, digito) - 1
        decimal = decimal + (posicion * 16^potencia)
        potencia = potencia + 1
    fin para
    
    retornar decimal
FinFuncion
(hexadecimal) hasta 1 hacer
        digito = SubCadena(hexadecimal, i, 1)
        posicion = Posicion(caracteresHex, digito) - 1
        decimal = decimal + (posicion * 16^potencia)
        potencia = potencia + 1
    fin para
    
    retornar decimal
FinFuncion
