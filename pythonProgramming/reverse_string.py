# Problem: You are given a string s. You need to reverse the string.
# Like, Hello into olleH

class StringProblem:
    #This method will reverse the string
    # e.g: 'Hello' into 'olleH'
    def reverseString(sefl, strValue):
        # empty variable to store the returned reverse char
        reversed = ''
        end = len(strValue) -1; # Length of that String
        # Run this loop until it reach into 0
        while(end >= 0):
            reversed = reversed + strValue[end]
            end -= 1
        return reversed;

obj = StringProblem()

strvalue = 'GeeksForGeeks' 
print(obj.reverseString(strvalue))  
print(obj.reverseString('Hello'))