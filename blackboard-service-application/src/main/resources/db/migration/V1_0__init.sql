CREATE TABLE `property` (
  `id` int(11) PRIMARY KEY,
  `user_id` varchar(255) NOT NULL,
  `section` varchar(255) NOT NULL,
  `property_key` varchar(255) NOT NULL,
  `property_value` varchar(255) NOT NULL
);