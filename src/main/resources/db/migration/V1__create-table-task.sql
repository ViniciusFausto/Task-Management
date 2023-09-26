CREATE TABLE task (
    task_id INT IDENTITY(1,1) PRIMARY KEY,
    title NVARCHAR(255) NOT NULL,
    description NVARCHAR(MAX),
    creation_date DATETIME NOT NULL,
    status NVARCHAR(50) NOT NULL,
    priority NVARCHAR(50) NOT NULL,
    assignee NVARCHAR(255),
    notes NVARCHAR(MAX),
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

