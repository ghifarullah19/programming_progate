/*
dapatkan nama dan jumlah barang untuk pengguna
yang sudah membeli lebih dari 10 barang
*/
SELECT users.id, users.name, COUNT(*) AS "jumlah"
FROM users
JOIN sales_records
ON users.id = sales_records.user_id
GROUP BY users.id
HAVING COUNT(*) >= 10
;