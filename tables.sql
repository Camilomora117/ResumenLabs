CREATE TABLE `DECANATURA` (
  `nombre` varchar(100) NOT NULL,
  `decano` varchar(100) NOT NULL,
  `pagina_web` varchar(100) NOT NULL,
  `id` int(3) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB;

CREATE TABLE `PROGRAMA` (
  `id` int(5) NOT NULL,
  `nombre` varchar(100) NOT NULL,
  `pagina_web` varchar(100) NOT NULL,
  `descripcion` varchar(100) NOT NULL,
  `nivel` varchar(100) NOT NULL,
  `decanatura_id` int(3) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `PROGRAMA_DECANATURA_FK` (`decanatura_id`),
  CONSTRAINT `PROGRAMA_DECANATURA_FK` FOREIGN KEY (`decanatura_id`) REFERENCES `DECANATURA` (`id`)
) ENGINE=InnoDB;

CREATE TABLE `MATERIA` (
  `mnemonico` varchar(4) NOT NULL,
  `nombre` varchar(50) NOT NULL,
  `programa_id` int(5) NOT NULL,
  `nucleo` varchar(100) NOT NULL,
  `creditos` int(1) NOT NULL,
  `semestre` int(2) NOT NULL,
  PRIMARY KEY (`mnemonico`),
  KEY `MATERIA_CARRERA_FK` (`programa_id`),
  CONSTRAINT `MATERIA_PROGRAMA_FK` FOREIGN KEY (`programa_id`) REFERENCES `PROGRAMA` (`id`)
) ENGINE=InnoDB;