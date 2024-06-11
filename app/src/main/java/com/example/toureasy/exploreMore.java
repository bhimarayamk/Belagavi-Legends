package com.example.toureasy;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class exploreMore extends AppCompatActivity {
    ImageView img;
    TextView title,placeDesc;

    ImageView backBtn;
    passHelper passer = new passHelper();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explore_more);

        img = (ImageView) findViewById(R.id.imageView);
        title = (TextView) findViewById(R.id.imageTitle);
        placeDesc = (TextView) findViewById(R.id.placeDesc);
        backBtn = (ImageView) findViewById(R.id.backbtn);
        int imgId = passer.getId();

        switch (imgId){
            case 1:
                img.setImageResource(R.drawable.kittur_rai_cheammma);
                title.setText("Kittur Rani Chennamma");
                placeDesc.setText("Kittur Chennamma (23 October 1778 – 21 February 1829) was the Indian Queen of Kittur, a former princely state in present-day Karnataka. She led an armed resistance against the British East India Company in 1824, in defiance of the Paramountcy, in an attempt to retain control over her dominion. She defeated the Company in the first revolt, but died as a prisoner of war after the second rebellion. As one of the first and few female rulers to lead kittur forces against British colonisation, she continues to be remembered as a folk hero in Karnataka, she is also an important symbol of the Indian independence movement.\n"+
                        "\n"+
                        "Early life\n"+
                        "\n"+
                        "Kittur Chennamma was born on 23 October 1778, in Kakati, a small village in the present Belagavi District of Karnataka, India. She belonged to the Lingayat Panchamasaali community and received training in horse riding, sword fighting and archery from a young age. She married Raja Mallasarja of the Desai family at the age of 15.\n" +
                        "\n"+
                        "Rebellion against the British\n" +
                        "\n" +
                        "Chennamma's husband died in 1816, leaving her with a son and a state full of volatility. This was followed by her son's death in 1824. Rani Chennamma was left with the state of Kittur and an uphill task to maintain its independence from the British. Following the death of her husband and son, Rani Chennamma adopted Shivalingappa in the year 1824 and made him heir to the throne. This irked the East India Company, who ordered Shivalingappa's expulsion. The state of Kittur came under the administration of Dharwad collectorate in charge of St John Thackeray of which Mr Chaplin was the commissioner, both of whom did not recognise the new rule of the regent, and notified Kittur to accept the British control.\n" +
                        "\n" +
                        "This is seen as a foreshadowing of the later Doctrine of lapse introduced by Lord Dalhousie, Governor General of India, to annex independent Indian States from 1848, a doctrine based on the idea that in case the ruler of an independent state died childless, the right of ruling the State reverted or \"lapsed\" to the suzerain.\n" +
                        "\n" +
                        "Rani Chennamma sent a letter to Mountstuart Elphinstone, Lieutenant-Governor of the Bombay province pleading her case, but the request was turned down, and war broke out. The British placed a group of sentries around the treasury and crown jewels of Kittur, valued at around 1.5 million rupees upon the outbreak of war in order to protect them. They also mustered a force of 20,797 men and 437 guns, mainly from the third troop of Madras Native Horse Artillery in order to fight the war. In the first round of war, during October 1824, British forces lost heavily and St John Thackeray, collector and political agent, was killed in the war. Amatur Balappa, a lieutenant of Chennamma, was mainly responsible for his killing and losses to British forces. Two British officers, Sir Walter Elliot and Mr Stevenson were also taken as hostages. Rani Chennamma released them with an understanding with Chaplin that the war would be terminated but Chaplin continued the war with more forces. During the second assault, subcollector of Solapur, Munro, nephew of Thomas Munro was killed. Rani Chennamma fought fiercely with the aid of her deputy, Sangolli Rayanna, but was ultimately captured and imprisoned at Bailhongal Fort, where she died on 21 February 1829 due to health deterioration..\n" +
                        "\n" +
                        "Sangolli Rayanna continued the guerrilla war to 1829, in vain, until his capture. Rayanna wanted to install the adopted boy Shivalingappa as the ruler of Kittur, but Rayanna was caught and hanged. Shivalingappa was also arrested by the British. Chennamma's legacy and first victory are still commemorated in Kittur, during the Kittur Utsava held on 22–24 October every year.");
                break;

            case 2:
                img.setImageResource(R.drawable.sangollirayanna);
                title.setText("Sangolli Rayanna");
                placeDesc.setText("Sangolli Rayanna was born on 15 August 1798 was a nineteenth century Indian revolutionary, military chief (Shetsanadi) and warrior in the Kittur princely state in the present day Indian state of Karnataka. He was the Shetsanadi of the Kingdom of Kittur ruled at the time by Rani Channamma and fought the British East India Company till his death. He died on 26 January 1831, at the age of 33. He belonged to the Kuruba Gowda community. His life was the subject of the 2012 Kannada film Sangolli Rayanna.\n" +
                        "\n" +
                        "Activities\n" +
                        "\n" +
                        "Sangolli Rayanna participated in the 1824 rebellion and was arrested by the British, who released him later. He continued to fight the British and wanted to install the adopted son of King Mallasarja and Rani Chennamma, namely Shivalingappa as the ruler of Kittur. He mobilised local people and started a guerilla type war against the British. He and his guerrilla army moved from place to place, burnt government offices, waylaid British troops and plundered treasuries. Most of his land was confiscated and what remained of it was heavily taxed. He taxed the landlords and built up an army from the masses. The British troops could not defeat him in open battle. Hence, by treachery, he was caught in April 1830 and tied up by the British; and sentenced to death. Shivalingappa, the boy who was supposed to be the new ruler, was also arrested by the British.\n" +
                        "\n" +
                        "Rayanna was executed by hanging from a Banyan tree near Nandagad,[5] on 26 January 1831 at the age of 33.\n" +
                        "\n" +
                        "Rayanna was helped by Gajaveera, a Siddi warrior, in his revolt against the British in 1829–30.\n" +
                        "\n" +
                        "Rayanna was buried near Nandagad. Legend says that a close associate Sangolli Bichugatti Channabasappa of Rayanna planted a banyan sapling on his grave. The tree is fully grown and stands to this day. An Ashoka Stambha was installed near the tree. A small temple in the name of Sangolli Rayanna was constructed at Sangolli village, in which stands a statue of Rayanna flanked by two wooden weights used for body building. Two wooden weights are original, those were used by Rayanna himself for body building. A community hall built in commemoration of Rayanna at Sangolli serves the villagers of Sangolli.[citation needed] Karnataka Government recently established Krantiveera Sangolli Rayanna authority its work progress of Krantiveera Sangolli Rayanna Sainik school, \"Shouryabhoomi\" Krantiveera Sangolli Rayanna rock garden and in \"Veerabhoomi\" Krantiveer Sangolli Rayanna museum.\n" +
                        "\n" +
                        "Ballads and other memorials\n" +
                        "\n" +
                        "The Gee Gee songs (Ballad) are heroic folklore verses composed in North Karnataka[8] and several such songs are sung about Kittur Chennamma, Sangolli Rayanna and other figures of pre-independence Karnataka. A life size bronze statue of Sangolli Rayanna, riding a horse with open Sword in right hand, was installed near Railway station of Bengaluru. The main railway station of Bengaluru City has been renamed as \"Krantiveera Sangolli Rayanna Railway station\" in 2015. However the station officially re named and notified as \"Krantivira Sangolli Rayanna\" Railway Station on 3 February 2016");
                break;

            case 3:
                img.setImageResource(R.drawable.belwadimallamma);
                title.setText("Belawadi Mallamma");
                placeDesc.setText("Belawadi Mallamma  was a queen of Belawadi kingdom (samshtana). She is credited with being the first queen in history who built and trained a women's army.\n" +
                        "\n" +
                        "Education\n" +
                        "\n" +
                        "Mallamma's education began at 5, where she attended a school built by her father for her and her brother, Sadashiva Nayaka. The school's principal was Shankar Bhat, a notable scholar, and 10 senior shastris (respected teachers of philosophy and of ancient texts) acted as Mallamma's teachers.\n" +
                        "\n" +
                        "When Mallamma attained marriageable age, her father chose to arrange for swayamvara (whereby the girl would choosing her husband from among the courters). Mallamma decided to challenge her suitors to hunt the number of tigers equal to his age plus one, within one month.\n" +
                        "\n" +
                        "Prince of Belawadi, Ishaprabhu, at 20 years of age, successfully hunted and killed 21 tigers in a month, earning the hand of Mallamma. With this union, Mallamma became known as Belawadi Mallamma and, along with Ishaprabhu, would later become the ruling couple of Belawadi, a relatively small kingdom whose territories covered parts of modern-day Belagavi and Dharwad districts.\n" +
                        "\n" +
                        "War between Mallamma and Shivaji\n" +
                        "\n" +
                        "As mentioned in the book Turukari panchamara itihasa written by Shiva basava shastri of Brahanmatha (heritage site of Belavadi Sansthana). History of Belawadi Sansthana starts from 1511 with king Chandrashekhara raja and it mentions about war between Shivaji and Mallamma. Ishaprabhu died in the battlefield later Mallamma fought with Shivaji and she defeated the Shivaji. As result of battle hero stone is installed in their Samshtana. The book Turukari panchamara itihasa was published first time in 1929.\n" +
                        "\n" +
                        "Marathi works jede shakavari, Chitragupta bakhar, 91 Kalami bakhar mentioned about battle between Shivaji and Mallamma.[citation needed] Shiva vamsha sudharnava is Sanskrit book written by mallamma's teacher Shankara bhattaru. The book says Shivaji was fought with Belawadi Mallamma. Tarabai second daughter-in-law of Shivaji gave first prize for this book and mentioning that the book contains exact subject of Shivaji and Mallamma. Second prize for Balasaheb bhaves Shivaji charitra and third prize for the book written by Shesho Shinivas Muthalika.[verification needed] Scholar Shesho Srinivas Muthalik recorded the life in the palace of Madhulinga Nayaka in 1704-5 A.D. in the Marathi language.\n" +
                        "\n" +
                        "In Jadunath Sarkar's biography of Shivaji in Marathi language, he mentioned Mallamma as Savitribai and 27 days war held between Shivaji and Mallamma.\n" +
                        "\n" +
                        "A contemporary British work says He Shivaji is At present besieging a fort where. he has suffered more disgrace than even he did from all power of the moghul of the deccan (Bijapuri) and he who hath conquered so many kingdoms is not able to reduce this woman Desai [Factory records, Surat,107].\n");
                break;

            case 4:
                img.setImageResource(R.drawable.rat);
                title.setText("Ratta Dynasty ");
                placeDesc.setText("Ratta dynasty was a minor Indian dynasty who ruled over the Belagavi region of modern Karnataka as a branch of Rashtrakutas.[citation needed] Savadatti (Saundatti), historically known as Sugandavarti was the capital of Ratta dynasty during 875-1250 CE period. Later their capital shifted to Belagavi (Belgaum) which is historically known as Venugrama. Belgaum was the capital of the Rattas during 1210 - 1250 AD. Rashtrika is a sanskritized form of Ratta. Hooli was also under the rule of Rattas of Saundatti.\n" +
                        "\n" +
                        "Parasgad Fort\n" +
                        "\n" +
                        "Parasgad Fort is a ruined hill fort in the Belgaum district of Karnataka state, India. magnificent fort of Parashghad, dating back to the 10th century and built by famous rulers of Ratta dynasty Parasgad Fort is located about two kilometres south of Saundatti village, and stands on the south-west edge of a range of hills immediately overlooking the black soil plain down below. The hill which measures about 500 metres (1,640 ft) from north to south and about 300 metres (984 ft) from east to west, is irregular, and a good deal is covered with prickly pear and brushwood. Its sides are rocky and almost perpendicular. A deep gorge runs through it.\n" +
                        "\n" +
                        "Belgaum Fort\n" +
                        "\n" +
                        "Belgaum Fort was built in 1204 by chief Bichiraja in 1204, Belgaum Fort was built by chief Jaya Raja, who also known as Bichi Raja. Later, the Yadavas of Devagiri defeated Rattas and captured the Belgaum Fort. The Belgaum fort (Originally built by the Ratta dynasty, later fortified by Yakub Ali Khan of the Bijapur Sultanate) was well known for its unique building structure and its huge moat surrounding the fort, which made it inaccessible to the enemies. The Belgaum fort served as a bulwark against the attacks of invading armies. It steadfastly held fort as Belgaum played host to a multitude of dynasties, from the Rattas, the Vijayanagar emperors, Bijapur Sultans, Marathas and finally the British. During the freedom movement of India, Mahatma Gandhi was imprisoned here. The inside of the fort is stretched about 1000 yards long and 800 yards broad. The fort was well built as a Military store. An ancient Jain temple (Kamal Basadi) is also present inside the fort.\n" +
                        "\n" +
                        "Belgaum Fort has been ruled by Dynasties such as Kadambas, Rashtra Kutas, Kalyan Chalukyas, Rattas, Bahamanis, Marathas. In the year 1778 it was under Tipu Sultan kingdom. In 1818, Gen. Munro British Officer took over the fort & built houses inside the Fort for Residence of Army Officers.\n" +
                        "\n" +
                        "Jainism:\n" +
                        "Rattas were patrons of Jainism. In 11th century AD, Jain saint Munichandra (Acarya, the founder of Ratta-rajya) was a teacher and minister to chief Laksmideva (son of Kartivirya).\n" +
                        "\n" +
                        "Kannada literature:\n" +
                        "Paravanatha purana was written by Jain writer Parsva Pandita.\n" +
                        "Pushpadanta purana, the story of 9th Jain tirthankar Pushpadanta was written by Jain writer Gunavarma II.");
                break;

            case 5:
                img.setImageResource(R.drawable.balappa);
                title.setText("AMATURU BALAPPA");
                placeDesc.setText("amatur ballappa\n" +
                        "In     1824,     when     the Britishers had their eyes on Kittur province, they had a law (Doctrine of Lapse) saying that adopted children of Royalty doesn’t have the right to claim the throne of the province and as per that law,  the Kittur province would be confiscated.\n" +
                        "\n" +
                        "During that time all efforts of Chennamma to preserve the autonomy and independence of Kittur failed and war became inevitable.  Under the leadership of Monroe, Chaplin and Thackeray, the Collector of Dharwad attacked Kittur.\n" +
                        "\n" +
                        "On 23 October 1824, when the Kittur army was fighting the British under the command of Sardar Gurusinnappa, Thackeray started moving towards Chennamma, he was shot by a bullet and he died. It was the  hero Amatur Balappa who shot that bullet. On 3 December 1824, when the Britishers attacked for the second time, he stopped them upfront and bravely fought them fiercely. On the 4 December 1824, he sacrificed his life valiantly fighting for his country. His memorial statue lies at Bailuhongala Taluk of Amatur.");
                break;

            case 6:
                img.setImageResource(R.drawable.shrnappa);
                title.setText("Bicchugati sharanappa");
                placeDesc.setText("Bicchugati Sharanappa is the name of a historical figure who was a warrior and leader in the Kingdom of Kittur, which is now part of the Indian state of Karnataka. Sharanappa was one of the key figures in the Kittur Uprising of 1824, a rebellion against the British East India Company's attempt to annex the Kittur Kingdom."+
                        "\n"+
                        "Under Sharanappa's leadership, the Kittur forces were able to achieve several significant victories against the British, including the capture of several British forts. However, ultimately the rebellion was quashed and Sharanappa was captured and executed by the British in 1824\n" +
                        "\n" +
                        "Sharanappa is remembered as a hero and symbol of resistance against British colonialism in India. The story of the Kittur Uprising and Sharanappa's leadership has been celebrated in literature, music, and film in India.");
                break;

            case 7:
                img.setImageResource(R.drawable.basu);
                title.setText("Basappa Danappa Jatti");
                placeDesc.setText("Basappa Danappa Jatti  (10 September 1912 – 7 June 2002) was the fifth vice president of India, serving from 1974 to 1979. He was the acting president of India from 11 February to 25 July 1977. He also served as the chief minister of Karnataka. Jatti rose from a being a Municipality member to India's second-highest office during a five-decade-long chequered political career.\n" +
                        "\n" +
                        "Jatti was born in a Kannada speaking Lingayat family at Savalgi in Jamkhandi Taluk of Bijapur district in present-day Karnataka on 10 September 1912. His parents were Dasappa Jatti and Sangamma. Jatti studied at the PB High School Jamkhandi and obtained a Bachelor of Arts degree from Rajaram College and a degree in law from the Sykes Law College, Kolhapur. Jatti practiced as a lawyer for a while in Jamkhandi before being elected to the Jamkhandi municipality in 1940 and going on to become its president. He was elected to the Jamakhandi State Legislature, becoming a minister and subsequently its chief minister.\n" +
                        "\n" +
                        "Early life\n" +
                        "\n" +
                        "Jatti was born in a Kannada speaking Lingayat family at Savalgi in Jamkhandi Taluk of Bijapur district in present-day Karnataka on 10 September 1912. His parents were Dasappa Jatti and Sangamma. Jatti studied at the PB High School Jamkhandi and obtained a Bachelor of Arts degree from Rajaram College and a degree in law from the Sykes Law College, Kolhapur. Jatti practiced as a lawyer for a while in Jamkhandi before being elected to the Jamkhandi municipality in 1940 and going on to become its president. He was elected to the Jamakhandi State Legislature, becoming a minister and subsequently its chief minister.\n" +
                        "\n" +
                        "Early political career\n" +
                        "\n" +
                        "In 1940, he entered politics as a Municipality member at Jamkhandi and subsequently became the president of the Jamkhandi Town Municipality in 1945. Later, he was elected as a member of the Jamkhandi State Legislature and was appointed a minister in the government of the princely state of Jamkhandi. Finally, he became the 'dewan' (chief minister) of Jamkhandi state in 1948. As dewan, he maintained cordial relations with the Maharaja, Shankar Rao Patwardhan, and brought about the accession of the small principality to the Indian Union. On 8 March 1948 after Jamkhandi was merged with Bombay state, he returned to legal practice and continued with it for 20 months.\n" +
                        "\n" +
                        "Later, Jatti was nominated as a member of the Bombay State Legislative Assembly to represent the merged area, and within a week of his nomination, he was appointed Parliamentary Secretary to the then Bombay chief minister, B. G. Kher. He worked in that capacity for a couple of years. After the 1952 general elections, he was appointed Minister of Health and Labour of the then Bombay government and held that post till the reorganization of states. His autobiography, 'I'm my own model', is very popular.\n" +
                        "\n" +
                        "Chief minister of Mysore state\n" +
                        "\n" +
                        "Jatti became a member of the Mysore Legislative Assembly after the reorganization and was Chairman of the Land Reforms Committee, which paved the way for the 1961 Mysore Land Reforms Act (which abolished the tenancy system and absentee landlordism). He was the chief minister and Kadidal Manjappa was the revenue minister when the bill was adopted. In 1958, when S. Nijalingappa stepped down as chief minister of the state, Jatti was elected leader of the party in the face of a stiff challenge from Congress veteran T. Subramanya. He became the chief minister of Mysore in 1958 and continued in that office until 1962.\n" +
                        "\n" +
                        "In the assembly election of 1962 to the Mysore Legislative Assembly, Jatti was reelected from Jamkhandi. He however was forced to resign as chief minister since he did not command the support of a majority of elected legislators of the Congress Party and was succeeded by S. R. Kanthi.\n" +
                        "\n" +
                        "Later political career\n" +
                        "\n" +
                        "Jatti subsequently was Lieutenant Governor of Pondicherry from October 1968 to November 1972. Jatti was appointed Governor of Orissa in November, 1972. On March 1, 1973 the ruling Congress government led by Nandini Satpathy resigned after it lost its majority in the legislative assembly. Although the leader of the opposition, Biju Patnaik, staked his claim to form the government and demonstrated the support of a majority of legislators, Jatti chose to prorogue the assembly session on the advice of Sathpathy and on March 3, 1973 recommended President’s rule in the state. Jatti, with the aid of advisors administered the state during the period of President’s Rule which continued until Mach, 1974. He resigned as governor in August, 1974 to contest in the vice presidential election of 1974. In the election, Jatti defeated the opposition candidate N.E. Horo winning 521 votes in the electoral college against 141 polled by Horo. Jatti was declared elected on 27 August 1974 and sworn in as the vice president of India on August 31, 1974.\n" +
                        "\n" +
                        "Following the death in office of Fakhruddin Ali Ahmed on February 11, 1977, Jatti was sworn in as the acting president of India the same day. Following the defeat of the Indian National Congress in the general elections of 1977, Jatti asked Indira Gandhi to continue as caretaker prime minister and, on the recommendation of the Cabinet, revoked the Emergency on March 21, 1977. Jatti swore in Morarji Desai as prime minister on March 24, 1977. In April, 1977, the new government recommended the dismissal of governments and the dissolution of legislative assemblies in states ruled by the Congress Party. Although Jatti initially hesitated to accept the Cabinet’s recommendation, he agreed to it a day later and dismissed governments in nine states. Jatti was succeeded by Neelam Sanjiva Reddy as President of India on 25 July 1977 following his unopposed election to the presidency in the presidential election of 1977.\n" +
                        "\n" +
                        "Religious activities\n" +
                        "\n" +
                        "A deeply religious man, Jatti was the founder president of the \"Basava Samithi\", a religious organisation which propagated the preachings of 12th-century saint, philosopher and reformer of Lingayat community Basaveshwara. The Basava samithi established in 1964 has published many books on Lingayatism and Sharanas and has got the 'vachanas' of sharanas translated into various languages. He was also involved in various organisations concerned with social activities.\n" +
                        "\n" +
                        "Death and legacy\n" +
                        "\n" +
                        "He died on 7 June 2002. He was hailed as a man who set an example of selfless service and stood for value-based politics. He was once called an ordinary man with extraordinary thought, and he named his autobiography, I'm My Own Model. His centenary celebrations were held in 2012.");
                break;
            case 8:
                img.setImageResource(R.drawable.chandrashekar);
                title.setText("Dr. Chandrashekar Kambar");
                placeDesc.setText("Chandrashekhara Kambara (Kannada: ಚಂದ್ರಶೇಖರ ಕಂಬಾರ; born 2 January 1937) is a prominent Indian poet, playwright, folklorist, film director in Kannada language and the founder-vice-chancellor of Kannada University in Hampi also president of the Sahitya Akademi, country's premier literary institution, after Vinayak Krishna Gokak (1983) and U.R. Ananthamurthy (1993). He is known for effective adaptation of the North Karnataka dialect of the Kannada language in his plays, and poems, in a similar style as in the works of D.R. Bendre."+"\n"+
                        "Kambara's plays mainly revolve around folk or mythology interlinked with contemporary issues, inculcating modern lifestyle with his hard-hitting poems." +

                        " He has become a pioneer of such literature. His contribution as a playwright is significant not only to Kannada theatre but also to the Indian theatre in general as he achieved a blend of the folk and the modern theatrical forms."+
                "\n"
                        +"He has been conferred with many prestigious awards including the Padma Bhushan in 2021, Jnanpith Award in 2011 for the year 2010, Sahitya Akademi Award, the Padma Shri by Government of India, Kabir Samman, Kalidas Samman and Pampa Award. After his retirement, Kambara was nominated as the Member of Karnataka Legislative Council, to which he made significant contributions through his interventions");
                break;
            case 9:
                img.setImageResource(R.drawable.mallikarjun);
                title.setText("Naik Malikarjun Hanamanth Murabandi");
                placeDesc.setText("Naik Mallikarjun Hanumanth Murabandi hailed from Mamadapur village in Belgaum district of Karnataka. Son of Shri Hanumantha and Smt Bowramma, Naik Mallikarjun was born on 1st June 1970 and was third among four siblings. Naik Mallikarjun completed his primary and higher secondary education in his hometown and joined the college in Bijapur.  After completing his II year PUC he joined the Indian Army at the age of  21 years. He was recruited into 12 Maratha of the Maratha Light Infantry Regiment, a regiment well known for its brave soldiers and various battle honours."+"\n"+"\n"+
                        "Naik Mallikarjun served in various operational areas in Punjab, Dehradun, before being posted to the unit in Himachal Pradesh in 2003. By that time he had put in about 13 years of service and evolved into a committed soldier. Naik Mallikarjun got married to Bharthi in the year 1996, and the couple had one son Chethan."+"\n"+"\n"+
                        "Operation Parakram: 08 April 2003"+"\n"+
                        "During 2003, Naik Mallikarjun’s unit 12 Maratha was deployed in Himachal Pradesh. It was heavy snowfall  It was one of the remote parts of the valley and remains inaccessible not only during winter but the whole year. The sector is heavily militarized and soldiers are stationed on mountaintop posts to guard the Line of Control and prevent infiltration of militants."+"\n"+"\n"+
                        "On 8th April 2003 in the mountainous northern region of the Himachal Pradesh received heavy snowfall resulting in avalanches in the area.  Naik Mallikarjun along with his six comrades got stuck inside the tent struggled a lot and was not able to come out of the tent as it was fully covered by the snow, Naik Mallikarjun and their fellow men laid down their lives in the service of the nation and honored by Badge of sacrifice award."+"\n"+"\n"+
                        "Naik Mallikarjun Hanumanth Murabandi is survived by his wife  Bharathi serving as a teacher in Bagalkot and a son Chethan mallikarjun of 20 years old at present doing his BE.");
                break;
            case 10:
                img.setImageResource(R.drawable.subedar);
                title.setText("Subedar Basappa Patil");
                placeDesc.setText("Subedar Basappa Patil belonged to Khanajaon village in Belgaum district of Karnataka. He completed his schooling in his native place and later joined the Indian army on 24th of July 1990. He was recruited into 21 Madras battalion of the Madras Regiment, an infantry Regiment known for its gallant soldiers and numerous battle honours.\n"+"\n"+
                        "By 2016, he had put in around 16 years of service and had the experience of operating in various field units in different terrain and work environments. He also had risen to the rank of Subedar by the year 2016 and was involved in various operations as a junior commissioned officer\n"+"\n"+
                        "Mine Blast on LoC : July 2016\n"+"\n"+
                        "During 2016, Sub Basappa Patil was serving with the unit deployed in Kargil sector of J & K area in 2016. As the unit was located near the LOC, its troops were manning various forward posts in its AOR(Area of Responsibility). Besides manning designated forward posts the unit also operated regular patrols to monitor the gaps between the manned posts. The troops had to exercise extreme caution while paroling as the terrain was very tough with various natural obstacles and also scattered with enemy laid mines or booby traps."+"\n"+"\n"+
                        "On 29 July 2016, Sub Basappa Patil, was leading a patrol party that included Sep Hasansab Khudavand too. The patrol party while traversing through the their planned route came under a mine blast. The blast was very severe and the soldiers including Sub Patil and Sep Hasansab suffered serious injuries. They were evacuated for the medical treatment but it did not help. Sub Basappa Patil and Sep Hasansab Khudavand later succumbed to their injuries and were martyred. Sub Basappa Patil  was a valiant soldier and a committed junior commissioned officer who laid down his life in the service of the nation.\n" +
                        "\n" +
                        "Sub Basappa Patil, is survived by his wife Shakunthala, daughter Keerthy and son Prakash.");
                break;
            case 11:
                img.setImageResource(R.drawable.cfn);
                title.setText("CFN Bharateshwar Padanad");
                placeDesc.setText("CFN Bharateshwar Rayappa Padanad belonged to the Sankonatti village of Athani taluk in the Belagavi district of Karnataka. Son of Shri Rayappaa and Smt Godavari Padanad, belonged to an economically-backward family. He had joined the Corps of EME of the Indian Army in 2006 after completing his school education and was recruited into the 6 Dogra battalion of the Dogra Regiment, an infantry regiment known for its gallant soldiers and numerous battle honours.\n" +
                        "\n" +
                        "Manipur Attack: 04 Jun 2015\n" +
                        "During 2015, CFN Bharateshwar Rayappa Padanad’s unit was deployed in Manipur in the northeastern part of the country. There had been militant activity in the border region of Manipur in the early part of the year 2015. In response to this, 1,463-km of an un-fenced border between Manipur and Myanmar had been sealed and the Army and paramilitary forces had launched a major counter-offensive against the militants. On the 4th of June, the 6 Dogra infantry was heading to the capital of Manipur, Imphal in a 4-vehicle convoy. While they were crossing the Chandel district, on the way, they were ambushed by militants. The tribal guerrillas fired rocket-propelled grenades and detonated improvised explosive devices on the convoy, causing extensive damage.\n" +
                        "\n" +
                        "The attack by militants on the convoy was planned by a joint group comprising of cadres from NSCN(K), Kanglei Yawol Kanna Lup (KYKL) and Kanglapak Communist Party (KCP). The well-trained militants had planned the ambush beforehand and they triggered a landmine when the military convoy reached the area between Paralong village and Charong village in Chandel district. They also attacked the convoy with heavy automatic weapons, firing from vantage points and fired rockets and grenades. Most of the convoy, consisting of about 4 vehicles with 50 soldiers, was severely damaged and many soldiers were burnt to death on account of the blast. The few survivors were shot to death by the militants.\n" +
                        "\n" +
                        "The incident was reported to be one of the deadliest attacks by militants in the area. CFN Bharateshwar Rayappa Padanad was one of the 18 brave soldiers who lost their lives in this horrendous attack. Besides CFN Bharateshwar Rayappa Padanad the other soldiers included  Nb Sub Ram Singh (from Samba), Hav Prakash Chand 9from Mandi, HP), Hav. Sat Pal Bhasin (from Jammu, J&K), Hav Sunil Kumar Sharma (from Sunderbani, J&K), Hav Rajesh Kumar (from Bilaspur, Himachal Pradesh), Hav Randeep Singh (from Jammu, J&K), Nk Ashok Kumar (from Sirmour, Himachal Pradesh), L Nk Rajneesh Singh (from Kangra, Himachal Pradesh), Sep Ram Prasad Yadav (from Faizabad, Uttar Pradesh), L Nk Kuldeep Raj (from Jammu, J&K), Sep Manoj Kumar (from Mandi, Himachal Pradesh), Sep Vijay Kumar (from Jammu, J&K), Sep Vikas Bhardwaj (from Mandi, Himachal Pradesh), Sep Sohan Singh (from Sirmour, Himachal Pradesh), Sep Jeetendra Kumar Kushwaha (from Rewa, Madhya Pradesh), Hav Jagveer Singh (from Gautam Buddha Nagar, Uttar Pradesh) and Sep Manjit Singh (from Pathankot, Punjab).\n" +
                        "\n" +
                        "CFN Bharateshwar Rayappa Padanad was a brave and dedicated soldier who laid down his life in the service of the nation.");
                break;
            case 12:
                img.setImageResource(R.drawable.prakash);
                title.setText("Sapper Prakash Jadhav KC");
                placeDesc.setText("Sapper Prakash Jadhav hailed from Budihal village in Chikkodi taluk of Belagavi district in Karnataka. Son of Shri Pundlik Jadhav and Smt Sharada Jadhav, Spr Prakash Jadhav was inclined to join the Armed Forces since his younger days and eventually got selected to join the Amy after completing his school studies in 2007. He was recruited into the Corps of Engineers, one of the oldest arms of Indian Army. \n" +
                        "\n" +
                        "\n" +
                        "After serving for few years, Spr Prakash Jadhav got married to Ms Rani in 2016 and the couple had a daughter Shravani. By 2021, Spr Prakash had put in over 14 years of service and had worked in varous operational areas with very challenging work environments. Spr Prakash Jadhav was later deputed to serve with 1 RR Battalion, deployed in J&K for counter-insurgency operations.\n" +
                        "\n" +
                        "Anantnag Operation: 27 Nov 2018\n" +
                        "\n" +
                        " \n" +
                        "During 2018, Spr Prakash Jadhav’s unit 1 RR was deployed in Anantnag district of J & K and was engaged in counter-insurgency operations. As the area of responsibility of the unit was insurgency prone area, the troops had to maintain a very high level of alert at all times. On 26 Nov 2018, the security forces had received information from the intelligence sources about the presence of some hardcore militants in Redbani Bala village of Anantnag district . After analyzing the information it was decided to launch an operation to neutralize the militants. On 27 November 2018 in the wee hours, a cordon and search operation was planned in Redbani Bala village by the troops of 1 RR battalion. Spr Prakash Jadhav was part of the team that was assigned the task of launching the operation. \n" +
                        "\n" +
                        " \n" +
                        "\n" +
                        "Spr Prakash Jadhav and his comrades reached the suspected area and launched the operation as planned. Leading this operation, Spr Prakash Jadhav along with his comrades entered the suspected house at around 3.30 am. When the terrorists present inside saw the search party climbing the stairs, they started firing indiscriminately. Sensing the danger to the lives of his comrades, Spr Prakash Jadhav without caring for his life pushed his comrade back and killed a terrorist himself amidst a barrage of bullets from the terrorists. Meanwhile, another terrorist hurled a petrol bomb. Spr Jadhav then instructed his comrades to come out of the house and himself started targeting the other terrorist.\n" +
                        "\n" +
                        " \n" +
                        "\n" +
                        "In the meantime, Spr Jadhav was shot and got injured. Even in the injured condition, Spr Jadhav fired at the other terrorist and managed to eliinate him. Meanwhile, the fire of petrol bomb had spread throughout the house. Spr Jadhav being seriously injured could not extricate himself and was martyred. Spr Prakash was a gallant and gritty soldier who laid down his life in the line of his duty. Spr Prakash Jadhav was given the nation's second highest peace-time gallantry award, “Kirti Chakra” for his exceptional display of bravery, camaraderie, devotion to duty and supreme sacrifice. \n" +
                        "\n" +
                        " \n" +
                        "\n" +
                        "Sep Prakash Jadhav is survived by his fatjer Shri Pundlik Jadhav, mother Smt Sharada Jadhav, wife Smt Rani Prakash Jadhav daughter Shravani.\n" +
                        "\n" +
                        "Sapper Prakash Jadhav made supreme sacrifice of his life in true traditions of Indian Army.  For this act of courage beyond the call of duty and conspicuous gallantry Sapper Prakash Jadhav is recommended for the award of “KIRTI CHAKRA (POSTHUMOUS)”.\n");
                break;
            case 13:
                img.setImageResource(R.drawable.rahul);
                title.setText("SEP Rahul Bhairu Sulagekar");
                placeDesc.setText("Sep Rahul Bhairu Sulagekar hailed from Uchagaon village in Belagavi tehsil of Karnataka. Son of Shri Bhairu Sulagekar and Smt Geetha, Sep Rahul studied from MLA RC college Bangalore and joined the army. He was recruited into 4 MLI of the Maratha Light Infantry Regiment, an infantry regiment well known for its gallant soldiers.\n" +
                        "\n" +
                        "\n" +
                        "Krishna Ghati sector Operation: 08 Nov 2019\n" +
                        "\n" +
                        "During Nov 2019, Sep Rahul’s unit 4 MLI was deployed in the Poonch sector of J&K. The unit troops were manning the forward posts in the Krishna Ghati sector along the LOC. The Area of Operation (AOR) was very volatile wherein the Pakistani forces often resorted to unprovoked firing from across the border. The purpose of the unprovoked firing was invariably to provide cover fire to infiltrating terrorists. One such attempt was made in the early hours of 8th Nov 2019 in the Krishna Ghati sector. The troops at the forward post observed the suspicious movement of the terrorists at around 2:30 am. The movement was accompanied by the cover fire from across the border. Sep Rahul was manning one of the forward posts on that day.\n" +
                        "\n" +
                        " \n" +
                        "Sep Rahul and his comrades swung into action on detecting the suspecious movement. The accompany cover fire confirmed the infiltration attempt and soon the troops made contact with the infiltrators. A fierce gun battle followed thereafter to foil the infiltration attempt. However during the exchange of fire Sep Rahul  sustained gunshot wounds and was evacuated to the nearby medical aid center. Sep Rahul however succumbed to his injuries and was martyred. Sep Rahul  was a valiant and dedicated soldier who laid down his life at the age of 22 years  in the service of the nation.\n" +
                        " \n" +
                        "\n" +
                        "Sep Rahul Bhairu Sulagekar is survived by his father Shri Bhairu Sulagekar and mother Smt Geetha.");
                break;
            case 14:
                img.setImageResource(R.drawable.sagar);
                title.setText("SEP Sagar Basavaraj Kumbhar");
                placeDesc.setText("We are in the process of gathering additional information about this valiant son of India and are diligently putting painstaking efforts in scouring the data available in public domain, towards that end. However, we sincerely urge family members, former Unit or Formation colleagues, other comrades, and friends to come forward and share information with us in the form of text, photographs or video clips, available with them by virtue of their association with this brave soldier.");
                break;
            case 15:
                img.setImageResource(R.drawable.bharath);
                title.setText("Lance Naik Bharat Maske");
                placeDesc.setText("Lance Naik Bharat Maske hailed from the Belgaum district of Karnataka and was born on 18th February 1972. Son of Shri Baban Narayan Maske and Smt Padmavati, he had an elder brother and a sister as his siblings. After completing his school education he joined the Indian army on  27th August 1990 at the age of 18 years. He was recruited into the 5 Maratha LI battalion of the Maratha Light Infantry Regiment, an infantry Regiment well known for its fearless soldiers.\n" +
                        "\n" +
                        "After completing his training he got posted to Ladakh and took part in operations as part of \"Op Rakshak\". In the year 1997, he got posted to the North-East and participated in operations as part of \"Op Hifazat\". After serving for a few years, Lance Nk Maske got married to Ms. Lakshmi and the couple was blessed with two sons. Later he was deputed to serve with the 17 RR battalion deployed in J & K for counter-insurgency operations.\n" +
                        "\n" +
                        "Operation Vijay: 20 July 1999\n" +
                        "\n" +
                        "During 1999 Lance Naik Bharat Maske’s unit 17 RR was deployed in the Poonch sector of J&K. The unit troops were engaged in counter-insurgency operations on a regular basis as its AOR (Area of Operation) was affected by active militancy. Though the Kargil war was going on at that time, the militancy had not subsided and the troops of 17 RR battalion were constantly on high alert. On 20 July 1999, after getting specific intelligence about the presence of militants, the troops of 17 RR battalion launched a search and cordon operation in the suspected area in its AOR(Area of Responsibility). Lance Naik Bharat Maske was part of the team that was entrusted with the task of taking on the militants.\n" +
                        "\n" +
                        "On being challenged, the militants fired at the troops and a fierce gun-battle ensued. During the operation Lance Naik Bharat Maske  got severely injured in the exchange of fire. He was later shifted to the hospital, where he  succumbed to his injuries and was martyred.  Lance Naik Bharat Maske was a valiant and dedicated soldier, who at the young age of 27 years, laid down his life in the service of the nation.  He was given the gallantry award, “Sena Medal” for his exceptional courage, devotion to duty, and supreme sacrifice.\n" +
                        "\n" +
                        "Lance Naik Bharat Maske is survived by his father Shri Baban Narayan Maske, mother Smt Padmavati, wife Smt Lakshmi Maske and two sons.\n");
                break;
            case 16:
                img.setImageResource(R.drawable.lakshmana);
                title.setText("Sindhura Lakshmana");
                placeDesc.setText("Sindhura Lakshmana is a brave man who had got the trait of rebelling against the injustice, untruth, and irreligion right from his birth. He is the audacious brave man who rebelled against the injustice. When situation demanded, he fought without caring for his life and had become a challenge for the British government. Born in 1898, birth place - Sindhur of Jatth province. Father’s name – Bedar Sabu, mother’s name – Narasavva, her native was Radderatti of Athani taluk. He grew up in this locale.\n" +
                        " \n" +
                        "\tGandasiddare irabeka yenthava\n" +
                        "\tNammanna Sindhura Lakshmana nanthava\n" +
                        "\tMallina angi maimyale\n" +
                        "\tChakari kolu kaiyaaga shaman ghtika sutti\n" +
                        " \tChaavadige ontaana\n" +
                        "\n" +
                        "\tThough Sindhura is a small village, it had got a big name for the administration of Goudas. Sindhura Lakshmana was so bold that he confronted with such Goudas and questioned their atrocity. After that the Goudas filed a complaint against Sindhura Lakshmana that he has cheated the government in revenue collection. At the same time Dolli Bhimappa, Hiremath Irayya, Manohar Kulkarni were ready to become eye-witness and give statement that Lakshmana’s elder sister’s sons named Saaba, Narasu, Gopali had robbed in Basaragi,Beeluru, and Sindhur. Sindhura Lakshmana had mastery in various power-adventure exhibiting qualities such as using catapult, running backward fastly, wrestling, pulling carts of full sacks, climbing the wall from backwards. He participated in all those talent exhibition shows. He encouraged the people around him to do those adventures. He would defeat the people opposed him. In this background Sindhura Lakshmana inevitably had to rebel against the politically strong Indians who tortured the innocent. Those politically strong people were the followers of the British. So naturally in a way he raised war against the British. Any freedom loving provincial rulers or any other institutions did not patronage him. But still he continued to oppose the British. He started looting the rich. He was selfless hence distributed the looted money to the poor.Lakshmana, a mutineer to the British stood as a rebel till the end of his life.\n" +
                        "\n" +
                        "\tBandeddu naavelli aanglara hididu\n" +
                        "\tKandalli thulidu barona bennatti\n" +
                        "\tOandinlli haaki thuliyona\n" +
                        "\n" +
                        "Sidduba of Kohalli was his soul mate.Police of Jatth province were running behind him. Foujdar Kalal, Pavadeppa, Dildar Khan were the main people in them. When Sindhula Lakshmana and Foujdar Kalal were fighting neck to neck, Narasu’s axe cut down Kalal’s neck. This made the British officers and the people terrified. British Representative Garmon came to power. Venkatagouda was the Policepatil. Gormon threatened the Policepatil and pressurized to capture Sindhura Lakshmana. Eventually Venkanagouda made a conspiracy to retain his existence. In 1922 during the Shravana month, he camped at Kappara Padeyavvana Gudda (a Hill) in Taggi. He arranged a cordial social gathering and invited Lakshmana. Lakshmana trusted him and attended the event but he was killed (on 15th July 5 1922) while having the food.\n" +
                        "\n" +
                        "\tParagani Jatthi Umarani deshada maahee\n" +
                        "\tAaluvanta dani Davale Saradara\n" +
                        "\tJatthi samsthana paiki sanna halli Sindhura \n" +
                        "\tSindhura Lakshmana hutyano bhanta enisyana \n" +
                        "\tKotta vachana huttritappalilla\n" +
                        " \tGhata hoguva thanaka hidida hata bidalilla\n" +
                        " \tLakshmananu thirugi heilutthane naale barteeni\n" +
                        " \tHushari iru ni chaavadi balaga\n" +
                        " \tEe maathu sulla alla gandu haakupadaraaga");
                break;
            case 17:
                img.setImageResource(R.drawable.athani);
                title.setText("Babu Hujare");
                placeDesc.setText("He was born on 1/2/1910 in Jatt Province’s Khojanatti village. Though his birth place was Khojanatti, his childhood was spent at his mother’s native Telsang village of Athani taluk, Belagavi district. He got primary education in the same village. A teacher named Vitthal Namdev Pol appreciated his intelligence and encouraged a lot to get school education. Later after the transfer of Vitthal Pol, another teacher named Narasing also encouraged even more. Right from the childhood the devil of poverty was behind him. Along with going to school he decides firmly to sell beetle leaves. He never thought that the leaves he would sell will be purchased or not. He was unaware of the superior-inferior concept. When he entered that work having the good notion that others are also human beings as he was, the people sprinkled water and took the leaves from him. He asked why they did like that, the reason they told that he belonged to inferior caste of Chambar (Cobblers), if they eat his leaves disease will infect them. This shook his heart and made him to take an oath to fight against it. For higher education he left Telsang and came to the historical city Vijapur. Famous businessmen namely Siddappa Nimbaragi, Basayya Purani, Murigeppa, advocate Sugand Vandra, Bharamanna Hosamani, Raanasi Kattimani, Headmaster Athani these all encouraged his studies. In1928-29 before attending the Matriculation exam, plague spread all around and took the lives of his brother and sister. He skipped his exams and went to perform cremation rituals of his brother and sister. Once again he returned to Bijapur and attended the Matriculation exam. Later he fought against British for the liberation of the country. In 1945 he was arrested and imprisoned and punished rigorously at Puna’s Yarwad Jail. He set fire to many police stations, cut down Post communication cables and conducted strikes against the British. In such situation he worked hard to eradicate social evils. He rendered his humble service to Dr. Babasaheb Ambedkar in his visit to Bijapur. Overall it is a matter of proud to call him a social reformer and freedom loving patriot. He has worked as a member of BombayLegislative Assembly from 1946-1952. During 1946-1952 Congress party recognized his loyalty and made him the chairman of Vijapur District Congress Committee. From 1953 to 1959 he worked as District Congress Organizing Secretary and as Secretary from 1959 to 64. As a member of Vijapur Taluku Land Ownership Judicial Board, he worked hard for the development of farmers. He implemented Madivala Aeta Neeravari (an irrigation scheme). On 1st November 1992 he was honored by the Rajyotsava Award as well. Freedom fighter Babu Hujare has been honored by so many awards.");
                break;
            case 18:
                img.setImageResource(R.drawable.athani);
                title.setText("Ramappa Monappa Kamble");
                placeDesc.setText("Ramappa Monappa Kamble of jugular,jumped into freedom struggale by breking The fense between Kagwad and Shedabal,demolishing Railway pole,burning Lokhur panchayat shelter,looting the Kagawad and Shiraguppa post,burnig toddy supplying vehicles and cutting off Pine trees.");
                break;

        }

        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //need to go to exploreFragment.
                finish();
            }
        });

    }
}