import scrapy
import pandas 

class post(scrapy.Item):
	link_book = scrapy.Field()
	titles = scrapy.Field()
	author_name = scrapy.Field()
	link_img = scrapy.Field()
	rating_value = scrapy.Field()
	rating_count = scrapy.Field()
	discrip = scrapy.Field()
	view_count = scrapy.Field()
class crawling(scrapy.Spider):
	name = "book"
	def start_requests(self):
		yield scrapy.Request(url="https://www.goodreads.com/shelf/show/ebooks",callback=self.parse)
	def parse(self, response):
		items = post()
		link_book = response.xpath("/html/body/div[2]/div[3]/div[1]/div[2]/div[3]/div/div[1]/a[2]/@href").extract()
		link="https://www.goodreads.com/"
		new_link = [link+i for i in link_book]
		items['link_book'] = new_link

		titles = response.xpath("/html/body/div[2]/div[3]/div[1]/div[2]/div[3]/div/div[1]/a[2]/text()").extract()
		items['titles'] = titles

		author_name = response.xpath("/html/body/div[2]/div[3]/div[1]/div[2]/div[3]/div/div[1]/span[2]/div/a/span/text()").extract()
		items['author_name']=author_name

		link_img = response.xpath("/html/body/div[2]/div[3]/div[1]/div[2]/div[3]/div/div[1]/a[1]/img/@src").extract()
		items['link_img']=link_img

		rating_value = response.xpath("/html/body/div[2]/div[3]/div[1]/div[2]/div[3]/div/div[1]/span[3]/text()").extract()
		rating_value = [float(i.split()[2]) for i in rating_value]
		items['rating_value'] = rating_value

		rating_count = response.xpath("/html/body/div[2]/div[3]/div[1]/div[2]/div[3]/div/div[1]/span[3]/text()").extract()
		rating_count = [i.split()[4] for i in rating_count]
		items['rating_count'] = rating_count

		for urls in new_link:
			yield scrapy.Request(url=urls,callback=self.parse_post)

		yield items
	def parse_post(self, response):
		items = post()

		view_count = response.xpath('//*[@id="bookMeta"]/a[3]/meta/@content').extract()
		items['view_count'] = view_count

		descrip = response.xpath('//*[@id="description"]/span/b/text()').extract()
		items['discrip'] = descrip
		yield items



		