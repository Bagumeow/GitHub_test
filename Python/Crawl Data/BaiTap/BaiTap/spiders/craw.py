import scrapy

class post(scrapy.Item):
    title = scrapy.Field()
    time = scrapy.Field()
    link = scrapy.Field()
class crawl(scrapy.Spider):
    name = 'run'
    def start_requests(self):
        url = 'https://moveek.com/phim-thang-11-2021/'
        yield scrapy.Request(url=url, callback=self.parse)
    def parse(self, reponse):
        items = post()

        title = reponse.xpath('//*[@id="app"]/div[1]/div[4]/div/div[2]/div/div/div/div[2]/h3/a//text()').extract()
        titles=[i.strip() for i in title]
        items['title'] = titles

        time = reponse.xpath('//div[@class="col text-muted"]//text()').extract()
        times=[i.strip() for i in time]
        items['time'] = times

        link = reponse.xpath('//*[@id="app"]/div[1]/div[4]/div/div[2]/div/div/div/div[2]/h3/a//@href').extract()
        str ='https://moveek.com'
        new_link = [str+i for i in link]
        items['link'] = new_link

        yield items