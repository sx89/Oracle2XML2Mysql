前言: 

实习中,我和其他俩同事被安排用三天时间,把140行图纸 * 57个字段的信息 写成层次分明的140个XML文件!!!
感觉可以用代码完成,遂写了这个项目

难点:  
oracle,mysql双库连接   
oracle自动commit导致update报错  


功能:  
从oracle获取图纸表ID字段,去Mysql三个表里查,把信息汇总后,制作成XML文件,并把路径写回Oracle图纸表的对应元组

