from funciones.funciones_deportes import registrarParticipanteFutbol, registrarParticipanteNatacion, registrarParticipanteAtletismo, registrarParticipanteBasquetball, registrarParticipanteCiclismo, registrarParticipanteTenis, registrarParticipanteYoga
from funciones.funciones_calculos import obtenerSuma, obtenerInformacion, obtenerReporte



global reporte
reporte = ""
def principal():
    bandera = True
    arreglo = [0,0,0,0,0,0,0]
    while(bandera):
        indice = (int(input("Ingrese segun desee:\nFutbol(1)\nNatacion(2)\nAtletismo(3)\nBasquetball(4)\nCiclismo(5)"
                            +"\nTenis(6)\nYoga(7)\n")))
        if(indice == 1):
            reporte = reporte + registrarParticipanteFutbol()
            arreglo[0] = arreglo[0] + 1
        else:
            if(indice == 2):
                reporte = reporte + registrarParticipanteNatacion()
                arreglo[1] = arreglo[1] + 1
            else:
                if(indice == 3):
                    reporte = reporte + registrarParticipanteAtletismo()
                    arreglo[2] = arreglo[2] + 1
                else:
                    if(indice == 4):
                        reporte = reporte + registrarParticipanteBasquetball()
                        arreglo[3] = arreglo[3] + 1
                    else:
                        if(indice == 5):
                            reporte = reporte + registrarParticipanteCiclismo()
                            arreglo[4] = arreglo[4] + 1
                        else:
                            if(indice == 6):
                                reporte = reporte + registrarParticipanteTenis()
                                arreglo[5] = arreglo[5] + 1
                            else:
                                if(indice == 7):
                                    reporte = reporte + registrarParticipanteYoga()
                                    arreglo[6] = arreglo[6] + 1
                                else:
                                    print("Lo sentimos, el club no tiene esa opcion\n")

        letra = (input("Desea salir? (si)"))
        if(letra == "si"):
            bandera = False
        sumatotal = obtenerSuma(arreglo)
        mensajeActividades = obtenerInformacion(sumatotal)
        nombres = ["Futbol","Natacion","Atletismo","Basquetball","Ciclismo","Tenis","Yoga"]
        cadenaReporte = obtenerReporte(nombres, arreglo)
        print(reporte)
        print(mensajeActividades)
        print(cadenaReporte)

if __name__ == "__main__":
    principal()


            