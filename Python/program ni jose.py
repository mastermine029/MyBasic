
print("Number 1")
araw = int(input("Date: "))
oras = int(input("Hour: "))

date = ["Lunes","Martes","Myerkules","Huwebes","Biyernes","Sabado","Linggo"]

if ((araw <= 0 ) or (araw > 7)):
    print("Mali na-type sa date amp!")
if ((oras < 1) or (oras > 24)):
    print("Mali na-type sa oras amp!")
else:
    print("PETSA: "+date[araw-1])
    print("ORAS:",oras,":00")
    if (((oras < 10) or (oras > 21)) and (araw > 5)):
        print("Sarado po kame!")
    else:
        print("Bukas po kame!")

print("\nNumber 2")
inet = int(input("Temp ni water: "))

if(inet >= 100):
    print("Mainet na si water!")

print("\nNumber 3")
guest = (input("Name: "))
age = int(input("Age: "))
if (age < 18):
    print("Sorry, bata ka pa drink milk, ",guest)
else:
    print("Welcome, party na po kayo, ",guest)

print("\nNumber 4")    
worker = (input("Name: "))
exp = int(input("Exp: "))
if (exp > 5):
    print("Galeng nag-stay so my 20% bonus ka, ",worker)
else:
    print("Sorry ot ka pa, ",worker)
