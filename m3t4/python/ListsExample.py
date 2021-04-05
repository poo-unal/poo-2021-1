# Create a list
myList = [5, 3, 8]
print(myList)

# Add element
myList.append(7)
print(myList)

# Insert element
myList.insert(2, 1)
print(myList)

# Change element
myList[0] = 4
print(myList)

# Returns the index of the first element with the specified value
print("Index of value 3:", myList.index(3))

# Returns the value in a specified index
print("Value with index 1:", myList[1])

# Returns the list size
print("List size:", len(myList))

# Sorts the list
myList.sort()
print(myList)

# Reverse the order of the list
myList.reverse()
print(myList)

# Remove element
myList.remove(7)
print(myList)

# Remove specified index
myList.pop(1)
print(myList)

# Returns a copy of the list
myNewList = myList.copy()
print("My new list: ", myNewList)

# Removes all the elements from the list
myList.clear()
print("My list:", myList)
print("My new list: ", myNewList)