{
  "filepath": "/tmp/Csv-15b/src/main/java/org/apache/commons/csv/CSVRecord.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CSVRecord",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable",
        "java.lang.Iterable\u003cjava.lang.String\u003e"
      ],
      "begin_line": 31,
      "end_line": 276,
      "comment": "\n * A CSV record parsed from a CSV file.\n "
    },
    {
      "type": "field",
      "varNames": [
        "EMPTY_STRING_ARRAY"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "characterPosition"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "comment"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": " The accumulated comments (if any) "
    },
    {
      "type": "field",
      "varNames": [
        "mapping"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": " The column name to index mapping. "
    },
    {
      "type": "field",
      "varNames": [
        "recordNumber"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": " The record number. "
    },
    {
      "type": "field",
      "varNames": [
        "values"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": " The values of the record "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.csv.CSVRecord.CSVRecord(java.lang.String[], java.util.Map\u003cjava.lang.String, java.lang.Integer\u003e, java.lang.String, long, long)",
      "begin_line": 51,
      "end_line": 58,
      "comment": "",
      "child_ranges": [
        "(line 53,col 9)-(line 53,col 41)",
        "(line 54,col 9)-(line 54,col 67)",
        "(line 55,col 9)-(line 55,col 31)",
        "(line 56,col 9)-(line 56,col 31)",
        "(line 57,col 9)-(line 57,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVRecord.get(java.lang.Enum\u003c?\u003e)",
      "begin_line": 67,
      "end_line": 69,
      "comment": "\n     * Returns a value by {@link Enum}.\n     *\n     * @param e\n     *            an enum\n     * @return the String at the given enum String\n     ",
      "child_ranges": [
        "(line 68,col 9)-(line 68,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVRecord.get(int)",
      "begin_line": 78,
      "end_line": 80,
      "comment": "\n     * Returns a value by index.\n     *\n     * @param i\n     *            a column index (0-based)\n     * @return the String at the given index\n     ",
      "child_ranges": [
        "(line 79,col 9)-(line 79,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVRecord.get(java.lang.String)",
      "begin_line": 95,
      "end_line": 112,
      "comment": "\n     * Returns a value by name.\n     *\n     * @param name\n     *            the name of the column to be retrieved.\n     * @return the column value, maybe null depending on {@link CSVFormat#getNullString()}.\n     * @throws IllegalStateException\n     *             if no header mapping was provided\n     * @throws IllegalArgumentException\n     *             if {@code name} is not mapped or if the record is inconsistent\n     * @see #isConsistent()\n     * @see CSVFormat#withNullString(String)\n     ",
      "child_ranges": [
        "(line 96,col 9)-(line 99,col 9)",
        "(line 100,col 9)-(line 100,col 48)",
        "(line 101,col 9)-(line 104,col 9)",
        "(line 105,col 9)-(line 111,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVRecord.getCharacterPosition()",
      "begin_line": 120,
      "end_line": 122,
      "comment": "\n     * Returns the start position of this record as a character position in the source stream. This may or may not\n     * correspond to the byte position depending on the character set.\n     *\n     * @return the position of this record in the source stream.\n     ",
      "child_ranges": [
        "(line 121,col 9)-(line 121,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVRecord.getComment()",
      "begin_line": 132,
      "end_line": 134,
      "comment": "\n     * Returns the comment for this record, if any.\n     * Note that comments are attached to the following record.\n     * If there is no following record (i.e. the comment is at EOF)\n     * the comment will be ignored.\n     *\n     * @return the comment for this record, or null if no comment for this record is available.\n     ",
      "child_ranges": [
        "(line 133,col 9)-(line 133,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVRecord.getRecordNumber()",
      "begin_line": 147,
      "end_line": 149,
      "comment": "\n     * Returns the number of this record in the parsed CSV file.\n     *\n     * \u003cp\u003e\n     * \u003cstrong\u003eATTENTION:\u003c/strong\u003e If your CSV input has multi-line values, the returned number does not correspond to\n     * the current line number of the parser that created this record.\n     * \u003c/p\u003e\n     *\n     * @return the number of this record.\n     * @see CSVParser#getCurrentLineNumber()\n     ",
      "child_ranges": [
        "(line 148,col 9)-(line 148,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVRecord.isConsistent()",
      "begin_line": 161,
      "end_line": 163,
      "comment": "\n     * Tells whether the record size matches the header size.\n     *\n     * \u003cp\u003e\n     * Returns true if the sizes for this record match and false if not. Some programs can export files that fail this\n     * test but still produce parsable files.\n     * \u003c/p\u003e\n     *\n     * @return true of this record is valid, false if not\n     ",
      "child_ranges": [
        "(line 162,col 9)-(line 162,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVRecord.hasComment()",
      "begin_line": 174,
      "end_line": 176,
      "comment": "\n     * Checks whether this record has a comment, false otherwise.\n     * Note that comments are attached to the following record.\n     * If there is no following record (i.e. the comment is at EOF)\n     * the comment will be ignored.\n     *\n     * @return true if this record has a comment, false otherwise\n     * @since 1.3\n     ",
      "child_ranges": [
        "(line 175,col 9)-(line 175,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVRecord.isMapped(java.lang.String)",
      "begin_line": 185,
      "end_line": 187,
      "comment": "\n     * Checks whether a given column is mapped, i.e. its name has been defined to the parser.\n     *\n     * @param name\n     *            the name of the column to be retrieved.\n     * @return whether a given column is mapped.\n     ",
      "child_ranges": [
        "(line 186,col 9)-(line 186,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVRecord.isSet(java.lang.String)",
      "begin_line": 196,
      "end_line": 198,
      "comment": "\n     * Checks whether a given columns is mapped and has a value.\n     *\n     * @param name\n     *            the name of the column to be retrieved.\n     * @return whether a given columns is mapped and has a value\n     ",
      "child_ranges": [
        "(line 197,col 9)-(line 197,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVRecord.iterator()",
      "begin_line": 205,
      "end_line": 208,
      "comment": "\n     * Returns an iterator over the values of this record.\n     *\n     * @return an iterator over the values of this record.\n     ",
      "child_ranges": [
        "(line 207,col 9)-(line 207,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVRecord.putIn(M)",
      "begin_line": 217,
      "end_line": 228,
      "comment": "\n     * Puts all values of this record into the given Map.\n     *\n     * @param map\n     *            The Map to populate.\n     * @return the given map.\n     ",
      "child_ranges": [
        "(line 218,col 9)-(line 220,col 9)",
        "(line 221,col 9)-(line 226,col 9)",
        "(line 227,col 9)-(line 227,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVRecord.size()",
      "begin_line": 235,
      "end_line": 237,
      "comment": "\n     * Returns the number of values in this record.\n     *\n     * @return the number of values.\n     ",
      "child_ranges": [
        "(line 236,col 9)-(line 236,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVRecord.toList()",
      "begin_line": 246,
      "end_line": 248,
      "comment": "\n     * Converts the values to a List.\n     *\n     * TODO: Maybe make this public?\n     *\n     * @return a new List\n     ",
      "child_ranges": [
        "(line 247,col 9)-(line 247,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVRecord.toMap()",
      "begin_line": 255,
      "end_line": 257,
      "comment": "\n     * Copies this record into a new Map. The new map is not connect\n     *\n     * @return A new Map. The map is empty if the record has no headers.\n     ",
      "child_ranges": [
        "(line 256,col 9)-(line 256,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVRecord.toString()",
      "begin_line": 265,
      "end_line": 270,
      "comment": "\n     * Returns a string representation of the contents of this record. The result is constructed by comment, mapping,\n     * recordNumber and by passing the internal values array to {@link Arrays#toString(Object[])}.\n     *\n     * @return a String representation of this record.\n     ",
      "child_ranges": [
        "(line 267,col 9)-(line 269,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVRecord.values()",
      "begin_line": 272,
      "end_line": 274,
      "comment": "",
      "child_ranges": [
        "(line 273,col 9)-(line 273,col 22)"
      ]
    }
  ]
}