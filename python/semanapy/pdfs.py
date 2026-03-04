'''
1. Crear el PDF
2. Definir un tipo  de letra
3. Llenar el documento
4. Guardar
'''
from fpdf import FPDF
nombre = "ALAN JAVIER REYES CASIERRA"
edad = 20
pdf = FPDF()

pdf.add_page()
pdf.set_font("Arial")

pdf.set_font_size(20)

pdf.text(10, 10, f"hola {nombre}, tienes {edad} años")

pdf.output("proyect.pdf")