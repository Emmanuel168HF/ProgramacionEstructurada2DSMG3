import tkinter as tk
from tkinter import messagebox
import math

def main():
    # Variables
    suma = 3 + 5
    resta = 10 - 12
    multi = 34 * 23
    div = 10 // 2   # división entera
    mod = 10 % 2
    potencia = math.pow(4, 2)

    # Constante
    PI = 3.1416

    # Salida
    salida = (
        f"La suma es: {suma}\n"
        f"La resta es: {resta}\n"
        f"La multiplicación es: {multi}\n"
        f"La división es: {div}\n"
        f"El módulo es: {mod}\n"
        f"La potencia es: {potencia}"
    )

    # Crear ventana oculta para usar messagebox
    root = tk.Tk()
    root.withdraw()
    messagebox.showinfo("Resultados", salida)

if __name__ == "__main__":
    main()