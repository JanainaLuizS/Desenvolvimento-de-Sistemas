
//1 - Crie um array com 3 nomes de frutas e imprima no console.
let frutas = ["maçã", "uva", "laranja"];
console.log(frutas);

//2 - Crie um array com 4 cores e mostre a segunda cor no console.
let cores = ["azul", "verde", "amarelo", "vermelho"];
console.log(cores[1]);

// 3 - Crie um array com 3 animais e altere o segundo animal para “gato”.
let animais = ["cachorro", "coelho", "pássaro"];
animais[1] = "gato";
console.log(animais);

// 4 - Crie um array com 2 nomes e adicione um novo nome no final.
let nome = ["Ana", "Lucas"]
nome.push("Maria");
console.log(nome);

//5 - Crie um array com 5 números e mostre no console quantos elementos ele tem.
let numero = [1, 2, 3, 4, 5];
console.log(numero.length);


//Filter cria novo vetor



//1 - Dado um array de números, crie um novo array apenas com os números pares. (filter)
let numeros = [1, 2, 3, 4, 5];
let n_pares = numeros.filter(numeros => numeros % 2 === 0);
console.log(n_pares);

//2 - A partir de um array, retorne apenas os números maiores que 10. (forEach)
let valores = [5, 12, 8, 20, 3, 15];
valores.forEach(valor => {
    if (valor> 10) {
         console.log(valor) }
})

//3 - Dado um array de nomes, retorne somente os nomes com menos de 5 letras. (utilize o forEach)Dica: length funciona com Strings
let nomes = ["Ana", "João", "Gabriel", "Lu"];
nomes.forEach(nome => {
    if (nome.length < 5) {
        console.log(nome)
    }
})

//4 - A partir de um array de números, filtre apenas os elementos que não sejam zero. (filter)
let lista = [0, 1, 0, 3, 5, 0, 7];
let semZero = lista.filter(lista => lista != 0);
console.log(semZero);

// 5 - Crie um array com 3 países e remova o último país.
let paises = ["Brasil", "Argentina", "Chile"];
paises.pop();
console.log(paises);

/*6 - Crie uma variável senha que recebe uma string. Faça uma 
validação para verificar quantos caracteres tem a senha. Caso 
seja menor que 8 informe para o usuário que o mínimo de 
caracteres para senha é 8. Caso contrario, mostre, “senha 
válida”*/

let senha = "minhasenha";
if (senha.length < 8) {
    console.log("O mínimo de caracteres para a senha é 8");
} else {
    console.log("Senha Válida");
}
