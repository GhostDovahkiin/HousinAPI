create table casa (
  codigo_casa serial primary key,
  quant_moradores integer not null,
  codigo_especificacoes integer not null,
  logradouro varchar(50) not null,
  numero varchar(5) not null,
  bairro varchar(50) not null,
  cep varchar(11) not null,
  cidade varchar(50) not null,
  foreign key (codigo_especificacoes) references especificacoes(codigo_especificacoes)
);

INSERT INTO "casa" (quant_moradores,codigo_especificacoes,logradouro,numero,bairro,cep,cidade) VALUES (5,1,'8829 Nunc St.',176,'PB','58811-290','Mamanguape');
INSERT INTO "casa" (quant_moradores,codigo_especificacoes,logradouro,numero,bairro,cep,cidade) VALUES (10,2,'315-8514 Nulla. Ave',166,'SP','19924-319','Rio Tinto');
INSERT INTO "casa" (quant_moradores,codigo_especificacoes,logradouro,numero,bairro,cep,cidade) VALUES (4,3,'P.O. Box 887, 8718 Pharetra. Road',30,'São Paulo','12101-213','Rio Tinto');
INSERT INTO "casa" (quant_moradores,codigo_especificacoes,logradouro,numero,bairro,cep,cidade) VALUES (3,4,'2021 Nascetur Rd.',170,'CE','60433-866','Rio Tinto');
INSERT INTO "casa" (quant_moradores,codigo_especificacoes,logradouro,numero,bairro,cep,cidade) VALUES (2,5,'216 Eget, Rd.',108,'Maranhão','65209-987','Rio Tinto');
INSERT INTO "casa" (quant_moradores,codigo_especificacoes,logradouro,numero,bairro,cep,cidade) VALUES (2,6,'802-9897 Orci Rd.',122,'Rio de Janeiro','20756-558','Rio Tinto');
INSERT INTO "casa" (quant_moradores,codigo_especificacoes,logradouro,numero,bairro,cep,cidade) VALUES (3,7,'P.O. Box 964, 8496 Aptent Av.',127,'São Paulo','14191-486','Rio Tinto');
INSERT INTO "casa" (quant_moradores,codigo_especificacoes,logradouro,numero,bairro,cep,cidade) VALUES (4,8,'8429 Vitae St.',40,'Minas Gerais','35508322','Mamanguape');
INSERT INTO "casa" (quant_moradores,codigo_especificacoes,logradouro,numero,bairro,cep,cidade) VALUES (7,9,'P.O. Box 361, 7785 Sed St.',85,'MG','35864223','Mamanguape');
INSERT INTO "casa" (quant_moradores,codigo_especificacoes,logradouro,numero,bairro,cep,cidade) VALUES (4,10,'7348 Dui. Av.',102,'Pará','66047-464','Rio Tinto');
INSERT INTO "casa" (quant_moradores,codigo_especificacoes,logradouro,numero,bairro,cep,cidade) VALUES (10,11,'P.O. Box 546, 2003 Commodo Street',76,'São Paulo','19955-414','Rio Tinto');
INSERT INTO "casa" (quant_moradores,codigo_especificacoes,logradouro,numero,bairro,cep,cidade) VALUES (2,12,'177-2150 Bibendum Road',16,'São Paulo','17915-025','Mamanguape');
INSERT INTO "casa" (quant_moradores,codigo_especificacoes,logradouro,numero,bairro,cep,cidade) VALUES (5,13,'P.O. Box 576, 3685 Fermentum Ave',28,'Pará','66690-149','Mamanguape');
INSERT INTO "casa" (quant_moradores,codigo_especificacoes,logradouro,numero,bairro,cep,cidade) VALUES (1,14,'P.O. Box 586, 1690 Vivamus Avenue',193,'CE','63852-288','Mamanguape');
INSERT INTO "casa" (quant_moradores,codigo_especificacoes,logradouro,numero,bairro,cep,cidade) VALUES (7,15,'3868 In Road',115,'PR','85116-553','Mamanguape');
INSERT INTO "casa" (quant_moradores,codigo_especificacoes,logradouro,numero,bairro,cep,cidade) VALUES (5,16,'Ap #915-7688 Vel, Road',49,'MG','34898799','Rio Tinto');
INSERT INTO "casa" (quant_moradores,codigo_especificacoes,logradouro,numero,bairro,cep,cidade) VALUES (3,17,'819-8728 Varius. St.',118,'São Paulo','12638-279','Mamanguape');
INSERT INTO "casa" (quant_moradores,codigo_especificacoes,logradouro,numero,bairro,cep,cidade) VALUES (8,18,'8588 Sem. Avenue',38,'Paraná','86140-281','Mamanguape');
INSERT INTO "casa" (quant_moradores,codigo_especificacoes,logradouro,numero,bairro,cep,cidade) VALUES (8,19,'476-7352 Mattis St.',173,'MA','65439-602','Rio Tinto');
INSERT INTO "casa" (quant_moradores,codigo_especificacoes,logradouro,numero,bairro,cep,cidade) VALUES (10,20,'P.O. Box 173, 4042 Mollis Avenue',129,'MG','34291023','Rio Tinto');
INSERT INTO "casa" (quant_moradores,codigo_especificacoes,logradouro,numero,bairro,cep,cidade) VALUES (4,21,'964-3178 Lorem Av.',123,'Santa Catarina','89851-605','Rio Tinto');
INSERT INTO "casa" (quant_moradores,codigo_especificacoes,logradouro,numero,bairro,cep,cidade) VALUES (9,22,'274-4624 Lectus Ave',77,'SP','16065-375','Rio Tinto');
INSERT INTO "casa" (quant_moradores,codigo_especificacoes,logradouro,numero,bairro,cep,cidade) VALUES (5,23,'307-3394 Cursus. Rd.',179,'PR','85744-397','Rio Tinto');
INSERT INTO "casa" (quant_moradores,codigo_especificacoes,logradouro,numero,bairro,cep,cidade) VALUES (9,24,'1050 Est Avenue',110,'Rio de Janeiro','20009-200','Rio Tinto');
INSERT INTO "casa" (quant_moradores,codigo_especificacoes,logradouro,numero,bairro,cep,cidade) VALUES (6,25,'870-6605 Lacinia Ave',65,'RJ','21112-956','Rio Tinto');
INSERT INTO "casa" (quant_moradores,codigo_especificacoes,logradouro,numero,bairro,cep,cidade) VALUES (9,26,'481-3260 Eget Road',25,'Minas Gerais','34980176','Mamanguape');
INSERT INTO "casa" (quant_moradores,codigo_especificacoes,logradouro,numero,bairro,cep,cidade) VALUES (10,27,'278-7005 Non, Rd.',59,'MA','65193-363','Rio Tinto');
INSERT INTO "casa" (quant_moradores,codigo_especificacoes,logradouro,numero,bairro,cep,cidade) VALUES (7,28,'Ap #345-116 Nullam Rd.',135,'São Paulo','14523-363','Mamanguape');
INSERT INTO "casa" (quant_moradores,codigo_especificacoes,logradouro,numero,bairro,cep,cidade) VALUES (8,29,'Ap #184-5913 Curabitur Street',167,'GO','76720-146','Mamanguape');
INSERT INTO "casa" (quant_moradores,codigo_especificacoes,logradouro,numero,bairro,cep,cidade) VALUES (3,30,'P.O. Box 564, 1442 Diam Road',127,'SP','15234-755','Mamanguape');
INSERT INTO "casa" (quant_moradores,codigo_especificacoes,logradouro,numero,bairro,cep,cidade) VALUES (8,31,'P.O. Box 868, 100 Quam. Ave',69,'MG','33335885','Rio Tinto');
INSERT INTO "casa" (quant_moradores,codigo_especificacoes,logradouro,numero,bairro,cep,cidade) VALUES (9,32,'8317 Quisque Rd.',108,'MG','31198178','Rio Tinto');
INSERT INTO "casa" (quant_moradores,codigo_especificacoes,logradouro,numero,bairro,cep,cidade) VALUES (9,33,'Ap #971-7402 Nisi Rd.',57,'São Paulo','11958-224','Rio Tinto');
INSERT INTO "casa" (quant_moradores,codigo_especificacoes,logradouro,numero,bairro,cep,cidade) VALUES (1,34,'P.O. Box 260, 2005 Cursus. Ave',45,'Bahia','47231-635','Mamanguape');
INSERT INTO "casa" (quant_moradores,codigo_especificacoes,logradouro,numero,bairro,cep,cidade) VALUES (5,35,'3623 Purus St.',184,'SP','19368-998','Rio Tinto');
INSERT INTO "casa" (quant_moradores,codigo_especificacoes,logradouro,numero,bairro,cep,cidade) VALUES (9,36,'Ap #596-3270 Orci Ave',134,'Minas Gerais','38947180','Rio Tinto');
INSERT INTO "casa" (quant_moradores,codigo_especificacoes,logradouro,numero,bairro,cep,cidade) VALUES (2,37,'P.O. Box 132, 6896 Bibendum. Road',162,'Rio de Janeiro','20799-139','Mamanguape');
INSERT INTO "casa" (quant_moradores,codigo_especificacoes,logradouro,numero,bairro,cep,cidade) VALUES (1,38,'P.O. Box 407, 514 Dolor St.',86,'PA','68677-805','Rio Tinto');
INSERT INTO "casa" (quant_moradores,codigo_especificacoes,logradouro,numero,bairro,cep,cidade) VALUES (2,39,'1140 Nec Avenue',157,'SP','11145-908','Rio Tinto');
INSERT INTO "casa" (quant_moradores,codigo_especificacoes,logradouro,numero,bairro,cep,cidade) VALUES (1,40,'P.O. Box 364, 6584 Vitae Street',40,'BA','46474-357','Rio Tinto');
INSERT INTO "casa" (quant_moradores,codigo_especificacoes,logradouro,numero,bairro,cep,cidade) VALUES (2,41,'P.O. Box 411, 1646 Iaculis Av.',185,'Paraná','85698-131','Rio Tinto');
INSERT INTO "casa" (quant_moradores,codigo_especificacoes,logradouro,numero,bairro,cep,cidade) VALUES (6,42,'P.O. Box 283, 8192 Nulla St.',87,'MG','33781373','Rio Tinto');
INSERT INTO "casa" (quant_moradores,codigo_especificacoes,logradouro,numero,bairro,cep,cidade) VALUES (7,43,'Ap #264-9464 Odio Av.',191,'Paraíba','58473-929','Mamanguape');
INSERT INTO "casa" (quant_moradores,codigo_especificacoes,logradouro,numero,bairro,cep,cidade) VALUES (6,44,'3634 Augue Road',157,'Maranhão','65578-525','Mamanguape');
INSERT INTO "casa" (quant_moradores,codigo_especificacoes,logradouro,numero,bairro,cep,cidade) VALUES (6,45,'P.O. Box 691, 1994 Mauris St.',153,'Paraíba','58060-828','Rio Tinto');
INSERT INTO "casa" (quant_moradores,codigo_especificacoes,logradouro,numero,bairro,cep,cidade) VALUES (7,46,'928-8639 Mauris. St.',83,'MG','37544700','Rio Tinto');
INSERT INTO "casa" (quant_moradores,codigo_especificacoes,logradouro,numero,bairro,cep,cidade) VALUES (6,47,'5366 Faucibus Avenue',144,'Rio de Janeiro','21081-999','Mamanguape');
INSERT INTO "casa" (quant_moradores,codigo_especificacoes,logradouro,numero,bairro,cep,cidade) VALUES (9,48,'633-5503 Nullam St.',22,'RS','94704-826','Mamanguape');
INSERT INTO "casa" (quant_moradores,codigo_especificacoes,logradouro,numero,bairro,cep,cidade) VALUES (1,49,'P.O. Box 851, 699 Dignissim Road',150,'Rio de Janeiro','22710-599','Mamanguape');
INSERT INTO "casa" (quant_moradores,codigo_especificacoes,logradouro,numero,bairro,cep,cidade) VALUES (9,50,'Ap #832-8476 Mi Avenue',109,'SP','13598-350','Rio Tinto');
INSERT INTO "casa" (quant_moradores,codigo_especificacoes,logradouro,numero,bairro,cep,cidade) VALUES (5,51,'P.O. Box 744, 8016 Integer St.',93,'MG','35487641','Mamanguape');
INSERT INTO "casa" (quant_moradores,codigo_especificacoes,logradouro,numero,bairro,cep,cidade) VALUES (10,52,'613-3740 Libero Rd.',169,'GO','75769-071','Rio Tinto');
INSERT INTO "casa" (quant_moradores,codigo_especificacoes,logradouro,numero,bairro,cep,cidade) VALUES (6,53,'814-2371 Morbi Avenue',89,'GO','74741-352','Rio Tinto');
INSERT INTO "casa" (quant_moradores,codigo_especificacoes,logradouro,numero,bairro,cep,cidade) VALUES (9,54,'P.O. Box 507, 1043 Eu Av.',36,'SP','11341-756','Rio Tinto');
INSERT INTO "casa" (quant_moradores,codigo_especificacoes,logradouro,numero,bairro,cep,cidade) VALUES (4,55,'985-8150 Congue St.',70,'PE','54644-420','Mamanguape');
INSERT INTO "casa" (quant_moradores,codigo_especificacoes,logradouro,numero,bairro,cep,cidade) VALUES (5,56,'Ap #574-2754 Tincidunt Rd.',31,'Ceará','62960-698','Mamanguape');
INSERT INTO "casa" (quant_moradores,codigo_especificacoes,logradouro,numero,bairro,cep,cidade) VALUES (1,57,'7885 Nunc Avenue',29,'MG','30931080','Mamanguape');
INSERT INTO "casa" (quant_moradores,codigo_especificacoes,logradouro,numero,bairro,cep,cidade) VALUES (7,58,'816-3556 Consectetuer Road',129,'Minas Gerais','36569507','Mamanguape');
INSERT INTO "casa" (quant_moradores,codigo_especificacoes,logradouro,numero,bairro,cep,cidade) VALUES (8,59,'894-7108 Sapien Avenue',159,'Goiás','74761-809','Rio Tinto');
INSERT INTO "casa" (quant_moradores,codigo_especificacoes,logradouro,numero,bairro,cep,cidade) VALUES (4,60,'601-734 Mi, Ave',166,'Santa Catarina','89090-280','Rio Tinto');
INSERT INTO "casa" (quant_moradores,codigo_especificacoes,logradouro,numero,bairro,cep,cidade) VALUES (4,61,'Ap #420-4460 Proin St.',86,'Pará','66242-652','Mamanguape');
INSERT INTO "casa" (quant_moradores,codigo_especificacoes,logradouro,numero,bairro,cep,cidade) VALUES (2,62,'P.O. Box 865, 9310 Euismod Ave',196,'Rio de Janeiro','22590-545','Rio Tinto');
INSERT INTO "casa" (quant_moradores,codigo_especificacoes,logradouro,numero,bairro,cep,cidade) VALUES (10,63,'805-3640 Donec Avenue',10,'CE','60018-075','Mamanguape');
INSERT INTO "casa" (quant_moradores,codigo_especificacoes,logradouro,numero,bairro,cep,cidade) VALUES (7,64,'P.O. Box 374, 3589 Nec Avenue',113,'RJ','26250-064','Rio Tinto');
INSERT INTO "casa" (quant_moradores,codigo_especificacoes,logradouro,numero,bairro,cep,cidade) VALUES (9,65,'4039 Amet St.',129,'SC','88414-854','Mamanguape');
INSERT INTO "casa" (quant_moradores,codigo_especificacoes,logradouro,numero,bairro,cep,cidade) VALUES (5,66,'5675 Tincidunt Rd.',30,'SP','12074-192','Mamanguape');
INSERT INTO "casa" (quant_moradores,codigo_especificacoes,logradouro,numero,bairro,cep,cidade) VALUES (10,67,'606-8997 Convallis Ave',173,'CE','60994-211','Mamanguape');
INSERT INTO "casa" (quant_moradores,codigo_especificacoes,logradouro,numero,bairro,cep,cidade) VALUES (2,68,'9648 Nunc Rd.',79,'SP','13483-876','Rio Tinto');
INSERT INTO "casa" (quant_moradores,codigo_especificacoes,logradouro,numero,bairro,cep,cidade) VALUES (2,69,'Ap #406-6682 Velit St.',146,'SP','14763-514','Rio Tinto');
INSERT INTO "casa" (quant_moradores,codigo_especificacoes,logradouro,numero,bairro,cep,cidade) VALUES (2,70,'452-9775 Congue, Ave',71,'SC','88580-450','Rio Tinto');
INSERT INTO "casa" (quant_moradores,codigo_especificacoes,logradouro,numero,bairro,cep,cidade) VALUES (1,71,'267-8443 Vitae Ave',174,'Rio de Janeiro','26228-041','Mamanguape');
INSERT INTO "casa" (quant_moradores,codigo_especificacoes,logradouro,numero,bairro,cep,cidade) VALUES (9,72,'Ap #974-8272 Non, Road',163,'Pará','68047-508','Mamanguape');
INSERT INTO "casa" (quant_moradores,codigo_especificacoes,logradouro,numero,bairro,cep,cidade) VALUES (8,73,'717-3477 Odio Rd.',151,'PR','84627-426','Rio Tinto');
INSERT INTO "casa" (quant_moradores,codigo_especificacoes,logradouro,numero,bairro,cep,cidade) VALUES (4,74,'559-2378 Nulla. Av.',158,'RJ','22008-130','Rio Tinto');
INSERT INTO "casa" (quant_moradores,codigo_especificacoes,logradouro,numero,bairro,cep,cidade) VALUES (5,75,'2185 Ipsum. Avenue',100,'São Paulo','16558-719','Mamanguape');
INSERT INTO "casa" (quant_moradores,codigo_especificacoes,logradouro,numero,bairro,cep,cidade) VALUES (6,76,'Ap #253-3954 Id, Rd.',194,'RJ','28017-266','Mamanguape');
INSERT INTO "casa" (quant_moradores,codigo_especificacoes,logradouro,numero,bairro,cep,cidade) VALUES (1,77,'8455 Ac Rd.',108,'CE','61540-065','Mamanguape');
INSERT INTO "casa" (quant_moradores,codigo_especificacoes,logradouro,numero,bairro,cep,cidade) VALUES (9,78,'Ap #168-5353 Euismod Road',49,'BA','48831-081','Mamanguape');
INSERT INTO "casa" (quant_moradores,codigo_especificacoes,logradouro,numero,bairro,cep,cidade) VALUES (5,79,'P.O. Box 220, 4464 Euismod Road',31,'Goiás','73779-282','Rio Tinto');
INSERT INTO "casa" (quant_moradores,codigo_especificacoes,logradouro,numero,bairro,cep,cidade) VALUES (8,80,'6929 Nec Avenue',123,'SC','88280-154','Rio Tinto');
INSERT INTO "casa" (quant_moradores,codigo_especificacoes,logradouro,numero,bairro,cep,cidade) VALUES (3,81,'P.O. Box 583, 6035 Rhoncus. Street',153,'Pará','66791-538','Rio Tinto');
INSERT INTO "casa" (quant_moradores,codigo_especificacoes,logradouro,numero,bairro,cep,cidade) VALUES (4,82,'9363 Malesuada Avenue',177,'Minas Gerais','37672274','Mamanguape');
INSERT INTO "casa" (quant_moradores,codigo_especificacoes,logradouro,numero,bairro,cep,cidade) VALUES (3,83,'Ap #226-1554 Urna St.',156,'RJ','23161-327','Mamanguape');
INSERT INTO "casa" (quant_moradores,codigo_especificacoes,logradouro,numero,bairro,cep,cidade) VALUES (3,84,'275-781 Tempor St.',88,'São Paulo','19938-033','Rio Tinto');
INSERT INTO "casa" (quant_moradores,codigo_especificacoes,logradouro,numero,bairro,cep,cidade) VALUES (3,85,'Ap #629-4187 Sed, St.',20,'BA','45970-368','Mamanguape');
INSERT INTO "casa" (quant_moradores,codigo_especificacoes,logradouro,numero,bairro,cep,cidade) VALUES (10,86,'739-1313 Id, St.',122,'SP','14000-175','Mamanguape');
INSERT INTO "casa" (quant_moradores,codigo_especificacoes,logradouro,numero,bairro,cep,cidade) VALUES (7,87,'P.O. Box 224, 7115 Nulla Street',154,'PE','50041-323','Rio Tinto');
INSERT INTO "casa" (quant_moradores,codigo_especificacoes,logradouro,numero,bairro,cep,cidade) VALUES (8,88,'P.O. Box 834, 4396 Ac St.',133,'Paraíba','58982-650','Mamanguape');
INSERT INTO "casa" (quant_moradores,codigo_especificacoes,logradouro,numero,bairro,cep,cidade) VALUES (6,89,'420-557 Risus Rd.',93,'SP','19226-887','Mamanguape');
INSERT INTO "casa" (quant_moradores,codigo_especificacoes,logradouro,numero,bairro,cep,cidade) VALUES (4,90,'989-1604 Egestas Street',16,'São Paulo','16663-352','Mamanguape');
INSERT INTO "casa" (quant_moradores,codigo_especificacoes,logradouro,numero,bairro,cep,cidade) VALUES (2,91,'P.O. Box 606, 1997 Velit. Rd.',52,'SP','16232-808','Mamanguape');
INSERT INTO "casa" (quant_moradores,codigo_especificacoes,logradouro,numero,bairro,cep,cidade) VALUES (7,92,'P.O. Box 753, 5767 Dignissim Avenue',133,'Minas Gerais','35091121','Mamanguape');
INSERT INTO "casa" (quant_moradores,codigo_especificacoes,logradouro,numero,bairro,cep,cidade) VALUES (9,93,'630-4259 Tempus Avenue',78,'SP','15619-623','Mamanguape');
INSERT INTO "casa" (quant_moradores,codigo_especificacoes,logradouro,numero,bairro,cep,cidade) VALUES (10,94,'187-3721 Gravida Road',171,'MA','65546-526','Rio Tinto');
INSERT INTO "casa" (quant_moradores,codigo_especificacoes,logradouro,numero,bairro,cep,cidade) VALUES (9,95,'5105 Odio. Street',115,'PE','50893-424','Mamanguape');
INSERT INTO "casa" (quant_moradores,codigo_especificacoes,logradouro,numero,bairro,cep,cidade) VALUES (3,96,'5515 Diam Rd.',114,'Pernambuco','50581-616','Rio Tinto');
INSERT INTO "casa" (quant_moradores,codigo_especificacoes,logradouro,numero,bairro,cep,cidade) VALUES (7,97,'Ap #336-968 Leo. Avenue',121,'Minas Gerais','35674332','Rio Tinto');
INSERT INTO "casa" (quant_moradores,codigo_especificacoes,logradouro,numero,bairro,cep,cidade) VALUES (10,98,'Ap #613-295 Luctus Rd.',197,'Santa Catarina','89868-912','Mamanguape');
INSERT INTO "casa" (quant_moradores,codigo_especificacoes,logradouro,numero,bairro,cep,cidade) VALUES (6,99,'515-7752 Mattis. Av.',160,'Paraná','86360-912','Rio Tinto');
INSERT INTO "casa" (quant_moradores,codigo_especificacoes,logradouro,numero,bairro,cep,cidade) VALUES (4,100,'203-5201 Quis Avenue',142,'Santa Catarina','89992-640','Rio Tinto');