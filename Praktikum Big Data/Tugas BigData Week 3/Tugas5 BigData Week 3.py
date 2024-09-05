from collections import defaultdict
import csv

# Fungsi map untuk memetakan nilai dari kolom UTS dan UAS


def map_function(file_path):
    with open(file_path, mode='r') as file:
        reader = csv.DictReader(file)
        for row in reader:
            for key in ['UTS', 'UAS']:
                value = row.get(key, '').strip()
                if value:
                    try:
                        yield (key, float(value))
                    except ValueError:
                        continue  # Abaikan nilai yang tidak bisa dikonversi ke angka

# Fungsi reduce untuk menghitung rata-rata nilai per kolom


def reduce_function(pairs):
    result = defaultdict(lambda: [0, 0])  # [total, count]
    for key, value in pairs:
        result[key][0] += value
        result[key][1] += 1

    # Menghitung rata-rata per kolom
    average_result = {}
    for key, (total, count) in result.items():
        average_result[key] = total / count
    return average_result

# Fungsi untuk menghitung frekuensi kemunculan mata kuliah tertentu


def map_reduce_frequency(file_path, subjects, column_name):
    frequency_result = defaultdict(int)
    with open(file_path, mode='r') as file:
        reader = csv.DictReader(file)
        for row in reader:
            item = row.get(column_name, '').strip().lower()
            if item in subjects:
                frequency_result[item] += 1
    return frequency_result


# Path ke file CSV
file_path = "Dataset Pelatihan.csv"

# Melakukan map dan reduce untuk rata-rata kolom UTS dan UAS
mapped = list(map_function(file_path))
reduced = reduce_function(mapped)

# Mencetak hasil rata-rata per kolom UTS dan UAS
print("Rata-rata nilai per kolom:")
for key, average in reduced.items():
    print(f"{key}: {average:.2f}")

# Menghitung rata-rata dari dua kolom (UTS dan UAS)
if reduced:
    if 'UTS' in reduced and 'UAS' in reduced:
        avg_UTS = reduced['UTS']
        avg_UAS = reduced['UAS']
        average_of_two = (avg_UTS + avg_UAS) / 2
        print(
            f"\nRata-rata keseluruhan dari UTS dan UAS: {average_of_two:.2f}")

# Daftar mata kuliah yang ingin dihitung frekuensinya
subjects_matkul = ['kimia', 'biologi', 'fisika', 'matematika']
# Menghitung frekuensi kemunculan mata kuliah tertentu
frequency_matkul = map_reduce_frequency(file_path, subjects_matkul, 'Matkul')

# Mencetak frekuensi kemunculan mata kuliah
print("\nFrekuensi kemunculan mata kuliah:")
for matkul, count in frequency_matkul.items():
    print(f"{matkul.capitalize()}: {count}")

# Daftar gender yang ingin dihitung frekuensinya
genders = ['laki-laki', 'perempuan']
# Menghitung frekuensi kemunculan gender
frequency_gender = map_reduce_frequency(file_path, genders, 'Gender')

# Mencetak frekuensi kemunculan gender
print("\nFrekuensi kemunculan gender:")
for gender, count in frequency_gender.items():
    print(f"{gender.capitalize()}: {count}")
