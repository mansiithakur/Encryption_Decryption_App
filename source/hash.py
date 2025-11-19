import hashlib as hash

def hash256(key):
    obj = hash.sha3_512()

    obj.update(key.encode())

    return obj.hexdigest()
