package com.academy.Lesson03.HomeworkRegularExpressions.Task05;

//данный класс написан для подготовки генерации рандомных мейлов в разных типах валидности (в перспективе от 10 до 100 %)
public class RandomMail {
    private static final String[] endDomain = {".com", ".net", ".biz", ".info", ".org", ".tel", ".travel", ".aero", ".pro", ".xxx", ".name", ".mobi", ".academy", ".accountant", ".accountants",
            ".actor", ".agency", ".airforce", ".apartments", ".app", ".army", ".art", ".associates", ".attorney", ".auction", ".audio", ".auto", ".band", ".bank", ".bar",
            ".bargains", ".beer", ".bet", ".bid", ".bingo", ".bike", ".black", ".blackfriday", ".blog", ".blue", ".boutique", ".build", ".builders", ".business", ".cab",
            ".cafe", ".camera", ".camp", ".capital", ".car", ".cards", ".care", ".career", ".careers", ".cash", ".casino", ".catering", ".center", ".chat", ".cheap",
            ".christmas", ".church", ".city", ".claims", ".cleaning", ".click", ".clinic", ".clothing", ".cloud", ".club", ".coach", ".codes", ".coffee", ".college",
            ".community", ".company", ".computer", ".condos", ".construction", ".consulting", ".contractors", ".cooking", ".cool", ".country", ".coupons", ".courses",
            ".credit", ".creditcard", ".cricket", ".cruises", ".dance", ".date", ".dating", ".deals", ".degree", ".delivery", ".democrat", ".dental", ".dentist", ".design"
            };

    private static final String[] subDomain = {"z.russia", "z.iabb.edu", "z.agroholding", "alcatel", "ams", "chuvashia", "d", "emts", "gab", "intercare", "kharkov", "kirle.sp", "lek", "per.orc",
            "pol", "pool-7", "s", "sb.isis.org", "sbs.perm", "usmga", "vsb.samaramail", "z", "z.z", "zet-group", "zlodey.pp", "zun.ulsu", "zxy.spb", "dinet",
            "mailcity", "km", "irs", "wizcom", "estart", "mail.raid", "lovers", "aport2000", "ngs", "svetlana.bryansk", "mz.perm", "z-mail", "ezmail", "z-online.ptt",
            "donpac", "spb.city.ine", "ascod", "z-yandex", "panorama.irk", "go", "mail.tascom", "z8mnaha.mailserver.corvis", "actor", "er", "goldmail", "pskovkabel", "res.tsu", "ssmu",
            "zsmk.nvkz.kuzbass", "biobase.tsu.tomsk", "az", "binus.perm", "coach", "got.mmtel.msk", "info-don", "mgi", "optima", "pochta.tomsk", "stal", "utb", "mail.uln", "samtel",
            "csu.metacom", "zab.mtu-net", "agama", "dialup.ptt", "f3157.dd.vaz.tlt", "mail.ku", "mail.chita", "rukivverh", "rb.dcn-asu", "students.soros.karelia", "runet", "admiral", "atrus", "userline",
            "vipmail", "galaktika", "knet", "tbit", "mail.line", "love", "zabavy-narod", "langepas.wsnet", "obninsk", "infotecs", "istra", "ksrs.msk", "polyn.kiae", "uvgroup.msk",
            "nnov.cityline", "cv.jinr"};

    private static final String[][] uniCode = {
            { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z",
            "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "0",
            "1", "2", "3", "4", "5", "6", "7", "8", "9", "_", "!", "(", ")", "*", "+", "-", ".", ":", ";", "<", "=", ">", "?", "{", "|", "}", "/", "_",  "[", "]", " ", "'", "\"", "@"},
            {"@"}
            };

    public static String randomMail(){
        int randLoginSize = (int) (3 + (Math.random() * 15));
        String mail = "";
        int digitOrLetterOrSymbol;
        int randomEndDomain = (int)(Math.random() * 100);
        int randomSubDomain = (int)(Math.random() * 100);
        int arrayNumber;
            for(int ii = 0; ii <= randLoginSize; ii++){
                int randLetter = (int)(Math.random() * 73);
                mail += uniCode[0][randLetter];
            }
            mail += uniCode[1][0] + subDomain[randomSubDomain] + endDomain[randomEndDomain];
        return mail;
        }

    public static void main(String[] args) {
        System.out.println("endDomain - " + uniCode[0].length);

    }
}
