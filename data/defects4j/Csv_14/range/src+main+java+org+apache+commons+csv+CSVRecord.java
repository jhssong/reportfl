{
  "filepath": "/tmp/Csv-14b/src/main/java/org/apache/commons/csv/CSVRecord.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CSVRecord",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable",
        "java.lang.Iterable\u003cjava.lang.String\u003e"
      ],
      "begin_line": 33,
      "end_line": 278,
      "comment": "\n * A CSV record parsed from a CSV file.\n *\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "EMPTY_STRING_ARRAY"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "characterPosition"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "comment"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": " The accumulated comments (if any) "
    },
    {
      "type": "field",
      "varNames": [
        "mapping"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": " The column name to index mapping. "
    },
    {
      "type": "field",
      "varNames": [
        "recordNumber"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": " The record number. "
    },
    {
      "type": "field",
      "varNames": [
        "values"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": " The values of the record "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.csv.CSVRecord.CSVRecord(java.lang.String[], java.util.Map\u003cjava.lang.String, java.lang.Integer\u003e, java.lang.String, long, long)",
      "begin_line": 53,
      "end_line": 60,
      "comment": "",
      "child_ranges": [
        "(line 55,col 9)-(line 55,col 41)",
        "(line 56,col 9)-(line 56,col 67)",
        "(line 57,col 9)-(line 57,col 31)",
        "(line 58,col 9)-(line 58,col 31)",
        "(line 59,col 9)-(line 59,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVRecord.get(java.lang.Enum\u003c?\u003e)",
      "begin_line": 69,
      "end_line": 71,
      "comment": "\n     * Returns a value by {@link Enum}.\n     *\n     * @param e\n     *            an enum\n     * @return the String at the given enum String\n     ",
      "child_ranges": [
        "(line 70,col 9)-(line 70,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVRecord.get(int)",
      "begin_line": 80,
      "end_line": 82,
      "comment": "\n     * Returns a value by index.\n     *\n     * @param i\n     *            a column index (0-based)\n     * @return the String at the given index\n     ",
      "child_ranges": [
        "(line 81,col 9)-(line 81,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVRecord.get(java.lang.String)",
      "begin_line": 97,
      "end_line": 114,
      "comment": "\n     * Returns a value by name.\n     *\n     * @param name\n     *            the name of the column to be retrieved.\n     * @return the column value, maybe null depending on {@link CSVFormat#getNullString()}.\n     * @throws IllegalStateException\n     *             if no header mapping was provided\n     * @throws IllegalArgumentException\n     *             if {@code name} is not mapped or if the record is inconsistent\n     * @see #isConsistent()\n     * @see CSVFormat#withNullString(String)\n     ",
      "child_ranges": [
        "(line 98,col 9)-(line 101,col 9)",
        "(line 102,col 9)-(line 102,col 48)",
        "(line 103,col 9)-(line 106,col 9)",
        "(line 107,col 9)-(line 113,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVRecord.getCharacterPosition()",
      "begin_line": 122,
      "end_line": 124,
      "comment": "\n     * Returns the start position of this record as a character position in the source stream. This may or may not\n     * correspond to the byte position depending on the character set.\n     *\n     * @return the position of this record in the source stream.\n     ",
      "child_ranges": [
        "(line 123,col 9)-(line 123,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVRecord.getComment()",
      "begin_line": 134,
      "end_line": 136,
      "comment": "\n     * Returns the comment for this record, if any.\n     * Note that comments are attached to the following record.\n     * If there is no following record (i.e. the comment is at EOF)\n     * the comment will be ignored.\n     *\n     * @return the comment for this record, or null if no comment for this record is available.\n     ",
      "child_ranges": [
        "(line 135,col 9)-(line 135,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVRecord.getRecordNumber()",
      "begin_line": 149,
      "end_line": 151,
      "comment": "\n     * Returns the number of this record in the parsed CSV file.\n     *\n     * \u003cp\u003e\n     * \u003cstrong\u003eATTENTION:\u003c/strong\u003e If your CSV input has multi-line values, the returned number does not correspond to\n     * the current line number of the parser that created this record.\n     * \u003c/p\u003e\n     *\n     * @return the number of this record.\n     * @see CSVParser#getCurrentLineNumber()\n     ",
      "child_ranges": [
        "(line 150,col 9)-(line 150,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVRecord.isConsistent()",
      "begin_line": 163,
      "end_line": 165,
      "comment": "\n     * Tells whether the record size matches the header size.\n     *\n     * \u003cp\u003e\n     * Returns true if the sizes for this record match and false if not. Some programs can export files that fail this\n     * test but still produce parsable files.\n     * \u003c/p\u003e\n     *\n     * @return true of this record is valid, false if not\n     ",
      "child_ranges": [
        "(line 164,col 9)-(line 164,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVRecord.hasComment()",
      "begin_line": 176,
      "end_line": 178,
      "comment": "\n     * Checks whether this record has a comment, false otherwise.\n     * Note that comments are attached to the following record.\n     * If there is no following record (i.e. the comment is at EOF)\n     * the comment will be ignored.\n     *\n     * @return true if this record has a comment, false otherwise\n     * @since 1.3\n     ",
      "child_ranges": [
        "(line 177,col 9)-(line 177,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVRecord.isMapped(java.lang.String)",
      "begin_line": 187,
      "end_line": 189,
      "comment": "\n     * Checks whether a given column is mapped, i.e. its name has been defined to the parser.\n     *\n     * @param name\n     *            the name of the column to be retrieved.\n     * @return whether a given column is mapped.\n     ",
      "child_ranges": [
        "(line 188,col 9)-(line 188,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVRecord.isSet(java.lang.String)",
      "begin_line": 198,
      "end_line": 200,
      "comment": "\n     * Checks whether a given columns is mapped and has a value.\n     *\n     * @param name\n     *            the name of the column to be retrieved.\n     * @return whether a given columns is mapped and has a value\n     ",
      "child_ranges": [
        "(line 199,col 9)-(line 199,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVRecord.iterator()",
      "begin_line": 207,
      "end_line": 210,
      "comment": "\n     * Returns an iterator over the values of this record.\n     *\n     * @return an iterator over the values of this record.\n     ",
      "child_ranges": [
        "(line 209,col 9)-(line 209,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVRecord.putIn(M)",
      "begin_line": 219,
      "end_line": 230,
      "comment": "\n     * Puts all values of this record into the given Map.\n     *\n     * @param map\n     *            The Map to populate.\n     * @return the given map.\n     ",
      "child_ranges": [
        "(line 220,col 9)-(line 222,col 9)",
        "(line 223,col 9)-(line 228,col 9)",
        "(line 229,col 9)-(line 229,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVRecord.size()",
      "begin_line": 237,
      "end_line": 239,
      "comment": "\n     * Returns the number of values in this record.\n     *\n     * @return the number of values.\n     ",
      "child_ranges": [
        "(line 238,col 9)-(line 238,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVRecord.toList()",
      "begin_line": 248,
      "end_line": 250,
      "comment": "\n     * Converts the values to a List.\n     *\n     * TODO: Maybe make this public?\n     *\n     * @return a new List\n     ",
      "child_ranges": [
        "(line 249,col 9)-(line 249,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVRecord.toMap()",
      "begin_line": 257,
      "end_line": 259,
      "comment": "\n     * Copies this record into a new Map. The new map is not connect\n     *\n     * @return A new Map. The map is empty if the record has no headers.\n     ",
      "child_ranges": [
        "(line 258,col 9)-(line 258,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVRecord.toString()",
      "begin_line": 267,
      "end_line": 272,
      "comment": "\n     * Returns a string representation of the contents of this record. The result is constructed by comment, mapping,\n     * recordNumber and by passing the internal values array to {@link Arrays#toString(Object[])}.\n     *\n     * @return a String representation of this record.\n     ",
      "child_ranges": [
        "(line 269,col 9)-(line 271,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVRecord.values()",
      "begin_line": 274,
      "end_line": 276,
      "comment": "",
      "child_ranges": [
        "(line 275,col 9)-(line 275,col 22)"
      ]
    }
  ]
}