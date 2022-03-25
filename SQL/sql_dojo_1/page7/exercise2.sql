-- dapatkan total penjualan dan total laba untuk seluruh site
SELECT SUM(items.price) AS "total penjualan", SUM(items.price-items.cost) AS "total laba"
FROM items
JOIN sales_records
ON items.id = sales_records.item_id
;