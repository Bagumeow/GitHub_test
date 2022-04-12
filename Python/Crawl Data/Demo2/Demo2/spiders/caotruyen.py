import scrapy

class post(scrapy.Item):
	links = scrapy.Field()
	title = scrapy.Field()
	author = scrapy.Field()
	status = scrapy.Field()
	view = scrapy.Field()
	review_count = scrapy.Field()
class crawl(scrapy.Spider):
	name = "baguvix"
	def start_requests(self):
		link="https://truyentranhaudio.com/manga-list.html?listType=pagination&page="
		for i in range(1,11):
			total_link =link + str(i) +"&artist=&author=&group=&m_status=&name=&genre=&ungenre=&sort=views&sort_type=DESC"
			yield scrapy.Request(url=total_link,callback=self.parse)
	def parse(self, response):
		items=post()
		
		link = response.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[2]/div[1]/div/div[2]/a/@href").extract()
		link_total="https://truyentranhaudio.com/"
		new_link = [link_total+i for i in link]
		items['links'] = new_link

		for urls in new_link:
			yield scrapy.Request(url=urls,callback=self.parse_post)
		yield items
	def parse_post(self, response):
		items=post()

		title = response.xpath("/html/body/div[6]/div/div[1]/div[2]/div[1]/div[2]/ul/h3/text()").extract()
		title=[i.strip() for i in title]
		items['title'] = title

		author = response.xpath("/html/body/div[6]/div/div[1]/div[2]/div[1]/div[2]/ul/li[2]/small/a/text()").extract()
		authors = [i.strip() for i in author]
		items['author'] = authors

		status = response.xpath("/html/body/div[6]/div/div[1]/div[2]/div[1]/div[2]/ul/li[4]/a/text()").extract()
		status = [i.strip() for i in status]
		items['status'] = status

		view =  response.xpath("/html/body/div[6]/div/div[1]/div[2]/div[1]/div[2]/ul/li[6]/text()").extract()
		view = [i.split()[1] for i in view]
		items['view'] = view

		review_count = response.xpath("/html/body/div[6]/div/div[1]/div[2]/div[1]/div[1]/div/p/text()").extract()
		review_count = [i.split()[4] for i in review_count]
		items['review_count'] = review_count
		yield items
		