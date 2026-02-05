# Item Service – Spring Boot API

A simple Spring Boot REST API to manage items using in-memory storage.

## 🚀 Live Link

```
https://item-service-springboot-production.up.railway.app/items
```

## 📌 Features

* Add item
* Get all items
* Get item by ID

## 🛠️ Tech Stack

* Java 17
* Spring Boot
* Maven

## 🔗 API Endpoints

**GET all items**

```
/items
```

**GET item by ID**

```
/items/{id}
```

**POST add item**

```
/items
```

Example body:

```json
{
  "id": 1,
  "name": "Laptop",
  "description": "Gaming laptop"
}
```

## ▶️ Run Locally

```bash
git clone https://github.com/MayurPatil-07/item-service-springboot.git
```

Open in Spring Tool Suite and run `ItemServiceApplication.java`.

