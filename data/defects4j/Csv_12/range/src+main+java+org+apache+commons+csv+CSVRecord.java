{
  "filepath": "/tmp/Csv-12b/src/main/java/org/apache/commons/csv/CSVRecord.java",
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
      "end_line": 246,
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
      "signature": "org.apache.commons.csv.CSVRecord.CSVRecord(java.lang.String[], java.util.Map\u003cjava.lang.String, java.lang.Integer\u003e, java.lang.String, long)",
      "begin_line": 51,
      "end_line": 57,
      "comment": "",
      "child_ranges": [
        "(line 53,col 9)-(line 53,col 41)",
        "(line 54,col 9)-(line 54,col 67)",
        "(line 55,col 9)-(line 55,col 31)",
        "(line 56,col 9)-(line 56,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVRecord.get(java.lang.Enum\u003c?\u003e)",
      "begin_line": 66,
      "end_line": 68,
      "comment": "\n     * Returns a value by {@link Enum}.\n     *\n     * @param e\n     *            an enum\n     * @return the String at the given enum String\n     ",
      "child_ranges": [
        "(line 67,col 9)-(line 67,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVRecord.get(int)",
      "begin_line": 77,
      "end_line": 79,
      "comment": "\n     * Returns a value by index.\n     *\n     * @param i\n     *            a column index (0-based)\n     * @return the String at the given index\n     ",
      "child_ranges": [
        "(line 78,col 9)-(line 78,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVRecord.get(java.lang.String)",
      "begin_line": 94,
      "end_line": 111,
      "comment": "\n     * Returns a value by name.\n     *\n     * @param name\n     *            the name of the column to be retrieved.\n     * @return the column value, maybe null depending on {@link CSVFormat#getNullString()}.\n     * @throws IllegalStateException\n     *             if no header mapping was provided\n     * @throws IllegalArgumentException\n     *             if {@code name} is not mapped or if the record is inconsistent\n     * @see #isConsistent()\n     * @see CSVFormat#withNullString(String)\n     ",
      "child_ranges": [
        "(line 95,col 9)-(line 98,col 9)",
        "(line 99,col 9)-(line 99,col 48)",
        "(line 100,col 9)-(line 103,col 9)",
        "(line 104,col 9)-(line 110,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVRecord.getComment()",
      "begin_line": 119,
      "end_line": 121,
      "comment": "\n     * Returns the comment for this record, if any.\n     *\n     * @return the comment for this record, or null if no comment for this\n     *         record is available.\n     ",
      "child_ranges": [
        "(line 120,col 9)-(line 120,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVRecord.getRecordNumber()",
      "begin_line": 134,
      "end_line": 136,
      "comment": "\n     * Returns the number of this record in the parsed CSV file.\n     *\n     * \u003cp\u003e\n     * \u003cstrong\u003eATTENTION:\u003c/strong\u003e If your CSV input has multi-line values, the returned number does not correspond to\n     * the current line number of the parser that created this record.\n     * \u003c/p\u003e\n     *\n     * @return the number of this record.\n     * @see CSVParser#getCurrentLineNumber()\n     ",
      "child_ranges": [
        "(line 135,col 9)-(line 135,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVRecord.isConsistent()",
      "begin_line": 148,
      "end_line": 150,
      "comment": "\n     * Tells whether the record size matches the header size.\n     *\n     * \u003cp\u003e\n     * Returns true if the sizes for this record match and false if not. Some programs can export files that fail this\n     * test but still produce parsable files.\n     * \u003c/p\u003e\n     *\n     * @return true of this record is valid, false if not\n     ",
      "child_ranges": [
        "(line 149,col 9)-(line 149,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVRecord.isMapped(java.lang.String)",
      "begin_line": 159,
      "end_line": 161,
      "comment": "\n     * Checks whether a given column is mapped, i.e. its name has been defined to the parser.\n     *\n     * @param name\n     *            the name of the column to be retrieved.\n     * @return whether a given column is mapped.\n     ",
      "child_ranges": [
        "(line 160,col 9)-(line 160,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVRecord.isSet(java.lang.String)",
      "begin_line": 170,
      "end_line": 172,
      "comment": "\n     * Checks whether a given columns is mapped and has a value.\n     *\n     * @param name\n     *            the name of the column to be retrieved.\n     * @return whether a given columns is mapped and has a value\n     ",
      "child_ranges": [
        "(line 171,col 9)-(line 171,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVRecord.iterator()",
      "begin_line": 179,
      "end_line": 181,
      "comment": "\n     * Returns an iterator over the values of this record.\n     *\n     * @return an iterator over the values of this record.\n     ",
      "child_ranges": [
        "(line 180,col 9)-(line 180,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVRecord.putIn(M)",
      "begin_line": 189,
      "end_line": 200,
      "comment": "\n     * Puts all values of this record into the given Map.\n     *\n     * @param map The Map to populate.\n     * @return the given map.\n     ",
      "child_ranges": [
        "(line 190,col 9)-(line 192,col 9)",
        "(line 193,col 9)-(line 198,col 9)",
        "(line 199,col 9)-(line 199,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVRecord.size()",
      "begin_line": 207,
      "end_line": 209,
      "comment": "\n     * Returns the number of values in this record.\n     *\n     * @return the number of values.\n     ",
      "child_ranges": [
        "(line 208,col 9)-(line 208,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVRecord.toList()",
      "begin_line": 217,
      "end_line": 219,
      "comment": "\n     * Converts the values to a List.\n     *\n     * TODO: Maybe make this public?\n     * @return a new List\n     ",
      "child_ranges": [
        "(line 218,col 9)-(line 218,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVRecord.toMap()",
      "begin_line": 226,
      "end_line": 228,
      "comment": "\n     * Copies this record into a new Map. The new map is not connect\n     *\n     * @return A new Map. The map is empty if the record has no headers.\n     ",
      "child_ranges": [
        "(line 227,col 9)-(line 227,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVRecord.toString()",
      "begin_line": 236,
      "end_line": 239,
      "comment": "\n     * Returns a string representation of the contents of this record. The result is constructed by passing the internal\n     * values array to {@link Arrays#toString(Object[])}.\n     *\n     * @return a String representation of this record.\n     ",
      "child_ranges": [
        "(line 238,col 9)-(line 238,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVRecord.values()",
      "begin_line": 241,
      "end_line": 243,
      "comment": "",
      "child_ranges": [
        "(line 242,col 9)-(line 242,col 22)"
      ]
    }
  ]
}