import scrapy

class post(scrapy.Item):

	pass
class crawling(scrapy.Spider):
	name = "baguvix"
	def start_requests(self):
		yield scrapy.Request(url="https://www.nhaccuatui.com/bai-hat/nhac-tre-moi.html", callback=self.parse)
	def parse(self, response):
		name_song = response.xpath('//a[@class="name_song"]//text()').extract()
		print(name_song)