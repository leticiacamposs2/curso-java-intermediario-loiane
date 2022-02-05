package com.leticia.cursojavaintermediario.aula89;

import java.text.NumberFormat;
import java.util.Locale;

public class TesteLocale {

	public static void main(String[] args) {
		
		//dd/MM/yyyy / 05/02/2022
		//MM/dd/yyyy / 05-fev/2022
		
		//1.000,02
		//1,000.02
		
		Locale locale = Locale.getDefault();
		
		System.out.println(locale);
		
		Locale[] locales = Locale.getAvailableLocales();
		for (Locale loc: locales){
			
			System.out.println("Nome: " + loc.getDisplayName());
			System.out.println("Código da língua: " + loc.getLanguage());
			System.out.println("Língua: " + loc.getDisplayLanguage());
			System.out.println("Cod País: " + loc.getCountry());
			System.out.println("País: " + loc.getDisplayCountry());
			
			System.out.println("*******************");
			
		}
		
		Locale br = new Locale("pt", "Brazil");
		
		System.out.println(br);
		
		Locale.setDefault(br);
		
		System.out.println(Locale.getDefault());
		
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		System.out.println(nf.format(5000000000d));
		
		NumberFormat nf1 = NumberFormat.getCurrencyInstance(Locale.US);
		System.out.println(nf1.format(5000000000d));
		
		NumberFormat nf2 = NumberFormat.getCurrencyInstance(Locale.ITALY);
		System.out.println(nf2.format(5000000000d));

	}

}

