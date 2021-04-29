package com.example.dynastywarriorheroes;

import java.util.ArrayList;

public class HeroDataSource {
    private static String[] heroNames = {
            "Lu Bu",
            "Guan Yu",
            "Zhao Yun",
            "Zhong Hui",
            "Ma Chao",
            "Xiahou Dun",
            "Zhou Yu",
            "Wang Yuanji",
            "Zhou Tai",
            "Da Qiao"
    };

    private static String[] heroGender = {
            "Male",
            "Male",
            "Male",
            "Male",
            "Male",
            "Male",
            "Male",
            "Female",
            "Male",
            "Female",
    };

    private static String[] heroWeapon = {
            "Voulge",
            "Guandao",
            "Spear",
            "Flying Sword",
            "Spear",
            "Mace",
            "Staff",
            "Throwing Daggers",
            "Single Edged Sword",
            "Twin Fans"
    };

    private static String[] heroHeight = {
            "208 cm",
            "207 cm",
            "185 cm",
            "175 cm",
            "186 cm",
            "188 cm",
            "178 cm",
            "160 cm",
            "200 cm",
            "160 cm"
    };

    private static String[] heroType = {
            "Power",
            "Power",
            "Technique",
            "Technique",
            "Power",
            "Speed",
            "Technique",
            "Speed",
            "Speed",
            "Speed"
    };

    private static String[] heroBorn = {
            "?",
            "162",
            "168",
            "225",
            "176",
            "?",
            "175",
            "217",
            "163",
            "?"
    };

    private static String[] heroDetails = {
            "\t\tLu Bu is typically depicted as an extremely aggressive, brutish, and bloodthirsty warrior who fights for the sole purpose of finding an opponent capable of providing him with a challenge. He believes himself to be the Mightiest Man Alive and believes that the only true justice in the world is not found in any court, but when one fights for one's life on the battlefield, where the strong survive and the weak are crushed. More of a man of action than talk, he disregards strategy and politics as a waste of his time (which is just as well, since he has little talent at either one).\n\n\t\tIn spite of his repeated betrayals, Lu Bu is brutally honest and has little faith in or respect for politicians, bureaucrats, or any cowards who use deceit to gain power. For this same reason, Lu Bu despises sycophants and suck-ups and resents being Dong Zhuo's lackey. In older games, Lu Bu before becoming rather more prideful was rather easily interested upon someone overcoming him in battle, living another day to best them. ",
            "\t\tGuan Yu is a stalwart general who firmly believes in justice and virtue. Normally calm and benign, he stands with an air of noble dignity and has respectful manners. A man who also excels in literary studies, he gains many admirers from each kingdom with his might and has earned the nickname God of War/Army God. In the Asian script, he speaks in an archaic tone befitting a warrior.\n\n\t\tHis indomitable loyalty to his brothers is his first and foremost duty in life. He will not abandon either one of them and treasures each one with unfaltering confidence. He acts as the calm advisor to Zhang Fei and as the faithful middle brother to Liu Bei. Guan Yu calls them different forms of Brother, but he is known to sometimes call Zhang Fei by his full name or his style name. Before they swore brotherhood, Guan Yu had already thought highly of Liu Bei and called him Lord Liu Bei. He acts as a good father figure for his children, and he may become self-sacrificing for their safety. ",
            "\t\tZhao Yun is strongly associated with the color white in several Three Kingdoms media, which is a callback to his appearance as stated in Romance of the Three Kingdoms. People can see an interpretation of him in the Summer Palace, which has a famous painting of his heroics at Changban. White is linked to several positive traits within various fictional mediums, including honesty, virtue, purity and so on. One other reason for Zhao Yun being linked with the color may be due to a myth regarding the horse the general favored. A quick steed in its own right, it is fabled to run one thousand leagues during the day and five hundred leagues at night. The horse's name is supposedly the White Dragon Horse (白龍駒, Bailongju). Within various cutscenes and NPC roles in the Dynasty Warriors series, Zhao Yun rides a horse mirroring its appearance. ",
            "\t\tHe is described as a young, studious man who has the respectable ability to instantly read the battlefield. He believes himself to be an impeccable and almighty genius who is incapable of committing a single error in his strategies. Zhong Hui accepts his failures as a temporary lapse in judgement and will do everything in his power to not place blame on himself. Often bragging that he is withholding his true potential, he jumps at the chance to outwit his adversaries and to punish those who don't agree with him. Due to his arrogance and spiteful demeanor, there aren't many fellow officers who trust him. His pride wilts when he expresses his intimacy for someone and he is unexpectedly bashful.\n\n\t\tOpposite of Deng Ai in every respect, he has seething resentments for the veteran. His personal reasons for opposing Sima Zhao is not explicitly stated, but it's been implied that he rebels due to selfishness and pride for his own family.",
            "\t\tFilled with a warrior's pride, Ma Chao is a straightforward man who believes in making his future with his own power. A firm believer in justice and heroics, he always declares his intentions in battle for all to hear. His determined proclamations are not always appreciated by his listeners from his home or from rival armies since he often yells the loudest in Shu's army. While his charisma and honesty win him followers, his lack of foresight and planning sometimes cost him their trust, as he occasionally neglects to consider others while completing his own personal goals. In addition, there is some hypocrisy in his actions, as refuses to forgive Cao Cao for killing his father yet is baffled that Wang Yi still holds a grudge against him for slaughtering her family.\n\n\t\tHe shares a mutual friendship with Zhao Yun as both warriors agree on similar morals and mindsets. Back when they were together at Xiliang, he idolized Pang De. When his comrade leaves him to join Cao Cao, his opinion of the warrior sours due to the betrayal and he starts to consider Pang De one of his worst enemies, but his hatred is replaced with continuing comradeship in later installments. He resents Cao Cao in most of his appearances, but his degree of hatred changes with each title. ",
            "\t\tXiahou Dun is a serious and loyal man who rarely questions his lord's judgment. He's usually focused but he can also be a hothead who lets his temper get the best of him. His temper becomes more controlled in later games, making him cool headed and focused, while still having loyalty to his lord and honor. He has a strong sense of honor, and despises those who use deceit as a means of achieving victory.\n\n\t\tHe is probably the retainer closest to Cao Cao as he can usually comprehend the reasoning behind his lord's actions. In the Asian script, he's often the only character to call his cousin by his style name. His hardened and undeterred mindset gains the respect of Wei's retainers, particularly Dian Wei and Xu Zhu. ",
            "\t\tCalm and rational, Zhou Yu is a wise expert of strategy who is capable of seeing through most of his enemies' ploys. He was a darker and slightly more arrogant character in his first appearance, but has softened in following titles. He treats his allies with modest professionalism and genuine respect. His devotion to his homeland is unquestionable, and his talents are praised with renown. His perceptive nature is unsettling even to Zhuge Liang as seen in Dynasty Warriors 8 when the Wu strategist detected an ulterior motive behind the Wu-Shu alliance. ",
            "\t\tDespite her conservative and quiet countenance, Wang Yuanji is a caring and gentle woman to the weak and innocent. A perceptive woman who thinks of the greater good for her country, she rarely has tolerance for procrastination or excessiveness. Whenever possible she seeks to reach quick, efficient, and decisive conclusions to conflicts. Although she may seem like a passive stoic, Wang Yuanji is gregarious enough to congratulate her comrades with an open smile. If Wang Yuanji confesses her genuine feelings to someone dear to her, she becomes rather bashful with her sincerity. In the Japanese script, she always formally addresses the Sima siblings by their style names.\n\n\t\tWith Sima Zhao, however, she spares him no sympathy and is rather curt with him. More often than not, she is usually patronizing him to take responsibility for his actions. As she watches him mature through his struggles, Wang Yuanji genuinely accepts him and his faults. She usually shows her concern for him indirectly, her cold shoulder belying the respect she has for him. Both Sima Yi and Sima Shi are aware of his faults, asking her to not misunderstand the Sima family due to Sima Zhao's behavior. During most situations where Sima Zhao assumes leadership, she becomes concerned about his hardened personality yet promises to forever support him. ",
            "\t\tZhou Tai is the classic calm and seemingly mute warrior who is merciless to his foes. He only talks when necessary and roughly mumbles one liners (his lines are surrounded with ellipses in the Japanese script). His hard-to-approach and taciturn demeanor belie a sincerely kind and loyal man of Wu.\n\n\t\tHe cares greatly for Sun Quan's safety and won't hesitate to sacrifice himself for his lord's well being. Caring little for personal gain and possessing an indomitable presence, his lord admires his bravery in return. Both share a fondness for wine, which further deepens their comradely bonds. When Lu Xun becomes Wu's new strategist, he expresses concern that the man may be too young and inexperienced for the new occupation. Once the youth displays his capabilities, any lingering doubts he may have had for Lu Xun are silenced. ",
            "\t\tDaqiao is a mature and sensible young teenage girl who desires to become stronger. Generally shy and timid, she doesn't like conflict and would usually not want to perpetuate it. However, since she wants to protect her husband and loved ones from harm, Daqiao braves the trials of battle to the best of her ability. Fond of her husband, she calls him a formal yet adoring Lord Sun Ce, which sometimes embarrasses him in the spin-off titles. Later games portray her as more anxious and prudent as a way to distinguish her from the more carefree and cocky Xiaoqiao.\n\n\t\tThough she seems to be submissive, she won't hesitate to snap at her sister for acting selfish or slipping with her manners. While they generally get along, their relative protectiveness over their spouses in their shared Legend Mode sparks a somewhat childish and heated argument between both sisters. "
    };

