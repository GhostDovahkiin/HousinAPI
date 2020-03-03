create table anuncio (
  codigo_anuncio serial primary key,
  descricao varchar(255) not null,
  codigo_casa integer not null,
  codigo_usuario integer not null,
  foreign key (codigo_casa) references casa(codigo_casa),
  foreign key (codigo_usuario) references usuario(codigo)
);

INSERT INTO anuncio (descricao,codigo_casa,codigo_usuario) VALUES ('Proin velit. Sed malesuada augue ut lacus. Nulla tincidunt, neque',1,1),('posuere at, velit. Cras lorem lorem, luctus ut, pellentesque eget,',2,2),('nibh vulputate mauris sagittis placerat. Cras dictum ultricies ligula. Nullam',3,3),('Etiam gravida molestie arcu. Sed eu nibh vulputate mauris sagittis',4,4),('dui quis accumsan convallis, ante lectus convallis est, vitae sodales',5,5),('dolor. Fusce mi lorem, vehicula et, rutrum eu, ultrices sit',6,6),('vitae, orci. Phasellus dapibus quam quis diam. Pellentesque habitant morbi',7,7),('placerat. Cras dictum ultricies ligula. Nullam enim. Sed nulla ante,',8,8),('convallis convallis dolor. Quisque tincidunt pede ac urna. Ut tincidunt',9,9),('arcu. Aliquam ultrices iaculis odio. Nam interdum enim non nisi.',10,10);
INSERT INTO anuncio (descricao,codigo_casa,codigo_usuario) VALUES ('urna. Nullam lobortis quam a felis ullamcorper viverra. Maecenas iaculis',11,11),('dui augue eu tellus. Phasellus elit pede, malesuada vel, venenatis',12,12),('dolor. Fusce mi lorem, vehicula et, rutrum eu, ultrices sit',13,13),('et magnis dis parturient montes, nascetur ridiculus mus. Proin vel',14,14),('tincidunt nibh. Phasellus nulla. Integer vulputate, risus a ultricies adipiscing,',15,15),('fermentum metus. Aenean sed pede nec ante blandit viverra. Donec',16,16),('sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus',17,17),('justo eu arcu. Morbi sit amet massa. Quisque porttitor eros',18,18),('velit. Sed malesuada augue ut lacus. Nulla tincidunt, neque vitae',19,19),('urna et arcu imperdiet ullamcorper. Duis at lacus. Quisque purus',20,20);
INSERT INTO anuncio (descricao,codigo_casa,codigo_usuario) VALUES ('quis accumsan convallis, ante lectus convallis est, vitae sodales nisi',21,21),('odio. Etiam ligula tortor, dictum eu, placerat eget, venenatis a,',22,22),('consequat enim diam vel arcu. Curabitur ut odio vel est',23,23),('tempor lorem, eget mollis lectus pede et risus. Quisque libero',24,24),('sit amet ultricies sem magna nec quam. Curabitur vel lectus.',25,25);