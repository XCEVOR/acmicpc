previous_temperature = float(input())

while True:
    current_temperature = float(input())
    
    if current_temperature == 999:
        break
    
    print("%.2f" % (current_temperature - previous_temperature))
    
    previous_temperature = current_temperature
