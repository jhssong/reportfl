{
  "filepath": "/tmp/Csv-11b/src/test/java/org/apache/commons/csv/PerformanceTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PerformanceTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 40,
      "end_line": 294,
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
      "end_line": 122,
      "comment": "",
      "child_ranges": [
        "(line 72,col 9)-(line 82,col 9)",
        "(line 83,col 9)-(line 83,col 37)",
        "(line 84,col 9)-(line 84,col 23)",
        "(line 85,col 9)-(line 87,col 9)",
        "(line 88,col 9)-(line 95,col 9)",
        "(line 96,col 9)-(line 98,col 9)",
        "(line 99,col 9)-(line 99,col 51)",
        "(line 101,col 9)-(line 121,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.PerformanceTest.getReader()",
      "begin_line": 124,
      "end_line": 126,
      "comment": "",
      "child_ranges": [
        "(line 125,col 9)-(line 125,col 60)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Stats",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 129,
      "end_line": 136,
      "comment": " Container for basic statistics"
    },
    {
      "type": "field",
      "varNames": [
        "count"
      ],
      "begin_line": 130,
      "end_line": 130,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "fields"
      ],
      "begin_line": 131,
      "end_line": 131,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.csv.PerformanceTest.Stats.Stats(int, int)",
      "begin_line": 132,
      "end_line": 135,
      "comment": "",
      "child_ranges": [
        "(line 133,col 13)-(line 133,col 20)",
        "(line 134,col 13)-(line 134,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.PerformanceTest.show(java.lang.String, org.apache.commons.csv.PerformanceTest.Stats, long)",
      "begin_line": 139,
      "end_line": 143,
      "comment": " Display end stats; store elapsed for average",
      "child_ranges": [
        "(line 140,col 9)-(line 140,col 64)",
        "(line 141,col 9)-(line 141,col 101)",
        "(line 142,col 9)-(line 142,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.PerformanceTest.show()",
      "begin_line": 146,
      "end_line": 155,
      "comment": " calculate and show average",
      "child_ranges": [
        "(line 147,col 9)-(line 147,col 21)",
        "(line 148,col 9)-(line 153,col 9)",
        "(line 154,col 9)-(line 154,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.PerformanceTest.testReadBigFile(boolean)",
      "begin_line": 157,
      "end_line": 166,
      "comment": "",
      "child_ranges": [
        "(line 158,col 8)-(line 164,col 8)",
        "(line 165,col 8)-(line 165,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.PerformanceTest.readAll(java.io.BufferedReader, boolean)",
      "begin_line": 168,
      "end_line": 177,
      "comment": "",
      "child_ranges": [
        "(line 169,col 8)-(line 169,col 21)",
        "(line 170,col 8)-(line 170,col 22)",
        "(line 171,col 8)-(line 171,col 21)",
        "(line 172,col 8)-(line 175,col 8)",
        "(line 176,col 8)-(line 176,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.PerformanceTest.testExtendedBuffer(boolean)",
      "begin_line": 179,
      "end_line": 214,
      "comment": "",
      "child_ranges": [
        "(line 180,col 8)-(line 212,col 8)",
        "(line 213,col 8)-(line 213,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.PerformanceTest.testParseCommonsCSV()",
      "begin_line": 216,
      "end_line": 227,
      "comment": "",
      "child_ranges": [
        "(line 217,col 8)-(line 225,col 8)",
        "(line 226,col 8)-(line 226,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.PerformanceTest.getLexerCtor(java.lang.String)",
      "begin_line": 230,
      "end_line": 234,
      "comment": "",
      "child_ranges": [
        "(line 231,col 8)-(line 232,col 98)",
        "(line 233,col 8)-(line 233,col 98)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.PerformanceTest.testCSVLexer(boolean, java.lang.String)",
      "begin_line": 236,
      "end_line": 282,
      "comment": "",
      "child_ranges": [
        "(line 237,col 8)-(line 237,col 33)",
        "(line 238,col 8)-(line 238,col 27)",
        "(line 239,col 8)-(line 280,col 8)",
        "(line 281,col 8)-(line 281,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.PerformanceTest.iterate(java.lang.Iterable\u003corg.apache.commons.csv.CSVRecord\u003e)",
      "begin_line": 284,
      "end_line": 292,
      "comment": "",
      "child_ranges": [
        "(line 285,col 8)-(line 285,col 21)",
        "(line 286,col 8)-(line 286,col 22)",
        "(line 287,col 8)-(line 290,col 8)",
        "(line 291,col 8)-(line 291,col 39)"
      ]
    }
  ]
}