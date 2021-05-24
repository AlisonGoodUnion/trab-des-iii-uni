insert into usuario (id, nome, cpf, data_nascimento, habilitado, email, celular, senha)
 values (1, 'Henrique Mentz', '03190462062',  '1996-10-17', '1', 'henrique-mentz@hotmail.com', '51999203018', '12345');

 insert into calendario (id, data_inicial, data_final, idade_minima, idade_maxima, dose) values
 (1, '2021-01-01', '2021-01-07', 23, 25, 'PRIMEIRA');

  insert into calendario (id, data_inicial, data_final, idade_minima, idade_maxima, dose) values
  (2, '2021-04-01', '2021-04-07', 23, 25, 'SEGUNDA');

  --

   insert into calendario (id, data_inicial, data_final, idade_minima, idade_maxima, dose) values
   (3, '2021-01-08', '2021-01-15', 26, 29, 'PRIMEIRA');

    insert into calendario (id, data_inicial, data_final, idade_minima, idade_maxima, dose) values
   (4, '2021-04-08', '2021-04-15', 26, 29, 'SEGUNDA');

insert into vacina(id, usuario_id, calendario_id, data_vacina) values (1, 1, 1, '2021-01-01 12:10:20');