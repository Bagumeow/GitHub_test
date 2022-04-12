import scrapy 
class post(scrapy.Item):
	pass
class crawling(scrapy.Spider):
	name = 'tom'
	def start_requests(self):
		url = 'https://thethao247.vn/doi-bong/manchester-united-tt33.html'
		yield scrapy.Request(url=url, callback=self.parser)
	def parser(self, response):
		link = response.xpath('/html/body/main/div/div/div[2]/div/div[4]/table/tbody/tr/td[2]/a//@href').extract()
		allow_domain = 'https://thethao247.vn'
		for urls in link:
			total_link = allow_domain + urls
			print(total_link)
			yield scrapy.Request(url = total_link, callback=self.parser_post)
	def parser_post(self,response):
		Name_cauthu = response.xpath('/html/body/main/div/div/div[2]/div/div[2]/div/h1//text()').get()
		print(Name_cauthu)