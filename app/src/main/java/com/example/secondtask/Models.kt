package com.example.secondtask

object Models {

    private var generatedList : List<ItemModel> = emptyList()

    fun getModelsList(): List<ItemModel> {
        return listOf(
            ItemModel(
                title = "Лев",
                description = "Лев — хищное млекопитающее из семейства кошачьих. Его называют \"царём зверей\" за мощь и величественный вид. Живёт в саваннах Африки. Самцы отличаются густой гривой. Охотой занимаются, в основном, самки в составе прайда.",
                imageUrls = listOf("https://hudognik.net/cache/90857_gal2.jpg",
                    "https://avatars.dzeninfra.ru/get-zen_doc/1570751/pub_5d21a03fe8b90400ad62a77f_5d21a16628942500adc0e2dd/scale_1200",
                    "https://img.gazeta.ru/files3/57/11650057/Depositphotos_31410959_l-2015-pic4_zoom-1500x1500-68948.jpg",
                    "https://lh5.googleusercontent.com/proxy/Rp99IS7wPsmGYScrBv4UBEpic5jyc2QziChxJt0hDYuFsbYz-hTCxoNx-ZQjUa3UUO4iGFOvfWbFSERPQR_HS47JMZc10OdPmwVsN-24rbR-6g8",
                    "https://static.wikia.nocookie.net/naturalpedia/images/d/d4/IMG_2182.JPG/revision/latest?cb=20180101220323&path-prefix=ru")
            ),
            ItemModel(
                title = "Слон",
                description = "Слон — самое крупное наземное животное. Обладает длинным хоботом, мощными бивнями и высокой интеллектуальностью. Живёт в Африке и Азии. Обитает стадами, проявляет заботу о сородичах. Отличается хорошей памятью и способностью к обучению.",
                imageUrls = listOf("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTI3GZZvTSD7T0zg1LKG9TX3YjuM7NztdYZLA&s",
                    "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ9EBhmbcODm5Rd5ipOlRzOkzeCgQhq9EE9_g&s",
                    "https://c.files.bbci.co.uk/110CD/production/_126273896_wed5.jpg",
                    "https://upload.wikimedia.org/wikipedia/commons/9/91/African_Bush_Elephant_Mikumi_cropped.jpg",
                    "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT5oWbVde957T_Kpa0iYH3VjFABCd0NNkCOoQ&s")
            ),
            ItemModel(
                title = "Пингвин",
                description = "Пингвины — нелетающие морские птицы, живущие в южном полушарии, особенно в Антарктиде. Отличаются чёрно-белым оперением и умением плавать. Передвигаются на суше вразвалку. Питаются рыбой и крилем. Образуют колонии с тысячами особей.",
                imageUrls = listOf("https://ichef.bbci.co.uk/ace/ws/640/amz/worldservice/live/assets/images/2016/01/12/160112125613_penguins_walking_624x460_thinkstock_nocredit.jpg.webp",
                    "https://i.bigenc.ru/resizer/resize?sign=QF4xgfjFQPr8xCtPk1slGQ&filename=vault/9e464df7cd2ce50cef5ef0ebe7168e36.webp&width=1200",
                    "https://cdn.tripster.ru/photos/4583303f-0da4-4b90-9812-9e4f80c8cad2.jpg",
                    "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTjIPHOHKA4IYjDVyfEwyoswNXIuVElq76iqA&s")
            ),
            ItemModel(
                title = "Жираф",
                description = "Жираф — самое высокое животное на планете. Обитает в африканских саваннах. Отличается длинной шеей, позволяющей питаться листьями с верхушек деревьев. У него пятнистая окраска, помогающая маскироваться. Передвигается неспешно, но может быстро бегать при необходимости.",
                imageUrls = listOf("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRA0UG3q6CplkeJAZpF5QvtpYC_VE6Jnl6Wvg&s",
                    "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTF15zAAK3ig1AQRIAFXbGXoRrSnLS_mufw5w&s",
                    "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRW5q7ASFaW11UM8qBz3IQz5izy57qpVL2eAA&s",
                    "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQf--XdjTYKwClwx4GLdidynsOsIwqJt029Fw&s",
                    "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSY4B4qbxrTEqltzrHYZSDqBElusparlxgJ4A&s")
            ),
            ItemModel(
                title = "Кенгуру",
                description = "Кенгуру — сумчатое млекопитающее, обитающее в Австралии. Имеет мощные задние лапы и длинный хвост. Передвигается прыжками. Самки вынашивают детёнышей в сумке. Питается травой и листьями. Символ Австралии и её уникальной фауны.",
                imageUrls = listOf("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRAf9w4F-CQrGbJ3v_ahEwe0IFGDH3N2MY67w&s",
                    "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRzfapa8TSb7GvFh1tgvzT8oZzyEsouqQWRIQ&s",
                    "https://static.wikia.nocookie.net/lisenot/images/7/76/Kangaru_desktop.jpg/revision/latest?cb=20150818195745&path-prefix=ru",
                    "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR8pu9QzFVxIrqQZrfIjhOLf1jHwWkQMNHilw&s")
            ),
            ItemModel(
                title = "Тигр",
                description = "Тигр — крупная дикая кошка с полосатой рыжевато-чёрной шерстью. Обитает в Азии. Отличается скрытностью, силой и одиночным образом жизни. Охотится ночью. Некоторые подвиды, например амурский тигр, находятся под угрозой исчезновения.",
                imageUrls = listOf("https://upload.wikimedia.org/wikipedia/commons/thumb/b/b9/P.t.altaica_Tomak_Male.jpg/1200px-P.t.altaica_Tomak_Male.jpg",
                    "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTT7maGJAmrPCM0-dmJbnIHooeAaYtj8rPtqQ&s",
                    "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSqrAqp5XF5bWS5ElLlm1SL5LwGB1kBusi4Eg&s",
                    "https://upload.wikimedia.org/wikipedia/commons/thumb/4/49/Panthera_tigris_tigris.jpg/960px-Panthera_tigris_tigris.jpg")
            ),ItemModel(
                title = "Коала",
                description = "Коала — сумчатое животное, обитающее в эвкалиптовых лесах Австралии. Ведёт ночной образ жизни. Основное питание — листья эвкалипта, которые перевариваются очень медленно. Коалы много спят, до 20 часов в сутки. Обладают милой внешностью.",
                imageUrls = listOf("https://upload.wikimedia.org/wikipedia/commons/thumb/4/49/Koala_climbing_tree.jpg/960px-Koala_climbing_tree.jpg",
                    "https://zoo-ekzo.ru/sites/default/files/images/phascolarctos_cinereus.jpg",
                    "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTPuwckqfJJb1gUYQXiiXbab-SyPmqf2LSl2Q&s",
                    "https://static.ig-store.ru/publications/486/list_img/6753170878dfa.jpg")
            ),ItemModel(
                title = "Волк",
                description = "Волк — хищное млекопитающее семейства псовых. Живёт в лесах, степях и тундре. Образует стаи с чёткой иерархией. Общается сородичами с помощью воя. Питается в основном копытными животными. Считается предком домашней собаки.",
                imageUrls = listOf("https://www.purmuseum.ru/uploads/images/2021/Publikacii2021/volk/Big/%D0%B2%D0%BE%D0%BB%D0%BA%20(1).jpg",
                    "https://upload.wikimedia.org/wikipedia/commons/thumb/7/70/Front_view_of_a_resting_Canis_lupus_ssp.jpg/250px-Front_view_of_a_resting_Canis_lupus_ssp.jpg",
                    "https://static.wikia.nocookie.net/dog/images/f/f6/%D0%92%D0%BE%D0%BB%D0%BA.jpg/revision/latest/scale-to-width-down/1600?cb=20150123082722&path-prefix=ru")
            ),ItemModel(
                title = "Медведь",
                description = "Медведи — крупные хищники, обитающие в лесах Северного полушария. Всеядны, питаются как мясом, так и ягодами, мёдом. Известны бурый и белый медведь. Могут впадать в спячку. Обладают отличным обонянием и мощной физической силой.",
                imageUrls = listOf("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS4bP6xEZ4dyBQJD5x43Bx60ymn1u2a96eF-A&s",
                    "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTEYG8bJmSwN_y0_PwntmXrx4gisN8bRA0-dw&s",
                    "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRS9YGdy8yi920oTwrj9yTNaVGX6Z998CD4CA&s",
                    "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSHxSNAjVi0sc7Z8OS2WFEsASJfSeUs9voVFQ&s")
            ),ItemModel(
                title = "Лиса",
                description = "Лиса — небольшое хищное животное с рыжеватой шерстью и пушистым хвостом. Обитает в лесах и полях. Отличается хитростью и ловкостью. Питается грызунами, птицами и ягодами. Лисы ведут одиночный образ жизни и активно охотятся ночью.",
                imageUrls = listOf("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcShq5EHHlCm73vjqNbaWwQxl0D31H-0nCUydg&s",
                    "https://taigaclothing.ru/images/foxx_taiga_odejda.jpg",
                    "https://animaljournal.ru/articles/wild/psovie/lisa_obiknovennaya/lisica_obiknovennaya_zver.jpg",
                    "https://upload.wikimedia.org/wikipedia/commons/e/e6/Tiergarten_Worms_Rotfuchs_2011.JPG")
            )
        )
    }

    fun generateList(number: Int) {
        generatedList = getModelsList().shuffled().take(number)
    }

    fun getGeneratedList() : List<ItemModel> {
        return generatedList
    }

}