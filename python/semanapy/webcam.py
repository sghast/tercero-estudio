import cv2

webcam = cv2.VideoCapture(0)

while True:
    exito, imagen = webcam.read()
    imagen = cv2.resize(imagen, (1200, 720))
    cv2.imshow("Proyecto 4 - IA", imagen)
    
    if cv2.waitKey(1) != -1: break

webcam.release()
cv2.destroyAllWindows()