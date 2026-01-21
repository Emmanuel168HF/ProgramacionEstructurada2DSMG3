def leer_calificacion(prompt):
    while True:
        try:
            return float(input(prompt))
        except ValueError:
            print("Entrada inválida. Por favor introduce un número.")


def main():
    print("Calcula el promedio de 3 calificaciones")
    calif1 = leer_calificacion("Introduce la calificacion 1: ")
    calif2 = leer_calificacion("Introduce la calificacion 2: ")
    calif3 = leer_calificacion("Introduce la calificacion 3: ")

    promedio = (calif1 + calif2 + calif3) / 3.0

    if promedio >= 7.0:
        print(f"Aprobado. Promedio: {promedio:.2f}")
    else:
        print(f"Reprobado. Promedio: {promedio:.2f}")


if __name__ == "__main__":
    main()
