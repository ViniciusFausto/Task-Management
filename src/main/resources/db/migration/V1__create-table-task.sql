CREATE TABLE task (
    ID INT AUTO_INCREMENT PRIMARY KEY,
    title NVARCHAR(255) NOT NULL,
    description LONGTEXT,
    creation_date DATETIME NOT NULL,
    status NVARCHAR(50) NOT NULL,
    priority NVARCHAR(50) NOT NULL,
    assignee NVARCHAR(255),
    notes LONGTEXT,
    completion_date DATETIME
);

INSERT INTO task (title, description, creation_date, status, priority, assignee, notes, completion_date)
VALUES ('Fazer compras de supermercado',
        'Comprar itens para o jantar de hoje à noite',
        '2023-09-17 10:00:00',
        'Por fazer',
        'Média',
        'João',
        'Lembre-se de verificar a lista de compras antes de sair.',
        NULL);

