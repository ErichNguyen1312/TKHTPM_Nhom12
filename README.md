# TKHTPM_Nhom12
Project web bán sách gồm:

- **Backend**: Spring Boot
- **Frontend**: React
- **Database**: MySQL
- **Containerization**: Docker / Docker Compose

---

## Cấu trúc thư mục

```text
TKHTPM_Nhom12/
├── backend/
│   ├── src/
│   ├── pom.xml
│   ├── mvnw
│   ├── mvnw.cmd
│   └── ...
├── frontend/
│   ├── src/
│   ├── package.json
│   ├── Dockerfile
│   └── ...
├── docker-compose.yml
├── docker-compose.dev.yml
└── README.md

Chạy project ở chế độ Dev mode

Đây là cách khuyên dùng khi code hằng ngày.

Bước 1: chạy MySQL + Frontend bằng Docker
docker compose -f docker-compose.dev.yml up --build

Hoặc chạy nền:

docker compose -f docker-compose.dev.yml up --build -d
Bước 2: chạy Backend bằng IntelliJ

Mở thư mục backend trong IntelliJ và chạy class:

BookstoreApplication
Bước 3: bật profile local

Trong IntelliJ Run Configuration, cấu hình:

--spring.profiles.active=local

hoặc chọn Active Profile là:

local