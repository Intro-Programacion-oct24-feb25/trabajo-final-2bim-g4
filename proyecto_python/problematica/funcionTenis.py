def registrarParticipanteTenis():
    nombre = (input("Ingrese nombre del participante: "))
    edad = (int(input("Ingrese edad del participante: ")))
    nivel = (input("Ingrese nivel del participante: (Principiante, Intermedio, Avanzado): "))
    ciudad = (input("Ingrese ciudad del participante: "))
    mano = (input("Ingrese mano habil del participante:(Derecha/Izquierda): "))

    reporte = (
    "Participante: " + nombre 
    + "\nEdad: " + str(edad) 
    + "\nPosición preferida: " + nivel 
    + "\nCiudad: " + ciudad 
    + "\nEstilo favorito: " + mano + "\n\n")

    return reporte