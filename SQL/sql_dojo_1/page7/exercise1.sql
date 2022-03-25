-- dapatkan nama dan jumlah penjualan unit untuk 5 barang dengan penjualan tertinggi
SELECT items.id, items.name, COUNT(*)
FROM items
JOIN sales_records 
ON items.id = sales_records.item_id
GROUP BY items.id, items.name
ORDER BY COUNT(*) DESC
LIMIT 5
;