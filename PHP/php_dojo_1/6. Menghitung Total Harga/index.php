<?php
$prices = array(10, 6, 7, 8);
echo 'Nilai $prices: ';
//Dikarenakan $prices merupakan array, maka gunakan foreach
foreach ($prices as $price) {
  echo $price.' ';
}
echo '<br>';
echo '-----';
echo '<br>';

// Ketik code Anda dibawah
//Mendefinisikan variable untuk menampung nilai awal harga total
$total_price = 0;
//Gunakan foreach untuk menambahkan harga masing-masing
foreach ($prices as $price) {
  $total_price += $price;
}
echo 'Harga total adalah $' . $total_price;
?>