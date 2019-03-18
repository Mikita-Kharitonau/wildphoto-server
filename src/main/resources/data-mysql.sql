insert ignore into users (email, name, password, username, avatar_src) values ('user@user.com', 'Никита Харитонов', 'user', 'user', 'photos/H20SY3wdF7Y.jpg');

insert ignore into photos (id, title, date, thumbnail_src, fullsize_src, user_id) values (
  1, 'Черный аист', '2019-03-15 12:45:07', 'photos/thumbnails/Черный аист.jpg', 'photos/Черный аист.jpg', 1
);

insert ignore into photos (id, title, date, thumbnail_src, fullsize_src, user_id) values (
  2, 'Грация', '2019-03-15 12:45:07', 'photos/thumbnails/DSC_1522к.jpg', 'photos/DSC_1522к.jpg', 1
);

insert ignore into photos (id, title, date, thumbnail_src, fullsize_src, user_id) values (
  3, 'Белая цапля', '2019-03-15 12:45:07', 'photos/thumbnails/палатка 261ц.jpg', 'photos/палатка 261ц.jpg', 1
);

insert ignore into photos (id, title, date, thumbnail_src, fullsize_src, user_id) values (
  4, 'На фоне заходящего солнца', '2019-03-15 12:45:07', 'photos/thumbnails/DSC_0253.jpg', 'photos/DSC_0253.jpg', 1
);

insert ignore into photos (id, title, date, thumbnail_src, fullsize_src, user_id) values (
  5, 'Вот такой вот портрет', '2019-03-15 12:45:07', 'photos/thumbnails/DSC_0099.jpg', 'photos/DSC_0099.jpg', 1
);

insert ignore into photos (id, title, date, thumbnail_src, fullsize_src, user_id) values (
  6, 'Утро в июле 2015', '2019-03-15 12:45:07', 'photos/thumbnails/DSC_0835.jpg', 'photos/DSC_0835.jpg', 1
);

insert ignore into photos (id, title, date, thumbnail_src, fullsize_src, user_id) values (
  7, 'Республиканский ландшафтный заказник Выдрица', '2019-03-15 12:45:07', 'photos/thumbnails/DSC_0525а1.jpg', 'photos/DSC_0525а1.jpg', 1
);

insert ignore into photos (id, title, date, thumbnail_src, fullsize_src, user_id) values (
  8, 'Черный аист', '2019-03-15 12:45:07', 'photos/thumbnails/черный аист(2).jpg', 'photos/черный аист(2).jpg', 1
);

insert ignore into photos (id, title, date, thumbnail_src, fullsize_src, user_id) values (
  9, 'Портрет', '2019-03-15 12:45:07', 'photos/thumbnails/косуля2.jpg', 'photos/косуля2.jpg', 1
);

insert ignore into photos (id, title, date, thumbnail_src, fullsize_src, user_id) values (
  10, 'Рогатый', '2019-03-15 12:45:07', 'photos/thumbnails/DSC_1586л.jpg', 'photos/DSC_1586л.jpg', 1
);

insert ignore into photos (id, title, date, thumbnail_src, fullsize_src, user_id) values (
  11, 'Портрет', '2019-03-15 12:45:07', 'photos/thumbnails/косуля1.jpg', 'photos/косуля1.jpg', 1
);

insert ignore into photos (id, title, date, thumbnail_src, fullsize_src, user_id) values (
  12, 'Рисунок маслом', '2019-03-15 12:45:07', 'photos/thumbnails/палатка 044.jpg', 'photos/палатка 044.jpg', 1
);



insert ignore into comments (id, text, date, user_id, photo_id) values (
  1, 'Отличная работа! Поздравляю! Отличная работа! Поздравляю!', '2019-03-15 12:51:20', 1, 1
)