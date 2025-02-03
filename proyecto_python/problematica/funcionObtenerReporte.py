def obtenerReporte(nombres, arreglo):
    reporte = "Las actividades ingresadas son: \n"
    for num in range(len(arreglo)):  
        reporte = "{}{}. Número de participantes de {}: {}\n".format(reporte, num + 1, nombres[num], arreglo[num])
    return reporte

