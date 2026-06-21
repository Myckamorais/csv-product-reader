# csv-product-reader

Aplicação Java que lê um arquivo `.csv` contendo itens vendidos e gera um arquivo de resumo com o valor total por produto.

## 📋 Sobre

O programa lê um arquivo CSV de entrada com nome do produto, preço unitário e quantidade, calcula o valor total de cada item e grava o resultado em um novo arquivo `summary.csv` dentro de uma subpasta `out` criada automaticamente em tempo de execução.

## 📁 Estrutura do Projeto

```
csv-product-reader/
├── src/
│   ├── Main.java
│   ├── products.csv      ← arquivo de entrada
│   └── out/
│       └── summary.csv   ← arquivo gerado
├── .gitignore
└── README.md
```

## 📄 Formato dos Arquivos

**Entrada** (`products.csv`):
```
TV LED,1290.99,1
Video Game Chair,350.50,3
Iphone X,900.00,2
Samsung Galaxy 9,850.00,2
```

**Saída** (`out/summary.csv`):
```
TV LED,1290.99
Video Game Chair,1051.50
Iphone X,1800.00
Samsung Galaxy 9,1700.00
```

## 🛠️ Tecnologias

- Java
- `BufferedReader` / `BufferedWriter` para leitura e escrita de arquivos
- `String.split()` para parsing do CSV
- `String.format()` para formatação decimal

## ▶️ Como Executar

1. Clone o repositório:
```bash
git clone https://github.com/Myckamorais/csv-product-reader.git
```

2. Abra o projeto no IntelliJ IDEA

3. Certifique-se de que o arquivo `products.csv` existe dentro da pasta `src/`

4. Execute o `Main.java`

5. O arquivo `summary.csv` será gerado em `src/out/summary.csv`

## 👨‍💻 Autor

Myckael Morais — [GitHub](https://github.com/Myckamorais) · [LinkedIn](https://www.linkedin.com/in/myckael-morais)
