{
  "filepath": "/tmp/Csv-16b/src/test/java/org/apache/commons/csv/PerformanceTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PerformanceTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 39,
      "end_line": 304,
      "comment": "\n * Basic test harness.\n *\n * Requires test file to be downloaded separately.\n "
    },
    {
      "type": "field",
      "varNames": [
        "PROPS"
      ],
      "begin_line": 42,
      "end_line": 59,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "max"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "num"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": " number of elapsed times recorded"
    },
    {
      "type": "field",
      "varNames": [
        "elapsedTimes"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "format"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "BIG_FILE"
      ],
      "begin_line": 68,
      "end_line": 68,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.PerformanceTest.main(java.lang.String[])",
      "begin_line": 70,
      "end_line": 121,
      "comment": "",
      "child_ranges": [
        "(line 71,col 9)-(line 81,col 9)",
        "(line 82,col 9)-(line 82,col 37)",
        "(line 83,col 9)-(line 83,col 23)",
        "(line 84,col 9)-(line 86,col 9)",
        "(line 87,col 9)-(line 94,col 9)",
        "(line 95,col 9)-(line 97,col 9)",
        "(line 98,col 9)-(line 98,col 51)",
        "(line 100,col 9)-(line 120,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.PerformanceTest.createReader()",
      "begin_line": 123,
      "end_line": 125,
      "comment": "",
      "child_ranges": [
        "(line 124,col 9)-(line 124,col 60)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Stats",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 128,
      "end_line": 135,
      "comment": " Container for basic statistics"
    },
    {
      "type": "field",
      "varNames": [
        "count"
      ],
      "begin_line": 129,
      "end_line": 129,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "fields"
      ],
      "begin_line": 130,
      "end_line": 130,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.csv.PerformanceTest.Stats.Stats(int, int)",
      "begin_line": 131,
      "end_line": 134,
      "comment": "",
      "child_ranges": [
        "(line 132,col 13)-(line 132,col 20)",
        "(line 133,col 13)-(line 133,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.PerformanceTest.show(java.lang.String, org.apache.commons.csv.PerformanceTest.Stats, long)",
      "begin_line": 138,
      "end_line": 142,
      "comment": " Display end stats; store elapsed for average",
      "child_ranges": [
        "(line 139,col 9)-(line 139,col 64)",
        "(line 140,col 9)-(line 140,col 101)",
        "(line 141,col 9)-(line 141,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.PerformanceTest.show()",
      "begin_line": 145,
      "end_line": 154,
      "comment": " calculate and show average",
      "child_ranges": [
        "(line 146,col 9)-(line 146,col 21)",
        "(line 147,col 9)-(line 152,col 9)",
        "(line 153,col 9)-(line 153,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.PerformanceTest.testReadBigFile(boolean)",
      "begin_line": 156,
      "end_line": 167,
      "comment": "",
      "child_ranges": [
        "(line 157,col 9)-(line 165,col 9)",
        "(line 166,col 9)-(line 166,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.PerformanceTest.readAll(java.io.BufferedReader, boolean)",
      "begin_line": 169,
      "end_line": 178,
      "comment": "",
      "child_ranges": [
        "(line 170,col 8)-(line 170,col 21)",
        "(line 171,col 8)-(line 171,col 22)",
        "(line 172,col 8)-(line 172,col 21)",
        "(line 173,col 8)-(line 176,col 8)",
        "(line 177,col 8)-(line 177,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.PerformanceTest.testExtendedBuffer(boolean)",
      "begin_line": 180,
      "end_line": 216,
      "comment": "",
      "child_ranges": [
        "(line 181,col 9)-(line 214,col 9)",
        "(line 215,col 9)-(line 215,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.PerformanceTest.testParseCommonsCSV()",
      "begin_line": 218,
      "end_line": 231,
      "comment": "",
      "child_ranges": [
        "(line 219,col 9)-(line 229,col 9)",
        "(line 230,col 9)-(line 230,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.PerformanceTest.getLexerCtor(java.lang.String)",
      "begin_line": 234,
      "end_line": 238,
      "comment": "",
      "child_ranges": [
        "(line 235,col 8)-(line 236,col 98)",
        "(line 237,col 8)-(line 237,col 98)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.PerformanceTest.testCSVLexer(boolean, java.lang.String)",
      "begin_line": 240,
      "end_line": 286,
      "comment": "",
      "child_ranges": [
        "(line 241,col 9)-(line 241,col 34)",
        "(line 242,col 9)-(line 242,col 28)",
        "(line 243,col 9)-(line 284,col 9)",
        "(line 285,col 9)-(line 285,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.PerformanceTest.createTestCSVLexer(java.lang.String, org.apache.commons.csv.ExtendedBufferedReader)",
      "begin_line": 288,
      "end_line": 292,
      "comment": "",
      "child_ranges": [
        "(line 290,col 9)-(line 291,col 88)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.PerformanceTest.iterate(java.lang.Iterable\u003corg.apache.commons.csv.CSVRecord\u003e)",
      "begin_line": 294,
      "end_line": 302,
      "comment": "",
      "child_ranges": [
        "(line 295,col 8)-(line 295,col 21)",
        "(line 296,col 8)-(line 296,col 22)",
        "(line 297,col 8)-(line 300,col 8)",
        "(line 301,col 8)-(line 301,col 39)"
      ]
    }
  ]
}