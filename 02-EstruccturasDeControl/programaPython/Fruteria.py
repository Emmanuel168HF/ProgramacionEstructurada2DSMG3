# Fruteria.pyUniversidad Tecnologica de Tula-Tepeji
#    Programa educativo: Tecnologias de la Informacion e innovacion
#    TSU. Desarrollo de Software Multiplataforma
#   Programador: Armandoo Emmanuel Gomez Almaraz
#    "Fecha de creacion: 22/01/2026"
#   Descripcion: Programa que calcula el total a pagar en una fruteria
#                segun el numero de kilos comprados y el precio por kilo
#               aplicando descuentos segun la cantidad comprada

def main():
    # Declaración de variables
    numkilos = float(input("Introducir el num. kilos: "))
    precio = float(input("Introduce el precio: "))
    
    # operación
    subtotal = numkilos * precio
    
    if 0.0 <= numkilos <= 2.0:
        total = subtotal
        porcentaje = "0%"
        descuento = 0.0
    elif 2.01 <= numkilos <= 5.0:
        descuento = subtotal * 0.10
        total = subtotal - descuento
        porcentaje = "10%"
    elif 5.01 <= numkilos <= 10.0:
        descuento = subtotal * 0.15
        total = subtotal - descuento
        porcentaje = "15%"
    else:
        descuento = subtotal * 0.20
        total = subtotal - descuento
        porcentaje = "20%"

    # Parte de la segunda hoja
    if numkilos < 0:
        print("No pueden ser negativos")
    else:
        salida = f"Subtotal: {subtotal}\nDescuento: {descuento}\nPorcentaje: {porcentaje}\nTotal: {total}"
        print(salida)

if __name__ == "__main__":
    main()