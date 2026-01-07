{
  "filepath": "/tmp/Csv-15b/src/test/java/org/apache/commons/csv/issues/JiraCsv213Test.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "JiraCsv213Test",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 41,
      "end_line": 74,
      "comment": "\n * Tests https://issues.apache.org/jira/browse/CSV-213\n *\n * This is normal behavior with the current architecture: The iterator() API presents an object that is backed by data\n * in the CSVParser as the parser is streaming over the file. The CSVParser is like a forward-only stream. When you\n * create a new Iterator you are only created a new view on the same position in the parser\u0027s stream. For the behavior\n * you want, you need to open a new CSVParser.\n *\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.issues.JiraCsv213Test.createEndChannel(java.io.File)",
      "begin_line": 44,
      "end_line": 68,
      "comment": "",
      "child_ranges": [
        "(line 46,col 9)-(line 51,col 50)",
        "(line 53,col 9)-(line 65,col 9)",
        "(line 67,col 9)-(line 67,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.issues.JiraCsv213Test.test()",
      "begin_line": 70,
      "end_line": 73,
      "comment": "",
      "child_ranges": [
        "(line 72,col 9)-(line 72,col 85)"
      ]
    }
  ]
}