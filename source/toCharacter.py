# binary to readeable format binary should be in dictionary form


def toChracter(binaryMessage):
    message = "" 
    for i in binaryMessage:
        if int(i,2) in range(10):
            message += (str(int(i,2)))
        else:
            message += (chr(int(i,2)))
    return message
