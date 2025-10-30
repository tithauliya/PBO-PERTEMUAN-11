# Penerapan Java Persistence API (JPA) pada Aplikasi Data Mahasiswa

## Deskripsi Proyek
Proyek ini merupakan **Laporan Tugas Mata Kuliah Pemrograman Berorientasi Obyek (PBO)** pada **Pertemuan Kesebelas**, dengan topik **Penerapan Java Persistence (JPA)**.  
Tujuan dari praktikum ini adalah untuk memahami dan mengimplementasikan **Java Persistence API (JPA)** sebagai cara modern dalam mengelola koneksi database menggunakan konsep *object-relational mapping* (ORM).  

Dengan JPA, proses pengelolaan data (Create, Read, Update, Delete) menjadi lebih efisien dan terstruktur.  
Fitur tambahan juga mencakup penerapan **EntityManager**, **NamedQuery**, serta kemampuan **upload data CSV** ke database melalui GUI berbasis JFrame.

## Dosen Pengampu
**Bayu Adhi Nugroho, Ph.D**

## Disusun Oleh
**TITHA AULIYA KHOTIM**  
**NIM:** 09010624017 
**Program Studi Sistem Informasi**  
**Fakultas Sains dan Teknologi**  
**Universitas Islam Negeri Sunan Ampel Surabaya**  
**Tahun:** 2025  

## Langkah-Langkah Praktikum

### Membuat Class Persistence
1. Buat **class persistence** di folder utama project.
   <img width="803" height="645" alt="Screenshot 2025-10-28 152444" src="https://github.com/user-attachments/assets/b69191a4-89b6-4a8d-b64e-fff4230a0809" />
2. Sambungkan koneksi dengan **database** yang digunakan (misalnya PostgreSQL/MySQL).
   <img width="1264" height="939" alt="Screenshot 2025-10-28 152544" src="https://github.com/user-attachments/assets/5beb8505-d397-4222-9a8c-22dbfcd475db" />
3. Pilih tabel yang akan di-*persistence* dari database.
   <img width="1173" height="881" alt="Screenshot 2025-10-28 152606" src="https://github.com/user-attachments/assets/3b718e08-1c91-4b68-a6d1-36723fb3a0da" />
4. Ikuti opsi sesuai panduan, kemudian klik **Next**.
   <img width="1152" height="775" alt="Screenshot 2025-10-28 152655" src="https://github.com/user-attachments/assets/9b2ead71-fb73-4464-81b3-885194834201" />
5. Klik **Finish**.
    <img width="1152" height="775" alt="Screenshot 2025-10-28 152713" src="https://github.com/user-attachments/assets/ca8d4a36-4607-4e26-9007-bd453fa50bfc" />

**Hasil:**  
Class persistence dan folder `META-INF` berhasil dibuat, yang berisi file `persistence.xml` sebagai konfigurasi utama JPA.
<img width="307" height="280" alt="Screenshot 2025-10-28 152755" src="https://github.com/user-attachments/assets/d7d9ba4d-b0e9-4f3c-a98b-4b44d0de7819" />

### Menggunakan EntityManager dan NamedQuery untuk Operasi Data
Langkah berikutnya adalah mengganti kode lama (berbasis JDBC) menjadi implementasi berbasis **JPA** dengan **EntityManager**.

#### a. Kode untuk koneksi dengan JFrame utama
Tambahkan EntityManager untuk mengelola koneksi dan transaksi ke database.  
Pastikan kode ini juga diterapkan pada **class JDialog** agar dialog insert/update/delete tetap terhubung dengan EntityManager.  
<img width="1068" height="581" alt="image" src="https://github.com/user-attachments/assets/9959503f-147a-4016-a595-79cf0b5ec1b3" />
#### b. Kode Untuk showTable
<img width="1158" height="788" alt="image" src="https://github.com/user-attachments/assets/9d830d84-ad1a-458a-874d-5a040c865c4a" />
#### c. Kode pada tombol simpan pada JDialog Insert
<img width="594" height="642" alt="image" src="https://github.com/user-attachments/assets/e81b719f-b9aa-481a-b72b-cb773beb99a4" />
#### d. Kode pada tombol simpan pada JDialog Update
<img width="525" height="628" alt="image" src="https://github.com/user-attachments/assets/3a9d42fd-b2b5-4741-b0a4-e5b8e1808896" />
#### e. Kode pada tombol simpan pada JDialog Delete
<img width="873" height="712" alt="image" src="https://github.com/user-attachments/assets/8faeea71-6ba5-4695-bba9-78e56535dd42" />
#### f. Kode pada method untuk upload csv pada JFrame utama
<img width="1113" height="826" alt="image" src="https://github.com/user-attachments/assets/fd1bb782-b448-4a75-aa83-b445634742a5" />
<img width="1048" height="401" alt="image" src="https://github.com/user-attachments/assets/5ef86bb6-6558-447b-b380-6b8779cfb630" />








