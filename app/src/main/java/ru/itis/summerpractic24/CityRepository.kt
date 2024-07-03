package ru.itis.summerpractic24

object CityRepository {
    val cities: List<City> = mutableListOf(
        City(
            id = 4217,
            name = "Kazan",
            desc = "Russia",
            detailedDesc = "Большое описание",
            url = "https://planetofhotels.com/guide/sites/default/files/styles/paragraph__live_banner__lb_image__1880bp/public/live_banner/Kazan-1.jpg"
        ),
        City(
            id = 3211,
            name = "Paris",
            desc = "France",
            detailedDesc = "Большое описание",
            url = "https://upload.wikimedia.org/wikipedia/commons/thumb/4/4b/La_Tour_Eiffel_vue_de_la_Tour_Saint-Jacques%2C_Paris_ao%C3%BBt_2014_%282%29.jpg/1200px-La_Tour_Eiffel_vue_de_la_Tour_Saint-Jacques%2C_Paris_ao%C3%BBt_2014_%282%29.jpg"
        ),
        City(
            id = 24323,
            name = "Tokyo",
            desc = "Japan",
            detailedDesc = "Большое описание",
            url = "https://media.cntraveller.com/photos/6343df288d5d266e2e66f082/16:9/w_2560%2Cc_limit/tokyoGettyImages-1031467664.jpeg"
        ),
        City(
            id = 238,
            name = "London",
            desc = "Eng",
            detailedDesc = "Большое описание",
            url = "https://i2-prod.mirror.co.uk/incoming/article28871026.ece/ALTERNATES/s1200b/0_London-at-sunset.jpg"
        ),
        City(
            id = 43299,
            name = "Rome",
            desc = "Italy",
            detailedDesc = "Большое описание",
            url = "https://i.natgeofe.com/n/3012ffcc-7361-45f6-98b3-a36d4153f660/colosseum-daylight-rome-italy_16x9.jpg"
        )
    )
}