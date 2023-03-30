let dados = require('./dados')
let total = 0
let maiorValor = -Infinity
let menorValor = Infinity

dados.map((dia) => {
    total += dia.valor
    // console.log(dia);
    
    if (dia.valor > maiorValor){
        maiorValor = dia.valor
    }

    if (dia.valor < menorValor && dia.valor != 0){
        menorValor = dia.valor
    }
})

let media = total / dados.length
let diasSuperioresMedia = 0

dados.map((dia) => {
    if (dia.valor > media){
        diasSuperioresMedia++

    }
})


console.log("O maior valor de faturamento ocorrido em um dia do mês: " + maiorValor);
console.log("O menor valor de faturamento ocorrido em um dia do mês: " + menorValor);
console.log("Número de dias no mês em que o valor de faturamento diário foi superior à média mensal: " + diasSuperioresMedia);
