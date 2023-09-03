-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1:3306
-- Tiempo de generación: 03-09-2023 a las 21:16:55
-- Versión del servidor: 5.7.36
-- Versión de PHP: 7.4.26

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `vuelos`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `alumno`
--

DROP TABLE IF EXISTS `alumno`;
CREATE TABLE IF NOT EXISTS `alumno` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `ced` varchar(10) NOT NULL,
  `nombres` varchar(64) NOT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `alumno`
--

INSERT INTO `alumno` (`Id`, `ced`, `nombres`) VALUES
(3, '1822345267', 'Juanito Caicedo'),
(6, '17224', 'Dario Pacha'),
(7, '1744562389', 'Margarita Castillo'),
(8, '1723345263', 'Sofia Velez'),
(9, '1722782389', 'Doleres'),
(12, 'Olga', '1234567890');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `ciudad`
--

DROP TABLE IF EXISTS `ciudad`;
CREATE TABLE IF NOT EXISTS `ciudad` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `pais_id` int(11) UNSIGNED DEFAULT NULL,
  `nombre` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `id_pais` (`pais_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `ciudad`
--

INSERT INTO `ciudad` (`id`, `pais_id`, `nombre`) VALUES
(1, 17, 'guayas'),
(2, 18, 'La Paz');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pais`
--

DROP TABLE IF EXISTS `pais`;
CREATE TABLE IF NOT EXISTS `pais` (
  `id` int(11) UNSIGNED NOT NULL AUTO_INCREMENT,
  `paisnombre` varchar(112) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `pais`
--

INSERT INTO `pais` (`id`, `paisnombre`) VALUES
(16, 'Ecuador-Quito'),
(17, 'Ecuador-Guayaquil'),
(18, 'Bolivia');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `perfil`
--

DROP TABLE IF EXISTS `perfil`;
CREATE TABLE IF NOT EXISTS `perfil` (
  `idper` int(11) NOT NULL AUTO_INCREMENT,
  `nperfil` varchar(32) NOT NULL,
  `estado` int(11) NOT NULL,
  PRIMARY KEY (`idper`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `perfil`
--

INSERT INTO `perfil` (`idper`, `nperfil`, `estado`) VALUES
(2, 'Usuario', 1),
(3, 'Despachador', 1),
(4, 'Inventario', 1),
(5, 'Administrador', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `rese`
--

DROP TABLE IF EXISTS `rese`;
CREATE TABLE IF NOT EXISTS `rese` (
  `idr` int(11) NOT NULL AUTO_INCREMENT,
  `id_pais` int(10) UNSIGNED NOT NULL,
  PRIMARY KEY (`idr`),
  KEY `pais id_pais rese` (`id_pais`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `reserv`
--

DROP TABLE IF EXISTS `reserv`;
CREATE TABLE IF NOT EXISTS `reserv` (
  `idr` int(11) NOT NULL AUTO_INCREMENT,
  `pais_origen` int(10) UNSIGNED NOT NULL,
  `destino` int(10) UNSIGNED NOT NULL,
  `npasajeros` varchar(64) NOT NULL,
  `fecha` varchar(64) NOT NULL,
  `ciudad_id` int(11) DEFAULT NULL,
  `nombre` varchar(128) DEFAULT NULL,
  `cliente` varchar(128) DEFAULT NULL,
  `precio` float DEFAULT NULL,
  PRIMARY KEY (`idr`),
  KEY `pais pais_origen reserv` (`pais_origen`),
  KEY `pais destino reserv` (`destino`),
  KEY `fk_ciudad` (`ciudad_id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `reserv`
--

INSERT INTO `reserv` (`idr`, `pais_origen`, `destino`, `npasajeros`, `fecha`, `ciudad_id`, `nombre`, `cliente`, `precio`) VALUES
(2, 17, 18, '2', '23', 2, 'ee', 'ee', 12.3),
(4, 17, 16, '12', '12', NULL, NULL, NULL, NULL);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `reserva`
--

DROP TABLE IF EXISTS `reserva`;
CREATE TABLE IF NOT EXISTS `reserva` (
  `idr` int(11) NOT NULL AUTO_INCREMENT,
  `origen` varchar(32) NOT NULL,
  `destino` varchar(32) NOT NULL,
  `fecha` varchar(32) NOT NULL,
  `npasajeros` varchar(32) NOT NULL,
  `id_pais` int(11) UNSIGNED NOT NULL,
  `llegada` int(10) UNSIGNED NOT NULL,
  PRIMARY KEY (`idr`),
  KEY `pais id_pais reserva` (`id_pais`),
  KEY `pais llegada reserva` (`llegada`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `travel`
--

DROP TABLE IF EXISTS `travel`;
CREATE TABLE IF NOT EXISTS `travel` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `id_pais` int(11) DEFAULT NULL,
  `id_ciudad` int(11) DEFAULT NULL,
  `fecha_salida` date DEFAULT NULL,
  `fecha_llegada` date DEFAULT NULL,
  `num_personas` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `id_pais` (`id_pais`),
  KEY `id_ciudad` (`id_ciudad`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `traveling`
--

DROP TABLE IF EXISTS `traveling`;
CREATE TABLE IF NOT EXISTS `traveling` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `pais_id` int(11) NOT NULL,
  `ciudad_id` int(11) NOT NULL,
  `nombre` varchar(64) DEFAULT NULL,
  `cliente` varchar(128) DEFAULT NULL,
  `fecha` date DEFAULT NULL,
  `pasajeros` varchar(20) DEFAULT NULL,
  `precio` float DEFAULT NULL,
  `destino_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `ciudad_id` (`ciudad_id`),
  KEY `fk_destino` (`destino_id`),
  KEY `fk_pais` (`pais_id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuari`
--

DROP TABLE IF EXISTS `usuari`;
CREATE TABLE IF NOT EXISTS `usuari` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `ced` varchar(11) NOT NULL,
  `nombres` varchar(32) NOT NULL,
  `apellido` varchar(32) NOT NULL,
  `email` varchar(64) NOT NULL,
  `password` varchar(32) NOT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `usuari`
--

INSERT INTO `usuari` (`Id`, `ced`, `nombres`, `apellido`, `email`, `password`) VALUES
(1, '1751', 'as', 'pijal', 'alexanderjhoel08@gmail.com', '123123'),
(5, '654', '654', '654', '654', '654'),
(11, '1755973342', 'Luis', 'Jurado', 'luis@hotmail.com', '1234'),
(13, '232323', 'fasdfasd', 'afdsdsf', 'fasdfasd@dsfsad', 'fasdfasdf'),
(14, '1005674563', 'Joel', 'Pijal', 'joel@hotmail.com', 'tuvieja'),
(15, 'dsd', 'dfdf', 'dfdf', 'dfdf@asas', 'dfddf'),
(16, '233333', 'Hola', 'Alo', 'tumama@hotmail.com', '34f34f34'),
(17, '44444444', 'asddfs', 'dsfasdfsad', '2434@fsadfasd', 'asdfasdf'),
(18, '423432', 'Joel', 'Pijal', 'joel@hotmail.com', 'kjhjkhjk'),
(19, '423432', 'Joel', 'Pijal', 'joel@hotmail.com', 'jhkjhkjkjhj'),
(20, '1755973342', 'Luis', 'Jurado', 'luis@hotmail.com', '123456');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `vuelo`
--

DROP TABLE IF EXISTS `vuelo`;
CREATE TABLE IF NOT EXISTS `vuelo` (
  `idv` int(11) NOT NULL AUTO_INCREMENT,
  `precio` float NOT NULL,
  `fsalida` varchar(64) NOT NULL,
  `duracion` varchar(32) NOT NULL,
  `psalida` varchar(32) NOT NULL,
  `csalida` varchar(32) NOT NULL,
  `pllegada` varchar(32) NOT NULL,
  `cllegada` varchar(32) NOT NULL,
  PRIMARY KEY (`idv`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `vuelo`
--

INSERT INTO `vuelo` (`idv`, `precio`, `fsalida`, `duracion`, `psalida`, `csalida`, `pllegada`, `cllegada`) VALUES
(12, 1000, '2023-07-20', '2 Horas', 'Ecuador', 'Quito', 'Perú', 'Limaa'),
(13, 9, '2023-09-08', '4', 'Ecuador', 'jhh', 'Ecuador', 'jl'),
(14, 2, '2023-09-02', '2', 'a', 'a', 'a', 'a');

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `ciudad`
--
ALTER TABLE `ciudad`
  ADD CONSTRAINT `ciudad_ibfk_1` FOREIGN KEY (`pais_id`) REFERENCES `pais` (`id`) ON DELETE SET NULL ON UPDATE CASCADE;

--
-- Filtros para la tabla `rese`
--
ALTER TABLE `rese`
  ADD CONSTRAINT `pais id_pais rese` FOREIGN KEY (`id_pais`) REFERENCES `pais` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `reserv`
--
ALTER TABLE `reserv`
  ADD CONSTRAINT `fk_ciudad` FOREIGN KEY (`ciudad_id`) REFERENCES `ciudad` (`id`),
  ADD CONSTRAINT `pais destino reserv` FOREIGN KEY (`destino`) REFERENCES `pais` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `pais pais_origen reserv` FOREIGN KEY (`pais_origen`) REFERENCES `pais` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `reserva`
--
ALTER TABLE `reserva`
  ADD CONSTRAINT `pais llegada reserva` FOREIGN KEY (`llegada`) REFERENCES `pais` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
