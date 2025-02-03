def registrarParticipanteYoga():
    nombre = (input("Ingrese nombre del participante: "))
    edad = (int(input("Ingrese edad del participante: ")))
    nivel = (input("Ingrese nivel del participante: (Principiante, Intermedio, Avanzado): "))
    ciudad = (input("Ingrese ciudad del participante: "))
    estilo = (input("Ingrese estilo de yoga favorito del participante: "))

    reporte = (
    "Participante: " + nombre 
    + "\nEdad: " + str(edad) 
    + "\nPosición preferida: " + nivel 
    + "\nCiudad: " + ciudad 
    + "\nEstilo de yoga favorito: " + estilo + "\n\n")

    return reporte