    private static int[] heroImages = {
            R.drawable.display_lu_bu,
            R.drawable.display_guan_yu,
            R.drawable.display_zhao_yun,
            R.drawable.display_zhong_hui,
            R.drawable.display_ma_chao,
            R.drawable.display_xiahou_dun,
            R.drawable.display_zhou_yu,
            R.drawable.display_wang_yuanji,
            R.drawable.display_zhou_tai,
            R.drawable.display_da_qiao
    };

    private static String[] heroForces= {
            "Other",
            "Shu",
            "Shu",
            "Jin",
            "Shu",
            "Wei",
            "Wu",
            "Jin",
            "Wu",
            "Wu"
    };

    static ArrayList<Hero> getListData() {
        ArrayList<Hero> list = new ArrayList<>();
        for (int position = 0; position < heroNames.length; position++) {
            Hero hero = new Hero();
            hero.setName(heroNames[position]);
            hero.setDetail(heroDetails[position]);
            hero.setPhoto(heroImages[position]);
            hero.setForces(heroForces[position]);
            hero.setGender(heroGender[position]);
            hero.setWeapon(heroWeapon[position]);
            hero.setHeight(heroHeight[position]);
            hero.setBorn(heroBorn[position]);
            hero.setType(heroType[position]);
            list.add(hero);
        }
        return list;
    }

    static Hero getHeroData(int position) {
        Hero hero = new Hero();
        hero.setName(heroNames[position]);
        hero.setDetail(heroDetails[position]);
        hero.setPhoto(heroImages[position]);
        hero.setForces(heroForces[position]);
        hero.setGender(heroGender[position]);
        hero.setWeapon(heroWeapon[position]);
        hero.setHeight(heroHeight[position]);
        hero.setHeight(heroHeight[position]);
        hero.setBorn(heroBorn[position]);
        hero.setType(heroType[position]);
        return hero;
    }

}

