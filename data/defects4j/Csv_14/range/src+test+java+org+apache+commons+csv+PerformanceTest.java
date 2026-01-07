{
  "filepath": "/tmp/Csv-14b/src/test/java/org/apache/commons/csv/PerformanceTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PerformanceTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 41,
      "end_line": 306,
      "comment": "\n * Basic test harness.\n *\n * Requires test file to be downloaded separately.\n *\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "PROPS"
      ],
      "begin_line": 44,
      "end_line": 61,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "max"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "num"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": " number of elapsed times recorded"
    },
    {
      "type": "field",
      "varNames": [
        "elapsedTimes"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "format"
      ],
      "begin_line": 68,
      "end_line": 68,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "BIG_FILE"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.PerformanceTest.main(java.lang.String[])",
      "begin_line": 72,
      "end_line": 123,
      "comment": "",
      "child_ranges": [
        "(line 73,col 9)-(line 83,col 9)",
        "(line 84,col 9)-(line 84,col 37)",
        "(line 85,col 9)-(line 85,col 23)",
        "(line 86,col 9)-(line 88,col 9)",
        "(line 89,col 9)-(line 96,col 9)",
        "(line 97,col 9)-(line 99,col 9)",
        "(line 100,col 9)-(line 100,col 51)",
        "(line 102,col 9)-(line 122,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.PerformanceTest.createReader()",
      "begin_line": 125,
      "end_line": 127,
      "comment": "",
      "child_ranges": [
        "(line 126,col 9)-(line 126,col 60)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Stats",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 130,
      "end_line": 137,
      "comment": " Container for basic statistics"
    },
    {
      "type": "field",
      "varNames": [
        "count"
      ],
      "begin_line": 131,
      "end_line": 131,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "fields"
      ],
      "begin_line": 132,
      "end_line": 132,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.csv.PerformanceTest.Stats.Stats(int, int)",
      "begin_line": 133,
      "end_line": 136,
      "comment": "",
      "child_ranges": [
        "(line 134,col 13)-(line 134,col 20)",
        "(line 135,col 13)-(line 135,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.PerformanceTest.show(java.lang.String, org.apache.commons.csv.PerformanceTest.Stats, long)",
      "begin_line": 140,
      "end_line": 144,
      "comment": " Display end stats; store elapsed for average",
      "child_ranges": [
        "(line 141,col 9)-(line 141,col 64)",
        "(line 142,col 9)-(line 142,col 101)",
        "(line 143,col 9)-(line 143,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.PerformanceTest.show()",
      "begin_line": 147,
      "end_line": 156,
      "comment": " calculate and show average",
      "child_ranges": [
        "(line 148,col 9)-(line 148,col 21)",
        "(line 149,col 9)-(line 154,col 9)",
        "(line 155,col 9)-(line 155,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.PerformanceTest.testReadBigFile(boolean)",
      "begin_line": 158,
      "end_line": 169,
      "comment": "",
      "child_ranges": [
        "(line 159,col 9)-(line 167,col 9)",
        "(line 168,col 9)-(line 168,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.PerformanceTest.readAll(java.io.BufferedReader, boolean)",
      "begin_line": 171,
      "end_line": 180,
      "comment": "",
      "child_ranges": [
        "(line 172,col 8)-(line 172,col 21)",
        "(line 173,col 8)-(line 173,col 22)",
        "(line 174,col 8)-(line 174,col 21)",
        "(line 175,col 8)-(line 178,col 8)",
        "(line 179,col 8)-(line 179,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.PerformanceTest.testExtendedBuffer(boolean)",
      "begin_line": 182,
      "end_line": 218,
      "comment": "",
      "child_ranges": [
        "(line 183,col 9)-(line 216,col 9)",
        "(line 217,col 9)-(line 217,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.PerformanceTest.testParseCommonsCSV()",
      "begin_line": 220,
      "end_line": 233,
      "comment": "",
      "child_ranges": [
        "(line 221,col 9)-(line 231,col 9)",
        "(line 232,col 9)-(line 232,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.PerformanceTest.getLexerCtor(java.lang.String)",
      "begin_line": 236,
      "end_line": 240,
      "comment": "",
      "child_ranges": [
        "(line 237,col 8)-(line 238,col 98)",
        "(line 239,col 8)-(line 239,col 98)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.PerformanceTest.testCSVLexer(boolean, java.lang.String)",
      "begin_line": 242,
      "end_line": 288,
      "comment": "",
      "child_ranges": [
        "(line 243,col 9)-(line 243,col 34)",
        "(line 244,col 9)-(line 244,col 28)",
        "(line 245,col 9)-(line 286,col 9)",
        "(line 287,col 9)-(line 287,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.PerformanceTest.createTestCSVLexer(java.lang.String, org.apache.commons.csv.ExtendedBufferedReader)",
      "begin_line": 290,
      "end_line": 294,
      "comment": "",
      "child_ranges": [
        "(line 292,col 9)-(line 293,col 88)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.PerformanceTest.iterate(java.lang.Iterable\u003corg.apache.commons.csv.CSVRecord\u003e)",
      "begin_line": 296,
      "end_line": 304,
      "comment": "",
      "child_ranges": [
        "(line 297,col 8)-(line 297,col 21)",
        "(line 298,col 8)-(line 298,col 22)",
        "(line 299,col 8)-(line 302,col 8)",
        "(line 303,col 8)-(line 303,col 39)"
      ]
    }
  ]
}