print ("Welcome to the SETI Program \nThis program will allow you to enter specific values related to \nthe likehood of finding intelligent life in our galaxy. All \npercentages should be entered as integer values e.g., 40 and not .40")
print ("")

p=float(input("What percentage of stars do you think have planets?:"))
n=int(input("How many planets per star do you think can support life?:"))
f=float(input("What percentage do you think actually develop life??:"))
i=float(input("What percentage of those do you think have intelligent life?:"))
c=float(input("What percentage of those do you think  can communicate with us?:"))
L=int(input("Number of years you think civilization can last?:"))
print("")
p=p/100
f=f/100
i=i/100
c=c/100
total=p*n*f*i*c*L*7
total=total/L*L

print("Based on the values entered.... \nthere are an estimated", total ," potentially detectable civilazations in our galaxy")
print("")
name=str(input("Created by:"))