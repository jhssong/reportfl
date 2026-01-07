{
  "filepath": "/tmp/Csv-4b/src/test/java/org/apache/commons/csv/PerformanceTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PerformanceTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 40,
      "end_line": 289,
      "comment": "\n * Basic test harness.\n *\n * Requires test file to be downloaded separately.\n *\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "PROPS"
      ],
      "begin_line": 43,
      "end_line": 60,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "max"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "num"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": " number of elapsed times recorded"
    },
    {
      "type": "field",
      "varNames": [
        "elapsedTimes"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "format"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "BIG_FILE"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.PerformanceTest.main(java.lang.String[])",
      "begin_line": 71,
      "end_line": 120,
      "comment": "",
      "child_ranges": [
        "(line 72,col 9)-(line 80,col 9)",
        "(line 81,col 9)-(line 81,col 37)",
        "(line 82,col 9)-(line 82,col 23)",
        "(line 83,col 9)-(line 85,col 9)",
        "(line 86,col 9)-(line 93,col 9)",
        "(line 94,col 9)-(line 96,col 9)",
        "(line 97,col 9)-(line 97,col 51)",
        "(line 99,col 9)-(line 119,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.PerformanceTest.getReader()",
      "begin_line": 122,
      "end_line": 124,
      "comment": "",
      "child_ranges": [
        "(line 123,col 9)-(line 123,col 60)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Stats",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 127,
      "end_line": 134,
      "comment": " Container for basic statistics"
    },
    {
      "type": "field",
      "varNames": [
        "count"
      ],
      "begin_line": 128,
      "end_line": 128,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "fields"
      ],
      "begin_line": 129,
      "end_line": 129,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.csv.PerformanceTest.Stats.Stats(int, int)",
      "begin_line": 130,
      "end_line": 133,
      "comment": "",
      "child_ranges": [
        "(line 131,col 13)-(line 131,col 20)",
        "(line 132,col 13)-(line 132,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.PerformanceTest.show(java.lang.String, org.apache.commons.csv.PerformanceTest.Stats, long)",
      "begin_line": 137,
      "end_line": 141,
      "comment": " Display end stats; store elapsed for average",
      "child_ranges": [
        "(line 138,col 9)-(line 138,col 64)",
        "(line 139,col 9)-(line 139,col 101)",
        "(line 140,col 9)-(line 140,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.PerformanceTest.show()",
      "begin_line": 144,
      "end_line": 153,
      "comment": " calculate and show average",
      "child_ranges": [
        "(line 145,col 9)-(line 145,col 21)",
        "(line 146,col 9)-(line 151,col 9)",
        "(line 152,col 9)-(line 152,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.PerformanceTest.testReadBigFile(boolean)",
      "begin_line": 155,
      "end_line": 164,
      "comment": "",
      "child_ranges": [
        "(line 156,col 8)-(line 162,col 8)",
        "(line 163,col 8)-(line 163,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.PerformanceTest.readAll(java.io.BufferedReader, boolean)",
      "begin_line": 166,
      "end_line": 175,
      "comment": "",
      "child_ranges": [
        "(line 167,col 8)-(line 167,col 21)",
        "(line 168,col 8)-(line 168,col 22)",
        "(line 169,col 8)-(line 169,col 21)",
        "(line 170,col 8)-(line 173,col 8)",
        "(line 174,col 8)-(line 174,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.PerformanceTest.testExtendedBuffer(boolean)",
      "begin_line": 177,
      "end_line": 212,
      "comment": "",
      "child_ranges": [
        "(line 178,col 8)-(line 210,col 8)",
        "(line 211,col 8)-(line 211,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.PerformanceTest.testParseCommonsCSV()",
      "begin_line": 214,
      "end_line": 224,
      "comment": "",
      "child_ranges": [
        "(line 215,col 8)-(line 222,col 8)",
        "(line 223,col 8)-(line 223,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.PerformanceTest.getLexerCtor(java.lang.String)",
      "begin_line": 227,
      "end_line": 231,
      "comment": "",
      "child_ranges": [
        "(line 228,col 8)-(line 229,col 98)",
        "(line 230,col 8)-(line 230,col 98)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.PerformanceTest.testCSVLexer(boolean, java.lang.String)",
      "begin_line": 233,
      "end_line": 277,
      "comment": "",
      "child_ranges": [
        "(line 234,col 8)-(line 234,col 33)",
        "(line 235,col 8)-(line 235,col 27)",
        "(line 236,col 8)-(line 275,col 8)",
        "(line 276,col 8)-(line 276,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.PerformanceTest.iterate(java.lang.Iterable\u003corg.apache.commons.csv.CSVRecord\u003e)",
      "begin_line": 279,
      "end_line": 287,
      "comment": "",
      "child_ranges": [
        "(line 280,col 8)-(line 280,col 21)",
        "(line 281,col 8)-(line 281,col 22)",
        "(line 282,col 8)-(line 285,col 8)",
        "(line 286,col 8)-(line 286,col 39)"
      ]
    }
  ]
}