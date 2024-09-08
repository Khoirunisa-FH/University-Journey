from collections import defaultdict

# Memetakan kata dengan nilai 1
def map_function(text):
    for word in text.split():
        yield (word, 1)

# Menjumlahkan frekuensi kata
def reduce_function(pairs):
    result = defaultdict(int)
    for word, count in pairs:
        result[word] += count
    return result

# Daftar mata kuliah yang akan dihitung frekuensinya
matkul_list = ["Kimia", "Biologi", "Fisika", "Matematika"]

# Daftar gender yang akan dihitung frekuensinya
gender_list = ["Laki-laki", "Perempuan"]

# Membuka dan membaca isi file CSV
file = open("Dataset Pelatihan.csv", "r")
isi_file = file.read()
file.close()

# Melakukan MapReduce untuk mata kuliah
mapped_matkul = [pair for pair in map_function(
    isi_file) if pair[0] in matkul_list]
reduced_matkul = reduce_function(mapped_matkul)

# Melakukan MapReduce untuk gender
mapped_gender = [pair for pair in map_function(
    isi_file) if pair[0] in gender_list]
reduced_gender = reduce_function(mapped_gender)

# Menghitung total kemunculan untuk semua mata kuliah
total_kemunculan_matkul = sum(reduced_matkul.values())

# Menghitung total kemunculan untuk gender
total_kemunculan_gender = sum(reduced_gender.values())

# Menampilkan hasil dalam bentuk tabel untuk mata kuliah
print(f"{'Program Studi':<20} | {'Jumlah Kemunculan':<18}")
print('-' * 40)

for matkul, count in reduced_matkul.items():
    print(f"{matkul:<20} | {count:<18}")

print('-' * 40)
print(f"Total Kemunculan Semua Program Studi: {total_kemunculan_matkul}")

# Menampilkan hasil dalam bentuk tabel untuk gender
print(f"\n{'Gender':<20} | {'Jumlah Kemunculan':<18}")
print('-' * 40)

for gender, count in reduced_gender.items():
    print(f"{gender:<20} | {count:<18}")

print('-' * 40)
print(f"Total Kemunculan Semua Gender: {total_kemunculan_gender}")
