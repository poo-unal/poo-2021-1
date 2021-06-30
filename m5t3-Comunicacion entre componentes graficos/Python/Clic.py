import sys
from Tkinter import *

def hacer_clic():
    try:
        _valor = int(entrada_txt.get())
        _valor = _valor*10
        etiqueta.config(text=_valor)
    except ValueError:
        etiqueta.config(text="Introduce un número.")

app = Tk()
app.title("Mi primera aplicación gráfica")

#vp -> ventana principal
vp = Frame(app)
vp.grid(column=0, row=0, padx=(50,50), pady=(10,10))
vp.columnconfigure(0, weight=1)
vp.rowconfigure(0, weight=1)

etiqueta = Label(vp, text="Valor")
etiqueta.grid(column=2, row=2, sticky=(W,E))

boton = Button(vp, text="¡Clic!", command=hacer_clic)
boton.grid(column=1, row=1)

valor = ""
entrada_txt = Entry(vp, width=10, textvariable=valor)
entrada_txt.grid(column=2, row=1)

app.mainloop()
