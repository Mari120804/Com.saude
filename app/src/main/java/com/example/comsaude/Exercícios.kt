package com.example.comsaude

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Exercícios : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_exercicios)

        val exercises = listOf(
            Exercise("Ponte", "Deite-se de bruços no chão, numa superfície plana. Levante o corpo apoiando-se sobre as pontas dos pés e os antebraços (mantendo-os paralelos, à frente da cabeça). Todo o corpo deve permanecer suspenso, formando uma espécie de triângulo retângulo. Você pode começar com três séries de 20 segundos por dia.", "https://youtu.be/YMGevmwBams?si=4REjlNYdIpm9HDKM"),
            Exercise("Agachamento na cadeira", "Com uma cadeira, faça movimentos de sentar e levantar em sequências de 10 a 12 vezes por série. Tente fazer com que o movimento de assentar não seja muito rápido, fortalecendo a musculatura trabalhada. A  partir do segundo dia de atividades, você pode fazer entre 3 e 4 séries.", "https://youtu.be/m-ewcuzzZS0?si=pB2fwfZw8MLKX481"),
            Exercise("Agachamento na parede (isométrico)", "Basta sentar-se “no vazio”, apoiando as costas na parede e buscando manter os joelhos flexionados em um ângulo de 90º. Você pode fazer entre 3 e 4 séries, cada uma com 20 a 40 segundos de duração.", "https://youtu.be/p1KsWs_SNjg?si=pzLIP-PKMkbEnAxh"),
            Exercise("Aviãozinho (stiff unilateral)", "De pé, com os braços abertos (no formato Cristo Redentor), coluna ereta e os pés unidos, faça movimentos de reclinar o tronco para frente, levantando, ao mesmo tempo, uma das pernas para trás. Flexione bem levemente o joelho da perna que não se movimenta. Comece com 6 séries de 10 a 12 movimentos, sendo 3 com cada perna.", "https://youtu.be/4u7g_TwDRLk?si=gWh2Y-GSjVHZ4s3Y"),
            Exercise("Flexão de braço", "Levante o corpo com as duas mãos apoiadas no chão, alinhadas ao peito. Depois, é preciso descer o corpo até o peitoral se encontrar com o chão. Para começar, faça 3 séries de 10 movimentos. Com o tempo, aumente para 12 a 14 por vez.", "https://youtu.be/rig2BqSMoe4?si=qEoiBc3JHuO3FU4-"),
            Exercise("Abdominal", "Deite-se de barriga para cima, dobre as pernas, cruze os braços em X sobre o troco e inicie os movimentos de elevação do troco em direção dos joelhos. Você pode fazer, inicialmente, 3 séries de 15 movimentos.", "https://youtu.be/wYUHrvWLy7U?si=2nzNoP6jB6bhy-CT"),
            Exercise("Elevação das pontas dos pés (ou extensão dos pés)", "De pé, com o corpo ereto, erga-se na ponta dos pés, subindo e descendo. 3 séries de 15 a 20 repetições.", "https://youtu.be/tfA5BoBPO04?si=Dqs4_-ShP031D3kw"),
            Exercise("Pular corda", "Pular corda exige um pouco mais de coordenação motora e condicionamento do que outros exercícios. O ideal para os iniciantes é alternar de 2 a 3 minutos de corda com alguns exercícios de musculação.", "https://youtu.be/7LpAXD4-kwQ?si=8eaPrMZc3hSOLuVp"),
            Exercise("Corrida estacionária", "A corrida ou marcha estacionária é um exercício no qual você simula os movimentos como se estivesse correndo, mas sem sair do lugar. Faça cerca de 5 séries com duração de 3 minutos cada.", "https://youtu.be/AjKNsaieu2Y?si=ql4_Ha9TXLGqWltu"),
            Exercise("Tríceps no banco", "Coloque um banco perpendicular às costas. Em seguida, apoie as suas mãos no banco quase na largura dos ombros. Com as pernas estendidas para a frente, eleve o seu tronco para cima e para baixo. Para iniciantes, é interessante fazer 3 sessões de 12 agachadas.", "https://youtu.be/GM21qkns-Ao?si=7-M2_3QD0r3aFP3L"),
            Exercise("Bicicleta imaginária", "É preciso deitar com as costas encostadas no chão e, com os pés para cima, simular pedalar em uma bicicleta. Você também pode colocar as mãos atrás da cabeça e tentar encostar, alternadamente, o cotovelo no joelho do lado oposto. Procure iniciar com exercícios de 2 a 3 minutos.", "https://youtu.be/vdWV9CCMyx0?si=7VbJi94htEJ-PL2k"),
            Exercise("Afundo com o pés no apoio", "Você vai precisar de algum banco, sofá ou qualquer outro tipo de apoio. Fique de costas para o objeto, com o peito do pé apoiado nele, enquanto o outro fica na frente do corpo. Faça repetidos agachamentos, com o tronco reto e sem levá-lo para a frente. O ideal é fazer cerca de 3 séries com 10 a 15 repetições.", "https://youtu.be/M6Fn6v9DWyE?si=1HaWkHvAZkt8JMdQ"),

            )

        val recyclerView: RecyclerView = findViewById(R.id.exerciseRecyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = MainActivity12(exercises)
    }
}

