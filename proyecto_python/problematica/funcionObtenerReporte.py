def obtenerReporte(nombres, arreglo):
    reporte = "Las actividades ingresadas son: \n"
    for num in range(len(arreglo)):  
        reporte = reporte + str(num + 1) + ". Número de participantes de " + nombres[num] + ": " + str(arreglo[num]) + "\n"
    return reporte

