-- dapatkan semua barang dengan total penjualan yang lebih besar dari "hoodie abu-abu"
SELECT items.id, items.name, items.price * COUNT(*) AS "total penjualan"
FROM items
JOIN sales_records
ON items.id = sales_records.item_id
GROUP BY items.id, items.name, items.price
HAVING (items.price * COUNT(*)) > (
  SELECT items.price * COUNT(*)
  FROM sales_records
  JOIN items
  ON sales_records.item_id = items.id
  WHERE items.name = "hoodie abu-abu"
)
;