def registrarParticipanteBasquetball():
    nombre = (input("Ingrese nombre del participante: "))
    edad = (int(input("Ingrese edad del participante: ")))
    posicion = (input("Ingrese posicion preferida del participante: "))
    estatura = (int(input("Ingrese estatura del participante en cm: ")))
    ciudad = (input("Ingrese ciudad del participante: "))
    

    reporte = (
    "Participante: " + nombre 
    + "\nEdad: " + str(edad) 
    + "\nPosición preferida: " + posicion 
    + "\nEstatura en cm: " + str(estatura) 
    + "\nCiudad: " + ciudad + "\n")

    
    return reporte