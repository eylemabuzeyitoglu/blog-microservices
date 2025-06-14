#!/bin/bash
set -e

# Veritabanı oluşturma işlemi, default 'postgres' veritabanına bağlanarak yapılmalı
until pg_isready -h localhost -p 5432 -U "$POSTGRES_USER"; do
  echo "PostgreSQL hazır değil - bekleniyor..."
  sleep 1
done

echo "PostgreSQL hazır!"

psql -v ON_ERROR_STOP=1 --username "$POSTGRES_USER" --dbname "postgres" <<-EOSQL
    CREATE DATABASE blog_service;
    CREATE DATABASE user_service;
EOSQL

echo "Veritabanları (blog_service, user_service) başarıyla oluşturuldu."
