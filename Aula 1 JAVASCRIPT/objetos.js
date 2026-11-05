
//1 crie um objeto

let produto = { id: 101, nome: "Teclado mecânico", categoria: "Periféricos", preco: 249.90, estoque: 8 }

// 1 Calcule o valor total desse produto em estoque: preço × quantidade.
console.log("O valor total desse produto em estoque é:" + (produto.preco * produto.estoque).toFixed(2));

//Exiba: Teclado — R$ 150.00 — Estoque: 8
console.log(produto.nome, "R$:" + produto.preco.toFixed(2), "Estoque:" + produto.estoque);

//Simule a venda de duas unidades, atualizando o estoque.

console.log("Simulação venda de duas unidades");
produto.estoque -= 2;
console.log("Estoque atualizado:" + produto.estoque);

//Exiba “Produto disponível” se ainda houver unidades ou “Produto esgotado” caso contrário.

if (produto.estoque > 0) {
    console.log("Produto disponível");

} else {
    console.log("Produto esgotado");
}

//usando if ternário
// console.log (`Produto ${Produto.estoque > 0 ? "disponível" : "indisponível"})

/* 2 Crie um objeto chamado cliente com:
● id: 1.
● nome: Carlos Oliveira.
● endereco: outro objeto, contendo rua, numero e cidade, com valores escolhidos por você.
● interesses: um vetor com três textos representando categorias de produtos*/

// 1. Criando o objeto cliente com objeto aninhado e vetor
const cliente = {
    id: 1,
    nome: "Carlos Oliveira",
    endereco: {
        rua: "Avenida dos Cravos",
        numero: 120,
        cidade: "Valença"
    },
    interesses: ["Tecnologia", "Eletrônicos", "Informática"]
};

// 2. Exibir somente a cidade do cliente
console.log("Cidade do cliente:", cliente.endereco.cidade);

// 3. Exibir o primeiro interesse (índice 0)
console.log("Primeiro interesse:", cliente.interesses[0]);

// 4. Altere a cidade
cliente.endereco.cidade = "Rio de Janeiro";
console.log("Nova cidade:", cliente.endereco.cidade);

// 5. Percorra os interesses e exiba cada um no console
console.log("\nLista de interesses:");
cliente.interesses.forEach(interesse => {
    console.log("- " + interesse);
});
//3 e seguintes 
// 
const produtos = [
    { id: 1, nome: "Mouse sem fio", categoria: "Periféricos", preco: 89.90, estoque: 15, ativo: true },
    { id: 2, nome: "Teclado mecânico", categoria: "Periféricos", preco: 249.90, estoque: 8, ativo: true },
    { id: 3, nome: "Monitor 24 polegadas", categoria: "Monitores", preco: 799.90, estoque: 5, ativo: true },
    { id: 4, nome: "Cabo HDMI", categoria: "Acessórios", preco: 29.90, estoque: 0, ativo: true },
    { id: 5, nome: "Headset USB", categoria: "Áudio", preco: 159.90, estoque: 12, ativo: true },
    { id: 6, nome: "Webcam HD", categoria: "Periféricos", preco: 189.90, estoque: 0, ativo: false },
    { id: 7, nome: "Monitor 27 polegadas", categoria: "Monitores", preco: 1199.90, estoque: 3, ativo: true },
    { id: 8, nome: "Caixa de som", categoria: "Áudio", preco: 119.90, estoque: 7, ativo: false },
    { id: 9, nome: "Hub USB", categoria: "Acessórios", preco: 69.90, estoque: 20, ativo: true },
    { id: 10, nome: "Mousepad", categoria: "Acessórios", preco: 24.90, estoque: 25, ativo: true }
];

// Exiba o nome do primeiro produto.

console.log("Nome do 1° produto:" + produtos[0].nome);

//Exiba o preço do terceiro produto

console.log("Preco do 3° produto:" + produtos[2].preco);

//Exiba a quantidade de produtos cadastrados

console.log("Quantidade de produtos cadastrados:" + produtos.length);

//Utilize um laço ou forEach() para exibir todos os produtos no formato:
// 1 — Mouse sem fio — R$ 89.90

produtos.forEach(produto => {
    console.log(produto.id + "-" + produto.nome + "-R$" + produto.preco.toFixed(2))
})

//Utilize filter() para criar vetores separados contendo:
//● Apenas produtos da categoria "Acessórios"

let acessorios = produtos.filter(produto => produto.categoria === "Acessórios");
console.log(acessorios);

//Apenas produtos com preço inferior a R$ 100

let precoInferior100 = produtos.filter(produto => produto.preco < 100);
console.log("Produtos com preco inferior a R$ 100:" + precoInferior100)

//Apenas produtos com estoque maior que zero

