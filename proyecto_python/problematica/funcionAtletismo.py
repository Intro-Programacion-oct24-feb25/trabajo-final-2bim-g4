def registrarParticipanteAtletismo():
    nombre = (input("Ingrese nombre del participante: "))
    edad = (int(input("Ingrese edad del participante: ")))
    especialidad = (input("Ingrese especialidad del participante: (Carreras, Saltos, Avanzado): "))
    ciudad = (input("Ingrese ciudad del participante: "))
    record = (input("Ingrese record personal del participante: "))

    reporte = (
    "Participante: " + nombre 
    + "\nEdad: " + str(edad) 
    + "\nPosición preferida: " + especialidad 
    + "\nCiudad: " + ciudad 
    + "\nEstilo favorito: " + record + "\n\n")

    return reporte