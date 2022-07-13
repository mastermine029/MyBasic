print ("1. PERSONAL INFORMATION")
print ('Hello! My name is "Cenn Justine Maghacot"')
print ('I live in "Belvedere TowneIII,Pasong KawayanII, General Trias, Cavite, 4107"')
print ('My number is "09198753442"')
print ('My college major is "BS Computer Science"')

print ("")

print ("2. SALES PREDICTION")
print ("Annual Sales")
amount=float(input("Input amount of total sales:"))
ap= amount * 0.23
profit= amount + ap 
print ('Profit=', profit)

print ("")

print ("3. Land Calculation")
print ("Square feet to  Acre")
sf=float(input("Input sqaure feet:"))
acre= sf / 43560
print ('Acre:', acre)

print ("")

print ("4. Total Purchase")
print ("You are a buying Customer! Show me what you got")
st=float(input("1st item purchase:"))
nd=float(input("2nd item purchase:"))
rd=float(input("3rd item purchase:"))
ft=float(input("4th item purchase:"))
th=float(input("5th item purchase:"))
sub= st + nd + rd + ft + th 
tax = sub / 6
total= sub + tax
print ('Sub price:', sub)
print ('Tax price:', tax)
print ('Total price:', total)
print (" Please come again")

print ("")

print ("5. Distance Traveled")
print ("Brum! Brum! Wanna ride?")
five=60 * 5
print ('Brum! Brum! We traveled', five , 'within 5 hours')
eight=60 * 8
print ('Brum! Brum! We traveled', eight , 'within 8 hours')
twelve=60 * 12
print ('Brum! Brum! We traveled', twelve , 'within 12 hours')

print ("")

print ("6. Sale Tax")
print ("Hey there! Welcome back! What will it be today?")
pur= float(input("Amount of purchase:"))
cs= pur * 0.02
cst= pur * 0.04
tst = cs + cst 
tsale= tst + pur
print ('State sales tax: ', cst)
print ('Country sales tax: ', cs)
print ('Total sale tax', tst)
print ('The total sale is: ', tsale)
print ("Please come again!")

print ("")

print ("10. Stock Transaction Program")
print ("Joe Details Purchase")

paid = 1000 * 32.87
bought = paid * 0.02

sold = 1000 * 33.92
receive= sold * 0.02

comm= bought + receive
overall= sold - comm

print ('Money paid for the stock: ', paid)
print ('Commision 1: ', bought)
print ('Sold Stocks: ', sold)
print ('Commision 2: ', receive)
print ('Overall commision', comm)
print ("The amount of money that had left is : ", overall)
