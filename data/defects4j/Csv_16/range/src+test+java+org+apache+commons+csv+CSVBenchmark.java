{
  "filepath": "/tmp/Csv-16b/src/test/java/org/apache/commons/csv/CSVBenchmark.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CSVBenchmark",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 48,
      "end_line": 210,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "data"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVBenchmark.init()",
      "begin_line": 62,
      "end_line": 68,
      "comment": "\n     * Load the data in memory before running the benchmarks, this takes out IO from the results.\n     ",
      "child_ranges": [
        "(line 64,col 9)-(line 64,col 84)",
        "(line 65,col 9)-(line 65,col 78)",
        "(line 66,col 9)-(line 66,col 55)",
        "(line 67,col 9)-(line 67,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVBenchmark.getReader()",
      "begin_line": 70,
      "end_line": 72,
      "comment": "",
      "child_ranges": [
        "(line 71,col 9)-(line 71,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "read(Blackhole)",
      "exception": "UnsolvedSymbolException{context\u003d\u0027null\u0027, name\u003d\u0027Blackhole\u0027, cause\u003d\u0027null\u0027}",
      "begin_line": 74,
      "end_line": 86,
      "comment": "",
      "child_ranges": [
        "(line 76,col 9)-(line 76,col 46)",
        "(line 77,col 9)-(line 77,col 22)",
        "(line 78,col 9)-(line 78,col 20)",
        "(line 79,col 9)-(line 81,col 9)",
        "(line 83,col 9)-(line 83,col 26)",
        "(line 84,col 9)-(line 84,col 19)",
        "(line 85,col 9)-(line 85,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "split(Blackhole)",
      "exception": "UnsolvedSymbolException{context\u003d\u0027null\u0027, name\u003d\u0027Blackhole\u0027, cause\u003d\u0027null\u0027}",
      "begin_line": 88,
      "end_line": 101,
      "comment": "",
      "child_ranges": [
        "(line 90,col 9)-(line 90,col 46)",
        "(line 91,col 9)-(line 91,col 22)",
        "(line 92,col 9)-(line 92,col 20)",
        "(line 93,col 9)-(line 96,col 9)",
        "(line 98,col 9)-(line 98,col 26)",
        "(line 99,col 9)-(line 99,col 19)",
        "(line 100,col 9)-(line 100,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "parseCommonsCSV(Blackhole)",
      "exception": "UnsolvedSymbolException{context\u003d\u0027null\u0027, name\u003d\u0027Blackhole\u0027, cause\u003d\u0027null\u0027}",
      "begin_line": 103,
      "end_line": 117,
      "comment": "",
      "child_ranges": [
        "(line 105,col 9)-(line 105,col 46)",
        "(line 107,col 9)-(line 107,col 64)",
        "(line 109,col 9)-(line 109,col 22)",
        "(line 110,col 9)-(line 112,col 9)",
        "(line 114,col 9)-(line 114,col 26)",
        "(line 115,col 9)-(line 115,col 19)",
        "(line 116,col 9)-(line 116,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "parseGenJavaCSV(Blackhole)",
      "exception": "UnsolvedSymbolException{context\u003d\u0027null\u0027, name\u003d\u0027Blackhole\u0027, cause\u003d\u0027null\u0027}",
      "begin_line": 119,
      "end_line": 135,
      "comment": "",
      "child_ranges": [
        "(line 121,col 9)-(line 121,col 46)",
        "(line 123,col 9)-(line 123,col 51)",
        "(line 124,col 9)-(line 124,col 38)",
        "(line 126,col 9)-(line 126,col 22)",
        "(line 127,col 9)-(line 127,col 31)",
        "(line 128,col 9)-(line 130,col 9)",
        "(line 132,col 9)-(line 132,col 26)",
        "(line 133,col 9)-(line 133,col 19)",
        "(line 134,col 9)-(line 134,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "parseJavaCSV(Blackhole)",
      "exception": "UnsolvedSymbolException{context\u003d\u0027null\u0027, name\u003d\u0027Blackhole\u0027, cause\u003d\u0027null\u0027}",
      "begin_line": 137,
      "end_line": 152,
      "comment": "",
      "child_ranges": [
        "(line 139,col 9)-(line 139,col 46)",
        "(line 141,col 9)-(line 141,col 84)",
        "(line 142,col 9)-(line 142,col 40)",
        "(line 144,col 9)-(line 144,col 22)",
        "(line 145,col 9)-(line 147,col 9)",
        "(line 149,col 9)-(line 149,col 26)",
        "(line 150,col 9)-(line 150,col 19)",
        "(line 151,col 9)-(line 151,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "parseOpenCSV(Blackhole)",
      "exception": "UnsolvedSymbolException{context\u003d\u0027null\u0027, name\u003d\u0027Blackhole\u0027, cause\u003d\u0027null\u0027}",
      "begin_line": 154,
      "end_line": 168,
      "comment": "",
      "child_ranges": [
        "(line 156,col 9)-(line 156,col 46)",
        "(line 158,col 9)-(line 158,col 80)",
        "(line 160,col 9)-(line 160,col 22)",
        "(line 161,col 9)-(line 163,col 9)",
        "(line 165,col 9)-(line 165,col 26)",
        "(line 166,col 9)-(line 166,col 19)",
        "(line 167,col 9)-(line 167,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "parseSkifeCSV(Blackhole)",
      "exception": "UnsolvedSymbolException{context\u003d\u0027null\u0027, name\u003d\u0027Blackhole\u0027, cause\u003d\u0027null\u0027}",
      "begin_line": 170,
      "end_line": 183,
      "comment": "",
      "child_ranges": [
        "(line 172,col 9)-(line 172,col 46)",
        "(line 174,col 9)-(line 174,col 80)",
        "(line 175,col 9)-(line 175,col 33)",
        "(line 177,col 9)-(line 177,col 77)",
        "(line 178,col 9)-(line 178,col 35)",
        "(line 180,col 9)-(line 180,col 29)",
        "(line 181,col 9)-(line 181,col 19)",
        "(line 182,col 9)-(line 182,col 30)"
      ]
    },
    {
      "type": "class_interface",
      "name": "CountingReaderCallback",
      "is_interface": false,
      "parent_types": [
        "org.skife.csv.ReaderCallback"
      ],
      "begin_line": 185,
      "end_line": 192,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "count"
      ],
      "begin_line": 186,
      "end_line": 186,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVBenchmark.CountingReaderCallback.onRow(java.lang.String[])",
      "begin_line": 188,
      "end_line": 191,
      "comment": "",
      "child_ranges": [
        "(line 190,col 13)-(line 190,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "parseSuperCSV(Blackhole)",
      "exception": "UnsolvedSymbolException{context\u003d\u0027null\u0027, name\u003d\u0027Blackhole\u0027, cause\u003d\u0027null\u0027}",
      "begin_line": 194,
      "end_line": 209,
      "comment": "",
      "child_ranges": [
        "(line 196,col 9)-(line 196,col 46)",
        "(line 198,col 9)-(line 198,col 94)",
        "(line 200,col 9)-(line 200,col 22)",
        "(line 201,col 9)-(line 201,col 35)",
        "(line 202,col 9)-(line 204,col 9)",
        "(line 206,col 9)-(line 206,col 26)",
        "(line 207,col 9)-(line 207,col 19)",
        "(line 208,col 9)-(line 208,col 21)"
      ]
    }
  ]
}