-- dapatkan data total penjualan untuk gender pria, wanita, dan netral
SELECT items.gender, SUM(items.price) AS "total penjualan"
FROM items
JOIN sales_records
ON items.id = sales_records.item_id
GROUP BY gender
;