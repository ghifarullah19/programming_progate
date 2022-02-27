<?php
$menus = array(
  array('name' => 'GULAI', 'price' => 9),
  array('name' => 'PASTA', 'price' => 12),
  array('name' => 'KOPI', 'price' => 6)
);

// Ketik code Anda dibawah
$totalPrice = 0;
$maxPrice = 0;
//Dikarenakan $highMenu merupakan string, maka nilai awal adalah string yang kosong
$highMenu = '';
foreach ($menus as $menu) {
  echo $menu['name'].' berharga $'.$menu['price'];
  echo '<br>';
  $totalPrice += $menu['price'];
  
  $name = $menu['name'];
  if ($menu['price'] > $maxPrice) {
    $maxPrice = $menu['price'];
    //Dikarenakan $name yang minta harus sesuai dengan $maxPrice, maka $name diletakkan di dalam if
    $highMenu = $name;
  }
}
echo 'Harga total adalah $'.$totalPrice;
echo 'Harga item termahal adalah '.$highMenu.' dengan harga $'.$maxPrice;
?>