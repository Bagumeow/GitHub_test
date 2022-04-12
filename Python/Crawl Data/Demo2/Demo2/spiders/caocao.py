import scrapy

class post(scrapy.Item):
	links = scrapy.Field()
class crawl(scrapy.Spider):
	name = "hihi"
	def start_requests(self):
		link="https://cafeland.vn/du-an/page-"
		for i in range(1,3):
			total_link = link + str(i) + "/"
			yield scrapy.Request(url=total_link,callback=self.parse)
	def parse(self, response):
		#cào thuôc tính href của cafe 
		link = response.xpath("/html/body/div[2]/div[2]/div[2]/div[3]/div[1]/div[2]/ul/li/div[2]/h3/a/@href").extract()
		
		for urls in link :
			scrapy.Request(url = urls,callback=self.parse_post )
	def parse_post(self,response):
		items = post()
		link_map = response.xpath('//*[@id="tab-duan-1"]/div[1]/a/@href').extract()
		items['links'] = link_map
		yield 
