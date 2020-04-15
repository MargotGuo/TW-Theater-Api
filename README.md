# TW Theater

* 本仓库为**思沃影院**的Web后端应用，提供前端所需的API
  * https://github.com/MargotGuo/TW-theater-back-end.git
* 思沃影院前端

  * https://github.com/UI-Mario/TW-theater-front.git
* 处理豆瓣API数据并存入数据库
  * https://github.com/MargotGuo/TW-homework-repo-sql-scripts/tree/master/Week-final-show-case

# 使用说明

* 运行`TheaterApplication`

* 获取新片榜

  * 请求描述

    ```
    http://localhost:8080/movie/new_movies
    ```

  * 参数

    | 参数名 | 必选 | 类型   | 说明         |
    | :----- | :--- | :----- | :----------- |
    | start  | 否   | number | 从第几条开始 |
    | count  | 否   | number | 一页条数     |

  * 请求示例

    ```
    http://localhost:8080/movie/new_movies
    http://localhost:8080/movie/new_movies/start=0&count=5
    ```

* 获取正在热映的电影
  * 请求描述 / 请求示例

    ```
    http://localhost:8080/movie/in_theaters
    ```

  * 参数：无

* 获取电影Top250

  * 请求描述

    ```
    http://localhost:8080/movie/top250
    ```

  * 参数

    | 参数名 | 必选 | 类型   | 说明         |
    | :----- | :--- | :----- | :----------- |
    | start  | 否   | number | 从第几条开始 |
    | count  | 否   | number | 一页条数     |

  * 请求示例

    ```
    http://localhost:8080/movie/top250
    http://localhost:8080/movie/top250/start=0&count=5
    ```

* 获取电影详情

  * 请求描述

    ```
    http://localhost:8080/movie/detail
    ```

  * 参数

    | 参数名 | 必选 | 类型   | 说明   |
    | :----- | :--- | :----- | :----- |
    | id     | 是   | string | 电影id |

  * 请求示例

    ```
    http://localhost:8080/movie/detail/27199324
    ```

* 根据关键词获取相关电影

  * 请求描述

    ```
    http://localhost:8080/movie/search/
    ```

  * 参数

    | 参数名  | 必选 | 类型   | 说明   |
    | :------ | :--- | :----- | :----- |
    | keyword | 是   | string | 关键词 |

  * 请求示例

    ```
    http://localhost:8080/movie/search/keyword=龙猫
    ```

* 根据影片种类获取相关电影

  * 请求描述

    ```
    http://localhost:8080/movie/genres
    ```

  * 参数

    | 参数名 | 必选 | 类型   | 说明     |
    | :----- | :--- | :----- | :------- |
    | genres | 是   | string | 影片种类 |

  * 请求示例

    ```
    http://localhost:8080/movie/genres/动画
    ```

* 根据影片多个属性获取相关电影

  * 请求描述

    ```
    http://localhost:8080/movie/category
    ```

  * 参数

    | 参数名 | 必选 | 类型   | 说明                         |
    | :----- | :--- | :----- | :--------------------------- |
    | genres | 否   | string | 影片种类，不选则选择全部种类 |
    | year   | 否   | string | 发行年份，不选则选择全部年份 |
    | tag    | 否   | string | 影片标签，不选则选择全部标签 |
    | start  | 是   | int    | 从第几条开始                 |
    | count  | 是   | int    | 一页条数                     |

  * 请求示例

    ```
    http://localhost:8080/movie/category/genres=&year=&tag=青春&start=0&count=10
    ```

* 根据电影id获取类似电影推荐

  * 请求描述

    ```
    http://localhost:8080/movie/similar_movies
    ```

  * 参数

    | 参数名  | 必选 | 类型   | 说明   |
    | :------ | :--- | :----- | :----- |
    | movieId | 是   | string | 电影id |

  * 请求示例

    ```
    http://localhost:8080/movie/similar_movies/movieId=27199324
    ```

    

# 任务分工

* 数据库
  * 共同收集所需数据
* 后端
  * 共同进行需求分析
  * 方法
    * `getMoviesInTheaters()` - 林九州
    * `getNewMovies()` - 郭媛琦
    * `getNewMovies(Integer start, Integer count)` - 郭媛琦
    * `getTop250Movies()` - 林九州
    * `getTop250Movies(Integer start, Integer count)` - 林九州
    * `searchMovies(String keyword)` -  郭媛琦
    * `getSimilarMovies(String movieId)` - 林九州
    * `getMovieById(String movieId)` - 林九州
    * `getMovieByGenres(String genres)` - 郭媛琦
    * `getCategoryMovieByCount(String genres, String year, String tag, Integer start, Integer count)` - 林九州
* 前端
  * 林九州 - 更新api并完善前端页面
  * 郭媛琦进行了一些打杂工作 -v-