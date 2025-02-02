def obtenerInformacion (suma):
    if (suma == 0):
        reporte = "Mala campaña, debemos mejorar\n"
    else:
        if(suma >= 1 and suma <= 5):
            reporte = "Poca participacion en el club, hay que mejorar\n"
        else:
            if(suma >= 6 and suma <= 15):
                reporte = "Buena participacion, sigan asi\n"
            else:
                reporte = "Excelente campaña del club\n"
    return reporte
