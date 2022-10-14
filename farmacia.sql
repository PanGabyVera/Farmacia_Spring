-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 14-10-2022 a las 21:21:38
-- Versión del servidor: 10.4.22-MariaDB
-- Versión de PHP: 8.0.13

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `farmacia`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pedidomedicamentos`
--

CREATE TABLE `pedidomedicamentos` (
  `id` int(11) NOT NULL,
  `nombre` varchar(30) NOT NULL,
  `tipo` varchar(15) NOT NULL,
  `cantidad` int(11) NOT NULL,
  `distribuidor` varchar(15) NOT NULL,
  `sucursal` varchar(15) NOT NULL,
  `resultado` varchar(250) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `pedidomedicamentos`
--

INSERT INTO `pedidomedicamentos` (`id`, `nombre`, `tipo`, `cantidad`, `distribuidor`, `sucursal`, `resultado`) VALUES
(1, 'Gabitril', 'Gabapentina', 30, 'COFARMA', 'PRINCIPAL.', '(Distribuidor: COFARMA) 30 unidades de Gabapentina: Gabitril. Para la Farmacia SITUADA en  - PEDIDO ENVIADO CORRECTAMENTE -'),
(2, 'Salsitab', 'Salsalato', 20, 'EMPSEPHAR', 'SECUNDARIA.', '(Distribuidor: EMPSEPHAR) 20 unidades de Salsalato: Salsitab. Para la Farmacia SITUADA en  - PEDIDO ENVIADO CORRECTAMENTE -'),
(3, 'Omeprazol', 'Antiácidos', 55, 'CEMEFAR', 'SECUNDARIA.', '(Distribuidor: CEMEFAR) 55 unidades de Antiácidos: Omeprazol. Para la Farmacia SITUADA en  - PEDIDO ENVIADO CORRECTAMENTE -'),
(4, 'Calquence', 'Calabrutini', 10, 'CODARMA', 'Principal', '(Distribuidor: CEMEFAR) 32 unidades de Calabrutini: Calquence. Para la Farmacia SITUADA en Octavio Chacón Moscoso - PEDIDO ENVIADO CORRECTAMENTE -'),
(5, 'EPINEFRINA', 'LIDOCAÍNA', 17, 'CODARMA', 'SECUNDARIA', '(Distribuidor: CODARMA) 17 unidades de LIDOCAÍNA: EPINEFRINA. Para la Farmacia SITUADA en AV de la Independencia - PEDIDO ENVIADO CORRECTAMENTE -'),
(6, 'FLUNITRAZEPAM', 'LIDOCAÍNA', 17, 'EMPSEPHAR ', 'SECUNDARIA', '(Distribuidor: EMPSEPHAR ) 17 unidades de LIDOCAÍNA: FLUNITRAZEPAM. Para la Farmacia SITUADA en AV de la Independencia - PEDIDO ENVIADO CORRECTAMENTE -');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `pedidomedicamentos`
--
ALTER TABLE `pedidomedicamentos`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `pedidomedicamentos`
--
ALTER TABLE `pedidomedicamentos`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