let estoqueMaiorZero = produtos.filter(produto => produto.estoque > 0);
console.log(estoqueMaiorZero)


//Apenas produtos ativos e com estoque maior que zero.Exiba cada resultado. Estar ativo e ter estoque são condições diferentes: o produto pode estar cadastrado como ativo mesmo sem unidades disponíveis.

const ativosEstoque = produtos.filter(produto => produto.ativo === true && produto.estoque > 0);

console.log("Produtos ativos e com estoque maior que zero:" + ativosEstoque.length);

// Forma correta de exibir cada produto usando o forEach:
ativosEstoque.forEach(produto => {
    console.log(`- ${produto.nome} (Estoque: ${produto.estoque})`);
});




/*4 Crie uma função chamada buscarProdutoPorId(id).
A função deve retornar o objeto que possui o ID recebido. Utilize find().
*/


function buscarProdutoPorId(id) {
    if (produtos.find(produto => produto.id === id)) {

        return produtos.find(produto => produto.id === id);

    }  else {
        return "Produto não encontrado"
    }
}

console.log(buscarProdutoPorId(99));



//5 Utilize map() para criar:
// Um vetor chamado nomesProdutos, contendo somente os nomes.


const nomesProdutos = produtos.map(produto => produto.nome);
console.log("Nomes dos Produtos:", nomesProdutos);

// Um vetor chamado resumosProdutos, contendo objetos com apenas id, nome e preco.
//Não altere o vetor produtos*/

const resumosProdutos = produtos.map(produto =>( {

        id: produto.id, 
        nome: produto.nome, 
        preco: produto.preco }
    ))

console.log("Resumos dos Produtos:", resumosProdutos)


//6 Localize o produto de ID 2 e crie um novo objeto chamado produtoAtualizado:
//Mantenha todas as propriedades do produto encontrado. Altere somente o preço para 219.90. Utilize o operador de espalhamento: ....
//Exiba o produto original e o novo objeto. O preço do original deve continuar sendo 249.90.

let produtoAtualizado = {
    ...buscarProdutoPorId (2),
    preco: 219.90
};

console.log( produtoAtualizado)

//7 Atualizando um produto dentro do vetor
//Crie um novo vetor chamado produtosAtualizados, utilizando map().
//Nesse novo vetor:
// O produto de ID 5 deve ter estoque igual a 10.
//As demais informações desse produto devem ser preservadas.
//Os demais produtos devem ser mantidos.
//O vetor original deve continuar com estoque 12 para o produto de ID 5.
//Utilize o ID para identificar o produto, mesmo que a posição dele no vetor mude.


// Criando o novo vetor com map()
const produtosAtualizados = produtos.map(produto => {
    // Verifica se é o produto com ID 5
    if (produto.id === 5) {
        return {
            ...produto,       // Copia todas as propriedades existentes (nome, preco, etc.)
            estoque: 10       // Sobrescreve apenas a propriedade estoque para 10
        };
    }

    // Para os demais produtos, retorna o objeto exatamente como estava
    return produto;
});

// Testando os resultados:
console.log("=== VETOR ORIGINAL (ID 5 deve continuar com estoque 12) ===");
console.log(produtos.find(p => p.id === 5));

console.log("\n=== VETOR ATUALIZADO (ID 5 deve estar com estoque 10) ===");
console.log(produtosAtualizados.find(p => p.id === 5));

//8 Desafio final — inclusão e remoção
//Partindo novamente do vetor original:
//● Crie um objeto para um novo produto, seguindo a mesma estrutura e utilizando o ID 11.
//● Crie produtosComNovo, contendo os produtos existentes e o novo produto. Utilize ....
//● A partir de produtosComNovo, crie produtosSemRemovido, removendo o produto de ID 6 com filter().
//● Confira as quantidades: o vetor original deve ter 10, o vetor após inclusão 11 e o vetor após remoção 10 produtos.

// 1. Criando o objeto para o novo produto (ID 11)
let novoProduto = {
    id: 11,
    nome: "Mousepad Gamer RGB",
    categoria: "Acessórios",
    preco: 99.90,
    estoque: 10,
    ativo: true
};

// 2. Criando produtosComNovo, adicionando o novo produto com o operador ... (Spread)
let produtosComNovo = [...produtos, novoProduto];
console.log (produtosComNovo)

// 3. Criando produtosSemRemovido, removendo o produto de ID 6 utilizando filter()
let produtosSemRemovido = produtosComNovo.filter(produto => produto.id !== 6);

// 4. Conferindo as quantidades de produtos em cada vetor
console.log("Quantidade no vetor original:", produtos.length);             // Deve ser 10
console.log("Quantidade após inclusão:", produtosComNovo.length);         // Deve ser 11
console.log("Quantidade após remoção:", produtosSemRemovido.length);       // Deve ser 10