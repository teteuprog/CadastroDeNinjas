 -- Migrations para adicionar a coluna de Imagem URL na tabela de cadastro

ALTER TABLE tb_cadastro
ADD COLUMN imagem_url VARCHAR(255);