def registrarParticipanteNatacion():
    nombre = (input("Ingrese nombre del participante: "))
    edad = (int(input("Ingrese edad del participante: ")))
    nivel = (input("Ingrese nivel del participante: (Principiante, Intermedio, Avanzado): "))
    ciudad = (input("Ingrese ciudad del participante: "))
    estilo = (input("Ingrese estilo favorito del participante: "))

    reporte = (
    "Participante: " + nombre 
    + "\nEdad: " + str(edad) 
    + "\nPosición preferida: " + nivel 
    + "\nCiudad: " + ciudad 
    + "\nEstilo favorito: " + estilo + "\n")

    return reporte