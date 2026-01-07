{
  "filepath": "/tmp/Csv-1b/src/main/java/org/apache/commons/csv/CSVRecord.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CSVRecord",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable",
        "java.lang.Iterable\u003cjava.lang.String\u003e"
      ],
      "begin_line": 28,
      "end_line": 88,
      "comment": "\n * A CSV record\n "
    },
    {
      "type": "field",
      "varNames": [
        "EMPTY_STRING_ARRAY"
      ],
      "begin_line": 30,
      "end_line": 30,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "values"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": " The values of the record "
    },
    {
      "type": "field",
      "varNames": [
        "mapping"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": " The column name to index mapping. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.csv.CSVRecord.CSVRecord(java.lang.String[], java.util.Map\u003cjava.lang.String, java.lang.Integer\u003e)",
      "begin_line": 38,
      "end_line": 41,
      "comment": "",
      "child_ranges": [
        "(line 39,col 9)-(line 39,col 67)",
        "(line 40,col 9)-(line 40,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVRecord.get(int)",
      "begin_line": 48,
      "end_line": 50,
      "comment": "\n     * Returns a value by index.\n     *\n     * @param i the index of the column retrieved\n     ",
      "child_ranges": [
        "(line 49,col 9)-(line 49,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVRecord.get(java.lang.String)",
      "begin_line": 59,
      "end_line": 67,
      "comment": "\n     * Returns a value by name.\n     *\n     * @param name the name of the column to be retrieved\n     * @return the column value, or {@code null} if the column name is not found\n     * @throws IllegalStateException if no header mapping was provided\n     ",
      "child_ranges": [
        "(line 60,col 9)-(line 62,col 9)",
        "(line 64,col 9)-(line 64,col 42)",
        "(line 66,col 9)-(line 66,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVRecord.iterator()",
      "begin_line": 69,
      "end_line": 71,
      "comment": "",
      "child_ranges": [
        "(line 70,col 9)-(line 70,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVRecord.values()",
      "begin_line": 73,
      "end_line": 75,
      "comment": "",
      "child_ranges": [
        "(line 74,col 9)-(line 74,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVRecord.size()",
      "begin_line": 80,
      "end_line": 82,
      "comment": "\n     * Returns the number of values in this record.\n     ",
      "child_ranges": [
        "(line 81,col 9)-(line 81,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVRecord.toString()",
      "begin_line": 84,
      "end_line": 87,
      "comment": "",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 39)"
      ]
    }
  ]
}