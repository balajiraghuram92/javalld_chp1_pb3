Word Counting (Assignment):
===========================================

Problem Statement:
-----------------   
In Java, this functional pipeline is elegantly expressed using Streams: flattening lists with flatMap, tokenizing via regular expressions, normalizing, and aggregating frequencies using Collectors.toMap.

Task Description:
-----------------

Implement a method wordFrequencies(List<String> sentences) that accepts a list of sentences, flattens and normalizes them, strips punctuation, counts the frequencies of each unique word, and returns a map containing the words and their counts.