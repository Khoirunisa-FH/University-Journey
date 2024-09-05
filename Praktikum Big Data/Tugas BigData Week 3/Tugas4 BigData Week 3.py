from collections import defaultdict


def map_function(text):
    for word in text.split():
        yield (word, 1)


def reduce_function(pairs):
    result = defaultdict(int)
    for word, count in pairs:
        result[word] += count
    return result


file = open("Dataset Pelatihan.csv", "r")
isi_file = file.read()
file.close()

mapped = list(map_function(isi_file))

reduced = reduce_function(mapped)
print(dict(reduced))