/*
Código da língua: yue
Língua: cantonês
Cod País: CN
País: China
*******************
Nome: romanche (latim, Suíça)
Código da língua: rm
Língua: romanche
Cod País: CH
País: Suíça
*******************
Nome: inglês (Samoa)
Código da língua: en
Língua: inglês
Cod País: WS
País: Samoa
*******************
Nome: francês (Luxemburgo)
Código da língua: fr
Língua: francês
Cod País: LU
País: Luxemburgo
*******************
Nome: somali
Código da língua: so
Língua: somali
Cod País: 
País: 
*******************
Nome: maori (Nova Zelândia)
Código da língua: mi
Língua: maori
Cod País: NZ
País: Nova Zelândia
*******************
Nome: árabe (Eritreia)
Código da língua: ar
Língua: árabe
Cod País: ER
País: Eritreia
*******************
Nome: kabyle
Código da língua: kab
Língua: kabyle
Cod País: 
País: 
*******************
Nome: nuer
Código da língua: nus
Língua: nuer
Cod País: 
País: 
*******************
Nome: xona (Zimbábue)
Código da língua: sn
Língua: xona
Cod País: ZW
País: Zimbábue
*******************
Nome: espanhol (Ceuta e Melilla)
Código da língua: es
Língua: espanhol
Cod País: EA
País: Ceuta e Melilla
*******************
Nome: irlandês (Reino Unido)
Código da língua: ga
Língua: irlandês
Cod País: GB
País: Reino Unido
*******************
Nome: tailandês (Tailândia, TH, Algarismos tailandeses)
Código da língua: th
Língua: tailandês
Cod País: TH
País: Tailândia
*******************
Nome: híndi
Código da língua: hi
Língua: híndi
Cod País: 
País: 
*******************
Nome: francês (Seicheles)
Código da língua: fr
Língua: francês
Cod País: SC
País: Seicheles
*******************
Nome: inglês (Serra Leoa)
Código da língua: en
Língua: inglês
Cod País: SL
País: Serra Leoa
*******************
Nome: fula (latim, Nigéria)
Código da língua: ff
Língua: fula
Cod País: NG
País: Nigéria
*******************
Nome: norueguês (Noruega)
Código da língua: no
Língua: norueguês
Cod País: NO
País: Noruega
*******************
Nome: fula (Adlm, Nigéria)
Código da língua: ff
Língua: fula
Cod País: NG
País: Nigéria
*******************
Nome: chinês (tradicional, Macau, RAE da China)
Código da língua: zh
Língua: chinês
Cod País: MO
País: Macau, RAE da China
*******************
Nome: inglês (Santa Helena)
Código da língua: en
Língua: inglês
Cod País: SH
País: Santa Helena
*******************
Nome: vai
Código da língua: vai
Língua: vai
Cod País: 
País: 
*******************
Nome: sindi (árabe, Paquistão)
Código da língua: sd
Língua: sindi
Cod País: PK
País: Paquistão
*******************
Nome: alemão (Luxemburgo)
Código da língua: de
Língua: alemão
Cod País: LU
País: Luxemburgo
*******************
Nome: maori
Código da língua: mi
Língua: maori
Cod País: 
País: 
*******************
Nome: maltês
Código da língua: mt
Língua: maltês
Cod País: 
País: 
*******************
Nome: alemão (Alemanha)
Código da língua: de
Língua: alemão
Cod País: DE
País: Alemanha
*******************
Nome: nynorsk norueguês (latim, Noruega)
Código da língua: nn
Língua: nynorsk norueguês
Cod País: NO
País: Noruega
*******************
Nome: inglês (Dinamarca)
Código da língua: en
Língua: inglês
Cod País: DK
País: Dinamarca
*******************
Nome: yangben
Código da língua: yav
Língua: yangben
Cod País: 
País: 
*******************
Nome: somali (Djibuti)
Código da língua: so
Língua: somali
Cod País: DJ
País: Djibuti
*******************
Nome: lituano (Lituânia)
Código da língua: lt
Língua: lituano
Cod País: LT
País: Lituânia
*******************
Nome: kamba
Código da língua: kam
Língua: kamba
Cod País: 
País: 
*******************
Nome: romeno
Código da língua: ro
Língua: romeno
Cod País: 
País: 
*******************
Nome: esperanto (Mundo)
Código da língua: eo
Língua: esperanto
Cod País: 001
País: Mundo
*******************
Nome: pashto (Paquistão)
Código da língua: ps
Língua: pashto
Cod País: PK
País: Paquistão
*******************
Nome: ewe
Código da língua: ee
Língua: ewe
Cod País: 
País: 
*******************
Nome: inglês (Ilhas Menores Distantes dos EUA)
Código da língua: en
Língua: inglês
Cod País: UM
País: Ilhas Menores Distantes dos EUA
*******************
Nome: inglês (Eslovênia)
Código da língua: en
Língua: inglês
Cod País: SI
País: Eslovênia
*******************
Nome: vai (vai, Libéria)
Código da língua: vai
Língua: vai
Cod País: LR
País: Libéria
*******************
Nome: laosiano (Laos)
Código da língua: lo
Língua: laosiano
Cod País: LA
País: Laos
*******************
Nome: cheroqui
Código da língua: chr
Língua: cheroqui
Cod País: 
País: 
*******************
Nome: rombo (latim, Tanzânia)
Código da língua: rof
Língua: rombo
Cod País: TZ
País: Tanzânia
*******************
Nome: árabe (Líbano)
Código da língua: ar
Língua: árabe
Cod País: LB
País: Líbano
*******************
Nome: luri setentrional (árabe, Irã)
Código da língua: lrc
Língua: luri setentrional
Cod País: IR
País: Irã
*******************
Nome: africâner (África do Sul)
Código da língua: af
Língua: africâner
Cod País: ZA
País: África do Sul
*******************
Nome: dogri
Código da língua: doi
Língua: dogri
Cod País: 
País: 
*******************
Nome: fula (Guiné)
Código da língua: ff
Língua: fula
Cod País: GN
País: Guiné
*******************
Nome: kölsch (latim, Alemanha)
Código da língua: ksh
Língua: kölsch
Cod País: DE
País: Alemanha
*******************
Nome: espanhol (Belize)
Código da língua: es
Língua: espanhol
Cod País: BZ
País: Belize
*******************
Nome: árabe (Emirados Árabes Unidos)
Código da língua: ar
Língua: árabe
Cod País: AE
País: Emirados Árabes Unidos
*******************
Nome: esperanto (latim, Mundo)
Código da língua: eo
Língua: esperanto
Cod País: 001
País: Mundo
*******************
Nome: croata (Croácia)
Código da língua: hr
Língua: croata
Cod País: HR
País: Croácia
*******************
Nome: rombo (Tanzânia)
Código da língua: rof
Língua: rombo
Cod País: TZ
País: Tanzânia
*******************
Nome: assamês
Código da língua: as
Língua: assamês
Cod País: 
País: 
*******************
Nome: italiano
Código da língua: it
Língua: italiano
Cod País: 
País: 
*******************
Nome: caxemira (Índia)
Código da língua: ks
Língua: caxemira
Cod País: IN
País: Índia
*******************
Nome: birmanês (Mianmar (Birmânia))
Código da língua: my
Língua: birmanês
Cod País: MM
País: Mianmar (Birmânia)
*******************
Nome: mongol (Mongólia)
Código da língua: mn
Língua: mongol
Cod País: MN
País: Mongólia
*******************
Nome: urdu (Paquistão)
Código da língua: ur
Língua: urdu
Cod País: PK
País: Paquistão
*******************
Nome: dinamarquês (Dinamarca)
Código da língua: da
Língua: dinamarquês
Cod País: DK
País: Dinamarca
*******************
Nome: inglês (Micronésia)
Código da língua: en
Língua: inglês
Cod País: FM
País: Micronésia
*******************
Nome: inglês (Bélgica)
Código da língua: en
Língua: inglês
Cod País: BE
País: Bélgica
*******************
Nome: sichuan yi
Código da língua: ii
Língua: sichuan yi
Cod País: 
País: 
*******************
Nome: francês (Wallis e Futuna)
Código da língua: fr
Língua: francês
Cod País: WF
País: Wallis e Futuna
*******************
Nome: mazandarani (Irã)
Código da língua: mzn
Língua: mazandarani
Cod País: IR
País: Irã
*******************
Nome: nama
Código da língua: naq
Língua: nama
Cod País: 
País: 
*******************
Nome: inglês (Singapura)
Código da língua: en
Língua: inglês
Cod País: SG
País: Singapura
*******************
Nome: kalenjin (Quênia)
Código da língua: kln
Língua: kalenjin
Cod País: KE
País: Quênia
*******************
Nome: tamazight do Atlas Central
Código da língua: tzm
Língua: tamazight do Atlas Central
Cod País: 
País: 
*******************
Nome: fula (latim, Gâmbia)
Código da língua: ff
Língua: fula
Cod País: GM
País: Gâmbia
*******************
Nome: tártaro (cirílico, Rússia)
Código da língua: tt
Língua: tártaro
Cod País: RU
País: Rússia
*******************
Nome: teso (latim, Uganda)
Código da língua: teo
Língua: teso
Cod País: UG
País: Uganda
*******************
Nome: friulano
Código da língua: fur
Língua: friulano
Cod País: 
País: 
*******************
Nome: oromo
Código da língua: om
Língua: oromo
Cod País: 
País: 
*******************
Nome: asu (latim, Tanzânia)
Código da língua: asa
Língua: asu
Cod País: TZ
País: Tanzânia
*******************
Nome: bena (Tanzânia)
Código da língua: bez
Língua: bena
Cod País: TZ
País: Tanzânia
*******************
Nome: fula (latim, Guiné)
Código da língua: ff
Língua: fula
Cod País: GN
País: Guiné
*******************
Nome: esloveno (latim, Eslovênia)
Código da língua: sl
Língua: esloveno
Cod País: SI
País: Eslovênia
*******************
Nome: inglês (Sudão)
Código da língua: en
Língua: inglês
Cod País: SD
País: Sudão
*******************
Nome: maithili (devanágari, Índia)
Código da língua: mai
Língua: maithili
Cod País: IN
País: Índia
*******************
Nome: japonês (Japão, JP, Calendário Japonês)
Código da língua: ja
Língua: japonês
Cod País: JP
País: Japão
*******************
Nome: espanhol (El Salvador)
Código da língua: es
Língua: espanhol
Cod País: SV
País: El Salvador
*******************
Nome: português (Brasil)
Código da língua: pt
Língua: português
Cod País: BR
País: Brasil
*******************
Nome: manipuri (bengali, Índia)
Código da língua: mni
Língua: manipuri
Cod País: IN
País: Índia
*******************
Nome: malaiala (Índia)
Código da língua: ml
Língua: malaiala
Cod País: IN
País: Índia
*******************
Nome: irlandês (latim, Irlanda)
Código da língua: ga
Língua: irlandês
Cod País: IE
País: Irlanda
*******************
Nome: inglês (Ilhas Malvinas)
Código da língua: en
Língua: inglês
Cod País: FK
País: Ilhas Malvinas
*******************
Nome: islandês (Islândia)
Código da língua: is
Língua: islandês
Cod País: IS
País: Islândia
*******************
Nome: basa (latim, Camarões)
Código da língua: bas
Língua: basa
Cod País: CM
País: Camarões
*******************
Nome: inglês (Diego Garcia)
Código da língua: en
Língua: inglês
Cod País: DG
País: Diego Garcia
*******************
Nome: croata
Código da língua: hr
Língua: croata
Cod País: 
País: 
*******************
Nome: português (São Tomé e Príncipe)
Código da língua: pt
Língua: português
Cod País: ST
País: São Tomé e Príncipe
*******************
Nome: akan (Gana)
Código da língua: ak
Língua: akan
Cod País: GH
País: Gana
*******************
Nome: lituano
Código da língua: lt
Língua: lituano
Cod País: 
País: 
*******************
Nome: uzbeque (árabe, Afeganistão)
Código da língua: uz
Língua: uzbeque
Cod País: AF
País: Afeganistão
*******************
Nome: chakma
Código da língua: ccp
Língua: chakma
Cod País: 
País: 
*******************
Nome: inglês (Suécia)
Código da língua: en
Língua: inglês
Cod País: SE
País: Suécia
*******************
Nome: chinês (simplificado, China)
Código da língua: zh
Língua: chinês
Cod País: CN
País: China
*******************
Nome: espanhol (América Latina)
Código da língua: es
Língua: espanhol
Cod País: 419
País: América Latina
*******************
Nome: lingala (latim, Congo - Kinshasa)
Código da língua: ln
Língua: lingala
Cod País: CD
País: Congo - Kinshasa
*******************
Nome: kako (latim, Camarões)
Código da língua: kkj
Língua: kako
Cod País: CM
País: Camarões
*******************
Nome: inglês
Código da língua: en
Língua: inglês
Cod País: 
País: 
*******************
Nome: gusii (Quênia)
Código da língua: guz
Língua: gusii
Cod País: KE
País: Quênia
*******************
Nome: alemão (Suíça) (Liechtenstein)
Código da língua: gsw
Língua: alemão (Suíça)
Cod País: LI
País: Liechtenstein
*******************
Nome: chakma (Bangladesh)
Código da língua: ccp
Língua: chakma
Cod País: BD
País: Bangladesh
*******************
Nome: espanhol (Ilhas Canárias)
Código da língua: es
Língua: espanhol
Cod País: IC
País: Ilhas Canárias
*******************
Nome: catalão
Código da língua: ca
Língua: catalão
Cod País: 
País: 
*******************
Nome: árabe (Tunísia)
Código da língua: ar
Língua: árabe
Cod País: TN
País: Tunísia
*******************
Nome: bambara (Mali)
Código da língua: bm
Língua: bambara
Cod País: ML
País: Mali
*******************
Nome: córnico (Reino Unido)
Código da língua: kw
Língua: córnico
Cod País: GB
País: Reino Unido
*******************
Nome: panjabi (Paquistão)
Código da língua: pa
Língua: panjabi
Cod País: PK
País: Paquistão
*******************
Nome: uigur (China)
Código da língua: ug
Língua: uigur
Cod País: CN
País: China
*******************
Nome: machame (latim, Tanzânia)
Código da língua: jmc
Língua: machame
Cod País: TZ
País: Tanzânia
*******************
Nome: quicuio (latim, Quênia)
Código da língua: ki
Língua: quicuio
Cod País: KE
País: Quênia
*******************
Nome: espanhol (Brasil)
Código da língua: es
Língua: espanhol
Cod País: BR
País: Brasil
*******************
Nome: koyra chiini (Mali)
Código da língua: khq
Língua: koyra chiini
Cod País: ML
País: Mali
*******************
Nome: inglês (Ilhas Salomão)
Código da língua: en
Língua: inglês
Cod País: SB
País: Ilhas Salomão
*******************
Nome: tibetano (tibetano, China)
Código da língua: bo
Língua: tibetano
Cod País: CN
País: China
*******************
Nome: cheroqui (Estados Unidos)
Código da língua: chr
Língua: cheroqui
Cod País: US
País: Estados Unidos
*******************
Nome: quiniaruanda (Ruanda)
Código da língua: rw
Língua: quiniaruanda
Cod País: RW
País: Ruanda
*******************
Nome: tachelhit (tifinagh, Marrocos)
Código da língua: shi
Língua: tachelhit
Cod País: MA
País: Marrocos
*******************
Nome: árabe (Iraque)
Código da língua: ar
Língua: árabe
Cod País: IQ
País: Iraque
*******************
Nome: nyankole
Código da língua: nyn
Língua: nyankole
Cod País: 
País: 
*******************
Nome: macedônio
Código da língua: mk
Língua: macedônio
Cod País: 
País: 
*******************
Nome: santali
Código da língua: sat
Língua: santali
Cod País: 
País: 
*******************
Nome: panjabi (árabe)
Código da língua: pa
Língua: panjabi
Cod País: 
País: 
*******************
Nome: inglês (Alemanha)
Código da língua: en
Língua: inglês
Cod País: DE
País: Alemanha
*******************
Nome: romeno (Moldávia)
Código da língua: ro
Língua: romeno
Cod País: MD
País: Moldávia
*******************
Nome: bósnio
Código da língua: bs
Língua: bósnio
Cod País: 
País: 
*******************
Nome: inglês (Finlândia)
Código da língua: en
Língua: inglês
Cod País: FI
País: Finlândia
*******************
Nome: frísio ocidental
Código da língua: fy
Língua: frísio ocidental
Cod País: 
País: 
*******************
Nome: tailandês
Código da língua: th
Língua: tailandês
Cod País: 
País: 
*******************
Nome: uzbeque (Uzbequistão)
Código da língua: uz
Língua: uzbeque
Cod País: UZ
País: Uzbequistão
*******************
Nome: taita (Quênia)
Código da língua: dav
Língua: taita
Cod País: KE
País: Quênia
*******************
Nome: interlíngua (latim, Mundo)
Código da língua: ia
Língua: interlíngua
Cod País: 001
País: Mundo
*******************
Nome: sakha (cirílico, Rússia)
Código da língua: sah
Língua: sakha
Cod País: RU
País: Rússia
*******************
Nome: inglês (Seicheles)
Código da língua: en
Língua: inglês
Cod País: SC
País: Seicheles
*******************
Nome: inglês (Uganda)
Código da língua: en
Língua: inglês
Cod País: UG
País: Uganda
*******************
Nome: inglês (Nova Zelândia)
Código da língua: en
Língua: inglês
Cod País: NZ
País: Nova Zelândia
*******************
Nome: zarma
Código da língua: dje
Língua: zarma
Cod País: 
País: 
*******************
Nome: espanhol (Uruguai)
Código da língua: es
Língua: espanhol
Cod País: UY
País: Uruguai
*******************
Nome: massai (Quênia)
Código da língua: mas
Língua: massai
Cod País: KE
País: Quênia
*******************
Nome: manipuri (Índia)
Código da língua: mni
Língua: manipuri
Cod País: IN
País: Índia
*******************
Nome: russo (Ucrânia)
Código da língua: ru
Língua: russo
Cod País: UA
País: Ucrânia
*******************
Nome: sango (República Centro-Africana)
Código da língua: sg
Língua: sango
Cod País: CF
País: República Centro-Africana
*******************
Nome: inglês (Fiji)
Código da língua: en
Língua: inglês
Cod País: FJ
País: Fiji
*******************
Nome: alemão (Liechtenstein)
Código da língua: de
Língua: alemão
Cod País: LI
País: Liechtenstein
*******************
Nome: inglês (Barbados)
Código da língua: en
Língua: inglês
Cod País: BB
País: Barbados
*******************
Nome: lapão de Inari (Finlândia)
Código da língua: smn
Língua: lapão de Inari
Cod País: FI
País: Finlândia
*******************
Nome: croata (Bósnia e Herzegovina)
Código da língua: hr
Língua: croata
Cod País: BA
País: Bósnia e Herzegovina
*******************
Nome: iorubá (latim, Nigéria)
Código da língua: yo
Língua: iorubá
Cod País: NG
País: Nigéria
*******************
Nome: alemão (Áustria)
Código da língua: de
Língua: alemão
Cod País: AT
País: Áustria
*******************
Nome: luba-catanga (Congo - Kinshasa)
Código da língua: lu
Língua: luba-catanga
Cod País: CD
País: Congo - Kinshasa
*******************
Nome: árabe (Mundo)
Código da língua: ar
Língua: árabe
Cod País: 001
País: Mundo
*******************
Nome: somali (Somália)
Código da língua: so
Língua: somali
Cod País: SO
País: Somália
*******************
Nome: letão (Letônia)
Código da língua: lv
Língua: letão
Cod País: LV
País: Letônia
*******************
Nome: curdo central
Código da língua: ckb
Língua: curdo central
Cod País: 
País: 
*******************
Nome: árabe (Kuwait)
Código da língua: ar
Língua: árabe
Cod País: KW
País: Kuwait
*******************
Nome: sérvio (cirílico, Sérvia)
Código da língua: sr
Língua: sérvio
Cod País: RS
País: Sérvia
*******************
Nome: bemba
Código da língua: bem
Língua: bemba
Cod País: 
País: 
*******************
Nome: dinamarquês
Código da língua: da
Língua: dinamarquês
Cod País: 
País: 
*******************
Nome: walser
Código da língua: wae
Língua: walser
Cod País: 
País: 
*******************
Nome: inglês (Lesoto)
Código da língua: en
Língua: inglês
Cod País: LS
País: Lesoto
*******************
Nome: igbo
Código da língua: ig
Língua: igbo
Cod País: 
País: 
*******************
Nome: inglês (Hong Kong, RAE da China)
Código da língua: en
Língua: inglês
Cod País: HK
País: Hong Kong, RAE da China
*******************
Nome: bodo (devanágari, Índia)
Código da língua: brx
Língua: bodo
Cod País: IN
País: Índia
*******************
Nome: meru (latim, Quênia)
Código da língua: mer
Língua: meru
Cod País: KE
País: Quênia
*******************
Nome: checheno (Rússia)
Código da língua: ce
Língua: checheno
Cod País: RU
País: Rússia
*******************
Nome: georgiano (Geórgia)
Código da língua: ka
Língua: georgiano
Cod País: GE
País: Geórgia
*******************
Nome: suaíli (Tanzânia)
Código da língua: sw
Língua: suaíli
Cod País: TZ
País: Tanzânia
*******************
Nome: francês (Ruanda)
Código da língua: fr
Língua: francês
Cod País: RW
País: Ruanda
*******************
Nome: malgaxe (Madagascar)
Código da língua: mg
Língua: malgaxe
Cod País: MG
País: Madagascar
*******************
Nome: inglês (latim, Estados Unidos)
Código da língua: en
Língua: inglês
Cod País: US
País: Estados Unidos
*******************
Nome: osseto (Rússia)
Código da língua: os
Língua: osseto
Cod País: RU
País: Rússia
*******************
Nome: sérvio (latim, Sérvia)
Código da língua: sr
Língua: sérvio
Cod País: RS
País: Sérvia
*******************
Nome: quirguiz (Quirguistão)
Código da língua: ky
Língua: quirguiz
Cod País: KG
País: Quirguistão
*******************
Nome: tamazight do Atlas Central (latim, Marrocos)
Código da língua: tzm
Língua: tamazight do Atlas Central
Cod País: MA
País: Marrocos
*******************
Nome: holandês (latim, Países Baixos)
Código da língua: nl
Língua: holandês
Cod País: NL
País: Países Baixos
*******************
Nome: curdo (latim, Turquia)
Código da língua: ku
Língua: curdo
Cod País: TR
País: Turquia
*******************
Nome: quicuio
Código da língua: ki
Língua: quicuio
Cod País: 
País: 
*******************
Nome: morisyen (latim, Maurício)
Código da língua: mfe
Língua: morisyen
Cod País: MU
País: Maurício
*******************
Nome: bokmål norueguês
Código da língua: nb
Língua: bokmål norueguês
Cod País: 
País: 
*******************
Nome: concani
Código da língua: kok
Língua: concani
Cod País: 
País: 
*******************
Nome: ewondo
Código da língua: ewo
Língua: ewondo
Cod País: 
País: 
*******************
Nome: nynorsk norueguês
Código da língua: nn
Língua: nynorsk norueguês
Cod País: 
País: 
*******************
Nome: árabe (Jordânia)
Código da língua: ar
Língua: árabe
Cod País: JO
País: Jordânia
*******************
Nome: galego (latim, Espanha)
Código da língua: gl
Língua: galego
Cod País: ES
País: Espanha
*******************
Nome: búlgaro
Código da língua: bg
Língua: búlgaro
Cod País: 
País: 
*******************
Nome: crioulo cabo-verdiano
Código da língua: kea
Língua: crioulo cabo-verdiano
Cod País: 
País: 
*******************
Nome: zulu
Código da língua: zu
Língua: zulu
Cod País: 
País: 
*******************
Nome: quirguiz (cirílico, Quirguistão)
Código da língua: ky
Língua: quirguiz
Cod País: KG
País: Quirguistão
*******************
Nome: amárico (Etiópia)
Código da língua: am
Língua: amárico
Cod País: ET
País: Etiópia
*******************
Nome: francês (Argélia)
Código da língua: fr
Língua: francês
Cod País: DZ
País: Argélia
*******************
Nome: tibetano (China)
Código da língua: bo
Língua: tibetano
Cod País: CN
País: China
*******************
Nome: alto sorábio
Código da língua: hsb
Língua: alto sorábio
Cod País: 
País: 
*******************
Nome: quíchua (Equador)
Código da língua: qu
Língua: quíchua
Cod País: EC
País: Equador
*******************
Nome: georgiano (georgiano, Geórgia)
Código da língua: ka
Língua: georgiano
Cod País: GE
País: Geórgia
*******************
Nome: inglês (Montserrat)
Código da língua: en
Língua: inglês
Cod País: MS
País: Montserrat
*******************
Nome: concani (devanágari, Índia)
Código da língua: kok
Língua: concani
Cod País: IN
País: Índia
*******************
Nome: inglês (Guernsey)
Código da língua: en
Língua: inglês
Cod País: GG
País: Guernsey
*******************
Nome: maconde (latim, Tanzânia)
Código da língua: kde
Língua: maconde
Cod País: TZ
País: Tanzânia
*******************
Nome: santali (Índia)
Código da língua: sat
Língua: santali
Cod País: IN
País: Índia
*******************
Nome: sérvio (Montenegro)
Código da língua: sr
Língua: sérvio
Cod País: ME
País: Montenegro
*******************
Nome: sueco (Suécia)
Código da língua: sv
Língua: sueco
Cod País: SE
País: Suécia
*******************
Nome: pidgin nigeriano
Código da língua: pcm
Língua: pidgin nigeriano
Cod País: 
País: 
*******************
Nome: sakha
Código da língua: sah
Língua: sakha
Cod País: 
País: 
*******************
Nome: meru
Código da língua: mer
Língua: meru
Cod País: 
País: 
*******************
Nome: inglês (Zâmbia)
Código da língua: en
Língua: inglês
Cod País: ZM
País: Zâmbia
*******************
Nome: francês (Mali)
Código da língua: fr
Língua: francês
Cod País: ML
País: Mali
*******************
Nome: hauçá (Nigéria)
Código da língua: ha
Língua: hauçá
Cod País: NG
País: Nigéria
*******************
Nome: bretão
Código da língua: br
Língua: bretão
Cod País: 
País: 
*******************
Nome: árabe (Arábia Saudita)
Código da língua: ar
Língua: árabe
Cod País: SA
País: Arábia Saudita
*******************
Nome: persa (Afeganistão)
Código da língua: fa
Língua: persa
Cod País: AF
País: Afeganistão
*******************
Nome: filipino (latim, Filipinas)
Código da língua: fil
Língua: filipino
Cod País: PH
País: Filipinas
*******************
Nome: eslovaco
Código da língua: sk
Língua: eslovaco
Cod País: 
País: 
*******************
Nome: oromo (latim, Etiópia)
Código da língua: om
Língua: oromo
Cod País: ET
País: Etiópia
*******************
Nome: osseto (Geórgia)
Código da língua: os
Língua: osseto
Cod País: GE
País: Geórgia
*******************
Nome: curdo central (árabe, Iraque)
Código da língua: ckb
Língua: curdo central
Cod País: IQ
País: Iraque
*******************
Nome: iídiche (Mundo)
Código da língua: yi
Língua: iídiche
Cod País: 001
País: Mundo
*******************
Nome: malaiala
Código da língua: ml
Língua: malaiala
Cod País: 
País: 
*******************
Nome: inglês (Malta)
Código da língua: en
Língua: inglês
Cod País: MT
País: Malta
*******************
Nome: inglês (Gana)
Código da língua: en
Língua: inglês
Cod País: GH
País: Gana
*******************
Nome: inglês (Israel)
Código da língua: en
Língua: inglês
Cod País: IL
País: Israel
*******************
Nome: sueco
Código da língua: sv
Língua: sueco
Cod País: 
País: 
*******************
Nome: canarim (kannada, Índia)
Código da língua: kn
Língua: canarim
Cod País: IN
País: Índia
*******************
Nome: tamazight do Atlas Central (Marrocos)
Código da língua: tzm
Língua: tamazight do Atlas Central
Cod País: MA
País: Marrocos
*******************
Nome: grego (grego, Grécia)
Código da língua: el
Língua: grego
Cod País: GR
País: Grécia
*******************
Nome: koyraboro senni (Mali)
Código da língua: ses
Língua: koyraboro senni
Cod País: ML
País: Mali
*******************
Nome: rwa (latim, Tanzânia)
Código da língua: rwk
Língua: rwa
Cod País: TZ
País: Tanzânia
*******************
Nome: lacota (Estados Unidos)
Código da língua: lkt
Língua: lacota
Cod País: US
País: Estados Unidos
*******************
Nome: sindi (devanágari)
Código da língua: sd
Língua: sindi
Cod País: 
País: 
*******************
Nome: vai (latim, Libéria)
Código da língua: vai
Língua: vai
Cod País: LR
País: Libéria
*******************
Nome: curdo
Código da língua: ku
Língua: curdo
Cod País: 
País: 
*******************
Nome: suaíli (Congo - Kinshasa)
Código da língua: sw
Língua: suaíli
Cod País: CD
País: Congo - Kinshasa
*******************
Nome: fula (Adlm, Mauritânia)
Código da língua: ff
Língua: fula
Cod País: MR
País: Mauritânia
*******************
Nome: filipino (Filipinas)
Código da língua: fil
Língua: filipino
Cod País: PH
País: Filipinas
*******************
Nome: italiano (Cidade do Vaticano)
Código da língua: it
Língua: italiano
Cod País: VA
País: Cidade do Vaticano
*******************
Nome: espanhol (Filipinas)
Código da língua: es
Língua: espanhol
Cod País: PH
País: Filipinas
*******************
Nome: espanhol (Espanha)
Código da língua: es
Língua: espanhol
Cod País: ES
País: Espanha
*******************
Nome: espanhol (Colômbia)
Código da língua: es
Língua: espanhol
Cod País: CO
País: Colômbia
*******************
Nome: búlgaro (Bulgária)
Código da língua: bg
Língua: búlgaro
Cod País: BG
País: Bulgária
*******************
Nome: inglês (São Vicente e Granadinas)
Código da língua: en
Língua: inglês
Cod País: VC
País: São Vicente e Granadinas
*******************
Nome: koyraboro senni (latim, Mali)
Código da língua: ses
Língua: koyraboro senni
Cod País: ML
País: Mali
*******************
Nome: aghem
Código da língua: agq
Língua: aghem
Cod País: 
País: 
*******************
Nome: alto sorábio (Alemanha)
Código da língua: hsb
Língua: alto sorábio
Cod País: DE
País: Alemanha
*******************
Nome: basco (latim, Espanha)
Código da língua: eu
Língua: basco
Cod País: ES
País: Espanha
*******************
Nome: inglês (Europa)
Código da língua: en
Língua: inglês
Cod País: 150
País: Europa
*******************
Nome: sueco (latim, Suécia)
Código da língua: sv
Língua: sueco
Cod País: SE
País: Suécia
*******************
Nome: árabe (Sudão)
Código da língua: ar
Língua: árabe
Cod País: SD
País: Sudão
*******************
Nome: hauçá (Níger)
Código da língua: ha
Língua: hauçá
Cod País: NE
País: Níger
*******************
Nome: inglês (São Cristóvão e Névis)
Código da língua: en
Língua: inglês
Cod País: KN
País: São Cristóvão e Névis
*******************
Nome: embu
Código da língua: ebu
Língua: embu
Cod País: 
País: 
*******************
Nome: romeno (Romênia)
Código da língua: ro
Língua: romeno
Cod País: RO
País: Romênia
*******************
Nome: sérvio (latim, Montenegro)
Código da língua: sr
Língua: sérvio
Cod País: ME
País: Montenegro
*******************
Nome: espanhol (Guatemala)
Código da língua: es
Língua: espanhol
Cod País: GT
País: Guatemala
*******************
Nome: fula (latim, Libéria)
Código da língua: ff
Língua: fula
Cod País: LR
País: Libéria
*******************
Nome: basa (Camarões)
Código da língua: bas
Língua: basa
Cod País: CM
País: Camarões
*******************
Nome: ndebele do norte (latim, Zimbábue)
Código da língua: nd
Língua: ndebele do norte
Cod País: ZW
País: Zimbábue
*******************
Nome: francês (Madagascar)
Código da língua: fr
Língua: francês
Cod País: MG
País: Madagascar
*******************
Nome: espanhol (Chile)
Código da língua: es
Língua: espanhol
Cod País: CL
País: Chile
*******************
Nome: mongol
Código da língua: mn
Língua: mongol
Cod País: 
País: 
*******************
Nome: kamba (Quênia)
Código da língua: kam
Língua: kamba
Cod País: KE
País: Quênia
*******************
Nome: persa (Irã)
Código da língua: fa
Língua: persa
Cod País: IR
País: Irã
*******************
Nome: inglês (Macau, RAE da China)
Código da língua: en
Língua: inglês
Cod País: MO
País: Macau, RAE da China
*******************
Nome: japonês (japonês, Japão)
Código da língua: ja
Língua: japonês
Cod País: JP
País: Japão
*******************
Nome: uolofe
Código da língua: wo
Língua: uolofe
Cod País: 
País: 
*******************
Nome: tachelhit (tifinagh)
Código da língua: shi
Língua: tachelhit
Cod País: 
País: 
*******************
Nome: inglês (Belize)
Código da língua: en
Língua: inglês
Cod País: BZ
País: Belize
*******************
Nome: lacota (latim, Estados Unidos)
Código da língua: lkt
Língua: lacota
Cod País: US
País: Estados Unidos
*******************
Nome: albanês (Albânia)
Código da língua: sq
Língua: albanês
Cod País: AL
País: Albânia
*******************
Nome: romeno (latim, Romênia)
Código da língua: ro
Língua: romeno
Cod País: RO
País: Romênia
*******************
Nome: tasawaq (Níger)
Código da língua: twq
Língua: tasawaq
Cod País: NE
País: Níger
*******************
Nome: kwasio (Camarões)
Código da língua: nmg
Língua: kwasio
Cod País: CM
País: Camarões
*******************
Nome: tâmil (tâmil, Índia)
Código da língua: ta
Língua: tâmil
Cod País: IN
País: Índia
*******************
Nome: kabyle (latim, Argélia)
Código da língua: kab
Língua: kabyle
Cod País: DZ
País: Argélia
*******************
Nome: azerbaijano (cirílico)
Código da língua: az
Língua: azerbaijano
Cod País: 
País: 
*******************
Nome: inglês (Ilhas Marianas do Norte)
Código da língua: en
Língua: inglês
Cod País: MP
País: Ilhas Marianas do Norte
*******************
Nome: inglês (Granada)
Código da língua: en
Língua: inglês
Cod País: GD
País: Granada
*******************
Nome: turcomeno
Código da língua: tk
Língua: turcomeno
Cod País: 
País: 
*******************
Nome: sangu (latim, Tanzânia)
Código da língua: sbp
Língua: sangu
Cod País: TZ
País: Tanzânia
*******************
Nome: tachelhit (latim)
Código da língua: shi
Língua: tachelhit
Cod País: 
País: 
*******************
Nome: inglês (Botsuana)
Código da língua: en
Língua: inglês
Cod País: BW
País: Botsuana
*******************
Nome: kabyle (Argélia)
Código da língua: kab
Língua: kabyle
Cod País: DZ
País: Argélia
*******************
Nome: hebraico (Israel)
Código da língua: he
Língua: hebraico
Cod País: IL
País: Israel
*******************
Nome: maconde (Tanzânia)
Código da língua: kde
Língua: maconde
Cod País: TZ
País: Tanzânia
*******************
Nome: tâmil (Malásia)
Código da língua: ta
Língua: tâmil
Cod País: MY
País: Malásia
*******************
Nome: sueco (Finlândia)
Código da língua: sv
Língua: sueco
Cod País: FI
País: Finlândia
*******************
Nome: ndebele do norte (Zimbábue)
Código da língua: nd
Língua: ndebele do norte
Cod País: ZW
País: Zimbábue
*******************
Nome: luyia (latim, Quênia)
Código da língua: luy
Língua: luyia
Cod País: KE
País: Quênia
*******************
Nome: manipuri (bengali)
Código da língua: mni
Língua: manipuri
Cod País: 
País: 
*******************
Nome: nepalês
Código da língua: ne
Língua: nepalês
Cod País: 
País: 
*******************
Nome: inglês (Irlanda)
Código da língua: en
Língua: inglês
Cod País: IE
País: Irlanda
*******************
Nome: chinês (Singapura)
Código da língua: zh
Língua: chinês
Cod País: SG
País: Singapura
*******************
Nome: cingalês (cingalês, Sri Lanka)
Código da língua: si
Língua: cingalês
Cod País: LK
País: Sri Lanka
*******************
Nome: inglês (Quiribati)
Código da língua: en
Língua: inglês
Cod País: KI
País: Quiribati
*******************
Nome: tasawaq (latim, Níger)
Código da língua: twq
Língua: tasawaq
Cod País: NE
País: Níger
*******************
Nome: oromo (Etiópia)
Código da língua: om
Língua: oromo
Cod País: ET
País: Etiópia
*******************
Nome: laosiano (lao, Laos)
Código da língua: lo
Língua: laosiano
Cod País: LA
País: Laos
*******************
Nome: albanês (latim, Albânia)
Código da língua: sq
Língua: albanês
Cod País: AL
País: Albânia
*******************
Nome: japonês (Japão)
Código da língua: ja
Língua: japonês
Cod País: JP
País: Japão
*******************
Nome: kamba (latim, Quênia)
Código da língua: kam
Língua: kamba
Cod País: KE
País: Quênia
*******************
Nome: birmanês
Código da língua: my
Língua: birmanês
Cod País: 
País: 
*******************
Nome: georgiano
Código da língua: ka
Língua: georgiano
Cod País: 
País: 
*******************
Nome: fula (Adlm, Gana)
Código da língua: ff
Língua: fula
Cod País: GH
País: Gana
*******************
Nome: coreano (coreano, Coreia do Sul)
Código da língua: ko
Língua: coreano
Cod País: KR
País: Coreia do Sul
*******************
Nome: francês (São Martinho)
Código da língua: fr
Língua: francês
Cod País: MF
País: São Martinho
*******************
Nome: malaio (Indonésia)
Código da língua: ms
Língua: malaio
Cod País: ID
País: Indonésia
*******************
Nome: tachelhit
Código da língua: shi
Língua: tachelhit
Cod País: 
País: 
*******************
Nome: groenlandês
Código da língua: kl
Língua: groenlandês
Cod País: 
País: 
*******************
Nome: sânscrito (Índia)
Código da língua: sa
Língua: sânscrito
Cod País: IN
País: Índia
*******************
Nome: cantonês (Hong Kong, RAE da China)
Código da língua: yue
Língua: cantonês
Cod País: HK
País: Hong Kong, RAE da China
*******************
Nome: indonésio
Código da língua: id
Língua: indonésio
Cod País: 
País: 
*******************
Nome: inglês (Essuatíni)
Código da língua: en
Língua: inglês
Cod País: SZ
País: Essuatíni
*******************
Nome: feroês (latim, Ilhas Faroé)
Código da língua: fo
Língua: feroês
Cod País: FO
País: Ilhas Faroé
*******************
Nome: rwa (Tanzânia)
Código da língua: rwk
Língua: rwa
Cod País: TZ
País: Tanzânia
*******************
Nome: chinês
Código da língua: zh
Língua: chinês
Cod País: 
País: 
*******************
Nome: espanhol (Peru)
Código da língua: es
Língua: espanhol
Cod País: PE
País: Peru
*******************
Nome: macua (Moçambique)
Código da língua: mgh
Língua: macua
Cod País: MZ
País: Moçambique
*******************
Nome: samburu
Código da língua: saq
Língua: samburu
Cod País: 
País: 
*******************
Nome: inglês (Reino Unido)
Código da língua: en
Língua: inglês
Cod País: GB
País: Reino Unido
*******************
Nome: chinês (tradicional, Hong Kong, RAE da China)
Código da língua: zh
Língua: chinês
Cod País: HK
País: Hong Kong, RAE da China
*******************
Nome: santali (ol chiki, Índia)
Código da língua: sat
Língua: santali
Cod País: IN
País: Índia
*******************
Nome: cazaque (Cazaquistão)
Código da língua: kk
Língua: cazaque
Cod País: KZ
País: Cazaquistão
*******************
Nome: espanhol (Panamá)
Código da língua: es
Língua: espanhol
Cod País: PA
País: Panamá
*******************
Nome: árabe (Territórios palestinos)
Código da língua: ar
Língua: árabe
Cod País: PS
País: Territórios palestinos
*******************
Nome: bena
Código da língua: bez
Língua: bena
Cod País: 
País: 
*******************
Nome: francês (Mônaco)
Código da língua: fr
Língua: francês
Cod País: MC
País: Mônaco
*******************
Nome: córnico
Código da língua: kw
Língua: córnico
Cod País: 
País: 
*******************
Nome: vai (latim)
Código da língua: vai
Língua: vai
Cod País: 
País: 
*******************
Nome: kölsch
Código da língua: ksh
Língua: kölsch
Cod País: 
País: 
*******************
Nome: urdu (Índia)
Código da língua: ur
Língua: urdu
Cod País: IN
País: Índia
*******************
Nome: lingala
Código da língua: ln
Língua: lingala
Cod País: 
País: 
*******************
Nome: checheno (cirílico, Rússia)
Código da língua: ce
Língua: checheno
Cod País: RU
País: Rússia
*******************
Nome: alemão (Suíça) (Suíça)
Código da língua: gsw
Língua: alemão (Suíça)
Cod País: CH
País: Suíça
*******************
Nome: luyia (Quênia)
Código da língua: luy
Língua: luyia
Cod País: KE
País: Quênia
*******************
Nome: português
Código da língua: pt
Língua: português
Cod País: 
País: 
*******************
Nome: kako (Camarões)
Código da língua: kkj
Língua: kako
Cod País: CM
País: Camarões
*******************
Nome: espanhol (Guiné Equatorial)
Código da língua: es
Língua: espanhol
Cod País: GQ
País: Guiné Equatorial
*******************
Nome: macua (latim, Moçambique)
Código da língua: mgh
Língua: macua
Cod País: MZ
País: Moçambique
*******************
Nome: árabe (Iêmen)
Código da língua: ar
Língua: árabe
Cod País: YE
País: Iêmen
*******************
Nome: tonganês
Código da língua: to
Língua: tonganês
Cod País: 
País: 
*******************
Nome: inglês (Sint Maarten)
Código da língua: en
Língua: inglês
Cod País: SX
País: Sint Maarten
*******************
Nome: russo (Cazaquistão)
Código da língua: ru
Língua: russo
Cod País: KZ
País: Cazaquistão
*******************
Nome: estoniano
Código da língua: et
Língua: estoniano
Cod País: 
País: 
*******************
Nome: coreano (Coreia do Norte)
Código da língua: ko
Língua: coreano
Cod País: KP
País: Coreia do Norte
*******************
Nome: holandês (Suriname)
Código da língua: nl
Língua: holandês
Cod País: SR
País: Suriname
*******************
Nome: rombo
Código da língua: rof
Língua: rombo
Cod País: 
País: 
*******************
Nome: inglês (Bahamas)
Código da língua: en
Língua: inglês
Cod País: BS
País: Bahamas
*******************
Nome: bemba (latim, Zâmbia)
Código da língua: bem
Língua: bemba
Cod País: ZM
País: Zâmbia
*******************
Nome: bielorrusso
Código da língua: be
Língua: bielorrusso
Cod País: 
País: 
*******************
Nome: manx
Código da língua: gv
Língua: manx
Cod País: 
País: 
*******************
Nome: kalenjin (latim, Quênia)
Código da língua: kln
Língua: kalenjin
Cod País: KE
País: Quênia
*******************
Nome: duala
Código da língua: dua
Língua: duala
Cod País: 
País: 
*******************
Nome: chiga (latim, Uganda)
Código da língua: cgg
Língua: chiga
Cod País: UG
País: Uganda
*******************
Nome: holandês (Países Baixos Caribenhos)
Código da língua: nl
Língua: holandês
Cod País: BQ
País: Países Baixos Caribenhos
*******************
Nome: ewe (latim, Gana)
Código da língua: ee
Língua: ewe
Cod País: GH
País: Gana
*******************
Nome: fula (Adlm, Guiné)
Código da língua: ff
Língua: fula
Cod País: GN
País: Guiné
*******************
Nome: uzbeque (cirílico, Uzbequistão)
Código da língua: uz
Língua: uzbeque
Cod País: UZ
País: Uzbequistão
*******************
Nome: híndi (devanágari, Índia)
Código da língua: hi
Língua: híndi
Cod País: IN
País: Índia
*******************
Nome: gusii
Código da língua: guz
Língua: gusii
Cod País: 
País: 
*******************
Nome: inglês (Quênia)
Código da língua: en
Língua: inglês
Cod País: KE
País: Quênia
*******************
Nome: morisyen
Código da língua: mfe
Língua: morisyen
Cod País: 
País: 
*******************
Nome: asu (Tanzânia)
Código da língua: asa
Língua: asu
Cod País: TZ
País: Tanzânia
*******************
Nome: japonês
Código da língua: ja
Língua: japonês
Cod País: 
País: 
*******************
Nome: francês (Senegal)
Código da língua: fr
Língua: francês
Cod País: SN
País: Senegal
*******************
Nome: oriá
Código da língua: or
Língua: oriá
Cod País: 
País: 
*******************
Nome: bodo
Código da língua: brx
Língua: bodo
Cod País: 
País: 
*******************
Nome: francês (Marrocos)
Código da língua: fr
Língua: francês
Cod País: MA
País: Marrocos
*******************
Nome: português (Luxemburgo)
Código da língua: pt
Língua: português
Cod País: LU
País: Luxemburgo
*******************
Nome: fula (Adlm, Gâmbia)
Código da língua: ff
Língua: fula
Cod País: GM
País: Gâmbia
*******************
Nome: francês (São Bartolomeu)
Código da língua: fr
Língua: francês
Cod País: BL
País: São Bartolomeu
*******************
Nome: meta’ (Camarões)
Código da língua: mgo
Língua: meta’
Cod País: CM
País: Camarões
*******************
Nome: kwasio (latim, Camarões)
Código da língua: nmg
Língua: kwasio
Cod País: CM
País: Camarões
*******************
Nome: maithili (Índia)
Código da língua: mai
Língua: maithili
Cod País: IN
País: Índia
*******************
Nome: coreano (Coreia do Sul)
Código da língua: ko
Língua: coreano
Cod País: KR
País: Coreia do Sul
*******************
Nome: tadjique (cirílico, Tadjiquistão)
Código da língua: tg
Língua: tadjique
Cod País: TJ
País: Tadjiquistão
*******************
Nome: espanhol (México)
Código da língua: es
Língua: espanhol
Cod País: MX
País: México
*******************
Nome: zulu (latim, África do Sul)
Código da língua: zu
Língua: zulu
Cod País: ZA
País: África do Sul
*******************
Nome: dogri (Índia)
Código da língua: doi
Língua: dogri
Cod País: IN
País: Índia
*******************
Nome: finlandês
Código da língua: fi
Língua: finlandês
Cod País: 
País: 
*******************
Nome: uzbeque
Código da língua: uz
Língua: uzbeque
Cod País: 
País: 
*******************
Nome: bósnio (cirílico)
Código da língua: bs
Língua: bósnio
Cod País: 
País: 
*******************
Nome: sérvio (latim)
Código da língua: sr
Língua: sérvio
Cod País: 
País: 
*******************
Nome: inglês (Sudão do Sul)
Código da língua: en
Língua: inglês
Cod País: SS
País: Sudão do Sul
*******************
Nome: tibetano (Índia)
Código da língua: bo
Língua: tibetano
Cod País: IN
País: Índia
*******************
Nome: romanche
Código da língua: rm
Língua: romanche
Cod País: 
País: 
*******************
Nome: tachelhit (Marrocos)
Código da língua: shi
Língua: tachelhit
Cod País: MA
País: Marrocos
*******************
Nome: inglês (Madagascar)
Código da língua: en
Língua: inglês
Cod País: MG
País: Madagascar
*******************
Nome: francês (Burundi)
Código da língua: fr
Língua: francês
Cod País: BI
País: Burundi
*******************
Nome: alto sorábio (latim, Alemanha)
Código da língua: hsb
Língua: alto sorábio
Cod País: DE
País: Alemanha
*******************
Nome: nama (latim, Namíbia)
Código da língua: naq
Língua: nama
Cod País: NA
País: Namíbia
*******************
Nome: bengali
Código da língua: bn
Língua: bengali
Cod País: 
País: 
*******************
Nome: bretão (latim, França)
Código da língua: br
Língua: bretão
Cod País: FR
País: França
*******************
Nome: canarim
Código da língua: kn
Língua: canarim
Cod País: 
País: 
*******************
Nome: ngiemboon
Código da língua: nnh
Língua: ngiemboon
Cod País: 
País: 
*******************
Nome: bengali (Bangladesh)
Código da língua: bn
Língua: bengali
Cod País: BD
País: Bangladesh
*******************
Nome: espanhol (latim, Espanha)
Código da língua: es
Língua: espanhol
Cod País: ES
País: Espanha
*******************
Nome: inglês (África do Sul)
Código da língua: en
Língua: inglês
Cod País: ZA
País: África do Sul
*******************
Nome: galês (latim, Reino Unido)
Código da língua: cy
Língua: galês
Cod País: GB
País: Reino Unido
*******************
Nome: francês (França)
Código da língua: fr
Língua: francês
Cod País: FR
País: França
*******************
Nome: panjabi (Índia)
Código da língua: pa
Língua: panjabi
Cod País: IN
País: Índia
*******************
Nome: inglês (Ilhas Marshall)
Código da língua: en
Língua: inglês
Cod País: MH
País: Ilhas Marshall
*******************
Nome: francês (Benin)
Código da língua: fr
Língua: francês
Cod País: BJ
País: Benin
*******************
Nome: vai (Libéria)
Código da língua: vai
Língua: vai
Cod País: LR
País: Libéria
*******************
Nome: chinês (tradicional)
Código da língua: zh
Língua: chinês
Cod País: 
País: 
*******************
Nome: javanês (latim, Indonésia)
Código da língua: jv
Língua: javanês
Cod País: ID
País: Indonésia
*******************
Nome: sakha (Rússia)
Código da língua: sah
Língua: sakha
Cod País: RU
País: Rússia
*******************
Nome: pashto (Afeganistão)
Código da língua: ps
Língua: pashto
Cod País: AF
País: Afeganistão
*******************
Nome: quirguiz
Código da língua: ky
Língua: quirguiz
Cod País: 
País: 
*******************
Nome: massai
Código da língua: mas
Língua: massai
Cod País: 
País: 
*******************
Nome: bósnio (cirílico, Bósnia e Herzegovina)
Código da língua: bs
Língua: bósnio
Cod País: BA
País: Bósnia e Herzegovina
*******************
Nome: xhosa (latim, África do Sul)
Código da língua: xh
Língua: xhosa
Cod País: ZA
País: África do Sul
*******************
Nome: taita (latim, Quênia)
Código da língua: dav
Língua: taita
Cod País: KE
País: Quênia
*******************
Nome: eslovaco (Eslováquia)
Código da língua: sk
Língua: eslovaco
Cod País: SK
País: Eslováquia
*******************
Nome: xhosa
Código da língua: xh
Língua: xhosa
Cod País: 
País: 
*******************
Nome: koyra chiini (latim, Mali)
Código da língua: khq
Língua: koyra chiini
Cod País: ML
País: Mali
*******************
Nome: mazandarani (árabe, Irã)
Código da língua: mzn
Língua: mazandarani
Cod País: IR
País: Irã
*******************
Nome: mongol (cirílico, Mongólia)
Código da língua: mn
Língua: mongol
Cod País: MN
País: Mongólia
*******************
Nome: uolofe (Senegal)
Código da língua: wo
Língua: uolofe
Cod País: SN
País: Senegal
*******************
Nome: hauçá (latim, Nigéria)
Código da língua: ha
Língua: hauçá
Cod País: NG
País: Nigéria
*******************
Nome: francês (Haiti)
Código da língua: fr
Língua: francês
Cod País: HT
País: Haiti
*******************
Nome: russo (cirílico, Rússia)
Código da língua: ru
Língua: russo
Cod País: RU
País: Rússia
*******************
Nome: télugo (Índia)
Código da língua: te
Língua: télugo
Cod País: IN
País: Índia
*******************
Nome: massai (latim, Quênia)
Código da língua: mas
Língua: massai
Cod País: KE
País: Quênia
*******************
Nome: holandês (Sint Maarten)
Código da língua: nl
Língua: holandês
Cod País: SX
País: Sint Maarten
*******************
Nome: luri setentrional
Código da língua: lrc
Língua: luri setentrional
Cod País: 
País: 
*******************
Nome: checheno
Código da língua: ce
Língua: checheno
Cod País: 
País: 
*******************
Nome: francês (República do Congo)
Código da língua: fr
Língua: francês
Cod País: CG
País: República do Congo
*******************
Nome: manx (latim, Ilha de Man)
Código da língua: gv
Língua: manx
Cod País: IM
País: Ilha de Man
*******************
Nome: maltês (Malta)
Código da língua: mt
Língua: maltês
Cod País: MT
País: Malta
*******************
Nome: coreano
Código da língua: ko
Língua: coreano
Cod País: 
País: 
*******************
Nome: malaio (latim, Malásia)
Código da língua: ms
Língua: malaio
Cod País: MY
País: Malásia
*******************
Nome: malaiala (malaiala, Índia)
Código da língua: ml
Língua: malaiala
Cod País: IN
País: Índia
*******************
Nome: baixo alemão (Países Baixos)
Código da língua: nds
Língua: baixo alemão
Cod País: NL
País: Países Baixos
*******************
Nome: tamazirte marroqino padrão (tifinagh, Marrocos)
Código da língua: zgh
Língua: tamazirte marroqino padrão
Cod País: MA
País: Marrocos
*******************
Nome: akan
Código da língua: ak
Língua: akan
Cod País: 
País: 
*******************
Nome: maconde
Código da língua: kde
Língua: maconde
Cod País: 
País: 
*******************
Nome: dzonga
Código da língua: dz
Língua: dzonga
Cod País: 
País: 
*******************
Nome: nyankole (latim, Uganda)
Código da língua: nyn
Língua: nyankole
Cod País: UG
País: Uganda
*******************
Nome: inglês (Vanuatu)
Código da língua: en
Língua: inglês
Cod País: VU
País: Vanuatu
*******************
Nome: interlíngua
Código da língua: ia
Língua: interlíngua
Cod País: 
País: 
*******************
Nome: tonganês (Tonga)
Código da língua: to
Língua: tonganês
Cod País: TO
País: Tonga
*******************
Nome: fula (latim, Serra Leoa)
Código da língua: ff
Língua: fula
Cod País: SL
País: Serra Leoa
*******************
Nome: sena (Moçambique)
Código da língua: seh
Língua: sena
Cod País: MZ
País: Moçambique
*******************
Nome: lusoga (latim, Uganda)
Código da língua: xog
Língua: lusoga
Cod País: UG
País: Uganda
*******************
Nome: fula (Adlm, Senegal)
Código da língua: ff
Língua: fula
Cod País: SN
País: Senegal
*******************
Nome: vietnamita (latim, Vietnã)
Código da língua: vi
Língua: vietnamita
Cod País: VN
País: Vietnã
*******************
Nome: sundanês (Indonésia)
Código da língua: su
Língua: sundanês
Cod País: ID
País: Indonésia
*******************
Nome: nguemba (latim, Camarões)
Código da língua: jgo
Língua: nguemba
Cod País: CM
País: Camarões
*******************
Nome: sichuan yi (China)
Código da língua: ii
Língua: sichuan yi
Cod País: CN
País: China
*******************
Nome: panjabi (árabe, Paquistão)
Código da língua: pa
Língua: panjabi
Cod País: PK
País: Paquistão
*******************
Nome: francês (Reunião)
Código da língua: fr
Língua: francês
Cod País: RE
País: Reunião
*******************
Nome: bengali (Índia)
Código da língua: bn
Língua: bengali
Cod País: IN
País: Índia
*******************
Nome: francês (Guadalupe)
Código da língua: fr
Língua: francês
Cod País: GP
País: Guadalupe
*******************
Nome: panjabi
Código da língua: pa
Língua: panjabi
Cod País: 
País: 
*******************
Nome: tamazirte marroqino padrão (Marrocos)
Código da língua: zgh
Língua: tamazirte marroqino padrão
Cod País: MA
País: Marrocos
*******************
Nome: ucraniano (Ucrânia)
Código da língua: uk
Língua: ucraniano
Cod País: UA
País: Ucrânia
*******************
Nome: rwa
Código da língua: rwk
Língua: rwa
Cod País: 
País: 
*******************
Nome: rundi
Código da língua: rn
Língua: rundi
Cod País: 
País: 
*******************
Nome: tadjique
Código da língua: tg
Língua: tadjique
Cod País: 
País: 
*******************
Nome: húngaro
Código da língua: hu
Língua: húngaro
Cod País: 
País: 
*******************
Nome: francês (Suíça)
Código da língua: fr
Língua: francês
Cod País: CH
País: Suíça
*******************
Nome: luganda (latim, Uganda)
Código da língua: lg
Língua: luganda
Cod País: UG
País: Uganda
*******************
Nome: cebuano (latim, Filipinas)
Código da língua: ceb
Língua: cebuano
Cod País: PH
País: Filipinas
*******************
Nome: inglês (Ilha Norfolk)
Código da língua: en
Língua: inglês
Cod País: NF
País: Ilha Norfolk
*******************
Nome: tasawaq
Código da língua: twq
Língua: tasawaq
Cod País: 
País: 
*******************
Nome: sérvio (cirílico, Kosovo)
Código da língua: sr
Língua: sérvio
Cod País: XK
País: Kosovo
*******************
Nome: bambara
Código da língua: bm
Língua: bambara
Cod País: 
País: 
*******************
Nome: bokmål norueguês (latim, Noruega)
Código da língua: nb
Língua: bokmål norueguês
Cod País: NO
País: Noruega
*******************
Nome: árabe (Sudão do Sul)
Código da língua: ar
Língua: árabe
Cod País: SS
País: Sudão do Sul
*******************
Nome: inglês (Guam)
Código da língua: en
Língua: inglês
Cod País: GU
País: Guam
*******************
Nome: holandês (Aruba)
Código da língua: nl
Língua: holandês
Cod País: AW
País: Aruba
*******************
Nome: inglês (Anguila)
Código da língua: en
Língua: inglês
Cod País: AI
País: Anguila
*******************
Nome: frísio ocidental (latim, Países Baixos)
Código da língua: fy
Língua: frísio ocidental
Cod País: NL
País: Países Baixos
*******************
Nome: lusoga (Uganda)
Código da língua: xog
Língua: lusoga
Cod País: UG
País: Uganda
*******************
Nome: inglês (Camarões)
Código da língua: en
Língua: inglês
Cod País: CM
País: Camarões
*******************
Nome: tcheco (Tchéquia)
Código da língua: cs
Língua: tcheco
Cod País: CZ
País: Tchéquia
*******************
Nome: turco
Código da língua: tr
Língua: turco
Cod País: 
País: 
*******************
Nome: catalão (Espanha)
Código da língua: ca
Língua: catalão
Cod País: ES
País: Espanha
*******************
Nome: húngaro (latim, Hungria)
Código da língua: hu
Língua: húngaro
Cod País: HU
País: Hungria
*******************
Nome: romanche (Suíça)
Código da língua: rm
Língua: romanche
Cod País: CH
País: Suíça
*******************
Nome: russo (Moldávia)
Código da língua: ru
Língua: russo
Cod País: MD
País: Moldávia
*******************
Nome: fula (latim, Senegal)
Código da língua: ff
Língua: fula
Cod País: SN
País: Senegal
*******************
Nome: inglês (Tonga)
Código da língua: en
Língua: inglês
Cod País: TO
País: Tonga
*******************
Nome: fula (Adlm, Serra Leoa)
Código da língua: ff
Língua: fula
Cod País: SL
País: Serra Leoa
*******************
Nome: inglês (Papua-Nova Guiné)
Código da língua: en
Língua: inglês
Cod País: PG
País: Papua-Nova Guiné
*******************
Nome: estoniano (latim, Estônia)
Código da língua: et
Língua: estoniano
Cod País: EE
País: Estônia
*******************
Nome: francês (República Centro-Africana)
Código da língua: fr
Língua: francês
Cod País: CF
País: República Centro-Africana
*******************
Nome: português (Timor-Leste)
Código da língua: pt
Língua: português
Cod País: TL
País: Timor-Leste
*******************
Nome: inglês (Eritreia)
Código da língua: en
Língua: inglês
Cod País: ER
País: Eritreia
*******************
Nome: sérvio (Bósnia e Herzegovina)
Código da língua: sr
Língua: sérvio
Cod País: BA
País: Bósnia e Herzegovina
*******************
Nome: espanhol (Paraguai)
Código da língua: es
Língua: espanhol
Cod País: PY
País: Paraguai
*******************
Nome: concani (Índia)
Código da língua: kok
Língua: concani
Cod País: IN
País: Índia
*******************
Nome: bielorrusso (cirílico, Bielorrússia)
Código da língua: be
Língua: bielorrusso
Cod País: BY
País: Bielorrússia
*******************
Nome: francês (Togo)
Código da língua: fr
Língua: francês
Cod País: TG
País: Togo
*******************
Nome: dzonga (tibetano, Butão)
Código da língua: dz
Língua: dzonga
Cod País: BT
País: Butão
*******************
Nome: sérvio (latim, Kosovo)
Código da língua: sr
Língua: sérvio
Cod País: XK
País: Kosovo
*******************
Nome: inglês (Filipinas)
Código da língua: en
Língua: inglês
Cod País: PH
País: Filipinas
*******************
Nome: igbo (Nigéria)
Código da língua: ig
Língua: igbo
Cod País: NG
País: Nigéria
*******************
Nome: francês (Guiné)
Código da língua: fr
Língua: francês
Cod País: GN
País: Guiné
*******************
Nome: gaélico escocês (latim, Reino Unido)
Código da língua: gd
Língua: gaélico escocês
Cod País: GB
País: Reino Unido
*******************
Nome: chinês (simplificado, Macau, RAE da China)
Código da língua: zh
Língua: chinês
Cod País: MO
País: Macau, RAE da China
*******************
Nome: santali (ol chiki)
Código da língua: sat
Língua: santali
Cod País: 
País: 
*******************
Nome: sami setentrional (Finlândia)
Código da língua: se
Língua: sami setentrional
Cod País: FI
País: Finlândia
*******************
Nome: fula
Código da língua: ff
Língua: fula
Cod País: 
País: 
*******************
Nome: inglês (Ilhas Cook)
Código da língua: en
Língua: inglês
Cod País: CK
País: Ilhas Cook
*******************
Nome: árabe (Marrocos)
Código da língua: ar
Língua: árabe
Cod País: MA
País: Marrocos
*******************
Nome: havaiano (latim, Estados Unidos)
Código da língua: haw
Língua: havaiano
Cod País: US
País: Estados Unidos
*******************
Nome: inglês (Antígua e Barbuda)
Código da língua: en
Língua: inglês
Cod País: AG
País: Antígua e Barbuda
*******************
Nome: francês (Chade)
Código da língua: fr
Língua: francês
Cod País: TD
País: Chade
*******************
Nome: embu (Quênia)
Código da língua: ebu
Língua: embu
Cod País: KE
País: Quênia
*******************
Nome: lituano (latim, Lituânia)
Código da língua: lt
Língua: lituano
Cod País: LT
País: Lituânia
*******************
Nome: bemba (Zâmbia)
Código da língua: bem
Língua: bemba
Cod País: ZM
País: Zâmbia
*******************
Nome: ewondo (latim, Camarões)
Código da língua: ewo
Língua: ewondo
Cod País: CM
País: Camarões
*******************
Nome: lusoga
Código da língua: xog
Língua: lusoga
Cod País: 
País: 
*******************
Nome: ewondo (Camarões)
Código da língua: ewo
Língua: ewondo
Cod País: CM
País: Camarões
*******************
Nome: francês (Congo - Kinshasa)
Código da língua: fr
Língua: francês
Cod País: CD
País: Congo - Kinshasa
*******************
Nome: rundi (Burundi)
Código da língua: rn
Língua: rundi
Cod País: BI
País: Burundi
*******************
Nome: inglês (Namíbia)
Código da língua: en
Língua: inglês
Cod País: NA
País: Namíbia
*******************
Nome: meta’ (latim, Camarões)
Código da língua: mgo
Língua: meta’
Cod País: CM
País: Camarões
*******************
Nome: malaio
Código da língua: ms
Língua: malaio
Cod País: 
País: 
*******************
Nome: uigur
Código da língua: ug
Língua: uigur
Cod País: 
País: 
*******************
Nome: catalão (Itália)
Código da língua: ca
Língua: catalão
Cod País: IT
País: Itália
*******************
Nome: quíchua (latim, Peru)
Código da língua: qu
Língua: quíchua
Cod País: PE
País: Peru
*******************
Nome: langi (Tanzânia)
Código da língua: lag
Língua: langi
Cod País: TZ
País: Tanzânia
*******************
Nome: indonésio (Indonésia)
Código da língua: id
Língua: indonésio
Cod País: ID
País: Indonésia
*******************
Nome: teso (Quênia)
Código da língua: teo
Língua: teso
Cod País: KE
País: Quênia
*******************
Nome: catalão (Andorra)
Código da língua: ca
Língua: catalão
Cod País: AD
País: Andorra
*******************
Nome: quíchua (Bolívia)
Código da língua: qu
Língua: quíchua
Cod País: BO
País: Bolívia
*******************
Nome: havaiano (Estados Unidos)
Código da língua: haw
Língua: havaiano
Cod País: US
País: Estados Unidos
*******************
Nome: vietnamita
Código da língua: vi
Língua: vietnamita
Cod País: 
País: 
*******************
Nome: francês (Canadá)
Código da língua: fr
Língua: francês
Cod País: CA
País: Canadá
*******************
Nome: crioulo cabo-verdiano (latim, Cabo Verde)
Código da língua: kea
Língua: crioulo cabo-verdiano
Cod País: CV
País: Cabo Verde
*******************
Nome: albanês (Kosovo)
Código da língua: sq
Língua: albanês
Cod País: XK
País: Kosovo
*******************
Nome: jola-fonyi
Código da língua: dyo
Língua: jola-fonyi
Cod País: 
País: 
*******************
Nome: maori (latim, Nova Zelândia)
Código da língua: mi
Língua: maori
Cod País: NZ
País: Nova Zelândia
*******************
Nome: inglês (Ilhas Cayman)
Código da língua: en
Língua: inglês
Cod País: KY
País: Ilhas Cayman
*******************
Nome: italiano (Suíça)
Código da língua: it
Língua: italiano
Cod País: CH
País: Suíça
*******************
Nome: cingalês (Sri Lanka)
Código da língua: si
Língua: cingalês
Cod País: LK
País: Sri Lanka
*******************
Nome: luo (Quênia)
Código da língua: luo
Língua: luo
Cod País: KE
País: Quênia
*******************
Nome: inglês (Emirados Árabes Unidos)
Código da língua: en
Língua: inglês
Cod País: AE
País: Emirados Árabes Unidos
*******************
Nome: italiano (Itália)
Código da língua: it
Língua: italiano
Cod País: IT
País: Itália
*******************
Nome: esperanto
Código da língua: eo
Língua: esperanto
Cod País: 
País: 
*******************
Nome: árabe (Somália)
Código da língua: ar
Língua: árabe
Cod País: SO
País: Somália
*******************
Nome: inglês (Zimbábue)
Código da língua: en
Língua: inglês
Cod País: ZW
País: Zimbábue
*******************
Nome: nynorsk norueguês (Noruega)
Código da língua: nn
Língua: nynorsk norueguês
Cod País: NO
País: Noruega
*******************
Nome: francês (Maurício)
Código da língua: fr
Língua: francês
Cod País: MU
País: Maurício
*******************
Nome: polonês
Código da língua: pl
Língua: polonês
Cod País: 
País: 
*******************
Nome: sami setentrional (Suécia)
Código da língua: se
Língua: sami setentrional
Cod País: SE
País: Suécia
*******************
Nome: inglês (Tokelau)
Código da língua: en
Língua: inglês
Cod País: TK
País: Tokelau
*******************
Nome: mundang (Camarões)
Código da língua: mua
Língua: mundang
Cod País: CM
País: Camarões
*******************
Nome: urdu
Código da língua: ur
Língua: urdu
Cod País: 
País: 
*******************
Nome: uzbeque (árabe)
Código da língua: uz
Língua: uzbeque
Cod País: 
País: 
*******************
Nome: samburu (Quênia)
Código da língua: saq
Língua: samburu
Cod País: KE
País: Quênia
*******************
Nome: português (Guiné-Bissau)
Código da língua: pt
Língua: português
Cod País: GW
País: Guiné-Bissau
*******************
Nome: sami setentrional
Código da língua: se
Língua: sami setentrional
Cod País: 
País: 
*******************
Nome: xona (latim, Zimbábue)
Código da língua: sn
Língua: xona
Cod País: ZW
País: Zimbábue
*******************
Nome: malaio (Singapura)
Código da língua: ms
Língua: malaio
Cod País: SG
País: Singapura
*******************
Nome: ewe (Togo)
Código da língua: ee
Língua: ewe
Cod País: TG
País: Togo
*******************
Nome: lingala (Angola)
Código da língua: ln
Língua: lingala
Cod País: AO
País: Angola
*******************
Nome: bielorrusso (Bielorrússia)
Código da língua: be
Língua: bielorrusso
Cod País: BY
País: Bielorrússia
*******************
Nome: cantonês (tradicional)
Código da língua: yue
Língua: cantonês
Cod País: 
País: 
*******************
Nome: khmer (khmer, Camboja)
Código da língua: km
Língua: khmer
Cod País: KH
País: Camboja
*******************
Nome: italiano (latim, Itália)
Código da língua: it
Língua: italiano
Cod País: IT
País: Itália
*******************
Nome: luyia
Código da língua: luy
Língua: luyia
Cod País: 
País: 
*******************
Nome: português (Cabo Verde)
Código da língua: pt
Língua: português
Cod País: CV
País: Cabo Verde
*******************
Nome: ucraniano
Código da língua: uk
Língua: ucraniano
Cod País: 
País: 
*******************
Nome: espanhol (Porto Rico)
Código da língua: es
Língua: espanhol
Cod País: PR
País: Porto Rico
*******************
Nome: mazandarani
Código da língua: mzn
Língua: mazandarani
Cod País: 
País: 
*******************
Nome: walser (Suíça)
Código da língua: wae
Língua: walser
Cod País: CH
País: Suíça
*******************
Nome: tártaro
Código da língua: tt
Língua: tártaro
Cod País: 
País: 
*******************
Nome: russo (Bielorrússia)
Código da língua: ru
Língua: russo
Cod País: BY
País: Bielorrússia
*******************
Nome: feroês (Dinamarca)
Código da língua: fo
Língua: feroês
Cod País: DK
País: Dinamarca
*******************
Nome: ewe (Gana)
Código da língua: ee
Língua: ewe
Cod País: GH
País: Gana
*******************
Nome: árabe (Barein)
Código da língua: ar
Língua: árabe
Cod País: BH
País: Barein
*******************
Nome: cazaque (cirílico, Cazaquistão)
Código da língua: kk
Língua: cazaque
Cod País: KZ
País: Cazaquistão
*******************
Nome: uigur (árabe, China)
Código da língua: ug
Língua: uigur
Cod País: CN
País: China
*******************
Nome: híndi (Índia)
Código da língua: hi
Língua: híndi
Cod País: IN
País: Índia
*******************
Nome: inglês (Suíça)
Código da língua: en
Língua: inglês
Cod País: CH
País: Suíça
*******************
Nome: samburu (latim, Quênia)
Código da língua: saq
Língua: samburu
Cod País: KE
País: Quênia
*******************
Nome: asu
Código da língua: asa
Língua: asu
Cod País: 
País: 
*******************
Nome: feroês (Ilhas Faroé)
Código da língua: fo
Língua: feroês
Cod País: FO
País: Ilhas Faroé
*******************
Nome: iorubá (Benin)
Código da língua: yo
Língua: iorubá
Cod País: BJ
País: Benin
*******************
Nome: asturiano (Espanha)
Código da língua: ast
Língua: asturiano
Cod País: ES
País: Espanha
*******************
Nome: francês (Comores)
Código da língua: fr
Língua: francês
Cod País: KM
País: Comores
*******************
Nome: francês (Martinica)
Código da língua: fr
Língua: francês
Cod País: MQ
País: Martinica
*******************
Nome: espanhol (Argentina)
Código da língua: es
Língua: espanhol
Cod País: AR
País: Argentina
*******************
Nome: fula (latim)
Código da língua: ff
Língua: fula
Cod País: 
País: 
*******************
Nome: dogri (devanágari, Índia)
Código da língua: doi
Língua: dogri
Cod País: IN
País: Índia
*******************
Nome: inglês (Malásia)
Código da língua: en
Língua: inglês
Cod País: MY
País: Malásia
*******************
Nome: sangu (Tanzânia)
Código da língua: sbp
Língua: sangu
Cod País: TZ
País: Tanzânia
*******************
Nome: embu (latim, Quênia)
Código da língua: ebu
Língua: embu
Cod País: KE
País: Quênia
*******************
Nome: uzbeque (cirílico)
Código da língua: uz
Língua: uzbeque
Cod País: 
País: 
*******************
Nome: filipino
Código da língua: fil
Língua: filipino
Cod País: 
País: 
*******************
Nome: cantonês (tradicional, Hong Kong, RAE da China)
Código da língua: yue
Língua: cantonês
Cod País: HK
País: Hong Kong, RAE da China
*******************
Nome: armênio (Armênia)
Código da língua: hy
Língua: armênio
Cod País: AM
País: Armênia
*******************
Nome: inglês (Gâmbia)
Código da língua: en
Língua: inglês
Cod País: GM
País: Gâmbia
*******************
Nome: feroês
Código da língua: fo
Língua: feroês
Cod País: 
País: 
*******************
Nome: shambala (latim, Tanzânia)
Código da língua: ksb
Língua: shambala
Cod País: TZ
País: Tanzânia
*******************
Nome: nepalês (Nepal)
Código da língua: ne
Língua: nepalês
Cod País: NP
País: Nepal
*******************
Nome: friulano (Itália)
Código da língua: fur
Língua: friulano
Cod País: IT
País: Itália
*******************
Nome: tâmil (Índia)
Código da língua: ta
Língua: tâmil
Cod País: IN
País: Índia
*******************
Nome: francês (Guiana Francesa)
Código da língua: fr
Língua: francês
Cod País: GF
País: Guiana Francesa
*******************
Nome: lacota
Código da língua: lkt
Língua: lacota
Cod País: 
País: 
*******************
Nome: indonésio (latim, Indonésia)
Código da língua: id
Língua: indonésio
Cod País: ID
País: Indonésia
*******************
Nome: islandês
Código da língua: is
Língua: islandês
Cod País: 
País: 
*******************
Nome: português (Angola)
Código da língua: pt
Língua: português
Cod País: AO
País: Angola
*******************
Nome: télugo (télugo, Índia)
Código da língua: te
Língua: télugo
Cod País: IN
País: Índia
*******************
Nome: cingalês
Código da língua: si
Língua: cingalês
Cod País: 
País: 
*******************
Nome: inglês (Mundo)
Código da língua: en
Língua: inglês
Cod País: 001
País: Mundo
*******************
Nome: duala (latim, Camarões)
Código da língua: dua
Língua: duala
Cod País: CM
País: Camarões
*******************
Nome: javanês (Indonésia)
Código da língua: jv
Língua: javanês
Cod País: ID
País: Indonésia
*******************
Nome: langi (latim, Tanzânia)
Código da língua: lag
Língua: langi
Cod País: TZ
País: Tanzânia
*******************
Nome: russo (Quirguistão)
Código da língua: ru
Língua: russo
Cod País: KG
País: Quirguistão
*******************
Nome: francês (Mauritânia)
Código da língua: fr
Língua: francês
Cod País: MR
País: Mauritânia
*******************
Nome: bafia (latim, Camarões)
Código da língua: ksf
Língua: bafia
Cod País: CM
País: Camarões
*******************
Nome: caxemira
Código da língua: ks
Língua: caxemira
Cod País: 
País: 
*******************
Nome: chinês (tradicional, Taiwan)
Código da língua: zh
Língua: chinês
Cod País: TW
País: Taiwan
*******************
Nome: fula (latim, Burquina Faso)
Código da língua: ff
Língua: fula
Cod País: BF
País: Burquina Faso
*******************
Nome: assamês (Índia)
Código da língua: as
Língua: assamês
Cod País: IN
País: Índia
*******************
Nome: chinês (Hong Kong, RAE da China)
Código da língua: zh
Língua: chinês
Cod País: HK
País: Hong Kong, RAE da China
*******************
Nome: suaíli (Quênia)
Código da língua: sw
Língua: suaíli
Cod País: KE
País: Quênia
*******************
Nome: tailandês (Tailândia)
Código da língua: th
Língua: tailandês
Cod País: TH
País: Tailândia
*******************
Nome: assamês (bengali, Índia)
Código da língua: as
Língua: assamês
Cod País: IN
País: Índia
*******************
Nome: machame
Código da língua: jmc
Língua: machame
Cod País: 
País: 
*******************
Nome: cantonês
Código da língua: yue
Língua: cantonês
Cod País: 
País: 
*******************
Nome: inglês (Malaui)
Código da língua: en
Língua: inglês
Cod País: MW
País: Malaui
*******************
Nome: nama (Namíbia)
Código da língua: naq
Língua: nama
Cod País: NA
País: Namíbia
*******************
Nome: inglês (Território Britânico do Oceano Índico)
Código da língua: en
Língua: inglês
Cod País: IO
País: Território Britânico do Oceano Índico
*******************
Nome: árabe (Catar)
Código da língua: ar
Língua: árabe
Cod País: QA
País: Catar
*******************
Nome: árabe (árabe, Egito)
Código da língua: ar
Língua: árabe
Cod País: EG
País: Egito
*******************
Nome: inglês (Ilhas Cocos (Keeling))
Código da língua: en
Língua: inglês
Cod País: CC
País: Ilhas Cocos (Keeling)
*******************
Nome: português (Portugal)
Código da língua: pt
Língua: português
Cod País: PT
País: Portugal
*******************
Nome: eslovaco (latim, Eslováquia)
Código da língua: sk
Língua: eslovaco
Cod País: SK
País: Eslováquia
*******************
Nome: azerbaijano (cirílico, Azerbaijão)
Código da língua: az
Língua: azerbaijano
Cod País: AZ
País: Azerbaijão
*******************
Nome: curdo central (Iraque)
Código da língua: ckb
Língua: curdo central
Cod País: IQ
País: Iraque
*******************
Nome: tachelhit (latim, Marrocos)
Código da língua: shi
Língua: tachelhit
Cod País: MA
País: Marrocos
*******************
Nome: espanhol (Cuba)
Código da língua: es
Língua: espanhol
Cod País: CU
País: Cuba
*******************
Nome: árabe
Código da língua: ar
Língua: árabe
Cod País: 
País: 
*******************
Nome: inglês (Ilhas Virgens Americanas)
Código da língua: en
Língua: inglês
Cod País: VI
País: Ilhas Virgens Americanas
*******************
Nome: havaiano
Código da língua: haw
Língua: havaiano
Cod País: 
País: 
*******************
Nome: basco (Espanha)
Código da língua: eu
Língua: basco
Cod País: ES
País: Espanha
*******************
Nome: basa
Código da língua: bas
Língua: basa
Cod País: 
País: 
*******************
Nome: igbo (latim, Nigéria)
Código da língua: ig
Língua: igbo
Cod País: NG
País: Nigéria
*******************
Nome: grego (Grécia)
Código da língua: el
Língua: grego
Cod País: GR
País: Grécia
*******************
Nome: uzbeque (latim)
Código da língua: uz
Língua: uzbeque
Cod País: 
País: 
*******************
Nome: yangben (Camarões)
Código da língua: yav
Língua: yangben
Cod País: CM
País: Camarões
*******************
Nome: sango
Código da língua: sg
Língua: sango
Cod País: 
País: 
*******************
Nome: dinamarquês (Groenlândia)
Código da língua: da
Língua: dinamarquês
Cod País: GL
País: Groenlândia
*******************
Nome: khmer (Camboja)
Código da língua: km
Língua: khmer
Cod País: KH
País: Camboja
*******************
Nome: curdo central (Irã)
Código da língua: ckb
Língua: curdo central
Cod País: IR
País: Irã
*******************
Nome: holandês
Código da língua: nl
Língua: holandês
Cod País: 
País: 
*******************
Nome: caxemira (árabe, Índia)
Código da língua: ks
Língua: caxemira
Cod País: IN
País: Índia
*******************
Nome: catalão (Espanha, valenciano)
Código da língua: ca
Língua: catalão
Cod País: ES
País: Espanha
*******************
Nome: uolofe (latim, Senegal)
Código da língua: wo
Língua: uolofe
Cod País: SN
País: Senegal
*******************
Nome: sindi (devanágari, Índia)
Código da língua: sd
Língua: sindi
Cod País: IN
País: Índia
*******************
Nome: marati (devanágari, Índia)
Código da língua: mr
Língua: marati
Cod País: IN
País: Índia
*******************
Nome: espanhol (Costa Rica)
Código da língua: es
Língua: espanhol
Cod País: CR
País: Costa Rica
*******************
Nome: francês (Gabão)
Código da língua: fr
Língua: francês
Cod País: GA
País: Gabão
*******************
Nome: sérvio
Código da língua: sr
Língua: sérvio
Cod País: 
País: 
*******************
Nome: árabe (Líbia)
Código da língua: ar
Língua: árabe
Cod País: LY
País: Líbia
*******************
Nome: inglês (Maurício)
Código da língua: en
Língua: inglês
Cod País: MU
País: Maurício
*******************
Nome: galego (Espanha)
Código da língua: gl
Língua: galego
Cod País: ES
País: Espanha
*******************
Nome: azerbaijano (latim, Azerbaijão)
Código da língua: az
Língua: azerbaijano
Cod País: AZ
País: Azerbaijão
*******************
Nome: inglês (Ilha de Man)
Código da língua: en
Língua: inglês
Cod País: IM
País: Ilha de Man
*******************
Nome: alemão (Suíça) (latim, Suíça)
Código da língua: gsw
Língua: alemão (Suíça)
Cod País: CH
País: Suíça
*******************
Nome: sena (latim, Moçambique)
Código da língua: seh
Língua: sena
Cod País: MZ
País: Moçambique
*******************
Nome: inglês (Gibraltar)
Código da língua: en
Língua: inglês
Cod País: GI
País: Gibraltar
*******************
Nome: inglês (Canadá)
Código da língua: en
Língua: inglês
Cod País: CA
País: Canadá
*******************
Nome: gaélico escocês
Código da língua: gd
Língua: gaélico escocês
Cod País: 
País: 
*******************
Nome: cheroqui (cherokee, Estados Unidos)
Código da língua: chr
Língua: cheroqui
Cod País: US
País: Estados Unidos
*******************
Nome: francês (Síria)
Código da língua: fr
Língua: francês
Cod País: SY
País: Síria
*******************
Nome: oriá (oriá, Índia)
Código da língua: or
Língua: oriá
Cod País: IN
País: Índia
*******************
Nome: somali (Etiópia)
Código da língua: so
Língua: somali
Cod País: ET
País: Etiópia
*******************
Nome: catalão (latim, Espanha)
Código da língua: ca
Língua: catalão
Cod País: ES
País: Espanha
*******************
Nome: holandês (Bélgica)
Código da língua: nl
Língua: holandês
Cod País: BE
País: Bélgica
*******************
Nome: árabe (Djibuti)
Código da língua: ar
Língua: árabe
Cod País: DJ
País: Djibuti
*******************
Nome: jola-fonyi (latim, Senegal)
Código da língua: dyo
Língua: jola-fonyi
Cod País: SN
País: Senegal
*******************
Nome: galês (Reino Unido)
Código da língua: cy
Língua: galês
Cod País: GB
País: Reino Unido
*******************
Nome: inglês (Ilhas Virgens Britânicas)
Código da língua: en
Língua: inglês
Cod País: VG
País: Ilhas Virgens Britânicas
*******************
Nome: inglês (Ilhas Turcas e Caicos)
Código da língua: en
Língua: inglês
Cod País: TC
País: Ilhas Turcas e Caicos
*******************
Nome: sueco (Ilhas Aland)
Código da língua: sv
Língua: sueco
Cod País: AX
País: Ilhas Aland
*******************
Nome: tcheco (latim, Tchéquia)
Código da língua: cs
Língua: tcheco
Cod País: CZ
País: Tchéquia
*******************
Nome: africâner (Namíbia)
Código da língua: af
Língua: africâner
Cod País: NA
País: Namíbia
*******************
Nome: vunjo
Código da língua: vun
Língua: vunjo
Cod País: 
País: 
*******************
Nome: inglês (Índia)
Código da língua: en
Língua: inglês
Cod País: IN
País: Índia
*******************
Nome: luba-catanga
Código da língua: lu
Língua: luba-catanga
Cod País: 
País: 
*******************
Nome: iorubá
Código da língua: yo
Língua: iorubá
Cod País: 
País: 
*******************
Nome: espanhol (Nicarágua)
Código da língua: es
Língua: espanhol
Cod País: NI
País: Nicarágua
*******************
Nome: sichuan yi (yi, China)
Código da língua: ii
Língua: sichuan yi
Cod País: CN
País: China
*******************
Nome: sindi (Paquistão)
Código da língua: sd
Língua: sindi
Cod País: PK
País: Paquistão
*******************
Nome: massai (Tanzânia)
Código da língua: mas
Língua: massai
Cod País: TZ
País: Tanzânia
*******************
Nome: tigrínia
Código da língua: ti
Língua: tigrínia
Cod País: 
País: 
*******************
Nome: malaio (Brunei)
Código da língua: ms
Língua: malaio
Cod País: BN
País: Brunei
*******************
Nome: chakma (Índia)
Código da língua: ccp
Língua: chakma
Cod País: IN
País: Índia
*******************
Nome: bretão (França)
Código da língua: br
Língua: bretão
Cod País: FR
País: França
*******************
pt_BRAZIL
pt_BRAZIL
¤ 5.000.000.000,00
$5,000,000,000.00
5.000.000.000,00 €
*/