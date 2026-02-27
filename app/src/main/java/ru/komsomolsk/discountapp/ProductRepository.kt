package ru.komsomolsk.discountapp

/**
 * Простое хранилище товаров в памяти.
 * Используется основной экран и админ‑панелью.
 */
object ProductRepository {

    /** Полный список товаров в приложении. */
    val products: MutableList<Product> = mutableListOf(
        Product(
            id = 1,
            category = "Смартфоны",
            name = "Samsung Galaxy S23",
            description = "Флагманский смартфон с AMOLED‑дисплеем 120 Гц",
            manufacturer = "Samsung",
            supplier = "ООО МирЭлектроники",
            price = 79990.0,
            unit = "шт.",
            stockQuantity = 10,
            discountPercent = 15.0
        ),
        Product(
            id = 2,
            category = "Ноутбуки",
            name = "ASUS ROG Strix G15",
            description = "Игровой ноутбук с видеокартой RTX",
            manufacturer = "ASUS",
            supplier = "ООО ТехноПоставка",
            price = 139990.0,
            unit = "шт.",
            stockQuantity = 5,
            discountPercent = 10.0
        ),
        Product(
            id = 3,
            category = "Телевизоры",
            name = "LG OLED C3",
            description = "55\" OLED‑телевизор с поддержкой 4K HDR",
            manufacturer = "LG",
            supplier = "ООО ДомТехники",
            price = 159990.0,
            unit = "шт.",
            stockQuantity = 0,
            discountPercent = 20.0
        ),
        Product(
            id = 4,
            category = "Наушники",
            name = "Sony WH‑1000XM5",
            description = "Беспроводные наушники с шумоподавлением",
            manufacturer = "Sony",
            supplier = "ООО ЗвукПлюс",
            price = 39990.0,
            unit = "шт.",
            stockQuantity = 25,
            discountPercent = 5.0
        ),
        Product(
            id = 5,
            category = "Игровые приставки",
            name = "PlayStation 5",
            description = "Игровая приставка нового поколения",
            manufacturer = "Sony",
            supplier = "ООО ГеймерМаркет",
            price = 69990.0,
            unit = "шт.",
            stockQuantity = 3,
            discountPercent = 0.0
        )
    )

    /** Возвращает максимальный текущий id. */
    private fun maxId(): Int = products.maxOfOrNull { it.id } ?: 0

    /** Добавление нового товара. */
    fun addProduct(product: Product) {
        val nextId = maxId() + 1
        products.add(product.copy(id = nextId))
    }

    /** Обновление существующего товара по id. */
    fun updateProduct(updated: Product) {
        val index = products.indexOfFirst { it.id == updated.id }
        if (index != -1) {
            products[index] = updated
        }
    }
}

