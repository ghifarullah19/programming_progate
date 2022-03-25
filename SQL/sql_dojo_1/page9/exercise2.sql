-- dapatkan id dan nama pengguna yang membeli "sandal"
SELECT users.id, users.name
FROM users
JOIN sales_records
ON users.id = sales_records.user_id
WHERE item_id = 18
GROUP BY users.id
;