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
			System.out.println("C�digo da l�ngua: " + loc.getLanguage());
			System.out.println("L�ngua: " + loc.getDisplayLanguage());
			System.out.println("Cod Pa�s: " + loc.getCountry());
			System.out.println("Pa�s: " + loc.getDisplayCountry());
			
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
C�digo da l�ngua: yue
L�ngua: canton�s
Cod Pa�s: CN
Pa�s: China
*******************
Nome: romanche (latim, Su��a)
C�digo da l�ngua: rm
L�ngua: romanche
Cod Pa�s: CH
Pa�s: Su��a
*******************
Nome: ingl�s (Samoa)
C�digo da l�ngua: en
L�ngua: ingl�s
Cod Pa�s: WS
Pa�s: Samoa
*******************
Nome: franc�s (Luxemburgo)
C�digo da l�ngua: fr
L�ngua: franc�s
Cod Pa�s: LU
Pa�s: Luxemburgo
*******************
Nome: somali
C�digo da l�ngua: so
L�ngua: somali
Cod Pa�s: 
Pa�s: 
*******************
Nome: maori (Nova Zel�ndia)
C�digo da l�ngua: mi
L�ngua: maori
Cod Pa�s: NZ
Pa�s: Nova Zel�ndia
*******************
Nome: �rabe (Eritreia)
C�digo da l�ngua: ar
L�ngua: �rabe
Cod Pa�s: ER
Pa�s: Eritreia
*******************
Nome: kabyle
C�digo da l�ngua: kab
L�ngua: kabyle
Cod Pa�s: 
Pa�s: 
*******************
Nome: nuer
C�digo da l�ngua: nus
L�ngua: nuer
Cod Pa�s: 
Pa�s: 
*******************
Nome: xona (Zimb�bue)
C�digo da l�ngua: sn
L�ngua: xona
Cod Pa�s: ZW
Pa�s: Zimb�bue
*******************
Nome: espanhol (Ceuta e Melilla)
C�digo da l�ngua: es
L�ngua: espanhol
Cod Pa�s: EA
Pa�s: Ceuta e Melilla
*******************
Nome: irland�s (Reino Unido)
C�digo da l�ngua: ga
L�ngua: irland�s
Cod Pa�s: GB
Pa�s: Reino Unido
*******************
Nome: tailand�s (Tail�ndia, TH, Algarismos tailandeses)
C�digo da l�ngua: th
L�ngua: tailand�s
Cod Pa�s: TH
Pa�s: Tail�ndia
*******************
Nome: h�ndi
C�digo da l�ngua: hi
L�ngua: h�ndi
Cod Pa�s: 
Pa�s: 
*******************
Nome: franc�s (Seicheles)
C�digo da l�ngua: fr
L�ngua: franc�s
Cod Pa�s: SC
Pa�s: Seicheles
*******************
Nome: ingl�s (Serra Leoa)
C�digo da l�ngua: en
L�ngua: ingl�s
Cod Pa�s: SL
Pa�s: Serra Leoa
*******************
Nome: fula (latim, Nig�ria)
C�digo da l�ngua: ff
L�ngua: fula
Cod Pa�s: NG
Pa�s: Nig�ria
*******************
Nome: noruegu�s (Noruega)
C�digo da l�ngua: no
L�ngua: noruegu�s
Cod Pa�s: NO
Pa�s: Noruega
*******************
Nome: fula (Adlm, Nig�ria)
C�digo da l�ngua: ff
L�ngua: fula
Cod Pa�s: NG
Pa�s: Nig�ria
*******************
Nome: chin�s (tradicional, Macau, RAE da China)
C�digo da l�ngua: zh
L�ngua: chin�s
Cod Pa�s: MO
Pa�s: Macau, RAE da China
*******************
Nome: ingl�s (Santa Helena)
C�digo da l�ngua: en
L�ngua: ingl�s
Cod Pa�s: SH
Pa�s: Santa Helena
*******************
Nome: vai
C�digo da l�ngua: vai
L�ngua: vai
Cod Pa�s: 
Pa�s: 
*******************
Nome: sindi (�rabe, Paquist�o)
C�digo da l�ngua: sd
L�ngua: sindi
Cod Pa�s: PK
Pa�s: Paquist�o
*******************
Nome: alem�o (Luxemburgo)
C�digo da l�ngua: de
L�ngua: alem�o
Cod Pa�s: LU
Pa�s: Luxemburgo
*******************
Nome: maori
C�digo da l�ngua: mi
L�ngua: maori
Cod Pa�s: 
Pa�s: 
*******************
Nome: malt�s
C�digo da l�ngua: mt
L�ngua: malt�s
Cod Pa�s: 
Pa�s: 
*******************
Nome: alem�o (Alemanha)
C�digo da l�ngua: de
L�ngua: alem�o
Cod Pa�s: DE
Pa�s: Alemanha
*******************
Nome: nynorsk noruegu�s (latim, Noruega)
C�digo da l�ngua: nn
L�ngua: nynorsk noruegu�s
Cod Pa�s: NO
Pa�s: Noruega
*******************
Nome: ingl�s (Dinamarca)
C�digo da l�ngua: en
L�ngua: ingl�s
Cod Pa�s: DK
Pa�s: Dinamarca
*******************
Nome: yangben
C�digo da l�ngua: yav
L�ngua: yangben
Cod Pa�s: 
Pa�s: 
*******************
Nome: somali (Djibuti)
C�digo da l�ngua: so
L�ngua: somali
Cod Pa�s: DJ
Pa�s: Djibuti
*******************
Nome: lituano (Litu�nia)
C�digo da l�ngua: lt
L�ngua: lituano
Cod Pa�s: LT
Pa�s: Litu�nia
*******************
Nome: kamba
C�digo da l�ngua: kam
L�ngua: kamba
Cod Pa�s: 
Pa�s: 
*******************
Nome: romeno
C�digo da l�ngua: ro
L�ngua: romeno
Cod Pa�s: 
Pa�s: 
*******************
Nome: esperanto (Mundo)
C�digo da l�ngua: eo
L�ngua: esperanto
Cod Pa�s: 001
Pa�s: Mundo
*******************
Nome: pashto (Paquist�o)
C�digo da l�ngua: ps
L�ngua: pashto
Cod Pa�s: PK
Pa�s: Paquist�o
*******************
Nome: ewe
C�digo da l�ngua: ee
L�ngua: ewe
Cod Pa�s: 
Pa�s: 
*******************
Nome: ingl�s (Ilhas Menores Distantes dos EUA)
C�digo da l�ngua: en
L�ngua: ingl�s
Cod Pa�s: UM
Pa�s: Ilhas Menores Distantes dos EUA
*******************
Nome: ingl�s (Eslov�nia)
C�digo da l�ngua: en
L�ngua: ingl�s
Cod Pa�s: SI
Pa�s: Eslov�nia
*******************
Nome: vai (vai, Lib�ria)
C�digo da l�ngua: vai
L�ngua: vai
Cod Pa�s: LR
Pa�s: Lib�ria
*******************
Nome: laosiano (Laos)
C�digo da l�ngua: lo
L�ngua: laosiano
Cod Pa�s: LA
Pa�s: Laos
*******************
Nome: cheroqui
C�digo da l�ngua: chr
L�ngua: cheroqui
Cod Pa�s: 
Pa�s: 
*******************
Nome: rombo (latim, Tanz�nia)
C�digo da l�ngua: rof
L�ngua: rombo
Cod Pa�s: TZ
Pa�s: Tanz�nia
*******************
Nome: �rabe (L�bano)
C�digo da l�ngua: ar
L�ngua: �rabe
Cod Pa�s: LB
Pa�s: L�bano
*******************
Nome: luri setentrional (�rabe, Ir�)
C�digo da l�ngua: lrc
L�ngua: luri setentrional
Cod Pa�s: IR
Pa�s: Ir�
*******************
Nome: afric�ner (�frica do Sul)
C�digo da l�ngua: af
L�ngua: afric�ner
Cod Pa�s: ZA
Pa�s: �frica do Sul
*******************
Nome: dogri
C�digo da l�ngua: doi
L�ngua: dogri
Cod Pa�s: 
Pa�s: 
*******************
Nome: fula (Guin�)
C�digo da l�ngua: ff
L�ngua: fula
Cod Pa�s: GN
Pa�s: Guin�
*******************
Nome: k�lsch (latim, Alemanha)
C�digo da l�ngua: ksh
L�ngua: k�lsch
Cod Pa�s: DE
Pa�s: Alemanha
*******************
Nome: espanhol (Belize)
C�digo da l�ngua: es
L�ngua: espanhol
Cod Pa�s: BZ
Pa�s: Belize
*******************
Nome: �rabe (Emirados �rabes Unidos)
C�digo da l�ngua: ar
L�ngua: �rabe
Cod Pa�s: AE
Pa�s: Emirados �rabes Unidos
*******************
Nome: esperanto (latim, Mundo)
C�digo da l�ngua: eo
L�ngua: esperanto
Cod Pa�s: 001
Pa�s: Mundo
*******************
Nome: croata (Cro�cia)
C�digo da l�ngua: hr
L�ngua: croata
Cod Pa�s: HR
Pa�s: Cro�cia
*******************
Nome: rombo (Tanz�nia)
C�digo da l�ngua: rof
L�ngua: rombo
Cod Pa�s: TZ
Pa�s: Tanz�nia
*******************
Nome: assam�s
C�digo da l�ngua: as
L�ngua: assam�s
Cod Pa�s: 
Pa�s: 
*******************
Nome: italiano
C�digo da l�ngua: it
L�ngua: italiano
Cod Pa�s: 
Pa�s: 
*******************
Nome: caxemira (�ndia)
C�digo da l�ngua: ks
L�ngua: caxemira
Cod Pa�s: IN
Pa�s: �ndia
*******************
Nome: birman�s (Mianmar (Birm�nia))
C�digo da l�ngua: my
L�ngua: birman�s
Cod Pa�s: MM
Pa�s: Mianmar (Birm�nia)
*******************
Nome: mongol (Mong�lia)
C�digo da l�ngua: mn
L�ngua: mongol
Cod Pa�s: MN
Pa�s: Mong�lia
*******************
Nome: urdu (Paquist�o)
C�digo da l�ngua: ur
L�ngua: urdu
Cod Pa�s: PK
Pa�s: Paquist�o
*******************
Nome: dinamarqu�s (Dinamarca)
C�digo da l�ngua: da
L�ngua: dinamarqu�s
Cod Pa�s: DK
Pa�s: Dinamarca
*******************
Nome: ingl�s (Micron�sia)
C�digo da l�ngua: en
L�ngua: ingl�s
Cod Pa�s: FM
Pa�s: Micron�sia
*******************
Nome: ingl�s (B�lgica)
C�digo da l�ngua: en
L�ngua: ingl�s
Cod Pa�s: BE
Pa�s: B�lgica
*******************
Nome: sichuan yi
C�digo da l�ngua: ii
L�ngua: sichuan yi
Cod Pa�s: 
Pa�s: 
*******************
Nome: franc�s (Wallis e Futuna)
C�digo da l�ngua: fr
L�ngua: franc�s
Cod Pa�s: WF
Pa�s: Wallis e Futuna
*******************
Nome: mazandarani (Ir�)
C�digo da l�ngua: mzn
L�ngua: mazandarani
Cod Pa�s: IR
Pa�s: Ir�
*******************
Nome: nama
C�digo da l�ngua: naq
L�ngua: nama
Cod Pa�s: 
Pa�s: 
*******************
Nome: ingl�s (Singapura)
C�digo da l�ngua: en
L�ngua: ingl�s
Cod Pa�s: SG
Pa�s: Singapura
*******************
Nome: kalenjin (Qu�nia)
C�digo da l�ngua: kln
L�ngua: kalenjin
Cod Pa�s: KE
Pa�s: Qu�nia
*******************
Nome: tamazight do Atlas Central
C�digo da l�ngua: tzm
L�ngua: tamazight do Atlas Central
Cod Pa�s: 
Pa�s: 
*******************
Nome: fula (latim, G�mbia)
C�digo da l�ngua: ff
L�ngua: fula
Cod Pa�s: GM
Pa�s: G�mbia
*******************
Nome: t�rtaro (cir�lico, R�ssia)
C�digo da l�ngua: tt
L�ngua: t�rtaro
Cod Pa�s: RU
Pa�s: R�ssia
*******************
Nome: teso (latim, Uganda)
C�digo da l�ngua: teo
L�ngua: teso
Cod Pa�s: UG
Pa�s: Uganda
*******************
Nome: friulano
C�digo da l�ngua: fur
L�ngua: friulano
Cod Pa�s: 
Pa�s: 
*******************
Nome: oromo
C�digo da l�ngua: om
L�ngua: oromo
Cod Pa�s: 
Pa�s: 
*******************
Nome: asu (latim, Tanz�nia)
C�digo da l�ngua: asa
L�ngua: asu
Cod Pa�s: TZ
Pa�s: Tanz�nia
*******************
Nome: bena (Tanz�nia)
C�digo da l�ngua: bez
L�ngua: bena
Cod Pa�s: TZ
Pa�s: Tanz�nia
*******************
Nome: fula (latim, Guin�)
C�digo da l�ngua: ff
L�ngua: fula
Cod Pa�s: GN
Pa�s: Guin�
*******************
Nome: esloveno (latim, Eslov�nia)
C�digo da l�ngua: sl
L�ngua: esloveno
Cod Pa�s: SI
Pa�s: Eslov�nia
*******************
Nome: ingl�s (Sud�o)
C�digo da l�ngua: en
L�ngua: ingl�s
Cod Pa�s: SD
Pa�s: Sud�o
*******************
Nome: maithili (devan�gari, �ndia)
C�digo da l�ngua: mai
L�ngua: maithili
Cod Pa�s: IN
Pa�s: �ndia
*******************
Nome: japon�s (Jap�o, JP, Calend�rio Japon�s)
C�digo da l�ngua: ja
L�ngua: japon�s
Cod Pa�s: JP
Pa�s: Jap�o
*******************
Nome: espanhol (El Salvador)
C�digo da l�ngua: es
L�ngua: espanhol
Cod Pa�s: SV
Pa�s: El Salvador
*******************
Nome: portugu�s (Brasil)
C�digo da l�ngua: pt
L�ngua: portugu�s
Cod Pa�s: BR
Pa�s: Brasil
*******************
Nome: manipuri (bengali, �ndia)
C�digo da l�ngua: mni
L�ngua: manipuri
Cod Pa�s: IN
Pa�s: �ndia
*******************
Nome: malaiala (�ndia)
C�digo da l�ngua: ml
L�ngua: malaiala
Cod Pa�s: IN
Pa�s: �ndia
*******************
Nome: irland�s (latim, Irlanda)
C�digo da l�ngua: ga
L�ngua: irland�s
Cod Pa�s: IE
Pa�s: Irlanda
*******************
Nome: ingl�s (Ilhas Malvinas)
C�digo da l�ngua: en
L�ngua: ingl�s
Cod Pa�s: FK
Pa�s: Ilhas Malvinas
*******************
Nome: island�s (Isl�ndia)
C�digo da l�ngua: is
L�ngua: island�s
Cod Pa�s: IS
Pa�s: Isl�ndia
*******************
Nome: basa (latim, Camar�es)
C�digo da l�ngua: bas
L�ngua: basa
Cod Pa�s: CM
Pa�s: Camar�es
*******************
Nome: ingl�s (Diego Garcia)
C�digo da l�ngua: en
L�ngua: ingl�s
Cod Pa�s: DG
Pa�s: Diego Garcia
*******************
Nome: croata
C�digo da l�ngua: hr
L�ngua: croata
Cod Pa�s: 
Pa�s: 
*******************
Nome: portugu�s (S�o Tom� e Pr�ncipe)
C�digo da l�ngua: pt
L�ngua: portugu�s
Cod Pa�s: ST
Pa�s: S�o Tom� e Pr�ncipe
*******************
Nome: akan (Gana)
C�digo da l�ngua: ak
L�ngua: akan
Cod Pa�s: GH
Pa�s: Gana
*******************
Nome: lituano
C�digo da l�ngua: lt
L�ngua: lituano
Cod Pa�s: 
Pa�s: 
*******************
Nome: uzbeque (�rabe, Afeganist�o)
C�digo da l�ngua: uz
L�ngua: uzbeque
Cod Pa�s: AF
Pa�s: Afeganist�o
*******************
Nome: chakma
C�digo da l�ngua: ccp
L�ngua: chakma
Cod Pa�s: 
Pa�s: 
*******************
Nome: ingl�s (Su�cia)
C�digo da l�ngua: en
L�ngua: ingl�s
Cod Pa�s: SE
Pa�s: Su�cia
*******************
Nome: chin�s (simplificado, China)
C�digo da l�ngua: zh
L�ngua: chin�s
Cod Pa�s: CN
Pa�s: China
*******************
Nome: espanhol (Am�rica Latina)
C�digo da l�ngua: es
L�ngua: espanhol
Cod Pa�s: 419
Pa�s: Am�rica Latina
*******************
Nome: lingala (latim, Congo - Kinshasa)
C�digo da l�ngua: ln
L�ngua: lingala
Cod Pa�s: CD
Pa�s: Congo - Kinshasa
*******************
Nome: kako (latim, Camar�es)
C�digo da l�ngua: kkj
L�ngua: kako
Cod Pa�s: CM
Pa�s: Camar�es
*******************
Nome: ingl�s
C�digo da l�ngua: en
L�ngua: ingl�s
Cod Pa�s: 
Pa�s: 
*******************
Nome: gusii (Qu�nia)
C�digo da l�ngua: guz
L�ngua: gusii
Cod Pa�s: KE
Pa�s: Qu�nia
*******************
Nome: alem�o (Su��a) (Liechtenstein)
C�digo da l�ngua: gsw
L�ngua: alem�o (Su��a)
Cod Pa�s: LI
Pa�s: Liechtenstein
*******************
Nome: chakma (Bangladesh)
C�digo da l�ngua: ccp
L�ngua: chakma
Cod Pa�s: BD
Pa�s: Bangladesh
*******************
Nome: espanhol (Ilhas Can�rias)
C�digo da l�ngua: es
L�ngua: espanhol
Cod Pa�s: IC
Pa�s: Ilhas Can�rias
*******************
Nome: catal�o
C�digo da l�ngua: ca
L�ngua: catal�o
Cod Pa�s: 
Pa�s: 
*******************
Nome: �rabe (Tun�sia)
C�digo da l�ngua: ar
L�ngua: �rabe
Cod Pa�s: TN
Pa�s: Tun�sia
*******************
Nome: bambara (Mali)
C�digo da l�ngua: bm
L�ngua: bambara
Cod Pa�s: ML
Pa�s: Mali
*******************
Nome: c�rnico (Reino Unido)
C�digo da l�ngua: kw
L�ngua: c�rnico
Cod Pa�s: GB
Pa�s: Reino Unido
*******************
Nome: panjabi (Paquist�o)
C�digo da l�ngua: pa
L�ngua: panjabi
Cod Pa�s: PK
Pa�s: Paquist�o
*******************
Nome: uigur (China)
C�digo da l�ngua: ug
L�ngua: uigur
Cod Pa�s: CN
Pa�s: China
*******************
Nome: machame (latim, Tanz�nia)
C�digo da l�ngua: jmc
L�ngua: machame
Cod Pa�s: TZ
Pa�s: Tanz�nia
*******************
Nome: quicuio (latim, Qu�nia)
C�digo da l�ngua: ki
L�ngua: quicuio
Cod Pa�s: KE
Pa�s: Qu�nia
*******************
Nome: espanhol (Brasil)
C�digo da l�ngua: es
L�ngua: espanhol
Cod Pa�s: BR
Pa�s: Brasil
*******************
Nome: koyra chiini (Mali)
C�digo da l�ngua: khq
L�ngua: koyra chiini
Cod Pa�s: ML
Pa�s: Mali
*******************
Nome: ingl�s (Ilhas Salom�o)
C�digo da l�ngua: en
L�ngua: ingl�s
Cod Pa�s: SB
Pa�s: Ilhas Salom�o
*******************
Nome: tibetano (tibetano, China)
C�digo da l�ngua: bo
L�ngua: tibetano
Cod Pa�s: CN
Pa�s: China
*******************
Nome: cheroqui (Estados Unidos)
C�digo da l�ngua: chr
L�ngua: cheroqui
Cod Pa�s: US
Pa�s: Estados Unidos
*******************
Nome: quiniaruanda (Ruanda)
C�digo da l�ngua: rw
L�ngua: quiniaruanda
Cod Pa�s: RW
Pa�s: Ruanda
*******************
Nome: tachelhit (tifinagh, Marrocos)
C�digo da l�ngua: shi
L�ngua: tachelhit
Cod Pa�s: MA
Pa�s: Marrocos
*******************
Nome: �rabe (Iraque)
C�digo da l�ngua: ar
L�ngua: �rabe
Cod Pa�s: IQ
Pa�s: Iraque
*******************
Nome: nyankole
C�digo da l�ngua: nyn
L�ngua: nyankole
Cod Pa�s: 
Pa�s: 
*******************
Nome: maced�nio
C�digo da l�ngua: mk
L�ngua: maced�nio
Cod Pa�s: 
Pa�s: 
*******************
Nome: santali
C�digo da l�ngua: sat
L�ngua: santali
Cod Pa�s: 
Pa�s: 
*******************
Nome: panjabi (�rabe)
C�digo da l�ngua: pa
L�ngua: panjabi
Cod Pa�s: 
Pa�s: 
*******************
Nome: ingl�s (Alemanha)
C�digo da l�ngua: en
L�ngua: ingl�s
Cod Pa�s: DE
Pa�s: Alemanha
*******************
Nome: romeno (Mold�via)
C�digo da l�ngua: ro
L�ngua: romeno
Cod Pa�s: MD
Pa�s: Mold�via
*******************
Nome: b�snio
C�digo da l�ngua: bs
L�ngua: b�snio
Cod Pa�s: 
Pa�s: 
*******************
Nome: ingl�s (Finl�ndia)
C�digo da l�ngua: en
L�ngua: ingl�s
Cod Pa�s: FI
Pa�s: Finl�ndia
*******************
Nome: fr�sio ocidental
C�digo da l�ngua: fy
L�ngua: fr�sio ocidental
Cod Pa�s: 
Pa�s: 
*******************
Nome: tailand�s
C�digo da l�ngua: th
L�ngua: tailand�s
Cod Pa�s: 
Pa�s: 
*******************
Nome: uzbeque (Uzbequist�o)
C�digo da l�ngua: uz
L�ngua: uzbeque
Cod Pa�s: UZ
Pa�s: Uzbequist�o
*******************
Nome: taita (Qu�nia)
C�digo da l�ngua: dav
L�ngua: taita
Cod Pa�s: KE
Pa�s: Qu�nia
*******************
Nome: interl�ngua (latim, Mundo)
C�digo da l�ngua: ia
L�ngua: interl�ngua
Cod Pa�s: 001
Pa�s: Mundo
*******************
Nome: sakha (cir�lico, R�ssia)
C�digo da l�ngua: sah
L�ngua: sakha
Cod Pa�s: RU
Pa�s: R�ssia
*******************
Nome: ingl�s (Seicheles)
C�digo da l�ngua: en
L�ngua: ingl�s
Cod Pa�s: SC
Pa�s: Seicheles
*******************
Nome: ingl�s (Uganda)
C�digo da l�ngua: en
L�ngua: ingl�s
Cod Pa�s: UG
Pa�s: Uganda
*******************
Nome: ingl�s (Nova Zel�ndia)
C�digo da l�ngua: en
L�ngua: ingl�s
Cod Pa�s: NZ
Pa�s: Nova Zel�ndia
*******************
Nome: zarma
C�digo da l�ngua: dje
L�ngua: zarma
Cod Pa�s: 
Pa�s: 
*******************
Nome: espanhol (Uruguai)
C�digo da l�ngua: es
L�ngua: espanhol
Cod Pa�s: UY
Pa�s: Uruguai
*******************
Nome: massai (Qu�nia)
C�digo da l�ngua: mas
L�ngua: massai
Cod Pa�s: KE
Pa�s: Qu�nia
*******************
Nome: manipuri (�ndia)
C�digo da l�ngua: mni
L�ngua: manipuri
Cod Pa�s: IN
Pa�s: �ndia
*******************
Nome: russo (Ucr�nia)
C�digo da l�ngua: ru
L�ngua: russo
Cod Pa�s: UA
Pa�s: Ucr�nia
*******************
Nome: sango (Rep�blica Centro-Africana)
C�digo da l�ngua: sg
L�ngua: sango
Cod Pa�s: CF
Pa�s: Rep�blica Centro-Africana
*******************
Nome: ingl�s (Fiji)
C�digo da l�ngua: en
L�ngua: ingl�s
Cod Pa�s: FJ
Pa�s: Fiji
*******************
Nome: alem�o (Liechtenstein)
C�digo da l�ngua: de
L�ngua: alem�o
Cod Pa�s: LI
Pa�s: Liechtenstein
*******************
Nome: ingl�s (Barbados)
C�digo da l�ngua: en
L�ngua: ingl�s
Cod Pa�s: BB
Pa�s: Barbados
*******************
Nome: lap�o de Inari (Finl�ndia)
C�digo da l�ngua: smn
L�ngua: lap�o de Inari
Cod Pa�s: FI
Pa�s: Finl�ndia
*******************
Nome: croata (B�snia e Herzegovina)
C�digo da l�ngua: hr
L�ngua: croata
Cod Pa�s: BA
Pa�s: B�snia e Herzegovina
*******************
Nome: iorub� (latim, Nig�ria)
C�digo da l�ngua: yo
L�ngua: iorub�
Cod Pa�s: NG
Pa�s: Nig�ria
*******************
Nome: alem�o (�ustria)
C�digo da l�ngua: de
L�ngua: alem�o
Cod Pa�s: AT
Pa�s: �ustria
*******************
Nome: luba-catanga (Congo - Kinshasa)
C�digo da l�ngua: lu
L�ngua: luba-catanga
Cod Pa�s: CD
Pa�s: Congo - Kinshasa
*******************
Nome: �rabe (Mundo)
C�digo da l�ngua: ar
L�ngua: �rabe
Cod Pa�s: 001
Pa�s: Mundo
*******************
Nome: somali (Som�lia)
C�digo da l�ngua: so
L�ngua: somali
Cod Pa�s: SO
Pa�s: Som�lia
*******************
Nome: let�o (Let�nia)
C�digo da l�ngua: lv
L�ngua: let�o
Cod Pa�s: LV
Pa�s: Let�nia
*******************
Nome: curdo central
C�digo da l�ngua: ckb
L�ngua: curdo central
Cod Pa�s: 
Pa�s: 
*******************
Nome: �rabe (Kuwait)
C�digo da l�ngua: ar
L�ngua: �rabe
Cod Pa�s: KW
Pa�s: Kuwait
*******************
Nome: s�rvio (cir�lico, S�rvia)
C�digo da l�ngua: sr
L�ngua: s�rvio
Cod Pa�s: RS
Pa�s: S�rvia
*******************
Nome: bemba
C�digo da l�ngua: bem
L�ngua: bemba
Cod Pa�s: 
Pa�s: 
*******************
Nome: dinamarqu�s
C�digo da l�ngua: da
L�ngua: dinamarqu�s
Cod Pa�s: 
Pa�s: 
*******************
Nome: walser
C�digo da l�ngua: wae
L�ngua: walser
Cod Pa�s: 
Pa�s: 
*******************
Nome: ingl�s (Lesoto)
C�digo da l�ngua: en
L�ngua: ingl�s
Cod Pa�s: LS
Pa�s: Lesoto
*******************
Nome: igbo
C�digo da l�ngua: ig
L�ngua: igbo
Cod Pa�s: 
Pa�s: 
*******************
Nome: ingl�s (Hong Kong, RAE da China)
C�digo da l�ngua: en
L�ngua: ingl�s
Cod Pa�s: HK
Pa�s: Hong Kong, RAE da China
*******************
Nome: bodo (devan�gari, �ndia)
C�digo da l�ngua: brx
L�ngua: bodo
Cod Pa�s: IN
Pa�s: �ndia
*******************
Nome: meru (latim, Qu�nia)
C�digo da l�ngua: mer
L�ngua: meru
Cod Pa�s: KE
Pa�s: Qu�nia
*******************
Nome: checheno (R�ssia)
C�digo da l�ngua: ce
L�ngua: checheno
Cod Pa�s: RU
Pa�s: R�ssia
*******************
Nome: georgiano (Ge�rgia)
C�digo da l�ngua: ka
L�ngua: georgiano
Cod Pa�s: GE
Pa�s: Ge�rgia
*******************
Nome: sua�li (Tanz�nia)
C�digo da l�ngua: sw
L�ngua: sua�li
Cod Pa�s: TZ
Pa�s: Tanz�nia
*******************
Nome: franc�s (Ruanda)
C�digo da l�ngua: fr
L�ngua: franc�s
Cod Pa�s: RW
Pa�s: Ruanda
*******************
Nome: malgaxe (Madagascar)
C�digo da l�ngua: mg
L�ngua: malgaxe
Cod Pa�s: MG
Pa�s: Madagascar
*******************
Nome: ingl�s (latim, Estados Unidos)
C�digo da l�ngua: en
L�ngua: ingl�s
Cod Pa�s: US
Pa�s: Estados Unidos
*******************
Nome: osseto (R�ssia)
C�digo da l�ngua: os
L�ngua: osseto
Cod Pa�s: RU
Pa�s: R�ssia
*******************
Nome: s�rvio (latim, S�rvia)
C�digo da l�ngua: sr
L�ngua: s�rvio
Cod Pa�s: RS
Pa�s: S�rvia
*******************
Nome: quirguiz (Quirguist�o)
C�digo da l�ngua: ky
L�ngua: quirguiz
Cod Pa�s: KG
Pa�s: Quirguist�o
*******************
Nome: tamazight do Atlas Central (latim, Marrocos)
C�digo da l�ngua: tzm
L�ngua: tamazight do Atlas Central
Cod Pa�s: MA
Pa�s: Marrocos
*******************
Nome: holand�s (latim, Pa�ses Baixos)
C�digo da l�ngua: nl
L�ngua: holand�s
Cod Pa�s: NL
Pa�s: Pa�ses Baixos
*******************
Nome: curdo (latim, Turquia)
C�digo da l�ngua: ku
L�ngua: curdo
Cod Pa�s: TR
Pa�s: Turquia
*******************
Nome: quicuio
C�digo da l�ngua: ki
L�ngua: quicuio
Cod Pa�s: 
Pa�s: 
*******************
Nome: morisyen (latim, Maur�cio)
C�digo da l�ngua: mfe
L�ngua: morisyen
Cod Pa�s: MU
Pa�s: Maur�cio
*******************
Nome: bokm�l noruegu�s
C�digo da l�ngua: nb
L�ngua: bokm�l noruegu�s
Cod Pa�s: 
Pa�s: 
*******************
Nome: concani
C�digo da l�ngua: kok
L�ngua: concani
Cod Pa�s: 
Pa�s: 
*******************
Nome: ewondo
C�digo da l�ngua: ewo
L�ngua: ewondo
Cod Pa�s: 
Pa�s: 
*******************
Nome: nynorsk noruegu�s
C�digo da l�ngua: nn
L�ngua: nynorsk noruegu�s
Cod Pa�s: 
Pa�s: 
*******************
Nome: �rabe (Jord�nia)
C�digo da l�ngua: ar
L�ngua: �rabe
Cod Pa�s: JO
Pa�s: Jord�nia
*******************
Nome: galego (latim, Espanha)
C�digo da l�ngua: gl
L�ngua: galego
Cod Pa�s: ES
Pa�s: Espanha
*******************
Nome: b�lgaro
C�digo da l�ngua: bg
L�ngua: b�lgaro
Cod Pa�s: 
Pa�s: 
*******************
Nome: crioulo cabo-verdiano
C�digo da l�ngua: kea
L�ngua: crioulo cabo-verdiano
Cod Pa�s: 
Pa�s: 
*******************
Nome: zulu
C�digo da l�ngua: zu
L�ngua: zulu
Cod Pa�s: 
Pa�s: 
*******************
Nome: quirguiz (cir�lico, Quirguist�o)
C�digo da l�ngua: ky
L�ngua: quirguiz
Cod Pa�s: KG
Pa�s: Quirguist�o
*******************
Nome: am�rico (Eti�pia)
C�digo da l�ngua: am
L�ngua: am�rico
Cod Pa�s: ET
Pa�s: Eti�pia
*******************
Nome: franc�s (Arg�lia)
C�digo da l�ngua: fr
L�ngua: franc�s
Cod Pa�s: DZ
Pa�s: Arg�lia
*******************
Nome: tibetano (China)
C�digo da l�ngua: bo
L�ngua: tibetano
Cod Pa�s: CN
Pa�s: China
*******************
Nome: alto sor�bio
C�digo da l�ngua: hsb
L�ngua: alto sor�bio
Cod Pa�s: 
Pa�s: 
*******************
Nome: qu�chua (Equador)
C�digo da l�ngua: qu
L�ngua: qu�chua
Cod Pa�s: EC
Pa�s: Equador
*******************
Nome: georgiano (georgiano, Ge�rgia)
C�digo da l�ngua: ka
L�ngua: georgiano
Cod Pa�s: GE
Pa�s: Ge�rgia
*******************
Nome: ingl�s (Montserrat)
C�digo da l�ngua: en
L�ngua: ingl�s
Cod Pa�s: MS
Pa�s: Montserrat
*******************
Nome: concani (devan�gari, �ndia)
C�digo da l�ngua: kok
L�ngua: concani
Cod Pa�s: IN
Pa�s: �ndia
*******************
Nome: ingl�s (Guernsey)
C�digo da l�ngua: en
L�ngua: ingl�s
Cod Pa�s: GG
Pa�s: Guernsey
*******************
Nome: maconde (latim, Tanz�nia)
C�digo da l�ngua: kde
L�ngua: maconde
Cod Pa�s: TZ
Pa�s: Tanz�nia
*******************
Nome: santali (�ndia)
C�digo da l�ngua: sat
L�ngua: santali
Cod Pa�s: IN
Pa�s: �ndia
*******************
Nome: s�rvio (Montenegro)
C�digo da l�ngua: sr
L�ngua: s�rvio
Cod Pa�s: ME
Pa�s: Montenegro
*******************
Nome: sueco (Su�cia)
C�digo da l�ngua: sv
L�ngua: sueco
Cod Pa�s: SE
Pa�s: Su�cia
*******************
Nome: pidgin nigeriano
C�digo da l�ngua: pcm
L�ngua: pidgin nigeriano
Cod Pa�s: 
Pa�s: 
*******************
Nome: sakha
C�digo da l�ngua: sah
L�ngua: sakha
Cod Pa�s: 
Pa�s: 
*******************
Nome: meru
C�digo da l�ngua: mer
L�ngua: meru
Cod Pa�s: 
Pa�s: 
*******************
Nome: ingl�s (Z�mbia)
C�digo da l�ngua: en
L�ngua: ingl�s
Cod Pa�s: ZM
Pa�s: Z�mbia
*******************
Nome: franc�s (Mali)
C�digo da l�ngua: fr
L�ngua: franc�s
Cod Pa�s: ML
Pa�s: Mali
*******************
Nome: hau�� (Nig�ria)
C�digo da l�ngua: ha
L�ngua: hau��
Cod Pa�s: NG
Pa�s: Nig�ria
*******************
Nome: bret�o
C�digo da l�ngua: br
L�ngua: bret�o
Cod Pa�s: 
Pa�s: 
*******************
Nome: �rabe (Ar�bia Saudita)
C�digo da l�ngua: ar
L�ngua: �rabe
Cod Pa�s: SA
Pa�s: Ar�bia Saudita
*******************
Nome: persa (Afeganist�o)
C�digo da l�ngua: fa
L�ngua: persa
Cod Pa�s: AF
Pa�s: Afeganist�o
*******************
Nome: filipino (latim, Filipinas)
C�digo da l�ngua: fil
L�ngua: filipino
Cod Pa�s: PH
Pa�s: Filipinas
*******************
Nome: eslovaco
C�digo da l�ngua: sk
L�ngua: eslovaco
Cod Pa�s: 
Pa�s: 
*******************
Nome: oromo (latim, Eti�pia)
C�digo da l�ngua: om
L�ngua: oromo
Cod Pa�s: ET
Pa�s: Eti�pia
*******************
Nome: osseto (Ge�rgia)
C�digo da l�ngua: os
L�ngua: osseto
Cod Pa�s: GE
Pa�s: Ge�rgia
*******************
Nome: curdo central (�rabe, Iraque)
C�digo da l�ngua: ckb
L�ngua: curdo central
Cod Pa�s: IQ
Pa�s: Iraque
*******************
Nome: i�diche (Mundo)
C�digo da l�ngua: yi
L�ngua: i�diche
Cod Pa�s: 001
Pa�s: Mundo
*******************
Nome: malaiala
C�digo da l�ngua: ml
L�ngua: malaiala
Cod Pa�s: 
Pa�s: 
*******************
Nome: ingl�s (Malta)
C�digo da l�ngua: en
L�ngua: ingl�s
Cod Pa�s: MT
Pa�s: Malta
*******************
Nome: ingl�s (Gana)
C�digo da l�ngua: en
L�ngua: ingl�s
Cod Pa�s: GH
Pa�s: Gana
*******************
Nome: ingl�s (Israel)
C�digo da l�ngua: en
L�ngua: ingl�s
Cod Pa�s: IL
Pa�s: Israel
*******************
Nome: sueco
C�digo da l�ngua: sv
L�ngua: sueco
Cod Pa�s: 
Pa�s: 
*******************
Nome: canarim (kannada, �ndia)
C�digo da l�ngua: kn
L�ngua: canarim
Cod Pa�s: IN
Pa�s: �ndia
*******************
Nome: tamazight do Atlas Central (Marrocos)
C�digo da l�ngua: tzm
L�ngua: tamazight do Atlas Central
Cod Pa�s: MA
Pa�s: Marrocos
*******************
Nome: grego (grego, Gr�cia)
C�digo da l�ngua: el
L�ngua: grego
Cod Pa�s: GR
Pa�s: Gr�cia
*******************
Nome: koyraboro senni (Mali)
C�digo da l�ngua: ses
L�ngua: koyraboro senni
Cod Pa�s: ML
Pa�s: Mali
*******************
Nome: rwa (latim, Tanz�nia)
C�digo da l�ngua: rwk
L�ngua: rwa
Cod Pa�s: TZ
Pa�s: Tanz�nia
*******************
Nome: lacota (Estados Unidos)
C�digo da l�ngua: lkt
L�ngua: lacota
Cod Pa�s: US
Pa�s: Estados Unidos
*******************
Nome: sindi (devan�gari)
C�digo da l�ngua: sd
L�ngua: sindi
Cod Pa�s: 
Pa�s: 
*******************
Nome: vai (latim, Lib�ria)
C�digo da l�ngua: vai
L�ngua: vai
Cod Pa�s: LR
Pa�s: Lib�ria
*******************
Nome: curdo
C�digo da l�ngua: ku
L�ngua: curdo
Cod Pa�s: 
Pa�s: 
*******************
Nome: sua�li (Congo - Kinshasa)
C�digo da l�ngua: sw
L�ngua: sua�li
Cod Pa�s: CD
Pa�s: Congo - Kinshasa
*******************
Nome: fula (Adlm, Maurit�nia)
C�digo da l�ngua: ff
L�ngua: fula
Cod Pa�s: MR
Pa�s: Maurit�nia
*******************
Nome: filipino (Filipinas)
C�digo da l�ngua: fil
L�ngua: filipino
Cod Pa�s: PH
Pa�s: Filipinas
*******************
Nome: italiano (Cidade do Vaticano)
C�digo da l�ngua: it
L�ngua: italiano
Cod Pa�s: VA
Pa�s: Cidade do Vaticano
*******************
Nome: espanhol (Filipinas)
C�digo da l�ngua: es
L�ngua: espanhol
Cod Pa�s: PH
Pa�s: Filipinas
*******************
Nome: espanhol (Espanha)
C�digo da l�ngua: es
L�ngua: espanhol
Cod Pa�s: ES
Pa�s: Espanha
*******************
Nome: espanhol (Col�mbia)
C�digo da l�ngua: es
L�ngua: espanhol
Cod Pa�s: CO
Pa�s: Col�mbia
*******************
Nome: b�lgaro (Bulg�ria)
C�digo da l�ngua: bg
L�ngua: b�lgaro
Cod Pa�s: BG
Pa�s: Bulg�ria
*******************
Nome: ingl�s (S�o Vicente e Granadinas)
C�digo da l�ngua: en
L�ngua: ingl�s
Cod Pa�s: VC
Pa�s: S�o Vicente e Granadinas
*******************
Nome: koyraboro senni (latim, Mali)
C�digo da l�ngua: ses
L�ngua: koyraboro senni
Cod Pa�s: ML
Pa�s: Mali
*******************
Nome: aghem
C�digo da l�ngua: agq
L�ngua: aghem
Cod Pa�s: 
Pa�s: 
*******************
Nome: alto sor�bio (Alemanha)
C�digo da l�ngua: hsb
L�ngua: alto sor�bio
Cod Pa�s: DE
Pa�s: Alemanha
*******************
Nome: basco (latim, Espanha)
C�digo da l�ngua: eu
L�ngua: basco
Cod Pa�s: ES
Pa�s: Espanha
*******************
Nome: ingl�s (Europa)
C�digo da l�ngua: en
L�ngua: ingl�s
Cod Pa�s: 150
Pa�s: Europa
*******************
Nome: sueco (latim, Su�cia)
C�digo da l�ngua: sv
L�ngua: sueco
Cod Pa�s: SE
Pa�s: Su�cia
*******************
Nome: �rabe (Sud�o)
C�digo da l�ngua: ar
L�ngua: �rabe
Cod Pa�s: SD
Pa�s: Sud�o
*******************
Nome: hau�� (N�ger)
C�digo da l�ngua: ha
L�ngua: hau��
Cod Pa�s: NE
Pa�s: N�ger
*******************
Nome: ingl�s (S�o Crist�v�o e N�vis)
C�digo da l�ngua: en
L�ngua: ingl�s
Cod Pa�s: KN
Pa�s: S�o Crist�v�o e N�vis
*******************
Nome: embu
C�digo da l�ngua: ebu
L�ngua: embu
Cod Pa�s: 
Pa�s: 
*******************
Nome: romeno (Rom�nia)
C�digo da l�ngua: ro
L�ngua: romeno
Cod Pa�s: RO
Pa�s: Rom�nia
*******************
Nome: s�rvio (latim, Montenegro)
C�digo da l�ngua: sr
L�ngua: s�rvio
Cod Pa�s: ME
Pa�s: Montenegro
*******************
Nome: espanhol (Guatemala)
C�digo da l�ngua: es
L�ngua: espanhol
Cod Pa�s: GT
Pa�s: Guatemala
*******************
Nome: fula (latim, Lib�ria)
C�digo da l�ngua: ff
L�ngua: fula
Cod Pa�s: LR
Pa�s: Lib�ria
*******************
Nome: basa (Camar�es)
C�digo da l�ngua: bas
L�ngua: basa
Cod Pa�s: CM
Pa�s: Camar�es
*******************
Nome: ndebele do norte (latim, Zimb�bue)
C�digo da l�ngua: nd
L�ngua: ndebele do norte
Cod Pa�s: ZW
Pa�s: Zimb�bue
*******************
Nome: franc�s (Madagascar)
C�digo da l�ngua: fr
L�ngua: franc�s
Cod Pa�s: MG
Pa�s: Madagascar
*******************
Nome: espanhol (Chile)
C�digo da l�ngua: es
L�ngua: espanhol
Cod Pa�s: CL
Pa�s: Chile
*******************
Nome: mongol
C�digo da l�ngua: mn
L�ngua: mongol
Cod Pa�s: 
Pa�s: 
*******************
Nome: kamba (Qu�nia)
C�digo da l�ngua: kam
L�ngua: kamba
Cod Pa�s: KE
Pa�s: Qu�nia
*******************
Nome: persa (Ir�)
C�digo da l�ngua: fa
L�ngua: persa
Cod Pa�s: IR
Pa�s: Ir�
*******************
Nome: ingl�s (Macau, RAE da China)
C�digo da l�ngua: en
L�ngua: ingl�s
Cod Pa�s: MO
Pa�s: Macau, RAE da China
*******************
Nome: japon�s (japon�s, Jap�o)
C�digo da l�ngua: ja
L�ngua: japon�s
Cod Pa�s: JP
Pa�s: Jap�o
*******************
Nome: uolofe
C�digo da l�ngua: wo
L�ngua: uolofe
Cod Pa�s: 
Pa�s: 
*******************
Nome: tachelhit (tifinagh)
C�digo da l�ngua: shi
L�ngua: tachelhit
Cod Pa�s: 
Pa�s: 
*******************
Nome: ingl�s (Belize)
C�digo da l�ngua: en
L�ngua: ingl�s
Cod Pa�s: BZ
Pa�s: Belize
*******************
Nome: lacota (latim, Estados Unidos)
C�digo da l�ngua: lkt
L�ngua: lacota
Cod Pa�s: US
Pa�s: Estados Unidos
*******************
Nome: alban�s (Alb�nia)
C�digo da l�ngua: sq
L�ngua: alban�s
Cod Pa�s: AL
Pa�s: Alb�nia
*******************
Nome: romeno (latim, Rom�nia)
C�digo da l�ngua: ro
L�ngua: romeno
Cod Pa�s: RO
Pa�s: Rom�nia
*******************
Nome: tasawaq (N�ger)
C�digo da l�ngua: twq
L�ngua: tasawaq
Cod Pa�s: NE
Pa�s: N�ger
*******************
Nome: kwasio (Camar�es)
C�digo da l�ngua: nmg
L�ngua: kwasio
Cod Pa�s: CM
Pa�s: Camar�es
*******************
Nome: t�mil (t�mil, �ndia)
C�digo da l�ngua: ta
L�ngua: t�mil
Cod Pa�s: IN
Pa�s: �ndia
*******************
Nome: kabyle (latim, Arg�lia)
C�digo da l�ngua: kab
L�ngua: kabyle
Cod Pa�s: DZ
Pa�s: Arg�lia
*******************
Nome: azerbaijano (cir�lico)
C�digo da l�ngua: az
L�ngua: azerbaijano
Cod Pa�s: 
Pa�s: 
*******************
Nome: ingl�s (Ilhas Marianas do Norte)
C�digo da l�ngua: en
L�ngua: ingl�s
Cod Pa�s: MP
Pa�s: Ilhas Marianas do Norte
*******************
Nome: ingl�s (Granada)
C�digo da l�ngua: en
L�ngua: ingl�s
Cod Pa�s: GD
Pa�s: Granada
*******************
Nome: turcomeno
C�digo da l�ngua: tk
L�ngua: turcomeno
Cod Pa�s: 
Pa�s: 
*******************
Nome: sangu (latim, Tanz�nia)
C�digo da l�ngua: sbp
L�ngua: sangu
Cod Pa�s: TZ
Pa�s: Tanz�nia
*******************
Nome: tachelhit (latim)
C�digo da l�ngua: shi
L�ngua: tachelhit
Cod Pa�s: 
Pa�s: 
*******************
Nome: ingl�s (Botsuana)
C�digo da l�ngua: en
L�ngua: ingl�s
Cod Pa�s: BW
Pa�s: Botsuana
*******************
Nome: kabyle (Arg�lia)
C�digo da l�ngua: kab
L�ngua: kabyle
Cod Pa�s: DZ
Pa�s: Arg�lia
*******************
Nome: hebraico (Israel)
C�digo da l�ngua: he
L�ngua: hebraico
Cod Pa�s: IL
Pa�s: Israel
*******************
Nome: maconde (Tanz�nia)
C�digo da l�ngua: kde
L�ngua: maconde
Cod Pa�s: TZ
Pa�s: Tanz�nia
*******************
Nome: t�mil (Mal�sia)
C�digo da l�ngua: ta
L�ngua: t�mil
Cod Pa�s: MY
Pa�s: Mal�sia
*******************
Nome: sueco (Finl�ndia)
C�digo da l�ngua: sv
L�ngua: sueco
Cod Pa�s: FI
Pa�s: Finl�ndia
*******************
Nome: ndebele do norte (Zimb�bue)
C�digo da l�ngua: nd
L�ngua: ndebele do norte
Cod Pa�s: ZW
Pa�s: Zimb�bue
*******************
Nome: luyia (latim, Qu�nia)
C�digo da l�ngua: luy
L�ngua: luyia
Cod Pa�s: KE
Pa�s: Qu�nia
*******************
Nome: manipuri (bengali)
C�digo da l�ngua: mni
L�ngua: manipuri
Cod Pa�s: 
Pa�s: 
*******************
Nome: nepal�s
C�digo da l�ngua: ne
L�ngua: nepal�s
Cod Pa�s: 
Pa�s: 
*******************
Nome: ingl�s (Irlanda)
C�digo da l�ngua: en
L�ngua: ingl�s
Cod Pa�s: IE
Pa�s: Irlanda
*******************
Nome: chin�s (Singapura)
C�digo da l�ngua: zh
L�ngua: chin�s
Cod Pa�s: SG
Pa�s: Singapura
*******************
Nome: cingal�s (cingal�s, Sri Lanka)
C�digo da l�ngua: si
L�ngua: cingal�s
Cod Pa�s: LK
Pa�s: Sri Lanka
*******************
Nome: ingl�s (Quiribati)
C�digo da l�ngua: en
L�ngua: ingl�s
Cod Pa�s: KI
Pa�s: Quiribati
*******************
Nome: tasawaq (latim, N�ger)
C�digo da l�ngua: twq
L�ngua: tasawaq
Cod Pa�s: NE
Pa�s: N�ger
*******************
Nome: oromo (Eti�pia)
C�digo da l�ngua: om
L�ngua: oromo
Cod Pa�s: ET
Pa�s: Eti�pia
*******************
Nome: laosiano (lao, Laos)
C�digo da l�ngua: lo
L�ngua: laosiano
Cod Pa�s: LA
Pa�s: Laos
*******************
Nome: alban�s (latim, Alb�nia)
C�digo da l�ngua: sq
L�ngua: alban�s
Cod Pa�s: AL
Pa�s: Alb�nia
*******************
Nome: japon�s (Jap�o)
C�digo da l�ngua: ja
L�ngua: japon�s
Cod Pa�s: JP
Pa�s: Jap�o
*******************
Nome: kamba (latim, Qu�nia)
C�digo da l�ngua: kam
L�ngua: kamba
Cod Pa�s: KE
Pa�s: Qu�nia
*******************
Nome: birman�s
C�digo da l�ngua: my
L�ngua: birman�s
Cod Pa�s: 
Pa�s: 
*******************
Nome: georgiano
C�digo da l�ngua: ka
L�ngua: georgiano
Cod Pa�s: 
Pa�s: 
*******************
Nome: fula (Adlm, Gana)
C�digo da l�ngua: ff
L�ngua: fula
Cod Pa�s: GH
Pa�s: Gana
*******************
Nome: coreano (coreano, Coreia do Sul)
C�digo da l�ngua: ko
L�ngua: coreano
Cod Pa�s: KR
Pa�s: Coreia do Sul
*******************
Nome: franc�s (S�o Martinho)
C�digo da l�ngua: fr
L�ngua: franc�s
Cod Pa�s: MF
Pa�s: S�o Martinho
*******************
Nome: malaio (Indon�sia)
C�digo da l�ngua: ms
L�ngua: malaio
Cod Pa�s: ID
Pa�s: Indon�sia
*******************
Nome: tachelhit
C�digo da l�ngua: shi
L�ngua: tachelhit
Cod Pa�s: 
Pa�s: 
*******************
Nome: groenland�s
C�digo da l�ngua: kl
L�ngua: groenland�s
Cod Pa�s: 
Pa�s: 
*******************
Nome: s�nscrito (�ndia)
C�digo da l�ngua: sa
L�ngua: s�nscrito
Cod Pa�s: IN
Pa�s: �ndia
*******************
Nome: canton�s (Hong Kong, RAE da China)
C�digo da l�ngua: yue
L�ngua: canton�s
Cod Pa�s: HK
Pa�s: Hong Kong, RAE da China
*******************
Nome: indon�sio
C�digo da l�ngua: id
L�ngua: indon�sio
Cod Pa�s: 
Pa�s: 
*******************
Nome: ingl�s (Essuat�ni)
C�digo da l�ngua: en
L�ngua: ingl�s
Cod Pa�s: SZ
Pa�s: Essuat�ni
*******************
Nome: fero�s (latim, Ilhas Faro�)
C�digo da l�ngua: fo
L�ngua: fero�s
Cod Pa�s: FO
Pa�s: Ilhas Faro�
*******************
Nome: rwa (Tanz�nia)
C�digo da l�ngua: rwk
L�ngua: rwa
Cod Pa�s: TZ
Pa�s: Tanz�nia
*******************
Nome: chin�s
C�digo da l�ngua: zh
L�ngua: chin�s
Cod Pa�s: 
Pa�s: 
*******************
Nome: espanhol (Peru)
C�digo da l�ngua: es
L�ngua: espanhol
Cod Pa�s: PE
Pa�s: Peru
*******************
Nome: macua (Mo�ambique)
C�digo da l�ngua: mgh
L�ngua: macua
Cod Pa�s: MZ
Pa�s: Mo�ambique
*******************
Nome: samburu
C�digo da l�ngua: saq
L�ngua: samburu
Cod Pa�s: 
Pa�s: 
*******************
Nome: ingl�s (Reino Unido)
C�digo da l�ngua: en
L�ngua: ingl�s
Cod Pa�s: GB
Pa�s: Reino Unido
*******************
Nome: chin�s (tradicional, Hong Kong, RAE da China)
C�digo da l�ngua: zh
L�ngua: chin�s
Cod Pa�s: HK
Pa�s: Hong Kong, RAE da China
*******************
Nome: santali (ol chiki, �ndia)
C�digo da l�ngua: sat
L�ngua: santali
Cod Pa�s: IN
Pa�s: �ndia
*******************
Nome: cazaque (Cazaquist�o)
C�digo da l�ngua: kk
L�ngua: cazaque
Cod Pa�s: KZ
Pa�s: Cazaquist�o
*******************
Nome: espanhol (Panam�)
C�digo da l�ngua: es
L�ngua: espanhol
Cod Pa�s: PA
Pa�s: Panam�
*******************
Nome: �rabe (Territ�rios palestinos)
C�digo da l�ngua: ar
L�ngua: �rabe
Cod Pa�s: PS
Pa�s: Territ�rios palestinos
*******************
Nome: bena
C�digo da l�ngua: bez
L�ngua: bena
Cod Pa�s: 
Pa�s: 
*******************
Nome: franc�s (M�naco)
C�digo da l�ngua: fr
L�ngua: franc�s
Cod Pa�s: MC
Pa�s: M�naco
*******************
Nome: c�rnico
C�digo da l�ngua: kw
L�ngua: c�rnico
Cod Pa�s: 
Pa�s: 
*******************
Nome: vai (latim)
C�digo da l�ngua: vai
L�ngua: vai
Cod Pa�s: 
Pa�s: 
*******************
Nome: k�lsch
C�digo da l�ngua: ksh
L�ngua: k�lsch
Cod Pa�s: 
Pa�s: 
*******************
Nome: urdu (�ndia)
C�digo da l�ngua: ur
L�ngua: urdu
Cod Pa�s: IN
Pa�s: �ndia
*******************
Nome: lingala
C�digo da l�ngua: ln
L�ngua: lingala
Cod Pa�s: 
Pa�s: 
*******************
Nome: checheno (cir�lico, R�ssia)
C�digo da l�ngua: ce
L�ngua: checheno
Cod Pa�s: RU
Pa�s: R�ssia
*******************
Nome: alem�o (Su��a) (Su��a)
C�digo da l�ngua: gsw
L�ngua: alem�o (Su��a)
Cod Pa�s: CH
Pa�s: Su��a
*******************
Nome: luyia (Qu�nia)
C�digo da l�ngua: luy
L�ngua: luyia
Cod Pa�s: KE
Pa�s: Qu�nia
*******************
Nome: portugu�s
C�digo da l�ngua: pt
L�ngua: portugu�s
Cod Pa�s: 
Pa�s: 
*******************
Nome: kako (Camar�es)
C�digo da l�ngua: kkj
L�ngua: kako
Cod Pa�s: CM
Pa�s: Camar�es
*******************
Nome: espanhol (Guin� Equatorial)
C�digo da l�ngua: es
L�ngua: espanhol
Cod Pa�s: GQ
Pa�s: Guin� Equatorial
*******************
Nome: macua (latim, Mo�ambique)
C�digo da l�ngua: mgh
L�ngua: macua
Cod Pa�s: MZ
Pa�s: Mo�ambique
*******************
Nome: �rabe (I�men)
C�digo da l�ngua: ar
L�ngua: �rabe
Cod Pa�s: YE
Pa�s: I�men
*******************
Nome: tongan�s
C�digo da l�ngua: to
L�ngua: tongan�s
Cod Pa�s: 
Pa�s: 
*******************
Nome: ingl�s (Sint Maarten)
C�digo da l�ngua: en
L�ngua: ingl�s
Cod Pa�s: SX
Pa�s: Sint Maarten
*******************
Nome: russo (Cazaquist�o)
C�digo da l�ngua: ru
L�ngua: russo
Cod Pa�s: KZ
Pa�s: Cazaquist�o
*******************
Nome: estoniano
C�digo da l�ngua: et
L�ngua: estoniano
Cod Pa�s: 
Pa�s: 
*******************
Nome: coreano (Coreia do Norte)
C�digo da l�ngua: ko
L�ngua: coreano
Cod Pa�s: KP
Pa�s: Coreia do Norte
*******************
Nome: holand�s (Suriname)
C�digo da l�ngua: nl
L�ngua: holand�s
Cod Pa�s: SR
Pa�s: Suriname
*******************
Nome: rombo
C�digo da l�ngua: rof
L�ngua: rombo
Cod Pa�s: 
Pa�s: 
*******************
Nome: ingl�s (Bahamas)
C�digo da l�ngua: en
L�ngua: ingl�s
Cod Pa�s: BS
Pa�s: Bahamas
*******************
Nome: bemba (latim, Z�mbia)
C�digo da l�ngua: bem
L�ngua: bemba
Cod Pa�s: ZM
Pa�s: Z�mbia
*******************
Nome: bielorrusso
C�digo da l�ngua: be
L�ngua: bielorrusso
Cod Pa�s: 
Pa�s: 
*******************
Nome: manx
C�digo da l�ngua: gv
L�ngua: manx
Cod Pa�s: 
Pa�s: 
*******************
Nome: kalenjin (latim, Qu�nia)
C�digo da l�ngua: kln
L�ngua: kalenjin
Cod Pa�s: KE
Pa�s: Qu�nia
*******************
Nome: duala
C�digo da l�ngua: dua
L�ngua: duala
Cod Pa�s: 
Pa�s: 
*******************
Nome: chiga (latim, Uganda)
C�digo da l�ngua: cgg
L�ngua: chiga
Cod Pa�s: UG
Pa�s: Uganda
*******************
Nome: holand�s (Pa�ses Baixos Caribenhos)
C�digo da l�ngua: nl
L�ngua: holand�s
Cod Pa�s: BQ
Pa�s: Pa�ses Baixos Caribenhos
*******************
Nome: ewe (latim, Gana)
C�digo da l�ngua: ee
L�ngua: ewe
Cod Pa�s: GH
Pa�s: Gana
*******************
Nome: fula (Adlm, Guin�)
C�digo da l�ngua: ff
L�ngua: fula
Cod Pa�s: GN
Pa�s: Guin�
*******************
Nome: uzbeque (cir�lico, Uzbequist�o)
C�digo da l�ngua: uz
L�ngua: uzbeque
Cod Pa�s: UZ
Pa�s: Uzbequist�o
*******************
Nome: h�ndi (devan�gari, �ndia)
C�digo da l�ngua: hi
L�ngua: h�ndi
Cod Pa�s: IN
Pa�s: �ndia
*******************
Nome: gusii
C�digo da l�ngua: guz
L�ngua: gusii
Cod Pa�s: 
Pa�s: 
*******************
Nome: ingl�s (Qu�nia)
C�digo da l�ngua: en
L�ngua: ingl�s
Cod Pa�s: KE
Pa�s: Qu�nia
*******************
Nome: morisyen
C�digo da l�ngua: mfe
L�ngua: morisyen
Cod Pa�s: 
Pa�s: 
*******************
Nome: asu (Tanz�nia)
C�digo da l�ngua: asa
L�ngua: asu
Cod Pa�s: TZ
Pa�s: Tanz�nia
*******************
Nome: japon�s
C�digo da l�ngua: ja
L�ngua: japon�s
Cod Pa�s: 
Pa�s: 
*******************
Nome: franc�s (Senegal)
C�digo da l�ngua: fr
L�ngua: franc�s
Cod Pa�s: SN
Pa�s: Senegal
*******************
Nome: ori�
C�digo da l�ngua: or
L�ngua: ori�
Cod Pa�s: 
Pa�s: 
*******************
Nome: bodo
C�digo da l�ngua: brx
L�ngua: bodo
Cod Pa�s: 
Pa�s: 
*******************
Nome: franc�s (Marrocos)
C�digo da l�ngua: fr
L�ngua: franc�s
Cod Pa�s: MA
Pa�s: Marrocos
*******************
Nome: portugu�s (Luxemburgo)
C�digo da l�ngua: pt
L�ngua: portugu�s
Cod Pa�s: LU
Pa�s: Luxemburgo
*******************
Nome: fula (Adlm, G�mbia)
C�digo da l�ngua: ff
L�ngua: fula
Cod Pa�s: GM
Pa�s: G�mbia
*******************
Nome: franc�s (S�o Bartolomeu)
C�digo da l�ngua: fr
L�ngua: franc�s
Cod Pa�s: BL
Pa�s: S�o Bartolomeu
*******************
Nome: meta� (Camar�es)
C�digo da l�ngua: mgo
L�ngua: meta�
Cod Pa�s: CM
Pa�s: Camar�es
*******************
Nome: kwasio (latim, Camar�es)
C�digo da l�ngua: nmg
L�ngua: kwasio
Cod Pa�s: CM
Pa�s: Camar�es
*******************
Nome: maithili (�ndia)
C�digo da l�ngua: mai
L�ngua: maithili
Cod Pa�s: IN
Pa�s: �ndia
*******************
Nome: coreano (Coreia do Sul)
C�digo da l�ngua: ko
L�ngua: coreano
Cod Pa�s: KR
Pa�s: Coreia do Sul
*******************
Nome: tadjique (cir�lico, Tadjiquist�o)
C�digo da l�ngua: tg
L�ngua: tadjique
Cod Pa�s: TJ
Pa�s: Tadjiquist�o
*******************
Nome: espanhol (M�xico)
C�digo da l�ngua: es
L�ngua: espanhol
Cod Pa�s: MX
Pa�s: M�xico
*******************
Nome: zulu (latim, �frica do Sul)
C�digo da l�ngua: zu
L�ngua: zulu
Cod Pa�s: ZA
Pa�s: �frica do Sul
*******************
Nome: dogri (�ndia)
C�digo da l�ngua: doi
L�ngua: dogri
Cod Pa�s: IN
Pa�s: �ndia
*******************
Nome: finland�s
C�digo da l�ngua: fi
L�ngua: finland�s
Cod Pa�s: 
Pa�s: 
*******************
Nome: uzbeque
C�digo da l�ngua: uz
L�ngua: uzbeque
Cod Pa�s: 
Pa�s: 
*******************
Nome: b�snio (cir�lico)
C�digo da l�ngua: bs
L�ngua: b�snio
Cod Pa�s: 
Pa�s: 
*******************
Nome: s�rvio (latim)
C�digo da l�ngua: sr
L�ngua: s�rvio
Cod Pa�s: 
Pa�s: 
*******************
Nome: ingl�s (Sud�o do Sul)
C�digo da l�ngua: en
L�ngua: ingl�s
Cod Pa�s: SS
Pa�s: Sud�o do Sul
*******************
Nome: tibetano (�ndia)
C�digo da l�ngua: bo
L�ngua: tibetano
Cod Pa�s: IN
Pa�s: �ndia
*******************
Nome: romanche
C�digo da l�ngua: rm
L�ngua: romanche
Cod Pa�s: 
Pa�s: 
*******************
Nome: tachelhit (Marrocos)
C�digo da l�ngua: shi
L�ngua: tachelhit
Cod Pa�s: MA
Pa�s: Marrocos
*******************
Nome: ingl�s (Madagascar)
C�digo da l�ngua: en
L�ngua: ingl�s
Cod Pa�s: MG
Pa�s: Madagascar
*******************
Nome: franc�s (Burundi)
C�digo da l�ngua: fr
L�ngua: franc�s
Cod Pa�s: BI
Pa�s: Burundi
*******************
Nome: alto sor�bio (latim, Alemanha)
C�digo da l�ngua: hsb
L�ngua: alto sor�bio
Cod Pa�s: DE
Pa�s: Alemanha
*******************
Nome: nama (latim, Nam�bia)
C�digo da l�ngua: naq
L�ngua: nama
Cod Pa�s: NA
Pa�s: Nam�bia
*******************
Nome: bengali
C�digo da l�ngua: bn
L�ngua: bengali
Cod Pa�s: 
Pa�s: 
*******************
Nome: bret�o (latim, Fran�a)
C�digo da l�ngua: br
L�ngua: bret�o
Cod Pa�s: FR
Pa�s: Fran�a
*******************
Nome: canarim
C�digo da l�ngua: kn
L�ngua: canarim
Cod Pa�s: 
Pa�s: 
*******************
Nome: ngiemboon
C�digo da l�ngua: nnh
L�ngua: ngiemboon
Cod Pa�s: 
Pa�s: 
*******************
Nome: bengali (Bangladesh)
C�digo da l�ngua: bn
L�ngua: bengali
Cod Pa�s: BD
Pa�s: Bangladesh
*******************
Nome: espanhol (latim, Espanha)
C�digo da l�ngua: es
L�ngua: espanhol
Cod Pa�s: ES
Pa�s: Espanha
*******************
Nome: ingl�s (�frica do Sul)
C�digo da l�ngua: en
L�ngua: ingl�s
Cod Pa�s: ZA
Pa�s: �frica do Sul
*******************
Nome: gal�s (latim, Reino Unido)
C�digo da l�ngua: cy
L�ngua: gal�s
Cod Pa�s: GB
Pa�s: Reino Unido
*******************
Nome: franc�s (Fran�a)
C�digo da l�ngua: fr
L�ngua: franc�s
Cod Pa�s: FR
Pa�s: Fran�a
*******************
Nome: panjabi (�ndia)
C�digo da l�ngua: pa
L�ngua: panjabi
Cod Pa�s: IN
Pa�s: �ndia
*******************
Nome: ingl�s (Ilhas Marshall)
C�digo da l�ngua: en
L�ngua: ingl�s
Cod Pa�s: MH
Pa�s: Ilhas Marshall
*******************
Nome: franc�s (Benin)
C�digo da l�ngua: fr
L�ngua: franc�s
Cod Pa�s: BJ
Pa�s: Benin
*******************
Nome: vai (Lib�ria)
C�digo da l�ngua: vai
L�ngua: vai
Cod Pa�s: LR
Pa�s: Lib�ria
*******************
Nome: chin�s (tradicional)
C�digo da l�ngua: zh
L�ngua: chin�s
Cod Pa�s: 
Pa�s: 
*******************
Nome: javan�s (latim, Indon�sia)
C�digo da l�ngua: jv
L�ngua: javan�s
Cod Pa�s: ID
Pa�s: Indon�sia
*******************
Nome: sakha (R�ssia)
C�digo da l�ngua: sah
L�ngua: sakha
Cod Pa�s: RU
Pa�s: R�ssia
*******************
Nome: pashto (Afeganist�o)
C�digo da l�ngua: ps
L�ngua: pashto
Cod Pa�s: AF
Pa�s: Afeganist�o
*******************
Nome: quirguiz
C�digo da l�ngua: ky
L�ngua: quirguiz
Cod Pa�s: 
Pa�s: 
*******************
Nome: massai
C�digo da l�ngua: mas
L�ngua: massai
Cod Pa�s: 
Pa�s: 
*******************
Nome: b�snio (cir�lico, B�snia e Herzegovina)
C�digo da l�ngua: bs
L�ngua: b�snio
Cod Pa�s: BA
Pa�s: B�snia e Herzegovina
*******************
Nome: xhosa (latim, �frica do Sul)
C�digo da l�ngua: xh
L�ngua: xhosa
Cod Pa�s: ZA
Pa�s: �frica do Sul
*******************
Nome: taita (latim, Qu�nia)
C�digo da l�ngua: dav
L�ngua: taita
Cod Pa�s: KE
Pa�s: Qu�nia
*******************
Nome: eslovaco (Eslov�quia)
C�digo da l�ngua: sk
L�ngua: eslovaco
Cod Pa�s: SK
Pa�s: Eslov�quia
*******************
Nome: xhosa
C�digo da l�ngua: xh
L�ngua: xhosa
Cod Pa�s: 
Pa�s: 
*******************
Nome: koyra chiini (latim, Mali)
C�digo da l�ngua: khq
L�ngua: koyra chiini
Cod Pa�s: ML
Pa�s: Mali
*******************
Nome: mazandarani (�rabe, Ir�)
C�digo da l�ngua: mzn
L�ngua: mazandarani
Cod Pa�s: IR
Pa�s: Ir�
*******************
Nome: mongol (cir�lico, Mong�lia)
C�digo da l�ngua: mn
L�ngua: mongol
Cod Pa�s: MN
Pa�s: Mong�lia
*******************
Nome: uolofe (Senegal)
C�digo da l�ngua: wo
L�ngua: uolofe
Cod Pa�s: SN
Pa�s: Senegal
*******************
Nome: hau�� (latim, Nig�ria)
C�digo da l�ngua: ha
L�ngua: hau��
Cod Pa�s: NG
Pa�s: Nig�ria
*******************
Nome: franc�s (Haiti)
C�digo da l�ngua: fr
L�ngua: franc�s
Cod Pa�s: HT
Pa�s: Haiti
*******************
Nome: russo (cir�lico, R�ssia)
C�digo da l�ngua: ru
L�ngua: russo
Cod Pa�s: RU
Pa�s: R�ssia
*******************
Nome: t�lugo (�ndia)
C�digo da l�ngua: te
L�ngua: t�lugo
Cod Pa�s: IN
Pa�s: �ndia
*******************
Nome: massai (latim, Qu�nia)
C�digo da l�ngua: mas
L�ngua: massai
Cod Pa�s: KE
Pa�s: Qu�nia
*******************
Nome: holand�s (Sint Maarten)
C�digo da l�ngua: nl
L�ngua: holand�s
Cod Pa�s: SX
Pa�s: Sint Maarten
*******************
Nome: luri setentrional
C�digo da l�ngua: lrc
L�ngua: luri setentrional
Cod Pa�s: 
Pa�s: 
*******************
Nome: checheno
C�digo da l�ngua: ce
L�ngua: checheno
Cod Pa�s: 
Pa�s: 
*******************
Nome: franc�s (Rep�blica do Congo)
C�digo da l�ngua: fr
L�ngua: franc�s
Cod Pa�s: CG
Pa�s: Rep�blica do Congo
*******************
Nome: manx (latim, Ilha de Man)
C�digo da l�ngua: gv
L�ngua: manx
Cod Pa�s: IM
Pa�s: Ilha de Man
*******************
Nome: malt�s (Malta)
C�digo da l�ngua: mt
L�ngua: malt�s
Cod Pa�s: MT
Pa�s: Malta
*******************
Nome: coreano
C�digo da l�ngua: ko
L�ngua: coreano
Cod Pa�s: 
Pa�s: 
*******************
Nome: malaio (latim, Mal�sia)
C�digo da l�ngua: ms
L�ngua: malaio
Cod Pa�s: MY
Pa�s: Mal�sia
*******************
Nome: malaiala (malaiala, �ndia)
C�digo da l�ngua: ml
L�ngua: malaiala
Cod Pa�s: IN
Pa�s: �ndia
*******************
Nome: baixo alem�o (Pa�ses Baixos)
C�digo da l�ngua: nds
L�ngua: baixo alem�o
Cod Pa�s: NL
Pa�s: Pa�ses Baixos
*******************
Nome: tamazirte marroqino padr�o (tifinagh, Marrocos)
C�digo da l�ngua: zgh
L�ngua: tamazirte marroqino padr�o
Cod Pa�s: MA
Pa�s: Marrocos
*******************
Nome: akan
C�digo da l�ngua: ak
L�ngua: akan
Cod Pa�s: 
Pa�s: 
*******************
Nome: maconde
C�digo da l�ngua: kde
L�ngua: maconde
Cod Pa�s: 
Pa�s: 
*******************
Nome: dzonga
C�digo da l�ngua: dz
L�ngua: dzonga
Cod Pa�s: 
Pa�s: 
*******************
Nome: nyankole (latim, Uganda)
C�digo da l�ngua: nyn
L�ngua: nyankole
Cod Pa�s: UG
Pa�s: Uganda
*******************
Nome: ingl�s (Vanuatu)
C�digo da l�ngua: en
L�ngua: ingl�s
Cod Pa�s: VU
Pa�s: Vanuatu
*******************
Nome: interl�ngua
C�digo da l�ngua: ia
L�ngua: interl�ngua
Cod Pa�s: 
Pa�s: 
*******************
Nome: tongan�s (Tonga)
C�digo da l�ngua: to
L�ngua: tongan�s
Cod Pa�s: TO
Pa�s: Tonga
*******************
Nome: fula (latim, Serra Leoa)
C�digo da l�ngua: ff
L�ngua: fula
Cod Pa�s: SL
Pa�s: Serra Leoa
*******************
Nome: sena (Mo�ambique)
C�digo da l�ngua: seh
L�ngua: sena
Cod Pa�s: MZ
Pa�s: Mo�ambique
*******************
Nome: lusoga (latim, Uganda)
C�digo da l�ngua: xog
L�ngua: lusoga
Cod Pa�s: UG
Pa�s: Uganda
*******************
Nome: fula (Adlm, Senegal)
C�digo da l�ngua: ff
L�ngua: fula
Cod Pa�s: SN
Pa�s: Senegal
*******************
Nome: vietnamita (latim, Vietn�)
C�digo da l�ngua: vi
L�ngua: vietnamita
Cod Pa�s: VN
Pa�s: Vietn�
*******************
Nome: sundan�s (Indon�sia)
C�digo da l�ngua: su
L�ngua: sundan�s
Cod Pa�s: ID
Pa�s: Indon�sia
*******************
Nome: nguemba (latim, Camar�es)
C�digo da l�ngua: jgo
L�ngua: nguemba
Cod Pa�s: CM
Pa�s: Camar�es
*******************
Nome: sichuan yi (China)
C�digo da l�ngua: ii
L�ngua: sichuan yi
Cod Pa�s: CN
Pa�s: China
*******************
Nome: panjabi (�rabe, Paquist�o)
C�digo da l�ngua: pa
L�ngua: panjabi
Cod Pa�s: PK
Pa�s: Paquist�o
*******************
Nome: franc�s (Reuni�o)
C�digo da l�ngua: fr
L�ngua: franc�s
Cod Pa�s: RE
Pa�s: Reuni�o
*******************
Nome: bengali (�ndia)
C�digo da l�ngua: bn
L�ngua: bengali
Cod Pa�s: IN
Pa�s: �ndia
*******************
Nome: franc�s (Guadalupe)
C�digo da l�ngua: fr
L�ngua: franc�s
Cod Pa�s: GP
Pa�s: Guadalupe
*******************
Nome: panjabi
C�digo da l�ngua: pa
L�ngua: panjabi
Cod Pa�s: 
Pa�s: 
*******************
Nome: tamazirte marroqino padr�o (Marrocos)
C�digo da l�ngua: zgh
L�ngua: tamazirte marroqino padr�o
Cod Pa�s: MA
Pa�s: Marrocos
*******************
Nome: ucraniano (Ucr�nia)
C�digo da l�ngua: uk
L�ngua: ucraniano
Cod Pa�s: UA
Pa�s: Ucr�nia
*******************
Nome: rwa
C�digo da l�ngua: rwk
L�ngua: rwa
Cod Pa�s: 
Pa�s: 
*******************
Nome: rundi
C�digo da l�ngua: rn
L�ngua: rundi
Cod Pa�s: 
Pa�s: 
*******************
Nome: tadjique
C�digo da l�ngua: tg
L�ngua: tadjique
Cod Pa�s: 
Pa�s: 
*******************
Nome: h�ngaro
C�digo da l�ngua: hu
L�ngua: h�ngaro
Cod Pa�s: 
Pa�s: 
*******************
Nome: franc�s (Su��a)
C�digo da l�ngua: fr
L�ngua: franc�s
Cod Pa�s: CH
Pa�s: Su��a
*******************
Nome: luganda (latim, Uganda)
C�digo da l�ngua: lg
L�ngua: luganda
Cod Pa�s: UG
Pa�s: Uganda
*******************
Nome: cebuano (latim, Filipinas)
C�digo da l�ngua: ceb
L�ngua: cebuano
Cod Pa�s: PH
Pa�s: Filipinas
*******************
Nome: ingl�s (Ilha Norfolk)
C�digo da l�ngua: en
L�ngua: ingl�s
Cod Pa�s: NF
Pa�s: Ilha Norfolk
*******************
Nome: tasawaq
C�digo da l�ngua: twq
L�ngua: tasawaq
Cod Pa�s: 
Pa�s: 
*******************
Nome: s�rvio (cir�lico, Kosovo)
C�digo da l�ngua: sr
L�ngua: s�rvio
Cod Pa�s: XK
Pa�s: Kosovo
*******************
Nome: bambara
C�digo da l�ngua: bm
L�ngua: bambara
Cod Pa�s: 
Pa�s: 
*******************
Nome: bokm�l noruegu�s (latim, Noruega)
C�digo da l�ngua: nb
L�ngua: bokm�l noruegu�s
Cod Pa�s: NO
Pa�s: Noruega
*******************
Nome: �rabe (Sud�o do Sul)
C�digo da l�ngua: ar
L�ngua: �rabe
Cod Pa�s: SS
Pa�s: Sud�o do Sul
*******************
Nome: ingl�s (Guam)
C�digo da l�ngua: en
L�ngua: ingl�s
Cod Pa�s: GU
Pa�s: Guam
*******************
Nome: holand�s (Aruba)
C�digo da l�ngua: nl
L�ngua: holand�s
Cod Pa�s: AW
Pa�s: Aruba
*******************
Nome: ingl�s (Anguila)
C�digo da l�ngua: en
L�ngua: ingl�s
Cod Pa�s: AI
Pa�s: Anguila
*******************
Nome: fr�sio ocidental (latim, Pa�ses Baixos)
C�digo da l�ngua: fy
L�ngua: fr�sio ocidental
Cod Pa�s: NL
Pa�s: Pa�ses Baixos
*******************
Nome: lusoga (Uganda)
C�digo da l�ngua: xog
L�ngua: lusoga
Cod Pa�s: UG
Pa�s: Uganda
*******************
Nome: ingl�s (Camar�es)
C�digo da l�ngua: en
L�ngua: ingl�s
Cod Pa�s: CM
Pa�s: Camar�es
*******************
Nome: tcheco (Tch�quia)
C�digo da l�ngua: cs
L�ngua: tcheco
Cod Pa�s: CZ
Pa�s: Tch�quia
*******************
Nome: turco
C�digo da l�ngua: tr
L�ngua: turco
Cod Pa�s: 
Pa�s: 
*******************
Nome: catal�o (Espanha)
C�digo da l�ngua: ca
L�ngua: catal�o
Cod Pa�s: ES
Pa�s: Espanha
*******************
Nome: h�ngaro (latim, Hungria)
C�digo da l�ngua: hu
L�ngua: h�ngaro
Cod Pa�s: HU
Pa�s: Hungria
*******************
Nome: romanche (Su��a)
C�digo da l�ngua: rm
L�ngua: romanche
Cod Pa�s: CH
Pa�s: Su��a
*******************
Nome: russo (Mold�via)
C�digo da l�ngua: ru
L�ngua: russo
Cod Pa�s: MD
Pa�s: Mold�via
*******************
Nome: fula (latim, Senegal)
C�digo da l�ngua: ff
L�ngua: fula
Cod Pa�s: SN
Pa�s: Senegal
*******************
Nome: ingl�s (Tonga)
C�digo da l�ngua: en
L�ngua: ingl�s
Cod Pa�s: TO
Pa�s: Tonga
*******************
Nome: fula (Adlm, Serra Leoa)
C�digo da l�ngua: ff
L�ngua: fula
Cod Pa�s: SL
Pa�s: Serra Leoa
*******************
Nome: ingl�s (Papua-Nova Guin�)
C�digo da l�ngua: en
L�ngua: ingl�s
Cod Pa�s: PG
Pa�s: Papua-Nova Guin�
*******************
Nome: estoniano (latim, Est�nia)
C�digo da l�ngua: et
L�ngua: estoniano
Cod Pa�s: EE
Pa�s: Est�nia
*******************
Nome: franc�s (Rep�blica Centro-Africana)
C�digo da l�ngua: fr
L�ngua: franc�s
Cod Pa�s: CF
Pa�s: Rep�blica Centro-Africana
*******************
Nome: portugu�s (Timor-Leste)
C�digo da l�ngua: pt
L�ngua: portugu�s
Cod Pa�s: TL
Pa�s: Timor-Leste
*******************
Nome: ingl�s (Eritreia)
C�digo da l�ngua: en
L�ngua: ingl�s
Cod Pa�s: ER
Pa�s: Eritreia
*******************
Nome: s�rvio (B�snia e Herzegovina)
C�digo da l�ngua: sr
L�ngua: s�rvio
Cod Pa�s: BA
Pa�s: B�snia e Herzegovina
*******************
Nome: espanhol (Paraguai)
C�digo da l�ngua: es
L�ngua: espanhol
Cod Pa�s: PY
Pa�s: Paraguai
*******************
Nome: concani (�ndia)
C�digo da l�ngua: kok
L�ngua: concani
Cod Pa�s: IN
Pa�s: �ndia
*******************
Nome: bielorrusso (cir�lico, Bielorr�ssia)
C�digo da l�ngua: be
L�ngua: bielorrusso
Cod Pa�s: BY
Pa�s: Bielorr�ssia
*******************
Nome: franc�s (Togo)
C�digo da l�ngua: fr
L�ngua: franc�s
Cod Pa�s: TG
Pa�s: Togo
*******************
Nome: dzonga (tibetano, But�o)
C�digo da l�ngua: dz
L�ngua: dzonga
Cod Pa�s: BT
Pa�s: But�o
*******************
Nome: s�rvio (latim, Kosovo)
C�digo da l�ngua: sr
L�ngua: s�rvio
Cod Pa�s: XK
Pa�s: Kosovo
*******************
Nome: ingl�s (Filipinas)
C�digo da l�ngua: en
L�ngua: ingl�s
Cod Pa�s: PH
Pa�s: Filipinas
*******************
Nome: igbo (Nig�ria)
C�digo da l�ngua: ig
L�ngua: igbo
Cod Pa�s: NG
Pa�s: Nig�ria
*******************
Nome: franc�s (Guin�)
C�digo da l�ngua: fr
L�ngua: franc�s
Cod Pa�s: GN
Pa�s: Guin�
*******************
Nome: ga�lico escoc�s (latim, Reino Unido)
C�digo da l�ngua: gd
L�ngua: ga�lico escoc�s
Cod Pa�s: GB
Pa�s: Reino Unido
*******************
Nome: chin�s (simplificado, Macau, RAE da China)
C�digo da l�ngua: zh
L�ngua: chin�s
Cod Pa�s: MO
Pa�s: Macau, RAE da China
*******************
Nome: santali (ol chiki)
C�digo da l�ngua: sat
L�ngua: santali
Cod Pa�s: 
Pa�s: 
*******************
Nome: sami setentrional (Finl�ndia)
C�digo da l�ngua: se
L�ngua: sami setentrional
Cod Pa�s: FI
Pa�s: Finl�ndia
*******************
Nome: fula
C�digo da l�ngua: ff
L�ngua: fula
Cod Pa�s: 
Pa�s: 
*******************
Nome: ingl�s (Ilhas Cook)
C�digo da l�ngua: en
L�ngua: ingl�s
Cod Pa�s: CK
Pa�s: Ilhas Cook
*******************
Nome: �rabe (Marrocos)
C�digo da l�ngua: ar
L�ngua: �rabe
Cod Pa�s: MA
Pa�s: Marrocos
*******************
Nome: havaiano (latim, Estados Unidos)
C�digo da l�ngua: haw
L�ngua: havaiano
Cod Pa�s: US
Pa�s: Estados Unidos
*******************
Nome: ingl�s (Ant�gua e Barbuda)
C�digo da l�ngua: en
L�ngua: ingl�s
Cod Pa�s: AG
Pa�s: Ant�gua e Barbuda
*******************
Nome: franc�s (Chade)
C�digo da l�ngua: fr
L�ngua: franc�s
Cod Pa�s: TD
Pa�s: Chade
*******************
Nome: embu (Qu�nia)
C�digo da l�ngua: ebu
L�ngua: embu
Cod Pa�s: KE
Pa�s: Qu�nia
*******************
Nome: lituano (latim, Litu�nia)
C�digo da l�ngua: lt
L�ngua: lituano
Cod Pa�s: LT
Pa�s: Litu�nia
*******************
Nome: bemba (Z�mbia)
C�digo da l�ngua: bem
L�ngua: bemba
Cod Pa�s: ZM
Pa�s: Z�mbia
*******************
Nome: ewondo (latim, Camar�es)
C�digo da l�ngua: ewo
L�ngua: ewondo
Cod Pa�s: CM
Pa�s: Camar�es
*******************
Nome: lusoga
C�digo da l�ngua: xog
L�ngua: lusoga
Cod Pa�s: 
Pa�s: 
*******************
Nome: ewondo (Camar�es)
C�digo da l�ngua: ewo
L�ngua: ewondo
Cod Pa�s: CM
Pa�s: Camar�es
*******************
Nome: franc�s (Congo - Kinshasa)
C�digo da l�ngua: fr
L�ngua: franc�s
Cod Pa�s: CD
Pa�s: Congo - Kinshasa
*******************
Nome: rundi (Burundi)
C�digo da l�ngua: rn
L�ngua: rundi
Cod Pa�s: BI
Pa�s: Burundi
*******************
Nome: ingl�s (Nam�bia)
C�digo da l�ngua: en
L�ngua: ingl�s
Cod Pa�s: NA
Pa�s: Nam�bia
*******************
Nome: meta� (latim, Camar�es)
C�digo da l�ngua: mgo
L�ngua: meta�
Cod Pa�s: CM
Pa�s: Camar�es
*******************
Nome: malaio
C�digo da l�ngua: ms
L�ngua: malaio
Cod Pa�s: 
Pa�s: 
*******************
Nome: uigur
C�digo da l�ngua: ug
L�ngua: uigur
Cod Pa�s: 
Pa�s: 
*******************
Nome: catal�o (It�lia)
C�digo da l�ngua: ca
L�ngua: catal�o
Cod Pa�s: IT
Pa�s: It�lia
*******************
Nome: qu�chua (latim, Peru)
C�digo da l�ngua: qu
L�ngua: qu�chua
Cod Pa�s: PE
Pa�s: Peru
*******************
Nome: langi (Tanz�nia)
C�digo da l�ngua: lag
L�ngua: langi
Cod Pa�s: TZ
Pa�s: Tanz�nia
*******************
Nome: indon�sio (Indon�sia)
C�digo da l�ngua: id
L�ngua: indon�sio
Cod Pa�s: ID
Pa�s: Indon�sia
*******************
Nome: teso (Qu�nia)
C�digo da l�ngua: teo
L�ngua: teso
Cod Pa�s: KE
Pa�s: Qu�nia
*******************
Nome: catal�o (Andorra)
C�digo da l�ngua: ca
L�ngua: catal�o
Cod Pa�s: AD
Pa�s: Andorra
*******************
Nome: qu�chua (Bol�via)
C�digo da l�ngua: qu
L�ngua: qu�chua
Cod Pa�s: BO
Pa�s: Bol�via
*******************
Nome: havaiano (Estados Unidos)
C�digo da l�ngua: haw
L�ngua: havaiano
Cod Pa�s: US
Pa�s: Estados Unidos
*******************
Nome: vietnamita
C�digo da l�ngua: vi
L�ngua: vietnamita
Cod Pa�s: 
Pa�s: 
*******************
Nome: franc�s (Canad�)
C�digo da l�ngua: fr
L�ngua: franc�s
Cod Pa�s: CA
Pa�s: Canad�
*******************
Nome: crioulo cabo-verdiano (latim, Cabo Verde)
C�digo da l�ngua: kea
L�ngua: crioulo cabo-verdiano
Cod Pa�s: CV
Pa�s: Cabo Verde
*******************
Nome: alban�s (Kosovo)
C�digo da l�ngua: sq
L�ngua: alban�s
Cod Pa�s: XK
Pa�s: Kosovo
*******************
Nome: jola-fonyi
C�digo da l�ngua: dyo
L�ngua: jola-fonyi
Cod Pa�s: 
Pa�s: 
*******************
Nome: maori (latim, Nova Zel�ndia)
C�digo da l�ngua: mi
L�ngua: maori
Cod Pa�s: NZ
Pa�s: Nova Zel�ndia
*******************
Nome: ingl�s (Ilhas Cayman)
C�digo da l�ngua: en
L�ngua: ingl�s
Cod Pa�s: KY
Pa�s: Ilhas Cayman
*******************
Nome: italiano (Su��a)
C�digo da l�ngua: it
L�ngua: italiano
Cod Pa�s: CH
Pa�s: Su��a
*******************
Nome: cingal�s (Sri Lanka)
C�digo da l�ngua: si
L�ngua: cingal�s
Cod Pa�s: LK
Pa�s: Sri Lanka
*******************
Nome: luo (Qu�nia)
C�digo da l�ngua: luo
L�ngua: luo
Cod Pa�s: KE
Pa�s: Qu�nia
*******************
Nome: ingl�s (Emirados �rabes Unidos)
C�digo da l�ngua: en
L�ngua: ingl�s
Cod Pa�s: AE
Pa�s: Emirados �rabes Unidos
*******************
Nome: italiano (It�lia)
C�digo da l�ngua: it
L�ngua: italiano
Cod Pa�s: IT
Pa�s: It�lia
*******************
Nome: esperanto
C�digo da l�ngua: eo
L�ngua: esperanto
Cod Pa�s: 
Pa�s: 
*******************
Nome: �rabe (Som�lia)
C�digo da l�ngua: ar
L�ngua: �rabe
Cod Pa�s: SO
Pa�s: Som�lia
*******************
Nome: ingl�s (Zimb�bue)
C�digo da l�ngua: en
L�ngua: ingl�s
Cod Pa�s: ZW
Pa�s: Zimb�bue
*******************
Nome: nynorsk noruegu�s (Noruega)
C�digo da l�ngua: nn
L�ngua: nynorsk noruegu�s
Cod Pa�s: NO
Pa�s: Noruega
*******************
Nome: franc�s (Maur�cio)
C�digo da l�ngua: fr
L�ngua: franc�s
Cod Pa�s: MU
Pa�s: Maur�cio
*******************
Nome: polon�s
C�digo da l�ngua: pl
L�ngua: polon�s
Cod Pa�s: 
Pa�s: 
*******************
Nome: sami setentrional (Su�cia)
C�digo da l�ngua: se
L�ngua: sami setentrional
Cod Pa�s: SE
Pa�s: Su�cia
*******************
Nome: ingl�s (Tokelau)
C�digo da l�ngua: en
L�ngua: ingl�s
Cod Pa�s: TK
Pa�s: Tokelau
*******************
Nome: mundang (Camar�es)
C�digo da l�ngua: mua
L�ngua: mundang
Cod Pa�s: CM
Pa�s: Camar�es
*******************
Nome: urdu
C�digo da l�ngua: ur
L�ngua: urdu
Cod Pa�s: 
Pa�s: 
*******************
Nome: uzbeque (�rabe)
C�digo da l�ngua: uz
L�ngua: uzbeque
Cod Pa�s: 
Pa�s: 
*******************
Nome: samburu (Qu�nia)
C�digo da l�ngua: saq
L�ngua: samburu
Cod Pa�s: KE
Pa�s: Qu�nia
*******************
Nome: portugu�s (Guin�-Bissau)
C�digo da l�ngua: pt
L�ngua: portugu�s
Cod Pa�s: GW
Pa�s: Guin�-Bissau
*******************
Nome: sami setentrional
C�digo da l�ngua: se
L�ngua: sami setentrional
Cod Pa�s: 
Pa�s: 
*******************
Nome: xona (latim, Zimb�bue)
C�digo da l�ngua: sn
L�ngua: xona
Cod Pa�s: ZW
Pa�s: Zimb�bue
*******************
Nome: malaio (Singapura)
C�digo da l�ngua: ms
L�ngua: malaio
Cod Pa�s: SG
Pa�s: Singapura
*******************
Nome: ewe (Togo)
C�digo da l�ngua: ee
L�ngua: ewe
Cod Pa�s: TG
Pa�s: Togo
*******************
Nome: lingala (Angola)
C�digo da l�ngua: ln
L�ngua: lingala
Cod Pa�s: AO
Pa�s: Angola
*******************
Nome: bielorrusso (Bielorr�ssia)
C�digo da l�ngua: be
L�ngua: bielorrusso
Cod Pa�s: BY
Pa�s: Bielorr�ssia
*******************
Nome: canton�s (tradicional)
C�digo da l�ngua: yue
L�ngua: canton�s
Cod Pa�s: 
Pa�s: 
*******************
Nome: khmer (khmer, Camboja)
C�digo da l�ngua: km
L�ngua: khmer
Cod Pa�s: KH
Pa�s: Camboja
*******************
Nome: italiano (latim, It�lia)
C�digo da l�ngua: it
L�ngua: italiano
Cod Pa�s: IT
Pa�s: It�lia
*******************
Nome: luyia
C�digo da l�ngua: luy
L�ngua: luyia
Cod Pa�s: 
Pa�s: 
*******************
Nome: portugu�s (Cabo Verde)
C�digo da l�ngua: pt
L�ngua: portugu�s
Cod Pa�s: CV
Pa�s: Cabo Verde
*******************
Nome: ucraniano
C�digo da l�ngua: uk
L�ngua: ucraniano
Cod Pa�s: 
Pa�s: 
*******************
Nome: espanhol (Porto Rico)
C�digo da l�ngua: es
L�ngua: espanhol
Cod Pa�s: PR
Pa�s: Porto Rico
*******************
Nome: mazandarani
C�digo da l�ngua: mzn
L�ngua: mazandarani
Cod Pa�s: 
Pa�s: 
*******************
Nome: walser (Su��a)
C�digo da l�ngua: wae
L�ngua: walser
Cod Pa�s: CH
Pa�s: Su��a
*******************
Nome: t�rtaro
C�digo da l�ngua: tt
L�ngua: t�rtaro
Cod Pa�s: 
Pa�s: 
*******************
Nome: russo (Bielorr�ssia)
C�digo da l�ngua: ru
L�ngua: russo
Cod Pa�s: BY
Pa�s: Bielorr�ssia
*******************
Nome: fero�s (Dinamarca)
C�digo da l�ngua: fo
L�ngua: fero�s
Cod Pa�s: DK
Pa�s: Dinamarca
*******************
Nome: ewe (Gana)
C�digo da l�ngua: ee
L�ngua: ewe
Cod Pa�s: GH
Pa�s: Gana
*******************
Nome: �rabe (Barein)
C�digo da l�ngua: ar
L�ngua: �rabe
Cod Pa�s: BH
Pa�s: Barein
*******************
Nome: cazaque (cir�lico, Cazaquist�o)
C�digo da l�ngua: kk
L�ngua: cazaque
Cod Pa�s: KZ
Pa�s: Cazaquist�o
*******************
Nome: uigur (�rabe, China)
C�digo da l�ngua: ug
L�ngua: uigur
Cod Pa�s: CN
Pa�s: China
*******************
Nome: h�ndi (�ndia)
C�digo da l�ngua: hi
L�ngua: h�ndi
Cod Pa�s: IN
Pa�s: �ndia
*******************
Nome: ingl�s (Su��a)
C�digo da l�ngua: en
L�ngua: ingl�s
Cod Pa�s: CH
Pa�s: Su��a
*******************
Nome: samburu (latim, Qu�nia)
C�digo da l�ngua: saq
L�ngua: samburu
Cod Pa�s: KE
Pa�s: Qu�nia
*******************
Nome: asu
C�digo da l�ngua: asa
L�ngua: asu
Cod Pa�s: 
Pa�s: 
*******************
Nome: fero�s (Ilhas Faro�)
C�digo da l�ngua: fo
L�ngua: fero�s
Cod Pa�s: FO
Pa�s: Ilhas Faro�
*******************
Nome: iorub� (Benin)
C�digo da l�ngua: yo
L�ngua: iorub�
Cod Pa�s: BJ
Pa�s: Benin
*******************
Nome: asturiano (Espanha)
C�digo da l�ngua: ast
L�ngua: asturiano
Cod Pa�s: ES
Pa�s: Espanha
*******************
Nome: franc�s (Comores)
C�digo da l�ngua: fr
L�ngua: franc�s
Cod Pa�s: KM
Pa�s: Comores
*******************
Nome: franc�s (Martinica)
C�digo da l�ngua: fr
L�ngua: franc�s
Cod Pa�s: MQ
Pa�s: Martinica
*******************
Nome: espanhol (Argentina)
C�digo da l�ngua: es
L�ngua: espanhol
Cod Pa�s: AR
Pa�s: Argentina
*******************
Nome: fula (latim)
C�digo da l�ngua: ff
L�ngua: fula
Cod Pa�s: 
Pa�s: 
*******************
Nome: dogri (devan�gari, �ndia)
C�digo da l�ngua: doi
L�ngua: dogri
Cod Pa�s: IN
Pa�s: �ndia
*******************
Nome: ingl�s (Mal�sia)
C�digo da l�ngua: en
L�ngua: ingl�s
Cod Pa�s: MY
Pa�s: Mal�sia
*******************
Nome: sangu (Tanz�nia)
C�digo da l�ngua: sbp
L�ngua: sangu
Cod Pa�s: TZ
Pa�s: Tanz�nia
*******************
Nome: embu (latim, Qu�nia)
C�digo da l�ngua: ebu
L�ngua: embu
Cod Pa�s: KE
Pa�s: Qu�nia
*******************
Nome: uzbeque (cir�lico)
C�digo da l�ngua: uz
L�ngua: uzbeque
Cod Pa�s: 
Pa�s: 
*******************
Nome: filipino
C�digo da l�ngua: fil
L�ngua: filipino
Cod Pa�s: 
Pa�s: 
*******************
Nome: canton�s (tradicional, Hong Kong, RAE da China)
C�digo da l�ngua: yue
L�ngua: canton�s
Cod Pa�s: HK
Pa�s: Hong Kong, RAE da China
*******************
Nome: arm�nio (Arm�nia)
C�digo da l�ngua: hy
L�ngua: arm�nio
Cod Pa�s: AM
Pa�s: Arm�nia
*******************
Nome: ingl�s (G�mbia)
C�digo da l�ngua: en
L�ngua: ingl�s
Cod Pa�s: GM
Pa�s: G�mbia
*******************
Nome: fero�s
C�digo da l�ngua: fo
L�ngua: fero�s
Cod Pa�s: 
Pa�s: 
*******************
Nome: shambala (latim, Tanz�nia)
C�digo da l�ngua: ksb
L�ngua: shambala
Cod Pa�s: TZ
Pa�s: Tanz�nia
*******************
Nome: nepal�s (Nepal)
C�digo da l�ngua: ne
L�ngua: nepal�s
Cod Pa�s: NP
Pa�s: Nepal
*******************
Nome: friulano (It�lia)
C�digo da l�ngua: fur
L�ngua: friulano
Cod Pa�s: IT
Pa�s: It�lia
*******************
Nome: t�mil (�ndia)
C�digo da l�ngua: ta
L�ngua: t�mil
Cod Pa�s: IN
Pa�s: �ndia
*******************
Nome: franc�s (Guiana Francesa)
C�digo da l�ngua: fr
L�ngua: franc�s
Cod Pa�s: GF
Pa�s: Guiana Francesa
*******************
Nome: lacota
C�digo da l�ngua: lkt
L�ngua: lacota
Cod Pa�s: 
Pa�s: 
*******************
Nome: indon�sio (latim, Indon�sia)
C�digo da l�ngua: id
L�ngua: indon�sio
Cod Pa�s: ID
Pa�s: Indon�sia
*******************
Nome: island�s
C�digo da l�ngua: is
L�ngua: island�s
Cod Pa�s: 
Pa�s: 
*******************
Nome: portugu�s (Angola)
C�digo da l�ngua: pt
L�ngua: portugu�s
Cod Pa�s: AO
Pa�s: Angola
*******************
Nome: t�lugo (t�lugo, �ndia)
C�digo da l�ngua: te
L�ngua: t�lugo
Cod Pa�s: IN
Pa�s: �ndia
*******************
Nome: cingal�s
C�digo da l�ngua: si
L�ngua: cingal�s
Cod Pa�s: 
Pa�s: 
*******************
Nome: ingl�s (Mundo)
C�digo da l�ngua: en
L�ngua: ingl�s
Cod Pa�s: 001
Pa�s: Mundo
*******************
Nome: duala (latim, Camar�es)
C�digo da l�ngua: dua
L�ngua: duala
Cod Pa�s: CM
Pa�s: Camar�es
*******************
Nome: javan�s (Indon�sia)
C�digo da l�ngua: jv
L�ngua: javan�s
Cod Pa�s: ID
Pa�s: Indon�sia
*******************
Nome: langi (latim, Tanz�nia)
C�digo da l�ngua: lag
L�ngua: langi
Cod Pa�s: TZ
Pa�s: Tanz�nia
*******************
Nome: russo (Quirguist�o)
C�digo da l�ngua: ru
L�ngua: russo
Cod Pa�s: KG
Pa�s: Quirguist�o
*******************
Nome: franc�s (Maurit�nia)
C�digo da l�ngua: fr
L�ngua: franc�s
Cod Pa�s: MR
Pa�s: Maurit�nia
*******************
Nome: bafia (latim, Camar�es)
C�digo da l�ngua: ksf
L�ngua: bafia
Cod Pa�s: CM
Pa�s: Camar�es
*******************
Nome: caxemira
C�digo da l�ngua: ks
L�ngua: caxemira
Cod Pa�s: 
Pa�s: 
*******************
Nome: chin�s (tradicional, Taiwan)
C�digo da l�ngua: zh
L�ngua: chin�s
Cod Pa�s: TW
Pa�s: Taiwan
*******************
Nome: fula (latim, Burquina Faso)
C�digo da l�ngua: ff
L�ngua: fula
Cod Pa�s: BF
Pa�s: Burquina Faso
*******************
Nome: assam�s (�ndia)
C�digo da l�ngua: as
L�ngua: assam�s
Cod Pa�s: IN
Pa�s: �ndia
*******************
Nome: chin�s (Hong Kong, RAE da China)
C�digo da l�ngua: zh
L�ngua: chin�s
Cod Pa�s: HK
Pa�s: Hong Kong, RAE da China
*******************
Nome: sua�li (Qu�nia)
C�digo da l�ngua: sw
L�ngua: sua�li
Cod Pa�s: KE
Pa�s: Qu�nia
*******************
Nome: tailand�s (Tail�ndia)
C�digo da l�ngua: th
L�ngua: tailand�s
Cod Pa�s: TH
Pa�s: Tail�ndia
*******************
Nome: assam�s (bengali, �ndia)
C�digo da l�ngua: as
L�ngua: assam�s
Cod Pa�s: IN
Pa�s: �ndia
*******************
Nome: machame
C�digo da l�ngua: jmc
L�ngua: machame
Cod Pa�s: 
Pa�s: 
*******************
Nome: canton�s
C�digo da l�ngua: yue
L�ngua: canton�s
Cod Pa�s: 
Pa�s: 
*******************
Nome: ingl�s (Malaui)
C�digo da l�ngua: en
L�ngua: ingl�s
Cod Pa�s: MW
Pa�s: Malaui
*******************
Nome: nama (Nam�bia)
C�digo da l�ngua: naq
L�ngua: nama
Cod Pa�s: NA
Pa�s: Nam�bia
*******************
Nome: ingl�s (Territ�rio Brit�nico do Oceano �ndico)
C�digo da l�ngua: en
L�ngua: ingl�s
Cod Pa�s: IO
Pa�s: Territ�rio Brit�nico do Oceano �ndico
*******************
Nome: �rabe (Catar)
C�digo da l�ngua: ar
L�ngua: �rabe
Cod Pa�s: QA
Pa�s: Catar
*******************
Nome: �rabe (�rabe, Egito)
C�digo da l�ngua: ar
L�ngua: �rabe
Cod Pa�s: EG
Pa�s: Egito
*******************
Nome: ingl�s (Ilhas Cocos (Keeling))
C�digo da l�ngua: en
L�ngua: ingl�s
Cod Pa�s: CC
Pa�s: Ilhas Cocos (Keeling)
*******************
Nome: portugu�s (Portugal)
C�digo da l�ngua: pt
L�ngua: portugu�s
Cod Pa�s: PT
Pa�s: Portugal
*******************
Nome: eslovaco (latim, Eslov�quia)
C�digo da l�ngua: sk
L�ngua: eslovaco
Cod Pa�s: SK
Pa�s: Eslov�quia
*******************
Nome: azerbaijano (cir�lico, Azerbaij�o)
C�digo da l�ngua: az
L�ngua: azerbaijano
Cod Pa�s: AZ
Pa�s: Azerbaij�o
*******************
Nome: curdo central (Iraque)
C�digo da l�ngua: ckb
L�ngua: curdo central
Cod Pa�s: IQ
Pa�s: Iraque
*******************
Nome: tachelhit (latim, Marrocos)
C�digo da l�ngua: shi
L�ngua: tachelhit
Cod Pa�s: MA
Pa�s: Marrocos
*******************
Nome: espanhol (Cuba)
C�digo da l�ngua: es
L�ngua: espanhol
Cod Pa�s: CU
Pa�s: Cuba
*******************
Nome: �rabe
C�digo da l�ngua: ar
L�ngua: �rabe
Cod Pa�s: 
Pa�s: 
*******************
Nome: ingl�s (Ilhas Virgens Americanas)
C�digo da l�ngua: en
L�ngua: ingl�s
Cod Pa�s: VI
Pa�s: Ilhas Virgens Americanas
*******************
Nome: havaiano
C�digo da l�ngua: haw
L�ngua: havaiano
Cod Pa�s: 
Pa�s: 
*******************
Nome: basco (Espanha)
C�digo da l�ngua: eu
L�ngua: basco
Cod Pa�s: ES
Pa�s: Espanha
*******************
Nome: basa
C�digo da l�ngua: bas
L�ngua: basa
Cod Pa�s: 
Pa�s: 
*******************
Nome: igbo (latim, Nig�ria)
C�digo da l�ngua: ig
L�ngua: igbo
Cod Pa�s: NG
Pa�s: Nig�ria
*******************
Nome: grego (Gr�cia)
C�digo da l�ngua: el
L�ngua: grego
Cod Pa�s: GR
Pa�s: Gr�cia
*******************
Nome: uzbeque (latim)
C�digo da l�ngua: uz
L�ngua: uzbeque
Cod Pa�s: 
Pa�s: 
*******************
Nome: yangben (Camar�es)
C�digo da l�ngua: yav
L�ngua: yangben
Cod Pa�s: CM
Pa�s: Camar�es
*******************
Nome: sango
C�digo da l�ngua: sg
L�ngua: sango
Cod Pa�s: 
Pa�s: 
*******************
Nome: dinamarqu�s (Groenl�ndia)
C�digo da l�ngua: da
L�ngua: dinamarqu�s
Cod Pa�s: GL
Pa�s: Groenl�ndia
*******************
Nome: khmer (Camboja)
C�digo da l�ngua: km
L�ngua: khmer
Cod Pa�s: KH
Pa�s: Camboja
*******************
Nome: curdo central (Ir�)
C�digo da l�ngua: ckb
L�ngua: curdo central
Cod Pa�s: IR
Pa�s: Ir�
*******************
Nome: holand�s
C�digo da l�ngua: nl
L�ngua: holand�s
Cod Pa�s: 
Pa�s: 
*******************
Nome: caxemira (�rabe, �ndia)
C�digo da l�ngua: ks
L�ngua: caxemira
Cod Pa�s: IN
Pa�s: �ndia
*******************
Nome: catal�o (Espanha, valenciano)
C�digo da l�ngua: ca
L�ngua: catal�o
Cod Pa�s: ES
Pa�s: Espanha
*******************
Nome: uolofe (latim, Senegal)
C�digo da l�ngua: wo
L�ngua: uolofe
Cod Pa�s: SN
Pa�s: Senegal
*******************
Nome: sindi (devan�gari, �ndia)
C�digo da l�ngua: sd
L�ngua: sindi
Cod Pa�s: IN
Pa�s: �ndia
*******************
Nome: marati (devan�gari, �ndia)
C�digo da l�ngua: mr
L�ngua: marati
Cod Pa�s: IN
Pa�s: �ndia
*******************
Nome: espanhol (Costa Rica)
C�digo da l�ngua: es
L�ngua: espanhol
Cod Pa�s: CR
Pa�s: Costa Rica
*******************
Nome: franc�s (Gab�o)
C�digo da l�ngua: fr
L�ngua: franc�s
Cod Pa�s: GA
Pa�s: Gab�o
*******************
Nome: s�rvio
C�digo da l�ngua: sr
L�ngua: s�rvio
Cod Pa�s: 
Pa�s: 
*******************
Nome: �rabe (L�bia)
C�digo da l�ngua: ar
L�ngua: �rabe
Cod Pa�s: LY
Pa�s: L�bia
*******************
Nome: ingl�s (Maur�cio)
C�digo da l�ngua: en
L�ngua: ingl�s
Cod Pa�s: MU
Pa�s: Maur�cio
*******************
Nome: galego (Espanha)
C�digo da l�ngua: gl
L�ngua: galego
Cod Pa�s: ES
Pa�s: Espanha
*******************
Nome: azerbaijano (latim, Azerbaij�o)
C�digo da l�ngua: az
L�ngua: azerbaijano
Cod Pa�s: AZ
Pa�s: Azerbaij�o
*******************
Nome: ingl�s (Ilha de Man)
C�digo da l�ngua: en
L�ngua: ingl�s
Cod Pa�s: IM
Pa�s: Ilha de Man
*******************
Nome: alem�o (Su��a) (latim, Su��a)
C�digo da l�ngua: gsw
L�ngua: alem�o (Su��a)
Cod Pa�s: CH
Pa�s: Su��a
*******************
Nome: sena (latim, Mo�ambique)
C�digo da l�ngua: seh
L�ngua: sena
Cod Pa�s: MZ
Pa�s: Mo�ambique
*******************
Nome: ingl�s (Gibraltar)
C�digo da l�ngua: en
L�ngua: ingl�s
Cod Pa�s: GI
Pa�s: Gibraltar
*******************
Nome: ingl�s (Canad�)
C�digo da l�ngua: en
L�ngua: ingl�s
Cod Pa�s: CA
Pa�s: Canad�
*******************
Nome: ga�lico escoc�s
C�digo da l�ngua: gd
L�ngua: ga�lico escoc�s
Cod Pa�s: 
Pa�s: 
*******************
Nome: cheroqui (cherokee, Estados Unidos)
C�digo da l�ngua: chr
L�ngua: cheroqui
Cod Pa�s: US
Pa�s: Estados Unidos
*******************
Nome: franc�s (S�ria)
C�digo da l�ngua: fr
L�ngua: franc�s
Cod Pa�s: SY
Pa�s: S�ria
*******************
Nome: ori� (ori�, �ndia)
C�digo da l�ngua: or
L�ngua: ori�
Cod Pa�s: IN
Pa�s: �ndia
*******************
Nome: somali (Eti�pia)
C�digo da l�ngua: so
L�ngua: somali
Cod Pa�s: ET
Pa�s: Eti�pia
*******************
Nome: catal�o (latim, Espanha)
C�digo da l�ngua: ca
L�ngua: catal�o
Cod Pa�s: ES
Pa�s: Espanha
*******************
Nome: holand�s (B�lgica)
C�digo da l�ngua: nl
L�ngua: holand�s
Cod Pa�s: BE
Pa�s: B�lgica
*******************
Nome: �rabe (Djibuti)
C�digo da l�ngua: ar
L�ngua: �rabe
Cod Pa�s: DJ
Pa�s: Djibuti
*******************
Nome: jola-fonyi (latim, Senegal)
C�digo da l�ngua: dyo
L�ngua: jola-fonyi
Cod Pa�s: SN
Pa�s: Senegal
*******************
Nome: gal�s (Reino Unido)
C�digo da l�ngua: cy
L�ngua: gal�s
Cod Pa�s: GB
Pa�s: Reino Unido
*******************
Nome: ingl�s (Ilhas Virgens Brit�nicas)
C�digo da l�ngua: en
L�ngua: ingl�s
Cod Pa�s: VG
Pa�s: Ilhas Virgens Brit�nicas
*******************
Nome: ingl�s (Ilhas Turcas e Caicos)
C�digo da l�ngua: en
L�ngua: ingl�s
Cod Pa�s: TC
Pa�s: Ilhas Turcas e Caicos
*******************
Nome: sueco (Ilhas Aland)
C�digo da l�ngua: sv
L�ngua: sueco
Cod Pa�s: AX
Pa�s: Ilhas Aland
*******************
Nome: tcheco (latim, Tch�quia)
C�digo da l�ngua: cs
L�ngua: tcheco
Cod Pa�s: CZ
Pa�s: Tch�quia
*******************
Nome: afric�ner (Nam�bia)
C�digo da l�ngua: af
L�ngua: afric�ner
Cod Pa�s: NA
Pa�s: Nam�bia
*******************
Nome: vunjo
C�digo da l�ngua: vun
L�ngua: vunjo
Cod Pa�s: 
Pa�s: 
*******************
Nome: ingl�s (�ndia)
C�digo da l�ngua: en
L�ngua: ingl�s
Cod Pa�s: IN
Pa�s: �ndia
*******************
Nome: luba-catanga
C�digo da l�ngua: lu
L�ngua: luba-catanga
Cod Pa�s: 
Pa�s: 
*******************
Nome: iorub�
C�digo da l�ngua: yo
L�ngua: iorub�
Cod Pa�s: 
Pa�s: 
*******************
Nome: espanhol (Nicar�gua)
C�digo da l�ngua: es
L�ngua: espanhol
Cod Pa�s: NI
Pa�s: Nicar�gua
*******************
Nome: sichuan yi (yi, China)
C�digo da l�ngua: ii
L�ngua: sichuan yi
Cod Pa�s: CN
Pa�s: China
*******************
Nome: sindi (Paquist�o)
C�digo da l�ngua: sd
L�ngua: sindi
Cod Pa�s: PK
Pa�s: Paquist�o
*******************
Nome: massai (Tanz�nia)
C�digo da l�ngua: mas
L�ngua: massai
Cod Pa�s: TZ
Pa�s: Tanz�nia
*******************
Nome: tigr�nia
C�digo da l�ngua: ti
L�ngua: tigr�nia
Cod Pa�s: 
Pa�s: 
*******************
Nome: malaio (Brunei)
C�digo da l�ngua: ms
L�ngua: malaio
Cod Pa�s: BN
Pa�s: Brunei
*******************
Nome: chakma (�ndia)
C�digo da l�ngua: ccp
L�ngua: chakma
Cod Pa�s: IN
Pa�s: �ndia
*******************
Nome: bret�o (Fran�a)
C�digo da l�ngua: br
L�ngua: bret�o
Cod Pa�s: FR
Pa�s: Fran�a
*******************
pt_BRAZIL
pt_BRAZIL
��5.000.000.000,00
$5,000,000,000.00
5.000.000.000,00��
*/