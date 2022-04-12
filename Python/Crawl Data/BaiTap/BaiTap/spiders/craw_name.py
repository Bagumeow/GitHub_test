import scrapy

class post(scrapy.Item):

	pass
class crawling(scrapy.Spider):
	name = "baguvix"
	def start_requests(self):
		yield scrapy.Request(url="https://www.goodreads.com/shelf/show/scrapy", callback=self.parse)
	def parse(self, response):
		name_book = response.xpath('//a[@class="bookTitle"]//text()').extract()
		print(name_book)
		name_author = response.xpath('//a[@class="authorName"]//text()').extract()
		print(name_author)
		link_book = response.xpath('//a[@class="bookTitle"]//@href').extract()
		print(link_book)
