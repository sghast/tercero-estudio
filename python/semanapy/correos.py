'''
enviar correos automáticamente
'''
import yfinance

data = yfinance.Ticker("AAPL").history("6mo")
cierre = data.Close
cierre.plot()

maxima = round(cierre.max(), 2)
minima = round(cierre.min(), 2)
media = round(cierre.mean(), 2)

import pyautogui
import pyperclip
import webbrowser
import time

webbrowser.open("https://mail.google.com/mail/u/0/?tab=rm&ogbl#inbox?compose=new")

destinatario = "alanjavierreyes318@gmail.com"

asunto = "Análisis de acciones"

cuerpo = f"""
Hola,

Te envío el análisis de las acciones de los últimos 6 meses de Apple

Cotización máxima: USD {maxima}
Cotización mínima: USD {minima}
Valor medio: USD {media}

Estoy pendiente a cualquier información

Saludos
"""
time.sleep(5)
pyperclip.copy(destinatario)
pyautogui.hotkey("ctrl", "v")
pyautogui.hotkey("tab")
time.sleep(0.5)

pyperclip.copy(asunto)
pyautogui.hotkey("ctrl", "v")
pyautogui.hotkey("tab")
time.sleep(0.5)

pyperclip.copy(cuerpo)
pyautogui.hotkey("ctrl", "v")
time.sleep(0.5)

pyautogui.click(1227, 1040) #enviar
time.sleep(1.8)
pyautogui.click(1618, 24) #cerrar correo