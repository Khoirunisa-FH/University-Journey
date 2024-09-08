from collections import defaultdict

# Memetakan setiap kata menjadi pasangan (kata, 1)


def map_function(text):
    for word in text.split():
        yield (word, 1)

# Menghitung jumlah kemunculan setiap kata


def reduce_function(pairs):
    result = defaultdict(int)
    for word, count in pairs:
        result[word] += count
    return result


# Membaca isi file 'mulai.txt'
file = open("mulai.txt", "r")
isi_file = file.read()
file.close()

# Memproses map dan reduce
mapped = list(map_function(isi_file))
reduced = reduce_function(mapped)

# Mencetak hasil akhir
print(dict(reduced))
