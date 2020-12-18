package com.academy.lesson5.oop.Date;
//Создать перечисление "Формат Даты" (DateFormat), в котором определить несколько форматов, например:
//		- 	RU 			Россия						DD.MM.YYYY					24.01.2011
//		- 	USA 		США							MM-DD-YYYY					01-24-2011
//		-	ENG			Международный английский	DD-MM-YYYY					24-01-2011
//		- 	UK			Великобритания				DD/MM/YYYY					24/01/2011
//		-* 	CUSTOM		Пользовательский			DD <Название месяца> YYYYг	25 января 2011г
//
//	b) Модифицировать класс CustomDate из предыдущего занятия, для фозможности отображения даты в заданном формате:
//		- public String getFormattedDate() {} // возвращает дату в формате по умолчанию - RU: 24.01.2011
//		- public String getFormattedDate((DateFormat format){} // возвращает дату в заданном формате по образцу из задания а)
public enum DateFormat {

    RU("Россия | DD.MM.YYYY | 24.01.2011"),
    USA("США | MM-DD-YYYY | 01-24-2011"),
    ENG("Международный английский | DD-MM-YYYY | 24-01-2011"),
    UK("Великобритания | DD/MM/YYYY | 24/01/2011"),
    CUSTOM("Пользовательский | DD <название месяца> YYYYг | 25 января 2011г");

    private String format;

    DateFormat() {

    }

    DateFormat(String format){
        this.format = format;
    }

    public String format(){
        switch (this){
            case RU: return "dd.MM.yyyy";
            case USA: return "MM-dd-yyyy";
            case ENG: return "dd-MM-yyyy";
            case UK: return "dd/MM/yyyy";
            default: return "dd MMMM yyyy'г'";
        }
    }

    public String getFormat(){
        return format;
    }





}
