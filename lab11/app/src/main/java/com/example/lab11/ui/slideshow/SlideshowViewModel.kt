package com.example.lab11.ui.slideshow

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SlideshowViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Союз «Молодые профессионалы (Ворлдскиллс Россия)» – официальный оператор международного некоммерческого движения WorldSkills International, миссия которого – повышение стандартов подготовки кадров.\\n \\t Наш девиз: «Делай мир лучше силой своего мастерства!» («Improving the world with the power of skills!»).\\n \\t Раз в два года одна из 84 стран-участниц движения проводит мировой чемпионат профессионального мастерства. В 2019-м он прошел в России (WorldSkillsKazan 2019).\\n \\t WorldSkills Russia проводит всероссийские чемпионаты профессионального мастерства по пяти направлениям:\\n \\t Конкурсы профессионального мастерства между студентами колледжей и техникумов в возрасте до 22 лет. Раз в год победители региональных первенств соревнуются на Национальном финале «Молодые профессионалы» (WorldSkillsRussia). Из победителей формируется расширенный состав национальной сборной для участия в мировом чемпионате WorldSkills Competition. С 2017 года появилась отдельная возрастная линейка – юниоры WorldSkills (16 и младше лет).\\n \\t Корпоративные чемпионаты, которые проводятся на производственных площадках крупнейших российских компаний. В них принимают участие молодые рабочие в возрасте от 16 до 28 лет. Победители представляют свою корпорацию на ежегодном финале WorldSkills Hi-Tech.\\n \\t Чемпионат в сфере высокотехнологичных профессий IT-сектора\""
    }
    val text: LiveData<String> = _text
}