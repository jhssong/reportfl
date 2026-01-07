{
  "filepath": "/tmp/Csv-1b/src/test/java/org/apache/commons/csv/PerformanceTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PerformanceTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 31,
      "end_line": 268,
      "comment": "\n * Basic test harness.\n *\n * Requires test file to be downloaded separately.\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "PROPS"
      ],
      "begin_line": 34,
      "end_line": 51,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "max"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "num"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": " number of elapsed times recorded"
    },
    {
      "type": "field",
      "varNames": [
        "elapsedTimes"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "format"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.PerformanceTest.main(java.lang.String[])",
      "begin_line": 60,
      "end_line": 100,
      "comment": "",
      "child_ranges": [
        "(line 61,col 9)-(line 61,col 37)",
        "(line 62,col 9)-(line 62,col 23)",
        "(line 63,col 9)-(line 65,col 9)",
        "(line 66,col 9)-(line 73,col 9)",
        "(line 74,col 9)-(line 76,col 9)",
        "(line 77,col 9)-(line 77,col 51)",
        "(line 79,col 9)-(line 99,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.PerformanceTest.getReader()",
      "begin_line": 102,
      "end_line": 104,
      "comment": "",
      "child_ranges": [
        "(line 103,col 9)-(line 103,col 72)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Stats",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 107,
      "end_line": 114,
      "comment": " Container for basic statistics"
    },
    {
      "type": "field",
      "varNames": [
        "count"
      ],
      "begin_line": 108,
      "end_line": 108,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "fields"
      ],
      "begin_line": 109,
      "end_line": 109,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.csv.PerformanceTest.Stats.Stats(int, int)",
      "begin_line": 110,
      "end_line": 113,
      "comment": "",
      "child_ranges": [
        "(line 111,col 13)-(line 111,col 20)",
        "(line 112,col 13)-(line 112,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.PerformanceTest.show(java.lang.String, org.apache.commons.csv.PerformanceTest.Stats, long)",
      "begin_line": 117,
      "end_line": 121,
      "comment": " Display end stats; store elapsed for average",
      "child_ranges": [
        "(line 118,col 9)-(line 118,col 64)",
        "(line 119,col 9)-(line 119,col 101)",
        "(line 120,col 9)-(line 120,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.PerformanceTest.show()",
      "begin_line": 124,
      "end_line": 133,
      "comment": " calculate and show average",
      "child_ranges": [
        "(line 125,col 9)-(line 125,col 21)",
        "(line 126,col 9)-(line 131,col 9)",
        "(line 132,col 9)-(line 132,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.PerformanceTest.testReadBigFile(boolean)",
      "begin_line": 135,
      "end_line": 144,
      "comment": "",
      "child_ranges": [
        "(line 136,col 8)-(line 142,col 8)",
        "(line 143,col 8)-(line 143,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.PerformanceTest.readAll(java.io.BufferedReader, boolean)",
      "begin_line": 146,
      "end_line": 155,
      "comment": "",
      "child_ranges": [
        "(line 147,col 8)-(line 147,col 21)",
        "(line 148,col 8)-(line 148,col 22)",
        "(line 149,col 8)-(line 149,col 21)",
        "(line 150,col 8)-(line 153,col 8)",
        "(line 154,col 8)-(line 154,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.PerformanceTest.testExtendedBuffer(boolean)",
      "begin_line": 157,
      "end_line": 192,
      "comment": "",
      "child_ranges": [
        "(line 158,col 8)-(line 190,col 8)",
        "(line 191,col 8)-(line 191,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.PerformanceTest.testParseCommonsCSV()",
      "begin_line": 194,
      "end_line": 204,
      "comment": "",
      "child_ranges": [
        "(line 195,col 8)-(line 202,col 8)",
        "(line 203,col 8)-(line 203,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.PerformanceTest.getLexerCtor(java.lang.String)",
      "begin_line": 207,
      "end_line": 212,
      "comment": "",
      "child_ranges": [
        "(line 208,col 8)-(line 209,col 90)",
        "(line 210,col 8)-(line 210,col 117)",
        "(line 211,col 8)-(line 211,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.PerformanceTest.testCSVLexer(boolean, java.lang.String)",
      "begin_line": 214,
      "end_line": 256,
      "comment": "",
      "child_ranges": [
        "(line 215,col 8)-(line 215,col 33)",
        "(line 216,col 8)-(line 216,col 27)",
        "(line 217,col 8)-(line 254,col 8)",
        "(line 255,col 8)-(line 255,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.PerformanceTest.iterate(java.lang.Iterable\u003corg.apache.commons.csv.CSVRecord\u003e)",
      "begin_line": 258,
      "end_line": 266,
      "comment": "",
      "child_ranges": [
        "(line 259,col 8)-(line 259,col 21)",
        "(line 260,col 8)-(line 260,col 22)",
        "(line 261,col 8)-(line 264,col 8)",
        "(line 265,col 8)-(line 265,col 39)"
      ]
    }
  ]
}