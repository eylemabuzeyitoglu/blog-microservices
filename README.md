# Microservices Blog Platform

Bu proje, Spring Boot kullanılarak geliştirilmiş bir mikroservis mimarisi blog platformudur. Proje, üç ana mikroservisten oluşmaktadır: Auth Service, Blog Service ve User Service.

## Proje Yapısı

```
.
├── auth-service/        # Kimlik doğrulama servisi
├── blog-service/        # Blog yönetim servisi
├── user-service/        # Kullanıcı yönetim servisi
├── common/             # Ortak kütüphaneler ve bileşenler
├── init-db/            # Veritabanı başlangıç scriptleri
└── docker-compose.yml  # Docker konfigürasyonu
```

## Servisler

### Auth Service (Port: 8080)
- JWT tabanlı kimlik doğrulama
- Kullanıcı girişi ve kayıt işlemleri
- Token yönetimi

### Blog Service (Port: 8081)
- Blog yazılarının yönetimi
- Blog içerik işlemleri

### User Service (Port: 8082)
- Kullanıcı profili yönetimi
- Kullanıcı bilgilerinin saklanması
- Kullanıcı işlemleri

## Teknolojiler

- Java 17
- Spring Boot
- Spring Security
- Spring Data JPA
- PostgreSQL
- RabbitMQ
- Docker
- Maven

## Gereksinimler

- Docker ve Docker Compose
- JDK 17
- Maven

## Kurulum ve Çalıştırma

1. Projeyi klonlayın:
```bash
git clone [proje-url]
```

2. Docker Compose ile servisleri başlatın:
```bash
docker-compose up -d
```

3. Servisler aşağıdaki portlarda çalışacaktır:
- Auth Service: http://localhost:8080
- Blog Service: http://localhost:8081
- User Service: http://localhost:8082
- RabbitMQ Management: http://localhost:15672
- PostgreSQL: localhost:5434

## Veritabanı

- PostgreSQL veritabanı kullanılmaktadır
- Her servis kendi veritabanına sahiptir
- Veritabanı başlangıç scriptleri `init-db` klasöründe bulunmaktadır

## Mesajlaşma

- RabbitMQ kullanılarak servisler arası iletişim sağlanmaktadır
- RabbitMQ Management Console'a http://localhost:15672 adresinden erişilebilir
- Varsayılan kullanıcı adı ve şifre: guest/guest

## Güvenlik

- JWT tabanlı kimlik doğrulama
- Spring Security ile güvenlik yönetimi
- Hassas bilgiler environment variable'lar ile yönetilmektedir

## Geliştirme

Her servis için ayrı bir Maven projesi bulunmaktadır. Servisleri ayrı ayrı geliştirmek için:

1. İlgili servis dizinine gidin
2. Maven ile bağımlılıkları yükleyin:
```bash
mvn clean install
```
3. Servisi başlatın:
```bash
mvn spring-boot:run
```

