import tkinter as tk
from tkinter import messagebox

def juego_preguntas():
    # Se da una bienvenida al juego
    messagebox.showinfo("Bienvenido", "Responde las siguientes preguntas con SI o NO")

    # Primera pregunta
    respuesta1 = messagebox.askquestion("Pregunta 1", "¿El primer álbum de Zoe es Demo Olmos?")
    
    if respuesta1 == "yes":
        # Segunda pregunta
        respuesta2 = messagebox.askquestion("Pregunta 2", "¿El segundo álbum de Zoe es Karmatica Resonancia?")
        
        if respuesta2 == "yes":
            messagebox.showinfo("Fin del juego", "Respuesta incorrecta, fin del juego")
        else:
            # Tercera pregunta
            respuesta3 = messagebox.askquestion("Pregunta 3", "¿El tercer álbum de Zoe es Aztlan?")
            
            if respuesta3 == "yes":
                messagebox.showinfo("Fin del juego", "Respuesta incorrecta, fin del juego")
            else:
                messagebox.showinfo("Ganaste", "Felicidades, has respondido correctamente las 3 preguntas y has ganado el juego")
    else:
        messagebox.showinfo("Fin del juego", "Respuesta incorrecta, fin del juego")

# Configuración de la ventana principal
root = tk.Tk()
root.withdraw()  # Oculta la ventana principal
juego_preguntas()