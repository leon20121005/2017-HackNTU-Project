# DelicacySentimentAnalysis

Prerequisites:

1. `jsoup-1.10.3.jar` in current file.

2. `dom4j-2.0.1.jar` in current file.

3. `jieba-analysis.jar` in current file.

4. `org.json.jar` in current file.

If using `cmd.exe` to compile and run:

1. Change directory to current file.

2. Enter `javac -encoding utf-8 -classpath "jsoup-1.10.3.jar;dom4j-2.0.1.jar;jieba-analysis.jar;org.json.jar;" *.java` to compile.

3. Enter `java -classpath "jsoup-1.10.3.jar;dom4j-2.0.1.jar;jieba-analysis.jar;org.json.jar;." main IPeenCrawler CKIPClient Term PIXNETCrawler Comment LexiconBasedMethod ActionAnalysis TextReader SegmentChinese SentimentAnalyzer FrequencyRecorder KeywordFinder SentimentalDictionary PIXNETDelicacyExplorer SqlFactory` to run.
