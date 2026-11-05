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

/*Crie um objeto chamado cliente com:
● id: 1.
● nome: Carlos Oliveira.
● endereco: outro objeto, contendo rua, numero e cidade, com valores escolhidos por você.
● interesses: um vetor com três textos representando categorias de produtos*/

let cliente = {
    id: 1,
    nome: "Carlos Oliveira",
    endereco: {
        rua: "Rua das Couves",
        numero: 147,
        cidade: "São Paulo"

    }
}

interesses = ["Periféricos", "monitores", "Acessórios"]

//Exiba somente a cidade do cliente.

console.log("Cidade do Cliente:" + cliente.endereco.cidade);

//Exiba o primeiro interesse.

console.log("Primeiro interesse do cliente:" + interesses[0]);

//Altere a cidade.

cliente.endereco.cidade = "Rio de Janeiro";
console.log("Cidade atualizada:" + cliente.endereco.cidade);

// Percorra os interesses e exiba cada um no console.

interesses.forEach(interesse => {
    console.log("Todos os interesses:" + interesse)
})

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

const acessorios = produtos.filter(produto => produto.categoria === "Acessórios");
acessorios.forEach(produto => {
    console.log("Produtos da categoria Acessórios:" + produto.nome)
})
console.log("Quantidade de Produtos da categoria Acessórios:" + acessorios.length);

//Apenas produtos com preço inferior a R$ 100

const precoInferior100 = produtos.filter(produto => produto.preco < 100);

precoInferior100.forEach(Produto => {
    console.log("Produtos com preco inferior a R$ 100:" + Produto.nome)
})

console.log("Produtos com preço inferior a R$ 100:" + precoInferior100.length);

 //Apenas produtos com estoque maior que zero

 const estoqueMaiorZero = produtos.filter(produto => produto.estoque > 0);

 estoqueMaiorZero.forEach(produto => {
    console.log("Produtos com estoque maior que zero:" + produto.nome)
 })

 //Apenas produtos ativos e com estoque maior que zero.Exiba cada resultado. Estar ativo e ter estoque são condições diferentes: o produto pode estar cadastrado como ativo mesmo sem unidades disponíveis.

 const ativosEstoque = produtos.filter(produto => produto.ativo === true && produto.estoque > 0);

 console.log ("Produtos ativos e com estoque maior que zero:" + ativosEstoque.length);

// Forma correta de exibir cada produto usando o forEach:
ativosEstoque.forEach(produto => {
    console.log( `- ${produto.nome} (Estoque: ${produto.estoque})`);
});
 
  


 /*Crie uma função chamada buscarProdutoPorId(id).
A função deve retornar o objeto que possui o ID recebido. Utilize find().
*/


function buscarProdutoPorId(id) {
    return produtos.find(produto => produto.id === id);
}

const produtoEncontrado = buscarProdutoPorId(99);

// Verifica se encontrou o produto antes de tentar ler o .nome
if (produtoEncontrado) {
    console.log("Produto encontrado pelo ID: " + produtoEncontrado.nome);
} else {
    console.log("Produto não encontrado");
}



/*Utilize map() para criar:
● Um vetor chamado nomesProdutos, contendo somente os nomes.
● Um vetor chamado resumosProdutos, contendo objetos com apenas id, nome e preco.
Não altere o vetor produtos*/

let nomesProdutos = [];
let resumosProdutps = [];

nomesProdutos = produtos.map(produto => produto.nome);
console.log("Nomes dos Produtos:" + nomesProdutos);

resumosProdutps = produtos.map(produto => {
    return { id: produto.id, nome: produto.nome, preco: produto.preco}

})

console.log ("Resumos dos Produtos:"  )

 