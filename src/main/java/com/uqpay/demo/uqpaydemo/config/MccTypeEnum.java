package com.uqpay.demo.uqpaydemo.config;

/**
 * @author zhangyi
 * @date 2019/9/23
 */
public enum MccTypeEnum {
    _0742("0742", "兽医服务", "Veterinary services"),
    _0743("0743", "葡萄酒生产商", "Wine manufacturer"),
    _0744("0744", "香槟生产商", "Champagne manufacturer"),
    _0763("0763", "农业合作", "Agricultural co-operatives"),
    _0780("0780", "景观美化和园艺服务", "Landscaping and horticultural services"),
    _1520("1520", "一般承包商 - 住宅和商业楼", "General contractors – residential and commercial"),
    _1740("1740", "砖、石、瓦、石膏和绝缘工程承包商", "Masonry, Stonework, Tile Setting, Plastering and Insulation Contractors"),
    _1750("1750", "木工工程承包商", "Carpentry Contractors"),
    _1761("1761", "屋顶、屋围、金属片（铁皮）安装工程承包商", "Roofing, Siding, and Sheet Metal Work Contractors"),
    _1771("1771", "混凝土工程承包商", "Concrete Work Contractors"),
    _1799("1799", "未列入其他代码的承包商", "Contractors-Others"),
    _2741("2741", "各类出版和印刷服务", "Miscellaneous Publishing and Printing"),
    _2791("2791", "排版、刻板和相关服务", "Typesetting, Plate Making and Related Services"),
    _2842("2842", "专业清洁、抛光和卫生服务", "Specialty Cleaning, Polishing and Sanitation Preparations"),
    _3998("3998", "中国铁路总公司", "China Railway"),
    _4011("4011", "铁路运输", "Railroads"),
    _4111("4111", "本市和市郊通勤旅客运输（包括轮渡）", "Local and suburban commuter passenger transportation, including ferries"),
    _4112("4112", "铁路客运", "Passenger railways"),
    _4119("4119", "救护车服务", "Ambulance services"),
    _4121("4121", "出租车和豪华轿车服务", "Taxicabs and limousines"),
    _4131("4131", "公路客运", "Bus Lines"),
    _4214("4214", "长短途机动车与卡车货运,搬运公司,仓储公司,本地专运公司", "Motor freight carriers and trucking – local and long distance, moving and storage companies, and local delivery"),
    _4215("4215", "快递服务（空运、地面运输或海运）", "Courier services – air and ground, and freight forwarders"),
    _4225("4225", "公共仓储服务-农产品、冷冻品和家用产品", "Public warehousing and storage – farm products, refrigerated goods, and household goods"),
    _4411("4411", "轮船和巡游航线服务", "Steamships and cruise lines"),
    _4457("4457", "出租船只", "Boat rentals and leasing"),
    _4458("4458", "烟草配送", "Tobacco logistics"),
    _4468("4468", "船舶、海运服务和供给", "Marinas, marine service, and supplies"),
    _4511("4511", "航空公司", "Airlines and air carriers"),
    _4582("4582", "机场服务", "Airports, flying fields, and airport terminals"),
    _4722("4722", "旅行社和旅游服务", "Travel agencies and tour operators"),
    _4733("4733", "景区售票", "Ticket sales at scenic spots"),
    _4784("4784", "路桥通行费", "Tolls and bridge fees"),
    _4789("4789", "未列入其他代码的运输服务", "Transportation services – not elsewhere classified"),
    _4812("4812", "通信设备和电话销售", "Telecommunication equipment and telephone sales"),
    _4814("4814", "电信服务，包括本地和长途电话、信用卡电话、磁卡电话和传真", "Telecommunication services, including local and long distance calls, Credit Card calls, calls through use of magnetic stripe reading telephones, and faxes"),
    _4815("4815", "月结电话收费", "Monthly Telephone Statement"),
    _4816("4816", "计算机网络/信息服务", "Computer network/information services"),
    _4821("4821", "电报服务", "Telegraph services"),
    _4829("4829", "电汇和汇票服务", "Wire Transfer Money Orders"),
    _4899("4899", "有线和其他付费电视服务", "Cable and other pay television services"),
    _4900("4900", "公共事业（电力、煤气、自来水、清洁服务）", "Utilities-electric, gas, water, and sanitary"),
    _5013("5013", "机动车供应及零配件", "Motor vehicle supplies and new parts"),
    _5021("5021", "办公及商务家具", "Office and commercial furniture"),
    _5039("5039", "未列入其他代码的建筑材料", "Construction materials-not elsewhere classified"),
    _5044("5044", "摄影、影印及微缩摄影器材", "Photographic, photocopy, microfilm, equipment and supplies"),
    _5045("5045", "未列入其他代码的计算机、计算机外围设备", "Computers, computer peripherals equipment-not elsewhere classified"),
    _5046("5046", "未列入其他代码的商用器材", "Commercial equipment-not elsewhere classified"),
    _5047("5047", "医疗/牙科/眼科/医院器材和用品", "Medical/dental/ophthalmic and hospital equipment and supplies"),
    _5051("5051", "金属产品服务商和公司", "Metal service centers and offices"),
    _5065("5065", "电器零件和设备", "Electrical parts and equipment"),
    _5072("5072", "五金器材及用品", "Hardware equipment and supplies"),
    _5074("5074", "管道和供暖设备", "Plumbing and heating equipment and supplies"),
    _5085("5085", "未列入其他代码的工业用品", "Industrial supplies-others"),
    _5094("5094", "宝石和贵金属、手表及珠宝", "Precious stones and metals, watches, and jewelry"),
    _5099("5099", "未列入其他代码的耐用品", "Durable-others"),
    _5111("5111", "文具、办公用品、复印纸和书写纸", "Stationery, office supplies, and printing and writing paper"),
    _5122("5122", "药品、药品经营者", "Drugs, drug proprietaries, and Druggist Sundries"),
    _5131("5131", "布料、缝纫用品和其他纺织品", "Piece goods, notions, and other dry goods"),
    _5137("5137", "男女及儿童制服和服装", "Men's, women's, and children's uniforms and commercial clothing"),
    _5139("5139", "鞋类、帽类", "Commercial footwear and hats"),
    _5169("5169", "未列入其他代码的化学制品", "Biochemical synthetic-others"),
    _5172("5172", "石油及石油产品", "Petroleum and petroleum products"),
    _5192("5192", "书、期刊和报纸", "Books, periodicals, and newspapers"),
    _5193("5193", "花木栽种用品、苗木和花卉", "Florist's supplies, nursery stocks and flowers"),
    _5198("5198", "油漆、清漆用品", "Paints, varnishes, and supplies"),
    _5199("5199", "未列入其他代码的非耐用品", "Non-durable-others"),
    _5200("5200", "家庭用品大卖场", "Home supply warehouse outlets"),
    _5211("5211", "木材和各类建材卖场", "Lumber and building materials outlets"),
    _5231("5231", "玻璃、油漆涂料、墙纸零售", "Glass, paint, and wallpaper shops"),
    _5251("5251", "五金商店", "Hardware shops"),
    _5261("5261", "草坪、花园用品商店（包含花圃）", "Lawn and garden suppliers outlets, including nurseries"),
    _5271("5271", "拖挂式活动房车经销商", "Mobile home dealers"),
    _5300("5300", "会员制批量零售店", "Wholesale clubs"),
    _5309("5309", "免税商店", "Duty-free shops"),
    _5310("5310", "折扣商店", "Discount shops"),
    _5311("5311", "百货商店", "Department stores"),
    _5331("5331", "各类杂货店、便利店", "Variety stores"),
    _5398("5398", "大型企业批发", "Corporate wholesale"),
    _5399("5399", "其他综合零售", "Miscellaneous general merchandise"),
    _5411("5411", "食品杂货店和超级市场", "Grocery stores and supermarkets"),
    _5422("5422", "各类肉类零售商", "Freezer and locker meat provisioners"),
    _5441("5441", "糖果及坚果商店", "Candy, nut, and confectionery shops"),
    _5451("5451", "乳制品店", "Dairies"),
    _5462("5462", "面包房", "Bakeries"),
    _5499("5499", "各类食品店及专门食品零售店", "Miscellaneous food shops – convenience and specialty retail outlets"),
    _5511("5511", "汽车货车经销商-新旧车的销售、服务、维修、零件及出租", "Car and truck dealers (new and used) sales, services, repairs, parts, and leasing"),
    _5521("5521", "汽车货车经销商-专门从事旧车的销售、服务、维修、零件及出租", "Car and truck dealers (used only）sales, service, repairs, parts, and leasing"),
    _5531("5531", "汽车和家庭用品店", "Shop-car, commodity"),
    _5532("5532", "汽车轮胎商店", "Automotive tire outlets"),
    _5533("5533", "汽车零配件商店", "Automotive parts and accessories outlets"),
    _5541("5541", "加油站、服务站", "Service stations (with or without ancillary services）"),
    _5542("5542", "自助加油站", "Automated fuel dispensers"),
    _5551("5551", "船只经销商", "Boat dealers"),
    _5561("5561", "露营、娱乐和公共事业活动车经销商", "Camper, recreational and utility trailer dealers"),
    _5571("5571", "摩托车商店和经销商", "Motorcycle shops and dealers"),
    _5592("5592", "房车销售商", "Motor home dealers"),
    _5598("5598", "雪车商", "Snowmobile dealers"),
    _5599("5599", "未列入其他代码的各类机动车、飞行器和农具经销商", "Miscellaneous automotive, aircraft, and farm equipment dealers – not elsewhere classified"),
    _5611("5611", "男子和男童服装及用品商店", "Men's and boys' clothing and accessories shops"),
    _5621("5621", "妇女成衣商店", "Women's ready-to-wear shops"),
    _5631("5631", "妇女用品商店", "Women's accessory and specialty shops"),
    _5641("5641", "儿童、婴儿服装商店", "Children's and infants' wear shops"),
    _5651("5651", "家庭服装商店", "Family clothing shops"),
    _5655("5655", "运动和马术服装商店", "Sports and riding apparel shops"),
    _5661("5661", "鞋店", "Shoe shops"),
    _5681("5681", "皮货店", "Furriers and fur shops"),
    _5691("5691", "男女服装店", "Men's and women's clothing shops"),
    _5697("5697", "裁缝、修补、改衣店", "Tailors, seamstresses, mending, and alterations"),
    _5698("5698", "假发商店", "Wig and toupee shops"),
    _5699("5699", "各类服装及饰物店", "Miscellaneous apparel and accessory shops"),
    _5712("5712", "家具、家庭摆品、家用设备零售商、制造商（不包含电器）", "Furniture, home furnishings, and equipment shops and manufacturers, except appliances"),
    _5713("5713", "地板商店", "Floor covering services"),
    _5714("5714", "帏帐、窗帘、室内装潢商店", "Drapery, window covering, and upholstery shops"),
    _5715("5715", "酒精饮料批发商", "Wholesaler – alcohol"),
    _5718("5718", "壁炉、壁炉防护网及配件商店", "Fireplaces, fireplace screens, and accessories shops"),
    _5719("5719", "各种家庭装饰专营店", "Miscellaneous home furnishing specialty shops"),
    _5722("5722", "家用电器商店", "Household appliance shops"),
    _5732("5732", "电子设备商店", "Electronics shops"),
    _5733("5733", "音乐商店-乐器、钢琴、琴谱", "Music shops – musical instruments, pianos, and sheet music"),
    _5734("5734", "计算机软件商店", "Computer software outlets"),
    _5735("5735", "音像制品商店", "Record shops"),
    _5811("5811", "包办伙食，宴会承包商", "Caterers"),
    _5812("5812", "就餐场所和餐馆", "Eating places and restaurants"),
    _5813("5813", "饮品场所（酒精饮品）-酒吧、酒馆、夜总会、鸡尾酒馆、迪斯科舞厅", "Drinking places (alcoholic beverages) – bars, taverns, nightclubs, cocktail lounges, and discotheques"),
    _5814("5814", "快餐店", "Fast food restaurants"),
    _5912("5912", "药房、药店", "Drug stores and pharmacies"),
    _5921("5921", "瓶装酒小卖部（啤酒、果酒、白酒）", "Package shops – beer, wine, and liquor"),
    _5931("5931", "旧商品店、二手商品店", "Used merchandise and second-hand shops"),
    _5932("5932", "古玩店-销售、维修和修复服务", "Antique shops – sales, repairs and restoration services"),
    _5933("5933", "当铺", "Pawn shops"),
    _5935("5935", "海上船只遇难救助", "Wrecking and salvage yards"),
    _5937("5937", "古玩复制店", "Antique reproduction shops"),
    _5940("5940", "自行车商店-销售与服务", "Bicycle shops – sales and service"),
    _5941("5941", "体育用品店", "Sports goods shops"),
    _5942("5942", "书店", "Book stores"),
    _5943("5943", "文具、办公、学校用品商店", "Stationery, office, and school supply shops"),
    _5944("5944", "珠宝、手表、钟表和银器商店", "Jewelry, watch, clock, and silverware shops"),
    _5945("5945", "玩具、游戏店", "Hobby, toy, and game shops"),
    _5946("5946", "照相器材商店", "Camera and photographic supply shops"),
    _5947("5947", "礼品、卡片、装饰品、纪念品商店", "Gift, card, novelty, and souvenir shops"),
    _5948("5948", "箱包、皮具店", "Luggage and leather goods shops"),
    _5949("5949", "缝纫、刺绣、织物和布料商店", "Sewing, needlework, fabric, and piece goods shops"),
    _5950("5950", "玻璃器皿和水晶制品店", "Glassware and crystal shops"),
    _5960("5960", "直销-保险服务", "Direct marketing – insurance services"),
    _5962("5962", "电话销售-旅行相关服务", "Telemarketing – travel-related arrangement services"),
    _5963("5963", "送货上门销售", "Door-to-door sales"),
    _5964("5964", "直销-目录邮购商", "Direct marketing – catalog Merchant"),
    _5965("5965", "直销-目录邮购与零售兼营的商户", "Direct marketing – combination catalog and retail Merchant"),
    _5966("5966", "直销-呼出型电话行销商", "Direct marketing – outbound telemarketing Merchants"),
    _5967("5967", "直销-呼入型电话行销商", "Direct marketing – inbound telemarketing Merchants"),
    _5968("5968", "直销-长期订购或会员制商户", "Direct marketing – continuity/subscription Merchants"),
    _5969("5969", "未列入其他代码的直销业务和直销商", "Direct marketing-other direct marketers (not elsewhere classified)"),
    _5970("5970", "工艺美术商店", "Artist supply and craft shops"),
    _5971("5971", "艺术商和画廊", "Art dealers and galleries"),
    _5972("5972", "邮票和纪念币商店", "Stamp and coin shops"),
    _5973("5973", "宗教品商店", "Religious goods stores"),
    _5975("5975", "助听器-销售、服务和用品", "Hearing aids – sales, service, and supply"),
    _5976("5976", "整形外科用品、假肢器材", "Orthopedic goods and prosthetic devices"),
    _5977("5977", "化妆品商店", "Cosmetic shops"),
    _5978("5978", "打字机商店－销售、出租和服务", "Typewriter outlets – sales, rentals, and service"),
    _5983("5983", "燃料经销商－燃油、木材、煤炭和液化石油", "Fuel dealers – fuel oil, wood, coal, and liquefied petroleum"),
    _5992("5992", "花店", "Florists"),
    _5993("5993", "雪茄店", "Cigar shops and stands"),
    _5994("5994", "报亭、报摊", "New agents and newsstands"),
    _5995("5995", "宠物商店、宠物食品及用品", "Pet stores, and pet food and supplies"),
    _5996("5996", "游泳池-销售和服务", "Swimming pools – sales and services"),
    _5997("5997", "电动剃刀商店-销售和服务", "Electric razor shops – sales and service"),
    _5998("5998", "帐篷和遮阳棚商店", "Tent and awning shops"),
    _5999("5999", "其他专营零售店", "Miscellaneous and specialty retail outlets"),
    _6010("6010", "金融机构-人工现金支付", "Financial institutions – manual cash disbursements"),
    _6011("6011", "金融机构-自动现金支付", "Financial institutions – automated cash disbursements"),
    _6012("6012", "金融机构-商品和服务", "Financial institutions – merchandise and services"),
    _6050("6050", "定金/预付款-成员金融机构", "Quasi Cash – Member Financial Institution"),
    _6051("6051", "非金融机构－外币兑换、非电子转帐的汇票、临时支付凭证和旅行支票", "Non-financial institutions — foreign currency, money orders (not wire transfer, scrip, and travelers' checks"),
    _6211("6211", "证券公司-经纪人和经销商", "Securities – brokers and dealers"),
    _6300("6300", "保险销售、保险业和保险金", "Insurance sales, underwriting and premiums"),
    _6381("6381", "保险（保险金）", "Insurance (Premiums)"),
    _6399("6399", "未列入其他代码的保险服务", "Insurance – Unclassified"),
    _6513("6513", "不动产管理-物业管理", "Real Estate Management – Property management"),
    _6529("6529", "支付交易-成员金融机构", "Payment Transactions – Member Financial Institution"),
    _6530("6530", "支付交易-商户", "Payment Transactions-Merchant"),
    _6531("6531", "支付服务提供商-消费转账", "Payment Services Provider – Money Transfer for A Purchase"),
    _6532("6532", "支付服务提供商-成员金融机构", "Payment Services Provider – Member Financial Institution"),
    _6533("6533", "支付服务提供商-商户", "Payment Services Provider – Merchant"),
    _6534("6534", "转账-成员金融机构", "Money Transfer – Member Financial Institution"),
    _6535("6535", "价值购买-成员金融机构", "Value Purchase – Member Financial Institution"),
    _7011("7011", "住宿服务（旅馆、酒店、汽车旅馆、度假村等）", "Lodging – hotels, motels, and resorts"),
    _7012("7012", "分时使用的别墅或度假用房", "Timeshares"),
    _7013("7013", "不动产代理-房地产经纪", "Real Estate Agent – brokers"),
    _7032("7032", "运动和娱乐露营地", "Sports and recreational camps"),
    _7033("7033", "活动房车场及露营场所", "Trailer parks and camp-sites"),
    _7210("7210", "洗衣服务", "Laundry, cleaning, and garment services"),
    _7211("7211", "洗熨服务（自助洗衣服务）", "Laundry services – family and commercial"),
    _7216("7216", "干洗店", "Dry cleaners"),
    _7217("7217", "室内清洁服务（地毯、家具表面的清洁服务）", "Carpet and upholstery cleaning"),
    _7221("7221", "摄影工作室", "Photographic studios"),
    _7230("7230", "美容理发店", "Beauty and barber shops"),
    _7251("7251", "修鞋店、擦鞋店、帽子清洗店", "Shoe repair shops, shoe shine parlors, and hat cleaning shops"),
    _7261("7261", "丧仪殡葬服务", "Funeral services and crematoriums"),
    _7273("7273", "婚姻介绍及陪同服务", "Dating and escort services"),
    _7276("7276", "税收准备服务", "Tax preparation services"),
    _7277("7277", "咨询服务－债务、婚姻和私人事务", "counseling services-debt, marriage, and personal"),
    _7278("7278", "购物服务及会所", "Buying and shopping services and clubs"),
    _7280("7280", "民营医院", "Private hospital"),
    _7295("7295", "家政服务", "Babysitting and housekeeping services"),
    _7296("7296", "出租衣物-服装、制服和正式场合服装", "Clothing rental – costumes, uniforms, and formal wear"),
    _7297("7297", "按摩店", "Massage parlors"),
    _7298("7298", "保健及美容SPA", "Health and beauty spas"),
    _7299("7299", "未列入其他代码的个人服务", "Miscellaneous personal services – not elsewhere classified"),
    _7311("7311", "广告服务", "Advertising services"),
    _7321("7321", "消费者信用报告机构", "Consumer credit reporting agencies"),
    _7322("7322", "债务催收机构", "Debt collection agency"),
    _7333("7333", "商业摄影、工艺、绘图服务", "Commercial photography, art, and graphics"),
    _7338("7338", "快速复印、复制及绘图服务", "Quick copy, reproduction, and blueprinting services"),
    _7339("7339", "速记、秘书服务", "Stenographic and secretarial support services"),
    _7342("7342", "灭虫及消毒服务", "Exterminating and disinfecting services"),
    _7349("7349", "清洁、保养及门卫服务", "Cleaning, maintenance and janitorial services"),
    _7361("7361", "职业中介、临时工", "Employment agencies and temporary help services"),
    _7372("7372", "计算机编程、数据处理和系统集成设计服务", "Computer programming, data processing, and integrated systems design services"),
    _7375("7375", "信息检索服务", "Information retrieval services"),
    _7379("7379", "未列入其他代码的计算机维护和维修服务", "Computer maintenance and repair services – not elsewhere classified"),
    _7392("7392", "管理、咨询和公共关系服务", "Management, consulting, and public relations services"),
    _7393("7393", "侦探、保安、安全服务（包括防弹车和警犬）", "Detective agencies, protective agencies and security services, including armored cars and guard dogs"),
    _7394("7394", "设备、工具、家具和电器出租", "Equipment, tool, furniture, and appliance rental and leasing"),
    _7395("7395", "照相洗印服务", "Photofinishing, laboratories and photo developing"),
    _7399("7399", "未列入其他代码的商业服务", "Business services – not elsewhere classified"),
    _7512("7512", "汽车出租服务", "Automobile rentals"),
    _7513("7513", "卡车及拖车出租", "Truck and utility trailer rentals"),
    _7519("7519", "房车和娱乐车辆出租", "Motor home and recreational vehicle rentals"),
    _7523("7523", "停车场及车库", "Parking lots and garages"),
    _7531("7531", "车体维修店", "Automotive body repair shops"),
    _7534("7534", "轮胎翻新、维修店", "Tire retreating and repair shops"),
    _7535("7535", "汽车喷漆店", "Automotive paint shops"),
    _7538("7538", "汽车服务商店", "Automotive service shops"),
    _7542("7542", "洗车", "Car washes"),
    _7549("7549", "拖车服务", "Towing services"),
    _7622("7622", "电器设备维修店", "Electronics repair shops"),
    _7623("7623", "空调、制冷设备维修店", "Air conditioning and refrigeration repair shops"),
    _7629("7629", "电器设备、小家电维修店", "Electrical and small appliance repair shops"),
    _7631("7631", "手表、钟表和首饰维修店", "Watch, clock, and jewelry repair shops"),
    _7641("7641", "家具维修、翻新", "Furniture re-upholstery, repair and refinishing"),
    _7692("7692", "焊接维修服务", "Welding services"),
    _7699("7699", "各类维修店及相关服务", "Miscellaneous repair shops and related services"),
    _7829("7829", "电影、音像制品创作、发行", "Motion picture and video tape production and distribution"),
    _7832("7832", "电影院", "Motion picture theatres"),
    _7841("7841", "音像制品出租商店", "Video tape rentals"),
    _7911("7911", "歌舞厅、舞蹈工作室、舞蹈培训学校", "Dance halls, studios, and schools"),
    _7922("7922", "戏剧制作（不含电影）、戏剧票务", "Theatrical producers (except motion pictures) and ticket agencies"),
    _7929("7929", "未列入其他代码的乐队、管弦乐队和各类演艺人员", "Bands, orchestras, and miscellaneous entertainers – not elsewhere classified"),
    _7932("7932", "台球和撞球场所", "Billiard and pool establishments"),
    _7933("7933", "保龄球馆", "Bowling alleys"),
    _7941("7941", "商业体育、专业运动俱乐部、运动场地、体育推广公司", "Commercial sports, professional sports clubs, athletic fields, and sports promoters"),
    _7991("7991", "旅游与展览", "Tourist attractions and exhibits"),
    _7992("7992", "公共高尔夫球场", "Public golf courses"),
    _7993("7993", "电子游戏供给", "Video amusement game supplies"),
    _7994("7994", "大型游戏机和游戏场所", "Video game arcades and establishments"),
    _7995("7995", "博彩业", "Betting, including lottery tickets, casino gaming chips, off-track betting, and wagers at race tracks"),
    _7996("7996", "游乐园、马戏团、嘉年华、占卜", "Amusement parks, circuses, carnivals, and fortune tellers"),
    _7997("7997", "会员俱乐部（体育、娱乐、运动等）、乡村俱乐部以及私人高尔夫球场", "Membership clubs (sports, recreation, athletic, country clubs, and private golf courses"),
    _7998("7998", "水族馆、海洋馆、海豚馆、动物园", "Aquariums, seaquariums, and dolphinariums, and Zoos"),
    _7999("7999", "未列入其他代码的娱乐服务", "Recreational services— not elsewhere classified"),
    _8011("8011", "其他卫生服务机构", "Doctors and physicians — not elsewhere classified"),
    _8021("8021", "牙科医生、口腔正畸医生", "Dentists and orthodontists"),
    _8031("8031", "正骨医生", "Osteopaths"),
    _8041("8041", "按摩医生", "Chiropractors"),
    _8042("8042", "验光配镜师、眼科医生", "Optometrists and ophthalmologists"),
    _8043("8043", "光学产品、眼镜店", "Opticians, optical goods, and eyeglasses"),
    _8049("8049", "手足病医生", "Podiatrists and chiropodists"),
    _8050("8050", "护理和照料服务", "Nursing and personal care facilities"),
    _8062("8062", "医院", "Hospitals"),
    _8071("8071", "医学及牙科实验室", "Medical and dental laboratories"),
    _8099("8099", "未列入其他代码的医疗保健服务", "Medical services and health practitioners — not elsewhere classified"),
    _8111("8111", "法律服务和律师事务所服务", "Legal service and attorneys"),
    _8211("8211", "中小学校", "Elementary and secondary schools"),
    _8220("8220", "学院、大学、职业院校、专科学校", "Colleges, universities, professional schools, and junior colleges"),
    _8241("8241", "函授学校", "Correspondence schools"),
    _8244("8244", "商业和文秘学校", "Business and secretarial schools"),
    _8249("8249", "贸易和职业学校", "Trade and vocational schools"),
    _8299("8299", "未列入其他代码的学校和教育服务", "Schools and educational services — not elsewhere classified"),
    _8351("8351", "儿童保育服务", "Child care services"),
    _8398("8398", "慈善和社会公益服务组织", "Charitable and social service organizations"),
    _8641("8641", "市民、社会及友爱组织", "Civic, social and fraternal associations"),
    _8651("8651", "政治组织", "Political organizations"),
    _8661("8661", "宗教组织", "Religious organizations"),
    _8675("8675", "汽车协会", "Automobile associations"),
    _8699("8699", "未列入代码的其他成员组织", "Membership organizations — not elsewhere classified"),
    _8911("8911", "建筑、工程和测量服务", "Architectural, engineering and surveying services"),
    _8912("8912", "装修、装潢、园艺", "Fitment, ornaments and gardening"),
    _8931("8931", "会计、审计、财务服务", "Accounting, auditing, and bookkeeping services"),
    _8999("8999", "未列入其他代码的专业服务", "Professional services—not elsewhere classified"),
    _9211("9211", "法庭费用，包括赡养费和子女抚养费", "Court costs, including alimony and child support"),
    _9222("9222", "罚款", "Fines"),
    _9223("9223", "保释金", "Bail"),
    _9311("9311", "纳税", "Tax payments"),
    _9399("9399", "未列入其他代码的政府服务", "Government services— not elsewhere classified"),
    _9400("9400", "使领馆收费", "Embassy fee payments"),
    _9402("9402", "邮政服务-仅限政府", "Postal services—government only"),
    _9405("9405", "政府间来往", "Internal sales-government"),
    _9498("9498", "信用卡还款", "Credit Card Repayment"),
    _9950("9950", "企业间来往", "Internal sales-corporate");
    private String code;
    private String message;
    private String englishExplanation;

    MccTypeEnum(String code, String message, String englishExplanation) {
        this.code = code;
        this.message = message;
        this.englishExplanation = englishExplanation;
    }

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public String getEnglishExplanation() {
        return englishExplanation;
    }
}