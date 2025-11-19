# code to convert text to binary format


def toBinary(message):
    binaryMessage = []

    for i in message:
        if(i.isdigit()):                        
            binaryMessage.append("{0:08b}".format(int(i)))                   # skips if the string has a number
        else:                                   
            binaryMessage.append("{0:08b}".format(ord(i)))                   
    return binaryMessage
