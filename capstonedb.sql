-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Хост: 127.0.0.1
-- Время создания: Июн 07 2023 г., 15:09
-- Версия сервера: 10.4.28-MariaDB
-- Версия PHP: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- База данных: `capstonedb`
--

-- --------------------------------------------------------

--
-- Структура таблицы `authusergroup`
--

CREATE TABLE `authusergroup` (
  `id` int(11) NOT NULL,
  `customerscredentialsid` int(11) DEFAULT NULL,
  `authgroup` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Дамп данных таблицы `authusergroup`
--

INSERT INTO `authusergroup` (`id`, `customerscredentialsid`, `authgroup`) VALUES
(1, 1, 'ADMIN'),
(2, 1, 'CUSTOMER');

-- --------------------------------------------------------

--
-- Структура таблицы `customers`
--

CREATE TABLE `customers` (
  `id` int(11) NOT NULL,
  `name` varchar(50) NOT NULL,
  `surname` varchar(50) NOT NULL,
  `mobile` varchar(20) NOT NULL,
  `dob` date NOT NULL,
  `email` varchar(50) NOT NULL,
  `homeaddress` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Дамп данных таблицы `customers`
--

INSERT INTO `customers` (`id`, `name`, `surname`, `mobile`, `dob`, `email`, `homeaddress`) VALUES
(1, 'BOB', 'DYLAN', '+77011112233', '2022-06-01', 'BOBDYLAN@GMAIL.COM', 'BOBDYLANS HOME ADDEESS');

-- --------------------------------------------------------

--
-- Структура таблицы `customerscredentials`
--

CREATE TABLE `customerscredentials` (
  `id` int(11) NOT NULL,
  `customerid` int(11) NOT NULL,
  `username` varchar(20) NOT NULL,
  `password` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Дамп данных таблицы `customerscredentials`
--

INSERT INTO `customerscredentials` (`id`, `customerid`, `username`, `password`) VALUES
(1, 1, 'BOBDYLAN', '$2a$10$v2qtFXNMtty347.iYAVu1.94T.Hk1L19jFHWis4EjExx.Jh7S0fWa');

-- --------------------------------------------------------

--
-- Структура таблицы `dishes`
--

CREATE TABLE `dishes` (
  `id` int(11) NOT NULL,
  `foodtypeid` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Структура таблицы `foodtypes`
--

CREATE TABLE `foodtypes` (
  `id` int(11) NOT NULL,
  `name` varchar(50) NOT NULL,
  `price` decimal(10,0) NOT NULL,
  `description` varchar(200) NOT NULL,
  `image` longblob DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Дамп данных таблицы `foodtypes`
--

INSERT INTO `foodtypes` (`id`, `name`, `price`, `description`, `image`) VALUES
(1, 'Pizza Pepperoni', 1500, 'Savoury pepperoni, homestyle sauce, and ooey-gooey, stretchy mozzarella', NULL),
(2, 'Pizza Buffalo chicken', 1850, 'BBQ Chicken, red onions, parmesan cheese on a Buffalo sauce base.', NULL),
(3, 'Pizza Meat supreme', 2500, 'Classic pepperoni, bacon crumble, salami, spicy Italian sausage, mozzarella cheese.', NULL),
(4, 'Pizza Vegetarian', 1230, 'Mozzarella cheese, our signature tomato sauce, mushroom, onion, peppers, cherry tomatoes.', NULL),
(5, 'Pizza Europa pizza', 2400, 'Sun-dried tomato, goat cheese, fresh basil, and mozzarella.', NULL),
(6, 'Pizza Hawaiian pizza', 1500, 'Ham and pineapple.', NULL),
(7, 'Pizza Napoli', 2500, 'Just default pizza4', NULL);

-- --------------------------------------------------------

--
-- Структура таблицы `ordercart`
--

CREATE TABLE `ordercart` (
  `id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Структура таблицы `ordercart_dishes`
--

CREATE TABLE `ordercart_dishes` (
  `ordercartid` int(11) NOT NULL,
  `dishid` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Структура таблицы `orderdetails`
--

CREATE TABLE `orderdetails` (
  `id` int(11) NOT NULL,
  `orderid` int(11) DEFAULT NULL,
  `ordercartid` int(11) DEFAULT NULL,
  `deliveryname` varchar(50) NOT NULL,
  `deliveryMOBILE` varchar(50) NOT NULL,
  `deliveryADDRESS` varchar(200) NOT NULL,
  `SPECIALCOMMENTS` varchar(200) NOT NULL,
  `deliveryprice` decimal(10,0) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Структура таблицы `orders`
--

CREATE TABLE `orders` (
  `id` int(11) NOT NULL,
  `customerid` int(11) DEFAULT NULL,
  `sum` decimal(10,0) NOT NULL,
  `date` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Структура таблицы `payments`
--

CREATE TABLE `payments` (
  `id` int(11) NOT NULL,
  `orderid` int(11) DEFAULT NULL,
  `paymentmethod` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Структура таблицы `toppings`
--

CREATE TABLE `toppings` (
  `id` int(11) NOT NULL,
  `name` varchar(50) NOT NULL,
  `price` decimal(10,0) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Дамп данных таблицы `toppings`
--

INSERT INTO `toppings` (`id`, `name`, `price`) VALUES
(1, 'cheese', 100),
(2, 'pepper', 150),
(3, 'jalapeno', 300),
(4, 'olives', 500);

-- --------------------------------------------------------

--
-- Структура таблицы `toppings_dishes`
--

CREATE TABLE `toppings_dishes` (
  `toppingid` int(11) NOT NULL,
  `dishid` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Индексы сохранённых таблиц
--

--
-- Индексы таблицы `authusergroup`
--
ALTER TABLE `authusergroup`
  ADD PRIMARY KEY (`id`),
  ADD KEY `customerscredentialsid` (`customerscredentialsid`);

--
-- Индексы таблицы `customers`
--
ALTER TABLE `customers`
  ADD PRIMARY KEY (`id`);

--
-- Индексы таблицы `customerscredentials`
--
ALTER TABLE `customerscredentials`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `username` (`username`),
  ADD KEY `customerid` (`customerid`);

--
-- Индексы таблицы `dishes`
--
ALTER TABLE `dishes`
  ADD PRIMARY KEY (`id`),
  ADD KEY `foodtypeid` (`foodtypeid`);

--
-- Индексы таблицы `foodtypes`
--
ALTER TABLE `foodtypes`
  ADD PRIMARY KEY (`id`);

--
-- Индексы таблицы `ordercart`
--
ALTER TABLE `ordercart`
  ADD PRIMARY KEY (`id`);

--
-- Индексы таблицы `ordercart_dishes`
--
ALTER TABLE `ordercart_dishes`
  ADD PRIMARY KEY (`ordercartid`,`dishid`),
  ADD KEY `dishid` (`dishid`);

--
-- Индексы таблицы `orderdetails`
--
ALTER TABLE `orderdetails`
  ADD PRIMARY KEY (`id`),
  ADD KEY `orderid` (`orderid`),
  ADD KEY `ordercartid` (`ordercartid`);

--
-- Индексы таблицы `orders`
--
ALTER TABLE `orders`
  ADD PRIMARY KEY (`id`),
  ADD KEY `customerid` (`customerid`);

--
-- Индексы таблицы `payments`
--
ALTER TABLE `payments`
  ADD PRIMARY KEY (`id`),
  ADD KEY `orderid` (`orderid`);

--
-- Индексы таблицы `toppings`
--
ALTER TABLE `toppings`
  ADD PRIMARY KEY (`id`);

--
-- Индексы таблицы `toppings_dishes`
--
ALTER TABLE `toppings_dishes`
  ADD PRIMARY KEY (`dishid`,`toppingid`),
  ADD KEY `toppingid` (`toppingid`);

--
-- AUTO_INCREMENT для сохранённых таблиц
--

--
-- AUTO_INCREMENT для таблицы `authusergroup`
--
ALTER TABLE `authusergroup`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT для таблицы `customers`
--
ALTER TABLE `customers`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT для таблицы `customerscredentials`
--
ALTER TABLE `customerscredentials`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT для таблицы `dishes`
--
ALTER TABLE `dishes`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT для таблицы `foodtypes`
--
ALTER TABLE `foodtypes`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT для таблицы `ordercart`
--
ALTER TABLE `ordercart`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT для таблицы `orderdetails`
--
ALTER TABLE `orderdetails`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT для таблицы `orders`
--
ALTER TABLE `orders`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT для таблицы `payments`
--
ALTER TABLE `payments`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT для таблицы `toppings`
--
ALTER TABLE `toppings`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- Ограничения внешнего ключа сохраненных таблиц
--

--
-- Ограничения внешнего ключа таблицы `authusergroup`
--
ALTER TABLE `authusergroup`
  ADD CONSTRAINT `authusergroup_ibfk_1` FOREIGN KEY (`customerscredentialsid`) REFERENCES `customerscredentials` (`id`);

--
-- Ограничения внешнего ключа таблицы `customerscredentials`
--
ALTER TABLE `customerscredentials`
  ADD CONSTRAINT `customerscredentials_ibfk_1` FOREIGN KEY (`customerid`) REFERENCES `customers` (`id`);

--
-- Ограничения внешнего ключа таблицы `dishes`
--
ALTER TABLE `dishes`
  ADD CONSTRAINT `dishes_ibfk_1` FOREIGN KEY (`foodtypeid`) REFERENCES `foodtypes` (`id`);

--
-- Ограничения внешнего ключа таблицы `ordercart_dishes`
--
ALTER TABLE `ordercart_dishes`
  ADD CONSTRAINT `ordercart_dishes_ibfk_1` FOREIGN KEY (`ordercartid`) REFERENCES `ordercart` (`id`),
  ADD CONSTRAINT `ordercart_dishes_ibfk_2` FOREIGN KEY (`dishid`) REFERENCES `dishes` (`id`);

--
-- Ограничения внешнего ключа таблицы `orderdetails`
--
ALTER TABLE `orderdetails`
  ADD CONSTRAINT `orderdetails_ibfk_1` FOREIGN KEY (`orderid`) REFERENCES `orders` (`id`),
  ADD CONSTRAINT `orderdetails_ibfk_2` FOREIGN KEY (`ordercartid`) REFERENCES `ordercart` (`id`);

--
-- Ограничения внешнего ключа таблицы `orders`
--
ALTER TABLE `orders`
  ADD CONSTRAINT `orders_ibfk_1` FOREIGN KEY (`customerid`) REFERENCES `customers` (`id`);

--
-- Ограничения внешнего ключа таблицы `payments`
--
ALTER TABLE `payments`
  ADD CONSTRAINT `payments_ibfk_1` FOREIGN KEY (`orderid`) REFERENCES `orders` (`id`);

--
-- Ограничения внешнего ключа таблицы `toppings_dishes`
--
ALTER TABLE `toppings_dishes`
  ADD CONSTRAINT `toppings_dishes_ibfk_1` FOREIGN KEY (`toppingid`) REFERENCES `toppings` (`id`),
  ADD CONSTRAINT `toppings_dishes_ibfk_2` FOREIGN KEY (`dishid`) REFERENCES `dishes` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
