package com.wzy.rss;

public enum EnumRSS {

    NEWS("要闻","http://rss.sina.com.cn/news/marquee/ddt.xml"),
    SPORT("体育","http://rss.sina.com.cn/roll/sports/hot_roll.xml"),
    TECH("科技","http://rss.sina.com.cn/tech/rollnews.xml"),
    FINANCE("财经","http://rss.sina.com.cn/roll/finance/hot_roll.xml"),
    BLOG("博客","http://rss.sina.com.cn/blog/index/exc.xml"),
    MIL("军事","http://rss.sina.com.cn/roll/mil/hot_roll.xml"),
    LADY("女性","http://rss.sina.com.cn/news/allnews/eladies.xml"),
    FASHION("时尚","http://rss.sina.com.cn/fashion/all/news.xml"),
    AUTO("汽车","http://rss.sina.com.cn/auto/news/t/index.xml"),
    EDU("教育","http://rss.sina.com.cn/edu/focus19.xml"),
    GAME("游戏","http://rss.sina.com.cn/news/allnews/games.xml"),
    ASTRO("星座","http://rss.sina.com.cn/news/allnews/astro.xml"),
    VEDIO("视频","http://rss.sina.com.cn/bn/hot_bn.xml"),
    BABY("育儿","http://rss.sina.com.cn/baby/news/guide.xml");


    private String name;

    private String url;

    private EnumRSS(String name,String url){
        this.name = name;
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public String getUrl() {
        return url;
    }
}
