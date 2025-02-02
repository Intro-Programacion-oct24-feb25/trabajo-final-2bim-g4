def registrarParticipanteFutbol():
    nombre = (input("Ingrese nombre del participante: "))
    edad = (int(input("Ingrese edad del participante: ")))
    posicion = (input("Ingrese posicion preferida del participante: "))
    ciudad = (input("Ingrese ciudad del participante: "))
    equipo = (input("Ingrese equipo favorito del participante: "))

    reporte = "Particpante: " + nombre + "\nEdad: " + edad + "\nPosicion preferida: " + posicion + "\nCiudad: " + ciudad
    + "\nEquipo favorito: " + equipo + "\n"
    return reporte

