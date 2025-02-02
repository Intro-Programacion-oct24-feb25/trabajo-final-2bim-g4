def registrarParticipanteCiclismo():
    nombre = (input("Ingrese nombre del participante: "))
    edad = (int(input("Ingrese edad del participante: ")))
    ciclismo = (input("Ingrese tipo de ciclismo del participante: (Montaña, Ruta, Urbano): "))
    ciudad = (input("Ingrese ciudad del participante: "))
    marca = (input("Ingrese marca favorita del participante: "))

    reporte = (
    "Participante: " + nombre 
    + "\nEdad: " + str(edad) 
    + "\nPosición preferida: " + ciclismo 
    + "\nCiudad: " + ciudad 
    + "\nMarca favorita: " + marca + "\n")

    return reporte