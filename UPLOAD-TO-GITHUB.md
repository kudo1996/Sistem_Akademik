# Langkah-langkah Upload ke GitHub

## 1. Setelah membuat repository di GitHub, jalankan command berikut:

# Ganti 'username' dengan username GitHub Anda dan 'repository-name' dengan nama repository
git remote add origin https://github.com/username/repository-name.git

# Contoh:
# git remote add origin https://github.com/johndoe/javadocs-tugas2.git

## 2. Push ke GitHub
git branch -M main
git push -u origin main

## 3. Verifikasi upload
# Buka browser dan cek repository GitHub Anda
# Pastikan folder docs/ dan semua file HTML sudah terupload

## 4. Enable GitHub Pages (opsional, untuk hosting dokumentasi)
# Di repository GitHub:
# 1. Klik Settings
# 2. Scroll ke "Pages" di sidebar kiri
# 3. Source: Deploy from a branch
# 4. Branch: main
# 5. Folder: /docs
# 6. Save

# Setelah itu dokumentasi Javadocs bisa diakses di:
# https://username.github.io/repository-name/

## Commands yang sudah dijalankan:
# ✅ git init
# ✅ git add .
# ✅ git commit -m "Initial commit: Java project with Javadocs HTML documentation"

## Commands yang perlu dijalankan selanjutnya:
# ⏳ git remote add origin [URL-GITHUB-REPO]
# ⏳ git branch -M main  
# ⏳ git push -u origin main