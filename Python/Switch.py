print("Number 1: Store")
day = int(input("Date: "))
time = int(input("Hour: "))
date = ["Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"]
day-1
if (day<=0): print("Wrong Input")
elif (day>=8): print("Wrong Input")
elif (time>=24): print("Wrong Input")
elif (time<0): print("Wrong Input")
else:
    print("Date: "+date[day-1])
    print("Time:",time,":00")
if (day>=6):print ("Store is close during weekends")
elif (time<10): print ("Store is closed")
elif (time >= 21):print("Store is now closed")
else:
    print("Store is Open")

    
print("\nNumber 2:")
temp = int(input("Water Temperature: "))
if(temp >= 100):
    print("Water is boiling")


print("\nNumber 3: Club Age Restriction")
name = (input("Name: "))
age = int(input("Age: "))
if (age < 18):
    print("Sorry, you are not allowed to enter, ",name)
else:
    print("Welcome, ",name)


print("\nNumber 4: Employee Raise")    
exp = int(input("Years Experience: "))
if (exp > 5):
    print("Salary increased 20% monthly")
else:
    print("No Salary Increase")
